import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "Lclient!sd;")
	public static Class73 aClass73_806 = Static122.method531("Welt");

	@OriginalMember(owner = "client!hd", name = "jb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_808 = Static122.method531("FULL");

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_807 = aClass73_808;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!vd;I)V")
	public static void method1104(@OriginalArg(0) Class83 arg0) {
		if (Static83.anInt1856 == arg0.anInt3733) {
			Static27.aBooleanArray3[arg0.anInt3736] = true;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ff;I)V")
	public static void method1107(@OriginalArg(0) Class3_Sub12 arg0) {
		if (Static98.aClass80_3 != null) {
			try {
				Static98.aClass80_3.method2608(0L);
				Static98.aClass80_3.method2616(24, arg0.anInt1793, arg0.aByteArray16);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt1793 += 24;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method1108() {
		aClass73_807 = null;
		aClass73_808 = null;
		aClass73_806 = null;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(III)V")
	public static void method1109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static142.anInt3262 < 2 && Static4.anInt71 == 0 && !Static159.aBoolean233) {
			return;
		}
		@Pc(42) Class73 local42;
		if (Static4.anInt71 == 1 && Static142.anInt3262 < 2) {
			local42 = Static19.method372(new Class73[] { Static63.aClass73_815, Static5.aClass73_75, Static122.aClass73_397, Static104.aClass73_1344 });
		} else if (Static159.aBoolean233 && Static142.anInt3262 < 2) {
			local42 = Static19.method372(new Class73[] { Static90.aClass73_1133, Static5.aClass73_75, Static39.aClass73_541, Static104.aClass73_1344 });
		} else {
			local42 = Static50.method909(Static142.anInt3262 - 1);
		}
		if (Static142.anInt3262 > 2) {
			local42 = Static19.method372(new Class73[] { local42, Static29.aClass73_435, Static154.method2485(Static142.anInt3262 - 2), Static92.aClass73_1161 });
		}
		@Pc(124) int local124 = Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1056(local42, arg1 + 4, arg0 + 15, Static13.aRandom1, Static52.anInt1283);
		Static23.method500(15, arg1 + 4, arg0, local124 + Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1062(local42));
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)I")
	public static int method1110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static35.method620(arg0 - 1, arg1 - 1) + Static35.method620(arg0 - 1, arg1 + 1) + Static35.method620(arg0 - -1, arg1 - 1) + Static35.method620(arg0 + 1, arg1 + 1);
		@Pc(74) int local74 = Static35.method620(arg0, arg1 - 1) + Static35.method620(arg0, arg1 + 1) + Static35.method620(arg0 + -1, arg1) + Static35.method620(arg0 + 1, arg1);
		@Pc(79) int local79 = Static35.method620(arg0, arg1);
		return local42 / 16 + local74 / 8 + local79 / 4;
	}
}
