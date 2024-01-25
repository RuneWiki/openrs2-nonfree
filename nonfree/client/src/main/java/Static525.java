import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method7325() {
		Static99.aClass223_12.method4941();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method7327() {
		if (Static573.aClass315_9 != Static327.aClass315_8) {
			try {
				Static611.method6758("tbrefresh", Static81.aClient7);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)Lclient!hea;")
	public static Class138 method7330(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static72.aClass138Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!gba;I)V")
	public static void method7331(@OriginalArg(0) Class115 arg0) {
		if (!Static524.aBoolean617) {
			return;
		}
		if (arg0.anObjectArray7 != null) {
			@Pc(14) Class115 local14 = Static279.method4432(Static539.anInt9099, Static143.anInt3245);
			if (local14 != null) {
				@Pc(20) Class4_Sub12 local20 = new Class4_Sub12();
				local20.anObjectArray3 = arg0.anObjectArray7;
				local20.aClass115_4 = local14;
				local20.aClass115_5 = arg0;
				Static205.method3636(local20);
			}
		}
		@Pc(41) Class4_Sub41 local41 = Static128.method2707(Static31.aClass61_6, Class16_Sub3.lb);
		local41.aClass4_Sub9_Sub1_3.method5963(arg0.anInt3464);
		local41.aClass4_Sub9_Sub1_3.method6012(Static143.anInt3245);
		local41.aClass4_Sub9_Sub1_3.method6002(arg0.anInt3510);
		local41.aClass4_Sub9_Sub1_3.method6011(arg0.anInt3517);
		local41.aClass4_Sub9_Sub1_3.method5963(Static539.anInt9099);
		local41.aClass4_Sub9_Sub1_3.method6012(Static209.anInt9662);
		Static551.method7603(local41);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIIZ)V")
	public static void method7333(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static461.method6471(arg3, Static278.aClass7_Sub1Array4.length - 1, arg0, arg1, arg2, 0);
		Static521.aClass4_Sub39_2 = null;
		Static248.anInt4939 = 0;
	}
}
