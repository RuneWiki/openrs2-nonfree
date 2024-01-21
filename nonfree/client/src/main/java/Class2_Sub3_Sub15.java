import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			for (@Pc(17) int local17 = 0; local17 < Static54.anInt1423; local17++) {
				this.method1620(local17, arg0);
				@Pc(30) int[] local30 = this.method2901(0, Static164.anInt3645);
				local7[local17] = local30[Static180.anInt4026];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V")
	private void method1620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static36.anIntArray74[arg0];
		@Pc(13) int local13 = Static21.anIntArray50[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local5 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static180.anInt4026 = arg0;
			Static164.anInt3645 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static180.anInt4026 = arg1;
			Static164.anInt3645 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static180.anInt4026 = Static54.anInt1423 - arg1;
			Static164.anInt3645 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static164.anInt3645 = Static12.anInt558 - arg1;
			Static180.anInt4026 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static180.anInt4026 = Static54.anInt1423 - arg0;
			Static164.anInt3645 = Static12.anInt558 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static164.anInt3645 = Static12.anInt558 - arg0;
			Static180.anInt4026 = Static54.anInt1423 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static164.anInt3645 = Static12.anInt558 - arg0;
			Static180.anInt4026 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static180.anInt4026 = Static54.anInt1423 - arg0;
			Static164.anInt3645 = arg1;
		}
		Static180.anInt4026 &= Static73.anInt1916;
		Static164.anInt3645 &= Static1.anInt2959;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass12_39.method485(arg0);
		@Pc(20) int[] local20 = local7[2];
		@Pc(24) int[] local24 = local7[0];
		@Pc(28) int[] local28 = local7[1];
		if (super.aClass12_39.aBoolean24) {
			for (@Pc(34) int local34 = 0; local34 < Static54.anInt1423; local34++) {
				this.method1620(local34, arg0);
				@Pc(47) int[][] local47 = this.method2900(Static164.anInt3645, 0);
				local24[local34] = local47[0][Static180.anInt4026];
				local28[local34] = local47[1][Static180.anInt4026];
				local20[local34] = local47[2][Static180.anInt4026];
			}
		}
		return local7;
	}
}
