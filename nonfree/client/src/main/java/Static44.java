import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!oa;")
	public static Class9 aClass9_13;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public static int anInt1595;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array6;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static int anInt1590 = 0;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!fe;")
	public static Class17 aClass17_63 = new Class17(100);

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "[I")
	public static int[] anIntArray247 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_579 = Static56.method1206("Enter object name");

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_580 = Static56.method1206("Enter name of player to add to list");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray39 = new boolean[5];

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public static int anInt1596 = 0;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!lc;")
	public static Class31 aClass31_581 = Static56.method1206("Friends");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1060() {
		aClass31_580 = null;
		aClass17_63 = null;
		aClass2_Sub1_Sub3_Sub2Array6 = null;
		anIntArray247 = null;
		aBooleanArray39 = null;
		aClass9_13 = null;
		aClass31_581 = null;
		aClass31_579 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/awt/Component;II)Lclient!oa;")
	public static Class9 method1061(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class9_Sub1");
			@Pc(10) Class9 local10 = (Class9) local6.getDeclaredConstructor().newInstance();
			local10.method866(arg2, arg1, arg0);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class9_Sub2 local28 = new Class9_Sub2();
			local28.method866(arg2, arg1, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method1062() {
		for (@Pc(18) Class2_Sub1_Sub4_Sub2 local18 = (Class2_Sub1_Sub4_Sub2) Static11.aClass36_1.method1365(); local18 != null; local18 = (Class2_Sub1_Sub4_Sub2) Static11.aClass36_1.method1361()) {
			if (local18.anInt842 != Static58.anInt1945 || Static49.anInt2694 > local18.anInt836) {
				local18.method1695();
			} else if (Static49.anInt2694 >= local18.anInt854) {
				if (local18.anInt863 > 0) {
					@Pc(58) Class2_Sub1_Sub4_Sub6_Sub2 local58 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local18.anInt863 - 1];
					if (local58 != null && local58.anInt2006 >= 0 && local58.anInt2006 < 13312 && local58.anInt2011 >= 0 && local58.anInt2011 < 13312) {
						local18.method558(Static49.anInt2694, local58.anInt2006, local58.anInt2011, Static42.method1057(local58.anInt2006, local58.anInt2011, local18.anInt842) - local18.anInt857);
					}
				}
				if (local18.anInt863 < 0) {
					@Pc(109) int local109 = -local18.anInt863 - 1;
					@Pc(116) Class2_Sub1_Sub4_Sub6_Sub1 local116;
					if (Static2.anInt99 == local109) {
						local116 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1;
					} else {
						local116 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local109];
					}
					if (local116 != null && local116.anInt2006 >= 0 && local116.anInt2006 < 13312 && local116.anInt2011 >= 0 && local116.anInt2011 < 13312) {
						local18.method558(Static49.anInt2694, local116.anInt2006, local116.anInt2011, Static42.method1057(local116.anInt2006, local116.anInt2011, local18.anInt842) - local18.anInt857);
					}
				}
				local18.method553(Static56.anInt1911);
				Static99.aClass64_1.method1791(Static58.anInt1945, (int) local18.aDouble4, (int) local18.aDouble1, (int) local18.aDouble3, 60, local18, local18.anInt848, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!lc;ILclient!lc;)V")
	public static void method1063(@OriginalArg(0) Class31 arg0, @OriginalArg(2) Class31 arg1) {
		Static58.aClass31_682 = arg1;
		Static58.aClass31_689 = arg0;
	}
}
