import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!ab;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
	public static int anInt5552 = -1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!we;Lclient!id;ILclient!vc;)V")
	public static void method4793(@OriginalArg(0) Class243 arg0, @OriginalArg(1) Class2_Sub23 arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(10) Class18 local10 = arg0.method5527(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method4563();
		if (local10.method4571() > local16) {
			local16 = local10.method4571();
		}
		@Pc(32) int local32 = arg1.anInt2804;
		@Pc(35) int local35 = arg1.anInt2802;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg0.aString64 != null) {
			local37 = Static374.aClass136_9.method3124(null, Static203.aStringArray95, null, arg0.aString64);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static203.aStringArray95[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static219.aClass110_4.method2790(local61);
				if (local39 < local82) {
					local39 = local82;
				}
			}
			local41 = Static219.aClass110_4.method2791() * local37 + Static219.aClass110_4.method2792() / 2;
		}
		local55 = local16 / 2 + arg1.anInt2804;
		if (local16 + Static338.anInt3302 > local32) {
			local55 = local39 / 2 + local16 / 2 + Static338.anInt3302 + 5 + 10;
			local32 = Static338.anInt3302;
		} else if (Static338.anInt3303 - local16 < local32) {
			local32 = Static338.anInt3303 - local16;
			local55 = Static338.anInt3303 - local16 / 2 - local39 / 2 - 5 - 10;
		}
		@Pc(179) int local179 = arg1.anInt2802;
		if (local35 < Static338.anInt3301 + local16) {
			local179 = Static338.anInt3301 + local16 / 2 + 10;
			local35 = Static338.anInt3301;
		} else if (Static338.anInt3304 - local16 < local35) {
			local35 = Static338.anInt3304 - local16;
			local179 = Static338.anInt3304 - local16 / 2 - local41 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg1.anInt2804), (double) (local35 - arg1.anInt2802)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method4556((float) local32 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local35, 4096, local82);
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		if (arg0.aString64 != null) {
			local261 = local179;
			local259 = local55 - local39 / 2 - 5;
			local263 = local39 + local259 + 10;
			local265 = Static219.aClass110_4.method2791() * local37 + local179 + 3;
			if (arg0.anInt6358 != 0) {
				arg2.method1951(local179, local265 - local179, local263 + -local259, arg0.anInt6358, local259);
			}
			if (arg0.anInt6353 != 0) {
				arg2.method2027(local263 - local259, -local179 + local265, local259, arg0.anInt6353, local179);
			}
			for (@Pc(337) int local337 = 0; local337 < local37; local337++) {
				@Pc(343) String local343 = Static203.aStringArray95[local337];
				if (local37 - 1 > local337) {
					local343 = local343.substring(0, local343.length() - 4);
				}
				Static219.aClass110_4.method2793(arg2, local343, local55, local179, arg0.anInt6373);
				local179 += Static219.aClass110_4.method2791();
			}
		}
		if (arg0.anInt6344 == -1 && arg0.aString64 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(395) Class2_Sub44 local395 = new Class2_Sub44(arg1);
		local395.anInt6548 = local32 + local16;
		local395.anInt6546 = local259;
		local395.anInt6556 = local32 - local16;
		local395.anInt6550 = local263;
		local395.anInt6558 = local261;
		local395.anInt6551 = local16 + local35;
		local395.anInt6553 = local35 - local16;
		local395.anInt6549 = local265;
		Static224.aClass30_32.method685(local395);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
	public static int method4799() {
		try {
			if (Static285.anInt4943 == 0) {
				if (Static39.method699() - 5000L < Static71.aLong54) {
					return 0;
				}
				Static148.aClass182_5 = Static359.aClass111_5.method2798(Static225.anInt4017, Static301.aString58);
				Static226.aLong203 = Static39.method699();
				Static285.anInt4943 = 1;
			}
			if (Static39.method699() > Static226.aLong203 + 30000L) {
				return Static333.method4914(1000);
			}
			@Pc(89) int local89;
			@Pc(127) int local127;
			if (Static285.anInt4943 == 1) {
				if (Static148.aClass182_5.anInt4498 == 2) {
					return Static333.method4914(1001);
				}
				if (Static148.aClass182_5.anInt4498 != 1) {
					return -1;
				}
				Static88.aClass221_1 = new Class221((Socket) Static148.aClass182_5.anObject6, Static359.aClass111_5);
				Static148.aClass182_5 = null;
				local89 = 0;
				if (Static195.aBoolean279) {
					local89 = Static174.anInt3363;
				}
				Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
				Static372.aClass2_Sub16_Sub2_4.method5358(Static320.aClass17_9.anInt444);
				Static372.aClass2_Sub16_Sub2_4.method5355(local89);
				Static88.aClass221_1.method4796(Static372.aClass2_Sub16_Sub2_4.aByteArray112, Static372.aClass2_Sub16_Sub2_4.anInt6145);
				if (Static269.aClass85_2 != null) {
					Static269.aClass85_2.method4224();
				}
				if (Static156.aClass85_1 != null) {
					Static156.aClass85_1.method4224();
				}
				local127 = Static88.aClass221_1.method4794();
				if (Static269.aClass85_2 != null) {
					Static269.aClass85_2.method4224();
				}
				if (Static156.aClass85_1 != null) {
					Static156.aClass85_1.method4224();
				}
				if (local127 != 0) {
					return Static333.method4914(local127);
				}
				Static285.anInt4943 = 2;
			}
			if (Static285.anInt4943 == 2) {
				if (Static88.aClass221_1.method4795() < 2) {
					return -1;
				}
				Static163.anInt2451 = Static88.aClass221_1.method4794();
				Static163.anInt2451 <<= 0x8;
				Static163.anInt2451 += Static88.aClass221_1.method4794();
				Static271.anInt4714 = 0;
				Static285.anInt4943 = 3;
				Static263.aByteArray78 = new byte[Static163.anInt2451];
			}
			if (Static285.anInt4943 != 3) {
				return -1;
			}
			local89 = Static88.aClass221_1.method4795();
			if (local89 < 1) {
				return -1;
			}
			if (local89 > Static163.anInt2451 - Static271.anInt4714) {
				local89 = Static163.anInt2451 - Static271.anInt4714;
			}
			Static88.aClass221_1.method4800(Static271.anInt4714, local89, Static263.aByteArray78);
			Static271.anInt4714 += local89;
			if (Static163.anInt2451 > Static271.anInt4714) {
				return -1;
			} else if (Static356.method5229(Static263.aByteArray78)) {
				Static380.aClass138_Sub1Array2 = new Class138_Sub1[Static232.anInt4151];
				local127 = 0;
				for (@Pc(239) int local239 = Static206.anInt3798; local239 <= Static133.anInt2726; local239++) {
					@Pc(245) Class138_Sub1 local245 = Static47.method804(local239);
					if (local245 != null) {
						Static380.aClass138_Sub1Array2[local127++] = local245;
					}
				}
				Static170.aClass2_Sub21_2 = null;
				Static146.anInt2918 = 0;
				Static88.aClass221_1.method4801();
				Static321.anInt5498 = 0;
				Static263.aByteArray78 = null;
				Static285.anInt4943 = 0;
				Static88.aClass221_1 = null;
				Static71.aLong54 = Static39.method699();
				return 0;
			} else {
				return Static333.method4914(1002);
			}
		} catch (@Pc(277) IOException local277) {
			return Static333.method4914(1003);
		}
	}
}
