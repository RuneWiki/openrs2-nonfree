import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!d;")
	public static Interface5 anInterface5_10;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZLjava/lang/String;IILclient!ha;I)V")
	public static void method6472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class16 arg4, @OriginalArg(7) int arg5) {
		if (Static636.aClass102_38 == null || Static606.aClass102_36 == null) {
			if (Static235.aClass143_57.method3130(Static174.anInt9096) && Static235.aClass143_57.method3130(Static309.anInt5701)) {
				Static636.aClass102_38 = arg4.method8132(Static683.method3275(Static235.aClass143_57, Static174.anInt9096, 0), true);
				@Pc(32) Class150 local32 = Static683.method3275(Static235.aClass143_57, Static309.anInt5701, 0);
				Static606.aClass102_36 = arg4.method8132(local32, true);
				local32.method3272();
				Static405.aClass102_32 = arg4.method8132(local32, true);
			} else {
				arg4.aa(arg0, arg3, arg5, 20, 255 - Static243.anInt4569 << 24 | Static39.anInt1157, 1);
			}
		}
		if (Static636.aClass102_38 != null && Static606.aClass102_36 != null) {
			@Pc(76) int local76 = (arg5 - Static606.aClass102_36.method6957() * 2) / Static636.aClass102_38.method6957();
			for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
				Static636.aClass102_38.method6961(Static606.aClass102_36.method6957() + arg0 + Static636.aClass102_38.method6957() * local78, arg3);
			}
			Static606.aClass102_36.method6961(arg0, arg3);
			Static405.aClass102_32.method6961(arg5 + arg0 - Static405.aClass102_32.method6957(), arg3);
		}
		Static243.aClass69_5.method7451(arg3 + 14, Static419.anInt7065 | 0xFF000000, -1, arg2, arg0 + 3);
		arg4.aa(arg0, arg3 + 20, arg5, arg1 - 20, Static39.anInt1157 | -Static243.anInt4569 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	public static boolean method6473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method6474(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = local19 + (arg1 ? Static264.aClass263_2.anInt7600 : Static264.aClass263_2.anInt7601);
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(40) Class3_Sub6_Sub1 local40 = Static264.aClass263_2.method6363(local31);
			if (local40.aBoolean103 && local40.method1165().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static505.aShortArray168 = null;
					Static380.anInt6678 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(74) short[] local74 = new short[local11.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local13; local76++) {
						local74[local76] = local11[local76];
					}
					local11 = local74;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static505.aShortArray168 = local11;
		Static380.anInt6678 = local13;
		Static341.anInt6164 = 0;
		@Pc(113) String[] local113 = new String[Static380.anInt6678];
		for (@Pc(115) int local115 = 0; local115 < Static380.anInt6678; local115++) {
			local113[local115] = Static264.aClass263_2.method6363(local11[local115]).method1165();
		}
		Static523.method4774(Static505.aShortArray168, local113);
	}
}
