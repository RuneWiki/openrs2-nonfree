import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public static int anInt7199 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!et;ILjava/lang/Object;)V")
	public static void method5566(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static435.method5503(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BFFF)I")
	public static int method5567(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local21 && local35 < local21) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local21 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5568(@OriginalArg(1) String arg0) {
		if (Static102.aStringArray8 == null) {
			Static19.method198();
		}
		@Pc(14) String[] local14 = Static113.method2058(arg0, '\n');
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			for (@Pc(24) int local24 = Static93.anInt1881; local24 > 0; local24--) {
				Static102.aStringArray8[local24] = Static102.aStringArray8[local24 - 1];
			}
			Static102.aStringArray8[0] = local14[local20];
			if (Static102.aStringArray8.length - 1 > Static93.anInt1881) {
				if (Static167.anInt3231 > 0) {
					Static167.anInt3231++;
				}
				Static93.anInt1881++;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
	public static boolean method5569(@OriginalArg(0) int arg0) {
		if (arg0 == 49 || arg0 == 51 || arg0 == 16 || arg0 == 4 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 6 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZ)V")
	public static void method5570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(17) int local17 = -arg2;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static332.method4519(Static208.anInt2656, arg2 + arg3, Static354.anInt6186);
		@Pc(36) int local36 = Static332.method4519(Static208.anInt2656, arg3 - arg2, Static354.anInt6186);
		Static251.method3640(local36, arg1, local27, Static96.anIntArrayArray21[arg0]);
		while (local7 < local14) {
			local19 += 2;
			local17 += local19;
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local68 = arg0 - local14;
				local72 = arg0 + local14;
				if (local72 >= Static376.anInt6287 && Static168.anInt3256 >= local68) {
					local90 = Static332.method4519(Static208.anInt2656, local7 + arg3, Static354.anInt6186);
					local99 = Static332.method4519(Static208.anInt2656, arg3 - local7, Static354.anInt6186);
					if (local72 <= Static168.anInt3256) {
						Static251.method3640(local99, arg1, local90, Static96.anIntArrayArray21[local72]);
					}
					if (local68 >= Static376.anInt6287) {
						Static251.method3640(local99, arg1, local90, Static96.anIntArrayArray21[local68]);
					}
				}
			}
			local7++;
			local68 = arg0 - local7;
			local72 = arg0 + local7;
			if (local72 >= Static376.anInt6287 && local68 <= Static168.anInt3256) {
				local90 = Static332.method4519(Static208.anInt2656, arg3 + local14, Static354.anInt6186);
				local99 = Static332.method4519(Static208.anInt2656, arg3 - local14, Static354.anInt6186);
				if (local72 <= Static168.anInt3256) {
					Static251.method3640(local99, arg1, local90, Static96.anIntArrayArray21[local72]);
				}
				if (Static376.anInt6287 <= local68) {
					Static251.method3640(local99, arg1, local90, Static96.anIntArrayArray21[local68]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public static void method5571() {
		Static259.aClass68_26.method1777();
		Static232.aClass68_25.method1777();
		Static384.aClass68_47.method1777();
		Static52.aClass68_4.method1777();
		Static158.aClass68_16.method1777();
	}
}
