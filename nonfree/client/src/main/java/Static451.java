import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "[Lclient!rba;")
	public static Class16_Sub1[] aClass16_Sub1Array3;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "[I")
	public static final int[] anIntArray502 = new int[25];

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	public static final int anInt7363 = 1338;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLclient!ria;)V")
	public static void method6419(@OriginalArg(1) Class303 arg0) {
		if (!Static557.aBoolean660) {
			return;
		}
		if (arg0.anObjectArray28 != null) {
			@Pc(14) Class303 local14 = Static71.method1631(Static252.anInt4804, Static454.anInt7419);
			if (local14 != null) {
				@Pc(20) Class2_Sub18 local20 = new Class2_Sub18();
				local20.aClass303_5 = local14;
				local20.aClass303_4 = arg0;
				local20.anObjectArray1 = arg0.anObjectArray28;
				Static156.method2728(local20);
			}
		}
		@Pc(41) Class2_Sub31 local41 = Static275.method4480(Static640.aClass314_2, Static338.aClass145_102);
		local41.aClass2_Sub17_Sub1_2.method2827(arg0.anInt7962);
		local41.aClass2_Sub17_Sub1_2.method2883(Static252.anInt4804);
		local41.aClass2_Sub17_Sub1_2.method2879(arg0.anInt7983);
		local41.aClass2_Sub17_Sub1_2.method2827(Static454.anInt7419);
		local41.aClass2_Sub17_Sub1_2.method2870(Static264.anInt4966);
		local41.aClass2_Sub17_Sub1_2.method2879(arg0.anInt7964);
		Static526.method7309(local41);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!ei;ILclient!rl;II)V")
	public static void method6420(@OriginalArg(0) Class2_Sub17_Sub1 arg0, @OriginalArg(2) Class16_Sub1_Sub1_Sub3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(25) int[] local25;
		@Pc(28) int[] local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		if ((arg2 & 0x8000) != 0) {
			local22 = arg0.method2865();
			local25 = new int[local22];
			local28 = new int[local22];
			@Pc(31) int[] local31 = new int[local22];
			for (local33 = 0; local33 < local22; local33++) {
				local38 = arg0.method2825();
				if (local38 == 65535) {
					local38 = -1;
				}
				local25[local33] = local38;
				local28[local33] = arg0.method2865();
				local31[local33] = arg0.method2863();
			}
			Static329.method5018(local28, arg1, local31, local25);
		}
		@Pc(71) byte local71 = -1;
		if ((arg2 & 0x8) != 0) {
			Static645.aByteArray107[arg3] = arg0.method2886();
		}
		if ((arg2 & 0x200) != 0) {
			local71 = arg0.method2852();
		}
		if ((arg2 & 0x800) != 0) {
			local22 = arg0.method2863();
			arg1.anInt8069 = arg0.method2859();
			arg1.anInt8103 = arg0.method2888();
			arg1.aBoolean586 = (local22 & 0x8000) != 0;
			arg1.anInt8076 = local22 & 0x7FFF;
			arg1.anInt8082 = arg1.anInt8069 + Static389.anInt6694 + arg1.anInt8076;
		}
		@Pc(164) int local164;
		@Pc(168) int local168;
		@Pc(172) int local172;
		if ((arg2 & 0x80) != 0) {
			local22 = arg0.method2825();
			if (local22 == 65535) {
				local22 = -1;
			}
			local164 = arg0.method2830();
			local168 = arg0.method2888();
			local172 = local168 & 0x7;
			local33 = local168 >> 3 & 0xF;
			if (local33 == 15) {
				local33 = -1;
			}
			arg1.method7012(local22, local33, local164, local172, false);
		}
		if ((arg2 & 0x40) != 0) {
			arg1.anInt8170 = arg0.method2825();
			if (arg1.anInt8133 == 0) {
				arg1.method7003(arg1.anInt8170);
				arg1.anInt8170 = -1;
			}
		}
		if ((arg2 & 0x10000) != 0) {
			local22 = arg0.method2888();
			local25 = new int[local22];
			local28 = new int[local22];
			for (local172 = 0; local172 < local22; local172++) {
				local33 = arg0.method2825();
				if ((local33 & 0xC000) == 49152) {
					local38 = arg0.method2825();
					local25[local172] = local38 | local33 << 16;
				} else {
					local25[local172] = local33;
				}
				local28[local172] = arg0.method2876();
			}
			arg1.method7010(local25, local28);
		}
		if ((arg2 & 0x2) != 0) {
			local22 = arg0.method2865();
			if (local22 > 0) {
				for (local164 = 0; local164 < local22; local164++) {
					local172 = -1;
					local33 = -1;
					local168 = arg0.method2853();
					local38 = -1;
					if (local168 == 32767) {
						local168 = arg0.method2853();
						local33 = arg0.method2853();
						local172 = arg0.method2853();
						local38 = arg0.method2853();
					} else if (local168 == 32766) {
						local168 = -1;
					} else {
						local33 = arg0.method2853();
					}
					@Pc(345) int local345 = arg0.method2853();
					@Pc(349) int local349 = arg0.method2859();
					arg1.method7008(local172, local349, local33, Static389.anInt6694, local345, local168, local38);
				}
			}
		}
		if ((arg2 & 0x4000) != 0) {
			local22 = arg0.method2854();
			if (local22 == 65535) {
				local22 = -1;
			}
			local164 = arg0.method2881();
			local168 = arg0.method2842();
			local172 = local168 & 0x7;
			local33 = local168 >> 3 & 0xF;
			if (local33 == 15) {
				local33 = -1;
			}
			arg1.method7012(local22, local33, local164, local172, true);
		}
		if ((arg2 & 0x1) != 0) {
			@Pc(420) int[] local420 = new int[4];
			for (local164 = 0; local164 < 4; local164++) {
				local420[local164] = arg0.method2854();
				if (local420[local164] == 65535) {
					local420[local164] = -1;
				}
			}
			local168 = arg0.method2842();
			Static554.method7824(arg1, local168, local420);
		}
		if ((arg2 & 0x40000) != 0) {
			arg1.aByte112 = arg0.method2838();
			arg1.aByte114 = arg0.method2886();
			arg1.aByte111 = arg0.method2886();
			arg1.aByte115 = (byte) arg0.method2842();
			arg1.anInt8097 = Static389.anInt6694 + arg0.method2876();
			arg1.anInt8101 = Static389.anInt6694 + arg0.method2876();
		}
		if ((arg2 & 0x2000) != 0) {
			arg1.aString81 = arg0.method2833();
			if (arg1.aString81.charAt(0) == '~') {
				arg1.aString81 = arg1.aString81.substring(1);
				Static107.method1973(arg1.aString81, 0, arg1.method7015(), arg1.method7018(), 2, arg1.aString83);
			} else if (arg1 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1) {
				Static107.method1973(arg1.aString81, 0, arg1.method7015(), arg1.method7018(), 2, arg1.aString83);
			}
			arg1.anInt8125 = 150;
			arg1.anInt8107 = 0;
			arg1.anInt8091 = 0;
		}
		if ((arg2 & 0x1000) != 0) {
			arg1.aBoolean592 = arg0.method2865() == 1;
		}
		if ((arg2 & 0x4) != 0) {
			local22 = arg0.method2842();
			@Pc(589) byte[] local589 = new byte[local22];
			@Pc(594) Class2_Sub17 local594 = new Class2_Sub17(local589);
			arg0.method2847(local589, local22);
			Static365.aClass2_Sub17Array1[arg3] = local594;
			arg1.method7023(local594);
		}
		if ((arg2 & 0x20) != 0) {
			local22 = arg0.method2863();
			if (local22 == 65535) {
				local22 = -1;
			}
			arg1.anInt8100 = local22;
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt8071 = arg0.method2852();
			arg1.anInt8050 = arg0.method2838();
			arg1.anInt8054 = arg0.method2838();
			arg1.anInt8118 = arg0.method2852();
			arg1.anInt8117 = arg0.method2863() + Static389.anInt6694;
			arg1.anInt8064 = arg0.method2876() + Static389.anInt6694;
			arg1.anInt8056 = arg0.method2859();
			if (arg1.aBoolean591) {
				arg1.anInt8133 = 0;
				arg1.anInt8118 += arg1.anInt8151;
				arg1.anInt8050 += arg1.anInt8151;
				arg1.anInt8054 += arg1.anInt8155;
				arg1.anInt8071 += arg1.anInt8155;
			} else {
				arg1.anInt8133 = 1;
				arg1.anInt8118 += arg1.anIntArray594[0];
				arg1.anInt8050 += arg1.anIntArray594[0];
				arg1.anInt8071 += arg1.anIntArray595[0];
				arg1.anInt8054 += arg1.anIntArray595[0];
			}
			arg1.anInt8135 = 0;
		}
		if (!arg1.aBoolean591) {
			return;
		}
		if (local71 == 127) {
			arg1.method7017(arg1.anInt8155, arg1.anInt8151);
			return;
		}
		@Pc(772) byte local772;
		if (local71 == -1) {
			local772 = Static645.aByteArray107[arg3];
		} else {
			local772 = local71;
		}
		Static489.method7361(local772, arg1);
		arg1.method7019(arg1.anInt8155, arg1.anInt8151, local772);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
	public static boolean method6421(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static113.aBoolean192) {
			return false;
		}
		@Pc(11) int local11 = arg1 >> 16;
		@Pc(20) int local20 = arg1 & 0xFFFF;
		if (Static261.aClass303ArrayArray1[local11] == null || Static261.aClass303ArrayArray1[local11][local20] == null) {
			return false;
		}
		@Pc(38) Class303 local38 = Static261.aClass303ArrayArray1[local11][local20];
		@Pc(53) Class2_Sub7_Sub21 local53;
		if (arg0 == -1 && local38.anInt7935 == 0) {
			for (local53 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local53 != null; local53 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
				if (local53.anInt10014 == 6 || local53.anInt10014 == 1007 || local53.anInt10014 == 51 || local53.anInt10014 == 23 || local53.anInt10014 == 3) {
					for (@Pc(146) Class303 local146 = Static43.method1101(local53.anInt10016); local146 != null; local146 = Static436.method6287(local146)) {
						if (local146.anInt7962 == local38.anInt7962) {
							return true;
						}
					}
				}
			}
		} else {
			for (local53 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local53 != null; local53 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
				if (arg0 == local53.anInt10011 && local38.anInt7962 == local53.anInt10016 && (local53.anInt10014 == 6 || local53.anInt10014 == 1007 || local53.anInt10014 == 51 || local53.anInt10014 == 23 || local53.anInt10014 == 3)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public static void method6423(@OriginalArg(0) int arg0, @OriginalArg(1) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static518.anInt8368 == 1) {
			Static613.aClass13_82.method8085(arg1, arg0, Static239.anInt4434, Static326.anInt5718);
		} else {
			Static613.aClass13_82.method8085(arg1, arg0, 0, 0);
		}
	}
}
