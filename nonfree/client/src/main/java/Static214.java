import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "Lclient!ga;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "Lclient!tb;")
	public static Class189 aClass189_6;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
	public static int anInt4720;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_157 = new Class221(26, 8);

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	public static int anInt4719 = 0;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "J")
	public static long aLong148 = 0L;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
	public static int anInt4721 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!dr;)V")
	public static void method4054(@OriginalArg(0) Class37 arg0) {
		for (@Pc(1) int local1 = Static47.anInt779; local1 < Static32.anInt516; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static344.anInt6692; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static63.anInt1129; local7++) {
					@Pc(16) Class51 local16 = Static196.aClass51ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class1_Sub1 local21 = local16.aClass1_Sub1_2;
						@Pc(24) Class1_Sub1 local24 = local16.aClass1_Sub1_1;
						if (local21 != null && local21.method5759()) {
							Static294.method4906(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5759()) {
								Static294.method4906(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5762(false, local21, 0, 0, 0, arg0);
								local24.method5761();
							}
							local21.method5761();
						}
						for (@Pc(70) Class11 local70 = local16.aClass11_2; local70 != null; local70 = local70.aClass11_1) {
							@Pc(74) Class1_Sub2 local74 = local70.aClass1_Sub2_1;
							if (local74 != null && local74.method5759()) {
								Static294.method4906(arg0, local74, local1, local4, local7, local74.aShort88 + 1 - local74.aShort89, local74.aShort87 - local74.aShort90 + 1);
								local74.method5761();
							}
						}
						@Pc(111) Class1_Sub4 local111 = local16.aClass1_Sub4_1;
						if (local111 != null && local111.method5759()) {
							Static213.method3996(arg0, local111, local1, local4, local7);
							local111.method5761();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Z")
	public static boolean method4055(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!wn;BI)V")
	public static void method4057(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt6915 == arg0 && arg0 != -1) {
			@Pc(14) Class84 local14 = Static91.method1822(arg0);
			@Pc(17) int local17 = local14.anInt2456;
			if (local17 == 1) {
				arg1.anInt6895 = 0;
				arg1.anInt6908 = 0;
				arg1.anInt6904 = 1;
				arg1.anInt6921 = 0;
				arg1.anInt6900 = arg2;
				Static41.method4705(false, arg1.anInt6895, arg1.anInt6888, arg1.anInt6893, local14, arg1.aByte77);
			}
			if (local17 == 2) {
				arg1.anInt6908 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt6915 == -1 || Static91.method1822(arg0).anInt2459 >= Static91.method1822(arg1.anInt6915).anInt2459) {
			arg1.anInt6963 = arg1.anInt6962;
			arg1.anInt6915 = arg0;
			arg1.anInt6908 = 0;
			arg1.anInt6900 = arg2;
			arg1.anInt6921 = 0;
			arg1.anInt6895 = 0;
			arg1.anInt6904 = 1;
			if (arg1.anInt6915 != -1) {
				Static41.method4705(false, arg1.anInt6895, arg1.anInt6888, arg1.anInt6893, Static91.method1822(arg1.anInt6915), arg1.aByte77);
			}
		}
	}
}
