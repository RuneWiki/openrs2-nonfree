import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[[Lclient!mu;")
	public static Class155[][] aClass155ArrayArray1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!lh;")
	public static Class16_Sub1_Sub5_Sub1 aClass16_Sub1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_1 = new Class22(45, 2);

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public static int anInt5 = 0;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	public static int anInt6 = 0;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method1() {
		for (@Pc(14) Class4_Sub9 local14 = (Class4_Sub9) Static115.aClass183_15.method4140(); local14 != null; local14 = (Class4_Sub9) Static115.aClass183_15.method4144()) {
			if (local14.anInt796 == -1) {
				local14.anInt799 = 0;
				if (local14.anInt793 >= 0 && local14.anInt790 >= 0 && Static326.anInt5666 > local14.anInt793 && Static283.anInt5187 > local14.anInt790) {
					Static20.method216(local14);
				}
			} else {
				local14.method5684();
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V")
	public static void method2() {
		Static182.aClass68_19.method1788(5);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method3() {
		Static63.method1142(Static281.aClass247_12);
		Static315.anInt5487++;
		if (Static361.aBoolean570 && Static390.aBoolean584) {
			@Pc(32) int local32 = Static420.aClass80_1.method2234();
			@Pc(36) int local36 = Static420.aClass80_1.method2230();
			local32 -= Static187.anInt3559;
			local36 -= Static452.anInt7359;
			if (local32 < Static455.anInt5535) {
				local32 = Static455.anInt5535;
			}
			if (Static57.aClass247_1.anInt6833 + Static455.anInt5535 < local32 + Static281.aClass247_12.anInt6833) {
				local32 = Static455.anInt5535 + Static57.aClass247_1.anInt6833 - Static281.aClass247_12.anInt6833;
			}
			if (Static373.anInt6383 > local36) {
				local36 = Static373.anInt6383;
			}
			if (local36 + Static281.aClass247_12.anInt6805 > Static57.aClass247_1.anInt6805 + Static373.anInt6383) {
				local36 = Static373.anInt6383 + Static57.aClass247_1.anInt6805 - Static281.aClass247_12.anInt6805;
			}
			@Pc(110) int local110 = local32 + Static57.aClass247_1.anInt6825 - Static455.anInt5535;
			@Pc(118) int local118 = Static57.aClass247_1.anInt6849 + local36 - Static373.anInt6383;
			@Pc(172) Class4_Sub34 local172;
			if (Static420.aClass80_1.method2228()) {
				if (Static315.anInt5487 > Static281.aClass247_12.anInt6786) {
					@Pc(130) int local130 = local32 - Static247.anInt4615;
					@Pc(135) int local135 = local36 - Static374.anInt6394;
					if (Static281.aClass247_12.anInt6795 < local130 || -Static281.aClass247_12.anInt6795 > local130 || Static281.aClass247_12.anInt6795 < local135 || local135 < -Static281.aClass247_12.anInt6795) {
						Static15.aBoolean22 = true;
					}
				}
				if (Static281.aClass247_12.anObjectArray26 != null && Static15.aBoolean22) {
					local172 = new Class4_Sub34();
					local172.anObjectArray4 = Static281.aClass247_12.anObjectArray26;
					local172.anInt5254 = local110;
					local172.anInt5252 = local118;
					local172.aClass247_15 = Static281.aClass247_12;
					Static271.method3894(local172);
					return;
				}
			} else {
				if (Static15.aBoolean22) {
					Static336.method5139();
					if (Static281.aClass247_12.anObjectArray16 != null) {
						local172 = new Class4_Sub34();
						local172.anObjectArray4 = Static281.aClass247_12.anObjectArray16;
						local172.anInt5252 = local118;
						local172.aClass247_14 = Static232.aClass247_9;
						local172.aClass247_15 = Static281.aClass247_12;
						local172.anInt5254 = local110;
						Static271.method3894(local172);
					}
					if (Static232.aClass247_9 != null && Static53.method906(Static281.aClass247_12) != null) {
						Static83.method1512(Static281.aClass247_12, Static232.aClass247_9);
					}
				} else if ((Static64.anInt1361 == 1 || Static158.method2677()) && Static407.anInt6710 > 2) {
					Static102.method1794(Static187.anInt3559 + Static247.anInt4615, Static374.anInt6394 + Static452.anInt7359);
				} else if (Static14.method143()) {
					Static102.method1794(Static187.anInt3559 + Static247.anInt4615, Static374.anInt6394 + Static452.anInt7359);
				}
				Static281.aClass247_12 = null;
			}
		} else if (Static315.anInt5487 > 1) {
			Static281.aClass247_12 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method5() {
		Static429.method5476(Static351.aClass215_81);
		Static3.aClass4_Sub12_Sub1_5.method2551(Static450.method5664());
		Static3.aClass4_Sub12_Sub1_5.method2524(Static141.anInt2881);
		Static3.aClass4_Sub12_Sub1_5.method2524(Static302.anInt5346);
		Static3.aClass4_Sub12_Sub1_5.method2551(Static323.aClass50_Sub1_1.anInt3440);
	}
}
