import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method6520(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static111.aClass149_11.anInt4021 : Static111.aClass149_11.anInt4020) + local19;
		for (@Pc(38) int local38 = local19; local38 < local29; local38++) {
			@Pc(47) Class3_Sub7_Sub10 local47 = Static111.aClass149_11.method3568(local38);
			if (local47.aBoolean256 && local47.method2878().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static132.anInt9446 = -1;
					Static184.aShortArray46 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(81) short[] local81 = new short[local11.length * 2];
					for (@Pc(83) int local83 = 0; local83 < local13; local83++) {
						local81[local83] = local11[local83];
					}
					local11 = local81;
				}
				local11[local13++] = (short) local38;
			}
		}
		Static184.aShortArray46 = local11;
		Static67.anInt1539 = 0;
		Static132.anInt9446 = local13;
		@Pc(124) String[] local124 = new String[Static132.anInt9446];
		for (@Pc(126) int local126 = 0; local126 < Static132.anInt9446; local126++) {
			local124[local126] = Static111.aClass149_11.method3568(local11[local126]).method2878();
		}
		Static106.method1895(local124, Static184.aShortArray46);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!tf;IB)Lclient!ss;")
	public static Class3_Sub7_Sub17 method6521(@OriginalArg(0) int arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class3_Sub11 local14 = new Class3_Sub11(arg1.method6802(arg0, arg2));
		@Pc(45) Class3_Sub7_Sub17 local45 = new Class3_Sub7_Sub17(arg2, local14.method5181(), local14.method5181(), local14.method5186(), local14.method5186(), local14.method5175() == 1, local14.method5175(), local14.method5175());
		@Pc(54) int local54 = local14.method5175();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local45.aClass112_60.method3079(new Class3_Sub33(local14.method5175(), local14.method5198(), local14.method5198(), local14.method5198(), local14.method5198(), local14.method5198(), local14.method5198(), local14.method5198(), local14.method5198()));
		}
		local45.method6701();
		return local45;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	public static void method6522() {
		if (Static215.aClass151_1 != null) {
			Static143.aClass275_1 = new Class275();
			Static143.aClass275_1.method6100(Static215.aClass151_1.aClass343_2.method7222(Static256.anInt4535), Static574.aLong266, Static215.aClass151_1.anInt4131, Static215.aClass151_1);
			Static396.aThread3 = new Thread(Static143.aClass275_1, "");
			Static396.aThread3.start();
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	public static void method6523() {
		Static173.aClass116_1.method3128();
	}
}
