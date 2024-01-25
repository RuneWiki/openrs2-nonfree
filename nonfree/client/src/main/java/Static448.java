import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
	public static int anInt1220;

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
	public static int anInt1236;

	@OriginalMember(owner = "client!qu", name = "I", descriptor = "B")
	public static byte aByte15;

	@OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
	private static int anInt1252;

	@OriginalMember(owner = "client!qu", name = "R", descriptor = "I")
	private static int anInt1253;

	@OriginalMember(owner = "client!qu", name = "S", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!qu", name = "T", descriptor = "I")
	private static int anInt1254;

	@OriginalMember(owner = "client!qu", name = "U", descriptor = "I")
	private static int anInt1255;

	@OriginalMember(owner = "client!qu", name = "V", descriptor = "Z")
	private static boolean aBoolean79;

	@OriginalMember(owner = "client!qu", name = "W", descriptor = "Z")
	private static boolean aBoolean80;

	@OriginalMember(owner = "client!qu", name = "X", descriptor = "Z")
	private static boolean aBoolean81;

	@OriginalMember(owner = "client!qu", name = "Y", descriptor = "I")
	private static int anInt1256;

	@OriginalMember(owner = "client!qu", name = "Z", descriptor = "Z")
	private static boolean aBoolean82;

	@OriginalMember(owner = "client!qu", name = "ab", descriptor = "Z")
	private static boolean aBoolean83;

	@OriginalMember(owner = "client!qu", name = "bb", descriptor = "I")
	private static int anInt1257;

	@OriginalMember(owner = "client!qu", name = "cb", descriptor = "Z")
	private static boolean aBoolean84;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "Lclient!au;")
	public static final Class21 aClass21_17 = new Class21(64);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILclient!ps;)I")
	public static int method1150(@OriginalArg(0) int arg0, @OriginalArg(2) Class273 arg1) {
		if (!Static70.method1164(arg1).method2771(arg0) && arg1.anObjectArray10 == null) {
			return -1;
		} else if (arg1.anIntArray440 == null || arg1.anIntArray440.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray440[arg0];
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg5 < 512 || arg6 < 512 || arg5 > Static281.anInt4822 * 512 - 1024 || arg6 > Static29.anInt491 * 512 - 1024) {
			Static494.anIntArray527[0] = Static494.anIntArray527[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static24.method347(arg6, arg5, arg2) - arg3;
		Static468.aClass25_6.U(arg0, 0, 0);
		Static417.aClass162_17.method6816(Static468.aClass25_6);
		Static417.aClass162_17.AA(arg5, local45, arg6, Static494.anIntArray527);
		Static468.aClass25_6.U(-arg0, 0, 0);
		Static417.aClass162_17.method6816(Static468.aClass25_6);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!r;Lclient!hi;ILclient!hh;)V")
	public static void method1159(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(3) Class142 arg2) {
		@Pc(10) Class38 local10 = arg2.method2515(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(21) int local21 = local10.E();
		if (local21 < local10.u()) {
			local21 = local10.u();
		}
		@Pc(33) int local33 = arg1.anInt2968;
		@Pc(36) int local36 = arg1.anInt2974;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(56) int local56;
		@Pc(79) int local79;
		if (arg2.aString42 != null) {
			local38 = Static125.aClass112_5.method2082(null, Static494.aStringArray37, null, arg2.aString42);
			for (local56 = 0; local56 < local38; local56++) {
				@Pc(62) String local62 = Static494.aStringArray37[local56];
				if (local56 < local38 - 1) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local79 = Static94.aClass200_2.method4083(local62);
				if (local40 < local79) {
					local40 = local79;
				}
			}
			local42 = local38 * Static94.aClass200_2.method4087() + Static94.aClass200_2.method4085() / 2;
		}
		local56 = local21 / 2 + arg1.anInt2968;
		if (local33 < local21 + Static476.anInt7580) {
			local56 = local40 / 2 + Static476.anInt7580 + local21 / 2 + 15;
			local33 = Static476.anInt7580;
		} else if (local33 > Static476.anInt7581 - local21) {
			local56 = Static476.anInt7581 - local40 / 2 - local21 / 2 - 5 - 10;
			local33 = Static476.anInt7581 - local21;
		}
		@Pc(164) int local164 = arg1.anInt2974;
		if (local36 < local21 + Static476.anInt7585) {
			local164 = Static476.anInt7585 + local21 / 2 + 10;
			local36 = Static476.anInt7585;
		} else if (Static476.anInt7579 - local21 < local36) {
			local36 = Static476.anInt7579 - local21;
			local164 = Static476.anInt7579 - local21 / 2 - local42 - 10;
		}
		local79 = (int) (Math.atan2((double) (local33 - arg1.anInt2968), (double) (local36 - arg1.anInt2974)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7456((float) local21 / 2.0F + (float) local33, (float) local21 / 2.0F + (float) local36, 4096, local79);
		@Pc(248) int local248 = -2;
		@Pc(250) int local250 = -2;
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		if (arg2.aString42 != null) {
			local250 = local164;
			local248 = local56 - local40 / 2 - 5;
			local254 = local164 + Static94.aClass200_2.method4087() * local38 + 3;
			local252 = local40 + local248 + 10;
			if (arg2.anInt2936 != 0) {
				arg0.method6885(local164, arg2.anInt2936, local252 - local248, local248, local254 - local164);
			}
			if (arg2.anInt2931 != 0) {
				arg0.method6888(arg2.anInt2931, local254 - local164, -local248 + local252, local164, local248);
			}
			for (@Pc(322) int local322 = 0; local322 < local38; local322++) {
				@Pc(328) String local328 = Static494.aStringArray37[local322];
				if (local322 < local38 - 1) {
					local328 = local328.substring(0, local328.length() - 4);
				}
				Static94.aClass200_2.method4088(arg0, local328, local56, local164, arg2.anInt2949);
				local164 += Static94.aClass200_2.method4087();
			}
		}
		if (arg2.anInt2961 == -1 && arg2.aString42 == null) {
			return;
		}
		local21 >>= 0x1;
		@Pc(383) Class2_Sub38 local383 = new Class2_Sub38(arg1);
		local383.anInt6776 = local250;
		local383.anInt6778 = local254;
		local383.anInt6775 = local33 - local21;
		local383.anInt6768 = local21 + local33;
		local383.anInt6771 = local36 - local21;
		local383.anInt6779 = local248;
		local383.anInt6774 = local36 + local21;
		local383.anInt6773 = local252;
		Static177.aClass70_9.method1269(local383);
	}
}
