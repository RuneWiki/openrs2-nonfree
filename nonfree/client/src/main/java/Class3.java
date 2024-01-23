import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private int anInt76;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "[B")
	private byte[] aByteArray2 = new byte[4];

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!p;")
	private Class75 aClass75_1;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!qg;Ljava/net/URL;)V")
	public Class3(@OriginalArg(0) Class83 arg0, @OriginalArg(1) URL arg1) {
		this.aClass75_1 = arg0.method2624(arg1);
		this.anInt75 = 0;
		this.aLong5 = Static182.method2903() + 30000L;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)[B")
	public byte[] method53() throws IOException {
		if (this.aLong5 < Static182.method2903()) {
			throw new IOException("fdt");
		}
		if (this.anInt75 == 0) {
			if (this.aClass75_1.anInt3346 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass75_1.anInt3346 == 1) {
				this.anInt75 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass75_1.anObject3;
			}
		}
		@Pc(65) int local65;
		if (this.anInt75 == 1) {
			local65 = this.aDataInputStream1.available();
			if (local65 > 0) {
				if (local65 + this.anInt73 > 4) {
					local65 = 4 - this.anInt73;
				}
				this.anInt73 += this.aDataInputStream1.read(this.aByteArray2, this.anInt73, local65);
				if (this.anInt73 == 4) {
					@Pc(111) int local111 = (new Class2_Sub3(this.aByteArray2)).method185();
					this.anInt75 = 2;
					this.aByteArray1 = new byte[local111];
				}
			}
		}
		if (this.anInt75 == 2) {
			local65 = this.aDataInputStream1.available();
			if (local65 > 0) {
				if (this.aByteArray1.length < this.anInt76 + local65) {
					local65 = this.aByteArray1.length - this.anInt76;
				}
				this.anInt76 += this.aDataInputStream1.read(this.aByteArray1, this.anInt76, local65);
				if (this.anInt76 == this.aByteArray1.length) {
					return this.aByteArray1;
				}
			}
		}
		return null;
	}
}
