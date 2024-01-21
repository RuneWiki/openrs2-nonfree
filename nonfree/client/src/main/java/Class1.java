import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	private int anInt6;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	private int anInt7;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "[B")
	private final byte[] aByteArray2 = new byte[4];

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!bd;")
	private final Class10 aClass10_1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	private int anInt4;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "J")
	private final long aLong1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!vf;Ljava/net/URL;)V")
	public Class1(@OriginalArg(0) Class80 arg0, @OriginalArg(1) URL arg1) {
		this.aClass10_1 = arg0.method2037(arg1);
		this.anInt4 = 0;
		this.aLong1 = Static102.method1742() + 30000L;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)[B")
	public byte[] method5() throws IOException {
		if (Static102.method1742() > this.aLong1) {
			throw new IOException("fdt");
		}
		if (this.anInt4 == 0) {
			if (this.aClass10_1.anInt242 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass10_1.anInt242 == 1) {
				this.anInt4 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass10_1.anObject1;
			}
		}
		@Pc(67) int local67;
		if (this.anInt4 == 1) {
			local67 = this.aDataInputStream1.available();
			if (local67 > 0) {
				if (this.anInt6 + local67 > 4) {
					local67 = 4 - this.anInt6;
				}
				this.anInt6 += this.aDataInputStream1.read(this.aByteArray2, this.anInt6, local67);
				if (this.anInt6 == 4) {
					@Pc(111) int local111 = (new Class5_Sub14(this.aByteArray2)).method1461();
					this.anInt4 = 2;
					this.aByteArray1 = new byte[local111];
				}
			}
		}
		if (this.anInt4 == 2) {
			local67 = this.aDataInputStream1.available();
			if (local67 > 0) {
				if (local67 + this.anInt7 > this.aByteArray1.length) {
					local67 = this.aByteArray1.length - this.anInt7;
				}
				this.anInt7 += this.aDataInputStream1.read(this.aByteArray1, this.anInt7, local67);
				if (this.aByteArray1.length == this.anInt7) {
					return this.aByteArray1;
				}
			}
		}
		return null;
	}
}
