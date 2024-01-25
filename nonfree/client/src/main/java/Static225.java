import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt4808;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public static int anInt4810;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array6;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_43 = new Class77(67, 3);

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	public static int anInt4816 = 0;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Z")
	public static final boolean aBoolean383 = false;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!qa;Lclient!ra;BZIII)V")
	public static void method4065(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static183.aClass84_6.method7487((Static169.anInt3893 - Static183.aClass84_6.EA()) / 2, (Static127.anInt2936 - Static183.aClass84_6.ma()) / 2);
			Static317.aClass84_16.method7487((Static169.anInt3893 - Static317.aClass84_16.EA()) / 2, 18);
		}
		@Pc(41) String local41 = "";
		if (Static293.aClass138_7 == Static468.aClass138_6) {
			local41 = Static198.aClass88_118.method2391(Static345.anInt6495);
		} else if (Static518.aClass138_8 == Static293.aClass138_7) {
			local41 = Static62.aClass88_36.method2391(Static345.anInt6495);
		}
		arg1.method7772(Static127.anInt2936 / 2 - 26, arg3, Static169.anInt3893 / 2, local41, -1);
		@Pc(83) int local83 = Static127.anInt2936 / 2 - 18;
		arg0.method5834(Static169.anInt3893 / 2 - 152, local83, 304, 34, arg4, 0);
		arg0.method5834(Static169.anInt3893 / 2 - 151, local83 + 1, 302, 32, 0, 0);
		arg0.f(Static169.anInt3893 / 2 - 150, local83 + 2, Static203.anInt4533 * 3, 30, arg5, 0);
		arg0.f(Static203.anInt4533 * 3 + Static169.anInt3893 / 2 - 150, local83 + 2, 300 - Static203.anInt4533 * 3, 30, 0, 0);
		arg1.method7772(Static127.anInt2936 / 2 + 4, arg3, Static169.anInt3893 / 2, Static352.aString79, -1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	public static void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass30_Sub3_1 != null) {
			local7.aClass30_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Lclient!oe;")
	public static Class227 method4072(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static80.aClass227Array3[arg0] : null;
	}
}
