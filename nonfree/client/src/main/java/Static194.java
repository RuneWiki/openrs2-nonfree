import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
	public static int anInt3956 = 0;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public static int anInt3959 = 0;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public static int anInt3960 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!mo;I)V")
	public static void method3666(@OriginalArg(0) Class143 arg0) {
		Static291.anInt5610 = arg0.method3765("p11_full");
		Static97.anInt2234 = arg0.method3765("p12_full");
		Static181.anInt3757 = arg0.method3765("b12_full");
		Static210.anInt4220 = arg0.method3765("hitmarks");
		Static348.anInt5328 = arg0.method3765("hitbar_default");
		Static188.anInt3870 = arg0.method3765("timerbar_default");
		Static222.anInt4459 = arg0.method3765("headicons_pk");
		Static133.anInt4651 = arg0.method3765("headicons_prayer");
		Static155.anInt3309 = arg0.method3765("hint_headicons");
		Static45.anInt1146 = arg0.method3765("hint_mapmarkers");
		Static233.anInt4557 = arg0.method3765("mapflag");
		Static155.anInt3304 = arg0.method3765("cross");
		Static131.anInt1772 = arg0.method3765("mapdots");
		Static315.anInt6454 = arg0.method3765("scrollbar");
		Static114.anInt2521 = arg0.method3765("name_icons");
		Static137.anInt2903 = arg0.method3765("floorshadows");
		Static288.anInt5580 = arg0.method3765("compass");
		Static235.anInt4621 = arg0.method3765("hint_mapedge");
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!jr;Z)Z")
	public static boolean method3667(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static158.aClass114Array2 == Static341.aClass114Array3;
		@Pc(8) int local8 = 0;
		arg0.method5347();
		if (arg0.aShort83 < 0 || arg0.aShort82 < 0 || arg0.aShort80 >= Static233.anInt4556 || arg0.aShort81 >= Static180.anInt3712) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort83; local30 <= arg0.aShort80; local30++) {
			for (local34 = arg0.aShort82; local34 <= arg0.aShort81; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort83) {
					local37++;
				}
				if (local30 < arg0.aShort80) {
					local37 += 4;
				}
				if (local34 > arg0.aShort82) {
					local37 += 8;
				}
				if (local34 < arg0.aShort81) {
					local37 += 2;
				}
				Static243.method4280(arg0.aByte64, local30, local34);
				@Pc(71) Class213 local71 = Static98.aClass213ArrayArrayArray2[arg0.aByte64][local30][local34];
				@Pc(76) Class81 local76 = Static234.method4106(local37, arg0);
				@Pc(79) Class81 local79 = local71.aClass81_4;
				if (local79 == null) {
					local71.aClass81_4 = local76;
				} else {
					while (local79.aClass81_3 != null) {
						local79 = local79.aClass81_3;
					}
					local79.aClass81_3 = local76;
				}
				local71.aByte72 = (byte) (local71.aByte72 | local37);
				if (local6 && Static238.anIntArrayArray77[local30][local34] != 0) {
					local8 = Static238.anIntArrayArray77[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort83; local34 <= arg0.aShort80; local34++) {
				for (local37 = arg0.aShort82; local37 <= arg0.aShort81; local37++) {
					if (Static238.anIntArrayArray77[local34][local37] == 0) {
						Static238.anIntArrayArray77[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static352.aClass10_Sub3Array3[Static165.anInt5082++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIZZLclient!oh;ILclient!oh;)I")
	public static int method3668(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6_Sub1 arg5) {
		@Pc(15) int local15 = Static256.method4407(arg0, arg1, arg5, arg3);
		if (local15 != 0) {
			return arg0 ? -local15 : local15;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static256.method4407(arg2, arg4, arg5, arg3);
			return arg2 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Z")
	public static boolean method3670(@OriginalArg(0) int arg0) {
		if (arg0 == 13 || arg0 == 48 || arg0 == 60 || arg0 == 36 || arg0 == 1) {
			return true;
		} else {
			return arg0 == 39 || arg0 == 38 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	public static void method3671() {
		Static313.aClass11_130.method215(5);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!e;Lclient!hm;IIIII)V")
	public static void method3672(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static125.anInt2719) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static233.anInt4556) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static180.anInt3712 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class213 local62 = Static98.aClass213ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static158.aClass114Array2[local17].method3610(local23, local32) + Static158.aClass114Array2[local17].method3610(local23 + 1, local32) + Static158.aClass114Array2[local17].method3610(local23, local32 + 1) + Static158.aClass114Array2[local17].method3610(local23 + 1, local32 + 1)) / 4 - (Static158.aClass114Array2[arg2].method3610(arg3, arg4) + Static158.aClass114Array2[arg2].method3610(arg3 + 1, arg4) + Static158.aClass114Array2[arg2].method3610(arg3, arg4 + 1) + Static158.aClass114Array2[arg2].method3610(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class10_Sub2 local143 = local62.aClass10_Sub2_2;
									@Pc(146) Class10_Sub2 local146 = local62.aClass10_Sub2_1;
									if (local143 != null && local143.method5339()) {
										arg1.method5335((local32 - arg4) * 128 + (1 - arg6) * 64, arg0, local140, local1, local143, (local23 - arg3) * 128 + (1 - arg5) * 64);
									}
									if (local146 != null && local146.method5339()) {
										arg1.method5335((local32 - arg4) * 128 + (1 - arg6) * 64, arg0, local140, local1, local146, (local23 - arg3) * 128 + (1 - arg5) * 64);
									}
									for (@Pc(219) Class81 local219 = local62.aClass81_4; local219 != null; local219 = local219.aClass81_3) {
										@Pc(223) Class10_Sub3 local223 = local219.aClass10_Sub3_1;
										if (local223 != null && local223.method5339() && (local23 == local223.aShort83 || local23 == local3) && (local32 == local223.aShort82 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort80 + 1 - local223.aShort83;
											@Pc(260) int local260 = local223.aShort81 + 1 - local223.aShort82;
											arg1.method5335((local223.aShort82 - arg4) * 128 + (local260 - arg6) * 64, arg0, local140, local1, local223, (local223.aShort83 - arg3) * 128 + (local252 - arg5) * 64);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
