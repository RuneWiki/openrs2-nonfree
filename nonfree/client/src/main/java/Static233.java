import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!sba;")
	public static Class3_Sub7_Sub19 aClass3_Sub7_Sub19_17;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_127 = new Class194(66, 12);

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_5 = new Class215(5, 3);

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[200];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg5 < 1 || arg4 > Static399.anInt7121 - 2 || arg5 > Static24.anInt345 - 2) {
			return;
		}
		@Pc(23) int local23 = arg2;
		if (arg2 < 3 && Static97.method1657(arg5, arg4)) {
			local23 = arg2 + 1;
		}
		if (Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 0 && !Static168.method2814(arg5, local23, Static282.anInt5422, arg4)) {
			return;
		}
		if (Static567.aClass351ArrayArrayArray4 == null) {
			return;
		}
		Static206.aClass83_Sub1_2.method7821(arg4, arg2, arg6, Static266.aClass82_8, Static174.aClass237Array1[arg2], arg5);
		if (arg1 >= 0) {
			@Pc(66) int local66 = Static32.aClass3_Sub41_3.aClass7_Sub29_1.method8579();
			Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub29_1);
			Static206.aClass83_Sub1_2.method7817(arg2, arg4, local23, arg5, Static266.aClass82_8, arg3, arg1, Static174.aClass237Array1[arg2], arg7, arg0);
			Static32.aClass3_Sub41_3.method6773(local66, Static32.aClass3_Sub41_3.aClass7_Sub29_1);
		}
	}
}
