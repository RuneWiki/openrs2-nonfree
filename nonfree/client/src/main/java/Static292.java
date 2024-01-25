import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public static int anInt4876;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "Lclient!cd;")
	public static Class36 aClass36_2;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_106 = new Class55("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!kh;ZI)V")
	public static void method3870(@OriginalArg(0) Class26_Sub2_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static274.anInt4617 < arg0.anInt7112) {
			Static455.method5030(arg0);
		} else if (Static274.anInt4617 > arg0.anInt7110) {
			Static63.method923(arg0, false);
			local9 = Static19.anInt274;
			local7 = Static9.anInt59;
		} else {
			Static384.method5651(arg0);
		}
		if (arg0.anInt7388 < 128 || arg0.anInt7383 < 128 || arg0.anInt7388 >= Static333.anInt3375 * 128 - 128 || (Static102.anInt2086 - 1) * 128 <= arg0.anInt7383) {
			arg0.anInt7112 = 0;
			arg0.anInt7066 = -1;
			arg0.anInt7046 = -1;
			arg0.anInt7110 = 0;
			local7 = -1;
			local9 = 0;
			arg0.anInt7065 = -1;
			arg0.anInt7388 = arg0.anIntArray603[0] * 128 + arg0.method5512() * 64;
			arg0.anInt7383 = arg0.anIntArray604[0] * 128 + arg0.method5512() * 64;
			arg0.method5510();
		}
		if (arg0 == Static104.aClass26_Sub2_Sub4_Sub2_2 && (arg0.anInt7388 < 1536 || arg0.anInt7383 < 1536 || Static333.anInt3375 * 128 - 1536 <= arg0.anInt7388 || (Static102.anInt2086 - 12) * 128 <= arg0.anInt7383)) {
			arg0.anInt7046 = -1;
			arg0.anInt7065 = -1;
			local9 = 0;
			arg0.anInt7112 = 0;
			arg0.anInt7110 = 0;
			local7 = -1;
			arg0.anInt7066 = -1;
			arg0.anInt7388 = arg0.anIntArray603[0] * 128 + arg0.method5512() * 64;
			arg0.anInt7383 = arg0.anIntArray604[0] * 128 + arg0.method5512() * 64;
			arg0.method5510();
		}
		@Pc(215) int local215 = Static402.method5073(arg0);
		Static414.method5213(local215, local9, arg0, local7);
		Static324.method4290(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ya;Lclient!ok;ILclient!ok;)V")
	public static void method3871(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(3) Class178 arg2) {
		Static189.aClass57_14 = Static254.method3389(arg2, Static272.anInt4601);
		Static359.aClass63_11 = arg0.method5281(Static189.aClass57_14, Static469.method5146(arg1, Static272.anInt4601));
		Static112.aClass57_6 = Static254.method3389(arg2, Static37.anInt653);
		Static259.aClass63_7 = arg0.method5281(Static112.aClass57_6, Static469.method5146(arg1, Static37.anInt653));
		Static35.aClass57_13 = Static254.method3389(arg2, Static1.anInt1);
		Static305.aClass63_15 = arg0.method5281(Static35.aClass57_13, Static469.method5146(arg1, Static1.anInt1));
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public static void method3874() {
		Static21.aClass11_2 = null;
		Static446.aClass11_20 = null;
		Static336.aClass11_17 = null;
		Static245.aClass11_14 = null;
		Static423.aClass11Array15 = null;
		Static293.aClass11_15 = null;
		Static3.aClass11_1 = null;
		Static368.aClass11_19 = null;
		Static218.aClass11_13 = null;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)V")
	public static void method3875() {
		Static129.aClient1.method707();
		Static255.aClass7_Sub14_Sub1_2.anInt4989 = 0;
		Static94.aClass253_35 = null;
		Static417.aClass253_149 = null;
		Static210.aClass253_153 = null;
		Static37.anInt654 = 0;
		Static376.anInt6106 = 0;
		Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
		Static316.aClass253_117 = null;
		Static59.anInt1060 = 0;
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			Static381.aStringArray49[local30] = null;
		}
		Static76.aClass129Array1 = null;
		Static364.aString17 = null;
		Static267.anInt4534 = 0;
		Static184.anInt3296 = 0;
		Static223.anInt3931 = 0;
		Static458.anInt7538 = 0;
	}
}
