import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			for (@Pc(22) int local22 = 0; local22 < Static110.anInt2825; local22++) {
				this.method2276(arg0, local22);
				@Pc(35) int[] local35 = this.method3130(0, Static66.anInt1749);
				local16[local22] = local35[Static30.anInt2833];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass77_39.method2617(arg0);
		@Pc(15) int[] local15 = local7[1];
		@Pc(19) int[] local19 = local7[0];
		@Pc(23) int[] local23 = local7[2];
		if (super.aClass77_39.aBoolean193) {
			for (@Pc(34) int local34 = 0; local34 < Static110.anInt2825; local34++) {
				this.method2276(arg0, local34);
				@Pc(47) int[][] local47 = this.method3118(Static66.anInt1749, 0);
				local19[local34] = local47[0][Static30.anInt2833];
				local15[local34] = local47[1][Static30.anInt2833];
				local23[local34] = local47[2][Static30.anInt2833];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V")
	private void method2276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static86.anIntArray294[arg1];
		@Pc(13) int local13 = Static37.anIntArray125[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static66.anInt1749 = arg0;
			Static30.anInt2833 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static66.anInt1749 = arg1;
			Static30.anInt2833 = arg0;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static30.anInt2833 = Static110.anInt2825 - arg0;
			Static66.anInt1749 = arg1;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static66.anInt1749 = Static102.anInt2580 - arg0;
			Static30.anInt2833 = arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static66.anInt1749 = Static102.anInt2580 - arg0;
			Static30.anInt2833 = Static110.anInt2825 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static30.anInt2833 = Static110.anInt2825 - arg0;
			Static66.anInt1749 = Static102.anInt2580 - arg1;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static30.anInt2833 = arg0;
			Static66.anInt1749 = Static102.anInt2580 - arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static66.anInt1749 = arg0;
			Static30.anInt2833 = Static110.anInt2825 - arg1;
		}
		Static66.anInt1749 &= Static64.anInt1680;
		Static30.anInt2833 &= Static99.anInt2523;
	}
}
