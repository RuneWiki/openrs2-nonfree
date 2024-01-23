import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public static int anInt2466;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!cn;")
	public static Class30 aClass30_15;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt2465 = -1;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V")
	public static void method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static215.aClass3_Sub26_Sub1_2.method3958(139);
		}
		if (arg1 == 1) {
			Static215.aClass3_Sub26_Sub1_2.method3958(128);
		}
		Static215.aClass3_Sub26_Sub1_2.method3912(++Static272.aByte15);
		Static215.aClass3_Sub26_Sub1_2.method3892(arg2 + Static101.anInt1844);
		Static215.aClass3_Sub26_Sub1_2.method3912(Static95.aBooleanArray39[82] ? 1 : 0);
		Static215.aClass3_Sub26_Sub1_2.method3940(arg0 + Static43.anInt798);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!nc;Z)I")
	public static int method2209(@OriginalArg(0) Class10_Sub5_Sub1 arg0) {
		@Pc(16) int local16 = arg0.anInt3575;
		@Pc(20) Class31 local20 = arg0.method4191();
		if (local20.anInt912 == arg0.anInt5066) {
			local16 = arg0.anInt3591;
		} else if (arg0.anInt5066 == local20.anInt919 || arg0.anInt5066 == local20.anInt910 || local20.anInt885 == arg0.anInt5066 || local20.anInt902 == arg0.anInt5066) {
			local16 = arg0.anInt3578;
		} else if (local20.anInt915 == arg0.anInt5066 || local20.anInt884 == arg0.anInt5066 || local20.anInt906 == arg0.anInt5066 || local20.anInt899 == arg0.anInt5066) {
			local16 = arg0.anInt3577;
		}
		return local16;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)I")
	public static int method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
