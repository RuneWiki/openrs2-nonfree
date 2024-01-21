import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class50 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "[Lclient!le;")
	private final Class46[] aClass46Array1 = new Class46[10];

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	private int anInt1941;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	private int anInt1940;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class50(@OriginalArg(0) Class5_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1546();
			if (local12 != 0) {
				arg0.anInt2233--;
				this.aClass46Array1[local7] = new Class46();
				this.aClass46Array1[local7].method1135(arg0);
			}
		}
		this.anInt1941 = arg0.method1543();
		this.anInt1940 = arg0.method1543();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()[B")
	private byte[] method1285() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass46Array1[local3] != null && this.aClass46Array1[local3].anInt1657 + this.aClass46Array1[local3].anInt1654 > local1) {
				local1 = this.aClass46Array1[local3].anInt1657 + this.aClass46Array1[local3].anInt1654;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass46Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass46Array1[local54].anInt1657 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass46Array1[local54].anInt1654 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass46Array1[local54].method1136(local70, this.aClass46Array1[local54].anInt1657);
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

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()I")
	public int method1286() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass46Array1[local3] != null && this.aClass46Array1[local3].anInt1654 / 20 < local1) {
				local1 = this.aClass46Array1[local3].anInt1654 / 20;
			}
		}
		if (this.anInt1941 < this.anInt1940 && this.anInt1941 / 20 < local1) {
			local1 = this.anInt1941 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass46Array1[local55] != null) {
				this.aClass46Array1[local55].anInt1654 -= local1 * 20;
			}
		}
		if (this.anInt1941 < this.anInt1940) {
			this.anInt1941 -= local1 * 20;
			this.anInt1940 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()Lclient!w;")
	public Class5_Sub15_Sub1 method1287() {
		@Pc(2) byte[] local2 = this.method1285();
		return new Class5_Sub15_Sub1(22050, local2, this.anInt1941 * 22050 / 1000, this.anInt1940 * 22050 / 1000);
	}
}
