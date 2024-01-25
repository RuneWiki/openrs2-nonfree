import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Lclient!ha;")
	public static Class89 aClass89_2;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public static int anInt4050 = 0;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method3727() {
		Static51.method872(Static242.aClass4_22);
		Static254.anInt4494++;
		if (Static264.aBoolean343 && Static41.aBoolean62) {
			@Pc(34) int local34 = Static311.aClass129_1.method2997();
			@Pc(38) int local38 = Static311.aClass129_1.method2989();
			local34 -= Static371.anInt6283;
			local38 -= Static224.anInt3999;
			if (local34 < Static350.anInt3739) {
				local34 = Static350.anInt3739;
			}
			if (Static108.anInt5289 > local38) {
				local38 = Static108.anInt5289;
			}
			if (Static350.anInt3739 + Static102.aClass4_11.anInt101 < Static242.aClass4_22.anInt101 + local34) {
				local34 = Static350.anInt3739 + Static102.aClass4_11.anInt101 - Static242.aClass4_22.anInt101;
			}
			if (local38 + Static242.aClass4_22.anInt113 > Static108.anInt5289 + Static102.aClass4_11.anInt113) {
				local38 = Static108.anInt5289 + Static102.aClass4_11.anInt113 - Static242.aClass4_22.anInt113;
			}
			@Pc(103) int local103 = local34 + Static102.aClass4_11.anInt53 - Static350.anInt3739;
			@Pc(111) int local111 = local38 + Static102.aClass4_11.anInt78 - Static108.anInt5289;
			@Pc(170) Class2_Sub22 local170;
			if (Static311.aClass129_1.method2992()) {
				if (Static242.aClass4_22.anInt66 < Static254.anInt4494) {
					@Pc(124) int local124 = local34 - Static132.anInt2707;
					@Pc(129) int local129 = local38 - Static324.anInt5552;
					if (Static242.aClass4_22.anInt73 < local124 || local124 < -Static242.aClass4_22.anInt73 || local129 > Static242.aClass4_22.anInt73 || local129 < -Static242.aClass4_22.anInt73) {
						Static115.aBoolean190 = true;
					}
				}
				if (Static242.aClass4_22.anObjectArray22 != null && Static115.aBoolean190) {
					local170 = new Class2_Sub22();
					local170.anInt2778 = local103;
					local170.anInt2776 = local111;
					local170.anObjectArray33 = Static242.aClass4_22.anObjectArray22;
					local170.aClass4_15 = Static242.aClass4_22;
					Static256.method4003(local170);
					return;
				}
			} else {
				if (Static115.aBoolean190) {
					if (Static242.aClass4_22.anObjectArray28 != null) {
						local170 = new Class2_Sub22();
						local170.aClass4_15 = Static242.aClass4_22;
						local170.aClass4_14 = Static18.aClass4_4;
						local170.anInt2776 = local111;
						local170.anInt2778 = local103;
						local170.anObjectArray33 = Static242.aClass4_22.anObjectArray28;
						Static256.method4003(local170);
					}
					if (Static18.aClass4_4 != null && Static45.method774(Static242.aClass4_22) != null) {
						Static142.method2677(Static18.aClass4_4, Static242.aClass4_22);
					}
				} else if ((Static267.anInt4642 == 1 || Static98.method1943()) && Static285.anInt4946 > 2) {
					Static93.method1857(Static324.anInt5552 + Static224.anInt3999, Static132.anInt2707 + Static371.anInt6283);
				} else if (Static318.method4779()) {
					Static93.method1857(Static324.anInt5552 + Static224.anInt3999, Static132.anInt2707 + Static371.anInt6283);
				}
				Static242.aClass4_22 = null;
			}
		} else if (Static254.anInt4494 > 1) {
			Static242.aClass4_22 = null;
		}
	}
}
