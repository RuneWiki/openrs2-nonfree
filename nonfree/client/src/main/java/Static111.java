import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public static int anInt3100;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public static int anInt3098 = 0;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1307 = Static59.method1195("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1311 = Static59.method1195("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1308 = aClass60_1311;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1309 = Static59.method1195("(U1");

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1312 = Static59.method1195("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1310 = aClass60_1312;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1313 = Static59.method1195("http:)4)4");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	public static void method2064(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static20.aBooleanArray20[arg0]) {
			return;
		}
		Static63.aClass25_28.method909(arg0);
		if (Static120.aClass3_Sub15ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static120.aClass3_Sub15ArrayArray1[arg0].length; local28++) {
			if (Static120.aClass3_Sub15ArrayArray1[arg0][local28] != null) {
				if (Static120.aClass3_Sub15ArrayArray1[arg0][local28].anInt2296 == 2) {
					local26 = false;
				} else {
					Static120.aClass3_Sub15ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static120.aClass3_Sub15ArrayArray1[arg0] = null;
		}
		Static20.aBooleanArray20[arg0] = false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public static void method2065() {
		for (@Pc(3) int local3 = 0; local3 < Static20.anInt829; local3++) {
			@Pc(9) int local9 = Static128.anIntArray390[local3];
			@Pc(13) Class3_Sub1_Sub1_Sub3_Sub2 local13 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local9];
			if (local13 != null) {
				Static103.method2018(local13.aClass3_Sub1_Sub16_1.anInt3167, local13);
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method2066() {
		aClass60_1313 = null;
		aClass60_1311 = null;
		aClass60_1309 = null;
		aClass60_1310 = null;
		anIntArray331 = null;
		aClass60_1308 = null;
		aClass60_1312 = null;
		aClass60_1307 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!da;)V")
	public static void method2067(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = 0;
		if (arg0.anInt787 == 0) {
			local3 = Static13.aClass58_1.method1745(arg0.anInt795, arg0.anInt797, arg0.anInt792);
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		if (arg0.anInt787 == 1) {
			local3 = Static13.aClass58_1.method1755(arg0.anInt795, arg0.anInt797, arg0.anInt792);
		}
		if (arg0.anInt787 == 2) {
			local3 = Static13.aClass58_1.method1774(arg0.anInt795, arg0.anInt797, arg0.anInt792);
		}
		if (arg0.anInt787 == 3) {
			local3 = Static13.aClass58_1.method1738(arg0.anInt795, arg0.anInt797, arg0.anInt792);
		}
		if (local3 != 0) {
			local1 = local3 >> 14 & 0x7FFF;
			@Pc(85) int local85 = Static13.aClass58_1.method1747(arg0.anInt795, arg0.anInt797, arg0.anInt792, local3);
			local23 = local85 >> 6 & 0x3;
			local21 = local85 & 0x1F;
		}
		arg0.anInt800 = local23;
		arg0.anInt796 = local21;
		arg0.anInt798 = local1;
	}
}
