import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_16 = new Class208(6, 4);

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "[I")
	public static final int[] anIntArray91 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!gi;III)V")
	public static void method1136(@OriginalArg(0) Class93 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static305.anInt167 = arg2;
		Static252.aClass93_15 = arg0;
		Static127.anInt2133 = arg1;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!gh;Lclient!tq;II)V")
	public static void method1137(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg1, @OriginalArg(2) Class2_Sub17_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if ((arg3 & 0x10) != 0) {
			local16 = arg2.method6174();
			local20 = arg2.method6119();
			arg1.method6226(local20, local16, Static277.anInt5022);
			arg1.anInt7690 = Static277.anInt5022 + 300;
			arg1.anInt7685 = arg2.method6119();
		}
		@Pc(38) byte local38 = -1;
		if ((arg3 & 0x4000) != 0) {
			arg1.aString74 = arg2.method6141();
			if (arg1.aString74.charAt(0) == '~') {
				arg1.aString74 = arg1.aString74.substring(1);
				Static94.method4447(arg1.method2112(), arg1.method2105(), arg1.aString74, 2, 0);
			} else if (Static127.aClass11_Sub5_Sub2_Sub1_2 == arg1) {
				Static94.method4447(arg1.method2112(), arg1.method2105(), arg1.aString74, 2, 0);
			}
			arg1.anInt7697 = 0;
			arg1.anInt7659 = 150;
			arg1.anInt7671 = 0;
		}
		if ((arg3 & 0x40) != 0) {
			local16 = arg2.method6110();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg1.anInt7656 = local16;
		}
		if ((arg3 & 0x40000) != 0) {
			local16 = arg2.method6168();
			@Pc(136) int[] local136 = new int[local16];
			@Pc(139) int[] local139 = new int[local16];
			@Pc(142) int[] local142 = new int[local16];
			for (@Pc(144) int local144 = 0; local144 < local16; local144++) {
				@Pc(150) int local150 = arg2.method6110();
				if (local150 == 65535) {
					local150 = -1;
				}
				local136[local144] = local150;
				local139[local144] = arg2.method6138();
				local142[local144] = arg2.method6110();
			}
			Static457.method6202(local139, local136, arg1, local142);
		}
		@Pc(211) int local211;
		if ((arg3 & 0x10000) != 0) {
			local16 = arg2.method6110();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg2.method6129();
			local211 = arg2.method6138();
			arg1.method6222(local20, local211, local16, true);
		}
		if ((arg3 & 0x4) != 0) {
			arg1.anInt2418 = arg2.method6124();
			if (arg1.anInt7707 == 0) {
				arg1.method6227(arg1.anInt2418);
				arg1.anInt2418 = -1;
			}
		}
		if ((arg3 & 0x8) != 0) {
			local16 = arg2.method6153();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg2.method6168();
			Static16.method4091(arg1, local20, local16);
		}
		if ((arg3 & 0x1000) != 0) {
			arg1.aBoolean144 = arg2.method6168() == 1;
		}
		if ((arg3 & 0x400) != 0) {
			local16 = Static277.anInt5022;
			local20 = arg2.method6174();
			local211 = arg2.method6119();
			arg1.method6226(local211, local20, local16);
		}
		if ((arg3 & 0x20) != 0) {
			local16 = arg2.method6148();
			local20 = arg2.method6119();
			local211 = arg2.method6115();
			@Pc(327) int local327 = arg2.anInt7523;
			@Pc(335) boolean local335 = (local16 & 0x8000) != 0;
			if (arg1.aString20 != null && arg1.aClass26_1 != null) {
				@Pc(343) boolean local343 = false;
				if (local20 <= 1) {
					if (!local335 && (Static3.aBoolean3 && !Static203.aBoolean230 || Static46.aBoolean36)) {
						local343 = true;
					} else if (Static27.method463(arg1.aString20)) {
						local343 = true;
					}
				}
				if (!local343 && Static428.anInt7267 == 0) {
					Static247.aClass2_Sub17_5.anInt7523 = 0;
					arg2.method6140(local211, Static247.aClass2_Sub17_5.aByteArray94);
					Static247.aClass2_Sub17_5.anInt7523 = 0;
					@Pc(384) int local384 = -1;
					@Pc(392) String local392;
					if (local335) {
						local16 &= 0x7FFF;
						@Pc(402) Class133 local402 = Static317.method4500(Static247.aClass2_Sub17_5);
						local384 = local402.anInt3381;
						local392 = local402.aClass2_Sub1_Sub2_1.method50(Static247.aClass2_Sub17_5);
					} else {
						local392 = Static461.method6254(Static358.method5939(Static247.aClass2_Sub17_5));
					}
					arg1.aString74 = local392.trim();
					arg1.anInt7671 = local16 & 0xFF;
					arg1.anInt7697 = local16 >> 8;
					arg1.anInt7659 = 150;
					@Pc(442) int local442;
					if (local20 == 1 || local20 == 2) {
						local442 = local335 ? 17 : 1;
					} else {
						local442 = local335 ? 17 : 2;
					}
					if (local20 == 2) {
						Static264.method3702(local384, local392, null, "<img=1>" + arg1.method2105(), "<img=1>" + arg1.method2112(), local442, 0);
					} else if (local20 == 1) {
						Static264.method3702(local384, local392, null, "<img=0>" + arg1.method2105(), "<img=0>" + arg1.method2112(), local442, 0);
					} else {
						Static264.method3702(local384, local392, null, arg1.method2105(), arg1.method2112(), local442, 0);
					}
				}
			}
			arg2.anInt7523 = local327 + local211;
		}
		if ((arg3 & 0x100) != 0) {
			local38 = arg2.method6173();
		}
		if ((arg3 & 0x80) != 0) {
			local16 = arg2.method6115();
			@Pc(562) byte[] local562 = new byte[local16];
			@Pc(567) Class2_Sub17 local567 = new Class2_Sub17(local562);
			arg2.method6118(local562, local16);
			Static176.aClass2_Sub17Array1[arg0] = local567;
			arg1.method2106(local567);
		}
		if ((arg3 & 0x2) != 0) {
			Static436.aByteArray89[arg0] = arg2.method6120();
		}
		if ((arg3 & 0x20000) != 0) {
			arg1.aByte103 = arg2.method6120();
			arg1.aByte104 = arg2.method6123();
			arg1.aByte102 = arg2.method6150();
			arg1.aByte105 = (byte) arg2.method6119();
			arg1.anInt7652 = Static277.anInt5022 + arg2.method6148();
			arg1.anInt7698 = Static277.anInt5022 + arg2.method6153();
		}
		if ((arg3 & 0x2000) != 0) {
			local16 = arg2.method6153();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg2.method6171();
			local211 = arg2.method6138();
			arg1.method6222(local20, local211, local16, false);
		}
		if ((arg3 & 0x200) != 0) {
			arg1.anInt7650 = arg2.method6120();
			arg1.anInt7689 = arg2.method6123();
			arg1.anInt7661 = arg2.method6150();
			arg1.anInt7687 = arg2.method6150();
			arg1.anInt7629 = arg2.method6148() + Static277.anInt5022;
			arg1.anInt7669 = arg2.method6124() + Static277.anInt5022;
			arg1.anInt7643 = arg2.method6119();
			arg1.anInt7705 = 0;
			if (arg1.aBoolean146) {
				arg1.anInt7650 += arg1.anInt2409;
				arg1.anInt7661 += arg1.anInt2409;
				arg1.anInt7707 = 0;
				arg1.anInt7687 += arg1.anInt2406;
				arg1.anInt7689 += arg1.anInt2406;
			} else {
				arg1.anInt7707 = 1;
				arg1.anInt7661 += arg1.anIntArray632[0];
				arg1.anInt7650 += arg1.anIntArray632[0];
				arg1.anInt7689 += arg1.anIntArray633[0];
				arg1.anInt7687 += arg1.anIntArray633[0];
			}
		}
		if ((arg3 & 0x800) != 0) {
			local16 = arg2.method6110();
			arg1.anInt7649 = arg2.method6138();
			arg1.anInt7696 = arg2.method6168();
			arg1.aBoolean515 = (local16 & 0x8000) != 0;
			arg1.anInt7630 = local16 & 0x7FFF;
			arg1.anInt7677 = Static277.anInt5022 + arg1.anInt7630 + arg1.anInt7649;
		}
		if (!arg1.aBoolean146) {
			return;
		}
		if (local38 == 127) {
			arg1.method2111(arg1.anInt2409, arg1.anInt2406);
			return;
		}
		@Pc(852) byte local852;
		if (local38 == -1) {
			local852 = Static436.aByteArray89[arg0];
		} else {
			local852 = local38;
		}
		arg1.method2102(arg1.anInt2406, local852, arg1.anInt2409);
	}
}
