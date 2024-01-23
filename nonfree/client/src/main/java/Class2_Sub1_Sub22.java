import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(26) int[] local26 = local17[1];
			@Pc(30) int[] local30 = local17[0];
			@Pc(34) int[] local34 = local17[2];
			for (@Pc(36) int local36 = 0; local36 < Static114.anInt1359; local36++) {
				this.method2956(local36, arg0);
				@Pc(50) int[][] local50 = this.method4937(0, Static44.anInt1072);
				local30[local36] = local50[0][Static122.anInt2600];
				local26[local36] = local50[1][Static122.anInt2600];
				local34[local36] = local50[2][Static122.anInt2600];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			for (@Pc(24) int local24 = 0; local24 < Static114.anInt1359; local24++) {
				this.method2956(local24, arg0);
				@Pc(42) int[] local42 = this.method4946(Static44.anInt1072, 0);
				local17[local24] = local42[Static122.anInt2600];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZ)V")
	private void method2956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static281.anIntArray506[arg0];
		@Pc(18) int local18 = Static234.anIntArray435[arg1];
		@Pc(29) float local29 = (float) Math.atan2((double) (local14 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && -2.356194490192345D >= (double) local29) {
			Static122.anInt2600 = arg0;
			Static44.anInt1072 = arg1;
		} else if (-1.5707963267948966D >= (double) local29 && (double) local29 >= -2.356194490192345D) {
			Static44.anInt1072 = arg0;
			Static122.anInt2600 = arg1;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static122.anInt2600 = Static114.anInt1359 - arg1;
			Static44.anInt1072 = arg0;
		} else if (local29 <= 0.0F && -0.7853981633974483D <= (double) local29) {
			Static44.anInt1072 = Static199.anInt4143 - arg1;
			Static122.anInt2600 = arg0;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static44.anInt1072 = Static199.anInt4143 - arg1;
			Static122.anInt2600 = Static114.anInt1359 - arg0;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static44.anInt1072 = Static199.anInt4143 - arg0;
			Static122.anInt2600 = Static114.anInt1359 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static122.anInt2600 = arg1;
			Static44.anInt1072 = Static199.anInt4143 - arg0;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static44.anInt1072 = arg1;
			Static122.anInt2600 = Static114.anInt1359 - arg0;
		}
		Static44.anInt1072 &= Static39.anInt939;
		Static122.anInt2600 &= Static129.anInt2676;
	}
}
