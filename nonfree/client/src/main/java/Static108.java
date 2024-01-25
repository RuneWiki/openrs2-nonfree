import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!f", name = "F", descriptor = "I")
	public static int anInt1646;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V")
	public static void method1348() {
		Static260.method3633(Static364.aClass107_13);
		Static156.anInt2548++;
		if (Static180.aBoolean320 && Static333.aBoolean496) {
			@Pc(35) int local35 = Static181.aClass224_1.method5613();
			@Pc(39) int local39 = Static181.aClass224_1.method5615();
			local39 -= Static456.anInt3744;
			local35 -= Static256.anInt4522;
			if (local35 < Static277.anInt4736) {
				local35 = Static277.anInt4736;
			}
			if (local39 < Static416.anInt6714) {
				local39 = Static416.anInt6714;
			}
			if (Static192.aClass107_9.anInt2648 + Static277.anInt4736 < Static364.aClass107_13.anInt2648 + local35) {
				local35 = Static277.anInt4736 + Static192.aClass107_9.anInt2648 - Static364.aClass107_13.anInt2648;
			}
			if (Static416.anInt6714 + Static192.aClass107_9.anInt2606 < local39 + Static364.aClass107_13.anInt2606) {
				local39 = Static416.anInt6714 + Static192.aClass107_9.anInt2606 - Static364.aClass107_13.anInt2606;
			}
			@Pc(114) int local114 = local35 + Static192.aClass107_9.anInt2663 - Static277.anInt4736;
			@Pc(121) int local121 = Static192.aClass107_9.anInt2646 + local39 - Static416.anInt6714;
			@Pc(138) Class1_Sub11 local138;
			if (Static181.aClass224_1.method5616()) {
				if (Static364.aClass107_13.anInt2626 < Static156.anInt2548) {
					@Pc(215) int local215 = local35 - Static322.anInt5305;
					@Pc(220) int local220 = local39 - Static85.anInt6285;
					if (Static364.aClass107_13.anInt2607 < local215 || -Static364.aClass107_13.anInt2607 > local215 || local220 > Static364.aClass107_13.anInt2607 || local220 < -Static364.aClass107_13.anInt2607) {
						Static373.aBoolean642 = true;
					}
				}
				if (Static364.aClass107_13.anObjectArray11 != null && Static373.aBoolean642) {
					local138 = new Class1_Sub11();
					local138.anInt1183 = local114;
					local138.aClass107_2 = Static364.aClass107_13;
					local138.anInt1182 = local121;
					local138.anObjectArray2 = Static364.aClass107_13.anObjectArray11;
					Static198.method2834(local138);
				}
			} else {
				if (Static373.aBoolean642) {
					Static403.method5125();
					if (Static364.aClass107_13.anObjectArray8 != null) {
						local138 = new Class1_Sub11();
						local138.anInt1183 = local114;
						local138.aClass107_3 = Static35.aClass107_1;
						local138.anObjectArray2 = Static364.aClass107_13.anObjectArray8;
						local138.aClass107_2 = Static364.aClass107_13;
						local138.anInt1182 = local121;
						Static198.method2834(local138);
					}
					if (Static35.aClass107_1 != null && Static55.method771(Static364.aClass107_13) != null) {
						Static313.method4136(Static364.aClass107_13, Static35.aClass107_1);
					}
				} else if ((Static371.anInt5991 == 1 || Static373.method5948()) && Static76.anInt1078 > 2) {
					Static417.method5345(Static456.anInt3744 + Static85.anInt6285, Static256.anInt4522 - -Static322.anInt5305);
				} else if (Static370.method4826()) {
					Static417.method5345(Static85.anInt6285 + Static456.anInt3744, Static256.anInt4522 - -Static322.anInt5305);
				}
				Static364.aClass107_13 = null;
			}
		} else if (Static156.anInt2548 > 1) {
			Static364.aClass107_13 = null;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1349(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)Z")
	public static boolean method1351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(20) Class87 local20 = Static86.aClass248_7.method5246(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local20.method1574(arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZZBI)V")
	public static void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static278.method4439(arg3, arg1, arg2, 0, Static13.aClass239_Sub1Array1.length - 1, arg0);
		Static89.anInt1205 = 0;
		Static18.aClass1_Sub17_4 = null;
	}
}
