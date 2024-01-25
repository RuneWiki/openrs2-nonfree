import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	public static int anInt7120 = 0;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_268 = new Class67(5, -2);

	@OriginalMember(owner = "client!we", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5770(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!l;ILclient!nt;Ljava/awt/Canvas;)Lclient!za;")
	public static Class117 method5772(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) Canvas arg3) {
		return new w(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method5773() {
		if (Static126.aClass19_Sub1_1.method3348(Static214.anInt3968) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static330.anInt5429 - 4 & 0xFF);
		@Pc(33) int local33 = Static330.anInt5429 % Static147.anInt2300;
		@Pc(39) int local39;
		for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
			for (local39 = 0; local39 < Static293.anInt4886; local39++) {
				Static380.aByteArrayArrayArray17[local35][local33][local39] = local21;
			}
		}
		if (Static390.anInt6272 == 3) {
			return;
		}
		for (local39 = 0; local39 < 2; local39++) {
			Static214.anIntArray283[local39] = -1000000;
			Static340.anIntArray401[local39] = 1000000;
			Static290.anIntArray368[local39] = 0;
			Static372.anIntArray452[local39] = 1000000;
			Static263.anIntArray345[local39] = 0;
		}
		@Pc(139) int local139;
		if (Static139.anInt2147 != 1) {
			local139 = Static135.method1732(Static386.anInt7155, Static80.anInt1106, Static390.anInt6272);
			if (local139 - Static375.anInt6055 >= 800 || (Static278.aByteArrayArrayArray16[Static390.anInt6272][Static386.anInt7155 >> 7][Static80.anInt1106 >> 7] & 0x4) == 0) {
				return;
			}
			Static403.method5127(false, Static80.anInt1106 >> 7, 1, Static386.anInt7155 >> 7, Static259.aClass216ArrayArrayArray3);
			return;
		}
		if ((Static278.aByteArrayArrayArray16[Static390.anInt6272][Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7][Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7] & 0x4) != 0) {
			Static403.method5127(false, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7, 0, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7, Static259.aClass216ArrayArrayArray3);
		}
		if (Static129.anInt1972 >= 2560) {
			return;
		}
		local139 = Static386.anInt7155 >> 7;
		@Pc(143) int local143 = Static80.anInt1106 >> 7;
		@Pc(148) int local148 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7;
		@Pc(153) int local153 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7;
		@Pc(161) int local161;
		if (local139 >= local148) {
			local161 = local139 - local148;
		} else {
			local161 = local148 - local139;
		}
		@Pc(180) int local180;
		if (local143 >= local153) {
			local180 = local143 - local153;
		} else {
			local180 = local153 - local143;
		}
		if ((local161 != 0 || local180 != 0) && -Static147.anInt2300 < local161 && local161 < Static147.anInt2300 && -Static293.anInt4886 < local180 && Static293.anInt4886 > local180) {
			@Pc(252) int local252;
			@Pc(254) int local254;
			if (local180 < local161) {
				local252 = local180 * 65536 / local161;
				local254 = 32768;
				while (local148 != local139) {
					if (local139 < local148) {
						local139++;
					} else if (local139 > local148) {
						local139--;
					}
					if ((Static278.aByteArrayArrayArray16[Static390.anInt6272][local139][local143] & 0x4) != 0) {
						Static403.method5127(false, local143, 1, local139, Static259.aClass216ArrayArrayArray3);
						return;
					}
					local254 += local252;
					if (local254 >= 65536) {
						local254 -= 65536;
						if (local153 > local143) {
							local143++;
						} else if (local153 < local143) {
							local143--;
						}
						if ((Static278.aByteArrayArrayArray16[Static390.anInt6272][local139][local143] & 0x4) != 0) {
							Static403.method5127(false, local143, 1, local139, Static259.aClass216ArrayArrayArray3);
							return;
						}
					}
				}
				return;
			}
			local252 = local161 * 65536 / local180;
			local254 = 32768;
			while (local143 != local153) {
				if (local153 > local143) {
					local143++;
				} else if (local143 > local153) {
					local143--;
				}
				if ((Static278.aByteArrayArrayArray16[Static390.anInt6272][local139][local143] & 0x4) != 0) {
					Static403.method5127(false, local143, 1, local139, Static259.aClass216ArrayArrayArray3);
					return;
				}
				local254 += local252;
				if (local254 >= 65536) {
					local254 -= 65536;
					if (local139 < local148) {
						local139++;
					} else if (local148 < local139) {
						local139--;
					}
					if ((Static278.aByteArrayArrayArray16[Static390.anInt6272][local139][local143] & 0x4) != 0) {
						Static403.method5127(false, local143, 1, local139, Static259.aClass216ArrayArrayArray3);
						return;
					}
				}
			}
			return;
		}
		Static338.method4409(null, "RC: " + local139 + "," + local143 + " " + local148 + "," + local153 + " " + Static315.anInt5207 + "," + Static47.anInt676);
		return;
	}
}
