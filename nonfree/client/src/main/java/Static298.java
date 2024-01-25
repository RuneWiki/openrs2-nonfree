import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
	public static int anInt6013;

	@OriginalMember(owner = "client!tl", name = "J", descriptor = "[[[Lclient!gk;")
	public static Class83[][][] aClass83ArrayArrayArray1;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "Lclient!vk;")
	public static Class207 aClass207_35 = new Class207(8);

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
	public static volatile int anInt6015 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BIIJ)V")
	public static void method5213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg2 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static102.method1601(0, arg1, local10, arg0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], 0, true, local22, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], 0);
			return;
		}
		@Pc(44) Class79 local44 = Static129.method2097(local29);
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (local22 == 0 || local22 == 2) {
			local58 = local44.anInt1884;
			local55 = local44.anInt1897;
		} else {
			local55 = local44.anInt1884;
			local58 = local44.anInt1897;
		}
		@Pc(69) int local69 = local44.anInt1853;
		if (local22 != 0) {
			local69 = (local69 << local22 & 0xF) + (local69 >> 4 - local22);
		}
		Static102.method1601(local69, arg1, 0, arg0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0], local58, true, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], local55);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([Lclient!ps;II)V")
	public static void method5214(@OriginalArg(0) Class163[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) Class163 local21 = arg0[local15];
			if (local21 != null && arg1 == local21.anInt4918 && (!local21.aBoolean411 || !Static40.method859(local21))) {
				if (local21.anInt4934 == 0) {
					if (!local21.aBoolean411 && Static40.method859(local21) && local21 != Static139.aClass163_10) {
						continue;
					}
					method5214(arg0, local21.anInt4947);
					if (local21.aClass163Array3 != null) {
						method5214(local21.aClass163Array3, local21.anInt4947);
					}
					@Pc(71) Class1_Sub26 local71 = (Class1_Sub26) aClass207_35.method5555((long) local21.anInt4947);
					if (local71 != null) {
						Static46.method938(local71.anInt3825);
					}
				}
				if (local21.anInt4934 == 6) {
					@Pc(100) int local100;
					if (local21.anInt4920 != -1 || local21.anInt4932 != -1) {
						@Pc(95) boolean local95 = Static302.method5239(local21);
						if (local95) {
							local100 = local21.anInt4932;
						} else {
							local100 = local21.anInt4920;
						}
						if (local100 != -1) {
							@Pc(112) Class177 local112 = Static354.method5863(local100);
							if (local112 != null) {
								local21.anInt4922 += Static41.anInt1126;
								while (local112.anIntArray528[local21.anInt4965] < local21.anInt4922) {
									local21.anInt4922 -= local112.anIntArray528[local21.anInt4965];
									local21.anInt4965++;
									if (local112.anIntArray529.length <= local21.anInt4965) {
										local21.anInt4965 -= local112.anInt5408;
										if (local21.anInt4965 < 0 || local21.anInt4965 >= local112.anIntArray529.length) {
											local21.anInt4965 = 0;
										}
									}
									local21.anInt4950 = local21.anInt4965 + 1;
									if (local21.anInt4950 >= local112.anIntArray529.length) {
										local21.anInt4950 -= local112.anInt5408;
										if (local21.anInt4950 < 0 || local21.anInt4950 >= local112.anIntArray529.length) {
											local21.anInt4950 = -1;
										}
									}
									Static340.method5639(local21);
								}
							}
						}
					}
					if (local21.anInt4937 != 0 && !local21.aBoolean411) {
						@Pc(227) int local227 = local21.anInt4937 >> 16;
						@Pc(231) int local231 = local227 * Static41.anInt1126;
						local100 = local21.anInt4937 << 16 >> 16;
						local21.anInt4931 = local21.anInt4931 + local231 & 0x3FFF;
						local100 *= Static41.anInt1126;
						local21.anInt5000 = local100 + local21.anInt5000 & 0x3FFF;
						Static340.method5639(local21);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lclient!fp;")
	public static Class74 method5215(@OriginalArg(1) int arg0) {
		@Pc(12) Class74 local12 = (Class74) Static9.aClass37_1.method915((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static91.aClass134_40.method3009(arg0, 36);
		local12 = new Class74();
		local12.anInt1729 = arg0;
		if (local22 != null) {
			local12.method1457(new Class1_Sub21(local22));
		}
		local12.method1453();
		Static9.aClass37_1.method922((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)V")
	public static void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class83 local28 = Static347.aClass83ArrayArrayArray3[local9][arg0][arg1] = Static347.aClass83ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte31--;
				for (@Pc(40) Class59 local40 = local28.aClass59_2; local40 != null; local40 = local40.aClass59_1) {
					@Pc(44) Class10_Sub1 local44 = local40.aClass10_Sub1_1;
					if (local44.aShort94 == arg0 && local44.aShort91 == arg1) {
						local44.aByte73--;
					}
				}
			}
		}
		if (Static347.aClass83ArrayArrayArray3[0][arg0][arg1] == null) {
			Static347.aClass83ArrayArrayArray3[0][arg0][arg1] = new Class83(0, arg0, arg1);
			Static347.aClass83ArrayArrayArray3[0][arg0][arg1].aByte27 = 1;
		}
		Static347.aClass83ArrayArrayArray3[0][arg0][arg1].aClass83_1 = local7;
		Static347.aClass83ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!ma;)V")
	public static void method5217(@OriginalArg(1) Class1_Sub23 arg0) {
		if (Static347.aClass83ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface4 local8 = null;
		if (arg0.anInt3749 == 0) {
			local8 = (Interface4) Static107.method1713(arg0.anInt3747, arg0.anInt3746, arg0.anInt3755);
		}
		if (arg0.anInt3749 == 1) {
			local8 = (Interface4) Static14.method198(arg0.anInt3747, arg0.anInt3746, arg0.anInt3755);
		}
		if (arg0.anInt3749 == 2) {
			local8 = (Interface4) Static183.method3234(arg0.anInt3747, arg0.anInt3746, arg0.anInt3755, jb.class);
		}
		if (arg0.anInt3749 == 3) {
			local8 = (Interface4) Static137.method4969(arg0.anInt3747, arg0.anInt3746, arg0.anInt3755);
		}
		if (local8 == null) {
			arg0.anInt3760 = 0;
			arg0.anInt3751 = 0;
			arg0.anInt3750 = -1;
		} else {
			arg0.anInt3750 = local8.method5445();
			arg0.anInt3751 = local8.method5452();
			arg0.anInt3760 = local8.method5449();
		}
	}
}
