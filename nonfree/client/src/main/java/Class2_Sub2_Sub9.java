import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cq", name = "L", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!cq", name = "U", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!cq", name = "ab", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!cq", name = "db", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!cq", name = "R", descriptor = "I")
	private int anInt1026 = 0;

	@OriginalMember(owner = "client!cq", name = "V", descriptor = "I")
	private int anInt1030 = 0;

	@OriginalMember(owner = "client!cq", name = "T", descriptor = "I")
	private int anInt1028 = 0;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(21) int[][] local21 = this.method5887(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static339.anInt6735; local47++) {
				this.method1122(local29[local47], local25[local47], local33[local47]);
				this.anInt1035 += this.anInt1030;
				this.anInt1020 += this.anInt1026;
				this.anInt1023 += this.anInt1028;
				while (this.anInt1020 < 0) {
					this.anInt1020 += 4096;
				}
				while (this.anInt1020 > 4096) {
					this.anInt1020 -= 4096;
				}
				if (this.anInt1035 < 0) {
					this.anInt1035 = 0;
				}
				if (this.anInt1035 > 4096) {
					this.anInt1035 = 4096;
				}
				if (this.anInt1023 < 0) {
					this.anInt1023 = 0;
				}
				if (this.anInt1023 > 4096) {
					this.anInt1023 = 4096;
				}
				this.method1124(this.anInt1020, this.anInt1035, this.anInt1023);
				local37[local47] = this.anInt1029;
				local41[local47] = this.anInt1022;
				local45[local47] = this.anInt1033;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt1026 = arg1.method4460();
		} else if (arg0 == 1) {
			this.anInt1030 = (arg1.method4436() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt1028 = (arg1.method4436() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIII)V")
	private void method1122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 >= arg1 ? arg0 : arg1;
		@Pc(23) int local23 = local16 >= arg2 ? local16 : arg2;
		@Pc(34) int local34 = arg0 <= arg1 ? arg0 : arg1;
		@Pc(45) int local45 = arg2 >= local34 ? local34 : arg2;
		@Pc(50) int local50 = local23 - local45;
		this.anInt1023 = (local23 + local45) / 2;
		if (this.anInt1023 > 0 && this.anInt1023 < 4096) {
			this.anInt1035 = (local50 << 12) / (this.anInt1023 > 2048 ? 8192 - this.anInt1023 * 2 : this.anInt1023 * 2);
		} else {
			this.anInt1035 = 0;
		}
		if (local50 <= 0) {
			this.anInt1020 = 0;
			return;
		}
		@Pc(105) int local105 = (local23 - arg1 << 12) / local50;
		@Pc(114) int local114 = (local23 - arg0 << 12) / local50;
		@Pc(123) int local123 = (local23 - arg2 << 12) / local50;
		if (local23 == arg1) {
			this.anInt1020 = local45 == arg0 ? local123 + 20480 : 4096 - local114;
		} else if (arg0 == local23) {
			this.anInt1020 = local45 == arg2 ? local105 + 4096 : -local123 + 12288;
		} else {
			this.anInt1020 = local45 == arg1 ? local114 + 12288 : 20480 - local105;
		}
		this.anInt1020 /= 6;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)V")
	private void method1124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg2 * (arg1 + 4096) >> 12;
		if (local35 <= 0) {
			this.anInt1029 = this.anInt1022 = this.anInt1033 = arg2;
			return;
		}
		@Pc(44) int local44 = arg0 * 6;
		@Pc(50) int local50 = arg2 + arg2 - local35;
		@Pc(58) int local58 = (local35 - local50 << 12) / local35;
		@Pc(62) int local62 = local44 >> 12;
		@Pc(69) int local69 = local44 - (local62 << 12);
		@Pc(77) int local77 = local35 * local58 >> 12;
		@Pc(83) int local83 = local77 * local69 >> 12;
		@Pc(87) int local87 = local83 + local50;
		@Pc(91) int local91 = local35 - local83;
		if (local62 == 0) {
			this.anInt1022 = local87;
			this.anInt1033 = local50;
			this.anInt1029 = local35;
			return;
		}
		if (local62 == 1) {
			this.anInt1029 = local91;
			this.anInt1033 = local50;
			this.anInt1022 = local35;
			return;
		}
		if (local62 == 2) {
			this.anInt1022 = local35;
			this.anInt1029 = local50;
			this.anInt1033 = local87;
			return;
		}
		if (local62 == 3) {
			this.anInt1033 = local35;
			this.anInt1022 = local91;
			this.anInt1029 = local50;
			return;
		}
		if (local62 == 4) {
			this.anInt1029 = local87;
			this.anInt1033 = local35;
			this.anInt1022 = local50;
			return;
		}
		if (local62 == 5) {
			this.anInt1033 = local91;
			this.anInt1029 = local35;
			this.anInt1022 = local50;
			return;
		}
	}
}
