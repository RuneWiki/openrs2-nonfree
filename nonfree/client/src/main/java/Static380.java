import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	public static int anInt7114;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
	public static int anInt7112 = -1;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_131 = new Class254(95, -1);

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
	public static int anInt7115 = -1;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method5985(@OriginalArg(0) Class9 arg0) {
		for (@Pc(1) int local1 = Static98.anInt2326; local1 < Static192.anInt4157; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static396.anInt7505; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static54.anInt1441; local7++) {
					@Pc(16) Class224 local16 = Static256.aClass224ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub4 local21 = local16.aClass11_Sub4_3;
						@Pc(24) Class11_Sub4 local24 = local16.aClass11_Sub4_2;
						if (local21 != null && local21.method8105()) {
							Static552.method7227(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8105()) {
								Static552.method7227(arg0, local24, local1, local4, local7, 1, 1);
								local24.method8103(false, 0, 0, 0, local21, arg0);
								local24.method8107();
							}
							local21.method8107();
						}
						for (@Pc(70) Class270 local70 = local16.aClass270_1; local70 != null; local70 = local70.aClass270_2) {
							@Pc(74) Class11_Sub1 local74 = local70.aClass11_Sub1_2;
							if (local74 != null && local74.method8105()) {
								Static552.method7227(arg0, local74, local1, local4, local7, local74.aShort79 + 1 - local74.aShort78, local74.aShort77 - local74.aShort80 + 1);
								local74.method8107();
							}
						}
						@Pc(111) Class11_Sub5 local111 = local16.aClass11_Sub5_2;
						if (local111 != null && local111.method8105()) {
							Static32.method1006(arg0, local111, local1, local4, local7);
							local111.method8107();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method5987() {
		Static336.aClass93ArrayArray2 = new Class93[Static313.aClass168_109.method4456()][];
		Static279.aClass93ArrayArray1 = new Class93[Static313.aClass168_109.method4456()][];
		Static87.aBooleanArray7 = new boolean[Static313.aClass168_109.method4456()];
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method5988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static47.aClass62Array1 == null) {
			return;
		}
		@Pc(8) Class11_Sub1_Sub1 local8 = null;
		@Pc(18) int local18;
		if (arg5 < 0) {
			local18 = -arg5 - 1;
			if (local18 == Static412.anInt7714) {
				local8 = Static350.aClass11_Sub1_Sub1_Sub2_4;
			} else {
				local8 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local18];
			}
		} else {
			local18 = arg5 - 1;
			@Pc(40) Class6_Sub33 local40 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local18);
			if (local40 != null) {
				local8 = local40.aClass11_Sub1_Sub1_Sub1_2;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(53) Class31 local53 = Static480.aClass57_11.method1469(arg11);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg2 == 1 || arg2 == 3) {
			local65 = local53.anInt1058;
			local62 = local53.anInt1109;
		} else {
			local62 = local53.anInt1058;
			local65 = local53.anInt1109;
		}
		@Pc(79) int local79 = arg9 + (local65 >> 1);
		@Pc(87) int local87 = (local65 + 1 >> 1) + arg9;
		@Pc(94) int local94 = arg3 + (local62 >> 1);
		@Pc(102) int local102 = (local62 + 1 >> 1) + arg3;
		@Pc(106) Class62 local106 = Static47.aClass62Array1[arg4];
		@Pc(129) int local129 = local106.JA(local79, local94) + local106.JA(local87, local94) + local106.JA(local79, local102) + local106.JA(local87, local102) >> 2;
		@Pc(133) Class6_Sub14 local133 = new Class6_Sub14();
		local133.anInt1915 = local8.aByte77;
		local133.anInt1916 = arg11;
		local133.anInt1903 = arg3;
		@Pc(148) int local148;
		if (arg6 > arg12) {
			local148 = arg6;
			arg6 = arg12;
			arg12 = local148;
		}
		local133.anInt1918 = arg9;
		local133.anInt1911 = arg1 + Static508.anInt8998;
		local133.anInt1900 = arg2;
		local133.anInt1910 = Static508.anInt8998 + arg7;
		local133.anInt1907 = arg10;
		if (arg8 > arg0) {
			local148 = arg8;
			arg8 = arg0;
			arg0 = local148;
		}
		local133.anInt1920 = arg9 + arg6;
		local133.anInt1913 = arg9 + arg12;
		local133.anInt1902 = (local65 << 8) + (local133.anInt1918 << 9);
		local133.anInt1914 = arg0 + arg3;
		local133.anInt1908 = (local133.anInt1903 << 9) + (local62 << 8);
		local133.anInt1901 = arg3 + arg8;
		local133.anInt1904 = local129;
		Static199.aClass211_27.method5173(local133);
		local8.aClass6_Sub14_3 = local133;
	}
}
