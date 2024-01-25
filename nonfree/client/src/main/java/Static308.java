import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Lclient!je;")
	public static Class122 aClass122_6;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
	public static int anInt5126;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILclient!mv;Lclient!oq;I)V")
	public static void method4008(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11_Sub1 arg1, @OriginalArg(3) Class20_Sub3_Sub3_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg0 & 0x4000) != 0) {
			local7 = arg1.method4473();
		}
		if ((arg0 & 0x400) != 0) {
			arg2.aBoolean395 = arg1.method4465() == 1;
		}
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(54) int local54;
		if ((arg0 & 0x800) != 0) {
			local39 = arg1.method4485();
			local43 = arg1.method4467();
			if (local39 == 65535) {
				local39 = -1;
			}
			local54 = arg1.method4459();
			arg2.method4688(false, local43, local39, local54);
		}
		if ((arg0 & 0x1000) != 0) {
			arg2.aString53 = arg1.method4484();
			if (arg2.aString53.charAt(0) == '~') {
				arg2.aString53 = arg2.aString53.substring(1);
				Static174.method2341(2, arg2.method3871(), 0, arg2.method3880(), arg2.aString53);
			} else if (arg2 == Static239.aClass20_Sub3_Sub3_Sub1_1) {
				Static174.method2341(2, arg2.method3871(), 0, arg2.method3880(), arg2.aString53);
			}
			arg2.anInt6021 = 150;
			arg2.anInt6032 = 0;
			arg2.anInt6038 = 0;
		}
		if ((arg0 & 0x2000) != 0) {
			arg2.anInt6080 = arg1.method4475();
			arg2.anInt6034 = arg1.method4452();
			arg2.lb = arg1.method4475();
			arg2.anInt6009 = arg1.method4473();
			arg2.anInt6062 = arg1.method4486() + Static368.anInt6250;
			arg2.anInt6078 = arg1.method4486() + Static368.anInt6250;
			arg2.anInt6084 = arg1.method4463();
			arg2.anInt6087 = 0;
			if (arg2.aBoolean394) {
				arg2.anInt6088 = 0;
				arg2.anInt6080 += arg2.anInt4955;
				arg2.lb += arg2.anInt4955;
				arg2.anInt6009 += arg2.anInt4935;
				arg2.anInt6034 += arg2.anInt4935;
			} else {
				arg2.anInt6034 += arg2.anIntArray369[0];
				arg2.anInt6080 += arg2.anIntArray370[0];
				arg2.lb += arg2.anIntArray370[0];
				arg2.anInt6009 += arg2.anIntArray369[0];
				arg2.anInt6088 = 1;
			}
		}
		if ((arg0 & 0x10) != 0) {
			arg2.anInt4972 = arg1.method4497();
			if (arg2.anInt6088 == 0) {
				arg2.method4685(arg2.anInt4972);
				arg2.anInt4972 = -1;
			}
		}
		if ((arg0 & 0x4) != 0) {
			local39 = arg1.method4463();
			@Pc(286) byte[] local286 = new byte[local39];
			@Pc(291) Class1_Sub11 local291 = new Class1_Sub11(local286);
			arg1.method4468(local39, local286);
			Static72.aClass1_Sub11Array1[arg3] = local291;
			arg2.method3882(local291);
		}
		if ((arg0 & 0x100) != 0) {
			local39 = Static368.anInt6250;
			local43 = arg1.method4469();
			local54 = arg1.method4465();
			arg2.method4679(local54, local39, local43);
		}
		if ((arg0 & 0x40000) != 0) {
			local39 = arg1.method4486();
			local43 = arg1.method4458();
			if (local39 == 65535) {
				local39 = -1;
			}
			local54 = arg1.method4465();
			arg2.method4688(true, local43, local39, local54);
		}
		if ((arg0 & 0x2) != 0) {
			Static225.aByteArray38[arg3] = arg1.method4452();
		}
		if ((arg0 & 0x10000) != 0) {
			local39 = arg1.method4504();
			@Pc(384) int[] local384 = new int[local39];
			@Pc(387) int[] local387 = new int[local39];
			@Pc(390) int[] local390 = new int[local39];
			for (@Pc(392) int local392 = 0; local392 < local39; local392++) {
				@Pc(398) int local398 = arg1.method4485();
				if (local398 == 65535) {
					local398 = -1;
				}
				local384[local392] = local398;
				local387[local392] = arg1.method4465();
				local390[local392] = arg1.method4486();
			}
			Static106.method1488(local390, arg2, local387, local384);
		}
		if ((arg0 & 0x8000) != 0) {
			local39 = arg1.method4485();
			arg2.anInt6052 = arg1.method4504();
			arg2.anInt6027 = arg1.method4463();
			arg2.aBoolean500 = (local39 & 0x8000) != 0;
			arg2.anInt6026 = local39 & 0x7FFF;
			arg2.anInt6054 = arg2.anInt6026 + Static368.anInt6250 + arg2.anInt6052;
		}
		if ((arg0 & 0x20) != 0) {
			local39 = arg1.method4497();
			local43 = arg1.method4465();
			local54 = arg1.method4459();
			@Pc(504) int local504 = arg1.anInt5766;
			@Pc(515) boolean local515 = (local39 & 0x8000) != 0;
			if (arg2.aString48 != null && arg2.aClass45_1 != null) {
				@Pc(523) boolean local523 = false;
				if (local43 <= 1) {
					if (!local515 && (Static146.aBoolean509 && !Static136.aBoolean171 || Static158.aBoolean210)) {
						local523 = true;
					} else if (Static281.method3533(arg2.aString48)) {
						local523 = true;
					}
				}
				if (!local523 && Static445.anInt7377 == 0) {
					Static74.aClass1_Sub11_3.anInt5766 = 0;
					arg1.method4471(Static74.aClass1_Sub11_3.aByteArray64, local54);
					Static74.aClass1_Sub11_3.anInt5766 = 0;
					@Pc(566) int local566 = -1;
					@Pc(574) String local574;
					if (local515) {
						local39 &= 0x7FFF;
						@Pc(584) Class53 local584 = Static221.method2941(Static74.aClass1_Sub11_3);
						local566 = local584.anInt1435;
						local574 = local584.aClass1_Sub3_Sub17_1.method5205(Static74.aClass1_Sub11_3);
					} else {
						local574 = Static25.method476(Static124.method1717(Static74.aClass1_Sub11_3));
					}
					arg2.aString53 = local574.trim();
					arg2.anInt6021 = 150;
					arg2.anInt6032 = local39 >> 8;
					arg2.anInt6038 = local39 & 0xFF;
					@Pc(624) int local624;
					if (local43 == 1 || local43 == 2) {
						local624 = local515 ? 17 : 1;
					} else {
						local624 = local515 ? 17 : 2;
					}
					if (local43 == 2) {
						Static28.method501(local574, local624, null, "<img=1>" + arg2.method3871(), "<img=1>" + arg2.method3880(), local566, 0);
					} else if (local43 == 1) {
						Static28.method501(local574, local624, null, "<img=0>" + arg2.method3871(), "<img=0>" + arg2.method3880(), local566, 0);
					} else {
						Static28.method501(local574, local624, null, arg2.method3871(), arg2.method3880(), local566, 0);
					}
				}
			}
			arg1.anInt5766 = local504 + local54;
		}
		if ((arg0 & 0x8) != 0) {
			local39 = arg1.method4469();
			local43 = arg1.method4504();
			arg2.method4679(local43, Static368.anInt6250, local39);
			arg2.anInt6058 = Static368.anInt6250 + 300;
			arg2.anInt6036 = arg1.method4504();
		}
		if ((arg0 & 0x20000) != 0) {
			arg2.aByte80 = arg1.method4475();
			arg2.aByte77 = arg1.method4477();
			arg2.aByte79 = arg1.method4477();
			arg2.aByte78 = (byte) arg1.method4459();
			arg2.anInt6024 = Static368.anInt6250 + arg1.method4497();
			arg2.anInt6055 = Static368.anInt6250 + arg1.method4486();
		}
		if ((arg0 & 0x1) != 0) {
			local39 = arg1.method4500();
			if (local39 == 65535) {
				local39 = -1;
			}
			arg2.anInt6012 = local39;
		}
		if ((arg0 & 0x40) != 0) {
			local39 = arg1.method4500();
			if (local39 == 65535) {
				local39 = -1;
			}
			local43 = arg1.method4504();
			Static144.method1906(local39, local43, arg2);
		}
		if (!arg2.aBoolean394) {
			return;
		}
		if (local7 == 127) {
			arg2.method3877(arg2.anInt4955, arg2.anInt4935);
			return;
		}
		@Pc(848) byte local848;
		if (local7 == -1) {
			local848 = Static225.aByteArray38[arg3];
		} else {
			local848 = local7;
		}
		arg2.method3876(local848, arg2.anInt4935, arg2.anInt4955);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method4010(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(56) char[] local56 = new char[local37];
		local56[0] = '+';
		for (@Pc(64) int local64 = local37 - 1; local64 > 0; local64--) {
			@Pc(68) int local68 = arg0;
			arg0 /= 10;
			@Pc(79) int local79 = local68 - arg0 * 10;
			if (local79 >= 10) {
				local56[local64] = (char) (local79 + 87);
			} else {
				local56[local64] = (char) (local79 + 48);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIBZIII)Z")
	public static boolean method4012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0];
		@Pc(27) int local27 = Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0];
		if (local8 < 0 || Static425.anInt6922 <= local8 || local27 < 0 || local27 >= Static251.anInt4072) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static425.anInt6922 && arg0 >= 0 && arg0 < Static251.anInt4072) {
			@Pc(84) int local84 = Static358.method4643(arg7, local8, arg2, arg6, Static356.anIntArray349, local27, arg0, Static383.aClass247Array1[Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89], Static224.anIntArray195, arg4, Static239.aClass20_Sub3_Sub3_Sub1_1.method4678(), arg1, arg5, arg3);
			if (local84 < 1) {
				return false;
			}
			Static174.anInt2859 = Static356.anIntArray349[local84 - 1];
			Static313.anInt5206 = Static224.anIntArray195[local84 - 1];
			Static18.aBoolean29 = false;
			Static124.method1715();
			return true;
		} else {
			return false;
		}
	}
}
