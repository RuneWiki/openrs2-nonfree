import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
	public static int anInt6251;

	@OriginalMember(owner = "client!in", name = "eb", descriptor = "[I")
	public static int[] anIntArray566;

	@OriginalMember(owner = "client!in", name = "gb", descriptor = "I")
	public static int anInt6261;

	@OriginalMember(owner = "client!in", name = "M", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray51 = null;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "I")
	public static int anInt6250 = 0;

	@OriginalMember(owner = "client!in", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString447 = "Face here";

	@OriginalMember(owner = "client!in", name = "Y", descriptor = "Lclient!lb;")
	public static Class46_Sub1 aClass46_Sub1_5 = null;

	@OriginalMember(owner = "client!in", name = "cb", descriptor = "Lclient!wf;")
	public static Class191 aClass191_18 = null;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(B)V")
	public static void method4727() {
		Static174.aClass89_44.method2265();
		Static214.aClass89_32.method2265();
		Static256.aClass89_40.method2265();
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(II)I")
	public static int method4728(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZIII)V")
	public static void method4729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class1_Sub16 local15;
		for (local15 = (Class1_Sub16) Static80.aClass26_14.method666(); local15 != null; local15 = (Class1_Sub16) Static80.aClass26_14.method672()) {
			Static16.method412(arg3, arg1, local15, arg0, arg2);
		}
		@Pc(42) byte local42;
		@Pc(47) Class91 local47;
		@Pc(141) int local141;
		for (local15 = (Class1_Sub16) Static13.aClass26_3.method666(); local15 != null; local15 = (Class1_Sub16) Static13.aClass26_3.method672()) {
			local42 = 1;
			local47 = local15.aClass2_Sub4_Sub1_1.method2095();
			if (local15.aClass2_Sub4_Sub1_1.anInt2820 == local47.anInt3138) {
				local42 = 0;
			} else if (local47.anInt3125 == local15.aClass2_Sub4_Sub1_1.anInt2820 || local47.anInt3130 == local15.aClass2_Sub4_Sub1_1.anInt2820 || local47.anInt3132 == local15.aClass2_Sub4_Sub1_1.anInt2820 || local15.aClass2_Sub4_Sub1_1.anInt2820 == local47.anInt3155) {
				local42 = 2;
			} else if (local47.anInt3134 == local15.aClass2_Sub4_Sub1_1.anInt2820 || local47.anInt3131 == local15.aClass2_Sub4_Sub1_1.anInt2820 || local47.anInt3147 == local15.aClass2_Sub4_Sub1_1.anInt2820 || local15.aClass2_Sub4_Sub1_1.anInt2820 == local47.anInt3148) {
				local42 = 3;
			}
			if (local42 != local15.anInt3274) {
				local141 = Static75.method1315(local15.aClass2_Sub4_Sub1_1);
				if (local141 != local15.anInt3279) {
					if (local15.aClass1_Sub10_Sub4_2 != null) {
						Static101.aClass1_Sub10_Sub2_2.method1864(local15.aClass1_Sub10_Sub4_2);
						local15.aClass1_Sub10_Sub4_2 = null;
					}
					local15.anInt3279 = local141;
				}
				local15.anInt3274 = local42;
			}
			local15.anInt3277 = local15.aClass2_Sub4_Sub1_1.anInt2846;
			local15.anInt3272 = local15.aClass2_Sub4_Sub1_1.anInt2846 + local15.aClass2_Sub4_Sub1_1.method2088() * 64;
			local15.anInt3268 = local15.aClass2_Sub4_Sub1_1.anInt2794;
			local15.anInt3280 = local15.aClass2_Sub4_Sub1_1.anInt2794 + local15.aClass2_Sub4_Sub1_1.method2088() * 64;
			Static16.method412(arg3, arg1, local15, arg0, arg2);
		}
		for (local15 = (Class1_Sub16) Static125.aClass186_10.method4567(); local15 != null; local15 = (Class1_Sub16) Static125.aClass186_10.method4579()) {
			local42 = 1;
			local47 = local15.aClass2_Sub4_Sub2_2.method2095();
			if (local15.aClass2_Sub4_Sub2_2.anInt2820 == local47.anInt3138) {
				local42 = 0;
			} else if (local47.anInt3125 == local15.aClass2_Sub4_Sub2_2.anInt2820 || local15.aClass2_Sub4_Sub2_2.anInt2820 == local47.anInt3130 || local47.anInt3132 == local15.aClass2_Sub4_Sub2_2.anInt2820 || local47.anInt3155 == local15.aClass2_Sub4_Sub2_2.anInt2820) {
				local42 = 2;
			} else if (local15.aClass2_Sub4_Sub2_2.anInt2820 == local47.anInt3134 || local15.aClass2_Sub4_Sub2_2.anInt2820 == local47.anInt3131 || local47.anInt3147 == local15.aClass2_Sub4_Sub2_2.anInt2820 || local47.anInt3148 == local15.aClass2_Sub4_Sub2_2.anInt2820) {
				local42 = 3;
			}
			if (local15.anInt3274 != local42) {
				local141 = Static64.method1133(local15.aClass2_Sub4_Sub2_2);
				if (local141 != local15.anInt3279) {
					if (local15.aClass1_Sub10_Sub4_2 != null) {
						Static101.aClass1_Sub10_Sub2_2.method1864(local15.aClass1_Sub10_Sub4_2);
						local15.aClass1_Sub10_Sub4_2 = null;
					}
					local15.anInt3279 = local141;
				}
				local15.anInt3274 = local42;
			}
			local15.anInt3277 = local15.aClass2_Sub4_Sub2_2.anInt2846;
			local15.anInt3272 = local15.aClass2_Sub4_Sub2_2.anInt2846 + local15.aClass2_Sub4_Sub2_2.method2088() * 64;
			local15.anInt3268 = local15.aClass2_Sub4_Sub2_2.anInt2794;
			local15.anInt3280 = local15.aClass2_Sub4_Sub2_2.anInt2794 + local15.aClass2_Sub4_Sub2_2.method2088() * 64;
			Static16.method412(arg3, arg1, local15, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!th;Lclient!th;)V")
	public static void method4730(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static160.aClass1_Sub3_Sub5_1 = Static278.method4755(arg1, Static49.anInt1173, arg0);
		if (Static294.aBoolean367) {
			Static130.aClass1_Sub3_Sub5_Sub1_2 = Static35.method755(arg1, Static49.anInt1173, arg0);
		} else {
			Static130.aClass1_Sub3_Sub5_Sub1_2 = (Class1_Sub3_Sub5_Sub1) Static160.aClass1_Sub3_Sub5_1;
		}
		Static195.aClass1_Sub3_Sub5_3 = Static278.method4755(arg1, Static176.anInt3904, arg0);
		Static176.aClass1_Sub3_Sub5_2 = Static278.method4755(arg1, Static269.anInt5361, arg0);
	}
}
