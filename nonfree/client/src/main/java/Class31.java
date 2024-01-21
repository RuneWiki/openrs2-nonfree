import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class31 {

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
	private int anInt1359;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
	private int anInt1360;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[B")
	private final byte[] aByteArray18 = new byte[4];

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Lclient!be;")
	private final Class10 aClass10_4;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	private int anInt1354;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "J")
	private final long aLong43;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!je;Ljava/net/URL;)V")
	public Class31(@OriginalArg(0) Class40 arg0, @OriginalArg(1) URL arg1) {
		this.aClass10_4 = arg0.method947(arg1);
		this.anInt1354 = 0;
		this.aLong43 = Static27.method497() + 30000L;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)[B")
	public byte[] method771() throws IOException {
		if (this.aLong43 < Static27.method497()) {
			throw new IOException("fdt");
		}
		if (this.anInt1354 == 0) {
			if (this.aClass10_4.anInt295 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass10_4.anInt295 == 1) {
				this.anInt1354 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass10_4.anObject1;
			}
		}
		@Pc(59) int local59;
		if (this.anInt1354 == 1) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (local59 + this.anInt1360 > 4) {
					local59 = 4 - this.anInt1360;
				}
				this.anInt1360 += this.aDataInputStream1.read(this.aByteArray18, this.anInt1360, local59);
				if (this.anInt1360 == 4) {
					@Pc(101) int local101 = (new Class8_Sub20(this.aByteArray18)).method1853();
					this.anInt1354 = 2;
					this.aByteArray19 = new byte[local101];
				}
			}
		}
		if (this.anInt1354 == 2) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.aByteArray19.length < this.anInt1359 + local59) {
					local59 = this.aByteArray19.length - this.anInt1359;
				}
				this.anInt1359 += this.aDataInputStream1.read(this.aByteArray19, this.anInt1359, local59);
				if (this.aByteArray19.length == this.anInt1359) {
					return this.aByteArray19;
				}
			}
		}
		return null;
	}
}
