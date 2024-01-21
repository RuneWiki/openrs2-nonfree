import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class5 {

	@OriginalMember(owner = "client!b", name = "i", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "[B")
	private final byte[] aByteArray1 = new byte[4];

	@OriginalMember(owner = "client!b", name = "z", descriptor = "Lclient!dd;")
	private final Class15 aClass15_1;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "J")
	private final long aLong12;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!pc;Ljava/net/URL;)V")
	public Class5(@OriginalArg(0) Class63 arg0, @OriginalArg(1) URL arg1) {
		this.aClass15_1 = arg0.method1962(arg1);
		this.anInt258 = 0;
		this.aLong12 = Static29.method615() + 30000L;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)[B")
	public byte[] method169() throws IOException {
		if (this.aLong12 < Static29.method615()) {
			throw new IOException("fdt");
		}
		if (this.anInt258 == 0) {
			if (this.aClass15_1.anInt821 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass15_1.anInt821 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass15_1.anObject2;
				this.anInt258 = 1;
			}
		}
		@Pc(64) int local64;
		if (this.anInt258 == 1) {
			local64 = this.aDataInputStream1.available();
			if (local64 > 0) {
				if (this.anInt259 + local64 > 4) {
					local64 = 4 - this.anInt259;
				}
				this.anInt259 += this.aDataInputStream1.read(this.aByteArray1, this.anInt259, local64);
				if (this.anInt259 == 4) {
					@Pc(107) int local107 = (new Class2_Sub11(this.aByteArray1)).method1449();
					this.anInt258 = 2;
					this.aByteArray2 = new byte[local107];
				}
			}
		}
		if (this.anInt258 == 2) {
			local64 = this.aDataInputStream1.available();
			if (local64 > 0) {
				if (this.anInt263 + local64 > this.aByteArray2.length) {
					local64 = this.aByteArray2.length - this.anInt263;
				}
				this.anInt263 += this.aDataInputStream1.read(this.aByteArray2, this.anInt263, local64);
				if (this.aByteArray2.length == this.anInt263) {
					return this.aByteArray2;
				}
			}
		}
		return null;
	}
}
