import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class57 {

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	private int anInt1831;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	private int anInt1832;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "[B")
	private final byte[] aByteArray21 = new byte[4];

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Lclient!jb;")
	private final Class37 aClass37_6;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	private int anInt1836;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "J")
	private final long aLong72;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!de;Ljava/net/URL;)V")
	public Class57(@OriginalArg(0) Class15 arg0, @OriginalArg(1) URL arg1) {
		this.aClass37_6 = arg0.method461(arg1);
		this.anInt1836 = 0;
		this.aLong72 = Static10.method244() + 30000L;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)[B")
	public byte[] method1297() throws IOException {
		if (this.aLong72 < Static10.method244()) {
			throw new IOException("fdt");
		}
		if (this.anInt1836 == 0) {
			if (this.aClass37_6.anInt1337 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass37_6.anInt1337 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass37_6.anObject3;
				this.anInt1836 = 1;
			}
		}
		@Pc(66) int local66;
		if (this.anInt1836 == 1) {
			local66 = this.aDataInputStream1.available();
			if (local66 > 0) {
				if (local66 + this.anInt1831 > 4) {
					local66 = 4 - this.anInt1831;
				}
				this.anInt1831 += this.aDataInputStream1.read(this.aByteArray21, this.anInt1831, local66);
				if (this.anInt1831 == 4) {
					@Pc(110) int local110 = (new Class2_Sub10(this.aByteArray21)).method1532();
					this.aByteArray20 = new byte[local110];
					this.anInt1836 = 2;
				}
			}
		}
		if (this.anInt1836 == 2) {
			local66 = this.aDataInputStream1.available();
			if (local66 > 0) {
				if (local66 + this.anInt1832 > this.aByteArray20.length) {
					local66 = this.aByteArray20.length - this.anInt1832;
				}
				this.anInt1832 += this.aDataInputStream1.read(this.aByteArray20, this.anInt1832, local66);
				if (this.anInt1832 == this.aByteArray20.length) {
					return this.aByteArray20;
				}
			}
		}
		return null;
	}
}
