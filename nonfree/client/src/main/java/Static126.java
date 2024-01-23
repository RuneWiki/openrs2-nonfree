import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public static int anInt1738;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public static int anInt1742;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString109 = "flash1:";

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!vj;")
	public static Class29_Sub1 method1641(@OriginalArg(1) int arg0) {
		return Static212.aBoolean26 && Static61.anInt1170 <= arg0 && Static196.anInt3705 >= arg0 ? Static272.aClass29_Sub1Array4[arg0 - Static61.anInt1170] : null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZZB)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int local3;
		@Pc(12) Class15_Sub5_Sub1 local12;
		@Pc(115) int local115;
		@Pc(121) int local121;
		@Pc(128) int local128;
		@Pc(151) int local151;
		@Pc(156) int local156;
		@Pc(169) int local169;
		for (local3 = 0; local3 < Static85.anInt1689; local3++) {
			local12 = Static83.aClass15_Sub5_Sub1Array1[Static104.anIntArray178[local3]];
			if (local12 != null && local12.method4685() && local12.aClass99_1.method2648()) {
				@Pc(28) int local28 = local12.method4702();
				if (arg2) {
					if (!local12.aClass99_1.aBoolean189) {
						continue;
					}
				} else if (local12.aClass99_1.aBoolean190 != arg1 || arg0 != 0 && arg0 != local28) {
					continue;
				}
				@Pc(105) int local105;
				if (local28 == 1) {
					if ((local12.anInt5559 & 0x7F) == 64 && (local12.anInt5557 & 0x7F) == 64) {
						local105 = local12.anInt5559 >> 7;
						local115 = local12.anInt5557 >> 7;
						if (local105 >= 0 && local105 < 104 && local115 >= 0 && local115 < 104) {
							local169 = Static281.anIntArrayArray41[local105][local115]++;
						}
					}
				} else if (((local28 & 0x1) != 0 || (local12.anInt5559 & 0x7F) == 0 && (local12.anInt5557 & 0x7F) == 0) && ((local28 & 0x1) != 1 || (local12.anInt5559 & 0x7F) == 64 && (local12.anInt5557 & 0x7F) == 64)) {
					local105 = local12.anInt5559 - local28 * 64 >> 7;
					local115 = local12.anInt5557 - local28 * 64 >> 7;
					local121 = local12.method4702() + local105;
					local128 = local115 + local12.method4702();
					if (local105 < 0) {
						local105 = 0;
					}
					if (local121 > 104) {
						local121 = 104;
					}
					if (local128 > 104) {
						local128 = 104;
					}
					if (local115 < 0) {
						local115 = 0;
					}
					for (local151 = local105; local151 < local121; local151++) {
						for (local156 = local115; local156 < local128; local156++) {
							local169 = Static281.anIntArrayArray41[local151][local156]++;
						}
					}
				}
			}
		}
		label216: for (local3 = 0; local3 < Static85.anInt1689; local3++) {
			local12 = Static83.aClass15_Sub5_Sub1Array1[Static104.anIntArray178[local3]];
			@Pc(267) long local267 = (long) Static104.anIntArray178[local3] << 32 | 0x20000000L;
			if (local12 != null && local12.method4685() && local12.aClass99_1.method2648()) {
				local115 = local12.method4702();
				if (arg2) {
					if (!local12.aClass99_1.aBoolean189) {
						continue;
					}
				} else if (local12.aClass99_1.aBoolean190 != arg1 || arg0 != 0 && arg0 != local115) {
					continue;
				}
				local12.aBoolean370 = true;
				if (local115 == 1) {
					if ((local12.anInt5559 & 0x7F) == 64 && (local12.anInt5557 & 0x7F) == 64) {
						local121 = local12.anInt5559 >> 7;
						local128 = local12.anInt5557 >> 7;
						if (local121 < 0 || local121 >= 104 || local128 < 0 || local128 >= 104) {
							continue;
						}
						if (Static281.anIntArrayArray41[local121][local128] > 1) {
							local169 = Static281.anIntArrayArray41[local121][local128]--;
							continue;
						}
					}
				} else if ((local115 & 0x1) == 0 && (local12.anInt5559 & 0x7F) == 0 && (local12.anInt5557 & 0x7F) == 0 || (local115 & 0x1) == 1 && (local12.anInt5559 & 0x7F) == 64 && (local12.anInt5557 & 0x7F) == 64) {
					local128 = local12.anInt5557 - local115 * 64 >> 7;
					local121 = local12.anInt5559 - local115 * 64 >> 7;
					local151 = local115 + local121;
					if (local121 < 0) {
						local121 = 0;
					}
					if (local151 > 104) {
						local151 = 104;
					}
					local156 = local115 + local128;
					if (local156 > 104) {
						local156 = 104;
					}
					if (local128 < 0) {
						local128 = 0;
					}
					@Pc(484) boolean local484 = true;
					@Pc(486) int local486;
					@Pc(495) int local495;
					for (local486 = local121; local486 < local151; local486++) {
						for (local495 = local128; local495 < local156; local495++) {
							if (Static281.anIntArrayArray41[local486][local495] <= 1) {
								local484 = false;
								break;
							}
						}
					}
					if (local484) {
						local486 = local121;
						while (true) {
							if (local486 >= local151) {
								continue label216;
							}
							for (local495 = local128; local495 < local156; local495++) {
								local169 = Static281.anIntArrayArray41[local486][local495]--;
							}
							local486++;
						}
					}
				}
				if (!local12.aClass99_1.aBoolean192) {
					local267 |= Long.MIN_VALUE;
				}
				local12.aBoolean370 = false;
				local12.anInt5587 = Static69.method4275(local12.anInt5557, Static65.anInt1300, local12.anInt5559);
				Static95.method1737(Static65.anInt1300, local12.anInt5559, local12.anInt5557, local12.anInt5587, (local115 - 1) * 64 + 60, local12, local12.anInt5554, local267, local12.aBoolean372);
			}
		}
	}
}
