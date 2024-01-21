import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class49 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	private int anInt2023;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	private int anInt2027;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "[B")
	private final byte[] aByteArray13 = new byte[4];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!ef;")
	private final Class29 aClass29_6;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	private int anInt2026;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "J")
	private final long aLong60;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ja;Ljava/net/URL;)V")
	public Class49(@OriginalArg(0) Class47 arg0, @OriginalArg(1) URL arg1) {
		this.aClass29_6 = arg0.method1360(arg1);
		this.anInt2026 = 0;
		this.aLong60 = Static210.method3307() + 30000L;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)[B")
	public byte[] method1408() throws IOException {
		if (this.aLong60 < Static210.method3307()) {
			throw new IOException("fdt");
		}
		if (this.anInt2026 == 0) {
			if (this.aClass29_6.anInt973 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass29_6.anInt973 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass29_6.anObject2;
				this.anInt2026 = 1;
			}
		}
		@Pc(56) int local56;
		if (this.anInt2026 == 1) {
			local56 = this.aDataInputStream1.available();
			if (local56 > 0) {
				if (this.anInt2023 + local56 > 4) {
					local56 = 4 - this.anInt2023;
				}
				this.anInt2023 += this.aDataInputStream1.read(this.aByteArray13, this.anInt2023, local56);
				if (this.anInt2023 == 4) {
					@Pc(102) int local102 = (new Class3_Sub4(this.aByteArray13)).method1245();
					this.aByteArray14 = new byte[local102];
					this.anInt2026 = 2;
				}
			}
		}
		if (this.anInt2026 == 2) {
			local56 = this.aDataInputStream1.available();
			if (local56 > 0) {
				if (this.aByteArray14.length < this.anInt2027 + local56) {
					local56 = this.aByteArray14.length - this.anInt2027;
				}
				this.anInt2027 += this.aDataInputStream1.read(this.aByteArray14, this.anInt2027, local56);
				if (this.aByteArray14.length == this.anInt2027) {
					return this.aByteArray14;
				}
			}
		}
		return null;
	}
}
