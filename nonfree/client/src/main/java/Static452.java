import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
	public static int anInt7231;

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
	public static final int anInt7230 = 1401;

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "F")
	public static float aFloat192 = 0.0F;

	@OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
	public static int anInt7233 = -1;

	@OriginalMember(owner = "client!raa", name = "v", descriptor = "[I")
	public static final int[] anIntArray487 = new int[25];

	@OriginalMember(owner = "client!raa", name = "y", descriptor = "Lclient!rf;")
	public static final Class297 aClass297_2 = new Class297();

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)V")
	public static void method5885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub2_Sub18 local15 = Static508.method6607(arg0, 16);
		local15.method6227();
		local15.anInt7701 = arg1;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZIBILclient!mq;)V")
	public static void method5886(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class12_Sub2_Sub1_Sub4_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray566[0];
		@Pc(15) int local15 = arg2.anIntArray565[0];
		if (local10 < 0 || local10 >= Static281.anInt4822 || local15 < 0 || Static29.anInt491 <= local15 || (arg0 < 0 || Static281.anInt4822 <= arg0 || arg1 < 0 || arg1 >= Static29.anInt491)) {
			return;
		}
		@Pc(77) int local77 = Static101.method1527(0, -4, 0, local15, Static124.anIntArray611, Static176.anIntArray220, local10, 0, 0, arg2.method6777(), Static87.aClass362Array3[arg2.aByte128], true, arg1, arg0);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(87) int local87 = 0; local87 < local77 - 1; local87++) {
				arg2.method4909(Static124.anIntArray611[local87], Static176.anIntArray220[local87], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)Lclient!ks;")
	public static Class200 method5888(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static476.aFloat197 == 3.0D) {
				return Static336.aClass200_7;
			}
			if ((double) Static476.aFloat197 == 4.0D) {
				return Static75.aClass200_1;
			}
			if ((double) Static476.aFloat197 == 6.0D) {
				return Static94.aClass200_2;
			}
			if ((double) Static476.aFloat197 >= 8.0D) {
				return Static212.aClass200_4;
			}
		} else if (arg0 == 1) {
			if ((double) Static476.aFloat197 == 3.0D) {
				return Static94.aClass200_2;
			}
			if ((double) Static476.aFloat197 == 4.0D) {
				return Static212.aClass200_4;
			}
			if ((double) Static476.aFloat197 == 6.0D) {
				return Static343.aClass200_8;
			}
			if ((double) Static476.aFloat197 >= 8.0D) {
				return Static115.aClass200_3;
			}
		} else if (arg0 == 2) {
			if ((double) Static476.aFloat197 == 3.0D) {
				return Static343.aClass200_8;
			}
			if ((double) Static476.aFloat197 == 4.0D) {
				return Static115.aClass200_3;
			}
			if ((double) Static476.aFloat197 == 6.0D) {
				return Static290.aClass200_6;
			}
			if ((double) Static476.aFloat197 >= 8.0D) {
				return Static246.aClass200_5;
			}
		}
		return null;
	}
}
