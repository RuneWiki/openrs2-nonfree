import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tw", name = "E", descriptor = "I")
	private int anInt8745;

	@OriginalMember(owner = "client!tw", name = "J", descriptor = "I")
	private int anInt8749;

	@OriginalMember(owner = "client!tw", name = "N", descriptor = "I")
	private int anInt8753;

	@OriginalMember(owner = "client!tw", name = "P", descriptor = "I")
	private int anInt8754;

	@OriginalMember(owner = "client!tw", name = "R", descriptor = "I")
	private int anInt8756;

	@OriginalMember(owner = "client!tw", name = "S", descriptor = "I")
	private int anInt8757;

	@OriginalMember(owner = "client!tw", name = "C", descriptor = "I")
	private int anInt8743 = 0;

	@OriginalMember(owner = "client!tw", name = "K", descriptor = "I")
	private int anInt8750 = 0;

	@OriginalMember(owner = "client!tw", name = "Q", descriptor = "I")
	private int anInt8755 = 0;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8743 = arg0.method5738();
		} else if (arg1 == 1) {
			this.anInt8755 = (arg0.method5751() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt8750 = (arg0.method5751() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIZ)V")
	private void method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25 = arg0 > 2048 ? arg1 + arg0 - (arg1 * arg0 >> 12) : arg0 * (4096 - -arg1) >> 12;
		if (local25 <= 0) {
			this.anInt8749 = this.anInt8757 = this.anInt8745 = arg0;
			return;
		}
		@Pc(52) int local52 = arg2 * 6;
		@Pc(59) int local59 = arg0 + arg0 - local25;
		@Pc(68) int local68 = (local25 - local59 << 12) / local25;
		@Pc(72) int local72 = local52 >> 12;
		@Pc(79) int local79 = local52 - (local72 << 12);
		@Pc(87) int local87 = local68 * local25 >> 12;
		@Pc(93) int local93 = local87 * local79 >> 12;
		@Pc(97) int local97 = local59 + local93;
		@Pc(102) int local102 = local25 - local93;
		if (local72 == 0) {
			this.anInt8749 = local25;
			this.anInt8745 = local59;
			this.anInt8757 = local97;
		} else if (local72 == 1) {
			this.anInt8749 = local102;
			this.anInt8757 = local25;
			this.anInt8745 = local59;
		} else if (local72 == 2) {
			this.anInt8745 = local97;
			this.anInt8749 = local59;
			this.anInt8757 = local25;
		} else if (local72 == 3) {
			this.anInt8757 = local102;
			this.anInt8745 = local25;
			this.anInt8749 = local59;
		} else if (local72 == 4) {
			this.anInt8757 = local59;
			this.anInt8749 = local97;
			this.anInt8745 = local25;
		} else if (local72 == 5) {
			this.anInt8745 = local102;
			this.anInt8757 = local59;
			this.anInt8749 = local25;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)V")
	private void method7172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 > arg0 ? arg2 : arg0;
		@Pc(23) int local23 = local16 < arg1 ? arg1 : local16;
		@Pc(34) int local34 = arg0 <= arg2 ? arg0 : arg2;
		@Pc(45) int local45 = local34 > arg1 ? arg1 : local34;
		@Pc(50) int local50 = local23 - local45;
		this.anInt8753 = (local45 + local23) / 2;
		if (this.anInt8753 > 0 && this.anInt8753 < 4096) {
			this.anInt8756 = (local50 << 12) / (this.anInt8753 <= 2048 ? this.anInt8753 * 2 : 8192 - (this.anInt8753 * 2));
		} else {
			this.anInt8756 = 0;
		}
		if (local50 <= 0) {
			this.anInt8754 = 0;
			return;
		}
		@Pc(103) int local103 = (local23 - arg2 << 12) / local50;
		@Pc(112) int local112 = (local23 - arg0 << 12) / local50;
		@Pc(121) int local121 = (local23 - arg1 << 12) / local50;
		if (local23 == arg2) {
			this.anInt8754 = local45 == arg0 ? local121 + 20480 : -local112 + 4096;
		} else if (local23 == arg0) {
			this.anInt8754 = arg1 == local45 ? local103 + 4096 : -local121 + 12288;
		} else {
			this.anInt8754 = local45 == arg2 ? local112 + 12288 : -local103 + 20480;
		}
		this.anInt8754 /= 6;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(30) int[][] local30 = this.method7700(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static279.anInt4906; local56++) {
				this.method7172(local38[local56], local42[local56], local34[local56]);
				this.anInt8756 += this.anInt8755;
				this.anInt8754 += this.anInt8743;
				this.anInt8753 += this.anInt8750;
				while (this.anInt8754 < 0) {
					this.anInt8754 += 4096;
				}
				while (this.anInt8754 > 4096) {
					this.anInt8754 -= 4096;
				}
				if (this.anInt8756 < 0) {
					this.anInt8756 = 0;
				}
				if (this.anInt8756 > 4096) {
					this.anInt8756 = 4096;
				}
				if (this.anInt8753 < 0) {
					this.anInt8753 = 0;
				}
				if (this.anInt8753 > 4096) {
					this.anInt8753 = 4096;
				}
				this.method7170(this.anInt8753, this.anInt8756, this.anInt8754);
				local46[local56] = this.anInt8749;
				local50[local56] = this.anInt8757;
				local54[local56] = this.anInt8745;
			}
		}
		return local11;
	}
}
