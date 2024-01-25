import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public static int anInt8388;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "J")
	public static long aLong276;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
	public static int[] anIntArray460 = new int[2];

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	public static int anInt8391 = -1;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	public static int anInt8392 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[IBI)V")
	public static void method7040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(8) int local8 = arg3 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg1 < local11) {
			@Pc(23) int local23 = arg1 + 1;
			arg2[local23] = arg0;
			@Pc(28) int local28 = local23 + 1;
			arg2[local28] = arg0;
			@Pc(33) int local33 = local28 + 1;
			arg2[local33] = arg0;
			@Pc(38) int local38 = local33 + 1;
			arg2[local38] = arg0;
			@Pc(43) int local43 = local38 + 1;
			arg2[local43] = arg0;
			@Pc(48) int local48 = local43 + 1;
			arg2[local48] = arg0;
			@Pc(53) int local53 = local48 + 1;
			arg2[local53] = arg0;
			arg1 = local53 + 1;
			arg2[arg1] = arg0;
		}
		while (local8 > arg1) {
			arg1++;
			arg2[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method7041() {
		if (Static678.aClass28ArrayArray5 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < Static678.aClass28ArrayArray5.length; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static678.aClass28ArrayArray5[local13].length; local17++) {
				Static678.aClass28ArrayArray5[local13][local17] = Static3.aClass28_1;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7042(@OriginalArg(0) Class67 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static178.aBoolean264) {
			local7 = Static448.method6652();
			local9 = Static143.method2382();
		}
		Static512.method7317(Static655.anInt10491, Static121.anInt2335 + local7, local9 + Static65.anInt1025, Static188.anInt3322, arg0);
		Static427.aClass44_34.method8129(-10660793, Static476.aClass279_24.method6992(Static141.anInt2658), -1, local7 + Static121.anInt2335 + 3, local9 + Static65.anInt1025 - -14);
		@Pc(58) int local58 = local7 + Static714.aClass161_1.method8581();
		@Pc(64) int local64 = local9 + Static714.aClass161_1.method8573();
		@Pc(68) int local68;
		@Pc(87) int local87;
		if (Static367.aBoolean490) {
			local68 = 0;
			for (@Pc(75) Class3_Sub4_Sub17 local75 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7031(); local75 != null; local75 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7035()) {
				local87 = local68 * 16 + Static65.anInt1025 + local9 + 31;
				local68++;
				if (local75.anInt8611 == 1) {
					Static592.method8147(-256, local87, local9 + Static65.anInt1025, local64, Static655.anInt10491, local58, -1, arg0, Static188.anInt3322, (Class3_Sub4_Sub5) local75.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66, Static121.anInt2335 + local7);
				} else {
					Static47.method638(local58, local87, arg0, -1, local64, Static188.anInt3322, local7 + Static121.anInt2335, Static655.anInt10491, Static65.anInt1025 + local9, local75, -256);
				}
			}
			if (Static239.aClass3_Sub4_Sub17_1 != null) {
				Static512.method7317(Static618.anInt6014, Static614.anInt9938, Static725.anInt11302, Static382.anInt6839, arg0);
				Static427.aClass44_34.method8129(-10660793, Static239.aClass3_Sub4_Sub17_1.aString112, -1, Static614.anInt9938 + 3, Static725.anInt11302 + 14);
				local68 = 0;
				for (@Pc(178) Class3_Sub4_Sub5 local178 = (Class3_Sub4_Sub5) Static239.aClass3_Sub4_Sub17_1.aClass283_10.method7031(); local178 != null; local178 = (Class3_Sub4_Sub5) Static239.aClass3_Sub4_Sub17_1.aClass283_10.method7035()) {
					@Pc(190) int local190 = Static725.anInt11302 + local68 * 16 + 31;
					local68++;
					Static592.method8147(-256, local190, Static725.anInt11302, local64, Static618.anInt6014, local58, -1, arg0, Static382.anInt6839, local178, Static614.anInt9938);
				}
				Static372.method5400(Static614.anInt9938, Static382.anInt6839, Static618.anInt6014, Static725.anInt11302);
			}
		} else {
			local68 = 0;
			for (@Pc(233) Class3_Sub4_Sub5 local233 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local233 != null; local233 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
				local87 = Static65.anInt1025 + local9 + (Static285.anInt5168 - (local68 + 1)) * 16 + 31;
				Static592.method8147(-256, local87, local9 + Static65.anInt1025, local64, Static655.anInt10491, local58, -1, arg0, Static188.anInt3322, local233, local7 + Static121.anInt2335);
				local68++;
			}
		}
		Static372.method5400(local7 + Static121.anInt2335, Static188.anInt3322, Static655.anInt10491, local9 + Static65.anInt1025);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7044(@OriginalArg(1) String arg0) {
		if (Class13.aString3.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class13.aString3.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class13.aString3.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
