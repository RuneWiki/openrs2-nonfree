import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class5_Sub1_Sub12 extends Class5_Sub1 {

	@OriginalMember(owner = "client!go", name = "F", descriptor = "I")
	private int anInt3335;

	@OriginalMember(owner = "client!go", name = "I", descriptor = "I")
	private int anInt3338;

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	private int anInt3339;

	@OriginalMember(owner = "client!go", name = "O", descriptor = "I")
	private int anInt3342;

	@OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
	private int anInt3344;

	@OriginalMember(owner = "client!go", name = "R", descriptor = "I")
	private int anInt3345;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "I")
	private int anInt3334 = 0;

	@OriginalMember(owner = "client!go", name = "M", descriptor = "I")
	private int anInt3341 = 0;

	@OriginalMember(owner = "client!go", name = "S", descriptor = "I")
	private int anInt3346 = 0;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(29) int[][] local29 = this.method7154(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static147.anInt3075; local55++) {
				this.method2946(local37[local55], local33[local55], local41[local55]);
				this.anInt3342 += this.anInt3346;
				this.anInt3335 += this.anInt3341;
				for (this.anInt3345 += this.anInt3334; this.anInt3345 < 0; this.anInt3345 += 4096) {
				}
				if (this.anInt3335 < 0) {
					this.anInt3335 = 0;
				}
				while (this.anInt3345 > 4096) {
					this.anInt3345 -= 4096;
				}
				if (this.anInt3342 < 0) {
					this.anInt3342 = 0;
				}
				if (this.anInt3335 > 4096) {
					this.anInt3335 = 4096;
				}
				if (this.anInt3342 > 4096) {
					this.anInt3342 = 4096;
				}
				this.method2944(this.anInt3335, this.anInt3345, this.anInt3342);
				local45[local55] = this.anInt3338;
				local49[local55] = this.anInt3344;
				local53[local55] = this.anInt3339;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BIII)V")
	private void method2944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (4096 - -arg0) * arg2 >> 12;
		if (local29 <= 0) {
			this.anInt3338 = this.anInt3344 = this.anInt3339 = arg2;
			return;
		}
		@Pc(52) int local52 = arg1 * 6;
		@Pc(59) int local59 = arg2 + arg2 - local29;
		@Pc(67) int local67 = (local29 - local59 << 12) / local29;
		@Pc(71) int local71 = local52 >> 12;
		@Pc(77) int local77 = local52 - (local71 << 12);
		@Pc(85) int local85 = local67 * local29 >> 12;
		@Pc(91) int local91 = local77 * local85 >> 12;
		@Pc(96) int local96 = local59 + local91;
		@Pc(101) int local101 = local29 - local91;
		if (local71 == 0) {
			this.anInt3344 = local96;
			this.anInt3339 = local59;
			this.anInt3338 = local29;
		} else if (local71 == 1) {
			this.anInt3339 = local59;
			this.anInt3338 = local101;
			this.anInt3344 = local29;
		} else if (local71 == 2) {
			this.anInt3344 = local29;
			this.anInt3339 = local96;
			this.anInt3338 = local59;
		} else if (local71 == 3) {
			this.anInt3344 = local101;
			this.anInt3338 = local59;
			this.anInt3339 = local29;
		} else if (local71 == 4) {
			this.anInt3339 = local29;
			this.anInt3338 = local96;
			this.anInt3344 = local59;
		} else if (local71 == 5) {
			this.anInt3338 = local29;
			this.anInt3344 = local59;
			this.anInt3339 = local101;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3334 = arg1.method4212();
		} else if (arg0 == 1) {
			this.anInt3341 = (arg1.method4196() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3346 = (arg1.method4196() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)V")
	private void method2946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 > arg0 ? arg1 : arg0;
		@Pc(27) int local27 = arg2 <= local16 ? local16 : arg2;
		@Pc(34) int local34 = arg0 <= arg1 ? arg0 : arg1;
		@Pc(41) int local41 = arg2 >= local34 ? local34 : arg2;
		@Pc(45) int local45 = local27 - local41;
		this.anInt3342 = (local41 + local27) / 2;
		if (local45 <= 0) {
			this.anInt3345 = 0;
		} else {
			@Pc(71) int local71 = (local27 - arg1 << 12) / local45;
			@Pc(80) int local80 = (local27 - arg0 << 12) / local45;
			@Pc(89) int local89 = (local27 - arg2 << 12) / local45;
			if (local27 == arg1) {
				this.anInt3345 = arg0 == local41 ? local89 + 20480 : -local80 + 4096;
			} else if (local27 == arg0) {
				this.anInt3345 = local41 == arg2 ? local71 + 4096 : -local89 + 12288;
			} else {
				this.anInt3345 = local41 == arg1 ? local80 + 12288 : -local71 + 20480;
			}
			this.anInt3345 /= 6;
		}
		if (this.anInt3342 > 0 && this.anInt3342 < 4096) {
			this.anInt3335 = (local45 << 12) / (this.anInt3342 > 2048 ? 8192 - (this.anInt3342 * 2) : this.anInt3342 * 2);
		} else {
			this.anInt3335 = 0;
		}
	}
}
