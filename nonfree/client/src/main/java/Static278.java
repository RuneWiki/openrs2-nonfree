import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!uc", name = "V", descriptor = "[I")
	public static int[] anIntArray597;

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "Lclient!fh;")
	public static Class58 aClass58_97;

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "Lclient!fh;")
	public static Class58 aClass58_98;

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray49;

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "[I")
	public static int[] anIntArray595 = new int[1024];

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "[I")
	public static int[] anIntArray596 = new int[128];

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "[I")
	public static int[] anIntArray598 = new int[100];

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
	public static int anInt5312 = 0;

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
	public static int anInt5313 = 0;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(B)V")
	public static void method4333() {
		Static268.aClass26_54.method515();
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	public static void method4335() {
		for (@Pc(3) int local3 = 0; local3 < Static250.anInt4761; local3++) {
			@Pc(10) int local10 = Static275.anIntArray587[local3];
			@Pc(14) Class53_Sub1_Sub2 local14 = Static110.aClass53_Sub1_Sub2Array1[local10];
			@Pc(18) int local18 = Static189.aClass4_Sub10_Sub1_2.method4666();
			if ((local18 & 0x1) != 0) {
				local18 += Static189.aClass4_Sub10_Sub1_2.method4666() << 8;
			}
			@Pc(43) int local43;
			@Pc(49) int local49;
			if ((local18 & 0x40) != 0) {
				local43 = Static189.aClass4_Sub10_Sub1_2.method4626();
				local49 = Static189.aClass4_Sub10_Sub1_2.method4642();
				local14.method3317(Static50.anInt954, local49, local43);
				local14.anInt3993 = Static50.anInt954 + 300;
				local14.anInt4022 = Static189.aClass4_Sub10_Sub1_2.method4626();
			}
			if ((local18 & 0x100) != 0) {
				local43 = Static189.aClass4_Sub10_Sub1_2.method4660();
				@Pc(77) int[] local77 = new int[local43];
				@Pc(80) int[] local80 = new int[local43];
				@Pc(83) int[] local83 = new int[local43];
				for (@Pc(85) int local85 = 0; local85 < local43; local85++) {
					@Pc(96) int local96 = Static189.aClass4_Sub10_Sub1_2.method4672();
					if (local96 == 65535) {
						local96 = -1;
					}
					local83[local85] = local96;
					local77[local85] = Static189.aClass4_Sub10_Sub1_2.method4626();
					local80[local85] = Static189.aClass4_Sub10_Sub1_2.method4625();
				}
				Static35.method555(local83, local14, local80, local77);
			}
			if ((local18 & 0x10) != 0) {
				local43 = Static189.aClass4_Sub10_Sub1_2.method4660();
				local49 = Static189.aClass4_Sub10_Sub1_2.method4642();
				local14.method3317(Static50.anInt954, local49, local43);
			}
			if ((local18 & 0x2) != 0) {
				if (local14.aClass171_1.method4297()) {
					Static181.method2944(local14);
				}
				local14.method3330(Static84.method1495(Static189.aClass4_Sub10_Sub1_2.method4667()));
				local14.method3329(local14.aClass171_1.anInt5263);
				local14.anInt4009 = local14.aClass171_1.anInt5244;
				local14.anInt3986 = local14.aClass171_1.anInt5262;
				if (local14.aClass171_1.method4297()) {
					Static7.method109(null, local14.anIntArray422[0], local14, local14.anIntArray426[0], null, 0, Static281.anInt5335);
				}
			}
			if ((local18 & 0x200) != 0) {
				local14.anInt4014 = Static189.aClass4_Sub10_Sub1_2.method4625();
				local14.anInt4003 = Static189.aClass4_Sub10_Sub1_2.method4653();
			}
			if ((local18 & 0x20) != 0) {
				local43 = Static189.aClass4_Sub10_Sub1_2.method4653();
				if (local43 == 65535) {
					local43 = -1;
				}
				local49 = Static189.aClass4_Sub10_Sub1_2.method4642();
				Static34.method529(local43, local14, local49);
			}
			if ((local18 & 0x4) != 0) {
				local43 = Static189.aClass4_Sub10_Sub1_2.method4667();
				local49 = Static189.aClass4_Sub10_Sub1_2.method4632();
				@Pc(272) boolean local272 = true;
				if (local43 == 65535) {
					local43 = -1;
				}
				if (local43 != -1 && local14.anInt3961 != -1 && Static156.method2501(Static132.method2005(local43).anInt3134).anInt1243 < Static156.method2501(Static132.method2005(local14.anInt3961).anInt3134).anInt1243) {
					local272 = false;
				}
				if (local272) {
					local14.anInt3968 = 0;
					local14.anInt4026 = 0;
					local14.anInt3976 = 1;
					local14.anInt3984 = (local49 & 0xFFFF) + Static50.anInt954;
					if (local14.anInt3984 > Static50.anInt954) {
						local14.anInt4026 = -1;
					}
					local14.anInt3971 = local49 >> 16;
					local14.anInt3961 = local43;
					if (local14.anInt3961 != -1 && Static50.anInt954 == local14.anInt3984) {
						@Pc(358) int local358 = Static132.method2005(local14.anInt3961).anInt3134;
						if (local358 != -1) {
							@Pc(365) Class46 local365 = Static156.method2501(local358);
							if (local365 != null && local365.anIntArray95 != null) {
								Static213.method3474(local365, local14.anInt4002, local14.anInt3974, 0, false);
							}
						}
					}
				}
			}
			if ((local18 & 0x8) != 0) {
				local14.anInt3985 = Static189.aClass4_Sub10_Sub1_2.method4672();
				if (local14.anInt3985 == 65535) {
					local14.anInt3985 = -1;
				}
			}
			if ((local18 & 0x80) != 0) {
				local14.aString234 = Static189.aClass4_Sub10_Sub1_2.method4630();
				local14.anInt4023 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
	public static int method4336(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method4337(@OriginalArg(1) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}
}
