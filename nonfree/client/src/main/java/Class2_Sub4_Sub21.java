import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class2_Sub4_Sub21 extends Class2_Sub4 {

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(IBI)V")
	private void method3672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static40.anIntArray173[arg0];
		@Pc(17) int local17 = Static347.anIntArray1193[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static289.anInt5011 = arg1;
			Static182.anInt3878 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static182.anInt3878 = arg1;
			Static289.anInt5011 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static289.anInt5011 = arg0;
			Static182.anInt3878 = Static76.anInt1458 - arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static182.anInt3878 = arg0;
			Static289.anInt5011 = Static193.anInt3629 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static289.anInt5011 = Static193.anInt3629 - arg1;
			Static182.anInt3878 = Static76.anInt1458 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static289.anInt5011 = Static193.anInt3629 - arg0;
			Static182.anInt3878 = Static76.anInt1458 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static182.anInt3878 = arg1;
			Static289.anInt5011 = Static193.anInt3629 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static182.anInt3878 = Static76.anInt1458 - arg0;
			Static289.anInt5011 = arg1;
		}
		Static289.anInt5011 &= Static283.anInt4900;
		Static182.anInt3878 &= Static269.anInt4657;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			for (@Pc(25) int local25 = 0; local25 < Static76.anInt1458; local25++) {
				this.method3672(local25, arg0);
				@Pc(38) int[] local38 = this.method5600(Static289.anInt5011, 0);
				local19[local25] = local38[Static182.anInt3878];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static76.anInt1458; local34++) {
				this.method3672(local34, arg0);
				@Pc(47) int[][] local47 = this.method5591(Static289.anInt5011, 0);
				local24[local34] = local47[0][Static182.anInt3878];
				local28[local34] = local47[1][Static182.anInt3878];
				local32[local34] = local47[2][Static182.anInt3878];
			}
		}
		return local11;
	}
}
