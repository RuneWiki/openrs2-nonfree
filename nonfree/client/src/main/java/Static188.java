import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "Lclient!dd;")
	public static Class52 aClass52_2;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Lclient!bca;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_2 = new Class243(9, 7);

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
	public static int anInt91 = -60;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!wca;Lclient!qa;I)V")
	public static void method248(@OriginalArg(0) int arg0, @OriginalArg(2) Class310 arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class209 local14 = arg1.method7649(arg2);
		if (local14 == null) {
			return;
		}
		arg2.N(arg0, arg3, arg1.anInt9163 + arg0, arg1.anInt9198 + arg3);
		if (Static68.anInt1451 == 2 || Static68.anInt1451 == 5 || Static4.aClass35_1 == null) {
			arg2.G(-16777216, local14, arg0, arg3);
			return;
		}
		@Pc(56) int local56;
		@Pc(53) int local53;
		@Pc(50) int local50;
		@Pc(63) int local63;
		if (Static427.anInt7875 == 4) {
			local56 = Static4.anInt115;
			local53 = Static365.anInt6883;
			local63 = 4096;
			local50 = (int) -Static161.aFloat56 & 0x3FFF;
		} else {
			local50 = (int) -Static161.aFloat56 + Static87.anInt1767 & 0x3FFF;
			local53 = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659;
			local56 = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660;
			local63 = 4096 - Static3.anInt111 * 16;
		}
		@Pc(89) int local89 = local56 / 32 + 48 + 208 - Static363.anInt1158 * 2;
		@Pc(108) int local108 = Static511.anInt8889 * 4 + 208 + 48 - Static511.anInt8889 * 2 - local53 / 32;
		Static4.aClass35_1.method7346((float) arg0 + (float) arg1.anInt9163 / 2.0F, (float) arg3 + (float) arg1.anInt9198 / 2.0F, (float) local89, (float) local108, local63, local50 << 2, local14, arg0, arg3);
		@Pc(159) int local159;
		@Pc(169) int local169;
		@Pc(180) int local180;
		@Pc(191) int local191;
		for (@Pc(142) Class2_Sub32 local142 = (Class2_Sub32) Static239.aClass249_71.method6527(); local142 != null; local142 = (Class2_Sub32) Static239.aClass249_71.method6525()) {
			@Pc(147) int local147 = local142.anInt5391;
			local159 = (Static105.aClass86_3.anIntArray321[local147] >> 14 & 0x3FFF) - Static238.anInt4280;
			local169 = (Static105.aClass86_3.anIntArray321[local147] & 0x3FFF) - Static371.anInt6936;
			local180 = local159 * 4 + 2 - local56 / 32;
			local191 = local169 * 4 + 2 - local53 / 32;
			Static457.method6975(local180, Static105.aClass86_3.anIntArray320[local147], arg1, local14, arg2, arg3, local191, arg0);
		}
		for (local159 = 0; local159 < Static185.anInt3396; local159++) {
			local169 = Static304.anIntArray478[local159] * 4 + 2 - local56 / 32;
			local180 = Static263.anIntArray440[local159] * 4 + 2 - local53 / 32;
			@Pc(248) Class129 local248 = Static505.aClass206_4.method5326(Static418.anIntArray598[local159]);
			if (local248.anIntArray392 != null) {
				local248 = local248.method3276(Static84.aClass302_1);
				if (local248 == null || local248.anInt3656 == -1) {
					continue;
				}
			}
			Static457.method6975(local169, local248.anInt3656, arg1, local14, arg2, arg3, local180, arg0);
		}
		@Pc(331) int local331;
		@Pc(341) int local341;
		for (@Pc(288) Class2_Sub40 local288 = (Class2_Sub40) Static357.aClass127_36.method3203(); local288 != null; local288 = (Class2_Sub40) Static357.aClass127_36.method3212()) {
			local180 = (int) (local288.aLong241 >> 28 & 0x3L);
			if (Static135.anInt2544 == local180) {
				local191 = (int) (local288.aLong241 & 0x3FFFL) - Static238.anInt4280;
				@Pc(320) int local320 = (int) (local288.aLong241 >> 14 & 0x3FFFL) - Static371.anInt6936;
				local331 = local191 * 4 + 2 - local56 / 32;
				local341 = local320 * 4 + 2 - local53 / 32;
				Static426.method6571(local341, arg0, Static173.aClass35Array17[0], local331, arg1, arg3, local14);
			}
		}
		@Pc(431) int local431;
		for (local180 = 0; local180 < Static520.anInt1936; local180++) {
			@Pc(372) Class2_Sub11 local372 = (Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local180]);
			if (local372 != null) {
				@Pc(377) Class1_Sub1_Sub2_Sub2 local377 = local372.aClass1_Sub1_Sub2_Sub2_1;
				if (local377.method4399() && Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 == local377.aByte90) {
					@Pc(393) Class12 local393 = local377.aClass12_1;
					if (local393 != null && local393.anIntArray21 != null) {
						local393 = local393.method455(Static84.aClass302_1);
					}
					if (local393 != null && local393.aBoolean22 && local393.aBoolean26) {
						local341 = local377.anInt7660 / 32 - local56 / 32;
						local431 = local377.anInt7659 / 32 - local53 / 32;
						if (local393.anInt329 == -1) {
							Static426.method6571(local431, arg0, Static173.aClass35Array17[1], local341, arg1, arg3, local14);
						} else {
							Static457.method6975(local341, local393.anInt329, arg1, local14, arg2, arg3, local431, arg0);
						}
					}
				}
			}
		}
		local191 = Static16.anInt362;
		@Pc(471) int[] local471 = Static325.anIntArray473;
		@Pc(515) int local515;
		@Pc(519) int local519;
		@Pc(547) int local547;
		for (local331 = 0; local331 < local191; local331++) {
			@Pc(481) Class1_Sub1_Sub2_Sub1 local481 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local471[local331]];
			if (local481 != null && local481.method2947() && Static266.aClass1_Sub1_Sub2_Sub1_1 != local481 && local481.aByte90 == Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90) {
				local431 = local481.anInt7660 / 32 - local56 / 32;
				local515 = local481.anInt7659 / 32 - local53 / 32;
				@Pc(517) boolean local517 = false;
				for (local519 = 0; local519 < Static12.anInt264; local519++) {
					if (local481.aString83.equals(Static145.aStringArray15[local519]) && Static399.anIntArray114[local519] != 0) {
						local517 = true;
						break;
					}
				}
				@Pc(545) boolean local545 = false;
				for (local547 = 0; local547 < Static162.anInt2943; local547++) {
					if (local481.aString83.equals(Static308.aClass105Array1[local547].aString74)) {
						local545 = true;
						break;
					}
				}
				@Pc(567) boolean local567 = false;
				if (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3258 != 0 && local481.anInt3258 != 0 && Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3258 == local481.anInt3258) {
					local567 = true;
				}
				if (local481.aBoolean259) {
					Static426.method6571(local515, arg0, Static173.aClass35Array17[6], local431, arg1, arg3, local14);
				} else if (local517) {
					Static426.method6571(local515, arg0, Static173.aClass35Array17[3], local431, arg1, arg3, local14);
				} else if (local545) {
					Static426.method6571(local515, arg0, Static173.aClass35Array17[5], local431, arg1, arg3, local14);
				} else if (local567) {
					Static426.method6571(local515, arg0, Static173.aClass35Array17[4], local431, arg1, arg3, local14);
				} else {
					Static426.method6571(local515, arg0, Static173.aClass35Array17[2], local431, arg1, arg3, local14);
				}
			}
		}
		@Pc(662) Class132[] local662 = Static286.aClass132Array1;
		@Pc(747) int local747;
		for (local431 = 0; local431 < local662.length; local431++) {
			@Pc(670) Class132 local670 = local662[local431];
			if (local670 != null && local670.anInt3729 != 0 && Static115.anInt2326 % 20 < 10) {
				@Pc(712) int local712;
				if (local670.anInt3729 == 1) {
					@Pc(697) Class2_Sub11 local697 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local670.anInt3734);
					if (local697 != null) {
						@Pc(702) Class1_Sub1_Sub2_Sub2 local702 = local697.aClass1_Sub1_Sub2_Sub2_1;
						local712 = local702.anInt7660 / 32 - local56 / 32;
						local547 = local702.anInt7659 / 32 - local53 / 32;
						Static162.method2747(local670.anInt3727, arg3, local14, arg1, local712, local547, arg0, 360000L);
					}
				}
				if (local670.anInt3729 == 2) {
					local747 = local670.anInt3726 / 32 - local56 / 32;
					local519 = local670.anInt3724 / 32 - local53 / 32;
					@Pc(763) long local763 = (long) (local670.anInt3732 << 5);
					@Pc(767) long local767 = local763 * local763;
					Static162.method2747(local670.anInt3727, arg3, local14, arg1, local747, local519, arg0, local767);
				}
				if (local670.anInt3729 == 10 && local670.anInt3734 >= 0 && local670.anInt3734 < Static278.aClass1_Sub1_Sub2_Sub1Array1.length) {
					@Pc(799) Class1_Sub1_Sub2_Sub1 local799 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local670.anInt3734];
					if (local799 != null) {
						local519 = local799.anInt7660 / 32 - local56 / 32;
						local712 = local799.anInt7659 / 32 - local53 / 32;
						Static162.method2747(local670.anInt3727, arg3, local14, arg1, local519, local712, arg0, 360000L);
					}
				}
			}
		}
		if (Static427.anInt7875 == 4) {
			return;
		}
		if (Static440.anInt8023 != 0) {
			local515 = Static440.anInt8023 * 4 + (Static266.aClass1_Sub1_Sub2_Sub1_1.method4394() - 1) * 2 + 2 - local56 / 32;
			local747 = Static203.anInt3677 * 4 + Static266.aClass1_Sub1_Sub2_Sub1_1.method4394() * 2 + 2 - local53 / 32 - 2;
			Static426.method6571(local747, arg0, Static498.aClass35Array39[Static40.aBoolean609 ? 1 : 0], local515, arg1, arg3, local14);
		}
		arg2.method6052(arg3 + arg1.anInt9198 / 2 - 1, -1, arg1.anInt9163 / 2 + arg0 - 1, 3, 3);
		return;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([I[IILclient!lk;[I)V")
	public static void method253(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg2.aClass149Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass149Array3[local23] = null;
					} else {
						@Pc(40) Class4 local40 = Static396.aClass157_2.method3745(local13);
						@Pc(43) int local43 = local40.anInt123;
						@Pc(48) Class149 local48 = arg2.aClass149Array3[local23];
						if (local48 != null) {
							if (local48.anInt4196 == local13) {
								if (local43 == 0) {
									local48 = arg2.aClass149Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt4194 = local21;
									local48.anInt4199 = 0;
									local48.anInt4200 = 0;
									local48.anInt4192 = 1;
									local48.anInt4197 = 0;
									Static250.method3962(0, arg2.anInt7659, arg2.aByte90, local40, false, arg2.anInt7660);
								} else if (local43 == 2) {
									local48.anInt4199 = 0;
								}
							} else if (local40.anInt128 >= Static396.aClass157_2.method3745(local48.anInt4196).anInt128) {
								local48 = arg2.aClass149Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg2.aClass149Array3[local23] = new Class149();
							local48.anInt4192 = 1;
							local48.anInt4197 = 0;
							local48.anInt4196 = local13;
							local48.anInt4199 = 0;
							local48.anInt4194 = local21;
							local48.anInt4200 = 0;
							Static250.method3962(0, arg2.anInt7659, arg2.aByte90, local40, false, arg2.anInt7660);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(III)Z")
	public static boolean method254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fba;")
	public static RuntimeException_Sub1 method259(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString60 = local12.aString60 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
