import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "J")
	public static long aLong269 = 0L;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!gga;Lclient!gga;)V")
	public static void method7736(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_285 != null) {
			arg1.method7825();
		}
		arg1.aClass3_286 = arg0;
		arg1.aClass3_285 = arg0.aClass3_285;
		arg1.aClass3_285.aClass3_286 = arg1;
		arg1.aClass3_286.aClass3_285 = arg1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7737(@OriginalArg(1) String arg0) {
		if (!Static369.aBoolean463 || (Static215.anInt3875 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static403.anInt6982;
		@Pc(18) int[] local18 = Static430.anIntArray447;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class41_Sub2_Sub1_Sub4_Sub2 local28 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local18[local20]];
			if (local28.aString95 != null && local28.aString95.equalsIgnoreCase(arg0) && (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == local28 && (Static215.anInt3875 & 0x10) != 0 || local28 != null && (Static215.anInt3875 & 0x8) != 0)) {
				@Pc(64) Class3_Sub42 local64 = Static591.method7910(Static9.aClass199_3, Static315.aClass303_61);
				local64.aClass3_Sub11_Sub1_1.method5176(local18[local20]);
				local64.aClass3_Sub11_Sub1_1.method5200(Static28.anInt515);
				local64.aClass3_Sub11_Sub1_1.method5177(0);
				local64.aClass3_Sub11_Sub1_1.method5200(Static196.anInt9125);
				local64.aClass3_Sub11_Sub1_1.method5223(Static377.anInt6474);
				Static511.method6885(local64);
				Static492.method6667(0, 0, -2, local28.method7858(), local28.method7858(), local28.anIntArray629[0], true, local28.anIntArray628[0]);
				local14 = true;
				break;
			}
		}
		if (!local14) {
			Static550.method7295(Static544.aClass343_25.method7222(Static256.anInt4535) + arg0);
		}
		if (Static369.aBoolean463) {
			Static296.method4392();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZIZLjava/lang/String;Ljava/lang/String;)V")
	public static void method7738(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static259.aClass322_90.anInt8219 = 1;
		@Pc(11) String local11 = arg4.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg2 != -1) {
			@Pc(26) Class10 local26 = Static137.aClass124_1.method3255(arg2);
			if (local26 == null || arg1 != local26.method151()) {
				return;
			}
			if (local26.method151()) {
				local18 = local26.aString1;
			} else {
				local16 = local26.anInt193;
			}
		}
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < Static6.aClass92_1.anInt2968; local50++) {
			@Pc(62) Class197 local62 = Static6.aClass92_1.method2673(local50);
			if ((!arg3 || local62.aBoolean386) && local62.anInt5214 == -1 && local62.anInt5211 == -1 && local62.anInt5221 == 0 && local62.aString38.toLowerCase().indexOf(local11) != -1) {
				if (arg2 != -1) {
					if (arg1) {
						if (!arg5.equals(local62.method4528(arg2, local18))) {
							continue;
						}
					} else if (arg0 != local62.method4527(local16, arg2)) {
						continue;
					}
				}
				if (local48 >= 250) {
					Static132.anInt9446 = -1;
					Static184.aShortArray46 = null;
					return;
				}
				if (local48 >= local14.length) {
					@Pc(142) short[] local142 = new short[local14.length * 2];
					for (@Pc(144) int local144 = 0; local144 < local48; local144++) {
						local142[local144] = local14[local144];
					}
					local14 = local142;
				}
				local14[local48++] = (short) local50;
			}
		}
		Static132.anInt9446 = local48;
		Static67.anInt1539 = 0;
		Static184.aShortArray46 = local14;
		@Pc(186) String[] local186 = new String[Static132.anInt9446];
		for (@Pc(188) int local188 = 0; local188 < Static132.anInt9446; local188++) {
			local186[local188] = Static6.aClass92_1.method2673(local14[local188]).aString38;
		}
		Static106.method1895(local186, Static184.aShortArray46);
		Static259.aClass322_90.method6815();
		Static259.aClass322_90.anInt8219 = 2;
	}
}
