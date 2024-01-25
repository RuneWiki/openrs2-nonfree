import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Lclient!gb;")
	public static Class88 aClass88_6;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Lclient!za;")
	public static Class34 aClass34_9;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public static int anInt5059;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
	public static int anInt5060;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static int anInt5053 = 0;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	public static int anInt5057 = 0;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_120 = new Class119("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!kh;ILclient!lr;I)V")
	public static void method3962(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28_Sub1 arg1, @OriginalArg(3) Class25_Sub5_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(26) int local26;
		if ((arg3 & 0x4) != 0) {
			local18 = arg1.method5375();
			local22 = arg1.method5363();
			local26 = arg1.method5363();
			@Pc(29) int local29 = arg1.anInt6812;
			@Pc(40) boolean local40 = (local18 & 0x8000) != 0;
			if (arg2.aString51 != null && arg2.aClass173_1 != null) {
				@Pc(48) boolean local48 = false;
				if (local22 <= 1) {
					if (!local40 && (Static361.aBoolean690 && !Static241.aBoolean491 || Static336.aBoolean652)) {
						local48 = true;
					} else if (Static406.method5265(arg2.aString51)) {
						local48 = true;
					}
				}
				if (!local48 && Static239.anInt5812 == 0) {
					Static228.aClass1_Sub28_5.anInt6812 = 0;
					arg1.method5343(Static228.aClass1_Sub28_5.aByteArray86, local26);
					Static228.aClass1_Sub28_5.anInt6812 = 0;
					@Pc(92) int local92 = -1;
					@Pc(111) String local111;
					if (local40) {
						local18 &= 0x7FFF;
						@Pc(102) Class108 local102 = Static397.method5186(Static228.aClass1_Sub28_5);
						local92 = local102.anInt2743;
						local111 = local102.aClass1_Sub5_Sub16_1.method4898(Static228.aClass1_Sub28_5);
					} else {
						local111 = Static328.method4413(Static365.method4855(Static228.aClass1_Sub28_5));
					}
					arg2.aString50 = local111.trim();
					arg2.anInt4291 = 150;
					arg2.anInt4293 = local18 >> 8;
					arg2.anInt4246 = local18 & 0xFF;
					@Pc(148) int local148;
					if (local22 == 1 || local22 == 2) {
						local148 = local40 ? 17 : 1;
					} else {
						local148 = local40 ? 17 : 2;
					}
					if (local22 == 2) {
						Static45.method4316(null, local111, local92, "<img=1>" + arg2.method3447(), local148, "<img=1>" + arg2.method3437(), 0);
					} else if (local22 == 1) {
						Static45.method4316(null, local111, local92, "<img=0>" + arg2.method3447(), local148, "<img=0>" + arg2.method3437(), 0);
					} else {
						Static45.method4316(null, local111, local92, arg2.method3447(), local148, arg2.method3437(), 0);
					}
				}
			}
			arg1.anInt6812 = local26 + local29;
		}
		if ((arg3 & 0x800) != 0) {
			arg2.aString50 = arg1.method5381();
			if (arg2.aString50.charAt(0) == '~') {
				arg2.aString50 = arg2.aString50.substring(1);
				Static90.method1430(arg2.aString50, arg2.method3437(), 2, arg2.method3447(), 0);
			} else if (Static447.aClass25_Sub5_Sub1_Sub2_4 == arg2) {
				Static90.method1430(arg2.aString50, arg2.method3437(), 2, arg2.method3447(), 0);
			}
			arg2.anInt4291 = 150;
			arg2.anInt4246 = 0;
			arg2.anInt4293 = 0;
		}
		if ((arg3 & 0x1) != 0) {
			arg2.anInt4346 = arg1.method5336();
			if (arg2.anInt4314 == 0) {
				arg2.method3416(arg2.anInt4346);
				arg2.anInt4346 = -1;
			}
		}
		if ((arg3 & 0x10) != 0) {
			Static372.aByteArray84[arg0] = arg1.method5367();
		}
		if ((arg3 & 0x20) != 0) {
			local18 = arg1.method5392();
			local22 = arg1.method5363();
			arg2.method3420(local18, Static236.anInt4213, local22);
			arg2.anInt4312 = Static236.anInt4213 + 300;
			arg2.anInt4263 = arg1.method5390();
		}
		if ((arg3 & 0x4000) != 0) {
			local18 = arg1.method5341();
			local22 = arg1.method5358();
			if (local18 == 65535) {
				local18 = -1;
			}
			local26 = arg1.method5337();
			arg2.method3418(local22, local18, local26, false);
		}
		if ((arg3 & 0x400) != 0) {
			local18 = arg1.method5336();
			arg2.anInt4236 = arg1.method5396();
			arg2.anInt4254 = arg1.method5396();
			arg2.anInt4245 = local18 & 0x7FFF;
			arg2.aBoolean482 = (local18 & 0x8000) != 0;
			arg2.anInt4307 = arg2.anInt4236 + arg2.anInt4245 + Static236.anInt4213;
		}
		if ((arg3 & 0x80) != 0) {
			local18 = arg1.method5363();
			@Pc(453) byte[] local453 = new byte[local18];
			@Pc(458) Class1_Sub28 local458 = new Class1_Sub28(local453);
			arg1.method5344(local453, local18);
			Static7.aClass1_Sub28Array1[arg0] = local458;
			arg2.method3448(local458);
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.aByte63 = arg1.method5391();
			arg2.aByte62 = arg1.method5391();
			arg2.aByte60 = arg1.method5353();
			arg2.aByte61 = (byte) arg1.method5337();
			arg2.anInt4251 = Static236.anInt4213 + arg1.method5336();
			arg2.anInt4305 = Static236.anInt4213 + arg1.method5375();
		}
		if ((arg3 & 0x8000) != 0) {
			local18 = Static236.anInt4213;
			local22 = arg1.method5392();
			local26 = arg1.method5390();
			arg2.method3420(local22, local18, local26);
		}
		if ((arg3 & 0x2) != 0) {
			local18 = arg1.method5336();
			if (local18 == 65535) {
				local18 = -1;
			}
			local22 = arg1.method5390();
			Static272.method3805(local22, local18, arg2);
		}
		if ((arg3 & 0x20000) != 0) {
			local18 = arg1.method5396();
			@Pc(570) int[] local570 = new int[local18];
			@Pc(573) int[] local573 = new int[local18];
			@Pc(576) int[] local576 = new int[local18];
			for (@Pc(578) int local578 = 0; local578 < local18; local578++) {
				@Pc(584) int local584 = arg1.method5341();
				if (local584 == 65535) {
					local584 = -1;
				}
				local570[local578] = local584;
				local573[local578] = arg1.method5390();
				local576[local578] = arg1.method5336();
			}
			Static154.method2263(arg2, local576, local573, local570);
		}
		if ((arg3 & 0x2000) != 0) {
			arg2.aBoolean487 = arg1.method5337() == 1;
		}
		if ((arg3 & 0x100) != 0) {
			arg2.anInt4286 = arg1.method5377();
			arg2.anInt4282 = arg1.method5353();
			arg2.anInt4289 = arg1.method5377();
			arg2.anInt4292 = arg1.method5377();
			arg2.anInt4285 = arg1.method5335() + Static236.anInt4213;
			arg2.anInt4244 = arg1.method5335() + Static236.anInt4213;
			arg2.anInt4273 = arg1.method5363();
			if (arg2.aBoolean486) {
				arg2.anInt4289 += arg2.anInt4343;
				arg2.anInt4292 += arg2.anInt4325;
				arg2.anInt4286 += arg2.anInt4343;
				arg2.anInt4282 += arg2.anInt4325;
				arg2.anInt4314 = 0;
			} else {
				arg2.anInt4292 += arg2.anIntArray284[0];
				arg2.anInt4282 += arg2.anIntArray284[0];
				arg2.anInt4286 += arg2.anIntArray283[0];
				arg2.anInt4289 += arg2.anIntArray283[0];
				arg2.anInt4314 = 1;
			}
			arg2.anInt4316 = 0;
		}
		if ((arg3 & 0x1000) != 0) {
			local7 = arg1.method5367();
		}
		if ((arg3 & 0x8) != 0) {
			local18 = arg1.method5341();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg2.anInt4238 = local18;
		}
		if ((arg3 & 0x40000) != 0) {
			local18 = arg1.method5335();
			local22 = arg1.method5355();
			if (local18 == 65535) {
				local18 = -1;
			}
			local26 = arg1.method5337();
			arg2.method3418(local22, local18, local26, true);
		}
		if (!arg2.aBoolean486) {
			return;
		}
		if (local7 == 127) {
			arg2.method3441(arg2.anInt4343, arg2.anInt4325);
			return;
		}
		@Pc(836) byte local836;
		if (local7 == -1) {
			local836 = Static372.aByteArray84[arg0];
		} else {
			local836 = local7;
		}
		arg2.method3443(arg2.anInt4343, arg2.anInt4325, local836);
	}
}
