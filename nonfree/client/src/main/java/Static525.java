import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array16;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_147 = new Class67("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZ)V")
	public static void method7528(@OriginalArg(1) boolean arg0) {
		Static5.anInt459 = 0;
		Static329.anInt6289 = 0;
		Static339.method4760();
		Static321.method5157(arg0);
		Static267.method4686();
		@Pc(18) boolean local18 = false;
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static5.anInt459; local26++) {
			local32 = Static46.anIntArray144[local26];
			@Pc(39) Class3_Sub3 local39 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local32);
			@Pc(42) Class6_Sub1_Sub2_Sub2 local42 = local39.aClass6_Sub1_Sub2_Sub2_1;
			if (Static228.aBoolean342 && Static176.method3398(local32)) {
				Static195.method3710();
			}
			if (Static223.anInt4829 != local42.lb) {
				if (local42.aClass230_1.method5894()) {
					Static299.method4967(local42);
				}
				local42.method7096(null);
				local18 = true;
				local39.method7820();
			}
		}
		if (local18) {
			Static183.anInt5938 = Static240.aClass267_20.method6641();
			Static240.aClass267_20.method6639(Static47.aClass3_Sub3Array4);
		}
		if (Static90.aClass3_Sub27_Sub1_1.anInt9191 != Static35.anInt921) {
			throw new RuntimeException("gnp1 pos:" + Static90.aClass3_Sub27_Sub1_1.anInt9191 + " psize:" + Static35.anInt921);
		}
		for (local32 = 0; local32 < Static221.anInt4798; local32++) {
			if (Static240.aClass267_20.method6644((long) Static3.anIntArray80[local32]) == null) {
				throw new RuntimeException("gnp2 pos:" + local32 + " size:" + Static221.anInt4798);
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!kr;Z)V")
	public static void method7530(@OriginalArg(0) Class3_Sub27_Sub1 arg0) {
		arg0.method4533();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static235.anInt2721; local12++) {
			local18 = Static130.anIntArray267[local12];
			if ((Static548.aByteArray118[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static548.aByteArray118[local18] = (byte) (Static548.aByteArray118[local18] | 0x2);
					local10--;
				} else {
					local43 = arg0.method4536(1);
					if (local43 == 0) {
						local10 = Static478.method7103(arg0);
						Static548.aByteArray118[local18] = (byte) (Static548.aByteArray118[local18] | 0x2);
					} else {
						Static519.method7389(arg0, local18);
					}
				}
			}
		}
		arg0.method4535();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4533();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static235.anInt2721; local18++) {
			local43 = Static130.anIntArray267[local18];
			if ((Static548.aByteArray118[local43] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static548.aByteArray118[local43] = (byte) (Static548.aByteArray118[local43] | 0x2);
				} else {
					local124 = arg0.method4536(1);
					if (local124 == 0) {
						local10 = Static478.method7103(arg0);
						Static548.aByteArray118[local43] = (byte) (Static548.aByteArray118[local43] | 0x2);
					} else {
						Static519.method7389(arg0, local43);
					}
				}
			}
		}
		arg0.method4535();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4533();
		@Pc(202) int local202;
		for (local43 = 0; local43 < Static451.anInt8227; local43++) {
			local124 = Static305.anIntArray535[local43];
			if ((Static548.aByteArray118[local124] & 0x1) != 0) {
				if (local10 > 0) {
					Static548.aByteArray118[local124] = (byte) (Static548.aByteArray118[local124] | 0x2);
					local10--;
				} else {
					local202 = arg0.method4536(1);
					if (local202 == 0) {
						local10 = Static478.method7103(arg0);
						Static548.aByteArray118[local124] = (byte) (Static548.aByteArray118[local124] | 0x2);
					} else if (Static441.method6651(local124, arg0)) {
						Static548.aByteArray118[local124] = (byte) (Static548.aByteArray118[local124] | 0x2);
					}
				}
			}
		}
		arg0.method4535();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4533();
		for (local124 = 0; local124 < Static451.anInt8227; local124++) {
			local202 = Static305.anIntArray535[local124];
			if ((Static548.aByteArray118[local202] & 0x1) == 0) {
				if (local10 > 0) {
					Static548.aByteArray118[local202] = (byte) (Static548.aByteArray118[local202] | 0x2);
					local10--;
				} else {
					@Pc(289) int local289 = arg0.method4536(1);
					if (local289 == 0) {
						local10 = Static478.method7103(arg0);
						Static548.aByteArray118[local202] = (byte) (Static548.aByteArray118[local202] | 0x2);
					} else if (Static441.method6651(local202, arg0)) {
						Static548.aByteArray118[local202] = (byte) (Static548.aByteArray118[local202] | 0x2);
					}
				}
			}
		}
		arg0.method4535();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static235.anInt2721 = 0;
		Static451.anInt8227 = 0;
		for (local202 = 1; local202 < 2048; local202++) {
			Static548.aByteArray118[local202] = (byte) (Static548.aByteArray118[local202] >> 1);
			@Pc(367) Class6_Sub1_Sub2_Sub1 local367 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local202];
			if (local367 == null) {
				Static305.anIntArray535[Static451.anInt8227++] = local202;
			} else {
				Static130.anIntArray267[Static235.anInt2721++] = local202;
			}
		}
	}
}
