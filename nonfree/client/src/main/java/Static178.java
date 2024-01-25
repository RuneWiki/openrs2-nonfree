import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
	public static boolean aBoolean309 = false;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
	public static int anInt3686 = 0;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
	public static int anInt3687 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z[[[Lclient!uk;)V")
	public static void method3483(@OriginalArg(1) Class204[][][] arg0) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(16) Class204[][] local16 = arg0[local10];
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				for (@Pc(22) int local22 = 0; local22 < local16[local18].length; local22++) {
					@Pc(30) Class204 local30 = local16[local18][local22];
					if (local30 != null) {
						if (local30.aClass5_Sub5_1 instanceof Interface8) {
							((Interface8) local30.aClass5_Sub5_1).method5698();
						}
						if (local30.aClass5_Sub4_2 instanceof Interface8) {
							((Interface8) local30.aClass5_Sub4_2).method5698();
						}
						if (local30.aClass5_Sub4_1 instanceof Interface8) {
							((Interface8) local30.aClass5_Sub4_1).method5698();
						}
						if (local30.aClass5_Sub1_1 instanceof Interface8) {
							((Interface8) local30.aClass5_Sub1_1).method5698();
						}
						if (local30.aClass5_Sub1_2 instanceof Interface8) {
							((Interface8) local30.aClass5_Sub1_2).method5698();
						}
						for (@Pc(80) Class17 local80 = local30.aClass17_3; local80 != null; local80 = local80.aClass17_1) {
							@Pc(85) Class5_Sub3 local85 = local80.aClass5_Sub3_1;
							if (local85 instanceof Interface8) {
								((Interface8) local85).method5698();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
	public static void method3484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static131.aClass140_72 = new Class140(arg0);
		Static112.aClass140_103 = new Class140(arg1);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ke;IIB)V")
	public static void method3485(@OriginalArg(0) Class5_Sub3_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg1 & 0x4) != 0) {
			arg0.anInt4968 = Static232.aClass1_Sub7_Sub1_4.method3115();
			arg0.anInt4914 = Static232.aClass1_Sub7_Sub1_4.method3147();
		}
		if ((arg1 & 0x10) != 0) {
			arg0.anInt4964 = Static232.aClass1_Sub7_Sub1_4.method3144();
			if (arg0.anInt4964 == 65535) {
				arg0.anInt4964 = -1;
			}
		}
		@Pc(59) int local59;
		@Pc(63) int local63;
		if ((arg1 & 0x80) != 0) {
			local59 = Static232.aClass1_Sub7_Sub1_4.method3145();
			local63 = Static232.aClass1_Sub7_Sub1_4.method3100();
			arg0.method4546(Static215.anInt4246, local63, local59);
			arg0.anInt4926 = Static215.anInt4246 + 300;
			arg0.anInt4962 = Static232.aClass1_Sub7_Sub1_4.method3094();
		}
		@Pc(136) int local136;
		@Pc(254) int local254;
		if ((arg1 & 0x200) != 0) {
			local59 = Static232.aClass1_Sub7_Sub1_4.method3144();
			if (local59 == 65535) {
				local59 = -1;
			}
			local63 = Static232.aClass1_Sub7_Sub1_4.method3125();
			@Pc(103) boolean local103 = true;
			@Pc(133) Class121 local133;
			if (local59 != -1 && arg0.anInt4934 != -1) {
				@Pc(120) Class125 local120;
				if (arg0.anInt4934 == local59) {
					local120 = Static183.method3571(local59);
					if (local120.aBoolean335 && local120.anInt3913 != -1) {
						local133 = Static133.method2520(local120.anInt3913);
						local136 = local133.anInt3780;
						if (local136 == 0) {
							local103 = false;
						} else if (local136 == 1) {
							local103 = true;
						} else if (local136 == 2) {
							local103 = false;
							arg0.anInt4922 = 0;
						}
					}
				} else {
					local120 = Static183.method3571(local59);
					@Pc(173) Class125 local173 = Static183.method3571(arg0.anInt4934);
					if (local120.anInt3913 != -1 && local173.anInt3913 != -1) {
						@Pc(187) Class121 local187 = Static133.method2520(local120.anInt3913);
						@Pc(192) Class121 local192 = Static133.method2520(local173.anInt3913);
						if (local187.anInt3772 < local192.anInt3772) {
							local103 = false;
						}
					}
				}
			}
			if (local103) {
				arg0.anInt4976 = 0;
				arg0.anInt4958 = local63 >> 16;
				arg0.anInt4972 = 1;
				arg0.anInt4951 = Static215.anInt4246 + (local63 & 0xFFFF);
				arg0.anInt4934 = local59;
				arg0.anInt4979 = 0;
				if (Static215.anInt4246 < arg0.anInt4951) {
					arg0.anInt4979 = -1;
				}
				if (arg0.anInt4934 != -1 && arg0.anInt4951 == Static215.anInt4246) {
					local254 = Static183.method3571(arg0.anInt4934).anInt3913;
					if (local254 != -1) {
						local133 = Static133.method2520(local254);
						if (local133 != null && local133.anIntArray446 != null) {
							Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, local133, 0, arg0.anInt5047, arg0.anInt5050);
						}
					}
				}
			}
		}
		if ((arg1 & 0x1) != 0) {
			arg0.aString199 = Static232.aClass1_Sub7_Sub1_4.method3134();
			if (arg0.aString199.charAt(0) == '~') {
				arg0.aString199 = arg0.aString199.substring(1);
				Static9.method288(0, arg0.method3064(), arg0.method3061(), arg0.aString199, 2);
			} else if (Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0) {
				Static9.method288(0, arg0.method3064(), arg0.method3061(), arg0.aString199, 2);
			}
			arg0.anInt4945 = 150;
			arg0.anInt4947 = 0;
			arg0.anInt4928 = 0;
		}
		if ((arg1 & 0x20) != 0) {
			local59 = Static232.aClass1_Sub7_Sub1_4.method3112();
			@Pc(358) byte[] local358 = new byte[local59];
			@Pc(363) Class1_Sub7 local363 = new Class1_Sub7(local358);
			Static232.aClass1_Sub7_Sub1_4.method3106(local59, local358);
			Static30.aClass1_Sub7Array1[arg2] = local363;
			arg0.method3062(local363);
		}
		if ((arg1 & 0x100) != 0) {
			local59 = Static232.aClass1_Sub7_Sub1_4.method3141();
			@Pc(388) int[] local388 = new int[local59];
			@Pc(391) int[] local391 = new int[local59];
			@Pc(394) int[] local394 = new int[local59];
			for (@Pc(396) int local396 = 0; local396 < local59; local396++) {
				local136 = Static232.aClass1_Sub7_Sub1_4.method3101();
				if (local136 == 65535) {
					local136 = -1;
				}
				local388[local396] = local136;
				local391[local396] = Static232.aClass1_Sub7_Sub1_4.method3141();
				local394[local396] = Static232.aClass1_Sub7_Sub1_4.method3144();
			}
			Static217.method3978(local388, arg0, local394, local391);
		}
		if ((arg1 & 0x800) != 0) {
			local59 = Static232.aClass1_Sub7_Sub1_4.method3115();
			arg0.anInt4943 = Static232.aClass1_Sub7_Sub1_4.method3094();
			arg0.anInt4967 = Static232.aClass1_Sub7_Sub1_4.method3100();
			arg0.anInt4974 = local59 & 0x7FFF;
			arg0.aBoolean415 = (local59 & 0x8000) != 0;
			arg0.anInt4917 = arg0.anInt4974 + Static215.anInt4246 + arg0.anInt4943;
		}
		if ((arg1 & 0x40) != 0) {
			local59 = Static232.aClass1_Sub7_Sub1_4.method3147();
			local63 = Static232.aClass1_Sub7_Sub1_4.method3094();
			@Pc(493) int local493 = Static232.aClass1_Sub7_Sub1_4.method3112();
			local254 = Static232.aClass1_Sub7_Sub1_4.anInt3368;
			@Pc(504) boolean local504 = (local59 & 0x8000) != 0;
			if (arg0.aString130 != null && arg0.aClass31_1 != null) {
				@Pc(512) boolean local512 = false;
				if (local63 <= 1) {
					if (!local504 && (Static115.aBoolean193 && !Static300.aBoolean507 || Static206.aBoolean350)) {
						local512 = true;
					} else if (Static340.method3661(arg0.aString130)) {
						local512 = true;
					}
				}
				if (!local512 && Static155.anInt3113 == 0) {
					Static11.aClass1_Sub7_9.anInt3368 = 0;
					Static232.aClass1_Sub7_Sub1_4.method3133(local493, Static11.aClass1_Sub7_9.aByteArray58);
					Static11.aClass1_Sub7_9.anInt3368 = 0;
					@Pc(556) int local556 = -1;
					@Pc(575) String local575;
					if (local504) {
						local59 &= 0x7FFF;
						@Pc(566) Class107 local566 = Static109.method2030(Static11.aClass1_Sub7_9);
						local556 = local566.anInt3136;
						local575 = local566.aClass1_Sub1_Sub17_1.method4715(Static11.aClass1_Sub7_9);
					} else {
						local575 = Static149.method2394(Static77.method1484(Static262.method4604(Static11.aClass1_Sub7_9)));
					}
					arg0.aString199 = local575.trim();
					arg0.anInt4945 = 150;
					arg0.anInt4928 = local59 >> 8;
					arg0.anInt4947 = local59 & 0xFF;
					@Pc(618) int local618;
					if (local63 == 1 || local63 == 2) {
						local618 = local504 ? 17 : 1;
					} else {
						local618 = local504 ? 17 : 2;
					}
					if (local63 == 2) {
						Static345.method5616(local556, local618, null, 0, "<img=1>" + arg0.method3061(), local575, "<img=1>" + arg0.method3064());
					} else if (local63 == 1) {
						Static345.method5616(local556, local618, null, 0, "<img=0>" + arg0.method3061(), local575, "<img=0>" + arg0.method3064());
					} else {
						Static345.method5616(local556, local618, null, 0, arg0.method3061(), local575, arg0.method3064());
					}
				}
			}
			Static232.aClass1_Sub7_Sub1_4.anInt3368 = local493 + local254;
		}
		if ((arg1 & 0x8) != 0) {
			local59 = Static232.aClass1_Sub7_Sub1_4.method3147();
			if (local59 == 65535) {
				local59 = -1;
			}
			local63 = Static232.aClass1_Sub7_Sub1_4.method3112();
			Static188.method3648(arg0, local59, local63);
		}
		if ((arg1 & 0x1000) != 0) {
			arg0.anInt4913 = Static232.aClass1_Sub7_Sub1_4.method3141();
			arg0.anInt4955 = Static232.aClass1_Sub7_Sub1_4.method3141();
			arg0.anInt4929 = Static232.aClass1_Sub7_Sub1_4.method3112();
			arg0.anInt4925 = Static232.aClass1_Sub7_Sub1_4.method3094();
			arg0.anInt4961 = Static232.aClass1_Sub7_Sub1_4.method3147() + Static215.anInt4246;
			arg0.anInt4971 = Static232.aClass1_Sub7_Sub1_4.method3144() + Static215.anInt4246;
			arg0.anInt4931 = Static232.aClass1_Sub7_Sub1_4.method3094();
			arg0.anInt4984 = 0;
			arg0.anInt4985 = 1;
		}
		if ((arg1 & 0x400) != 0) {
			local59 = Static232.aClass1_Sub7_Sub1_4.method3145();
			local63 = Static232.aClass1_Sub7_Sub1_4.method3112();
			arg0.method4546(Static215.anInt4246, local63, local59);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)V")
	public static void method3487(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub38 local17 = (Class1_Sub38) Static338.aClass26_33.method870((long) arg0);
		if (local17 != null) {
			for (@Pc(22) int local22 = 0; local22 < local17.anIntArray763.length; local22++) {
				local17.anIntArray763[local22] = -1;
				local17.anIntArray762[local22] = 0;
			}
		}
	}
}
