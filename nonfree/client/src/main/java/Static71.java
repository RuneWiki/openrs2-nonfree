import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_12;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "Lclient!eb;")
	public static Class20 aClass20_7;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!jc;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "I")
	public static int anInt2035;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1059 = Static80.method1463("Titelbild geladen)3");

	@OriginalMember(owner = "client!m", name = "A", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1065 = Static80.method1463("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1060 = aClass63_1065;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1061 = Static80.method1463("Wordpack geladen)3");

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1062 = Static80.method1463(" x");

	@OriginalMember(owner = "client!m", name = "w", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1064 = Static80.method1463("Loading sprites )2 ");

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1063 = aClass63_1064;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "[I")
	public static int[] anIntArray231 = new int[4000];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1374() {
		aClass63_1061 = null;
		aClass63_1060 = null;
		aClass63_1064 = null;
		aClass63_1062 = null;
		aClass7_Sub1_12 = null;
		aClass63_1059 = null;
		aClass63_1063 = null;
		anIntArray230 = null;
		aClass38_1 = null;
		aClass20_7 = null;
		anIntArray231 = null;
		aClass63_1065 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!wa;)V")
	public static void method1376(@OriginalArg(1) Class6_Sub3_Sub17 arg0) {
		@Pc(8) int local8 = arg0.anInt3248;
		@Pc(99) int local99;
		if (local8 >= 1 && local8 <= 100 || !(local8 < 701 || local8 > 800)) {
			if (Static78.anInt2156 == 0) {
				if (local8 == 1) {
					arg0.aClass63_1765 = Static40.aClass63_1110;
					arg0.anInt3276 = 0;
					return;
				}
				if (local8 == 2) {
					arg0.anInt3276 = 0;
					arg0.aClass63_1765 = Static34.aClass63_619;
					return;
				}
			}
			if (Static78.anInt2156 == 1) {
				if (local8 == 1) {
					arg0.anInt3276 = 0;
					arg0.aClass63_1765 = Static53.aClass63_1686;
					return;
				}
				if (local8 == 2) {
					arg0.aClass63_1765 = Static34.aClass63_618;
					arg0.anInt3276 = 0;
					return;
				}
				if (local8 == 3) {
					arg0.anInt3276 = 0;
					arg0.aClass63_1765 = Static17.aClass63_1417;
					return;
				}
			}
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local99 = Static5.anInt52;
			if (Static78.anInt2156 != 2) {
				local99 = 0;
			}
			if (local8 >= local99) {
				arg0.anInt3276 = 0;
				arg0.aClass63_1765 = Static111.aClass63_1661;
			} else {
				arg0.aClass63_1765 = Static65.aClass63Array16[local8];
				arg0.anInt3276 = 1;
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 <= 800) {
				local8 -= 101;
			} else {
				local8 -= 701;
			}
			local99 = Static5.anInt52;
			if (Static78.anInt2156 != 2) {
				local99 = 0;
			}
			if (local99 <= local8) {
				arg0.aClass63_1765 = Static111.aClass63_1661;
				arg0.anInt3276 = 0;
			} else {
				if (Static31.anIntArray127[local8] == 0) {
					arg0.aClass63_1765 = Static15.method374(new Class63[] { Static78.aClass63_1126, Static29.aClass63_540 });
				} else if (Static31.anIntArray127[local8] < 5000) {
					if (Static31.anIntArray127[local8] == Static115.anInt3134) {
						arg0.aClass63_1765 = Static15.method374(new Class63[] { Static111.aClass63_1658, Static88.aClass63_1283, Static118.method2114(Static31.anIntArray127[local8]) });
					} else {
						arg0.aClass63_1765 = Static15.method374(new Class63[] { Static12.aClass63_279, Static88.aClass63_1283, Static118.method2114(Static31.anIntArray127[local8]) });
					}
				} else if (Static115.anInt3134 == Static31.anIntArray127[local8]) {
					arg0.aClass63_1765 = Static15.method374(new Class63[] { Static111.aClass63_1658, Static86.aClass63_1245, Static118.method2114(Static31.anIntArray127[local8] - 5000) });
				} else {
					arg0.aClass63_1765 = Static15.method374(new Class63[] { Static12.aClass63_279, Static86.aClass63_1245, Static118.method2114(Static31.anIntArray127[local8] - 5000) });
				}
				arg0.anInt3276 = 1;
			}
		} else if (local8 == 203) {
			local99 = Static5.anInt52;
			if (Static78.anInt2156 != 2) {
				local99 = 0;
			}
			arg0.anInt3219 = local99 * 15 + 20;
			if (arg0.anInt3264 >= arg0.anInt3219) {
				arg0.anInt3219 = arg0.anInt3264 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static78.anInt2156 == 0) {
				arg0.aClass63_1765 = Static36.aClass63_653;
				arg0.anInt3276 = 0;
			} else if (local8 == 1 && Static78.anInt2156 == 0) {
				arg0.anInt3276 = 0;
				arg0.aClass63_1765 = Static34.aClass63_619;
			} else {
				local99 = Static92.anInt2592;
				if (Static78.anInt2156 == 0) {
					local99 = 0;
				}
				if (local99 <= local8) {
					arg0.anInt3276 = 0;
					arg0.aClass63_1765 = Static111.aClass63_1661;
				} else {
					arg0.aClass63_1765 = Static24.method578(Static92.aLongArray5[local8]).method1814();
					arg0.anInt3276 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt3219 = Static92.anInt2592 * 15 + 20;
			if (arg0.anInt3264 >= arg0.anInt3219) {
				arg0.anInt3219 = arg0.anInt3264 + 1;
			}
		} else if (local8 == 324) {
			if (Static124.anInt3331 == -1) {
				Static124.anInt3331 = arg0.anInt3281;
				Static25.anInt844 = arg0.anInt3280;
			}
			if (Static123.aClass21_2.aBoolean47) {
				arg0.anInt3281 = Static124.anInt3331;
			} else {
				arg0.anInt3281 = Static25.anInt844;
			}
		} else if (local8 == 325) {
			if (Static124.anInt3331 == -1) {
				Static124.anInt3331 = arg0.anInt3281;
				Static25.anInt844 = arg0.anInt3280;
			}
			if (Static123.aClass21_2.aBoolean47) {
				arg0.anInt3281 = Static25.anInt844;
			} else {
				arg0.anInt3281 = Static124.anInt3331;
			}
		} else if (local8 == 327) {
			arg0.anInt3247 = 150;
			arg0.anInt3251 = (int) (Math.sin((double) Static73.anInt2064 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3253 = 0;
			arg0.anInt3262 = 5;
		} else if (local8 == 328) {
			arg0.anInt3247 = 150;
			arg0.anInt3251 = (int) (Math.sin((double) Static73.anInt2064 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3262 = 5;
			arg0.anInt3253 = 1;
		} else if (local8 == 600) {
			arg0.aClass63_1765 = Static15.method374(new Class63[] { Static111.aClass63_1652, Static65.aClass63_994 });
		} else if (local8 == 620) {
			if (Static22.anInt687 < 1) {
				arg0.aClass63_1765 = Static111.aClass63_1661;
			} else if (Static93.aBoolean138) {
				arg0.anInt3269 = 16711680;
				arg0.aClass63_1765 = Static124.aClass63_1779;
			} else {
				arg0.anInt3269 = 16777215;
				arg0.aClass63_1765 = Static93.aClass63_1380;
			}
		}
	}
}
