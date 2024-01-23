import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class20 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[B")
	private byte[] aByteArray16 = new byte[4];

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!fi;")
	private Class36 aClass36_2;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!mc;Ljava/net/URL;)V")
	public Class20(@OriginalArg(0) Class65 arg0, @OriginalArg(1) URL arg1) {
		this.aClass36_2 = arg0.method2012(arg1);
		this.anInt838 = 0;
		this.aLong27 = Static3.method57() + 30000L;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)[B")
	public byte[] method625() throws IOException {
		if (Static3.method57() > this.aLong27) {
			throw new IOException("fdt");
		}
		if (this.anInt838 == 0) {
			if (this.aClass36_2.anInt1500 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass36_2.anInt1500 == 1) {
				this.anInt838 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass36_2.anObject2;
			}
		}
		@Pc(95) int local95;
		if (this.anInt838 == 1) {
			@Pc(57) int local57 = this.aDataInputStream1.available();
			if (local57 > 0) {
				if (local57 + this.anInt835 > 4) {
					local57 = 4 - this.anInt835;
				}
				this.anInt835 += this.aDataInputStream1.read(this.aByteArray16, this.anInt835, local57);
				if (this.anInt835 == 4) {
					local95 = (new Class1_Sub9(this.aByteArray16)).method915();
					this.anInt838 = 2;
					this.aByteArray17 = new byte[local95];
				}
			}
		}
		if (this.anInt838 == 2) {
			local95 = this.aDataInputStream1.available();
			if (local95 > 0) {
				if (this.anInt833 + local95 > this.aByteArray17.length) {
					local95 = this.aByteArray17.length - this.anInt833;
				}
				this.anInt833 += this.aDataInputStream1.read(this.aByteArray17, this.anInt833, local95);
				if (this.aByteArray17.length == this.anInt833) {
					return this.aByteArray17;
				}
			}
		}
		return null;
	}
}
