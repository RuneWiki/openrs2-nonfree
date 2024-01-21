import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class69 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	private int anInt2211;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	private int anInt2212;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "[B")
	private final byte[] aByteArray29 = new byte[4];

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Lclient!cf;")
	private final Class15 aClass15_8;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	private int anInt2210;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "J")
	private final long aLong67;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!df;Ljava/net/URL;)V")
	public Class69(@OriginalArg(0) Class20 arg0, @OriginalArg(1) URL arg1) {
		this.aClass15_8 = arg0.method370(arg1);
		this.anInt2210 = 0;
		this.aLong67 = Static78.method1296() + 30000L;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)[B")
	public byte[] method1594() throws IOException {
		if (Static78.method1296() > this.aLong67) {
			throw new IOException("fdt");
		}
		if (this.anInt2210 == 0) {
			if (this.aClass15_8.anInt404 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass15_8.anInt404 == 1) {
				this.anInt2210 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass15_8.anObject9;
			}
		}
		@Pc(55) int local55;
		if (this.anInt2210 == 1) {
			local55 = this.aDataInputStream1.available();
			if (local55 > 0) {
				if (this.anInt2212 + local55 > 4) {
					local55 = 4 - this.anInt2212;
				}
				this.anInt2212 += this.aDataInputStream1.read(this.aByteArray29, this.anInt2212, local55);
				if (this.anInt2212 == 4) {
					@Pc(99) int local99 = (new Class2_Sub4(this.aByteArray29)).method903();
					this.aByteArray28 = new byte[local99];
					this.anInt2210 = 2;
				}
			}
		}
		if (this.anInt2210 == 2) {
			local55 = this.aDataInputStream1.available();
			if (local55 > 0) {
				if (this.aByteArray28.length < this.anInt2211 + local55) {
					local55 = this.aByteArray28.length - this.anInt2211;
				}
				this.anInt2211 += this.aDataInputStream1.read(this.aByteArray28, this.anInt2211, local55);
				if (this.anInt2211 == this.aByteArray28.length) {
					return this.aByteArray28;
				}
			}
		}
		return null;
	}
}
