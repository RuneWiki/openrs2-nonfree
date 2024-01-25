import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class100 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "[Lclient!aga;")
	private final Class9[] aClass9Array1 = new Class9[10];

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	private int anInt2155;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	private int anInt2154;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class100(@OriginalArg(0) Class2_Sub7 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4464();
			if (local12 != 0) {
				arg0.anInt5186--;
				this.aClass9Array1[local7] = new Class9();
				this.aClass9Array1[local7].method180(arg0);
			}
		}
		this.anInt2155 = arg0.method4518();
		this.anInt2154 = arg0.method4518();
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	private Class100() {
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()[B")
	private byte[] method1804() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass9Array1[local3] != null && this.aClass9Array1[local3].anInt233 + this.aClass9Array1[local3].anInt231 > local1) {
				local1 = this.aClass9Array1[local3].anInt233 + this.aClass9Array1[local3].anInt231;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass9Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass9Array1[local54].anInt233 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass9Array1[local54].anInt231 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass9Array1[local54].method181(local70, this.aClass9Array1[local54].anInt233);
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

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()I")
	public int method1805() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass9Array1[local3] != null && this.aClass9Array1[local3].anInt231 / 20 < local1) {
				local1 = this.aClass9Array1[local3].anInt231 / 20;
			}
		}
		if (this.anInt2155 < this.anInt2154 && this.anInt2155 / 20 < local1) {
			local1 = this.anInt2155 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass9Array1[local55] != null) {
				this.aClass9Array1[local55].anInt231 -= local1 * 20;
			}
		}
		if (this.anInt2155 < this.anInt2154) {
			this.anInt2155 -= local1 * 20;
			this.anInt2154 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()Lclient!wm;")
	public Class2_Sub13_Sub1 method1806() {
		@Pc(2) byte[] local2 = this.method1804();
		return new Class2_Sub13_Sub1(22050, local2, this.anInt2155 * 22050 / 1000, this.anInt2154 * 22050 / 1000);
	}
}
