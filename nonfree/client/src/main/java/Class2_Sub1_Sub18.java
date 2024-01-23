import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			for (@Pc(25) int local25 = 0; local25 < Static281.anInt5558; local25++) {
				this.method2423(local25, arg0);
				@Pc(39) int[] local39 = this.method4601(Static175.anInt3866, 0);
				local19[local25] = local39[Static173.anInt3819];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
	private void method2423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static234.anIntArray462[arg0];
		@Pc(21) int local21 = Static272.anIntArray521[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local5 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && -2.356194490192345D >= (double) local32) {
			Static175.anInt3866 = arg1;
			Static173.anInt3819 = arg0;
		} else if (-1.5707963267948966D >= (double) local32 && -2.356194490192345D <= (double) local32) {
			Static175.anInt3866 = arg0;
			Static173.anInt3819 = arg1;
		} else if (-0.7853981633974483D >= (double) local32 && (double) local32 >= -1.5707963267948966D) {
			Static173.anInt3819 = Static281.anInt5558 - arg1;
			Static175.anInt3866 = arg0;
		} else if (local32 <= 0.0F && -0.7853981633974483D <= (double) local32) {
			Static175.anInt3866 = Static64.anInt1560 - arg1;
			Static173.anInt3819 = arg0;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static173.anInt3819 = Static281.anInt5558 - arg0;
			Static175.anInt3866 = Static64.anInt1560 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static173.anInt3819 = Static281.anInt5558 - arg1;
			Static175.anInt3866 = Static64.anInt1560 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static173.anInt3819 = arg1;
			Static175.anInt3866 = Static64.anInt1560 - arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static173.anInt3819 = Static281.anInt5558 - arg0;
			Static175.anInt3866 = arg1;
		}
		Static175.anInt3866 &= Static107.anInt2459;
		Static173.anInt3819 &= Static226.anInt6054;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static281.anInt5558; local35++) {
				this.method2423(local35, arg0);
				@Pc(51) int[][] local51 = this.method4600(Static175.anInt3866, 0);
				local25[local35] = local51[0][Static173.anInt3819];
				local29[local35] = local51[1][Static173.anInt3819];
				local33[local35] = local51[2][Static173.anInt3819];
			}
		}
		return local17;
	}
}
