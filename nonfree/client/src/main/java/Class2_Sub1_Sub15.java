import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass11_39.method511(arg0);
		@Pc(20) int[] local20 = local16[2];
		@Pc(24) int[] local24 = local16[0];
		@Pc(28) int[] local28 = local16[1];
		if (super.aClass11_39.aBoolean37) {
			for (@Pc(34) int local34 = 0; local34 < Static129.anInt3118; local34++) {
				this.method1452(arg0, local34);
				@Pc(47) int[][] local47 = this.method2991(Static13.anInt385, 0);
				local24[local34] = local47[0][Static117.anInt2917];
				local28[local34] = local47[1][Static117.anInt2917];
				local20[local34] = local47[2][Static117.anInt2917];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZ)V")
	private void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static163.anIntArray577[arg1];
		@Pc(13) int local13 = Static166.anIntArray619[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static117.anInt2917 = arg1;
			Static13.anInt385 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static117.anInt2917 = arg0;
			Static13.anInt385 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static13.anInt385 = arg1;
			Static117.anInt2917 = Static129.anInt3118 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static117.anInt2917 = arg1;
			Static13.anInt385 = Static90.anInt2352 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static13.anInt385 = Static90.anInt2352 - arg0;
			Static117.anInt2917 = Static129.anInt3118 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static13.anInt385 = Static90.anInt2352 - arg1;
			Static117.anInt2917 = Static129.anInt3118 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static13.anInt385 = Static90.anInt2352 - arg1;
			Static117.anInt2917 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static13.anInt385 = arg0;
			Static117.anInt2917 = Static129.anInt3118 - arg1;
		}
		Static117.anInt2917 &= Static8.anInt230;
		Static13.anInt385 &= Static78.anInt2044;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			for (@Pc(25) int local25 = 0; local25 < Static129.anInt3118; local25++) {
				this.method1452(arg0, local25);
				@Pc(40) int[] local40 = this.method2980(0, Static13.anInt385);
				local19[local25] = local40[Static117.anInt2917];
			}
		}
		return local19;
	}
}
