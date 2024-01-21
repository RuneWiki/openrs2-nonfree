import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_11;

	@OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
	public static int anInt1805;

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "Lclient!gd;")
	private static Class23 aClass23_978 = Static15.method178("Login server offline)3");

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_976 = aClass23_978;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "Lclient!gd;")
	public static Class23 aClass23_977 = Static15.method178("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "Lclient!gd;")
	public static Class23 aClass23_979 = Static15.method178("chatback");

	@OriginalMember(owner = "client!pa", name = "E", descriptor = "Lclient!gd;")
	public static Class23 aClass23_980 = Static15.method178("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "Lclient!gd;")
	public static Class23 aClass23_981 = Static15.method178("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
	public static int anInt1803 = 0;

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "Lclient!gd;")
	private static Class23 aClass23_982 = Static15.method178("Loading interfaces )2 ");

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "[Lclient!qa;")
	public static Class1_Sub1_Sub2_Sub1_Sub2[] aClass1_Sub1_Sub2_Sub1_Sub2Array3 = new Class1_Sub1_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "Lclient!gd;")
	public static Class23 aClass23_983 = aClass23_982;

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "Lclient!gd;")
	public static Class23 aClass23_984 = Static15.method178("Schlie-8en");

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I")
	public static int method1117(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static27.anIntArray125[arg0];
		@Pc(11) int local11 = (local3 * Static56.anInt1732 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	public static void method1120() {
		aClass1_Sub1_Sub2_Sub1_Sub2Array3 = null;
		aClass23_977 = null;
		aClass23_984 = null;
		aClass23_983 = null;
		aClass55_Sub1_11 = null;
		aClass23_976 = null;
		aClass23_982 = null;
		aClass23_980 = null;
		aClass23_978 = null;
		aClass23_979 = null;
		aClass23_981 = null;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIIIII)I")
	public static int method1122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg5;
			arg5 = local10;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg5;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
	public static void method1123() {
		while (true) {
			if (Static83.aClass1_Sub5_Sub1_3.method741(Static39.anInt1382) >= 11) {
				@Pc(24) int local24 = Static83.aClass1_Sub5_Sub1_3.method739(11);
				if (local24 != 2047) {
					@Pc(29) boolean local29 = false;
					if (aClass1_Sub1_Sub2_Sub1_Sub2Array3[local24] == null) {
						aClass1_Sub1_Sub2_Sub1_Sub2Array3[local24] = new Class1_Sub1_Sub2_Sub1_Sub2();
						if (Static29.aClass1_Sub5Array1[local24] != null) {
							aClass1_Sub1_Sub2_Sub1_Sub2Array3[local24].method1402(Static29.aClass1_Sub5Array1[local24]);
						}
						local29 = true;
					}
					Static63.anIntArray226[Static2.anInt2290++] = local24;
					@Pc(65) Class1_Sub1_Sub2_Sub1_Sub2 local65 = aClass1_Sub1_Sub2_Sub1_Sub2Array3[local24];
					local65.anInt2224 = Static7.anInt176;
					@Pc(75) int local75 = Static76.anIntArray240[Static83.aClass1_Sub5_Sub1_3.method739(3)];
					if (local29) {
						local65.anInt2223 = local75;
					}
					@Pc(85) int local85 = Static83.aClass1_Sub5_Sub1_3.method739(5);
					if (local85 > 15) {
						local85 -= 32;
					}
					@Pc(96) int local96 = Static83.aClass1_Sub5_Sub1_3.method739(5);
					if (local96 > 15) {
						local96 -= 32;
					}
					@Pc(107) int local107 = Static83.aClass1_Sub5_Sub1_3.method739(1);
					if (local107 == 1) {
						Static88.anIntArray151[Static37.anInt1299++] = local24;
					}
					@Pc(125) int local125 = Static83.aClass1_Sub5_Sub1_3.method739(1);
					local65.method1391(local96 + Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], local125 == 1, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0] + local85);
					continue;
				}
			}
			Static83.aClass1_Sub5_Sub1_3.method730();
			return;
		}
	}
}
