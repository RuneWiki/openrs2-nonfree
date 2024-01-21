import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!jg;")
	public static Class1_Sub8 aClass1_Sub8_5;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_605 = Static169.method2903("");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_602 = aClass23_605;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!ed;")
	private static Class23 aClass23_611 = Static169.method2903("Malformed login packet)3");

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_603 = aClass23_611;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!ed;")
	public static Class23 aClass23_604 = aClass23_605;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public static int anInt1647 = 0;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_606 = aClass23_605;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_607 = Static169.method2903(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_608 = aClass23_605;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_609 = Static169.method2903(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Lclient!ed;")
	public static Class23 aClass23_610 = aClass23_605;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_612 = aClass23_605;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
	public static boolean method1107() {
		try {
			if (Static141.anInt3602 == 2) {
				if (Static69.aClass1_Sub12_1 == null) {
					Static69.aClass1_Sub12_1 = Static186.method1732(Static5.aClass30_67, Static137.anInt3502, Static1.anInt221);
					if (Static69.aClass1_Sub12_1 == null) {
						return false;
					}
				}
				if (Static165.aClass31_1 == null) {
					Static165.aClass31_1 = new Class31(Static112.aClass30_43, Static124.aClass30_48);
				}
				if (Static35.aClass1_Sub11_Sub2_1.method1756(Static118.aClass30_46, Static69.aClass1_Sub12_1, Static165.aClass31_1)) {
					Static35.aClass1_Sub11_Sub2_1.method1768();
					Static35.aClass1_Sub11_Sub2_1.method1775(Static7.anInt331);
					Static35.aClass1_Sub11_Sub2_1.method1753(Static69.aClass1_Sub12_1, Static84.aBoolean219);
					Static141.anInt3602 = 0;
					Static69.aClass1_Sub12_1 = null;
					Static165.aClass31_1 = null;
					Static5.aClass30_67 = null;
					return true;
				}
			}
		} catch (@Pc(66) Exception local66) {
			local66.printStackTrace();
			Static35.aClass1_Sub11_Sub2_1.method1782();
			Static69.aClass1_Sub12_1 = null;
			Static141.anInt3602 = 0;
			Static165.aClass31_1 = null;
			Static5.aClass30_67 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method1108() {
		aClass1_Sub8_5 = null;
		aClass23_611 = null;
		aClass23_609 = null;
		aClass23_612 = null;
		aClass23_603 = null;
		aClass23_605 = null;
		aClass23_606 = null;
		aClass23_610 = null;
		aClass23_608 = null;
		aClass23_607 = null;
		aClass23_604 = null;
		aClass23_602 = null;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method1109() {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static1.aClass56_1.method1853(); local10 != null; local10 = (Class1_Sub4) Static1.aClass56_1.method1855()) {
			if (local10.aClass1_Sub11_Sub4_1 != null) {
				Static163.aClass1_Sub11_Sub3_2.method2818(local10.aClass1_Sub11_Sub4_1);
				local10.aClass1_Sub11_Sub4_1 = null;
			}
			if (local10.aClass1_Sub11_Sub4_2 != null) {
				Static163.aClass1_Sub11_Sub3_2.method2818(local10.aClass1_Sub11_Sub4_2);
				local10.aClass1_Sub11_Sub4_2 = null;
			}
		}
		Static1.aClass56_1.method1851();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ga;ILclient!ga;ZI)Lclient!la;")
	public static Class1_Sub1_Sub11 method1110(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int[] local14 = arg2.method1290(arg1);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(28) byte[] local28 = arg2.method1280(arg1, local14[local16]);
			if (local28 == null) {
				local7 = false;
			} else {
				@Pc(48) int local48 = local28[1] & 0xFF | (local28[0] & 0xFF) << 8;
				@Pc(64) byte[] local64 = arg0.method1280(local48, 0);
				if (local64 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub11(arg2, arg0, arg1, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}
}
