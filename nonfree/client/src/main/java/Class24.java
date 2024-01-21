import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class24 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	private int anInt1726;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	private int anInt1727;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
	private final byte[] aByteArray15 = new byte[4];

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!gg;")
	private final Class26 aClass26_2;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
	private int anInt1733;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "J")
	private final long aLong42;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!od;Ljava/net/URL;)V")
	public Class24(@OriginalArg(0) Class53 arg0, @OriginalArg(1) URL arg1) {
		this.aClass26_2 = arg0.method2274(arg1);
		this.anInt1733 = 0;
		this.aLong42 = Static146.method2771() + 30000L;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)[B")
	public byte[] method1135() throws IOException {
		if (Static146.method2771() > this.aLong42) {
			throw new IOException("fdt");
		}
		if (this.anInt1733 == 0) {
			if (this.aClass26_2.anInt1788 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass26_2.anInt1788 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass26_2.anObject2;
				this.anInt1733 = 1;
			}
		}
		@Pc(59) int local59;
		if (this.anInt1733 == 1) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (local59 + this.anInt1727 > 4) {
					local59 = 4 - this.anInt1727;
				}
				this.anInt1727 += this.aDataInputStream1.read(this.aByteArray15, this.anInt1727, local59);
				if (this.anInt1727 == 4) {
					@Pc(100) int local100 = (new Class1_Sub6(this.aByteArray15)).method499();
					this.anInt1733 = 2;
					this.aByteArray14 = new byte[local100];
				}
			}
		}
		if (this.anInt1733 == 2) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.aByteArray14.length < local59 + this.anInt1726) {
					local59 = this.aByteArray14.length - this.anInt1726;
				}
				this.anInt1726 += this.aDataInputStream1.read(this.aByteArray14, this.anInt1726, local59);
				if (this.anInt1726 == this.aByteArray14.length) {
					return this.aByteArray14;
				}
			}
		}
		return null;
	}
}
