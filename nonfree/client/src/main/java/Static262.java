import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!kba", name = "p", descriptor = "I")
	public static int anInt4766;

	@OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
	public static int anInt4770;

	@OriginalMember(owner = "client!kba", name = "w", descriptor = "I")
	public static int anInt4773;

	@OriginalMember(owner = "client!kba", name = "n", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_61 = new Class208(17, 8);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)Z")
	public static boolean method3790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
	public static void method3791() {
		Static498.method710();
		Static284.aClass83_193 = null;
		Static101.anInt1769 = 0;
		Static464.anInt8696 = 0;
		Static403.aClass83_147 = null;
		Static365.aClass83_141 = null;
		Static169.aClass83_74 = null;
		Static208.anInt8063 = 0;
		Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
		Static202.method3101();
		Static248.method1075();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local30] = null;
		}
		Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 = null;
		for (@Pc(46) int local46 = 0; local46 < Static547.anInt9151; local46++) {
			@Pc(53) Class11_Sub1_Sub1_Sub3_Sub2 local53 = Static501.aClass1_Sub33Array1[local46].aClass11_Sub1_Sub1_Sub3_Sub2_2;
			if (local53 != null) {
				local53.anInt7528 = -1;
			}
		}
		Static44.method754();
		Static434.anInt7761 = -1;
		Static469.anInt8080 = -1;
		Static358.anInt9363 = 1;
		Static318.method4726(10);
		for (@Pc(75) int local75 = 0; local75 < 100; local75++) {
			Static73.aBooleanArray6[local75] = true;
		}
		Static368.method5401();
		Static328.aLong147 = 0L;
		Static169.aClass1_Sub46_1 = null;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!rc;I)Ljava/lang/String;")
	public static String method3792(@OriginalArg(0) Class1_Sub40 arg0) {
		return arg0.aString89 == null || arg0.aString89.length() <= 0 ? arg0.aString88 : arg0.aString88 + Static375.aClass253_36.method5453(Static161.anInt3095) + arg0.aString89;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method3793(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static375.aClass253_37.method5453(Static161.anInt3095) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static375.aClass253_39.method5453(Static161.anInt3095) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
