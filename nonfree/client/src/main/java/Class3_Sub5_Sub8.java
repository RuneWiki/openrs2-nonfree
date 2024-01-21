import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class3_Sub5_Sub8 extends Class3_Sub5 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZI)V")
	private void method864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static94.anIntArray277[arg1];
		@Pc(18) int local18 = Static124.anIntArray355[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local18 - 2048), (double) (local14 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static99.anInt2093 = arg1;
			Static108.anInt2957 = arg0;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static108.anInt2957 = arg1;
			Static99.anInt2093 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static108.anInt2957 = Static104.anInt2195 - arg1;
			Static99.anInt2093 = arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static108.anInt2957 = arg0;
			Static99.anInt2093 = Static88.anInt1834 - arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static108.anInt2957 = Static104.anInt2195 - arg0;
			Static99.anInt2093 = Static88.anInt1834 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static108.anInt2957 = Static104.anInt2195 - arg1;
			Static99.anInt2093 = Static88.anInt1834 - arg0;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static99.anInt2093 = Static88.anInt1834 - arg0;
			Static108.anInt2957 = arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static108.anInt2957 = Static104.anInt2195 - arg0;
			Static99.anInt2093 = arg1;
		}
		Static99.anInt2093 &= Static23.anInt543;
		Static108.anInt2957 &= Static112.anInt2517;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass89_41.method2876(arg0);
		@Pc(20) int[] local20 = local16[0];
		@Pc(24) int[] local24 = local16[1];
		@Pc(28) int[] local28 = local16[2];
		if (super.aClass89_41.aBoolean160) {
			for (@Pc(34) int local34 = 0; local34 < Static104.anInt2195; local34++) {
				this.method864(local34, arg0);
				@Pc(47) int[][] local47 = this.method3163(0, Static99.anInt2093);
				local20[local34] = local47[0][Static108.anInt2957];
				local24[local34] = local47[1][Static108.anInt2957];
				local28[local34] = local47[2][Static108.anInt2957];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			for (@Pc(25) int local25 = 0; local25 < Static104.anInt2195; local25++) {
				this.method864(local25, arg0);
				@Pc(38) int[] local38 = this.method3167(Static99.anInt2093, 0);
				local11[local25] = local38[Static108.anInt2957];
			}
		}
		return local11;
	}
}
