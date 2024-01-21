import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Lclient!td;")
	public static Class54 aClass54_8;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
	public static int anInt371;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_19;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "Z")
	private static boolean aBoolean22;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!hb;")
	public static Class27 aClass27_172 = Static87.method1648("p11_full");

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_182 = Static87.method1648("");

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!hb;")
	public static Class27 aClass27_173 = aClass27_182;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!hb;")
	public static Class27 aClass27_174 = aClass27_182;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!hb;")
	public static Class27 aClass27_175 = aClass27_182;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public static int anInt345 = 0;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Lclient!hb;")
	private static Class27 aClass27_176 = Static87.method1648("Accept challenge");

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_177 = aClass27_176;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "Lclient!hb;")
	public static Class27 aClass27_178 = aClass27_182;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "Lclient!fc;")
	public static Class21 aClass21_12 = new Class21(64);

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Lclient!hb;")
	public static Class27 aClass27_179 = aClass27_182;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "Lclient!hb;")
	public static Class27 aClass27_180 = Static87.method1648("::noclip");

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "Lclient!hb;")
	public static Class27 aClass27_181 = aClass27_182;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lclient!hb;")
	private static Class27 aClass27_183 = Static87.method1648("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_184 = Static87.method1648("Angreifen");

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lclient!hb;")
	public static Class27 aClass27_185 = Static87.method1648("welle:");

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "Lclient!hb;")
	public static Class27 aClass27_186 = aClass27_183;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[B)Z")
	public static boolean method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = -1;
		@Pc(22) Class3_Sub11 local22 = new Class3_Sub11(arg2);
		label54: while (true) {
			@Pc(26) int local26 = local22.method1469();
			if (local26 == 0) {
				return local15;
			}
			local17 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local22.method1469();
					if (local42 == 0) {
						continue label54;
					}
					local34 += local42 - 1;
					@Pc(71) int local71 = local34 >> 6 & 0x3F;
					@Pc(75) int local75 = local34 & 0x3F;
					@Pc(81) int local81 = local22.method1421() >> 2;
					@Pc(85) int local85 = arg1 + local71;
					@Pc(89) int local89 = arg0 + local75;
					if (local85 > 0 && local89 > 0 && local85 < 103 && local89 < 103) {
						@Pc(108) Class3_Sub3_Sub4 local108 = Static108.method1902(local17);
						if (local81 != 22 || !Static70.aBoolean94 || local108.anInt1311 != 0 || local108.aBoolean66) {
							if (!local108.method970()) {
								local15 = false;
								Static69.anInt1787++;
							}
							local36 = true;
						}
					}
				}
				local42 = local22.method1469();
				if (local42 == 0) {
					break;
				}
				local22.method1421();
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lclient!pb;Lclient!ed;I[BII)V")
	public static void method280(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class3_Sub11 local10 = new Class3_Sub11(arg2);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method1469();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method1469();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local10.method1421();
				@Pc(55) int local55 = local32 >> 12;
				@Pc(61) int local61 = local32 >> 6 & 0x3F;
				@Pc(65) int local65 = local51 >> 2;
				@Pc(69) int local69 = local32 & 0x3F;
				@Pc(73) int local73 = local51 & 0x3;
				@Pc(77) int local77 = local61 + arg3;
				@Pc(82) int local82 = local69 + arg4;
				if (local77 > 0 && local82 > 0 && local77 < 103 && local82 < 103) {
					@Pc(99) int local99 = local55;
					@Pc(101) Class49 local101 = null;
					if ((Static89.aByteArrayArrayArray11[1][local77][local82] & 0x2) == 2) {
						local99 = local55 - 1;
					}
					if (local99 >= 0) {
						local101 = arg0[local99];
					}
					Static83.method1665(local82, local55, local20, local65, local73, local77, local101, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	public static void method287() {
		aClass27_181 = null;
		aClass3_Sub3_Sub2_Sub4_19 = null;
		aClass21_12 = null;
		aClass27_180 = null;
		aClass27_183 = null;
		aClass27_176 = null;
		aClass27_174 = null;
		aClass27_186 = null;
		aClass27_172 = null;
		aLongArray5 = null;
		aClass27_173 = null;
		aClass27_185 = null;
		aClass54_8 = null;
		aClass27_178 = null;
		aClass27_182 = null;
		aClass27_175 = null;
		aClass27_177 = null;
		aClass27_184 = null;
		aClass27_179 = null;
	}
}
