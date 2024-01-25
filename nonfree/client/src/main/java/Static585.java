import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!to", name = "K", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!to", name = "R", descriptor = "Lclient!uq;")
	public static Class362 aClass362_139;

	@OriginalMember(owner = "client!to", name = "N", descriptor = "I")
	public static int anInt9524 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!jja;III)V")
	public static void method7771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub30 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt4791 == -1 && arg2.anIntArray276 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg2.anInt4795 * Static336.aClass3_Sub41_18.aClass14_Sub9_2.method2998() >> 8;
		if (arg3 > arg2.anInt4794) {
			local16 = arg3 - arg2.anInt4794;
		} else if (arg3 < arg2.anInt4789) {
			local16 = arg2.anInt4789 - arg3;
		}
		if (arg2.anInt4793 < arg1) {
			local16 += arg1 - arg2.anInt4793;
		} else if (arg2.anInt4790 > arg1) {
			local16 += arg2.anInt4790 - arg1;
		}
		if (arg2.anInt4806 == 0 || arg2.anInt4806 < local16 - 256 || Static336.aClass3_Sub41_18.aClass14_Sub9_2.method2998() == 0 || arg2.anInt4804 != arg0) {
			if (arg2.aClass3_Sub12_Sub4_4 != null) {
				Static156.aClass3_Sub12_Sub1_1.method1766(arg2.aClass3_Sub12_Sub4_4);
				arg2.aClass3_Sub54_3 = null;
				arg2.aClass3_Sub12_Sub4_4 = null;
				arg2.aClass3_Sub39_Sub1_4 = null;
			}
			if (arg2.aClass3_Sub12_Sub4_3 != null) {
				Static156.aClass3_Sub12_Sub1_1.method1766(arg2.aClass3_Sub12_Sub4_3);
				arg2.aClass3_Sub12_Sub4_3 = null;
				arg2.aClass3_Sub39_Sub1_3 = null;
				arg2.aClass3_Sub54_2 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(156) int local156 = arg2.anInt4806 - arg2.anInt4800;
		if (local156 < 0) {
			local156 = arg2.anInt4806;
		}
		@Pc(163) int local163 = local26;
		@Pc(169) int local169 = local16 - arg2.anInt4800;
		if (local169 > 0 && local156 > 0) {
			local163 = (local156 - local169) * local26 / local156;
		}
		Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866();
		@Pc(190) int local190 = 8192;
		@Pc(201) int local201 = (arg2.anInt4789 + arg2.anInt4794) / 2 - arg3;
		@Pc(212) int local212 = (arg2.anInt4790 + arg2.anInt4793) / 2 - arg1;
		@Pc(233) int local233;
		@Pc(248) int local248;
		if (local201 != 0 || local212 != 0) {
			local233 = -Static40.anInt856 - (int) (Math.atan2((double) local201, (double) local212) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local233 > 8192) {
				local233 = 16384 - local233;
			}
			if (local16 <= 0) {
				local248 = 8192;
			} else if (local16 < 4096) {
				local248 = local16 * 8192 / 4096 + 8192;
			} else {
				local248 = 16384;
			}
			local190 = local233 * local248 / 8192 + (16384 - local248 >> 1);
		}
		@Pc(358) Class3_Sub12_Sub4 local358;
		if (arg2.aClass3_Sub12_Sub4_4 != null) {
			arg2.aClass3_Sub12_Sub4_4.method8535(local163);
			arg2.aClass3_Sub12_Sub4_4.method8540(local190);
		} else if (arg2.anInt4791 >= 0) {
			local233 = arg2.anInt4801 == 256 && arg2.anInt4802 == 256 ? 256 : Static545.method6996(arg2.anInt4801, arg2.anInt4802);
			if (arg2.aBoolean317) {
				if (arg2.aClass3_Sub54_3 == null) {
					arg2.aClass3_Sub54_3 = Static670.method8933(aClass362_139, arg2.anInt4791);
				}
				if (arg2.aClass3_Sub54_3 != null) {
					if (arg2.aClass3_Sub39_Sub1_4 == null) {
						arg2.aClass3_Sub39_Sub1_4 = arg2.aClass3_Sub54_3.method8927(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub39_Sub1_4 != null) {
						local358 = Static687.method8546(arg2.aClass3_Sub39_Sub1_4, local233, local163 << 6, local190);
						local358.method8528(-1);
						Static156.aClass3_Sub12_Sub1_1.method1765(local358);
						arg2.aClass3_Sub12_Sub4_4 = local358;
					}
				}
			} else {
				@Pc(375) Class210 local375 = Static683.method4984(Static201.aClass362_43, arg2.anInt4791, 0);
				if (local375 != null) {
					@Pc(382) Class3_Sub39_Sub1 local382 = local375.method4986().method6312(Static33.aClass217_11);
					@Pc(390) Class3_Sub12_Sub4 local390 = Static687.method8546(local382, local233, local163 << 6, local190);
					local390.method8528(-1);
					Static156.aClass3_Sub12_Sub1_1.method1765(local390);
					arg2.aClass3_Sub12_Sub4_4 = local390;
				}
			}
		}
		if (arg2.aClass3_Sub12_Sub4_3 != null) {
			arg2.aClass3_Sub12_Sub4_3.method8535(local163);
			arg2.aClass3_Sub12_Sub4_3.method8540(local190);
			if (!arg2.aClass3_Sub12_Sub4_3.method9036()) {
				arg2.aClass3_Sub54_2 = null;
				arg2.aClass3_Sub12_Sub4_3 = null;
				arg2.aClass3_Sub39_Sub1_3 = null;
			}
		} else if (arg2.anIntArray276 != null && (arg2.anInt4798 -= arg4) <= 0) {
			local233 = arg2.anInt4801 == 256 && arg2.anInt4802 == 256 ? 256 : (int) (Math.random() * (double) (arg2.anInt4801 - arg2.anInt4802)) + arg2.anInt4802;
			if (arg2.aBoolean316) {
				if (arg2.aClass3_Sub54_2 == null) {
					local248 = (int) (Math.random() * (double) arg2.anIntArray276.length);
					arg2.aClass3_Sub54_2 = Static670.method8933(aClass362_139, arg2.anIntArray276[local248]);
				}
				if (arg2.aClass3_Sub54_2 != null) {
					if (arg2.aClass3_Sub39_Sub1_3 == null) {
						arg2.aClass3_Sub39_Sub1_3 = arg2.aClass3_Sub54_2.method8927(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub39_Sub1_3 != null) {
						local358 = Static687.method8546(arg2.aClass3_Sub39_Sub1_3, local233, local163 << 6, local190);
						local358.method8528(0);
						Static156.aClass3_Sub12_Sub1_1.method1765(local358);
						arg2.aClass3_Sub12_Sub4_3 = local358;
						arg2.anInt4798 = (int) (Math.random() * (double) (arg2.anInt4797 - arg2.anInt4805)) + arg2.anInt4805;
						return;
					}
				}
				return;
			}
			local248 = (int) (Math.random() * (double) arg2.anIntArray276.length);
			@Pc(555) Class210 local555 = Static683.method4984(Static201.aClass362_43, arg2.anIntArray276[local248], 0);
			if (local555 != null) {
				@Pc(562) Class3_Sub39_Sub1 local562 = local555.method4986().method6312(Static33.aClass217_11);
				@Pc(570) Class3_Sub12_Sub4 local570 = Static687.method8546(local562, local233, local163 << 6, local190);
				local570.method8528(0);
				Static156.aClass3_Sub12_Sub1_1.method1765(local570);
				arg2.aClass3_Sub12_Sub4_3 = local570;
				arg2.anInt4798 = arg2.anInt4805 + (int) ((double) (arg2.anInt4797 - arg2.anInt4805) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I")
	public static int method7772(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
