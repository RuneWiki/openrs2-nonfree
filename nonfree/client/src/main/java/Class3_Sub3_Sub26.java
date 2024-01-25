import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class3_Sub3_Sub26 extends Class3_Sub3 {

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
	private int anInt4464;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
	private int anInt4466;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	private int anInt4469;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
	private int anInt4473;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
	private int anInt4475;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
	private int anInt4477;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
	private int anInt4467 = 0;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
	private int anInt4472 = 0;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	private int anInt4476 = 0;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)V")
	private void method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 >= arg0 ? arg2 : arg0;
		@Pc(19) int local19 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(30) int local30 = arg1 <= local12 ? local12 : arg1;
		@Pc(41) int local41 = local19 <= arg1 ? local19 : arg1;
		@Pc(46) int local46 = local30 - local41;
		this.anInt4477 = (local30 + local41) / 2;
		if (local46 <= 0) {
			this.anInt4466 = 0;
		} else {
			@Pc(69) int local69 = (local30 - arg0 << 12) / local46;
			@Pc(78) int local78 = (local30 - arg2 << 12) / local46;
			@Pc(86) int local86 = (local30 - arg1 << 12) / local46;
			if (local30 == arg0) {
				this.anInt4466 = local41 == arg2 ? local86 + 20480 : -local78 + 4096;
			} else if (arg2 == local30) {
				this.anInt4466 = arg1 == local41 ? local69 + 4096 : -local86 + 12288;
			} else {
				this.anInt4466 = local41 == arg0 ? local78 + 12288 : -local69 + 20480;
			}
			this.anInt4466 /= 6;
		}
		if (this.anInt4477 > 0 && this.anInt4477 < 4096) {
			this.anInt4475 = (local46 << 12) / (this.anInt4477 <= 2048 ? this.anInt4477 * 2 : 8192 - (this.anInt4477 * 2));
		} else {
			this.anInt4475 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4476 = arg0.method3622();
		} else if (arg1 == 1) {
			this.anInt4472 = (arg0.method3621() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt4467 = (arg0.method3621() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(30) int[][] local30 = this.method5729(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static131.anInt2755; local56++) {
				this.method3801(local34[local56], local42[local56], local38[local56]);
				this.anInt4475 += this.anInt4472;
				this.anInt4477 += this.anInt4467;
				for (this.anInt4466 += this.anInt4476; this.anInt4466 < 0; this.anInt4466 += 4096) {
				}
				while (this.anInt4466 > 4096) {
					this.anInt4466 -= 4096;
				}
				if (this.anInt4475 < 0) {
					this.anInt4475 = 0;
				}
				if (this.anInt4477 < 0) {
					this.anInt4477 = 0;
				}
				if (this.anInt4475 > 4096) {
					this.anInt4475 = 4096;
				}
				if (this.anInt4477 > 4096) {
					this.anInt4477 = 4096;
				}
				this.method3802(this.anInt4477, this.anInt4475, this.anInt4466);
				local46[local56] = this.anInt4469;
				local50[local56] = this.anInt4464;
				local54[local56] = this.anInt4473;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZII)V")
	private void method3802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg0 <= 2048 ? arg0 * (arg1 + 4096) >> 12 : arg1 + arg0 - (arg0 * arg1 >> 12);
		if (local29 <= 0) {
			this.anInt4469 = this.anInt4464 = this.anInt4473 = arg0;
			return;
		}
		@Pc(48) int local48 = arg2 * 6;
		@Pc(54) int local54 = arg0 + arg0 - local29;
		@Pc(62) int local62 = (local29 - local54 << 12) / local29;
		@Pc(66) int local66 = local48 >> 12;
		@Pc(72) int local72 = local48 - (local66 << 12);
		@Pc(80) int local80 = local62 * local29 >> 12;
		@Pc(86) int local86 = local72 * local80 >> 12;
		@Pc(90) int local90 = local54 + local86;
		@Pc(95) int local95 = local29 - local86;
		if (local66 == 0) {
			this.anInt4464 = local90;
			this.anInt4473 = local54;
			this.anInt4469 = local29;
		} else if (local66 == 1) {
			this.anInt4473 = local54;
			this.anInt4469 = local95;
			this.anInt4464 = local29;
		} else if (local66 == 2) {
			this.anInt4464 = local29;
			this.anInt4473 = local90;
			this.anInt4469 = local54;
		} else if (local66 == 3) {
			this.anInt4464 = local95;
			this.anInt4469 = local54;
			this.anInt4473 = local29;
		} else if (local66 == 4) {
			this.anInt4469 = local90;
			this.anInt4473 = local29;
			this.anInt4464 = local54;
		} else if (local66 == 5) {
			this.anInt4473 = local95;
			this.anInt4464 = local54;
			this.anInt4469 = local29;
		}
	}
}
