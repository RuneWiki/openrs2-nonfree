import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!md", name = "j", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!jo;")
	public static Class168 aClass168_75;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V")
	public static void method5099(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(1, arg0);
		local8.method3828();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	public static void method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static461.aFloat3 < Static461.aFloat4) {
			Static461.aFloat3 = (float) ((double) Static461.aFloat3 + (double) Static461.aFloat3 / 30.0D);
			if (Static461.aFloat4 < Static461.aFloat3) {
				Static461.aFloat3 = Static461.aFloat4;
			}
			Static41.method1128();
			Static461.anInt48 = (int) Static461.aFloat3 >> 1;
			Static461.aByteArrayArrayArray2 = Static384.method6056(Static461.anInt48);
		} else if (Static461.aFloat3 > Static461.aFloat4) {
			Static461.aFloat3 = (float) ((double) Static461.aFloat3 - (double) Static461.aFloat3 / 30.0D);
			if (Static461.aFloat3 < Static461.aFloat4) {
				Static461.aFloat3 = Static461.aFloat4;
			}
			Static41.method1128();
			Static461.anInt48 = (int) Static461.aFloat3 >> 1;
			Static461.aByteArrayArrayArray2 = Static384.method6056(Static461.anInt48);
		}
		if (Static98.anInt2324 != -1 && Static427.anInt9633 != -1) {
			@Pc(79) int local79 = Static98.anInt2324 - Static556.anInt9488;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static427.anInt9633 - Static567.anInt7671;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static556.anInt9488 += local79;
			if (local79 == 0 && local96 == 0) {
				Static427.anInt9633 = -1;
				Static98.anInt2324 = -1;
			}
			Static567.anInt7671 += local96;
			Static41.method1128();
		}
		if (Static137.anInt2914 <= 0) {
			Static339.anInt6292 = -1;
			Static221.anInt4650 = -1;
		} else {
			Static447.anInt8208--;
			if (Static447.anInt8208 == 0) {
				Static137.anInt2914--;
				Static447.anInt8208 = 100;
			}
		}
		if (!Static512.aBoolean644 || Static305.aClass211_44 == null) {
			return;
		}
		for (@Pc(159) Class6_Sub22 local159 = (Class6_Sub22) Static305.aClass211_44.method5183(); local159 != null; local159 = (Class6_Sub22) Static305.aClass211_44.method5177()) {
			@Pc(168) Class137 local168 = Static461.aClass42_2.method1147(local159.aClass6_Sub7_1.anInt1365);
			if (local159.method3489(arg1, arg0)) {
				if (local168.aStringArray23 != null) {
					if (local168.aStringArray23[4] != null) {
						Static232.method4112(false, -1, local168.aString47, local168.anInt4326, true, 0, (long) local159.aClass6_Sub7_1.anInt1365, local168.aStringArray23[4], 1003, -1);
					}
					if (local168.aStringArray23[3] != null) {
						Static232.method4112(false, -1, local168.aString47, local168.anInt4326, true, 0, (long) local159.aClass6_Sub7_1.anInt1365, local168.aStringArray23[3], 1006, -1);
					}
					if (local168.aStringArray23[2] != null) {
						Static232.method4112(false, -1, local168.aString47, local168.anInt4326, true, 0, (long) local159.aClass6_Sub7_1.anInt1365, local168.aStringArray23[2], 1010, -1);
					}
					if (local168.aStringArray23[1] != null) {
						Static232.method4112(false, -1, local168.aString47, local168.anInt4326, true, 0, (long) local159.aClass6_Sub7_1.anInt1365, local168.aStringArray23[1], 1001, -1);
					}
					if (local168.aStringArray23[0] != null) {
						Static232.method4112(false, -1, local168.aString47, local168.anInt4326, true, 0, (long) local159.aClass6_Sub7_1.anInt1365, local168.aStringArray23[0], 1007, -1);
					}
				}
				if (!local159.aClass6_Sub7_1.aBoolean146) {
					local159.aClass6_Sub7_1.aBoolean146 = true;
					Static89.method1989(Static513.aClass26_9, local159.aClass6_Sub7_1.anInt1365, local168.anInt4326);
				}
				if (local159.aClass6_Sub7_1.aBoolean146) {
					Static89.method1989(Static306.aClass26_4, local159.aClass6_Sub7_1.anInt1365, local168.anInt4326);
				}
			} else if (local159.aClass6_Sub7_1.aBoolean146) {
				local159.aClass6_Sub7_1.aBoolean146 = false;
				Static89.method1989(Static54.aClass26_1, local159.aClass6_Sub7_1.anInt1365, local168.anInt4326);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static457.method7117(arg3)) {
			return;
		}
		if (Static279.aClass93ArrayArray1[arg3] == null) {
			Static69.method1451(Static336.aClass93ArrayArray2[arg3], -1, arg6, arg1, arg0, arg5, arg8, arg7, arg2, arg4);
		} else {
			Static69.method1451(Static279.aClass93ArrayArray1[arg3], -1, arg6, arg1, arg0, arg5, arg8, arg7, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZB)V")
	public static void method5104(@OriginalArg(0) boolean arg0) {
		Static491.anInterface8_1.method6516(arg0 || Static323.aClass9_8 != null && Static323.aClass9_8.method5422());
	}
}
