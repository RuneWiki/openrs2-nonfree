import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class7_Sub4_Sub37 extends Class7_Sub4 {

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(III)V")
	private void method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static129.anIntArray375[arg1];
		@Pc(13) int local13 = Static314.anIntArray756[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static259.anInt5015 = arg1;
			Static60.anInt1526 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static60.anInt1526 = arg1;
			Static259.anInt5015 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static60.anInt1526 = arg1;
			Static259.anInt5015 = Static201.anInt4174 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static60.anInt1526 = Static216.anInt4322 - arg0;
			Static259.anInt5015 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static259.anInt5015 = Static201.anInt4174 - arg1;
			Static60.anInt1526 = Static216.anInt4322 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static259.anInt5015 = Static201.anInt4174 - arg0;
			Static60.anInt1526 = Static216.anInt4322 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static259.anInt5015 = arg0;
			Static60.anInt1526 = Static216.anInt4322 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static259.anInt5015 = Static201.anInt4174 - arg1;
			Static60.anInt1526 = arg0;
		}
		Static60.anInt1526 &= Static153.anInt3263;
		Static259.anInt5015 &= Static110.anInt2508;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			for (@Pc(25) int local25 = 0; local25 < Static201.anInt4174; local25++) {
				this.method5533(arg0, local25);
				@Pc(38) int[] local38 = this.method5634(0, Static60.anInt1526);
				local19[local25] = local38[Static259.anInt5015];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static201.anInt4174; local34++) {
				this.method5533(arg0, local34);
				@Pc(47) int[][] local47 = this.method5638(Static60.anInt1526, 0);
				local24[local34] = local47[0][Static259.anInt5015];
				local28[local34] = local47[1][Static259.anInt5015];
				local32[local34] = local47[2][Static259.anInt5015];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}
}
