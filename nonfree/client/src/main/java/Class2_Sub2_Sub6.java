import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
	private int anInt746;

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
	private int anInt756;

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
	private int anInt744 = 0;

	@OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
	private int anInt745 = 0;

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
	private int anInt747 = 0;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIBI)V")
	private void method728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : arg2 * (arg0 + 4096) >> 12;
		if (local30 <= 0) {
			this.anInt750 = this.anInt749 = this.anInt753 = arg2;
			return;
		}
		@Pc(46) int local46 = arg1 * 6;
		@Pc(53) int local53 = arg2 + arg2 - local30;
		@Pc(62) int local62 = (local30 - local53 << 12) / local30;
		@Pc(66) int local66 = local46 >> 12;
		@Pc(73) int local73 = local46 - (local66 << 12);
		@Pc(81) int local81 = local30 * local62 >> 12;
		@Pc(87) int local87 = local81 * local73 >> 12;
		@Pc(91) int local91 = local87 + local53;
		@Pc(96) int local96 = local30 - local87;
		if (local66 == 0) {
			this.anInt749 = local91;
			this.anInt750 = local30;
			this.anInt753 = local53;
		} else if (local66 == 1) {
			this.anInt750 = local96;
			this.anInt749 = local30;
			this.anInt753 = local53;
		} else if (local66 == 2) {
			this.anInt753 = local91;
			this.anInt749 = local30;
			this.anInt750 = local53;
		} else if (local66 == 3) {
			this.anInt749 = local96;
			this.anInt753 = local30;
			this.anInt750 = local53;
		} else if (local66 == 4) {
			this.anInt749 = local53;
			this.anInt750 = local91;
			this.anInt753 = local30;
		} else if (local66 == 5) {
			this.anInt753 = local96;
			this.anInt749 = local53;
			this.anInt750 = local30;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
	private void method730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 > arg1 ? arg0 : arg1;
		@Pc(27) int local27 = arg0 < arg1 ? arg0 : arg1;
		@Pc(38) int local38 = local16 >= arg2 ? local16 : arg2;
		@Pc(49) int local49 = arg2 < local27 ? arg2 : local27;
		this.anInt748 = (local49 + local38) / 2;
		@Pc(61) int local61 = local38 - local49;
		if (local61 <= 0) {
			this.anInt746 = 0;
		} else {
			@Pc(77) int local77 = (local38 - arg0 << 12) / local61;
			@Pc(85) int local85 = (local38 - arg1 << 12) / local61;
			@Pc(93) int local93 = (local38 - arg2 << 12) / local61;
			if (arg0 == local38) {
				this.anInt746 = arg1 == local49 ? local93 + 20480 : 4096 - local85;
			} else if (local38 == arg1) {
				this.anInt746 = arg2 == local49 ? local77 + 4096 : -local93 + 12288;
			} else {
				this.anInt746 = arg0 == local49 ? local85 + 12288 : -local77 + 20480;
			}
			this.anInt746 /= 6;
		}
		if (this.anInt748 > 0 && this.anInt748 < 4096) {
			this.anInt756 = (local61 << 12) / (this.anInt748 > 2048 ? 8192 - (this.anInt748 * 2) : this.anInt748 * 2);
		} else {
			this.anInt756 = 0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(26) int[][] local26 = this.method6276(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static398.anInt6955; local52++) {
				this.method730(local30[local52], local34[local52], local38[local52]);
				this.anInt748 += this.anInt747;
				this.anInt746 += this.anInt745;
				this.anInt756 += this.anInt744;
				while (this.anInt746 < 0) {
					this.anInt746 += 4096;
				}
				while (this.anInt746 > 4096) {
					this.anInt746 -= 4096;
				}
				if (this.anInt756 < 0) {
					this.anInt756 = 0;
				}
				if (this.anInt748 < 0) {
					this.anInt748 = 0;
				}
				if (this.anInt756 > 4096) {
					this.anInt756 = 4096;
				}
				if (this.anInt748 > 4096) {
					this.anInt748 = 4096;
				}
				this.method728(this.anInt756, this.anInt746, this.anInt748);
				local42[local52] = this.anInt750;
				local46[local52] = this.anInt749;
				local50[local52] = this.anInt753;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt745 = arg0.method6149();
		} else if (arg1 == 1) {
			this.anInt744 = (arg0.method6120() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt747 = (arg0.method6120() << 12) / 100;
		}
	}
}
