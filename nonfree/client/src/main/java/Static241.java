import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIILclient!nk;Lclient!kf;IB)V", line = 18)
	public static void method6250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class161 arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) int arg7) {
		@Pc(19) int local19 = arg2 * arg2 + arg3 * arg3;
		if (local19 > arg1) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg5.anInt4242 / 2, arg5.anInt4255 / 2);
		if (local37 * local37 >= local19) {
			Static351.method6289(arg6, arg2, arg7, arg3, Static116.aClass13Array10[arg0], arg4, arg5);
			return;
		}
		local37 -= 10;
		@Pc(66) int local66;
		if (Static291.anInt5899 == 4) {
			local66 = (int) Class187.aFloat66 & 0x3FFF;
		} else {
			local66 = (int) Class187.aFloat66 + Class2_Sub3_Sub1.anInt158 & 0x3FFF;
		}
		@Pc(77) int local77 = Class19.anIntArray178[local66];
		@Pc(81) int local81 = Class19.anIntArray177[local66];
		if (Static291.anInt5899 != 4) {
			local77 = local77 * 256 / (Class71.anInt2003 + 256);
			local81 = local81 * 256 / (Class71.anInt2003 + 256);
		}
		@Pc(112) int local112 = local81 * arg2 + arg3 * local77 >> 15;
		@Pc(123) int local123 = arg3 * local81 - arg2 * local77 >> 15;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) (Math.sin(local129) * (double) local37);
		@Pc(143) int local143 = (int) ((double) local37 * Math.cos(local129));
		Static109.aClass13Array8[arg0].method6387((float) arg5.anInt4242 / 2.0F + (float) arg7 + (float) local136, (float) -local143 + (float) arg5.anInt4255 / 2.0F + (float) arg4, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!qg;)V", line = 76)
	public static void method6253(@OriginalArg(1) Class2_Sub4_Sub2 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Class218.anInt6067; local15++) {
			@Pc(21) int local21 = Class2_Sub2_Sub5.anIntArray100[local15];
			@Pc(25) Class11_Sub5_Sub2_Sub1 local25 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local21];
			@Pc(29) int local29 = arg0.method4816();
			if ((local29 & 0x2) != 0) {
				local29 += arg0.method4816() << 8;
			}
			Static280.method5213(arg0, local21, local25, local29);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 105)
	public static void method6254(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static163.method1511(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static319.method5154(local7);
			local7 = Static187.method3648(local7, "%3a", ":");
			local7 = Static187.method3648(local7, "%40", "@");
			local7 = Static187.method3648(local7, "%26", "&");
			local7 = Static187.method3648(local7, "%23", "#");
			if (Static366.aClass152_6.anApplet1 != null) {
				@Pc(103) Class32 local103 = Static366.aClass152_6.method3767(new URL(Static366.aClass152_6.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static254.anInt5105 + "&u=" + Static224.aLong130 + "&v1=" + Static200.aString33 + "&v2=" + Static200.aString34 + "&e=" + local7));
				while (local103.anInt992 == 0) {
					Static214.method4024(1L);
				}
				if (local103.anInt992 == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local103.anObject2;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 167)
	public static void method6255() {
		Static202.method3796(Static203.aClass177_Sub1_2.anInt4873);
		@Pc(18) int local18 = (Static127.anInt6765 >> 10) + (Static154.anInt3136 >> 3);
		@Pc(27) int local27 = (Static197.anInt3773 >> 10) + (Static139.anInt2716 >> 3);
		Static330.anInt6573 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 = 0;
		Static17.aClass11_Sub5_Sub2_Sub1_3.method4065(8, 8);
		Static48.anIntArray98 = new int[18];
		Static99.aByteArrayArray6 = new byte[18][];
		Static215.aByteArrayArray9 = new byte[18][];
		Static78.aByteArrayArray5 = new byte[18][];
		Static58.anIntArray155 = new int[18];
		Static248.aByteArrayArray15 = new byte[18][];
		Static177.anIntArray208 = new int[18];
		Static206.anIntArray314 = new int[18];
		Static196.aByteArrayArray7 = new byte[18][];
		Static349.anIntArray480 = new int[18];
		Static268.anIntArray372 = new int[18];
		Static254.anIntArrayArray43 = new int[18][4];
		@Pc(78) int local78 = 0;
		@Pc(97) int local97;
		for (@Pc(87) int local87 = (local18 - (Class241.anInt7020 >> 4)) / 8; local87 <= ((Class241.anInt7020 >> 4) + local18) / 8; local87++) {
			for (local97 = (local27 - (OutputStream_Sub1.anInt4442 >> 4)) / 8; local97 <= (local27 + (OutputStream_Sub1.anInt4442 >> 4)) / 8; local97++) {
				@Pc(105) int local105 = local97 + (local87 << 8);
				Static268.anIntArray372[local78] = local105;
				Static206.anIntArray314[local78] = Static265.aClass197_70.method5076("m" + local87 + "_" + local97);
				Static349.anIntArray480[local78] = Static265.aClass197_70.method5076("l" + local87 + "_" + local97);
				Static177.anIntArray208[local78] = Static265.aClass197_70.method5076("n" + local87 + "_" + local97);
				Static48.anIntArray98[local78] = Static265.aClass197_70.method5076("um" + local87 + "_" + local97);
				Static58.anIntArray155[local78] = Static265.aClass197_70.method5076("ul" + local87 + "_" + local97);
				if (Static177.anIntArray208[local78] == -1) {
					Static206.anIntArray314[local78] = -1;
					Static349.anIntArray480[local78] = -1;
					Static48.anIntArray98[local78] = -1;
					Static58.anIntArray155[local78] = -1;
				}
				local78++;
			}
		}
		for (local97 = local78; local97 < Static177.anIntArray208.length; local97++) {
			Static177.anIntArray208[local97] = -1;
			Static206.anIntArray314[local97] = -1;
			Static349.anIntArray480[local97] = -1;
			Static48.anIntArray98[local97] = -1;
			Static58.anIntArray155[local97] = -1;
		}
		Static348.method6268(true, local18, false, local27);
	}
}
