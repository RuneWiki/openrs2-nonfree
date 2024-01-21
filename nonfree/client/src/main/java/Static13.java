import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!pc;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!kc;")
	private static Class36 aClass36_171 = Static14.method2017("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!gd;")
	public static Class22 aClass22_5 = new Class22(64);

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_172 = Static14.method2017("::clientdrop");

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_173 = aClass36_171;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public static int anInt307 = 0;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public static int anInt308 = 0;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_174 = Static14.method2017("(Y");

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!kc;")
	private static Class36 aClass36_175 = Static14.method2017("purple:");

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Lclient!kc;")
	private static Class36 aClass36_177 = Static14.method2017("Trade)4compete");

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_176 = aClass36_177;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_178 = aClass36_175;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
	public static void method263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub1_Sub10 local15 = Static6.method149(arg1);
		@Pc(18) int local18 = local15.anInt1576;
		@Pc(21) int local21 = local15.anInt1579;
		@Pc(24) int local24 = local15.anInt1583;
		@Pc(31) int local31 = Class35.anIntArray176[local24 - local21];
		if (arg0 < 0 || local31 < arg0) {
			arg0 = 0;
		}
		local31 <<= local21;
		Static4.anIntArray14[local18] = Static4.anIntArray14[local18] & ~local31 | local31 & arg0 << local21;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!kc;Lclient!kc;Lclient!kc;)V")
	public static void method264(@OriginalArg(1) Class36 arg0, @OriginalArg(2) Class36 arg1, @OriginalArg(3) Class36 arg2) {
		Static15.aClass36_180 = arg0;
		Static15.aClass36_188 = arg2;
		Static15.aClass36_189 = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method265() {
		aClass36_172 = null;
		aClass36_178 = null;
		aFrame2 = null;
		aClass36_177 = null;
		aClass2_Sub1_Sub1_Sub1_5 = null;
		aClass36_174 = null;
		aClass51_2 = null;
		aClass22_5 = null;
		anIntArrayArray7 = null;
		aClass36_173 = null;
		aClass36_176 = null;
		aClass36_171 = null;
		aClass36_175 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method269() {
		Static33.method316();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (Static45.anInt1227 == 2) {
			@Pc(13) byte[] local13 = Static64.aClass2_Sub1_Sub1_Sub1_17.aByteArray1;
			@Pc(15) int[] local15 = Static54.anIntArray260;
			local18 = local13.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local13[local20] == 0) {
					local15[local20] = 0;
				}
			}
			Static42.aClass2_Sub1_Sub1_Sub3_4.method1252(0, 0, 33, 33, 25, 25, Static14.anInt2903, 256, Static27.anIntArray61, Static94.anIntArray310);
			Static1.method4();
			return;
		}
		@Pc(62) int local62 = Static65.anInt1672 + Static14.anInt2903 & 0x7FF;
		local18 = 464 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
		@Pc(78) int local78 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32 + 48;
		Static6.aClass2_Sub1_Sub1_Sub3_2.method1252(25, 5, 146, 151, local78, local18, local62, Static7.anInt194 + 256, Static112.anIntArray349, Static78.anIntArray244);
		for (local20 = 0; local20 < Static23.anInt588; local20++) {
			local78 = Static91.anIntArray280[local20] * 4 + 2 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32;
			local18 = Static112.anIntArray348[local20] * 4 + 2 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
			Static64.method1132(local18, Static45.aClass2_Sub1_Sub1_Sub3Array16[local20], local78);
		}
		@Pc(145) int local145;
		for (@Pc(141) int local141 = 0; local141 < 104; local141++) {
			for (local145 = 0; local145 < 104; local145++) {
				@Pc(155) Class8 local155 = Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local141][local145];
				if (local155 != null) {
					local78 = local141 * 4 + 2 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32;
					local18 = local145 * 4 + 2 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
					Static64.method1132(local18, Static89.aClass2_Sub1_Sub1_Sub3Array29[0], local78);
				}
			}
		}
		for (local145 = 0; local145 < Static108.anInt2775; local145++) {
			@Pc(207) Class2_Sub1_Sub4_Sub2_Sub1 local207 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[Static51.anIntArray316[local145]];
			if (local207 != null && local207.method1554()) {
				@Pc(216) Class2_Sub1_Sub9 local216 = local207.aClass2_Sub1_Sub9_1;
				if (local216.anIntArray192 != null) {
					local216 = local216.method1071();
				}
				if (local216 != null && local216.aBoolean71 && local216.aBoolean72) {
					local18 = local207.anInt2149 / 32 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
					local78 = local207.anInt2204 / 32 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32;
					Static64.method1132(local18, Static89.aClass2_Sub1_Sub1_Sub3Array29[1], local78);
				}
			}
		}
		@Pc(279) Class2_Sub1_Sub4_Sub2_Sub2 local279;
		for (@Pc(271) int local271 = 0; local271 < Static65.anInt1689; local271++) {
			local279 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[Static99.anIntArray243[local271]];
			if (local279 != null && local279.method1554()) {
				@Pc(287) boolean local287 = false;
				local18 = local279.anInt2149 / 32 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
				local78 = local279.anInt2204 / 32 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32;
				@Pc(313) long local313 = local279.aClass36_1027.method1021();
				for (@Pc(315) int local315 = 0; local315 < Static7.anInt189; local315++) {
					if (Static24.aLongArray2[local315] == local313 && Static36.anIntArray130[local315] != 0) {
						local287 = true;
						break;
					}
				}
				@Pc(348) boolean local348 = false;
				if (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2208 != 0 && local279.anInt2208 != 0 && Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2208 == local279.anInt2208) {
					local348 = true;
				}
				if (local287) {
					Static64.method1132(local18, Static89.aClass2_Sub1_Sub1_Sub3Array29[3], local78);
				} else if (local348) {
					Static64.method1132(local18, Static89.aClass2_Sub1_Sub1_Sub3Array29[4], local78);
				} else {
					Static64.method1132(local18, Static89.aClass2_Sub1_Sub1_Sub3Array29[2], local78);
				}
			}
		}
		if (Static42.anInt1111 != 0 && Static113.anInt2952 % 20 < 10) {
			if (Static42.anInt1111 == 1 && Static114.anInt2982 >= 0 && Static114.anInt2982 < Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1.length) {
				@Pc(432) Class2_Sub1_Sub4_Sub2_Sub1 local432 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[Static114.anInt2982];
				if (local432 != null) {
					local78 = local432.anInt2204 / 32 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32;
					local18 = local432.anInt2149 / 32 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
					Static46.method904(local18, local78, Static48.aClass2_Sub1_Sub1_Sub3Array17[1]);
				}
			}
			if (Static42.anInt1111 == 2) {
				local18 = (Static11.anInt264 - Static23.anInt592) * 4 + 2 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
				local78 = (-Static25.anInt632 + Static65.anInt1669) * 4 + 2 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32;
				Static46.method904(local18, local78, Static48.aClass2_Sub1_Sub1_Sub3Array17[1]);
			}
			if (Static42.anInt1111 == 10 && Static104.anInt2706 >= 0 && Static104.anInt2706 < Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1.length) {
				local279 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[Static104.anInt2706];
				if (local279 != null) {
					local18 = local279.anInt2149 / 32 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
					local78 = local279.anInt2204 / 32 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32;
					Static46.method904(local18, local78, Static48.aClass2_Sub1_Sub1_Sub3Array17[1]);
				}
			}
		}
		if (Static22.anInt576 != 0) {
			local78 = Static22.anInt576 * 4 + 2 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 / 32;
			local18 = Static78.anInt2040 * 4 + 2 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 / 32;
			Static64.method1132(local18, Static48.aClass2_Sub1_Sub1_Sub3Array17[0], local78);
		}
		Static54.method1591(97, 78, 3, 3, 16777215);
		Static42.aClass2_Sub1_Sub1_Sub3_4.method1252(0, 0, 33, 33, 25, 25, Static14.anInt2903, 256, Static27.anIntArray61, Static94.anIntArray310);
		Static1.method4();
	}
}
