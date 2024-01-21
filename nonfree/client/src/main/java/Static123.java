import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "Lclient!vf;")
	public static Class80 aClass80_4;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lclient!r;")
	private static Class61 aClass61_971 = Static129.method2060("Prepared sound engine");

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Lclient!r;")
	public static Class61 aClass61_969 = aClass61_971;

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "Lclient!r;")
	public static Class61 aClass61_970 = Static129.method2060(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "Lclient!r;")
	public static Class61 aClass61_972 = Static129.method2060("::fpsoff");

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
	public static int anInt3069 = -2;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
	public static int anInt3071 = 0;

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array23 = new Class61[500];

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_974 = Static129.method2060("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ff;Lclient!ff;)V")
	public static void method1927(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1) {
		Static57.aClass26_6 = arg0;
		Static115.aClass26_30 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method1928() {
		if (Static110.aBooleanArray14[96]) {
			Static107.anInt2772 += (-Static107.anInt2772 - 24) / 2;
		} else if (Static110.aBooleanArray14[97]) {
			Static107.anInt2772 += (24 - Static107.anInt2772) / 2;
		} else {
			Static107.anInt2772 /= 2;
		}
		Static91.anInt2422 = Static107.anInt2772 / 2 + Static91.anInt2422 & 0x7FF;
		@Pc(56) int local56 = Static120.anInt3033 + Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875;
		@Pc(62) int local62 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 + Static9.anInt213;
		if (Static110.aBooleanArray14[98]) {
			Static56.anInt1405 += (12 - Static56.anInt1405) / 2;
		} else if (Static110.aBooleanArray14[99]) {
			Static56.anInt1405 += (-Static56.anInt1405 - 12) / 2;
		} else {
			Static56.anInt1405 /= 2;
		}
		Static57.anInt1420 += Static56.anInt1405 / 2;
		if (Static133.anInt3398 - local62 < -500 || Static133.anInt3398 - local62 > 500 || Static100.anInt2586 - local56 < -500 || Static100.anInt2586 - local56 > 500) {
			Static100.anInt2586 = local56;
			Static133.anInt3398 = local62;
		}
		if (Static57.anInt1420 < 128) {
			Static57.anInt1420 = 128;
		}
		if (Static57.anInt1420 > 383) {
			Static57.anInt1420 = 383;
		}
		if (local62 != Static133.anInt3398) {
			Static133.anInt3398 += (local62 - Static133.anInt3398) / 16;
		}
		@Pc(165) int local165 = Static133.anInt3398 >> 7;
		if (Static100.anInt2586 != local56) {
			Static100.anInt2586 += (local56 - Static100.anInt2586) / 16;
		}
		@Pc(179) int local179 = 0;
		@Pc(183) int local183 = Static100.anInt2586 >> 7;
		@Pc(189) int local189 = Static42.method757(Static93.anInt2428, Static133.anInt3398, Static100.anInt2586);
		@Pc(209) int local209;
		if (local165 > 3 && local183 > 3 && local165 < 100 && local183 < 100) {
			for (local209 = local165 - 4; local209 <= local165 + 4; local209++) {
				for (@Pc(215) int local215 = local183 - 4; local215 <= local183 + 4; local215++) {
					@Pc(219) int local219 = Static93.anInt2428;
					if (local219 < 3 && (Static30.aByteArrayArrayArray2[1][local209][local215] & 0x2) == 2) {
						local219++;
					}
					@Pc(247) int local247 = local189 - Static65.anIntArrayArrayArray3[local219][local209][local215];
					if (local247 > local179) {
						local179 = local247;
					}
				}
			}
		}
		local209 = local179 * 192;
		if (local209 > 98048) {
			local209 = 98048;
		}
		if (local209 < 32768) {
			local209 = 32768;
		}
		if (local209 > Static60.anInt1459) {
			Static60.anInt1459 += (local209 - Static60.anInt1459) / 24;
		} else if (local209 < Static60.anInt1459) {
			Static60.anInt1459 += (local209 - Static60.anInt1459) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z[Lclient!r;)Lclient!r;")
	public static Class61 method1929(@OriginalArg(1) Class61[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static86.method1533(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!md;IZ)V")
	public static void method1930(@OriginalArg(0) Class5_Sub13 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt2013;
		@Pc(10) int local10 = (int) arg0.aLong100;
		arg0.method2189();
		if (arg1) {
			Static83.method1506(local6);
		}
		Static44.method772(local6);
		@Pc(29) Class5_Sub11 local29 = Static88.method2191(local10);
		if (local29 != null) {
			Static24.method505(local29);
		}
		Static117.aBoolean105 = false;
		Static36.anInt1015 = 0;
		Static103.method1744(Static117.anInt3014, Static127.anInt3201, Static64.anInt2727, Static81.anInt3355);
		if (Static44.anInt1133 != -1) {
			Static98.method1662(1, Static44.anInt1133);
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
	public static void method1931() {
		aClass61_972 = null;
		aClass61_974 = null;
		aClass61_969 = null;
		aClass61_971 = null;
		aClass80_4 = null;
		aClass61Array23 = null;
		aClass61_970 = null;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	public static void method1932() {
		for (@Pc(10) Class5_Sub3 local10 = (Class5_Sub3) Static112.aClass58_64.method1669(); local10 != null; local10 = (Class5_Sub3) Static112.aClass58_64.method1664()) {
			if (local10.aClass5_Sub2_Sub16_1 != null) {
				local10.method185();
			}
		}
	}
}
