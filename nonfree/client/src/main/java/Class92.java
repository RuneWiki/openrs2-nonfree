import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class92 {

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	private int anInt4616;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	private int anInt4618;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[B")
	private final byte[] aByteArray56 = new byte[4];

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!fd;")
	private final Class25 aClass25_47;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
	private int anInt4621;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "J")
	private final long aLong150;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!t;Ljava/net/URL;)V")
	public Class92(@OriginalArg(0) Class81 arg0, @OriginalArg(1) URL arg1) {
		this.aClass25_47 = arg0.method3148(arg1);
		this.anInt4621 = 0;
		this.aLong150 = Static1.method2() + 30000L;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)[B")
	public byte[] method3540() throws IOException {
		if (this.aLong150 < Static1.method2()) {
			throw new IOException("fdt");
		}
		if (this.anInt4621 == 0) {
			if (this.aClass25_47.anInt1695 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass25_47.anInt1695 == 1) {
				this.anInt4621 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass25_47.anObject2;
			}
		}
		@Pc(58) int local58;
		if (this.anInt4621 == 1) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.anInt4618 + local58 > 4) {
					local58 = 4 - this.anInt4618;
				}
				this.anInt4618 += this.aDataInputStream1.read(this.aByteArray56, this.anInt4618, local58);
				if (this.anInt4618 == 4) {
					@Pc(99) int local99 = (new Class2_Sub3(this.aByteArray56)).method206();
					this.anInt4621 = 2;
					this.aByteArray55 = new byte[local99];
				}
			}
		}
		if (this.anInt4621 == 2) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (local58 + this.anInt4616 > this.aByteArray55.length) {
					local58 = this.aByteArray55.length - this.anInt4616;
				}
				this.anInt4616 += this.aDataInputStream1.read(this.aByteArray55, this.anInt4616, local58);
				if (this.anInt4616 == this.aByteArray55.length) {
					return this.aByteArray55;
				}
			}
		}
		return null;
	}
}
