import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "Lclient!nq;")
	public static Class144 aClass144_39;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
	public static int anInt2591;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
	public static int anInt2594;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	public static int anInt2585 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BJ)V")
	public static void method2170(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!qa;I)V")
	public static void method2171(@OriginalArg(1) int arg0, @OriginalArg(2) Class67_Sub3_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		if ((arg0 & 0x1000) != 0) {
			local9 = Static246.aClass11_Sub25_Sub1_3.method5171();
			arg1.anInt5028 = Static246.aClass11_Sub25_Sub1_3.method5219();
			arg1.anInt5020 = Static246.aClass11_Sub25_Sub1_3.method5219();
			arg1.anInt5053 = local9 & 0x7FFF;
			arg1.aBoolean331 = (local9 & 0x8000) != 0;
			arg1.anInt5019 = arg1.anInt5028 + Static293.anInt5807 + arg1.anInt5053;
		}
		@Pc(63) int local63;
		@Pc(103) int local103;
		@Pc(214) int local214;
		if ((arg0 & 0x400) != 0) {
			local9 = Static246.aClass11_Sub25_Sub1_3.method5171();
			local63 = Static246.aClass11_Sub25_Sub1_3.method5198();
			if (local9 == 65535) {
				local9 = -1;
			}
			@Pc(72) boolean local72 = true;
			@Pc(100) Class111 local100;
			if (local9 != -1 && arg1.anInt5043 != -1) {
				@Pc(87) Class213 local87;
				if (local9 == arg1.anInt5043) {
					local87 = Static89.method1296(local9);
					if (local87.aBoolean424 && local87.anInt6649 != -1) {
						local100 = Static306.method5143(local87.anInt6649);
						local103 = local100.anInt2720;
						if (local103 == 0) {
							local72 = false;
						} else if (local103 == 1) {
							local72 = true;
						} else if (local103 == 2) {
							local72 = false;
							arg1.anInt5000 = 0;
						}
					}
				} else {
					local87 = Static89.method1296(local9);
					@Pc(137) Class213 local137 = Static89.method1296(arg1.anInt5043);
					if (local87.anInt6649 != -1 && local137.anInt6649 != -1) {
						@Pc(151) Class111 local151 = Static306.method5143(local87.anInt6649);
						@Pc(156) Class111 local156 = Static306.method5143(local137.anInt6649);
						if (local156.anInt2716 > local151.anInt2716) {
							local72 = false;
						}
					}
				}
			}
			if (local72) {
				arg1.anInt5007 = 0;
				arg1.anInt5058 = 1;
				arg1.anInt5039 = 0;
				arg1.anInt5033 = local63 >> 16;
				arg1.anInt5043 = local9;
				arg1.anInt5061 = Static293.anInt5807 + (local63 & 0xFFFF);
				if (arg1.anInt5061 > Static293.anInt5807) {
					arg1.anInt5039 = -1;
				}
				if (arg1.anInt5043 != -1 && arg1.anInt5061 == Static293.anInt5807) {
					local214 = Static89.method1296(arg1.anInt5043).anInt6649;
					if (local214 != -1) {
						local100 = Static306.method5143(local214);
						if (local100 != null && local100.anIntArray191 != null) {
							Static354.method5681(arg1.anInt6310, arg1.anInt6308, local100, arg1 == Static156.aClass67_Sub3_Sub3_Sub2_2, 0);
						}
					}
				}
			}
		}
		if ((arg0 & 0x10) != 0) {
			arg1.anInt5027 = Static246.aClass11_Sub25_Sub1_3.method5179();
			arg1.anInt5008 = Static246.aClass11_Sub25_Sub1_3.method5179();
		}
		if ((arg0 & 0x8) != 0) {
			local9 = Static246.aClass11_Sub25_Sub1_3.method5171();
			local63 = Static246.aClass11_Sub25_Sub1_3.method5219();
			@Pc(273) int local273 = Static246.aClass11_Sub25_Sub1_3.method5190();
			local214 = Static246.aClass11_Sub25_Sub1_3.anInt6076;
			@Pc(287) boolean local287 = (local9 & 0x8000) != 0;
			if (arg1.aString50 != null && arg1.aClass140_2 != null) {
				@Pc(295) boolean local295 = false;
				if (local63 <= 1) {
					if (!local287 && (Static174.aBoolean219 && !Static186.aBoolean239 || Static137.aBoolean170)) {
						local295 = true;
					} else if (Static350.method5660(arg1.aString50)) {
						local295 = true;
					}
				}
				if (!local295 && Static25.anInt6264 == 0) {
					Static188.aClass11_Sub25_5.anInt6076 = 0;
					Static246.aClass11_Sub25_Sub1_3.method5216(Static188.aClass11_Sub25_5.aByteArray93, local273);
					Static188.aClass11_Sub25_5.anInt6076 = 0;
					@Pc(340) int local340 = -1;
					@Pc(350) String local350;
					if (local287) {
						local9 &= 0x7FFF;
						@Pc(360) Class83 local360 = Static307.method4208(Static188.aClass11_Sub25_5);
						local340 = local360.anInt1976;
						local350 = local360.aClass11_Sub4_Sub16_1.method4596(Static188.aClass11_Sub25_5);
					} else {
						local350 = Static81.method1211(Static153.method2455(Static6.method3582(Static188.aClass11_Sub25_5)));
					}
					arg1.aString49 = local350.trim();
					arg1.anInt5059 = local9 & 0xFF;
					arg1.anInt5003 = local9 >> 8;
					arg1.anInt4995 = 150;
					@Pc(398) int local398;
					if (local63 == 1 || local63 == 2) {
						local398 = local287 ? 17 : 1;
					} else {
						local398 = local287 ? 17 : 2;
					}
					if (local63 == 2) {
						Static40.method582(local350, "<img=1>" + arg1.method4385(), local340, null, local398, 0, "<img=1>" + arg1.method4391());
					} else if (local63 == 1) {
						Static40.method582(local350, "<img=0>" + arg1.method4385(), local340, null, local398, 0, "<img=0>" + arg1.method4391());
					} else {
						Static40.method582(local350, arg1.method4385(), local340, null, local398, 0, arg1.method4391());
					}
				}
			}
			Static246.aClass11_Sub25_Sub1_3.anInt6076 = local214 + local273;
		}
		if ((arg0 & 0x4) != 0) {
			arg1.anInt5023 = Static246.aClass11_Sub25_Sub1_3.method5201();
			if (arg1.anInt5023 == 65535) {
				arg1.anInt5023 = -1;
			}
		}
		if ((arg0 & 0x800) != 0) {
			arg1.anInt5051 = Static246.aClass11_Sub25_Sub1_3.method5200();
			arg1.anInt5012 = Static246.aClass11_Sub25_Sub1_3.method5190();
			arg1.anInt5046 = Static246.aClass11_Sub25_Sub1_3.method5185();
			arg1.anInt5002 = Static246.aClass11_Sub25_Sub1_3.method5190();
			arg1.anInt5037 = Static246.aClass11_Sub25_Sub1_3.method5171() + Static293.anInt5807;
			arg1.anInt5014 = Static246.aClass11_Sub25_Sub1_3.method5187() + Static293.anInt5807;
			arg1.anInt4999 = Static246.aClass11_Sub25_Sub1_3.method5219();
			arg1.anInt5063 = 0;
			arg1.anInt5074 = 1;
		}
		if ((arg0 & 0x200) != 0) {
			local9 = Static246.aClass11_Sub25_Sub1_3.method5188();
			local63 = Static246.aClass11_Sub25_Sub1_3.method5190();
			arg1.method4381(Static293.anInt5807, local9, local63);
		}
		if ((arg0 & 0x2) != 0) {
			local9 = Static246.aClass11_Sub25_Sub1_3.method5187();
			if (local9 == 65535) {
				local9 = -1;
			}
			local63 = Static246.aClass11_Sub25_Sub1_3.method5185();
			Static322.method5356(arg1, local63, local9);
		}
		if ((arg0 & 0x100) != 0) {
			local9 = Static246.aClass11_Sub25_Sub1_3.method5200();
			@Pc(631) int[] local631 = new int[local9];
			@Pc(634) int[] local634 = new int[local9];
			@Pc(637) int[] local637 = new int[local9];
			for (@Pc(639) int local639 = 0; local639 < local9; local639++) {
				local103 = Static246.aClass11_Sub25_Sub1_3.method5201();
				if (local103 == 65535) {
					local103 = -1;
				}
				local631[local639] = local103;
				local634[local639] = Static246.aClass11_Sub25_Sub1_3.method5185();
				local637[local639] = Static246.aClass11_Sub25_Sub1_3.method5187();
			}
			Static118.method1784(local631, arg1, local634, local637);
		}
		if ((arg0 & 0x20) != 0) {
			arg1.aString49 = Static246.aClass11_Sub25_Sub1_3.method5184();
			if (arg1.aString49.charAt(0) == '~') {
				arg1.aString49 = arg1.aString49.substring(1);
				Static260.method4521(0, arg1.method4385(), 2, arg1.method4391(), arg1.aString49);
			} else if (Static156.aClass67_Sub3_Sub3_Sub2_2 == arg1) {
				Static260.method4521(0, arg1.method4385(), 2, arg1.method4391(), arg1.aString49);
			}
			arg1.anInt5003 = 0;
			arg1.anInt5059 = 0;
			arg1.anInt4995 = 150;
		}
		if ((arg0 & 0x1) != 0) {
			local9 = Static246.aClass11_Sub25_Sub1_3.method5188();
			local63 = Static246.aClass11_Sub25_Sub1_3.method5219();
			arg1.method4381(Static293.anInt5807, local9, local63);
			arg1.anInt5042 = Static293.anInt5807 + 300;
			arg1.anInt4998 = Static246.aClass11_Sub25_Sub1_3.method5219();
		}
		if ((arg0 & 0x80) == 0) {
			return;
		}
		local9 = Static246.aClass11_Sub25_Sub1_3.method5219();
		@Pc(785) byte[] local785 = new byte[local9];
		@Pc(790) Class11_Sub25 local790 = new Class11_Sub25(local785);
		Static246.aClass11_Sub25_Sub1_3.method5194(local9, local785);
		Static39.aClass11_Sub25Array1[arg2] = local790;
		arg1.method4390(local790);
	}
}
