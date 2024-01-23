import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
	private int anInt3571;

	@OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
	private int anInt3573;

	@OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
	private int anInt3576;

	@OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
	private int anInt3577;

	@OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
	private int anInt3579;

	@OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
	private int anInt3583;

	@OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
	private int anInt3578 = 0;

	@OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
	private int anInt3584 = 0;

	@OriginalMember(owner = "client!mj", name = "kb", descriptor = "I")
	private int anInt3587 = 0;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(29) int[][] local29 = this.method4455(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static227.anInt4511; local55++) {
				this.method2879(local41[local55], local33[local55], local37[local55]);
				this.anInt3577 += this.anInt3578;
				this.anInt3579 += this.anInt3584;
				while (this.anInt3577 < 0) {
					this.anInt3577 += 4096;
				}
				this.anInt3573 += this.anInt3587;
				if (this.anInt3579 < 0) {
					this.anInt3579 = 0;
				}
				if (this.anInt3579 > 4096) {
					this.anInt3579 = 4096;
				}
				if (this.anInt3573 < 0) {
					this.anInt3573 = 0;
				}
				if (this.anInt3573 > 4096) {
					this.anInt3573 = 4096;
				}
				while (this.anInt3577 > 4096) {
					this.anInt3577 -= 4096;
				}
				this.method2878(this.anInt3573, this.anInt3577, this.anInt3579);
				local45[local55] = this.anInt3583;
				local49[local55] = this.anInt3571;
				local53[local55] = this.anInt3576;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBII)V")
	private void method2878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : arg2 * (arg0 + 4096) >> 12;
		if (local35 <= 0) {
			this.anInt3583 = this.anInt3571 = this.anInt3576 = arg2;
			return;
		}
		@Pc(44) int local44 = arg1 * 6;
		@Pc(51) int local51 = arg2 + arg2 - local35;
		@Pc(60) int local60 = (local35 - local51 << 12) / local35;
		@Pc(64) int local64 = local44 >> 12;
		@Pc(72) int local72 = local35 * local60 >> 12;
		@Pc(79) int local79 = local44 - (local64 << 12);
		@Pc(85) int local85 = local72 * local79 >> 12;
		@Pc(89) int local89 = local85 + local51;
		@Pc(93) int local93 = local35 - local85;
		if (local64 == 0) {
			this.anInt3576 = local51;
			this.anInt3571 = local89;
			this.anInt3583 = local35;
		} else if (local64 == 1) {
			this.anInt3583 = local93;
			this.anInt3576 = local51;
			this.anInt3571 = local35;
		} else if (local64 == 2) {
			this.anInt3571 = local35;
			this.anInt3576 = local89;
			this.anInt3583 = local51;
		} else if (local64 == 3) {
			this.anInt3583 = local51;
			this.anInt3571 = local93;
			this.anInt3576 = local35;
		} else if (local64 == 4) {
			this.anInt3571 = local51;
			this.anInt3576 = local35;
			this.anInt3583 = local89;
		} else if (local64 == 5) {
			this.anInt3583 = local35;
			this.anInt3571 = local51;
			this.anInt3576 = local93;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZ)V")
	private void method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 < arg2 ? arg2 : arg1;
		@Pc(23) int local23 = arg0 > local12 ? arg0 : local12;
		@Pc(34) int local34 = arg1 > arg2 ? arg2 : arg1;
		@Pc(45) int local45 = local34 <= arg0 ? local34 : arg0;
		@Pc(49) int local49 = local23 - local45;
		if (local49 > 0) {
			@Pc(63) int local63 = (local23 - arg2 << 12) / local49;
			@Pc(72) int local72 = (local23 - arg1 << 12) / local49;
			@Pc(81) int local81 = (local23 - arg0 << 12) / local49;
			if (arg2 == local23) {
				this.anInt3577 = local45 == arg1 ? local81 + 20480 : -local72 + 4096;
			} else if (local23 == arg1) {
				this.anInt3577 = arg0 == local45 ? local63 + 4096 : 12288 - local81;
			} else {
				this.anInt3577 = local45 == arg2 ? local72 + 12288 : -local63 + 20480;
			}
			this.anInt3577 /= 6;
		} else {
			this.anInt3577 = 0;
		}
		this.anInt3579 = (local45 + local23) / 2;
		if (this.anInt3579 > 0 && this.anInt3579 < 4096) {
			this.anInt3573 = (local49 << 12) / (this.anInt3579 <= 2048 ? this.anInt3579 * 2 : 8192 - (this.anInt3579 * 2));
		} else {
			this.anInt3573 = 0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3578 = arg0.method2632();
		} else if (arg1 == 1) {
			this.anInt3587 = (arg0.method2663() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3584 = (arg0.method2663() << 12) / 100;
		}
	}
}
