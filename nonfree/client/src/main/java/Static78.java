import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!es", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString72 = "";

	@OriginalMember(owner = "client!es", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString73 = null;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "I")
	public static int anInt1885 = 0;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString74 = "glow1:";

	@OriginalMember(owner = "client!es", name = "F", descriptor = "I")
	public static int anInt1894 = 127;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ne;I)Lclient!ne;")
	public static Class146 method1945(@OriginalArg(0) Class146 arg0) {
		if (arg0.anInt4146 != -1) {
			return Static273.method4632(arg0.anInt4146);
		}
		@Pc(19) int local19 = arg0.anInt4214 >>> 16;
		@Pc(29) Class176 local29 = new Class176(Static198.aClass25_20);
		for (@Pc(34) Class14_Sub27 local34 = (Class14_Sub27) local29.method4615(); local34 != null; local34 = (Class14_Sub27) local29.method4614()) {
			if (local19 == local34.anInt5186) {
				return Static273.method4632((int) local34.aLong217);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZZ)V")
	public static void method1946(@OriginalArg(1) boolean arg0) {
		Static170.anInt3527++;
		Static237.method4153();
		if (arg0) {
			Static339.anInt2492++;
			Static319.method5484();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!e;)V")
	public static void method1947(@OriginalArg(0) Class46 arg0) {
		for (@Pc(1) int local1 = Static154.anInt3269; local1 < Static125.anInt2719; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static233.anInt4556; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static180.anInt3712; local7++) {
					@Pc(16) Class213 local16 = Static98.aClass213ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class10_Sub2 local21 = local16.aClass10_Sub2_2;
						@Pc(24) Class10_Sub2 local24 = local16.aClass10_Sub2_1;
						if (local21 != null && local21.method5339()) {
							Static194.method3672(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5339()) {
								Static194.method3672(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5335(0, arg0, 0, false, local21, 0);
								local24.method5340();
							}
							local21.method5340();
						}
						for (@Pc(70) Class81 local70 = local16.aClass81_4; local70 != null; local70 = local70.aClass81_3) {
							@Pc(74) Class10_Sub3 local74 = local70.aClass10_Sub3_1;
							if (local74 != null && local74.method5339()) {
								Static194.method3672(arg0, local74, local1, local4, local7, local74.aShort80 + 1 - local74.aShort83, local74.aShort81 - local74.aShort82 + 1);
								local74.method5340();
							}
						}
						@Pc(111) Class10_Sub5 local111 = local16.aClass10_Sub5_1;
						if (local111 != null && local111.method5339()) {
							Static284.method4794(arg0, local111, local1, local4, local7);
							local111.method5340();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public static void method1948() {
		Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
		Static30.aClass14_Sub4_Sub2_1.anInt2637 = 0;
		Static129.anInt2792 = 0;
		Static286.anInt5461 = -1;
		Static28.anInt657 = -1;
		Static327.anInt6307 = 0;
		Static81.anInt1990 = 0;
		Static116.anInt2565 = -1;
		Static1.anInt6422 = -1;
		Static88.method2111();
		Static44.method1086();
		for (@Pc(31) int local31 = 0; local31 < Static29.aClass10_Sub3_Sub3_Sub2Array3.length; local31++) {
			if (Static29.aClass10_Sub3_Sub3_Sub2Array3[local31] != null) {
				Static29.aClass10_Sub3_Sub3_Sub2Array3[local31].anInt5921 = -1;
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static266.aClass10_Sub3_Sub3_Sub1Array1.length; local49++) {
			if (Static266.aClass10_Sub3_Sub3_Sub1Array1[local49] != null) {
				Static266.aClass10_Sub3_Sub3_Sub1Array1[local49].anInt5921 = -1;
			}
		}
		Static279.method4727();
		Static205.anInt4115 = 1;
		Static67.method1662(30);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static338.aBooleanArray29[local74] = true;
		}
		Static104.method2276();
	}
}
