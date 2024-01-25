import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
	public static int anInt5192;

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "Lclient!qw;")
	public static Class302 aClass302_27;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
	public static int anInt5194 = 2;

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
	public static int anInt5197 = 0;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)Lclient!ai;")
	public static Class12 method4467() {
		try {
			return new Class12_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class12) Class.forName("Class12_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class12_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(ZI)I")
	public static int method4468(@OriginalArg(1) int arg0) {
		@Pc(26) byte local26;
		if (arg0 > 12000) {
			Static443.method6043();
			local26 = 4;
		} else if (arg0 > 5000) {
			Static623.method8412();
			local26 = 3;
		} else if (arg0 > 2000) {
			local26 = 2;
			Static386.method5403();
		} else {
			local26 = 1;
			Static677.method9019();
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != 2) {
			Static336.aClass3_Sub41_18.method6705(2, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
			Static168.method2665(false, 2);
		}
		Static219.method3247();
		return local26;
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)V")
	public static void method4469() {
		Static63.method1149(Static336.aClass3_Sub41_18.aClass14_Sub6_1.method2689() == 1);
		Static388.aClass41_2 = Static295.method4342(22050, 0, Static330.aCanvas5, Static566.aClass92_6);
		Static124.method1850(Static102.method8293((Class3_Sub12_Sub3) null));
		Static665.aClass41_3 = Static295.method4342(2048, 1, Static330.aCanvas5, Static566.aClass92_6);
		Static156.aClass3_Sub12_Sub1_1 = new Class3_Sub12_Sub1();
		Static665.aClass41_3.method7708(Static156.aClass3_Sub12_Sub1_1);
		Static33.aClass217_11 = new Class217(22050, Static16.anInt10139);
		Static115.method1733();
	}
}
