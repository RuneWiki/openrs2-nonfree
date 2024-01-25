import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "[S")
	public static final short[] aShortArray34 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "S")
	public static short aShort32 = 256;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
	public static void method2678() {
		if (Static314.anInt8010 == 1 || Static314.anInt8010 == 3 || Static314.anInt8010 != Static162.anInt3682 && (Static314.anInt8010 == 0 || Static162.anInt3682 == 0)) {
			Static452.anInt8286 = 0;
			Static208.anInt4409 = 0;
			Static506.aClass305_36.method7440();
		}
		Static162.anInt3682 = Static314.anInt8010;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ep;B)Lclient!ep;")
	public static Class93 method2679(@OriginalArg(0) Class93 arg0) {
		if (arg0.anInt2820 != -1) {
			return Static223.method4011(arg0.anInt2820);
		}
		@Pc(25) int local25 = arg0.anInt2790 >>> 16;
		@Pc(30) Class335 local30 = new Class335(Static459.aClass305_24);
		for (@Pc(35) Class6_Sub48 local35 = (Class6_Sub48) local30.method7834(); local35 != null; local35 = (Class6_Sub48) local30.method7835()) {
			if (local25 == local35.anInt9207) {
				return Static223.method4011((int) local35.aLong252);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	public static void method2680() {
		Static362.method5818();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
	public static void method2682() {
		Static40.aClass41_1 = new Class41(8);
		Static49.anInt1352 = 0;
		for (@Pc(17) Class5_Sub2 local17 = (Class5_Sub2) Static574.aClass267_8.method6544(); local17 != null; local17 = (Class5_Sub2) Static574.aClass267_8.method6543()) {
			local17.method3779();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)V")
	public static void method2683(@OriginalArg(0) int arg0) {
		if (Static325.anInt6149 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static303.aString67 == null) {
				Static159.method3024(Static319.aString70, Static148.aString116, Static518.anInt9045);
			} else {
				Static169.method3454(Static518.anInt9045);
			}
		}
		if (arg0 != 13 && Static561.aClass64_3 != null) {
			Static561.aClass64_3.method1812();
			Static561.aClass64_3 = null;
		}
		if (arg0 == 3) {
			Static37.method1091(Static6.anInt302 != Static538.anInt9264);
		}
		if (arg0 == 7) {
			Static154.method2971(Static557.anInt9492 != Static6.anInt302);
		}
		if (arg0 == 5) {
			if (Static303.aString67 == null) {
				Static183.method3588(Static148.aString116, Static319.aString70);
			} else {
				Static407.method1065();
			}
		} else if (arg0 == 6) {
			if (Static303.aString67 == null) {
				Static159.method3024(Static319.aString70, Static148.aString116, Static518.anInt9045);
			} else {
				Static169.method3454(Static518.anInt9045);
			}
		} else if (arg0 == 9) {
			if (Static303.aString67 == null) {
				Static159.method3024(Static319.aString70, Static148.aString116, Static518.anInt9045);
			} else {
				Static169.method3454(Static518.anInt9045);
			}
		} else if (arg0 == 12) {
			if (Static303.aString67 == null) {
				Static183.method3588(Static148.aString116, Static319.aString70);
			} else {
				Static407.method1065();
			}
		}
		if (Static108.method2208(Static325.anInt6149)) {
			Static206.aClass168_52.anInt5130 = 2;
			Static284.aClass168_68.anInt5130 = 2;
			Static235.aClass168_59.anInt5130 = 2;
			Static457.aClass168_105.anInt5130 = 2;
			Static17.aClass168_13.anInt5130 = 2;
			Static260.aClass168_66.anInt5130 = 2;
			Static321.aClass168_78.anInt5130 = 2;
		}
		if (Static108.method2208(arg0)) {
			Static186.anInt4082 = 1;
			Static487.anInt8780 = 1;
			Static454.anInt8396 = 0;
			Static483.anInt8763 = 0;
			Static553.anInt9422 = 0;
			Static342.method5387(true);
			Static206.aClass168_52.anInt5130 = 1;
			Static284.aClass168_68.anInt5130 = 1;
			Static235.aClass168_59.anInt5130 = 1;
			Static457.aClass168_105.anInt5130 = 1;
			Static17.aClass168_13.anInt5130 = 1;
			Static260.aClass168_66.anInt5130 = 1;
			Static321.aClass168_78.anInt5130 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static152.method2947();
		}
		@Pc(228) boolean local228 = arg0 == 2 || Static512.method7258(arg0) || Static140.method2631(arg0);
		@Pc(245) boolean local245 = Static325.anInt6149 == 2 || Static512.method7258(Static325.anInt6149) || Static140.method2631(Static325.anInt6149);
		if (local245 != local228) {
			if (local228) {
				Static499.anInt8891 = Static422.anInt7840;
				if (Static104.aClass6_Sub6_Sub1_4.anInt1176 == 0) {
					Static165.method3354();
				} else {
					Static221.method3993(Static422.anInt7840, Static104.aClass6_Sub6_Sub1_4.anInt1176, Static378.aClass168_88);
				}
				Static352.aClass228_3.method5713(false);
			} else {
				Static165.method3354();
				Static352.aClass228_3.method5713(true);
			}
		}
		if (Static108.method2208(arg0) || arg0 == 13) {
			Static323.aClass9_8.method5463();
		}
		Static325.anInt6149 = arg0;
	}
}
