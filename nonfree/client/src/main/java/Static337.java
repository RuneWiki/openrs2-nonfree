import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qt", name = "H", descriptor = "Lclient!al;")
	public static Class11 aClass11_2;

	@OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
	public static int anInt5499;

	@OriginalMember(owner = "client!qt", name = "E", descriptor = "I")
	public static int anInt5497 = 104;

	@OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
	public static int anInt5501 = 0;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(B)V")
	public static void method4455() {
		Static448.method5935(Static144.aClass146_43);
		Static247.aClass4_Sub9_Sub2_2.method4999(0);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIZI)I")
	public static int method4457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg1;
		} else if (local12 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZZ)V")
	public static void method4458(@OriginalArg(1) boolean arg0) {
		for (@Pc(15) Class4_Sub22 local15 = (Class4_Sub22) Static125.aClass244_10.method5263(); local15 != null; local15 = (Class4_Sub22) Static125.aClass244_10.method5271()) {
			if (local15.aClass4_Sub14_Sub4_2 != null) {
				Static406.aClass4_Sub14_Sub2_2.method2420(local15.aClass4_Sub14_Sub4_2);
				local15.aClass4_Sub14_Sub4_2 = null;
			}
			if (local15.aClass4_Sub14_Sub4_3 != null) {
				Static406.aClass4_Sub14_Sub2_2.method2420(local15.aClass4_Sub14_Sub4_3);
				local15.aClass4_Sub14_Sub4_3 = null;
			}
			local15.method6059();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class4_Sub22 local54 = (Class4_Sub22) Static273.aClass244_23.method5263(); local54 != null; local54 = (Class4_Sub22) Static273.aClass244_23.method5271()) {
			if (local54.aClass4_Sub14_Sub4_2 != null) {
				Static406.aClass4_Sub14_Sub2_2.method2420(local54.aClass4_Sub14_Sub4_2);
				local54.aClass4_Sub14_Sub4_2 = null;
			}
			local54.method6059();
		}
		for (@Pc(81) Class4_Sub22 local81 = (Class4_Sub22) Static381.aClass67_4.method1428(); local81 != null; local81 = (Class4_Sub22) Static381.aClass67_4.method1424()) {
			if (local81.aClass4_Sub14_Sub4_2 != null) {
				Static406.aClass4_Sub14_Sub2_2.method2420(local81.aClass4_Sub14_Sub4_2);
				local81.aClass4_Sub14_Sub4_2 = null;
			}
			local81.method6059();
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(III)Z")
	public static boolean method4459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static382.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local7 == -Static125.anInt2196) {
			return false;
		} else if (local7 == Static125.anInt2196) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static145.anInt2581;
			@Pc(26) int local26 = arg2 << Static145.anInt2581;
			if (Static183.method2543(local22 + 1, Static278.aClass41Array3[arg0].l(arg1, arg2), local26 + 1) && Static183.method2543(local22 + Static416.anInt7020 - 1, Static278.aClass41Array3[arg0].l(arg1 + 1, arg2), local26 + 1) && Static183.method2543(local22 + Static416.anInt7020 - 1, Static278.aClass41Array3[arg0].l(arg1 + 1, arg2 + 1), local26 + Static416.anInt7020 - 1) && Static183.method2543(local22 + 1, Static278.aClass41Array3[arg0].l(arg1, arg2 + 1), local26 + Static416.anInt7020 - 1) && Static183.method2543(local22 + Static390.anInt7654, Static278.aClass41Array3[arg0].l(arg1, arg2), local26 + 1) && Static183.method2543(local22 + Static416.anInt7020 - 1, Static278.aClass41Array3[arg0].l(arg1 + 1, arg2), local26 + Static390.anInt7654) && Static183.method2543(local22 + Static390.anInt7654, Static278.aClass41Array3[arg0].l(arg1, arg2 + 1), local26 + Static416.anInt7020 - 1) && Static183.method2543(local22 + Static416.anInt7020 - 1, Static278.aClass41Array3[arg0].l(arg1, arg2), local26 + Static390.anInt7654) && Static183.method2543(local22 + Static390.anInt7654, Static278.aClass41Array3[arg0].l(arg1, arg2), local26 + Static390.anInt7654)) {
				Static382.anIntArrayArrayArray8[arg0][arg1][arg2] = Static125.anInt2196;
				return true;
			} else {
				Static382.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static125.anInt2196;
				return false;
			}
		}
	}
}
