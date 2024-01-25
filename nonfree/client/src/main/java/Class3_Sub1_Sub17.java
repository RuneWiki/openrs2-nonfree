import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
	private int anInt5025;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
	private int anInt5026;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
	private int anInt5028;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	private int anInt5030;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
	private int anInt5031;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	private int anInt5032;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
	private int anInt5019 = 0;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
	private int anInt5022 = 0;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
	private int anInt5024 = 0;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	private void method4375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local35 <= 0) {
			this.anInt5026 = this.anInt5032 = this.anInt5028 = arg1;
			return;
		}
		@Pc(44) int local44 = arg0 * 6;
		@Pc(51) int local51 = arg1 + arg1 - local35;
		@Pc(59) int local59 = (local35 - local51 << 12) / local35;
		@Pc(63) int local63 = local44 >> 12;
		@Pc(69) int local69 = local44 - (local63 << 12);
		@Pc(77) int local77 = local35 * local59 >> 12;
		@Pc(83) int local83 = local69 * local77 >> 12;
		@Pc(88) int local88 = local51 + local83;
		@Pc(92) int local92 = local35 - local83;
		if (local63 == 0) {
			this.anInt5026 = local35;
			this.anInt5028 = local51;
			this.anInt5032 = local88;
			return;
		}
		if (local63 == 1) {
			this.anInt5032 = local35;
			this.anInt5026 = local92;
			this.anInt5028 = local51;
			return;
		}
		if (local63 == 2) {
			this.anInt5032 = local35;
			this.anInt5028 = local88;
			this.anInt5026 = local51;
			return;
		}
		if (local63 == 3) {
			this.anInt5028 = local35;
			this.anInt5032 = local92;
			this.anInt5026 = local51;
			return;
		}
		if (local63 == 4) {
			this.anInt5032 = local51;
			this.anInt5028 = local35;
			this.anInt5026 = local88;
			return;
		}
		if (local63 == 5) {
			this.anInt5028 = local92;
			this.anInt5032 = local51;
			this.anInt5026 = local35;
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5022 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt5024 = (arg0.method3096() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt5019 = (arg0.method3096() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIB)V")
	private void method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25 = arg2 < arg0 ? arg0 : arg2;
		@Pc(36) int local36 = local25 < arg1 ? arg1 : local25;
		@Pc(47) int local47 = arg2 <= arg0 ? arg2 : arg0;
		@Pc(54) int local54 = local47 > arg1 ? arg1 : local47;
		this.anInt5030 = (local54 + local36) / 2;
		@Pc(66) int local66 = local36 - local54;
		if (local66 <= 0) {
			this.anInt5031 = 0;
		} else {
			@Pc(85) int local85 = (local36 - arg0 << 12) / local66;
			@Pc(94) int local94 = (local36 - arg2 << 12) / local66;
			@Pc(103) int local103 = (local36 - arg1 << 12) / local66;
			if (arg0 == local36) {
				this.anInt5031 = arg2 == local54 ? local103 + 20480 : -local94 + 4096;
			} else if (local36 == arg2) {
				this.anInt5031 = arg1 == local54 ? local85 + 4096 : -local103 + 12288;
			} else {
				this.anInt5031 = local54 == arg0 ? local94 + 12288 : 20480 - local85;
			}
			this.anInt5031 /= 6;
		}
		if (this.anInt5030 > 0 && this.anInt5030 < 4096) {
			this.anInt5025 = (local66 << 12) / (this.anInt5030 <= 2048 ? this.anInt5030 * 2 : 8192 - this.anInt5030 * 2);
		} else {
			this.anInt5025 = 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(27) int[][] local27 = this.method7766(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static206.anInt4182; local53++) {
				this.method4377(local31[local53], local39[local53], local35[local53]);
				this.anInt5025 += this.anInt5024;
				this.anInt5031 += this.anInt5022;
				this.anInt5030 += this.anInt5019;
				while (this.anInt5031 < 0) {
					this.anInt5031 += 4096;
				}
				while (this.anInt5031 > 4096) {
					this.anInt5031 -= 4096;
				}
				if (this.anInt5025 < 0) {
					this.anInt5025 = 0;
				}
				if (this.anInt5025 > 4096) {
					this.anInt5025 = 4096;
				}
				if (this.anInt5030 < 0) {
					this.anInt5030 = 0;
				}
				if (this.anInt5030 > 4096) {
					this.anInt5030 = 4096;
				}
				this.method4375(this.anInt5031, this.anInt5030, this.anInt5025);
				local43[local53] = this.anInt5026;
				local47[local53] = this.anInt5032;
				local51[local53] = this.anInt5028;
			}
		}
		return local17;
	}
}
