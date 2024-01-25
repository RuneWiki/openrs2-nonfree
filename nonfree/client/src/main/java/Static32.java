import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!xa;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
	public static int anInt606;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_7 = new Class61(6, -1);

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIBLjava/lang/String;)V")
	public static void method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class115 local8 = Static279.method4432(arg2, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray26 != null) {
			@Pc(23) Class4_Sub12 local23 = new Class4_Sub12();
			local23.anInt2449 = arg1;
			local23.anObjectArray3 = local8.anObjectArray26;
			local23.aString20 = arg3;
			local23.aClass115_5 = local8;
			Static205.method3636(local23);
		}
		if (Static598.anInt9831 != 10 || !Static69.method1233(local8).method4967(arg1 - 1)) {
			return;
		}
		@Pc(67) Class4_Sub41 local67;
		if (arg1 == 1) {
			local67 = Static128.method2707(Static248.aClass61_54, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 2) {
			local67 = Static128.method2707(Static430.aClass61_99, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 3) {
			local67 = Static128.method2707(Static263.aClass61_109, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 4) {
			local67 = Static128.method2707(Static407.aClass61_93, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 5) {
			local67 = Static128.method2707(Static481.aClass61_113, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 6) {
			local67 = Static128.method2707(Static297.aClass61_65, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 7) {
			local67 = Static128.method2707(Static463.aClass61_106, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 8) {
			local67 = Static128.method2707(Static375.aClass61_80, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 9) {
			local67 = Static128.method2707(Static160.aClass61_37, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
		if (arg1 == 10) {
			local67 = Static128.method2707(Static8.aClass61_129, Class16_Sub3.lb);
			Static344.method5099(local67, local8.anInt3510, arg2, arg0);
			Static551.method7603(local67);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method569() {
		return Static325.aBoolean431 || Static268.aClass4_Sub18_2 == null ? "" : Static268.aClass4_Sub18_2.aString26;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([Lclient!xa;B)V")
	public static void method572(@OriginalArg(0) Class13[] arg0) {
		Static550.anInt9238 = arg0.length;
		Static23.anIntArray106 = new int[Static550.anInt9238 + 10];
		Static367.aClass13Array24 = new Class13[Static550.anInt9238 + 10];
		Static602.method1585(arg0, 0, Static367.aClass13Array24, 0, Static550.anInt9238);
		for (@Pc(26) int local26 = 0; local26 < Static550.anInt9238; local26++) {
			Static23.anIntArray106[local26] = Static367.aClass13Array24[local26].a();
		}
		for (@Pc(45) int local45 = Static550.anInt9238; local45 < Static367.aClass13Array24.length; local45++) {
			Static23.anIntArray106[local45] = 12;
		}
	}
}
