import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class83 {

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	private int anInt2937;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "I")
	private int anInt2939;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[B")
	private final byte[] aByteArray43 = new byte[4];

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!ie;")
	private final Class32 aClass32_8;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	private int anInt2936;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "J")
	private final long aLong129;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!bb;Ljava/net/URL;)V")
	public Class83(@OriginalArg(0) Class7 arg0, @OriginalArg(1) URL arg1) {
		this.aClass32_8 = arg0.method284(arg1);
		this.anInt2936 = 0;
		this.aLong129 = Static54.method1236() + 30000L;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)[B")
	public byte[] method2047() throws IOException {
		if (this.aLong129 < Static54.method1236()) {
			throw new IOException("fdt");
		}
		if (this.anInt2936 == 0) {
			if (this.aClass32_8.anInt1494 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass32_8.anInt1494 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass32_8.anObject4;
				this.anInt2936 = 1;
			}
		}
		@Pc(58) int local58;
		if (this.anInt2936 == 1) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.anInt2937 + local58 > 4) {
					local58 = 4 - this.anInt2937;
				}
				this.anInt2937 += this.aDataInputStream1.read(this.aByteArray43, this.anInt2937, local58);
				if (this.anInt2937 == 4) {
					@Pc(104) int local104 = (new Class1_Sub12(this.aByteArray43)).method1210();
					this.anInt2936 = 2;
					this.aByteArray44 = new byte[local104];
				}
			}
		}
		if (this.anInt2936 == 2) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (local58 + this.anInt2939 > this.aByteArray44.length) {
					local58 = this.aByteArray44.length - this.anInt2939;
				}
				this.anInt2939 += this.aDataInputStream1.read(this.aByteArray44, this.anInt2939, local58);
				if (this.aByteArray44.length == this.anInt2939) {
					return this.aByteArray44;
				}
			}
		}
		return null;
	}
}
