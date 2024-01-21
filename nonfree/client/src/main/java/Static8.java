import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "Lclient!df;")
	public static Class5_Sub2_Sub6_Sub1 aClass5_Sub2_Sub6_Sub1_1;

	@OriginalMember(owner = "client!be", name = "Ab", descriptor = "Z")
	public static boolean aBoolean8;

	@OriginalMember(owner = "client!be", name = "Kb", descriptor = "I")
	public static int anInt262;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_109 = Static63.method1251("mapmarker");

	@OriginalMember(owner = "client!be", name = "Fb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_110 = Static63.method1251("(Y ");

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)Lclient!df;")
	public static Class5_Sub2_Sub6_Sub1 method161() {
		@Pc(12) Class5_Sub2_Sub6_Sub1 local12 = new Class5_Sub2_Sub6_Sub1(Static111.anIntArray440, Static110.anIntArray438, Static104.anIntArray424, Static7.anIntArray25, Static16.aByteArrayArray2);
		Static96.method1797();
		return local12;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
	public static void method163() {
		if (!Static57.aBoolean83) {
			return;
		}
		Static120.aClass11_138 = null;
		Static36.aClass11_48 = null;
		Static73.aClass11_90 = null;
		Static64.aClass11_79 = null;
		Static99.anIntArray405 = null;
		Static79.anIntArray314 = null;
		Static11.aClass11_18 = null;
		Static107.aClass5_Sub2_Sub6_Sub3_5 = null;
		Static44.aClass5_Sub2_Sub6_Sub4_21 = null;
		Static87.aClass11_100 = null;
		Static37.aClass5_Sub2_Sub6_Sub4Array3 = null;
		Static97.anIntArray400 = null;
		Static107.aClass11_117 = null;
		Static56.anIntArray255 = null;
		Static19.aClass5_Sub2_Sub6_Sub4_12 = null;
		Static75.aClass11_91 = null;
		Static119.anIntArray484 = null;
		Static97.anIntArray399 = null;
		Static47.anIntArray219 = null;
		Static35.anIntArray162 = null;
		Static56.aClass11_72 = null;
		Static103.aClass5_Sub2_Sub6_Sub3_4 = null;
		Static11.method223();
		Static3.method63(true);
		Static57.aBoolean83 = false;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public static void method170() {
		for (@Pc(7) int local7 = -1; local7 < Static56.anInt1694; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static64.anIntArray283[local7];
			}
			@Pc(25) Class5_Sub2_Sub4_Sub3_Sub1 local25 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local17];
			if (local25 != null) {
				Static61.method1222(1, local25);
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
	public static void method171() {
		aClass45_110 = null;
		aClass45_109 = null;
		aClass5_Sub2_Sub6_Sub1_1 = null;
	}
}
