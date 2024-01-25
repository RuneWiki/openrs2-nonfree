import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "x", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!as", name = "P", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!as", name = "G", descriptor = "Lclient!jm;")
	public static final Class105 aClass105_1 = new Class105("", 13);

	@OriginalMember(owner = "client!as", name = "M", descriptor = "I")
	public static int anInt401 = 0;

	@OriginalMember(owner = "client!as", name = "N", descriptor = "Lclient!tg;")
	public static final Class195 aClass195_1 = new Class195();

	@OriginalMember(owner = "client!as", name = "O", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_16 = new Class18(81, 3);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)V")
	public static void method446(@OriginalArg(0) int arg0) {
		Static156.anInt3218 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method447(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static342.aClass106_225.method2927(Static254.anInt5172) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static119.aClass106_92.method2927(Static254.anInt5172) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ge;ILclient!wc;II)V")
	public static void method448(@OriginalArg(0) Class1_Sub7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub2_Sub6_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg3 & 0x4) != 0) {
			Static83.aByteArray39[arg1] = arg0.method2137();
		}
		if ((arg3 & 0x400) != 0) {
			arg2.anInt6751 = arg0.method2117();
			arg2.anInt6737 = arg0.method2117();
			arg2.anInt6791 = arg0.method2154();
			arg2.anInt6777 = arg0.method2154();
			arg2.anInt6779 = arg0.method2139() + Static51.anInt1301;
			arg2.lb = arg0.method2161() + Static51.anInt1301;
			arg2.anInt6767 = arg0.method2132();
			arg2.anInt6796 = 0;
			if (arg2.anInt6691 == -1) {
				arg2.anInt6751 += arg2.anIntArray505[0];
				arg2.anInt6791 += arg2.anIntArray505[0];
				arg2.anInt6777 += arg2.anIntArray504[0];
				arg2.anInt6798 = 1;
				arg2.anInt6737 += arg2.anIntArray504[0];
			} else {
				arg2.anInt6791 += arg2.anInt6691;
				arg2.anInt6737 += arg2.anInt6684;
				arg2.anInt6777 += arg2.anInt6684;
				arg2.anInt6751 += arg2.anInt6691;
				arg2.anInt6798 = 0;
			}
		}
		if ((arg3 & 0x1000) != 0) {
			arg2.aString64 = arg0.method2109();
			if (arg2.aString64.charAt(0) == '~') {
				arg2.aString64 = arg2.aString64.substring(1);
				Static19.method530(2, 0, arg2.method5857(), arg2.aString64, arg2.method5853());
			} else if (arg2 == Static191.aClass11_Sub2_Sub6_Sub1_4) {
				Static19.method530(2, 0, arg2.method5857(), arg2.aString64, arg2.method5853());
			}
			arg2.anInt6740 = 0;
			arg2.anInt6753 = 150;
			arg2.anInt6765 = 0;
		}
		if ((arg3 & 0x100) != 0) {
			local7 = arg0.method2122();
		}
		@Pc(230) int local230;
		if ((arg3 & 0x4000) != 0) {
			local230 = arg0.method2161();
			arg2.anInt6744 = arg0.method2156();
			arg2.anInt6771 = arg0.method2156();
			arg2.aBoolean500 = (local230 & 0x8000) != 0;
			arg2.anInt6757 = local230 & 0x7FFF;
			arg2.anInt6750 = arg2.anInt6744 + Static51.anInt1301 + arg2.anInt6757;
		}
		@Pc(276) int local276;
		@Pc(280) int local280;
		if ((arg3 & 0x2000) != 0) {
			local230 = Static51.anInt1301;
			local276 = arg0.method2134();
			local280 = arg0.method2156();
			arg2.method5895(local276, local280, local230);
		}
		@Pc(308) int local308;
		@Pc(314) int local314;
		if ((arg3 & 0x200) != 0) {
			local230 = arg0.method2113();
			@Pc(300) int[] local300 = new int[local230];
			@Pc(303) int[] local303 = new int[local230];
			@Pc(306) int[] local306 = new int[local230];
			for (local308 = 0; local308 < local230; local308++) {
				local314 = arg0.method2139();
				if (local314 == 65535) {
					local314 = -1;
				}
				local300[local308] = local314;
				local303[local308] = arg0.method2113();
				local306[local308] = arg0.method2139();
			}
			Static188.method3532(local306, local300, arg2, local303);
		}
		@Pc(368) int local368;
		if ((arg3 & 0x2) != 0) {
			local230 = arg0.method2123();
			local276 = arg0.method2113();
			local280 = arg0.method2113();
			local368 = arg0.anInt2219;
			@Pc(379) boolean local379 = (local230 & 0x8000) != 0;
			if (arg2.aString63 != null && arg2.aClass200_1 != null) {
				@Pc(387) boolean local387 = false;
				if (local276 <= 1) {
					if (!local379 && (Static212.aBoolean313 && !Static67.aBoolean111 || Static9.aBoolean12)) {
						local387 = true;
					} else if (Static17.method2116(arg2.aString63)) {
						local387 = true;
					}
				}
				if (!local387 && Static94.anInt2085 == 0) {
					Static214.aClass1_Sub7_5.anInt2219 = 0;
					arg0.method2126(Static214.aClass1_Sub7_5.aByteArray41, local280);
					Static214.aClass1_Sub7_5.anInt2219 = 0;
					@Pc(433) int local433 = -1;
					@Pc(452) String local452;
					if (local379) {
						local230 &= 0x7FFF;
						@Pc(443) Class14 local443 = Static254.method4769(Static214.aClass1_Sub7_5);
						local433 = local443.anInt489;
						local452 = local443.aClass1_Sub4_Sub16_1.method3418(Static214.aClass1_Sub7_5);
					} else {
						local452 = Static113.method2408(Static196.method3687(Static337.method5674(Static214.aClass1_Sub7_5)));
					}
					arg2.aString64 = local452.trim();
					arg2.anInt6753 = 150;
					arg2.anInt6765 = local230 & 0xFF;
					arg2.anInt6740 = local230 >> 8;
					@Pc(493) int local493;
					if (local276 == 1 || local276 == 2) {
						local493 = local379 ? 17 : 1;
					} else {
						local493 = local379 ? 17 : 2;
					}
					if (local276 == 2) {
						Static134.method2729("<img=1>" + arg2.method5853(), null, local452, "<img=1>" + arg2.method5857(), local493, 0, local433);
					} else if (local276 == 1) {
						Static134.method2729("<img=0>" + arg2.method5853(), null, local452, "<img=0>" + arg2.method5857(), local493, 0, local433);
					} else {
						Static134.method2729(arg2.method5853(), null, local452, arg2.method5857(), local493, 0, local433);
					}
				}
			}
			arg0.anInt2219 = local368 + local280;
		}
		if ((arg3 & 0x1) != 0) {
			local230 = arg0.method2132();
			@Pc(598) byte[] local598 = new byte[local230];
			@Pc(603) Class1_Sub7 local603 = new Class1_Sub7(local598);
			arg0.method2126(local598, local230);
			Static242.aClass1_Sub7Array1[arg1] = local603;
			arg2.method5859(local603);
		}
		if ((arg3 & 0x40) != 0) {
			arg2.anInt6697 = arg0.method2139();
			if (arg2.anInt6798 == 0) {
				arg2.method5890(arg2.anInt6697);
				arg2.anInt6697 = -1;
			}
		}
		if ((arg3 & 0x80) != 0) {
			local230 = arg0.method2134();
			local276 = arg0.method2156();
			arg2.method5895(local230, local276, Static51.anInt1301);
			arg2.anInt6769 = Static51.anInt1301 + 300;
			arg2.anInt6780 = arg0.method2113();
		}
		if ((arg3 & 0x10) != 0) {
			local230 = arg0.method2161();
			if (local230 == 65535) {
				local230 = -1;
			}
			arg2.anInt6736 = local230;
		}
		if ((arg3 & 0x8) != 0) {
			local230 = arg0.method2139();
			if (local230 == 65535) {
				local230 = -1;
			}
			local276 = arg0.method2113();
			Static311.method5139(local230, arg2, local276);
		}
		if ((arg3 & 0x800) != 0) {
			local230 = arg0.method2139();
			local276 = arg0.method2140();
			if (local230 == 65535) {
				local230 = -1;
			}
			@Pc(733) boolean local733 = true;
			@Pc(767) Class199 local767;
			if (local230 != -1 && arg2.anInt6795 != -1) {
				@Pc(748) Class109 local748;
				if (local230 == arg2.anInt6795) {
					local748 = Static345.method5752(local230);
					if (local748.aBoolean221 && local748.anInt3267 != -1) {
						@Pc(798) Class199 local798 = Static161.method3066(local748.anInt3267);
						local314 = local798.anInt6015;
						if (local314 == 0) {
							local733 = false;
						} else if (local314 == 1) {
							local733 = true;
						} else if (local314 == 2) {
							arg2.anInt6781 = 0;
							local733 = false;
						}
					}
				} else {
					local748 = Static345.method5752(local230);
					@Pc(753) Class109 local753 = Static345.method5752(arg2.anInt6795);
					if (local748.anInt3267 != -1 && local753.anInt3267 != -1) {
						local767 = Static161.method3066(local748.anInt3267);
						@Pc(772) Class199 local772 = Static161.method3066(local753.anInt3267);
						if (local767.anInt6020 < local772.anInt6020) {
							local733 = false;
						}
					}
				}
			}
			if (local733) {
				arg2.anInt6734 = local276 >> 16;
				arg2.anInt6795 = local230;
				local368 = Static51.anInt1301;
				arg2.anInt6748 = 0;
				arg2.anInt6782 = 1;
				arg2.anInt6774 = local368 + (local276 & 0xFFFF);
				arg2.anInt6778 = 0;
				if (local368 < arg2.anInt6774) {
					arg2.anInt6778 = -1;
				}
				if (arg2.anInt6795 != -1 && arg2.anInt6774 == local368) {
					local308 = Static345.method5752(arg2.anInt6795).anInt3267;
					if (local308 != -1) {
						local767 = Static161.method3066(local308);
						if (local767 != null && local767.anIntArray467 != null) {
							Static96.method2060(local767, arg2 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg2.aByte79, 0, arg2.anInt6729, arg2.anInt6726);
						}
					}
				}
			}
		}
		if (arg2.anInt6691 == -1) {
			return;
		}
		if (local7 == 127) {
			arg2.method5860(arg2.anInt6691, arg2.anInt6684);
			return;
		}
		@Pc(924) byte local924;
		if (local7 == -1) {
			local924 = Static83.aByteArray39[arg1];
		} else {
			local924 = local7;
		}
		arg2.method5856(arg2.anInt6684, local924, arg2.anInt6691);
	}
}
