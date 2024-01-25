import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public static int anInt5558;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString54;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
	public static int anInt5567;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_182 = new Class175("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_184 = new Class92(52, 4);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)Z")
	public static boolean method4489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static79.method1403(arg0, arg1) || Static215.method3448(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static64.method1273(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
	public static void method4490(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		Static157.method2729(arg4, arg0, null, arg3, arg2, -1, arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method4491() {
		try {
			if (Static347.anInt6319 == 1) {
				@Pc(12) int local12 = Static408.aClass3_Sub5_Sub1_118.method3607();
				if (local12 > 0 && Static408.aClass3_Sub5_Sub1_118.method3634()) {
					local12 -= Static80.anInt1719;
					if (local12 < 0) {
						local12 = 0;
					}
					Static408.aClass3_Sub5_Sub1_118.method3610(local12);
					return;
				}
				Static408.aClass3_Sub5_Sub1_118.method3621();
				Static408.aClass3_Sub5_Sub1_118.method3622();
				if (Static27.aClass56_11 == null) {
					Static347.anInt6319 = 0;
				} else {
					Static347.anInt6319 = 2;
				}
				Static185.aClass261_1 = null;
				Static24.aClass3_Sub29_1 = null;
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static408.aClass3_Sub5_Sub1_118.method3621();
			Static347.anInt6319 = 0;
			Static185.aClass261_1 = null;
			Static24.aClass3_Sub29_1 = null;
			Static27.aClass56_11 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!dn;)V")
	public static void method4493(@OriginalArg(1) Class56 arg0) {
		Static97.anInt2135 = arg0.method1368("titlebg");
		Static376.anInt7413 = arg0.method1368("logo");
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public static void method4494() {
		if (Static161.aBoolean265) {
			return;
		}
		Static161.aBoolean265 = true;
		if (Static123.aClass21_Sub1_1.aBoolean72) {
			Static265.aFloat64 = (int) Static265.aFloat64 - 17 & 0xFFFFFFF0;
		} else {
			Static15.aFloat3 += (-12.0F - Static15.aFloat3) / 2.0F;
		}
		Static189.aBoolean300 = true;
	}
}
