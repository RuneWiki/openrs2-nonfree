import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class82 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
	private int anInt4106;

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
	private int anInt4110;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "[B")
	private final byte[] aByteArray48 = new byte[4];

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "Lclient!oc;")
	private final Class61 aClass61_8;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	private int anInt4102;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "J")
	private final long aLong139;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!qf;Ljava/net/URL;)V")
	public Class82(@OriginalArg(0) Class68 arg0, @OriginalArg(1) URL arg1) {
		this.aClass61_8 = arg0.method2532(arg1);
		this.anInt4102 = 0;
		this.aLong139 = Static176.method3161() + 30000L;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)[B")
	public byte[] method3105() throws IOException {
		if (Static176.method3161() > this.aLong139) {
			throw new IOException("fdt");
		}
		if (this.anInt4102 == 0) {
			if (this.aClass61_8.anInt2845 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass61_8.anInt2845 == 1) {
				this.anInt4102 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass61_8.anObject4;
			}
		}
		@Pc(64) int local64;
		if (this.anInt4102 == 1) {
			local64 = this.aDataInputStream1.available();
			if (local64 > 0) {
				if (local64 + this.anInt4106 > 4) {
					local64 = 4 - this.anInt4106;
				}
				this.anInt4106 += this.aDataInputStream1.read(this.aByteArray48, this.anInt4106, local64);
				if (this.anInt4106 == 4) {
					@Pc(108) int local108 = (new Class3_Sub8(this.aByteArray48)).method1540();
					this.aByteArray47 = new byte[local108];
					this.anInt4102 = 2;
				}
			}
		}
		if (this.anInt4102 == 2) {
			local64 = this.aDataInputStream1.available();
			if (local64 > 0) {
				if (this.aByteArray47.length < local64 + this.anInt4110) {
					local64 = this.aByteArray47.length - this.anInt4110;
				}
				this.anInt4110 += this.aDataInputStream1.read(this.aByteArray47, this.anInt4110, local64);
				if (this.anInt4110 == this.aByteArray47.length) {
					return this.aByteArray47;
				}
			}
		}
		return null;
	}
}
