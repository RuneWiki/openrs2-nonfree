import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_14;

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "Lclient!m;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "Lclient!ga;")
	public static Class29 aClass29_14;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1193 = Static80.method1463("(U5");

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1194 = Static80.method1463("@cya@");

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1196 = Static80.method1463(" has logged out)3");

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1195 = aClass63_1196;

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1197 = Static80.method1463("Friends");

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
	public static int anInt2238 = 0;

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1198 = aClass63_1197;

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
	public static int anInt2240 = 0;

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "[[I")
	public static int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!wa;)I")
	public static int method1498(@OriginalArg(1) Class6_Sub3_Sub17 arg0) {
		@Pc(26) Class6_Sub16 local26 = (Class6_Sub16) Static105.aClass2_10.method20(((long) arg0.anInt3233 << 32) + ((long) arg0.anInt3283));
		return local26 == null ? arg0.anInt3256 : local26.anInt2726;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z")
	public static boolean method1499(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
	public static void method1500() {
		aClass63_1194 = null;
		aClass63_1196 = null;
		aClass63_1195 = null;
		aClass7_Sub1_14 = null;
		aClass63_1198 = null;
		aClass29_14 = null;
		aClass63_1193 = null;
		aClass47_3 = null;
		aClass63_1197 = null;
		anIntArrayArray30 = null;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method1501() {
		if (Static79.anInt2162 == 0) {
			return;
		}
		@Pc(18) int local18 = 0;
		if (Static31.anInt1015 != 0) {
			local18 = 1;
		}
		for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
			if (Static106.aClass63Array20[local24] != null) {
				@Pc(34) int local34 = Static100.anIntArray296[local24];
				@Pc(38) Class63 local38 = Static39.aClass63Array9[local24];
				if (local38 != null && local38.method1803(Static54.aClass63_861)) {
					local38 = local38.method1806(5);
				}
				if (local38 != null && local38.method1803(Static35.aClass63_627)) {
					local38 = local38.method1806(5);
				}
				if ((local34 == 3 || local34 == 7) && (local34 == 7 || Static38.anInt1233 == 0 || Static38.anInt1233 == 1 && Static52.method1073(local38))) {
					@Pc(92) int local92 = 329 - local18 * 13;
					local18++;
					if (Static102.anInt2823 > 4 && Static59.anInt1768 - 4 > local92 + -10 && local92 + 3 >= Static59.anInt1768 + -4) {
						@Pc(145) int local145 = Static48.aClass6_Sub3_Sub3_Sub1_2.method450(Static15.method374(new Class63[] { Static33.aClass63_614, Static51.aClass63_833, local38, Static106.aClass63Array20[local24] })) + 25;
						if (local145 > 450) {
							local145 = 450;
						}
						if (local145 + 4 > Static102.anInt2823) {
							if (Static22.anInt687 >= 1) {
								Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local38 }), 0, 0, 2039, Static41.aClass63_702);
							}
							Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local38 }), 0, 0, 2019, Static76.aClass63_1119);
							Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local38 }), 0, 0, 2032, Static18.aClass63_388);
						}
					}
					if (local18 >= 5) {
						return;
					}
				}
				if ((local34 == 5 || local34 == 6) && Static38.anInt1233 < 2) {
					local18++;
					if (local18 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	public static void method1502() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}
}
