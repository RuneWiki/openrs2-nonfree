import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class4_Sub3_Sub37 extends Class4_Sub3 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			for (@Pc(25) int local25 = 0; local25 < Static134.anInt3188; local25++) {
				this.method3094(local25, arg0);
				@Pc(38) int[] local38 = this.method3149(Static41.anInt1060, 0);
				local11[local25] = local38[Static25.anInt614];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZ)V")
	private void method3094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = Static67.anIntArray170[arg0];
		@Pc(9) int local9 = Static148.anIntArray321[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local5 - 2048), (double) (local9 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static25.anInt614 = arg0;
			Static41.anInt1060 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static41.anInt1060 = arg0;
			Static25.anInt614 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static25.anInt614 = Static134.anInt3188 - arg1;
			Static41.anInt1060 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static25.anInt614 = arg0;
			Static41.anInt1060 = Static61.anInt1639 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static25.anInt614 = Static134.anInt3188 - arg0;
			Static41.anInt1060 = Static61.anInt1639 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static25.anInt614 = Static134.anInt3188 - arg1;
			Static41.anInt1060 = Static61.anInt1639 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static25.anInt614 = arg1;
			Static41.anInt1060 = Static61.anInt1639 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static41.anInt1060 = arg1;
			Static25.anInt614 = Static134.anInt3188 - arg0;
		}
		Static41.anInt1060 &= Static5.anInt216;
		Static25.anInt614 &= Static2.anInt80;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass39_41.method1506(arg0);
		@Pc(15) int[] local15 = local11[0];
		@Pc(19) int[] local19 = local11[1];
		@Pc(23) int[] local23 = local11[2];
		if (super.aClass39_41.aBoolean84) {
			for (@Pc(29) int local29 = 0; local29 < Static134.anInt3188; local29++) {
				this.method3094(local29, arg0);
				@Pc(42) int[][] local42 = this.method3150(0, Static41.anInt1060);
				local15[local29] = local42[0][Static25.anInt614];
				local19[local29] = local42[1][Static25.anInt614];
				local23[local29] = local42[2][Static25.anInt614];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}
}
