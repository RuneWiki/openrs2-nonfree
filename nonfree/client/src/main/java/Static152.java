import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!l", name = "f", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	public static int anInt2870;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "Lclient!ie;")
	public static Class78 aClass78_5;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "I")
	public static int anInt2881;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "Lclient!rn;")
	public static Class155 aClass155_63;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "Lclient!dg;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public static int anInt2868 = 0;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	public static int anInt2876 = 0;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "I")
	public static int anInt2882 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)I")
	public static int method2563(@OriginalArg(0) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!ug;)Ljava/lang/String;")
	public static String method2564(@OriginalArg(1) Class3_Sub26 arg0) {
		return Static26.method418(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2566(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static285.anInt5735 >= 100 && !Static179.aBoolean238 || Static285.anInt5735 >= 200) {
			Static199.method3284(Static255.aString185);
			return;
		}
		@Pc(28) String local28 = Static190.method3179(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(34) int local34;
		@Pc(47) String local47;
		@Pc(79) String local79;
		for (local34 = 0; local34 < Static285.anInt5735; local34++) {
			local47 = Static190.method3179(Static286.aStringArray37[local34]);
			if (local47 != null && local47.equals(local28)) {
				Static199.method3284(arg0 + Static104.aString77);
				return;
			}
			if (Static136.aStringArray22[local34] != null) {
				local79 = Static190.method3179(Static136.aStringArray22[local34]);
				if (local79 != null && local79.equals(local28)) {
					Static199.method3284(arg0 + Static104.aString77);
					return;
				}
			}
		}
		for (local34 = 0; local34 < Static149.anInt2817; local34++) {
			local47 = Static190.method3179(Static13.aStringArray3[local34]);
			if (local47 != null && local47.equals(local28)) {
				Static199.method3284(Static274.aString207 + arg0 + Static60.aString28);
				return;
			}
			if (Static82.aStringArray15[local34] != null) {
				local79 = Static190.method3179(Static82.aStringArray15[local34]);
				if (local79 != null && local79.equals(local28)) {
					Static199.method3284(Static274.aString207 + arg0 + Static60.aString28);
					return;
				}
			}
		}
		if (Static190.method3179(Static136.aClass10_Sub5_Sub1_1.aString124).equals(local28)) {
			Static199.method3284(Static179.aString119);
		} else {
			Static215.aClass3_Sub26_Sub1_2.method3958(188);
			Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(arg0));
			Static215.aClass3_Sub26_Sub1_2.method3914(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILclient!rn;)[Lclient!kk;")
	public static Class81_Sub2[] method2567(@OriginalArg(1) int arg0, @OriginalArg(3) Class155 arg1) {
		return Static115.method1878(0, arg1, arg0) ? Static170.method2811() : null;
	}
}
