import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "[Lclient!hw;")
	public static Class153[] aClass153Array2;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
	public static int anInt5615 = -1;

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
	public static int anInt5619 = 0;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BZ)V")
	public static void method4808() {
		@Pc(14) Class3_Sub27 local14 = Static59.method1040(Static325.aClass20_2, Static296.aClass314_86);
		Static148.method2572(local14);
		for (@Pc(30) Class3_Sub1 local30 = (Class3_Sub1) Static128.aClass25_7.method435(); local30 != null; local30 = (Class3_Sub1) Static128.aClass25_7.method432()) {
			if (!local30.method8683()) {
				local30 = (Class3_Sub1) Static128.aClass25_7.method435();
				if (local30 == null) {
					break;
				}
			}
			if (local30.anInt25 == 0) {
				Static69.method1233(local30, true, true);
			}
		}
		if (Static9.aClass344_1 != null) {
			Static605.method8323(Static9.aClass344_1);
			Static9.aClass344_1 = null;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z")
	public static boolean method4809() {
		return Static169.anInt3281 == 0 ? Static466.aClass3_Sub3_Sub1_3.method165() : true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)V")
	public static void method4811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class3_Sub7_Sub5 local10 = Static138.method2377(9, arg1);
		local10.method1474();
		local10.anInt1720 = arg0;
		local10.anInt1728 = arg2;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IC)Z")
	public static boolean method4812(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static374.method5189(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static20.aCharArray1;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static487.aCharArray12;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(50) char local50 = local42[local44];
				if (arg0 == local50) {
					return true;
				}
			}
			return false;
		}
	}
}
