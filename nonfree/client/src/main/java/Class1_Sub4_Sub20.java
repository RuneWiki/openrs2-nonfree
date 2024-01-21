import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub4_Sub20 extends Class1_Sub4 {

	@OriginalMember(owner = "client!og", name = "db", descriptor = "I")
	private int anInt3290;

	@OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
	private int anInt3293;

	@OriginalMember(owner = "client!og", name = "jb", descriptor = "I")
	private int anInt3295;

	@OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
	private int anInt3296;

	@OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
	private int anInt3297;

	@OriginalMember(owner = "client!og", name = "qb", descriptor = "I")
	private int anInt3302;

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
	private int anInt3289;

	@OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
	private int anInt3292;

	@OriginalMember(owner = "client!og", name = "tb", descriptor = "I")
	private int anInt3305;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(26) int[][] local26 = this.method3217(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static73.anInt1888; local52++) {
				this.method2309(local34[local52], local38[local52], local30[local52]);
				for (this.anInt3302 += this.anInt3305; this.anInt3302 < 0; this.anInt3302 += 4096) {
				}
				this.anInt3293 += this.anInt3292;
				this.anInt3290 += this.anInt3289;
				while (this.anInt3302 > 4096) {
					this.anInt3302 -= 4096;
				}
				if (this.anInt3293 < 0) {
					this.anInt3293 = 0;
				}
				if (this.anInt3293 > 4096) {
					this.anInt3293 = 4096;
				}
				if (this.anInt3290 < 0) {
					this.anInt3290 = 0;
				}
				if (this.anInt3290 > 4096) {
					this.anInt3290 = 4096;
				}
				this.method2303(this.anInt3293, this.anInt3290, this.anInt3302);
				local42[local52] = this.anInt3296;
				local46[local52] = this.anInt3297;
				local50[local52] = this.anInt3295;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IIII)V")
	private void method2303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25 = arg0 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : arg0 * (arg1 + 4096) >> 12;
		if (local25 <= 0) {
			this.anInt3296 = this.anInt3297 = this.anInt3295 = arg0;
			return;
		}
		@Pc(49) int local49 = arg2 * 6;
		@Pc(57) int local57 = arg0 + arg0 - local25;
		@Pc(61) int local61 = local49 >> 12;
		@Pc(69) int local69 = (local25 - local57 << 12) / local25;
		@Pc(76) int local76 = local49 - (local61 << 12);
		@Pc(84) int local84 = local25 * local69 >> 12;
		@Pc(90) int local90 = local84 * local76 >> 12;
		@Pc(94) int local94 = local90 + local57;
		@Pc(99) int local99 = local25 - local90;
		if (local61 == 0) {
			this.anInt3295 = local57;
			this.anInt3297 = local94;
			this.anInt3296 = local25;
		} else if (local61 == 1) {
			this.anInt3295 = local57;
			this.anInt3296 = local99;
			this.anInt3297 = local25;
		} else if (local61 == 2) {
			this.anInt3295 = local94;
			this.anInt3297 = local25;
			this.anInt3296 = local57;
		} else if (local61 == 3) {
			this.anInt3296 = local57;
			this.anInt3297 = local99;
			this.anInt3295 = local25;
		} else if (local61 == 4) {
			this.anInt3295 = local25;
			this.anInt3296 = local94;
			this.anInt3297 = local57;
		} else if (local61 == 5) {
			this.anInt3296 = local25;
			this.anInt3297 = local57;
			this.anInt3295 = local99;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3305 = arg0.method497();
		} else if (arg1 == 1) {
			this.anInt3289 = (arg0.method548() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3292 = (arg0.method548() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIBI)V")
	private void method2309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg0 >= arg2 ? arg0 : arg2;
		@Pc(28) int local28 = arg1 > local21 ? arg1 : local21;
		@Pc(39) int local39 = arg2 < arg0 ? arg2 : arg0;
		@Pc(46) int local46 = local39 > arg1 ? arg1 : local39;
		this.anInt3293 = (local28 + local46) / 2;
		@Pc(58) int local58 = local28 - local46;
		if (local58 <= 0) {
			return;
		}
		if (this.anInt3293 > 0 && this.anInt3293 < 4096) {
			this.anInt3290 = (local58 << 12) / (this.anInt3293 > 2048 ? 8192 - (this.anInt3293 * 2) : this.anInt3293 * 2);
		}
		@Pc(103) int local103 = (local28 - arg2 << 12) / local58;
		@Pc(112) int local112 = (local28 - arg0 << 12) / local58;
		@Pc(120) int local120 = (local28 - arg1 << 12) / local58;
		if (local28 == arg2) {
			this.anInt3302 = local46 == arg0 ? local120 + 20480 : -local112 + 4096;
		} else if (local28 == arg0) {
			this.anInt3302 = arg1 == local46 ? local103 + 4096 : 12288 - local120;
		} else {
			this.anInt3302 = local46 == arg2 ? local112 + 12288 : -local103 + 20480;
		}
		this.anInt3302 /= 6;
	}
}
