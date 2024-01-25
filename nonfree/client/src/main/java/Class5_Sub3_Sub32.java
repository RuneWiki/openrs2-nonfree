import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class5_Sub3_Sub32 extends Class5_Sub3 {

	@OriginalMember(owner = "client!th", name = "N", descriptor = "I")
	private int anInt6032;

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
	private int anInt6035;

	@OriginalMember(owner = "client!th", name = "U", descriptor = "I")
	private int anInt6038;

	@OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
	private int anInt6045;

	@OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
	private int anInt6046;

	@OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
	private int anInt6048;

	@OriginalMember(owner = "client!th", name = "V", descriptor = "I")
	private int anInt6039 = 0;

	@OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
	private int anInt6042 = 0;

	@OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
	private int anInt6044 = 0;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(21) int[][] local21 = this.method6023(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static7.anInt129; local47++) {
				this.method5424(local25[local47], local33[local47], local29[local47]);
				this.anInt6035 += this.anInt6042;
				this.anInt6032 += this.anInt6044;
				for (this.anInt6045 += this.anInt6039; this.anInt6045 < 0; this.anInt6045 += 4096) {
				}
				while (this.anInt6045 > 4096) {
					this.anInt6045 -= 4096;
				}
				if (this.anInt6032 < 0) {
					this.anInt6032 = 0;
				}
				if (this.anInt6035 < 0) {
					this.anInt6035 = 0;
				}
				if (this.anInt6032 > 4096) {
					this.anInt6032 = 4096;
				}
				if (this.anInt6035 > 4096) {
					this.anInt6035 = 4096;
				}
				this.method5423(this.anInt6035, this.anInt6045, this.anInt6032);
				local37[local47] = this.anInt6038;
				local41[local47] = this.anInt6048;
				local45[local47] = this.anInt6046;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6039 = arg0.method5066();
		} else if (arg1 == 1) {
			this.anInt6044 = (arg0.method5098() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt6042 = (arg0.method5098() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZI)V")
	private void method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg2 + arg0 - (arg2 * arg0 >> 12);
		if (local33 <= 0) {
			this.anInt6038 = this.anInt6048 = this.anInt6046 = arg0;
			return;
		}
		@Pc(52) int local52 = arg1 * 6;
		@Pc(59) int local59 = arg0 + arg0 - local33;
		@Pc(68) int local68 = (local33 - local59 << 12) / local33;
		@Pc(72) int local72 = local52 >> 12;
		@Pc(79) int local79 = local52 - (local72 << 12);
		@Pc(87) int local87 = local33 * local68 >> 12;
		@Pc(93) int local93 = local87 * local79 >> 12;
		@Pc(97) int local97 = local59 + local93;
		@Pc(101) int local101 = local33 - local93;
		if (local72 == 0) {
			this.anInt6038 = local33;
			this.anInt6046 = local59;
			this.anInt6048 = local97;
		} else if (local72 == 1) {
			this.anInt6046 = local59;
			this.anInt6038 = local101;
			this.anInt6048 = local33;
		} else if (local72 == 2) {
			this.anInt6046 = local97;
			this.anInt6038 = local59;
			this.anInt6048 = local33;
		} else if (local72 == 3) {
			this.anInt6046 = local33;
			this.anInt6038 = local59;
			this.anInt6048 = local101;
		} else if (local72 == 4) {
			this.anInt6046 = local33;
			this.anInt6038 = local97;
			this.anInt6048 = local59;
		} else if (local72 == 5) {
			this.anInt6048 = local59;
			this.anInt6046 = local101;
			this.anInt6038 = local33;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)V")
	private void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 < arg0 ? arg0 : arg2;
		@Pc(23) int local23 = arg2 <= arg0 ? arg2 : arg0;
		@Pc(30) int local30 = arg1 > local16 ? arg1 : local16;
		@Pc(41) int local41 = arg1 < local23 ? arg1 : local23;
		@Pc(46) int local46 = local30 - local41;
		this.anInt6035 = (local41 + local30) / 2;
		if (local46 > 0) {
			@Pc(65) int local65 = (local30 - arg0 << 12) / local46;
			@Pc(74) int local74 = (local30 - arg2 << 12) / local46;
			@Pc(82) int local82 = (local30 - arg1 << 12) / local46;
			if (local30 == arg0) {
				this.anInt6045 = arg2 == local41 ? local82 + 20480 : -local74 + 4096;
			} else if (arg2 == local30) {
				this.anInt6045 = arg1 == local41 ? local65 + 4096 : -local82 + 12288;
			} else {
				this.anInt6045 = arg0 == local41 ? local74 + 12288 : 20480 - local65;
			}
			this.anInt6045 /= 6;
		} else {
			this.anInt6045 = 0;
		}
		if (this.anInt6035 > 0 && this.anInt6035 < 4096) {
			this.anInt6032 = (local46 << 12) / (this.anInt6035 <= 2048 ? this.anInt6035 * 2 : 8192 - (this.anInt6035 * 2));
		} else {
			this.anInt6032 = 0;
		}
	}
}
