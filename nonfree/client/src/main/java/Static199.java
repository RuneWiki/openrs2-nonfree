import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!oh;")
	public static Class237 aClass237_56;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_27 = new Class43();

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_50 = new Class71(15, 0);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)[Lclient!uw;")
	public static Class348[] method3711() {
		return new Class348[] { Static613.aClass348_4, Static51.aClass348_1, Static558.aClass348_3 };
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIZILjava/lang/String;Lclient!ha;I)V")
	public static void method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class16 arg5) {
		if (Static640.aClass21_34 == null || Static292.aClass21_9 == null) {
			if (Static630.aClass237_149.method6296(Static384.anInt7466) && Static630.aClass237_149.method6296(Static254.anInt4213)) {
				Static640.aClass21_34 = arg5.method6135(Static647.method3292(Static630.aClass237_149, Static384.anInt7466, 0), true);
				@Pc(32) Class111 local32 = Static647.method3292(Static630.aClass237_149, Static254.anInt4213, 0);
				Static292.aClass21_9 = arg5.method6135(local32, true);
				local32.method3286();
				Static21.aClass21_1 = arg5.method6135(local32, true);
			} else {
				arg5.aa(arg3, arg2, arg0, 20, Static171.anInt4136 | 255 - Static396.anInt9381 << 24, 1);
			}
		}
		if (Static640.aClass21_34 != null && Static292.aClass21_9 != null) {
			@Pc(76) int local76 = (arg0 - Static292.aClass21_9.method5790() * 2) / Static640.aClass21_34.method5790();
			for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
				Static640.aClass21_34.method5796(arg3 + Static292.aClass21_9.method5790() + Static640.aClass21_34.method5790() * local78, arg2);
			}
			Static292.aClass21_9.method5796(arg3, arg2);
			Static21.aClass21_1.method5796(arg3 + arg0 - Static21.aClass21_1.method5790(), arg2);
		}
		Static206.aClass27_20.method6993(arg3 + 3, -1, arg2 - -14, Static220.anInt5056 | 0xFF000000, arg4);
		arg5.aa(arg3, arg2 + 20, arg0, arg1 - 20, Static171.anInt4136 | -Static396.anInt9381 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Z")
	public static boolean method3714() {
		Static48.anInt4222++;
		Static284.aBoolean423 = true;
		return true;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public static void method3715() {
		Static104.anInt2768 = 0;
		Static384.anInt7468 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static121.anInt3161; local16++) {
			@Pc(22) int local22 = Static362.anInt6930 * local16;
			for (@Pc(24) int local24 = 0; local24 < Static362.anInt6930; local24++) {
				@Pc(30) int local30 = local24 + local22;
				Static596.anInterface11Array1[local30].method8359(Static266.anInt5676 * local24, Static332.anInt6574 * local16, Static266.anInt5676, Static332.anInt6574, true);
			}
		}
	}
}
