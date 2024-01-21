import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
	public static int anInt1674;

	@OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
	public static int anInt1679;

	@OriginalMember(owner = "client!me", name = "yb", descriptor = "Lclient!ta;")
	public static Class14 aClass14_24;

	@OriginalMember(owner = "client!me", name = "Bb", descriptor = "J")
	public static long aLong49;

	@OriginalMember(owner = "client!me", name = "W", descriptor = "I")
	public static int anInt1669 = 0;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
	public static final int anInt1671 = 50;

	@OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
	public static int[] anIntArray206 = new int[anInt1671];

	@OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
	public static int anInt1670 = -1;

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_818 = Static14.method2017("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "[I")
	public static int[] anIntArray208 = new int[anInt1671];

	@OriginalMember(owner = "client!me", name = "db", descriptor = "[I")
	public static int[] anIntArray209 = new int[anInt1671];

	@OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
	public static int anInt1672 = 0;

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "[I")
	public static int[] anIntArray210 = new int[anInt1671];

	@OriginalMember(owner = "client!me", name = "ib", descriptor = "[Lclient!kc;")
	public static Class36[] aClass36Array31 = new Class36[anInt1671];

	@OriginalMember(owner = "client!me", name = "jb", descriptor = "[I")
	public static int[] anIntArray211 = new int[anInt1671];

	@OriginalMember(owner = "client!me", name = "tb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_820 = Static14.method2017("Loaded sprites");

	@OriginalMember(owner = "client!me", name = "qb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_819 = aClass36_820;

	@OriginalMember(owner = "client!me", name = "xb", descriptor = "[I")
	public static int[] anIntArray213 = new int[anInt1671];

	@OriginalMember(owner = "client!me", name = "zb", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!me", name = "Ab", descriptor = "I")
	public static int anInt1685 = 0;

	@OriginalMember(owner = "client!me", name = "Db", descriptor = "[I")
	public static int[] anIntArray214 = new int[anInt1671];

	@OriginalMember(owner = "client!me", name = "Gb", descriptor = "I")
	public static int anInt1689 = 0;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
	public static void method1150() {
		anIntArray206 = null;
		anIntArray210 = null;
		aClass36Array31 = null;
		anIntArray211 = null;
		aClass36_818 = null;
		aClass36_819 = null;
		anIntArray214 = null;
		anIntArray209 = null;
		anIntArray208 = null;
		anIntArray213 = null;
		aClass14_24 = null;
		anIntArrayArray23 = null;
		aClass36_820 = null;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z")
	public static boolean method1151(@OriginalArg(1) int arg0) {
		if (!Static33.method328(arg0)) {
			return false;
		}
		@Pc(13) boolean local13 = false;
		@Pc(17) Class2_Sub1_Sub6[] local17 = Static42.aClass2_Sub1_Sub6ArrayArray1[arg0];
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Class2_Sub1_Sub6 local25 = local17[local19];
			if (local25 != null && local25.anInt676 == 6) {
				@Pc(53) int local53;
				if (local25.anInt667 != -1 || local25.anInt668 != -1) {
					@Pc(48) boolean local48 = Static38.method750(local25);
					if (local48) {
						local53 = local25.anInt668;
					} else {
						local53 = local25.anInt667;
					}
					if (local53 != -1) {
						@Pc(65) Class2_Sub1_Sub14 local65 = Static56.method1045(local53);
						local25.anInt664 += Static100.anInt2609;
						label52: while (true) {
							do {
								do {
									if (local65.anIntArray288[local25.anInt684] >= local25.anInt664) {
										break label52;
									}
									local13 = true;
									local25.anInt664 -= local65.anIntArray288[local25.anInt684];
									local25.anInt684++;
								} while (local25.anInt684 < local65.anIntArray287.length);
								local25.anInt684 -= local65.anInt2386;
							} while (local25.anInt684 >= 0 && local65.anIntArray287.length > local25.anInt684);
							local25.anInt684 = 0;
						}
					}
				}
				if (local25.anInt674 != 0 && !local25.aBoolean27) {
					local13 = true;
					@Pc(151) int local151 = local25.anInt674 >> 16;
					@Pc(155) int local155 = local151 * Static100.anInt2609;
					local25.anInt672 = local155 + local25.anInt672 & 0x7FF;
					local53 = local25.anInt674 << 16 >> 16;
					local53 *= Static100.anInt2609;
					local25.anInt681 = local25.anInt681 + local53 & 0x7FF;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II[BI)Z")
	public static boolean method1154(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class2_Sub12 local12 = new Class2_Sub12(arg1);
		@Pc(14) int local14 = -1;
		label65: while (true) {
			@Pc(18) int local18 = local12.method1397();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(55) int local55;
				@Pc(91) Class2_Sub1_Sub13 local91;
				do {
					@Pc(69) int local69;
					@Pc(65) int local65;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local12.method1397();
										if (local37 == 0) {
											continue label65;
										}
										local12.method1399();
									}
									local37 = local12.method1397();
									if (local37 == 0) {
										continue label65;
									}
									local29 += local37 - 1;
									@Pc(49) int local49 = local29 & 0x3F;
									local55 = local12.method1399() >> 2;
									@Pc(61) int local61 = local29 >> 6 & 0x3F;
									local65 = arg2 + local49;
									local69 = arg0 + local61;
								} while (local69 <= 0);
							} while (local65 <= 0);
						} while (local69 >= 103);
					} while (local65 >= 103);
					local91 = Static2.method2072(local14);
				} while (local55 == 22 && Static35.aBoolean51 && local91.anInt2303 == 0 && !local91.aBoolean94);
				local31 = true;
				if (!local91.method1633()) {
					Static101.anInt2667++;
					local7 = false;
				}
			}
		}
	}
}
