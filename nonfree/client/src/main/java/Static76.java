import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	public static int anInt1815;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
	public static int anInt1817;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Lclient!kb;")
	public static Class42 aClass42_7;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!bb;")
	public static Class8 aClass8_24 = new Class8(50);

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1002 = Static75.method1216("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt1811 = 0;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1003 = Static75.method1216("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!gb;")
	public static Class3_Sub4 aClass3_Sub4_5 = new Class3_Sub4(new byte[5000]);

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	public static int anInt1816 = 0;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1004 = Static75.method1216(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1005 = Static75.method1216("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	public static int anInt1818 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1221() {
		aClass3_Sub4_5 = null;
		aClass4_1003 = null;
		aClass4_1004 = null;
		aClass8_24 = null;
		aClass4_1002 = null;
		aClass4_1005 = null;
		aClass42_7 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method1222() {
		@Pc(10) int local10 = Static32.aClass3_Sub4_Sub1_2.method462(8);
		@Pc(15) int local15;
		if (Static11.anInt2841 > local10) {
			for (local15 = local10; local15 < Static11.anInt2841; local15++) {
				Static1.anIntArray1[Static29.anInt911++] = Static92.anIntArray270[local15];
			}
		}
		if (local10 > Static11.anInt2841) {
			throw new RuntimeException("gppov1");
		}
		Static11.anInt2841 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(61) int local61 = Static92.anIntArray270[local15];
			@Pc(65) Class3_Sub1_Sub1_Sub1_Sub2 local65 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local61];
			@Pc(70) int local70 = Static32.aClass3_Sub4_Sub1_2.method462(1);
			if (local70 == 0) {
				Static92.anIntArray270[Static11.anInt2841++] = local61;
				local65.anInt2343 = Static60.anInt1489;
			} else {
				@Pc(93) int local93 = Static32.aClass3_Sub4_Sub1_2.method462(2);
				if (local93 == 0) {
					Static92.anIntArray270[Static11.anInt2841++] = local61;
					local65.anInt2343 = Static60.anInt1489;
					Static12.anIntArray13[Static95.anInt2230++] = local61;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local93 == 1) {
						Static92.anIntArray270[Static11.anInt2841++] = local61;
						local65.anInt2343 = Static60.anInt1489;
						local138 = Static32.aClass3_Sub4_Sub1_2.method462(3);
						local65.method1551(false, local138);
						local148 = Static32.aClass3_Sub4_Sub1_2.method462(1);
						if (local148 == 1) {
							Static12.anIntArray13[Static95.anInt2230++] = local61;
						}
					} else if (local93 == 2) {
						Static92.anIntArray270[Static11.anInt2841++] = local61;
						local65.anInt2343 = Static60.anInt1489;
						local138 = Static32.aClass3_Sub4_Sub1_2.method462(3);
						local65.method1551(true, local138);
						local148 = Static32.aClass3_Sub4_Sub1_2.method462(3);
						local65.method1551(true, local148);
						@Pc(204) int local204 = Static32.aClass3_Sub4_Sub1_2.method462(1);
						if (local204 == 1) {
							Static12.anIntArray13[Static95.anInt2230++] = local61;
						}
					} else if (local93 == 3) {
						Static1.anIntArray1[Static29.anInt911++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
	public static boolean method1225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == Static12.anInt340) {
			return true;
		} else if (arg0 == 1 && Static107.anInt2705 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static106.anInt2663;
		}
	}
}
