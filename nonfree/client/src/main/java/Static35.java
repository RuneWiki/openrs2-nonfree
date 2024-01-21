import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fe", name = "jb", descriptor = "J")
	public static long aLong27;

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lclient!le;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_553 = Static33.method650("Loading ignore list");

	@OriginalMember(owner = "client!fe", name = "X", descriptor = "Lclient!oa;")
	public static Class56 aClass56_549 = aClass56_553;

	@OriginalMember(owner = "client!fe", name = "Y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_550 = null;

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_551 = Static33.method650("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!fe", name = "ab", descriptor = "Lclient!oa;")
	public static Class56 aClass56_552 = Static33.method650("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
	public static int anInt996 = 0;

	@OriginalMember(owner = "client!fe", name = "hb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_554 = Static33.method650("Einloggen");

	@OriginalMember(owner = "client!fe", name = "ib", descriptor = "Lclient!oa;")
	public static Class56 aClass56_555 = Static33.method650("Sprites geladen)3");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!wb;I)V")
	public static void method667(@OriginalArg(1) Class3_Sub1_Sub2_Sub4 arg0, @OriginalArg(2) int arg1) {
		Static109.method1144(arg1, arg0.anInt3196, arg0.anInt3187);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public static void method668() {
		Static4.anInt59 = 0;
		@Pc(12) int local12 = (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 >> 7) + Static18.anInt497;
		@Pc(19) int local19 = (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 >> 7) + Static57.anInt1618;
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static4.anInt59 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static4.anInt59 = 1;
		}
		if (Static4.anInt59 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static4.anInt59 = 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
	public static void method670() {
		Static31.aClass3_Sub2_Sub1_3.method322();
		@Pc(13) int local13 = Static31.aClass3_Sub2_Sub1_3.method323(1);
		if (local13 == 0) {
			return;
		}
		@Pc(24) int local24 = Static31.aClass3_Sub2_Sub1_3.method323(2);
		if (local24 == 0) {
			Static79.anIntArray186[Static60.anInt1776++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (local24 == 1) {
			local45 = Static31.aClass3_Sub2_Sub1_3.method323(3);
			Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.method2034(false, local45);
			local55 = Static31.aClass3_Sub2_Sub1_3.method323(1);
			if (local55 == 1) {
				Static79.anIntArray186[Static60.anInt1776++] = 2047;
			}
			return;
		}
		@Pc(100) int local100;
		if (local24 == 2) {
			local45 = Static31.aClass3_Sub2_Sub1_3.method323(3);
			Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.method2034(true, local45);
			local55 = Static31.aClass3_Sub2_Sub1_3.method323(3);
			Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.method2034(true, local55);
			local100 = Static31.aClass3_Sub2_Sub1_3.method323(1);
			if (local100 == 1) {
				Static79.anIntArray186[Static60.anInt1776++] = 2047;
			}
		} else if (local24 == 3) {
			local45 = Static31.aClass3_Sub2_Sub1_3.method323(1);
			Static94.anInt2470 = Static31.aClass3_Sub2_Sub1_3.method323(2);
			local55 = Static31.aClass3_Sub2_Sub1_3.method323(7);
			local100 = Static31.aClass3_Sub2_Sub1_3.method323(1);
			if (local100 == 1) {
				Static79.anIntArray186[Static60.anInt1776++] = 2047;
			}
			@Pc(157) int local157 = Static31.aClass3_Sub2_Sub1_3.method323(7);
			Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.method2031(local45 == 1, local157, local55);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
	public static void method671() {
		aClass56_550 = null;
		aClass56_551 = null;
		aClass56_555 = null;
		aClass56_552 = null;
		aClass56_549 = null;
		aClass56_553 = null;
		aClass56_554 = null;
		aClass18_1 = null;
	}
}
