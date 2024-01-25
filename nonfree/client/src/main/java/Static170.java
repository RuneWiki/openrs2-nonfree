import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!il", name = "i", descriptor = "I")
	public static int anInt3039;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	public static int anInt3035 = 0;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public static int anInt3041 = 765;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Lclient!kg;")
	public static Class47_Sub4 method2638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_Sub4_1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!qa;ILclient!oa;IZIZ)V")
	public static void method2641(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg4) {
			Static287.aClass78_17.method6003((Static403.anInt7142 - Static287.aClass78_17.ja()) / 2, (Static324.anInt5725 - Static287.aClass78_17.JA()) / 2);
			Static403.aClass78_21.method6003((Static403.anInt7142 - Static403.aClass78_21.ja()) / 2, 18);
		}
		arg2.method5840(arg5, Static324.anInt5725 / 2 - 26, -1, Static403.anInt7142 / 2, (Static325.aClass169_2 == Static392.aClass169_3 ? Static401.aClass96_101 : Static153.aClass96_76).method1935(Static389.anInt7061));
		@Pc(58) int local58 = Static324.anInt5725 / 2 - 18;
		arg0.method4639(Static403.anInt7142 / 2 - 152, local58, 304, 34, arg1, 0);
		arg0.method4639(Static403.anInt7142 / 2 - 151, local58 + 1, 302, 32, 0, 0);
		arg0.NA(Static403.anInt7142 / 2 - 150, local58 - -2, Static75.anInt1425 * 3, 30, arg3, 0);
		arg0.NA(Static75.anInt1425 * 3 + Static403.anInt7142 / 2 - 150, local58 + 2, 300 - Static75.anInt1425 * 3, 30, 0, 0);
		arg2.method5840(arg5, Static324.anInt5725 / 2 + 4, -1, Static403.anInt7142 / 2, Static159.aString45);
	}
}
