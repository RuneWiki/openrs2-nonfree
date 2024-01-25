import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
	public static int anInt6521;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_138 = new Class119(69, 2);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method5066(@OriginalArg(0) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(14) int local14 = Static156.anInt3151;
		for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
			@Pc(24) Class246 local24 = Static65.aClass253_1.method5375(arg0[local16]);
			if (local24.anInt6707 != -1) {
				@Pc(36) Class8 local36 = (Class8) Static241.aClass126_28.method3141((long) local24.anInt6707);
				if (local36 == null) {
					@Pc(44) Class264 local44 = Static464.method5847(Static405.aClass32_82, local24.anInt6707, 0);
					if (local44 != null) {
						local36 = Static121.aClass172_3.method5542(local44);
						Static241.aClass126_28.method3132((long) local24.anInt6707, local36);
					}
				}
				if (local36 != null) {
					Static430.aClass8Array88[local14] = local36;
					local7.append(" <img=").append(local14).append(">");
					local14++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ln;Lclient!ck;III)V")
	public static void method5067(@OriginalArg(0) Class7_Sub2_Sub3_Sub2 arg0, @OriginalArg(1) Class3_Sub7_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if ((arg3 & 0x1) != 0) {
			local14 = arg1.method2582();
			@Pc(17) byte[] local17 = new byte[local14];
			@Pc(22) Class3_Sub7 local22 = new Class3_Sub7(local17);
			arg1.method2606(local17, local14);
			Static13.aClass3_Sub7Array1[arg2] = local22;
			arg0.method3523(local22);
		}
		@Pc(38) byte local38 = -1;
		if ((arg3 & 0x40) != 0) {
			arg0.anInt4443 = arg1.method2588();
			if (arg0.anInt4404 == 0) {
				arg0.method3506(arg0.anInt4443);
				arg0.anInt4443 = -1;
			}
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		if ((arg3 & 0x4000) != 0) {
			local14 = Static253.anInt4787;
			local71 = arg1.method2638();
			local75 = arg1.method2584();
			arg0.method3502(local71, local14, local75);
		}
		if ((arg3 & 0x10000) != 0) {
			local14 = arg1.method2598();
			if (local14 == 65535) {
				local14 = -1;
			}
			local71 = arg1.method2596();
			local75 = arg1.method2582();
			arg0.method3500(local75, local14, local71, true);
		}
		if ((arg3 & 0x1000) != 0) {
			arg0.aBoolean380 = arg1.method2582() == 1;
		}
		if ((arg3 & 0x80) != 0) {
			local14 = arg1.method2638();
			local71 = arg1.method2582();
			arg0.method3502(local14, Static253.anInt4787, local71);
			arg0.anInt4344 = Static253.anInt4787 + 300;
			arg0.anInt4376 = arg1.method2582();
		}
		if ((arg3 & 0x10) != 0) {
			Static329.aByteArray76[arg2] = arg1.method2619();
		}
		if ((arg3 & 0x8) != 0) {
			local14 = arg1.method2635();
			local71 = arg1.method2637();
			local75 = arg1.method2639();
			@Pc(194) int local194 = arg1.anInt3235;
			@Pc(202) boolean local202 = (local14 & 0x8000) != 0;
			if (arg0.aString36 != null && arg0.aClass206_1 != null) {
				@Pc(210) boolean local210 = false;
				if (local71 <= 1) {
					if (!local202 && (Static388.aBoolean561 && !Static331.aBoolean651 || Static338.aBoolean492)) {
						local210 = true;
					} else if (Static2.method9(arg0.aString36)) {
						local210 = true;
					}
				}
				if (!local210 && Static391.anInt6727 == 0) {
					Static356.aClass3_Sub7_5.anInt3235 = 0;
					arg1.method2606(Static356.aClass3_Sub7_5.aByteArray46, local75);
					Static356.aClass3_Sub7_5.anInt3235 = 0;
					@Pc(253) int local253 = -1;
					@Pc(272) String local272;
					if (local202) {
						local14 &= 0x7FFF;
						@Pc(263) Class27 local263 = Static111.method1886(Static356.aClass3_Sub7_5);
						local253 = local263.anInt1018;
						local272 = local263.aClass3_Sub4_Sub15_1.method5180(Static356.aClass3_Sub7_5);
					} else {
						local272 = Static249.method3737(Static337.method4506(Static356.aClass3_Sub7_5));
					}
					arg0.aString35 = local272.trim();
					arg0.anInt4377 = local14 & 0xFF;
					arg0.anInt4335 = 150;
					arg0.anInt4367 = local14 >> 8;
					@Pc(312) int local312;
					if (local71 == 1 || local71 == 2) {
						local312 = local202 ? 17 : 1;
					} else {
						local312 = local202 ? 17 : 2;
					}
					if (local71 == 2) {
						Static416.method5338(local272, local312, local253, null, "<img=1>" + arg0.method3522(), "<img=1>" + arg0.method3525(), 0);
					} else if (local71 == 1) {
						Static416.method5338(local272, local312, local253, null, "<img=0>" + arg0.method3522(), "<img=0>" + arg0.method3525(), 0);
					} else {
						Static416.method5338(local272, local312, local253, null, arg0.method3522(), arg0.method3525(), 0);
					}
				}
			}
			arg1.anInt3235 = local75 + local194;
		}
		if ((arg3 & 0x8000) != 0) {
			local38 = arg1.method2612();
		}
		if ((arg3 & 0x100) != 0) {
			arg0.aString35 = arg1.method2620();
			if (arg0.aString35.charAt(0) == '~') {
				arg0.aString35 = arg0.aString35.substring(1);
				Static301.method1894(0, 2, arg0.aString35, arg0.method3525(), arg0.method3522());
			} else if (Static379.aClass7_Sub2_Sub3_Sub2_2 == arg0) {
				Static301.method1894(0, 2, arg0.aString35, arg0.method3525(), arg0.method3522());
			}
			arg0.anInt4377 = 0;
			arg0.anInt4335 = 150;
			arg0.anInt4367 = 0;
		}
		if ((arg3 & 0x20000) != 0) {
			local14 = arg1.method2637();
			@Pc(489) int[] local489 = new int[local14];
			@Pc(492) int[] local492 = new int[local14];
			@Pc(495) int[] local495 = new int[local14];
			for (@Pc(497) int local497 = 0; local497 < local14; local497++) {
				@Pc(504) int local504 = arg1.method2598();
				if (local504 == 65535) {
					local504 = -1;
				}
				local489[local497] = local504;
				local492[local497] = arg1.method2639();
				local495[local497] = arg1.method2635();
			}
			Static370.method4859(local489, arg0, local492, local495);
		}
		if ((arg3 & 0x800) != 0) {
			arg0.anInt4372 = arg1.method2612();
			arg0.anInt4343 = arg1.method2619();
			arg0.anInt4378 = arg1.method2612();
			arg0.anInt4394 = arg1.method2630();
			arg0.anInt4339 = arg1.method2588() + Static253.anInt4787;
			arg0.anInt4398 = arg1.method2588() + Static253.anInt4787;
			arg0.anInt4393 = arg1.method2637();
			if (arg0.aBoolean381) {
				arg0.anInt4404 = 0;
				arg0.anInt4372 += arg0.anInt4441;
				arg0.anInt4394 += arg0.anInt4425;
				arg0.anInt4378 += arg0.anInt4441;
				arg0.anInt4343 += arg0.anInt4425;
			} else {
				arg0.anInt4404 = 1;
				arg0.anInt4372 += arg0.anIntArray287[0];
				arg0.anInt4394 += arg0.anIntArray288[0];
				arg0.anInt4378 += arg0.anIntArray287[0];
				arg0.anInt4343 += arg0.anIntArray288[0];
			}
			arg0.anInt4403 = 0;
		}
		if ((arg3 & 0x4) != 0) {
			local14 = arg1.method2593();
			if (local14 == 65535) {
				local14 = -1;
			}
			local71 = arg1.method2637();
			Static323.method842(local71, arg0, local14);
		}
		if ((arg3 & 0x20) != 0) {
			local14 = arg1.method2593();
			if (local14 == 65535) {
				local14 = -1;
			}
			arg0.anInt4332 = local14;
		}
		if ((arg3 & 0x2000) != 0) {
			local14 = arg1.method2588();
			arg0.anInt4383 = arg1.method2584();
			arg0.anInt4358 = arg1.method2639();
			arg0.anInt4337 = local14 & 0x7FFF;
			arg0.aBoolean377 = (local14 & 0x8000) != 0;
			arg0.anInt4334 = arg0.anInt4337 + Static253.anInt4787 + arg0.anInt4383;
		}
		if ((arg3 & 0x40000) != 0) {
			arg0.aByte80 = arg1.method2619();
			arg0.aByte81 = arg1.method2630();
			arg0.aByte78 = arg1.method2619();
			arg0.aByte79 = (byte) arg1.method2639();
			arg0.anInt4361 = Static253.anInt4787 + arg1.method2635();
			arg0.anInt4365 = Static253.anInt4787 + arg1.method2593();
		}
		if ((arg3 & 0x400) != 0) {
			local14 = arg1.method2593();
			if (local14 == 65535) {
				local14 = -1;
			}
			local71 = arg1.method2616();
			local75 = arg1.method2637();
			arg0.method3500(local75, local14, local71, false);
		}
		if (!arg0.aBoolean381) {
			return;
		}
		if (local38 == 127) {
			arg0.method3517(arg0.anInt4441, arg0.anInt4425);
			return;
		}
		@Pc(846) byte local846;
		if (local38 == -1) {
			local846 = Static329.aByteArray76[arg2];
		} else {
			local846 = local38;
		}
		arg0.method3518(arg0.anInt4425, arg0.anInt4441, local846);
	}
}
