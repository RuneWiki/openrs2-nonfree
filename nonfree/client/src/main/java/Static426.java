import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
	public static int anInt7374;

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
	public static int anInt7375;

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_74 = new Class70(11, 16);

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(IB)V")
	public static void method5887(@OriginalArg(0) int arg0) {
		if (arg0 == Static216.anInt4135) {
			return;
		}
		if (arg0 == 13) {
			if (Static194.aString33 == null) {
				Static490.method6644(Static184.anInt3253, Static399.aString69, Static157.aString27);
			} else {
				Static375.method5038(Static184.anInt3253);
			}
		}
		if (arg0 != 13 && Static91.aClass149_1 != null) {
			Static91.aClass149_1.method3281();
			Static91.aClass149_1 = null;
		}
		if (arg0 == 3) {
			Static395.method5460(Static69.anInt1393 != Static422.anInt7311);
		}
		if (arg0 == 7) {
			Static401.method5593(Static422.anInt7311 != Static493.anInt8492);
		}
		if (arg0 == 5) {
			if (Static194.aString33 == null) {
				Static569.method7673(Static157.aString27, Static399.aString69);
			} else {
				Static139.method2104();
			}
		} else if (arg0 == 6) {
			if (Static194.aString33 == null) {
				Static490.method6644(Static184.anInt3253, Static399.aString69, Static157.aString27);
			} else {
				Static375.method5038(Static184.anInt3253);
			}
		} else if (arg0 == 9) {
			if (Static194.aString33 == null) {
				Static490.method6644(Static184.anInt3253, Static399.aString69, Static157.aString27);
			} else {
				Static375.method5038(Static184.anInt3253);
			}
		} else if (arg0 == 12) {
			if (Static194.aString33 == null) {
				Static569.method7673(Static157.aString27, Static399.aString69);
			} else {
				Static139.method2104();
			}
		}
		if (Static483.method6541(Static216.anInt4135)) {
			Static462.aClass270_97.anInt7161 = 2;
			Static530.aClass270_111.anInt7161 = 2;
			Static416.aClass270_86.anInt7161 = 2;
			Static82.aClass270_15.anInt7161 = 2;
			Static535.aClass270_112.anInt7161 = 2;
			Static513.aClass270_106.anInt7161 = 2;
			Static498.aClass270_102.anInt7161 = 2;
		}
		if (Static483.method6541(arg0)) {
			Static201.anInt4028 = 1;
			Static336.anInt5682 = 1;
			Static157.anInt2860 = 0;
			Static246.anInt4520 = 0;
			Static2.anInt50 = 0;
			Static507.method7074(true);
			Static462.aClass270_97.anInt7161 = 1;
			Static530.aClass270_111.anInt7161 = 1;
			Static416.aClass270_86.anInt7161 = 1;
			Static82.aClass270_15.anInt7161 = 1;
			Static535.aClass270_112.anInt7161 = 1;
			Static513.aClass270_106.anInt7161 = 1;
			Static498.aClass270_102.anInt7161 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static260.method3769();
		}
		@Pc(228) boolean local228 = arg0 == 2 || Static9.method101(arg0) || Static237.method3602(arg0);
		@Pc(245) boolean local245 = Static216.anInt4135 == 2 || Static9.method101(Static216.anInt4135) || Static237.method3602(Static216.anInt4135);
		if (local228 != local245) {
			if (local228) {
				Static300.anInt5153 = Static529.anInt8893;
				if (Static348.aClass1_Sub30_Sub1_1.anInt4868 == 0) {
					Static55.method1012();
				} else {
					Static404.method5621(Static529.anInt8893, Static358.aClass270_69, Static348.aClass1_Sub30_Sub1_1.anInt4868);
				}
				Static396.aClass9_1.method144(false);
			} else {
				Static55.method1012();
				Static396.aClass9_1.method144(true);
			}
		}
		if (Static483.method6541(arg0) || arg0 == 13) {
			Static16.aClass134_1.method6969();
		}
		Static216.anInt4135 = arg0;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BII)V")
	public static void method5888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(5, arg1);
		local8.method6594();
		local8.anInt8204 = arg0;
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)V")
	public static void method5891() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static227.aBooleanArray6[local7] = false;
		}
		Static581.anInt6126 = 0;
		Static243.anInt4483 = -1;
		Static442.anInt7679 = -1;
		Static340.anInt5707 = 1;
		Static196.anInt3664 = -1;
		Static110.anInt2171 = -1;
		Static336.anInt5683 = 0;
	}
}
