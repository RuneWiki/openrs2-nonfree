import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
	private int anInt3407;

	@OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
	private int anInt3408;

	@OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
	private int anInt3412;

	@OriginalMember(owner = "client!ni", name = "db", descriptor = "I")
	private int anInt3415;

	@OriginalMember(owner = "client!ni", name = "gb", descriptor = "I")
	private int anInt3417;

	@OriginalMember(owner = "client!ni", name = "nb", descriptor = "I")
	private int anInt3421;

	@OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
	private int anInt3410 = 0;

	@OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
	private int anInt3411 = 0;

	@OriginalMember(owner = "client!ni", name = "cb", descriptor = "I")
	private int anInt3414 = 0;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
	private void method2637(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local35 <= 0) {
			this.anInt3421 = this.anInt3408 = this.anInt3415 = arg1;
			return;
		}
		@Pc(55) int local55 = arg1 + arg1 - local35;
		@Pc(64) int local64 = (local35 - local55 << 12) / local35;
		@Pc(68) int local68 = arg0 * 6;
		@Pc(72) int local72 = local68 >> 12;
		@Pc(78) int local78 = local68 - (local72 << 12);
		@Pc(86) int local86 = local64 * local35 >> 12;
		@Pc(92) int local92 = local78 * local86 >> 12;
		@Pc(96) int local96 = local92 + local55;
		@Pc(101) int local101 = local35 - local92;
		if (local72 == 0) {
			this.anInt3408 = local96;
			this.anInt3421 = local35;
			this.anInt3415 = local55;
		} else if (local72 == 1) {
			this.anInt3421 = local101;
			this.anInt3408 = local35;
			this.anInt3415 = local55;
		} else if (local72 == 2) {
			this.anInt3421 = local55;
			this.anInt3408 = local35;
			this.anInt3415 = local96;
		} else if (local72 == 3) {
			this.anInt3421 = local55;
			this.anInt3408 = local101;
			this.anInt3415 = local35;
		} else if (local72 == 4) {
			this.anInt3415 = local35;
			this.anInt3421 = local96;
			this.anInt3408 = local55;
		} else if (local72 == 5) {
			this.anInt3421 = local35;
			this.anInt3408 = local55;
			this.anInt3415 = local101;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3411 = arg1.method219();
		} else if (arg0 == 1) {
			this.anInt3410 = (arg1.method227() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3414 = (arg1.method227() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIII)V")
	private void method2638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 > arg2 ? arg1 : arg2;
		@Pc(27) int local27 = arg0 <= local16 ? local16 : arg0;
		@Pc(38) int local38 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(49) int local49 = arg0 < local38 ? arg0 : local38;
		this.anInt3412 = (local49 + local27) / 2;
		@Pc(62) int local62 = local27 - local49;
		if (this.anInt3412 > 0 && this.anInt3412 < 4096) {
			this.anInt3417 = (local62 << 12) / (this.anInt3412 <= 2048 ? this.anInt3412 * 2 : 8192 - (this.anInt3412 * 2));
		} else {
			this.anInt3417 = 0;
		}
		if (local62 <= 0) {
			this.anInt3407 = 0;
			return;
		}
		@Pc(121) int local121 = (local27 - arg1 << 12) / local62;
		@Pc(130) int local130 = (local27 - arg0 << 12) / local62;
		@Pc(139) int local139 = (local27 - arg2 << 12) / local62;
		if (local27 == arg1) {
			this.anInt3407 = local49 == arg2 ? local130 + 20480 : -local139 + 4096;
		} else if (local27 == arg2) {
			this.anInt3407 = arg0 == local49 ? local121 + 4096 : -local130 + 12288;
		} else {
			this.anInt3407 = local49 == arg1 ? local139 + 12288 : -local121 + 20480;
		}
		this.anInt3407 /= 6;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(17) int[][] local17 = this.method3557(arg0, 0);
			@Pc(21) int[] local21 = local17[0];
			@Pc(25) int[] local25 = local17[1];
			@Pc(29) int[] local29 = local17[2];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[2];
			@Pc(41) int[] local41 = local7[1];
			for (@Pc(43) int local43 = 0; local43 < Static106.anInt3045; local43++) {
				this.method2638(local29[local43], local21[local43], local25[local43]);
				this.anInt3417 += this.anInt3410;
				if (this.anInt3417 < 0) {
					this.anInt3417 = 0;
				}
				this.anInt3407 += this.anInt3411;
				this.anInt3412 += this.anInt3414;
				if (this.anInt3417 > 4096) {
					this.anInt3417 = 4096;
				}
				while (this.anInt3407 < 0) {
					this.anInt3407 += 4096;
				}
				while (this.anInt3407 > 4096) {
					this.anInt3407 -= 4096;
				}
				if (this.anInt3412 < 0) {
					this.anInt3412 = 0;
				}
				if (this.anInt3412 > 4096) {
					this.anInt3412 = 4096;
				}
				this.method2637(this.anInt3407, this.anInt3412, this.anInt3417);
				local33[local43] = this.anInt3421;
				local41[local43] = this.anInt3408;
				local37[local43] = this.anInt3415;
			}
		}
		return local7;
	}
}
