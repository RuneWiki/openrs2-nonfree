import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!wb;")
	public static Class2_Sub5_Sub4 aClass2_Sub5_Sub4_2;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	public static int anInt3797 = 0;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1611 = Static51.method932(" seconds)3");

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1612 = Static51.method932("Your profile will be transferred in:");

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[5];

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1613 = Static51.method932("Art");

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1614 = aClass10_1611;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1615 = aClass10_1612;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([I[IB[Lclient!cb;II)V")
	public static void method2701(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class8[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(21) int local21 = arg3 - 1;
		@Pc(28) int local28 = (arg3 + arg4) / 2;
		@Pc(32) int local32 = arg4 + 1;
		@Pc(36) Class8 local36 = arg2[local28];
		arg2[local28] = arg2[arg3];
		arg2[arg3] = local36;
		while (local21 < local32) {
			@Pc(50) boolean local50 = true;
			@Pc(53) int local53;
			@Pc(90) int local90;
			@Pc(81) int local81;
			do {
				local32--;
				for (local53 = 0; local53 < 4; local53++) {
					if (arg0[local53] == 2) {
						local90 = arg2[local32].anInt498;
						local81 = local36.anInt498;
					} else if (arg0[local53] == 1) {
						local81 = local36.anInt501;
						local90 = arg2[local32].anInt501;
						if (local81 == -1 && arg1[local53] == 1) {
							local81 = 2001;
						}
						if (local90 == -1 && arg1[local53] == 1) {
							local90 = 2001;
						}
					} else if (arg0[local53] == 3) {
						local81 = local36.aBoolean17 ? 1 : 0;
						local90 = arg2[local32].aBoolean17 ? 1 : 0;
					} else {
						local90 = arg2[local32].anInt502;
						local81 = local36.anInt502;
					}
					if (local90 != local81) {
						if ((arg1[local53] != 1 || local90 <= local81) && (arg1[local53] != 0 || local81 <= local90)) {
							local50 = false;
						}
						break;
					}
					if (local53 == 3) {
						local50 = false;
					}
				}
			} while (local50);
			local50 = true;
			do {
				local21++;
				for (local53 = 0; local53 < 4; local53++) {
					if (arg0[local53] == 2) {
						local90 = arg2[local21].anInt498;
						local81 = local36.anInt498;
					} else if (arg0[local53] == 1) {
						local81 = local36.anInt501;
						local90 = arg2[local21].anInt501;
						if (local90 == -1 && arg1[local53] == 1) {
							local90 = 2001;
						}
						if (local81 == -1 && arg1[local53] == 1) {
							local81 = 2001;
						}
					} else if (arg0[local53] == 3) {
						local90 = arg2[local21].aBoolean17 ? 1 : 0;
						local81 = local36.aBoolean17 ? 1 : 0;
					} else {
						local90 = arg2[local21].anInt502;
						local81 = local36.anInt502;
					}
					if (local90 != local81) {
						if ((arg1[local53] != 1 || local81 <= local90) && (arg1[local53] != 0 || local81 >= local90)) {
							local50 = false;
						}
						break;
					}
					if (local53 == 3) {
						local50 = false;
					}
				}
			} while (local50);
			if (local21 < local32) {
				@Pc(342) Class8 local342 = arg2[local21];
				arg2[local21] = arg2[local32];
				arg2[local32] = local342;
			}
		}
		method2701(arg0, arg1, arg2, arg3, local32);
		method2701(arg0, arg1, arg2, local32 + 1, arg4);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIII)I")
	public static int method2702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(16) int local16 = arg0 >> 7;
		if (local7 < 0 || local16 < 0 || local7 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(37) int local37 = arg0 & 0x7F;
		@Pc(41) int local41 = arg1 & 0x7F;
		@Pc(43) int local43 = arg2;
		if (arg2 < 3 && (Static50.aByteArrayArrayArray3[1][local7][local16] & 0x2) == 2) {
			local43 = arg2 + 1;
		}
		@Pc(86) int local86 = Static162.anIntArrayArrayArray8[local43][local7][local16] * (128 - local41) + local41 * Static162.anIntArrayArrayArray8[local43][local7 + 1][local16] >> 7;
		@Pc(117) int local117 = local41 * Static162.anIntArrayArrayArray8[local43][local7 + 1][local16 + 1] + Static162.anIntArrayArrayArray8[local43][local7][local16 + 1] * (128 - local41) >> 7;
		return local37 * local117 + (128 - local37) * local86 >> 7;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	public static void method2703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static149.anInt3233 != arg1) {
			Static154.anIntArray354 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static154.anIntArray354[local13] = (local13 << 12) / arg1;
			}
			Static149.anInt3233 = arg1;
			Static145.anInt2636 = arg1 - 1;
		}
		if (Static2.anInt36 == arg0) {
			return;
		}
		Static86.anIntArray218 = new int[arg0];
		for (local13 = 0; local13 < arg0; local13++) {
			Static86.anIntArray218[local13] = (local13 << 12) / arg0;
		}
		Static2.anInt36 = arg0;
		Static75.anInt1778 = arg0 - 1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method2704() {
		aClass2_Sub5_Sub4_2 = null;
		aClass10_1611 = null;
		aClass10_1613 = null;
		aBooleanArray19 = null;
		aClass10_1615 = null;
		aClass10_1614 = null;
		aClass10_1612 = null;
	}
}
