import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_16;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "Lclient!ai;")
	public static Class7 aClass7_14;

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "Lclient!ai;")
	public static Class7 aClass7_15;

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "[I")
	public static int[] anIntArray208 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_559 = Static200.method3116(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = arg1; local8 <= arg4 + arg1; local8++) {
			for (local12 = arg3; local12 <= arg3 + arg2; local12++) {
				if (local12 >= 0 && local12 < 104 && local8 >= 0 && local8 < 104) {
					Static201.aByteArrayArrayArray12[arg0][local12][local8] = 127;
				}
			}
		}
		@Pc(66) int local66;
		for (local12 = arg1; local12 < arg4 + arg1; local12++) {
			for (local66 = arg3; local66 < arg3 + arg2; local66++) {
				if (local66 >= 0 && local66 < 104 && local12 >= 0 && local12 < 104) {
					Static138.anIntArrayArrayArray17[arg0][local66][local12] = arg0 <= 0 ? 0 : Static138.anIntArrayArrayArray17[arg0 - 1][local66][local12];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local66 = arg1 + 1; local66 < arg1 + arg4; local66++) {
				if (local66 >= 0 && local66 < 104) {
					Static138.anIntArrayArrayArray17[arg0][arg3][local66] = Static138.anIntArrayArrayArray17[arg0][arg3 - 1][local66];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local66 = arg3 + 1; local66 < arg2 + arg3; local66++) {
				if (local66 >= 0 && local66 < 104) {
					Static138.anIntArrayArrayArray17[arg0][local66][arg1] = Static138.anIntArrayArrayArray17[arg0][local66][arg1 - 1];
				}
			}
		}
		if (arg3 < 0 || arg1 < 0 || arg3 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && Static138.anIntArrayArrayArray17[arg0][arg3 - 1][arg1] != 0) {
				Static138.anIntArrayArrayArray17[arg0][arg3][arg1] = Static138.anIntArrayArrayArray17[arg0][arg3 - 1][arg1];
				return;
			}
			if (arg1 > 0 && Static138.anIntArrayArrayArray17[arg0][arg3][arg1 - 1] != 0) {
				Static138.anIntArrayArrayArray17[arg0][arg3][arg1] = Static138.anIntArrayArrayArray17[arg0][arg3][arg1 - 1];
				return;
			}
			if (arg3 > 0 && arg1 > 0 && Static138.anIntArrayArrayArray17[arg0][arg3 - 1][arg1 - 1] != 0) {
				Static138.anIntArrayArrayArray17[arg0][arg3][arg1] = Static138.anIntArrayArrayArray17[arg0][arg3 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static138.anIntArrayArrayArray17[arg0 - 1][arg3 - 1][arg1] != Static138.anIntArrayArrayArray17[arg0][arg3 - 1][arg1]) {
			Static138.anIntArrayArrayArray17[arg0][arg3][arg1] = Static138.anIntArrayArrayArray17[arg0][arg3 - 1][arg1];
			return;
		}
		if (arg1 > 0 && Static138.anIntArrayArrayArray17[arg0][arg3][arg1 - 1] != Static138.anIntArrayArrayArray17[arg0 - 1][arg3][arg1 - 1]) {
			Static138.anIntArrayArrayArray17[arg0][arg3][arg1] = Static138.anIntArrayArrayArray17[arg0][arg3][arg1 - 1];
			return;
		}
		if (arg3 > 0 && arg1 > 0 && Static138.anIntArrayArrayArray17[arg0 - 1][arg3 - 1][arg1 - 1] != Static138.anIntArrayArrayArray17[arg0][arg3 - 1][arg1 - 1]) {
			Static138.anIntArrayArrayArray17[arg0][arg3][arg1] = Static138.anIntArrayArrayArray17[arg0][arg3 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIJB)Z")
	public static boolean method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		@Pc(12) int local12 = (int) arg2 >> 14 & 0x1F;
		@Pc(27) int local27 = (int) arg2 >> 20 & 0x3;
		@Pc(34) int local34 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local12 == 10 || local12 == 11 || local12 == 22) {
			@Pc(49) Class1_Sub1_Sub23 local49 = Static44.method760(local34);
			@Pc(60) int local60;
			@Pc(63) int local63;
			if (local27 == 0 || local27 == 2) {
				local60 = local49.anInt4024;
				local63 = local49.anInt4018;
			} else {
				local63 = local49.anInt4024;
				local60 = local49.anInt4018;
			}
			@Pc(74) int local74 = local49.anInt4030;
			if (local27 != 0) {
				local74 = (local74 << local27 & 0xF) + (local74 >> 4 - local27);
			}
			Static149.method2551(arg1, 2, 0, true, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], local60, arg0, local63, local74);
		} else {
			Static149.method2551(arg1, 2, local27, true, local12 + 1, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, arg0, 0, 0);
		}
		Static129.anInt1190 = Static166.anInt3603;
		Static122.anInt2728 = Static39.anInt882;
		Static147.anInt3278 = 2;
		Static154.anInt3436 = 0;
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	public static void method1315(@OriginalArg(1) boolean arg0) {
		if (Static84.aClass9_Sub4_Sub1_2.anInt3925 >> 7 == Static56.anInt1484 && Static84.aClass9_Sub4_Sub1_2.anInt3903 >> 7 == Static170.anInt3695) {
			Static56.anInt1484 = 0;
		}
		@Pc(25) int local25 = Static205.anInt4356;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(40) int local40 = 0; local40 < local25; local40++) {
			@Pc(48) Class9_Sub4_Sub1 local48;
			@Pc(46) long local46;
			if (arg0) {
				local46 = 8791798054912L;
				local48 = Static84.aClass9_Sub4_Sub1_2;
			} else {
				local46 = (long) Static124.anIntArray353[local40] << 32;
				local48 = Static41.aClass9_Sub4_Sub1Array2[Static124.anIntArray353[local40]];
			}
			if (local48 != null && local48.method2907()) {
				local48.aBoolean71 = false;
				if ((Static148.aBoolean266 && Static205.anInt4356 > 50 || Static205.anInt4356 > 200) && !arg0 && local48.anInt3905 == local48.anInt3932) {
					local48.aBoolean71 = true;
				}
				@Pc(99) int local99 = local48.anInt3925 >> 7;
				@Pc(104) int local104 = local48.anInt3903 >> 7;
				if (local99 >= 0 && local99 < 104 && local104 >= 0 && local104 < 104) {
					if (local48.aClass9_Sub2_1 == null || Static42.anInt910 < local48.anInt1418 || Static42.anInt910 >= local48.anInt1409) {
						if ((local48.anInt3925 & 0x7F) == 64 && (local48.anInt3903 & 0x7F) == 64) {
							if (Static7.anIntArrayArray5[local99][local104] == Static19.anInt471) {
								continue;
							}
							Static7.anIntArrayArray5[local99][local104] = Static19.anInt471;
						}
						local48.anInt3927 = Static165.method2268(local48.anInt3903, Static180.anInt3841, local48.anInt3925);
						Static54.method1049(Static180.anInt3841, local48.anInt3925, local48.anInt3903, local48.anInt3927, 60, local48, local48.anInt3913, local46, local48.aBoolean212);
					} else {
						local48.aBoolean71 = false;
						local48.anInt3927 = Static165.method2268(local48.anInt3903, Static180.anInt3841, local48.anInt3925);
						Static140.method2398(Static180.anInt3841, local48.anInt3925, local48.anInt3903, local48.anInt3927, local48, local48.anInt3913, local46, local48.anInt1405, local48.anInt1397, local48.anInt1400, local48.anInt1407);
					}
				}
			}
		}
	}
}
