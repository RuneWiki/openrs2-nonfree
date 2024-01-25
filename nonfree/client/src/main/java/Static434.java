import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "Lclient!qg;")
	public static final Class272 aClass272_9 = new Class272("WTWIP", 3);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!rb;[Lclient!eq;)V")
	public static void method6088(@OriginalArg(0) Class41_Sub2 arg0, @OriginalArg(1) Class3_Sub10[] arg1) {
		@Pc(6) int local6;
		if (Static12.aBoolean593) {
			local6 = arg0.method7846(arg1);
			Static511.aClass45_12.method7413(local6, arg1);
		}
		if (Static426.aClass34Array5 == Static68.aClass34Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class41_Sub2_Sub1) {
				local6 = ((Class41_Sub2_Sub1) arg0).aShort147;
				local28 = ((Class41_Sub2_Sub1) arg0).aShort144;
			} else {
				local6 = arg0.anInt9444 >> Static315.anInt5369;
				local28 = arg0.anInt9442 >> Static315.anInt5369;
			}
			Static511.aClass45_12.YA(Static108.aClass34Array6[0].method6530(arg0.anInt9444, arg0.anInt9442), Static66.method1438(local6, local28), Static142.method2762(local6, local28), Static202.method3339(local6, local28));
		}
		@Pc(64) Class41_Sub10 local64 = arg0.method7843(Static511.aClass45_12);
		if (local64 == null) {
			return;
		}
		local64.aClass41_Sub2_1 = arg0;
		if (Static74.aBoolean149) {
			@Pc(73) Class178 local73 = Static212.aClass178_7;
			synchronized (Static212.aClass178_7) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class41_Sub10 local82 = (Class41_Sub10) Static212.aClass178_7.method4168(); local82 != null; local82 = (Class41_Sub10) Static212.aClass178_7.method4165()) {
					if (arg0.anInt9439 >= local82.aClass41_Sub2_1.anInt9439) {
						Static346.method5125(local82, local64);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static212.aClass178_7.method4166(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class41_Sub10 local122 = (Class41_Sub10) Static212.aClass178_7.method4168(); local122 != null; local122 = (Class41_Sub10) Static212.aClass178_7.method4165()) {
			if (arg0.anInt9439 >= local122.aClass41_Sub2_1.anInt9439) {
				Static346.method5125(local122, local64);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static212.aClass178_7.method4166(local64);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZZII)V")
	public static void method6089(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static107.method1896(arg3, 0, arg0, Static563.aClass119_Sub1Array2.length - 1, arg2, arg1);
		Static190.aClass3_Sub38_2 = null;
		Static286.anInt4914 = 0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IILclient!tf;IIZ)V")
	public static void method6090(@OriginalArg(1) int arg0, @OriginalArg(2) Class322 arg1, @OriginalArg(4) int arg2) {
		Static243.method3773((long) 0, arg1, arg0, arg2);
	}
}
