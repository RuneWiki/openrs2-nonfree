import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class10_Sub2_Sub8 extends Class10_Sub2 {

	@OriginalMember(owner = "client!dv", name = "L", descriptor = "[Lclient!lk;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.aClass20Array1 = new Class20[arg1.method2502()];
			for (@Pc(22) int local22 = 0; local22 < this.aClass20Array1.length; local22++) {
				@Pc(28) int local28 = arg1.method2502();
				if (local28 == 0) {
					this.aClass20Array1[local22] = Static381.method3657(arg1);
				} else if (local28 == 1) {
					this.aClass20Array1[local22] = Static254.method3687(arg1);
				} else if (local28 == 2) {
					this.aClass20Array1[local22] = Static170.method2894(arg1);
				} else if (local28 == 3) {
					this.aClass20Array1[local22] = Static26.method340(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			this.method1601(super.aClass241_41.method5237());
		}
		return local9;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(17) int local17 = Static121.anInt2458;
			@Pc(19) int local19 = Static190.anInt3835;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass102_41.method2565();
			this.method1601(local23);
			for (@Pc(34) int local34 = 0; local34 < Static190.anInt3835; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static121.anInt2458; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([[II)V")
	private void method1601(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static121.anInt2458;
		@Pc(9) int local9 = Static190.anInt3835;
		Static25.method331(arg0);
		Static262.method3768(Static429.anInt7203, Static140.anInt2877);
		if (this.aClass20Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass20Array1.length; local23++) {
			@Pc(30) Class20 local30 = this.aClass20Array1[local23];
			@Pc(33) int local33 = local30.anInt4731;
			@Pc(36) int local36 = local30.anInt4733;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method3816(local7, local9);
				} else {
					local30.method3819(local7, local9);
				}
			} else if (local36 >= 0) {
				local30.method3815(local7, local9);
			}
		}
	}
}
