import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class58 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private int anInt2786;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	private int anInt2787;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[B")
	private final byte[] aByteArray38 = new byte[4];

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!sh;")
	private final Class78 aClass78_7;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	private int anInt2790;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "J")
	private final long aLong90;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ma;Ljava/net/URL;)V")
	public Class58(@OriginalArg(0) Class50 arg0, @OriginalArg(1) URL arg1) {
		this.aClass78_7 = arg0.method1744(arg1);
		this.anInt2790 = 0;
		this.aLong90 = Static101.method1795() + 30000L;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)[B")
	public byte[] method1988() throws IOException {
		if (this.aLong90 < Static101.method1795()) {
			throw new IOException("fdt");
		}
		if (this.anInt2790 == 0) {
			if (this.aClass78_7.anInt3646 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass78_7.anInt3646 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass78_7.anObject3;
				this.anInt2790 = 1;
			}
		}
		@Pc(57) int local57;
		if (this.anInt2790 == 1) {
			local57 = this.aDataInputStream1.available();
			if (local57 > 0) {
				if (local57 + this.anInt2786 > 4) {
					local57 = 4 - this.anInt2786;
				}
				this.anInt2786 += this.aDataInputStream1.read(this.aByteArray38, this.anInt2786, local57);
				if (this.anInt2786 == 4) {
					@Pc(101) int local101 = (new Class2_Sub18(this.aByteArray38)).method2382();
					this.aByteArray37 = new byte[local101];
					this.anInt2790 = 2;
				}
			}
		}
		if (this.anInt2790 == 2) {
			local57 = this.aDataInputStream1.available();
			if (local57 > 0) {
				if (local57 + this.anInt2787 > this.aByteArray37.length) {
					local57 = this.aByteArray37.length - this.anInt2787;
				}
				this.anInt2787 += this.aDataInputStream1.read(this.aByteArray37, this.anInt2787, local57);
				if (this.anInt2787 == this.aByteArray37.length) {
					return this.aByteArray37;
				}
			}
		}
		return null;
	}
}
