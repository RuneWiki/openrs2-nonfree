import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
	public static int anInt3431;

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
	public static int anInt3426 = 0;

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString100 = "M";

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2723(@OriginalArg(1) String arg0) {
		return Static82.method1472(10, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public static void method2724() {
		Static111.anInt2390 = 0;
		Static146.anInt3487 = 0;
		Static62.method1211();
		Static84.method1480();
		Static284.method4685();
		@Pc(22) int local22;
		for (local22 = 0; local22 < Static146.anInt3487; local22++) {
			@Pc(33) int local33 = Static226.anIntArray516[local22];
			if (Static32.anInt809 != Static27.aClass25_Sub1_Sub2Array1[local33].anInt1658) {
				if (Static27.aClass25_Sub1_Sub2Array1[local33].aClass143_1.method4068()) {
					Static289.method4725(Static27.aClass25_Sub1_Sub2Array1[local33]);
				}
				Static27.aClass25_Sub1_Sub2Array1[local33].method1250(null);
				Static27.aClass25_Sub1_Sub2Array1[local33] = null;
			}
		}
		if (Static222.aClass1_Sub16_Sub1_3.anInt3328 != Static5.anInt141) {
			throw new RuntimeException("gnp1 pos:" + Static222.aClass1_Sub16_Sub1_3.anInt3328 + " psize:" + Static5.anInt141);
		}
		for (local22 = 0; local22 < Static147.anInt3493; local22++) {
			if (Static27.aClass25_Sub1_Sub2Array1[Static65.anIntArray25[local22]] == null) {
				throw new RuntimeException("gnp2 pos:" + local22 + " size:" + Static147.anInt3493);
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
	public static void method2725() {
		if (Static22.aClass41_1 != null) {
			Static22.aClass41_1.method1062();
			Static22.aClass41_1 = null;
		}
		Static91.method1596();
		Static55.method1119();
		@Pc(16) int local16;
		for (local16 = 0; local16 < 4; local16++) {
			Static213.aClass36Array1[local16].method949();
		}
		Static240.method4148(false);
		System.gc();
		Static164.method3049();
		Static282.anInt6020 = -1;
		Static191.aBoolean212 = false;
		Static12.method240(true);
		Static238.anInt5219 = 0;
		Static82.anInt1972 = 0;
		Static266.anInt5790 = 0;
		Static222.anInt4928 = 0;
		Static219.aBoolean268 = false;
		for (local16 = 0; local16 < Static129.aClass81Array1.length; local16++) {
			Static129.aClass81Array1[local16] = null;
		}
		Static266.anInt5789 = 0;
		Static147.anInt3493 = 0;
		for (local16 = 0; local16 < 2048; local16++) {
			Static271.aClass25_Sub1_Sub1Array1[local16] = null;
			Static177.aClass1_Sub16Array1[local16] = null;
		}
		for (local16 = 0; local16 < 32768; local16++) {
			Static27.aClass25_Sub1_Sub2Array1[local16] = null;
		}
		for (local16 = 0; local16 < 4; local16++) {
			for (@Pc(119) int local119 = 0; local119 < 104; local119++) {
				for (@Pc(126) int local126 = 0; local126 < 104; local126++) {
					Static240.aClass131ArrayArrayArray1[local16][local119][local126] = null;
				}
			}
		}
		Static112.method1807();
		Static173.anInt3933 = 0;
		Static113.method1834();
		Static102.method1683(true);
		try {
			Static301.method406("loggedout", Static43.aClass66_1.anApplet1);
		} catch (@Pc(165) Throwable local165) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
	public static void method2728(@OriginalArg(0) boolean arg0) {
		Static225.anIntArray515 = new int[5];
		Static191.anIntArray382 = new int[104];
		Static8.anIntArray447 = new int[104];
		Static273.anIntArray585 = new int[104];
		Static90.anInt2102 = 99;
		@Pc(21) byte local21;
		if (arg0) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		Static117.aByteArrayArrayArray20 = new byte[local21][104][104];
		Static271.aByteArrayArrayArray52 = new byte[local21][105][105];
		Static241.aByteArrayArrayArray46 = new byte[local21][104][104];
		Static182.anIntArray446 = new int[104];
		Static27.aByteArrayArrayArray5 = new byte[local21][104][104];
		Static88.aByteArrayArrayArray13 = new byte[local21][104][104];
		Static64.anIntArrayArrayArray5 = new int[local21][105][105];
		Static220.anIntArray498 = new int[104];
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)I")
	public static int method2731(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
