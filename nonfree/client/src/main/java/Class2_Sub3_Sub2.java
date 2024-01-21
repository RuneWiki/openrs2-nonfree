import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			super.aBoolean175 = arg1.method2962() == 1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1439(arg0);
		@Pc(20) int[] local20 = local16[0];
		@Pc(24) int[] local24 = local16[1];
		@Pc(28) int[] local28 = local16[2];
		if (super.aClass43_41.aBoolean77) {
			for (@Pc(34) int local34 = 0; local34 < Static53.anInt1184; local34++) {
				this.method185(local34, arg0);
				@Pc(47) int[][] local47 = this.method3017(Static160.anInt3499, 0);
				local20[local34] = local47[0][Static82.anInt1765];
				local24[local34] = local47[1][Static82.anInt1765];
				local28[local34] = local47[2][Static82.anInt1765];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZI)V")
	private void method185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static50.anIntArray106[arg1];
		@Pc(17) int local17 = Static43.anIntArray102[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local17 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static160.anInt3499 = arg1;
			Static82.anInt1765 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static160.anInt3499 = arg0;
			Static82.anInt1765 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static82.anInt1765 = Static53.anInt1184 - arg1;
			Static160.anInt3499 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static82.anInt1765 = arg0;
			Static160.anInt3499 = Static34.anInt889 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static160.anInt3499 = Static34.anInt889 - arg1;
			Static82.anInt1765 = Static53.anInt1184 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static82.anInt1765 = Static53.anInt1184 - arg1;
			Static160.anInt3499 = Static34.anInt889 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static82.anInt1765 = arg1;
			Static160.anInt3499 = Static34.anInt889 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static82.anInt1765 = Static53.anInt1184 - arg0;
			Static160.anInt3499 = arg1;
		}
		Static82.anInt1765 &= Static27.anInt588;
		Static160.anInt3499 &= Static134.anInt2915;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			for (@Pc(22) int local22 = 0; local22 < Static53.anInt1184; local22++) {
				this.method185(local22, arg0);
				@Pc(35) int[] local35 = this.method3011(Static160.anInt3499, 0);
				local7[local22] = local35[Static82.anInt1765];
			}
		}
		return local7;
	}
}
