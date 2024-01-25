import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!ij;")
	public static Class93 aClass93_39;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "[I")
	public static final int[] anIntArray184 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_23 = new Class109(64);

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_47 = new Class85("shake:", "", "", "");

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "[I")
	public static final int[] anIntArray185 = new int[200];

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_48 = new Class85(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
	public static int anInt1965 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)Z")
	public static boolean method1846(@OriginalArg(1) int arg0) {
		if (arg0 == 49 || arg0 == 18 || arg0 == 10 || arg0 == 47 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(BI)Lclient!qa;")
	public static Class165 method1848(@OriginalArg(1) int arg0) {
		@Pc(15) Class165 local15 = (Class165) Static196.aClass109_44.method2857((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static163.aClass93_64.method2410(arg0, 31);
		local15 = new Class165();
		if (local25 != null) {
			local15.method4517(new Class5_Sub12(local25), arg0);
		}
		Static196.aClass109_44.method2855((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public static void method1849() {
		Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
		Static187.aClass5_Sub12_Sub2_4.anInt5731 = 0;
		Static52.anInt972 = -1;
		Static297.anInt5810 = -1;
		Static203.anInt5016 = -1;
		Static151.anInt2973 = 0;
		Static64.anInt1670 = -1;
		Static347.anInt6686 = 0;
		Static54.anInt1000 = 0;
		Static255.method4515();
		Static2.method1426();
		for (@Pc(31) int local31 = 0; local31 < Static62.aClass4_Sub5_Sub2_Sub1Array1.length; local31++) {
			if (Static62.aClass4_Sub5_Sub2_Sub1Array1[local31] != null) {
				Static62.aClass4_Sub5_Sub2_Sub1Array1[local31].anInt5362 = -1;
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static280.aClass4_Sub5_Sub2_Sub2Array1.length; local49++) {
			if (Static280.aClass4_Sub5_Sub2_Sub2Array1[local49] != null) {
				Static280.aClass4_Sub5_Sub2_Sub2Array1[local49].anInt5362 = -1;
			}
		}
		Static24.method5483();
		Static53.anInt992 = 1;
		Static50.method822(30);
		for (@Pc(86) int local86 = 0; local86 < 100; local86++) {
			Static287.aBooleanArray23[local86] = true;
		}
		Static70.method1312();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!rg;)Lclient!ag;")
	public static Class7_Sub1 method1853(@OriginalArg(1) Class5_Sub12 arg0) {
		return new Class7_Sub1(arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5072(), arg0.method5072(), arg0.method5115());
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
	public static void method1854() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static104.aClass174ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static104.aClass174ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static350.anInt6715; local6++) {
					for (local9 = 0; local9 < Static236.anInt4222; local9++) {
						if (Static104.aClass174ArrayArrayArray2[local3][local6][local9] != null) {
							Static104.aClass174ArrayArrayArray2[local3][local6][local9].method4753();
						}
						Static104.aClass174ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static104.aClass174ArrayArrayArray2 = null;
		Static56.aClass51Array2 = null;
		if (Static52.aClass174ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static52.aClass174ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static350.anInt6715; local6++) {
					for (local9 = 0; local9 < Static236.anInt4222; local9++) {
						if (Static52.aClass174ArrayArrayArray1[local3][local6][local9] != null) {
							Static52.aClass174ArrayArrayArray1[local3][local6][local9].method4753();
						}
						Static52.aClass174ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static52.aClass174ArrayArrayArray1 = null;
		Static219.aClass51Array3 = null;
		Static178.aClass174ArrayArrayArray3 = null;
		Static8.aClass51Array1 = null;
		Static130.anInt5552 = 0;
		if (Static324.aClass197Array2 != null) {
			for (local3 = 0; local3 < Static130.anInt5552; local3++) {
				Static324.aClass197Array2[local3] = null;
			}
		}
		if (Static274.aClass4_Sub5Array2 != null) {
			for (local3 = 0; local3 < Static107.anInt4822; local3++) {
				Static274.aClass4_Sub5Array2[local3] = null;
			}
			Static107.anInt4822 = 0;
		}
		if (Static182.aClass5_Sub9_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static303.anInt5904; local3++) {
				Static182.aClass5_Sub9_Sub1Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static345.anInt6647; local6++) {
				for (local9 = 0; local9 < Static350.anInt6715; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static236.anInt4222; local160++) {
						Static308.anIntArrayArrayArray9[local6][local9][local160] = 0;
					}
				}
			}
			Static303.anInt5904 = 0;
		}
		Static318.anIntArrayArrayArray10 = null;
		Static206.method3781();
		Static70.aClass39_1.method802();
		Static136.aClass91_1 = null;
		Static127.anIntArrayArray45 = null;
		Static24.aClass66_6 = null;
		Static42.aClass55_3 = null;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)Lclient!hl;")
	public static Class88 method1859(@OriginalArg(1) int arg0) {
		@Pc(5) Class109 local5 = Static72.aClass109_19;
		@Pc(14) Class88 local14;
		synchronized (Static72.aClass109_19) {
			local14 = (Class88) Static72.aClass109_19.method2857((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static184.aClass93_113.method2410(arg0, 32);
		local14 = new Class88();
		if (local30 != null) {
			local14.method2140(new Class5_Sub12(local30));
		}
		local14.method2145();
		@Pc(53) Class109 local53 = Static72.aClass109_19;
		synchronized (Static72.aClass109_19) {
			Static72.aClass109_19.method2855((long) arg0, local14);
			return local14;
		}
	}
}
