import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	public static int anInt4414;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_103 = new Class7("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lclient!ag;")
	public static Class4_Sub1 method3635(@OriginalArg(0) int arg0) {
		@Pc(9) Class141[] local9 = Class1_Sub4_Sub10.aClass141Array1;
		synchronized (Class1_Sub4_Sub10.aClass141Array1) {
			@Pc(25) Class4_Sub1 local25;
			if (Class1_Sub4_Sub10.aClass141Array1.length <= arg0 || Class1_Sub4_Sub10.aClass141Array1[arg0].method3354()) {
				local25 = new Class4_Sub1();
				local25.aClass4_Sub5Array1 = new Class4_Sub5[arg0];
				for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
					local25.aClass4_Sub5Array1[local31] = new Class4_Sub5();
				}
			} else {
				local25 = (Class4_Sub1) Class1_Sub4_Sub10.aClass141Array1[arg0].method3359();
				local25.method5737();
				@Pc(58) int local58 = Static455.anIntArray659[arg0]--;
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg6 < 0 || arg5 >= Static195.anInt3537 - 1 || Static118.anInt2419 - 1 <= arg6) {
			return;
		}
		if (client.lb == null) {
			return;
		}
		@Pc(36) Interface5 local36;
		if (arg4 == 0) {
			local36 = (Interface5) Static110.method1983(arg0, arg5, arg6);
			@Pc(42) Interface5 local42 = (Interface5) Static120.method2159(arg0, arg5, arg6);
			if (local36 != null && arg3 != 2) {
				if (local36 instanceof Class31_Sub3_Sub1) {
					((Class31_Sub3_Sub1) local36).aClass92_1.method2311(arg1);
				} else {
					Static26.method558(arg6, arg2, arg0, arg1, arg3, local36.method5176(), arg5, arg4);
				}
			}
			if (local42 != null) {
				if (local42 instanceof Class31_Sub3_Sub1) {
					((Class31_Sub3_Sub1) local42).aClass92_1.method2311(arg1);
					return;
				}
				Static26.method558(arg6, arg2, arg0, arg1, arg3, local42.method5176(), arg5, arg4);
				return;
			}
			return;
		}
		if (arg4 != 1) {
			if (arg4 == 2) {
				local36 = (Interface5) Static357.method4896(arg0, arg5, arg6, ig.class);
				if (local36 == null) {
					return;
				}
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (!(local36 instanceof Class31_Sub2_Sub4)) {
					Static26.method558(arg6, arg2, arg0, arg1, arg3, local36.method5176(), arg5, arg4);
					return;
				}
				((Class31_Sub2_Sub4) local36).aClass92_4.method2311(arg1);
			} else if (arg4 == 3) {
				local36 = (Interface5) Static393.method5258(arg0, arg5, arg6);
				if (local36 != null) {
					if (!(local36 instanceof Class31_Sub1_Sub3)) {
						Static26.method558(arg6, arg2, arg0, arg1, arg3, local36.method5176(), arg5, arg4);
						return;
					}
					((Class31_Sub1_Sub3) local36).aClass92_3.method2311(arg1);
					return;
				}
			}
			return;
		}
		local36 = (Interface5) Static198.method3177(arg0, arg5, arg6);
		if (local36 == null) {
			return;
		}
		if (local36 instanceof Class31_Sub4_Sub1) {
			((Class31_Sub4_Sub1) local36).aClass92_2.method2311(arg1);
			return;
		}
		@Pc(205) int local205 = local36.method5176();
		if (arg3 != 4 && arg3 != 5) {
			if (arg3 != 6) {
				if (arg3 == 7) {
					Static26.method558(arg6, (arg2 + 2 & 0x3) + 4, arg0, arg1, 4, local205, arg5, arg4);
				} else if (arg3 == 8) {
					Static26.method558(arg6, arg2 + 4, arg0, arg1, 4, local205, arg5, arg4);
					Static26.method558(arg6, (arg2 + 2 & 0x3) + 4, arg0, arg1, 4, local205, arg5, arg4);
					return;
				}
				return;
			}
			Static26.method558(arg6, arg2 + 4, arg0, arg1, 4, local205, arg5, arg4);
			return;
		}
		Static26.method558(arg6, arg2, arg0, arg1, 4, local205, arg5, arg4);
		return;
	}

	@OriginalMember(owner = "client!me", name = "i", descriptor = "(I)Z")
	public static boolean method3637() {
		if (Static189.aBoolean208) {
			try {
				if ((Boolean) Static463.method2376("showingVideoAd", Static77.aClass180_1.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!uq;I)V")
	public static void method3638(@OriginalArg(0) Class251 arg0) {
		@Pc(7) Class251 local7 = Static71.method2636(arg0);
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (local7 == null) {
			local18 = Static95.anInt1971;
			local20 = Static34.anInt715;
		} else {
			local18 = local7.anInt6687;
			local20 = local7.anInt6677;
		}
		Static149.method5326(arg0, local20, local18, false);
		Static326.method570(local20, arg0, local18);
	}
}
