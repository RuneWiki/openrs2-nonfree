import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class79 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	private int anInt3639;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	private int anInt3641;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "[B")
	private final byte[] aByteArray42 = new byte[4];

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!ha;")
	private final Class34 aClass34_7;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	private int anInt3637;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "J")
	private final long aLong121;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!da;Ljava/net/URL;)V")
	public Class79(@OriginalArg(0) Class14 arg0, @OriginalArg(1) URL arg1) {
		this.aClass34_7 = arg0.method624(arg1);
		this.anInt3637 = 0;
		this.aLong121 = Static190.method3141() + 30000L;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)[B")
	public byte[] method2764() throws IOException {
		if (this.aLong121 < Static190.method3141()) {
			throw new IOException("fdt");
		}
		if (this.anInt3637 == 0) {
			if (this.aClass34_7.anInt1727 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass34_7.anInt1727 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass34_7.anObject1;
				this.anInt3637 = 1;
			}
		}
		@Pc(67) int local67;
		if (this.anInt3637 == 1) {
			local67 = this.aDataInputStream1.available();
			if (local67 > 0) {
				if (local67 + this.anInt3641 > 4) {
					local67 = 4 - this.anInt3641;
				}
				this.anInt3641 += this.aDataInputStream1.read(this.aByteArray42, this.anInt3641, local67);
				if (this.anInt3641 == 4) {
					@Pc(112) int local112 = (new Class1_Sub14(this.aByteArray42)).method1700();
					this.anInt3637 = 2;
					this.aByteArray43 = new byte[local112];
				}
			}
		}
		if (this.anInt3637 == 2) {
			local67 = this.aDataInputStream1.available();
			if (local67 > 0) {
				if (local67 + this.anInt3639 > this.aByteArray43.length) {
					local67 = this.aByteArray43.length - this.anInt3639;
				}
				this.anInt3639 += this.aDataInputStream1.read(this.aByteArray43, this.anInt3639, local67);
				if (this.aByteArray43.length == this.anInt3639) {
					return this.aByteArray43;
				}
			}
		}
		return null;
	}
}
