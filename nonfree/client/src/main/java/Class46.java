import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class46 {

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
	private int anInt1878;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
	private int anInt1880;

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "[B")
	private final byte[] aByteArray30 = new byte[4];

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!tf;")
	private final Class73 aClass73_9;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	private int anInt1875;

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "J")
	private final long aLong97;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!dd;Ljava/net/URL;)V")
	public Class46(@OriginalArg(0) Class15 arg0, @OriginalArg(1) URL arg1) {
		this.aClass73_9 = arg0.method490(arg1);
		this.anInt1875 = 0;
		this.aLong97 = Static35.method634() + 30000L;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)[B")
	public byte[] method1254() throws IOException {
		if (Static35.method634() > this.aLong97) {
			throw new IOException("fdt");
		}
		if (this.anInt1875 == 0) {
			if (this.aClass73_9.anInt2813 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass73_9.anInt2813 == 1) {
				this.anInt1875 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass73_9.anObject4;
			}
		}
		@Pc(59) int local59;
		if (this.anInt1875 == 1) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.anInt1880 + local59 > 4) {
					local59 = 4 - this.anInt1880;
				}
				this.anInt1880 += this.aDataInputStream1.read(this.aByteArray30, this.anInt1880, local59);
				if (this.anInt1880 == 4) {
					@Pc(101) int local101 = (new Class1_Sub19(this.aByteArray30)).method2046();
					this.anInt1875 = 2;
					this.aByteArray31 = new byte[local101];
				}
			}
		}
		if (this.anInt1875 == 2) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.aByteArray31.length < local59 + this.anInt1878) {
					local59 = this.aByteArray31.length - this.anInt1878;
				}
				this.anInt1878 += this.aDataInputStream1.read(this.aByteArray31, this.anInt1878, local59);
				if (this.anInt1878 == this.aByteArray31.length) {
					return this.aByteArray31;
				}
			}
		}
		return null;
	}
}
