import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "Lclient!sc;")
	private static Class107 aClass107_395 = Static231.method3737(")4a=");

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "Lclient!sc;")
	public static Class107 aClass107_396 = Static231.method3737("<br>");

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
	public static int anInt1412 = 0;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public static void method1119() {
		for (@Pc(10) Class1_Sub24 local10 = (Class1_Sub24) Static86.aClass120_10.method3564(); local10 != null; local10 = (Class1_Sub24) Static86.aClass120_10.method3561()) {
			if (local10.anInt3738 > 0) {
				local10.anInt3738--;
			}
			if (local10.anInt3738 != 0) {
				if (local10.anInt3733 > 0) {
					local10.anInt3733--;
				}
				if (local10.anInt3733 == 0 && local10.anInt3735 >= 1 && local10.anInt3739 >= 1 && local10.anInt3735 <= 102 && local10.anInt3739 <= 102 && (local10.anInt3734 < 0 || Static142.method2363(local10.anInt3734, local10.anInt3742))) {
					Static195.method3187(local10.anInt3739, local10.anInt3735, local10.anInt3734, local10.anInt3736, local10.anInt3737, local10.anInt3742, local10.anInt3730);
					local10.anInt3733 = -1;
					if (local10.anInt3743 == local10.anInt3734 && local10.anInt3743 == -1) {
						local10.method3735();
					} else if (local10.anInt3734 == local10.anInt3743 && local10.anInt3736 == local10.anInt3741 && local10.anInt3731 == local10.anInt3742) {
						local10.method3735();
					}
				}
			} else if (local10.anInt3743 < 0 || Static142.method2363(local10.anInt3743, local10.anInt3731)) {
				Static195.method3187(local10.anInt3739, local10.anInt3735, local10.anInt3743, local10.anInt3741, local10.anInt3737, local10.anInt3731, local10.anInt3730);
				local10.method3735();
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)I")
	public static int method1121(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)Lclient!sc;")
	public static Class107 method1122() {
		@Pc(6) Class107 local6 = Static197.aClass107_1126;
		if (Static88.anInt1920 != 0) {
			local6 = Static209.aClass107_1182;
		}
		return Static149.method2437(new Class107[] { Static60.aClass107_410, local6, Static51.aClass107_824, Static115.method2001(Static141.anInt3124), aClass107_395, Static115.method2001(Static156.anInt3410), Static196.aClass107_1125 });
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V")
	public static void method1123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class86 local8 = Static11.method314(arg1, arg0);
		if (local8 != null && local8.anObjectArray29 != null) {
			@Pc(17) Class1_Sub22 local17 = new Class1_Sub22();
			local17.aClass86_10 = local8;
			local17.anObjectArray33 = local8.anObjectArray29;
			Static60.method1156(local17);
		}
		Static153.anInt3386 = arg0;
		aBoolean124 = true;
		Static172.anInt3729 = arg2;
		Static123.anInt2677 = arg1;
		Static16.method354(local8);
	}
}
