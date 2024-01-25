import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!he", name = "P", descriptor = "I")
	private int anInt2850;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "I")
	private int anInt2853;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "I")
	private int anInt2854;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "I")
	private int anInt2856;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "I")
	private int anInt2857;

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
	private int anInt2860;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "I")
	private int anInt2848 = 0;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
	private int anInt2851 = 0;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "I")
	private int anInt2846 = 0;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2848 = arg1.method3701();
		} else if (arg0 == 1) {
			this.anInt2851 = (arg1.method3693() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2846 = (arg1.method3693() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V")
	private void method2211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 < arg1 ? arg1 : arg2;
		@Pc(27) int local27 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(38) int local38 = arg0 <= local16 ? local16 : arg0;
		@Pc(49) int local49 = local27 <= arg0 ? local27 : arg0;
		this.anInt2856 = (local38 + local49) / 2;
		@Pc(61) int local61 = local38 - local49;
		if (local61 > 0) {
			@Pc(75) int local75 = (local38 - arg1 << 12) / local61;
			@Pc(84) int local84 = (local38 - arg2 << 12) / local61;
			@Pc(93) int local93 = (local38 - arg0 << 12) / local61;
			if (local38 == arg1) {
				this.anInt2860 = local49 == arg2 ? local93 + 20480 : -local84 + 4096;
			} else if (local38 == arg2) {
				this.anInt2860 = local49 == arg0 ? local75 + 4096 : -local93 + 12288;
			} else {
				this.anInt2860 = arg1 == local49 ? local84 + 12288 : 20480 - local75;
			}
			this.anInt2860 /= 6;
		} else {
			this.anInt2860 = 0;
		}
		if (this.anInt2856 > 0 && this.anInt2856 < 4096) {
			this.anInt2854 = (local61 << 12) / (this.anInt2856 > 2048 ? 8192 - (this.anInt2856 * 2) : this.anInt2856 * 2);
		} else {
			this.anInt2854 = 0;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(26) int[][] local26 = this.method6031(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static131.anInt2581; local52++) {
				this.method2211(local38[local52], local30[local52], local34[local52]);
				this.anInt2856 += this.anInt2846;
				this.anInt2854 += this.anInt2851;
				for (this.anInt2860 += this.anInt2848; this.anInt2860 < 0; this.anInt2860 += 4096) {
				}
				while (this.anInt2860 > 4096) {
					this.anInt2860 -= 4096;
				}
				if (this.anInt2854 < 0) {
					this.anInt2854 = 0;
				}
				if (this.anInt2856 < 0) {
					this.anInt2856 = 0;
				}
				if (this.anInt2854 > 4096) {
					this.anInt2854 = 4096;
				}
				if (this.anInt2856 > 4096) {
					this.anInt2856 = 4096;
				}
				this.method2213(this.anInt2854, this.anInt2856, this.anInt2860);
				local42[local52] = this.anInt2857;
				local46[local52] = this.anInt2853;
				local50[local52] = this.anInt2850;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZI)V")
	private void method2213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) int local37 = arg1 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (4096 - -arg0) * arg1 >> 12;
		if (local37 <= 0) {
			this.anInt2857 = this.anInt2853 = this.anInt2850 = arg1;
			return;
		}
		@Pc(46) int local46 = arg2 * 6;
		@Pc(53) int local53 = arg1 + arg1 - local37;
		@Pc(62) int local62 = (local37 - local53 << 12) / local37;
		@Pc(66) int local66 = local46 >> 12;
		@Pc(73) int local73 = local46 - (local66 << 12);
		@Pc(81) int local81 = local37 * local62 >> 12;
		@Pc(87) int local87 = local73 * local81 >> 12;
		@Pc(92) int local92 = local53 + local87;
		@Pc(97) int local97 = local37 - local87;
		if (local66 == 0) {
			this.anInt2857 = local37;
			this.anInt2850 = local53;
			this.anInt2853 = local92;
			return;
		}
		if (local66 == 1) {
			this.anInt2850 = local53;
			this.anInt2853 = local37;
			this.anInt2857 = local97;
			return;
		}
		if (local66 == 2) {
			this.anInt2857 = local53;
			this.anInt2853 = local37;
			this.anInt2850 = local92;
			return;
		}
		if (local66 == 3) {
			this.anInt2850 = local37;
			this.anInt2857 = local53;
			this.anInt2853 = local97;
			return;
		}
		if (local66 == 4) {
			this.anInt2853 = local53;
			this.anInt2850 = local37;
			this.anInt2857 = local92;
			return;
		}
		if (local66 == 5) {
			this.anInt2853 = local53;
			this.anInt2850 = local97;
			this.anInt2857 = local37;
			return;
		}
	}
}
