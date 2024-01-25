import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
	public static int anInt529;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_5 = new Class137(32);

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	public static int anInt525 = 0;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_14 = new Class15("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "[I")
	public static final int[] anIntArray42 = new int[32];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)I")
	public static int method430(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(32) int local32 = (local9 & 0x33333333) + (local9 >>> 2 & 0x73333333);
		@Pc(40) int local40 = (local32 >>> 4) + local32 & 0xF0F0F0F;
		@Pc(46) int local46 = local40 + (local40 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ft;[[BZ)V")
	public static void method431(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static271.aByteArrayArray10.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(36) int local36 = (Static91.anIntArray131[local17] >> 8) * 64 - Static365.anInt6047;
				@Pc(46) int local46 = (Static91.anIntArray131[local17] & 0xFF) * 64 - Static366.anInt6052;
				Static150.method2112();
				arg0.method1720(Static39.aClass135_1, local46, local23, Static409.aClass128Array1, local36);
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!hd;II)V")
	public static void method432(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte48 == 0) {
			arg1.anInt2643 = arg1.anInt2618;
		} else if (arg1.aByte48 == 1) {
			arg1.anInt2643 = arg1.anInt2618 + (arg2 - arg1.anInt2590) / 2;
		} else if (arg1.aByte48 == 2) {
			arg1.anInt2643 = arg2 - arg1.anInt2618 - arg1.anInt2590;
		} else if (arg1.aByte48 == 3) {
			arg1.anInt2643 = arg2 * arg1.anInt2618 >> 14;
		} else if (arg1.aByte48 == 4) {
			arg1.anInt2643 = (arg2 * arg1.anInt2618 >> 14) + (arg2 - arg1.anInt2590) / 2;
		} else {
			arg1.anInt2643 = arg2 - arg1.anInt2590 - (arg2 * arg1.anInt2618 >> 14);
		}
		if (arg1.aByte49 == 0) {
			arg1.anInt2622 = arg1.anInt2637;
		} else if (arg1.aByte49 == 1) {
			arg1.anInt2622 = arg1.anInt2637 + (arg0 - arg1.anInt2617) / 2;
		} else if (arg1.aByte49 == 2) {
			arg1.anInt2622 = arg0 - arg1.anInt2617 - arg1.anInt2637;
		} else if (arg1.aByte49 == 3) {
			arg1.anInt2622 = arg0 * arg1.anInt2637 >> 14;
		} else if (arg1.aByte49 == 4) {
			arg1.anInt2622 = (arg0 * arg1.anInt2637 >> 14) + (arg0 - arg1.anInt2617) / 2;
		} else {
			arg1.anInt2622 = arg0 - (arg0 * arg1.anInt2637 >> 14) - arg1.anInt2617;
		}
		if (!Static37.aBoolean35 || Static55.method752(arg1).anInt3514 == 0 && arg1.anInt2627 != 0) {
			return;
		}
		if (arg1.anInt2622 < 0) {
			arg1.anInt2622 = 0;
		} else if (arg0 < arg1.anInt2622 + arg1.anInt2617) {
			arg1.anInt2622 = arg0 - arg1.anInt2617;
		}
		if (arg1.anInt2643 < 0) {
			arg1.anInt2643 = 0;
		} else if (arg1.anInt2590 + arg1.anInt2643 > arg2) {
			arg1.anInt2643 = arg2 - arg1.anInt2590;
			return;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!rd;IIILclient!tf;)V")
	public static void method433(@OriginalArg(0) Class8_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub9_Sub2 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		if ((arg1 & 0x40) != 0) {
			local18 = arg3.method5042();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg0.anInt7394 = local18;
		}
		if ((arg1 & 0x200) != 0) {
			arg0.aString74 = arg3.method5038();
			if (arg0.aString74.charAt(0) == '~') {
				arg0.aString74 = arg0.aString74.substring(1);
				Static290.method3782(arg0.method4559(), arg0.aString74, 0, arg0.method4551(), 2);
			} else if (Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0) {
				Static290.method3782(arg0.method4559(), arg0.aString74, 0, arg0.method4551(), 2);
			}
			arg0.anInt7417 = 0;
			arg0.anInt7395 = 0;
			arg0.anInt7424 = 150;
		}
		if ((arg1 & 0x10000) != 0) {
			local18 = arg3.method5013();
			@Pc(116) int[] local116 = new int[local18];
			@Pc(119) int[] local119 = new int[local18];
			@Pc(122) int[] local122 = new int[local18];
			for (@Pc(124) int local124 = 0; local124 < local18; local124++) {
				@Pc(130) int local130 = arg3.method5042();
				if (local130 == 65535) {
					local130 = -1;
				}
				local116[local124] = local130;
				local119[local124] = arg3.method5012();
				local122[local124] = arg3.method5028();
			}
			Static81.method1305(local116, local122, arg0, local119);
		}
		if ((arg1 & 0x20) != 0) {
			Static37.aByteArray6[arg2] = arg3.method5022();
		}
		if ((arg1 & 0x80) != 0) {
			arg0.anInt5671 = arg3.method5045();
			if (arg0.anInt7427 == 0) {
				arg0.method5887(arg0.anInt5671);
				arg0.anInt5671 = -1;
			}
		}
		if ((arg1 & 0x20000) != 0) {
			arg0.aByte101 = arg3.method5026();
			arg0.aByte102 = arg3.method5022();
			arg0.aByte100 = arg3.method5011();
			arg0.aByte103 = (byte) arg3.method5013();
			arg0.anInt7422 = Static265.anInt4371 + arg3.method5056();
			arg0.anInt7372 = Static265.anInt4371 + arg3.method5042();
		}
		@Pc(256) int local256;
		if ((arg1 & 0x4) != 0) {
			local18 = arg3.method5042();
			if (local18 == 65535) {
				local18 = -1;
			}
			local256 = arg3.method5012();
			Static315.method4080(local18, local256, arg0);
		}
		if ((arg1 & 0x10) != 0) {
			local18 = arg3.method5033();
			local256 = arg3.method5012();
			arg0.method5895(local18, local256, Static265.anInt4371);
			arg0.anInt7415 = Static265.anInt4371 + 300;
			arg0.anInt7362 = arg3.method5007();
		}
		@Pc(313) int local313;
		if ((arg1 & 0x40000) != 0) {
			local18 = arg3.method5042();
			if (local18 == 65535) {
				local18 = -1;
			}
			local256 = arg3.method5016();
			local313 = arg3.method5007();
			arg0.method5891(local256, local18, local313, true);
		}
		if ((arg1 & 0x8000) != 0) {
			local7 = arg3.method5063();
		}
		if ((arg1 & 0x4000) != 0) {
			arg0.aBoolean399 = arg3.method5013() == 1;
		}
		if ((arg1 & 0x800) != 0) {
			local18 = Static265.anInt4371;
			local256 = arg3.method5033();
			local313 = arg3.method5046();
			arg0.method5895(local256, local313, local18);
		}
		if ((arg1 & 0x100) != 0) {
			local18 = arg3.method5045();
			arg0.anInt7396 = arg3.method5013();
			arg0.anInt7361 = arg3.method5012();
			arg0.anInt7356 = local18 & 0x7FFF;
			arg0.aBoolean520 = (local18 & 0x8000) != 0;
			arg0.anInt7379 = arg0.anInt7396 + arg0.anInt7356 + Static265.anInt4371;
		}
		if ((arg1 & 0x2) != 0) {
			local18 = arg3.method5028();
			local256 = arg3.method5012();
			local313 = arg3.method5046();
			@Pc(422) int local422 = arg3.anInt6207;
			@Pc(433) boolean local433 = (local18 & 0x8000) != 0;
			if (arg0.aString60 != null && arg0.aClass60_1 != null) {
				@Pc(441) boolean local441 = false;
				if (local256 <= 1) {
					if (!local433 && (Static412.aBoolean491 && !Static119.aBoolean403 || Static339.aBoolean389)) {
						local441 = true;
					} else if (Static231.method3150(arg0.aString60)) {
						local441 = true;
					}
				}
				if (!local441 && Static347.anInt5749 == 0) {
					Static225.aClass4_Sub9_6.anInt6207 = 0;
					arg3.method5005(Static225.aClass4_Sub9_6.aByteArray81, local313);
					Static225.aClass4_Sub9_6.anInt6207 = 0;
					@Pc(487) int local487 = -1;
					@Pc(506) String local506;
					if (local433) {
						local18 &= 0x7FFF;
						@Pc(497) Class7 local497 = Static331.method4374(Static225.aClass4_Sub9_6);
						local487 = local497.anInt123;
						local506 = local497.aClass4_Sub2_Sub18_1.method5542(Static225.aClass4_Sub9_6);
					} else {
						local506 = Static265.method3496(Static334.method4420(Static225.aClass4_Sub9_6));
					}
					arg0.aString74 = local506.trim();
					arg0.anInt7417 = local18 & 0xFF;
					arg0.anInt7395 = local18 >> 8;
					arg0.anInt7424 = 150;
					@Pc(545) int local545;
					if (local256 == 1 || local256 == 2) {
						local545 = local433 ? 17 : 1;
					} else {
						local545 = local433 ? 17 : 2;
					}
					if (local256 == 2) {
						Static46.method610(null, "<img=1>" + arg0.method4551(), "<img=1>" + arg0.method4559(), local487, local506, 0, local545);
					} else if (local256 == 1) {
						Static46.method610(null, "<img=0>" + arg0.method4551(), "<img=0>" + arg0.method4559(), local487, local506, 0, local545);
					} else {
						Static46.method610(null, arg0.method4551(), arg0.method4559(), local487, local506, 0, local545);
					}
				}
			}
			arg3.anInt6207 = local422 + local313;
		}
		if ((arg1 & 0x1000) != 0) {
			arg0.anInt7350 = arg3.method5063();
			arg0.anInt7411 = arg3.method5011();
			arg0.anInt7413 = arg3.method5011();
			arg0.anInt7423 = arg3.method5022();
			arg0.anInt7351 = arg3.method5028() + Static265.anInt4371;
			arg0.anInt7349 = arg3.method5056() + Static265.anInt4371;
			arg0.anInt7368 = arg3.method5012();
			if (arg0.aBoolean402) {
				arg0.anInt7350 += arg0.anInt5653;
				arg0.anInt7411 += arg0.anInt5674;
				arg0.anInt7413 += arg0.anInt5653;
				arg0.anInt7423 += arg0.anInt5674;
				arg0.anInt7427 = 0;
			} else {
				arg0.anInt7423 += arg0.anIntArray559[0];
				arg0.anInt7350 += arg0.anIntArray560[0];
				arg0.anInt7413 += arg0.anIntArray560[0];
				arg0.anInt7427 = 1;
				arg0.anInt7411 += arg0.anIntArray559[0];
			}
			arg0.anInt7428 = 0;
		}
		if ((arg1 & 0x1) != 0) {
			local18 = arg3.method5007();
			@Pc(779) byte[] local779 = new byte[local18];
			@Pc(784) Class4_Sub9 local784 = new Class4_Sub9(local779);
			arg3.method5044(local18, local779);
			Static384.aClass4_Sub9Array1[arg2] = local784;
			arg0.method4554(local784);
		}
		if ((arg1 & 0x2000) != 0) {
			local18 = arg3.method5056();
			if (local18 == 65535) {
				local18 = -1;
			}
			local256 = arg3.method4997();
			local313 = arg3.method5013();
			arg0.method5891(local256, local18, local313, false);
		}
		if (!arg0.aBoolean402) {
			return;
		}
		if (local7 == 127) {
			arg0.method4558(arg0.anInt5674, arg0.anInt5653);
			return;
		}
		@Pc(852) byte local852;
		if (local7 == -1) {
			local852 = Static37.aByteArray6[arg2];
		} else {
			local852 = local7;
		}
		arg0.method4563(arg0.anInt5674, local852, arg0.anInt5653);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)V")
	public static void method434(@OriginalArg(0) boolean arg0) {
		Static49.method642(Static345.anInt5723, Static182.anInt3346, Static120.anInt2134, arg0);
	}
}
