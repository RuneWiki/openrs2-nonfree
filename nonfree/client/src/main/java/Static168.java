import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public static int anInt3533;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_38 = new Class230(33, -1);

	@OriginalMember(owner = "client!go", name = "b", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3103(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(15) char local15 = arg0.charAt(local10);
			if (local15 == '<' || local15 == '>') {
				local8 += 3;
			}
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(local6 + local8);
		for (@Pc(41) int local41 = 0; local41 < local6; local41++) {
			@Pc(52) char local52 = arg0.charAt(local41);
			if (local52 == '<') {
				local39.append("<lt>");
			} else if (local52 == '>') {
				local39.append("<gt>");
			} else {
				local39.append(local52);
			}
		}
		return local39.toString();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	public static void method3104(@OriginalArg(0) int arg0) {
		if (Static75.anInt1880 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static148.aString35 == null) {
				Static283.method4874(Static492.aString107, Static239.aString52, Static400.anInt7816);
			} else {
				Static430.method6820(Static400.anInt7816);
			}
		}
		if (arg0 != 13 && Static227.aClass8_1 != null) {
			Static227.aClass8_1.method362();
			Static227.aClass8_1 = null;
		}
		if (arg0 == 3) {
			Static481.method7378(Static342.anInt6992 != Static25.anInt779);
		}
		if (arg0 == 7) {
			Static329.method5689(Static25.anInt773 != Static25.anInt779);
		}
		if (arg0 == 5) {
			if (Static148.aString35 == null) {
				Static25.method906(Static239.aString52, Static492.aString107);
			} else {
				Static398.method6413();
			}
		} else if (arg0 == 6) {
			if (Static148.aString35 == null) {
				Static283.method4874(Static492.aString107, Static239.aString52, Static400.anInt7816);
			} else {
				Static430.method6820(Static400.anInt7816);
			}
		} else if (arg0 == 9) {
			if (Static148.aString35 == null) {
				Static283.method4874(Static492.aString107, Static239.aString52, Static400.anInt7816);
			} else {
				Static430.method6820(Static400.anInt7816);
			}
		} else if (arg0 == 12) {
			if (Static148.aString35 == null) {
				Static25.method906(Static239.aString52, Static492.aString107);
			} else {
				Static398.method6413();
			}
		}
		if (Static517.method7684(Static75.anInt1880)) {
			Static389.aClass254_103.anInt7731 = 2;
			Static434.aClass254_111.anInt7731 = 2;
			Static22.aClass254_10.anInt7731 = 2;
			Static145.aClass254_49.anInt7731 = 2;
			Static497.aClass254_125.anInt7731 = 2;
			Static437.aClass254_115.anInt7731 = 2;
			Static188.aClass254_61.anInt7731 = 2;
		}
		if (Static517.method7684(arg0)) {
			Static432.anInt5801 = 0;
			Static427.anInt9469 = 0;
			Static37.anInt1043 = 0;
			Static190.anInt3764 = 1;
			Static299.anInt6050 = 1;
			Static348.method2213(true);
			Static389.aClass254_103.anInt7731 = 1;
			Static434.aClass254_111.anInt7731 = 1;
			Static22.aClass254_10.anInt7731 = 1;
			Static145.aClass254_49.anInt7731 = 1;
			Static497.aClass254_125.anInt7731 = 1;
			Static437.aClass254_115.anInt7731 = 1;
			Static188.aClass254_61.anInt7731 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static366.method6021();
		}
		@Pc(215) boolean local215 = arg0 == 2 || Static211.method3722(arg0) || Static159.method3027(arg0);
		@Pc(230) boolean local230 = Static75.anInt1880 == 2 || Static211.method3722(Static75.anInt1880) || Static159.method3027(Static75.anInt1880);
		if (local215 != local230) {
			if (local215) {
				Static509.anInt9416 = Static453.anInt8597;
				if (Static455.aClass3_Sub27_Sub1_1.anInt4806 == 0) {
					Static314.method5271();
				} else {
					Static442.method6913(Static453.anInt8597, Static302.aClass254_86, Static455.aClass3_Sub27_Sub1_1.anInt4806);
				}
				Static122.aClass289_2.method7096(false);
			} else {
				Static314.method5271();
				Static122.aClass289_2.method7096(true);
			}
		}
		if (Static517.method7684(arg0) || arg0 == 13) {
			Static546.aClass15_16.method5276();
		}
		Static75.anInt1880 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public static void method3106() {
		Static592.aClass12_1.method2856();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static142.aLongArray8[local8] = 0L;
		}
		for (@Pc(19) int local19 = 0; local19 < 32; local19++) {
			Static118.aLongArray17[local19] = 0L;
		}
		Static479.anInt8967 = 0;
	}
}
