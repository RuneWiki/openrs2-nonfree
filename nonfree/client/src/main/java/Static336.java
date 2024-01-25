import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!pv;")
	public static Class3_Sub7_Sub18 aClass3_Sub7_Sub18_3;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public static int anInt5402;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	public static int anInt5407;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
	public static void method4832(@OriginalArg(0) int arg0) {
		if (Static98.anInt2140 == arg0) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static568.method7371();
		}
		if (arg0 != 14 && Static35.aClass118_1 != null) {
			Static35.aClass118_1.method7800();
			Static35.aClass118_1 = null;
		}
		if (arg0 == 3) {
			Static724.method9566(Static29.aClass378_1.anInt10093 != Static589.anInt8959);
		}
		if (arg0 == 7) {
			Static270.method3825(Static589.anInt8959 != Static29.aClass378_1.anInt10087);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static305.method4511();
		} else if (arg0 == 6 || arg0 == 9 && Static98.anInt2140 != 10) {
			Static568.method7371();
		}
		if (Static664.method8658(110, Static98.anInt2140)) {
			Static546.aClass182_105.anInt4310 = 2;
			Static677.aClass182_125.anInt4310 = 2;
			Static153.aClass182_40.anInt4310 = 2;
			Static120.aClass182_35.anInt4310 = 2;
			Static137.aClass182_36.anInt4310 = 2;
			Static236.aClass182_63.anInt4310 = 2;
			Static210.aClass182_56.anInt4310 = 2;
		}
		if (Static664.method8658(106, arg0)) {
			Static20.anInt696 = 1;
			Static335.anInt5388 = 1;
			Static294.anInt4507 = 0;
			Static104.anInt2258 = 0;
			Static208.anInt3445 = 0;
			Static588.method7597(true);
			Static546.aClass182_105.anInt4310 = 1;
			Static677.aClass182_125.anInt4310 = 1;
			Static153.aClass182_40.anInt4310 = 1;
			Static120.aClass182_35.anInt4310 = 1;
			Static137.aClass182_36.anInt4310 = 1;
			Static236.aClass182_63.anInt4310 = 1;
			Static210.aClass182_56.anInt4310 = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static147.method2484();
		}
		@Pc(234) boolean local234 = arg0 == 2 || Static461.method6259(arg0) || Static14.method502(arg0);
		@Pc(256) boolean local256 = Static98.anInt2140 == 2 || Static461.method6259(Static98.anInt2140) || Static14.method502(Static98.anInt2140);
		if (local256 != local234) {
			if (local234) {
				Static659.anInt10097 = Static480.anInt7532;
				if (Static580.aClass3_Sub22_24.aClass21_Sub16_3.method5404() == 0) {
					Static66.method1494();
				} else {
					Static447.method5903(Static580.aClass3_Sub22_24.aClass21_Sub16_3.method5404(), Static480.anInt7532, Static185.aClass182_50);
					Static217.method3246();
				}
				Static294.aClass349_3.method7769(false);
			} else {
				Static66.method1494();
				Static294.aClass349_3.method7769(true);
			}
		}
		if (Static664.method8658(116, arg0) || arg0 == 14 || arg0 == 15) {
			Static153.aClass22_4.method9389();
		}
		Static98.anInt2140 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)Z")
	public static boolean method4834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
