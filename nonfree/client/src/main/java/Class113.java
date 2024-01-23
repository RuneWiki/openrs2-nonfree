import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class113 {

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
	private int anInt4249;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
	private int anInt4253;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "[B")
	private byte[] aByteArray47 = new byte[4];

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!fa;")
	private Class38 aClass38_9;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
	private int anInt4251;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!mi;Ljava/net/URL;)V")
	public Class113(@OriginalArg(0) Class72 arg0, @OriginalArg(1) URL arg1) {
		this.aClass38_9 = arg0.method2250(arg1);
		this.anInt4251 = 0;
		this.aLong154 = Static144.method2489() + 30000L;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)[B")
	public byte[] method3303() throws IOException {
		if (this.aLong154 < Static144.method2489()) {
			throw new IOException("fdt");
		}
		if (this.anInt4251 == 0) {
			if (this.aClass38_9.anInt1236 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass38_9.anInt1236 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass38_9.anObject3;
				this.anInt4251 = 1;
			}
		}
		@Pc(62) int local62;
		if (this.anInt4251 == 1) {
			local62 = this.aDataInputStream1.available();
			if (local62 > 0) {
				if (local62 + this.anInt4253 > 4) {
					local62 = 4 - this.anInt4253;
				}
				this.anInt4253 += this.aDataInputStream1.read(this.aByteArray47, this.anInt4253, local62);
				if (this.anInt4253 == 4) {
					@Pc(104) int local104 = (new Class1_Sub16(this.aByteArray47)).method3784();
					this.aByteArray48 = new byte[local104];
					this.anInt4251 = 2;
				}
			}
		}
		if (this.anInt4251 == 2) {
			local62 = this.aDataInputStream1.available();
			if (local62 > 0) {
				if (local62 + this.anInt4249 > this.aByteArray48.length) {
					local62 = this.aByteArray48.length - this.anInt4249;
				}
				this.anInt4249 += this.aDataInputStream1.read(this.aByteArray48, this.anInt4249, local62);
				if (this.anInt4249 == this.aByteArray48.length) {
					return this.aByteArray48;
				}
			}
		}
		return null;
	}
}
