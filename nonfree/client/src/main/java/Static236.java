import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	public static int anInt2456;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public static void method2130() {
		if (Static357.method3877() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static247.anInt5067 - 4 & 0xFF);
		@Pc(23) int local23 = Static247.anInt5067 % Static233.anInt5573;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static134.anInt2971; local29++) {
				Static304.aByteArrayArrayArray10[local25][local23][local29] = local19;
			}
		}
		if (Static242.anInt6745 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static137.anIntArray266[local29] = -1000000;
			Static96.anIntArray504[local29] = 1000000;
			Static173.anIntArray346[local29] = 0;
			Static352.anIntArray531[local29] = 1000000;
			Static185.anIntArray364[local29] = 0;
		}
		@Pc(139) int local139;
		if (Static147.anInt3204 != 1) {
			local139 = Static94.method2022(Static64.anInt1797, Static320.anInt5326, Static242.anInt6745);
			if (local139 - Static95.anInt2319 >= 800 || (Static200.aByteArrayArrayArray8[Static242.anInt6745][Static320.anInt5326 >> 7][Static64.anInt1797 >> 7] & 0x4) == 0) {
				return;
			}
			Static168.method3368(Static320.anInt5326 >> 7, 1, Static64.anInt1797 >> 7, false, Static77.aClass194ArrayArrayArray1);
			return;
		}
		if ((Static200.aByteArrayArrayArray8[Static242.anInt6745][Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7][Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7] & 0x4) != 0) {
			Static168.method3368(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7, 0, Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7, false, Static77.aClass194ArrayArrayArray1);
		}
		if (Static179.anInt3884 >= 2560) {
			return;
		}
		local139 = Static320.anInt5326 >> 7;
		@Pc(143) int local143 = Static64.anInt1797 >> 7;
		@Pc(148) int local148 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7;
		@Pc(153) int local153 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7;
		@Pc(161) int local161;
		if (local139 < local148) {
			local161 = local148 - local139;
		} else {
			local161 = local139 - local148;
		}
		@Pc(174) int local174;
		if (local153 > local143) {
			local174 = local153 - local143;
		} else {
			local174 = local143 - local153;
		}
		if ((local161 != 0 || local174 != 0) && local161 > -Static233.anInt5573 && local161 < Static233.anInt5573 && local174 > -Static134.anInt2971 && local174 < Static134.anInt2971) {
			@Pc(246) int local246;
			@Pc(248) int local248;
			if (local161 <= local174) {
				local246 = local161 * 65536 / local174;
				local248 = 32768;
				while (local153 != local143) {
					if (local143 < local153) {
						local143++;
					} else if (local143 > local153) {
						local143--;
					}
					if ((Static200.aByteArrayArrayArray8[Static242.anInt6745][local139][local143] & 0x4) != 0) {
						Static168.method3368(local139, 1, local143, false, Static77.aClass194ArrayArrayArray1);
						return;
					}
					local248 += local246;
					if (local248 >= 65536) {
						if (local139 < local148) {
							local139++;
						} else if (local139 > local148) {
							local139--;
						}
						local248 -= 65536;
						if ((Static200.aByteArrayArrayArray8[Static242.anInt6745][local139][local143] & 0x4) != 0) {
							Static168.method3368(local139, 1, local143, false, Static77.aClass194ArrayArrayArray1);
							return;
						}
					}
				}
				return;
			}
			local246 = local174 * 65536 / local161;
			local248 = 32768;
			while (local148 != local139) {
				if (local148 > local139) {
					local139++;
				} else if (local148 < local139) {
					local139--;
				}
				if ((Static200.aByteArrayArrayArray8[Static242.anInt6745][local139][local143] & 0x4) != 0) {
					Static168.method3368(local139, 1, local143, false, Static77.aClass194ArrayArrayArray1);
					return;
				}
				local248 += local246;
				if (local248 >= 65536) {
					local248 -= 65536;
					if (local143 < local153) {
						local143++;
					} else if (local143 > local153) {
						local143--;
					}
					if ((Static200.aByteArrayArrayArray8[Static242.anInt6745][local139][local143] & 0x4) != 0) {
						Static168.method3368(local139, 1, local143, false, Static77.aClass194ArrayArrayArray1);
						return;
					}
				}
			}
			return;
		}
		Static109.method2355("RC: " + local139 + "," + local143 + " " + local148 + "," + local153 + " " + Static234.anInt4783 + "," + Static32.anInt2224, null);
		return;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!wo;B)I")
	public static int method2131(@OriginalArg(0) Class216 arg0) {
		@Pc(13) int local13 = 0;
		if (arg0.method5651(Static232.anInt4766)) {
			local13++;
		}
		if (arg0.method5651(Static228.anInt4739)) {
			local13++;
		}
		if (arg0.method5651(Static325.anInt6269)) {
			local13++;
		}
		if (arg0.method5651(Static276.anInt5648)) {
			local13++;
		}
		if (arg0.method5651(Static260.anInt5589)) {
			local13++;
		}
		if (arg0.method5651(anInt2456)) {
			local13++;
		}
		if (arg0.method5651(Static194.anInt4147)) {
			local13++;
		}
		if (arg0.method5651(Static8.anInt5857)) {
			local13++;
		}
		if (arg0.method5651(Static297.anInt5824)) {
			local13++;
		}
		if (arg0.method5651(Static1.anInt24)) {
			local13++;
		}
		if (arg0.method5651(Static290.anInt5759)) {
			local13++;
		}
		if (arg0.method5651(Static292.anInt4643)) {
			local13++;
		}
		if (arg0.method5651(Static228.anInt4741)) {
			local13++;
		}
		if (arg0.method5651(Static139.anInt4699)) {
			local13++;
		}
		if (arg0.method5651(Static27.anInt1009)) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
	public static void method2132() {
		@Pc(5) Class87 local5 = Static108.aClass87_21;
		synchronized (Static108.aClass87_21) {
			Static108.aClass87_21.method2477();
		}
		local5 = Static314.aClass87_55;
		synchronized (Static314.aClass87_55) {
			Static314.aClass87_55.method2477();
		}
		@Pc(36) Class18 local36 = Static357.aClass18_3;
		synchronized (Static357.aClass18_3) {
			Static357.aClass18_3.method576();
		}
	}
}
