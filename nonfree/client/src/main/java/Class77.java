import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class77 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "[Lclient!nda;")
	private final Class204[] aClass204Array1 = new Class204[10];

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	private int anInt2511;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	private int anInt2512;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!gw;)V")
	public Class77(@OriginalArg(0) Class1_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3043();
			if (local12 != 0) {
				arg0.anInt3400--;
				this.aClass204Array1[local7] = new Class204();
				this.aClass204Array1[local7].method5211(arg0);
			}
		}
		this.anInt2511 = arg0.method3056();
		this.anInt2512 = arg0.method3056();
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	private Class77() {
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()Lclient!qk;")
	public Class1_Sub32_Sub1 method2365() {
		@Pc(2) byte[] local2 = this.method2368();
		return new Class1_Sub32_Sub1(22050, local2, this.anInt2511 * 22050 / 1000, this.anInt2512 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()I")
	public int method2367() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass204Array1[local3] != null && this.aClass204Array1[local3].anInt6042 / 20 < local1) {
				local1 = this.aClass204Array1[local3].anInt6042 / 20;
			}
		}
		if (this.anInt2511 < this.anInt2512 && this.anInt2511 / 20 < local1) {
			local1 = this.anInt2511 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass204Array1[local55] != null) {
				this.aClass204Array1[local55].anInt6042 -= local1 * 20;
			}
		}
		if (this.anInt2511 < this.anInt2512) {
			this.anInt2511 -= local1 * 20;
			this.anInt2512 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()[B")
	private byte[] method2368() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass204Array1[local3] != null && this.aClass204Array1[local3].anInt6043 + this.aClass204Array1[local3].anInt6042 > local1) {
				local1 = this.aClass204Array1[local3].anInt6043 + this.aClass204Array1[local3].anInt6042;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass204Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass204Array1[local54].anInt6043 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass204Array1[local54].anInt6042 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass204Array1[local54].method5213(local70, this.aClass204Array1[local54].anInt6043);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}
}
