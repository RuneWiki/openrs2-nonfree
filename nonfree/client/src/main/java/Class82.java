import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class82 {

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	private int anInt3504;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	private int anInt3509;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "[B")
	private final byte[] aByteArray46 = new byte[4];

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Lclient!je;")
	private final Class41 aClass41_7;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	private int anInt3506;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "J")
	private final long aLong127;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!qe;Ljava/net/URL;)V")
	public Class82(@OriginalArg(0) Class66 arg0, @OriginalArg(1) URL arg1) {
		this.aClass41_7 = arg0.method2123(arg1);
		this.anInt3506 = 0;
		this.aLong127 = Static177.method2758() + 30000L;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)[B")
	public byte[] method2412() throws IOException {
		if (this.aLong127 < Static177.method2758()) {
			throw new IOException("fdt");
		}
		if (this.anInt3506 == 0) {
			if (this.aClass41_7.anInt2096 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass41_7.anInt2096 == 1) {
				this.anInt3506 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass41_7.anObject2;
			}
		}
		@Pc(64) int local64;
		if (this.anInt3506 == 1) {
			local64 = this.aDataInputStream1.available();
			if (local64 > 0) {
				if (local64 + this.anInt3509 > 4) {
					local64 = 4 - this.anInt3509;
				}
				this.anInt3509 += this.aDataInputStream1.read(this.aByteArray46, this.anInt3509, local64);
				if (this.anInt3509 == 4) {
					@Pc(103) int local103 = (new Class2_Sub2(this.aByteArray46)).method1690();
					this.anInt3506 = 2;
					this.aByteArray45 = new byte[local103];
				}
			}
		}
		if (this.anInt3506 == 2) {
			local64 = this.aDataInputStream1.available();
			if (local64 > 0) {
				if (local64 + this.anInt3504 > this.aByteArray45.length) {
					local64 = this.aByteArray45.length - this.anInt3504;
				}
				this.anInt3504 += this.aDataInputStream1.read(this.aByteArray45, this.anInt3504, local64);
				if (this.anInt3504 == this.aByteArray45.length) {
					return this.aByteArray45;
				}
			}
		}
		return null;
	}
}
