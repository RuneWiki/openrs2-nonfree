import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public static int anInt5244;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public static int anInt5248;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public static int anInt5247 = -1;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_47 = new Class5(8);

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	public static int anInt5252 = -2;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_169 = new Class92(47, 3);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void method4199() {
		@Pc(8) int local8 = Static57.aByteArrayArray4.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			if (Static57.aByteArrayArray4[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static5.anInt100; local28++) {
					if (Static289.anIntArray407[local18] == Static2.anIntArray7[local28]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static2.anIntArray7[Static5.anInt100] = Static289.anIntArray407[local18];
					local26 = Static5.anInt100++;
				}
				@Pc(76) Class3_Sub2 local76 = new Class3_Sub2(Static57.aByteArrayArray4[local18]);
				@Pc(78) int local78 = 0;
				while (local76.anInt7620 < Static57.aByteArrayArray4[local18].length && local78 < 511 && Static453.anInt7682 < 1023) {
					@Pc(97) int local97 = local26 | local78++ << 6;
					@Pc(101) int local101 = local76.method6004();
					@Pc(105) int local105 = local101 >> 14;
					@Pc(111) int local111 = local101 >> 7 & 0x3F;
					@Pc(115) int local115 = local101 & 0x3F;
					@Pc(128) int local128 = local111 + (Static289.anIntArray407[local18] >> 8) * 64 - Static108.anInt3458;
					@Pc(141) int local141 = (Static289.anIntArray407[local18] & 0xFF) * 64 + local115 - Static339.anInt6223;
					@Pc(148) Class47 local148 = Static154.aClass251_2.method5684(local76.method6004());
					if (Static451.aClass1_Sub3_Sub3_Sub2Array1[local97] == null && (local148.aByte18 & 0x1) > 0 && Static367.anInt6555 == local105 && local128 >= 0 && Static399.anInt6923 > local128 + local148.anInt1578 && local141 >= 0 && local141 + local148.anInt1578 < Static127.anInt2696) {
						Static451.aClass1_Sub3_Sub3_Sub2Array1[local97] = new Class1_Sub3_Sub3_Sub2();
						Static451.aClass1_Sub3_Sub3_Sub2Array1[local97].anInt6066 = local97;
						@Pc(199) Class1_Sub3_Sub3_Sub2 local199 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local97];
						Static29.anIntArray56[Static453.anInt7682++] = local97;
						local199.anInt6126 = Static290.anInt5325;
						local199.method4854(local148);
						local199.method4844(local199.aClass47_1.anInt1578);
						local199.anInt6100 = local199.aClass47_1.anInt1585 << 3;
						if (local199.anInt6100 == 0) {
							local199.method4833(0);
						} else {
							local199.method4833((local199.aClass47_1.aByte19 + 4 & 0x7E00007) << 11);
						}
						local199.method4849(local199.method4831(), local128, local141, local105, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
	public static void method4200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11;
		if (arg1 != Static106.anInt2356) {
			Static382.anIntArray476 = new int[arg1];
			for (local11 = 0; local11 < arg1; local11++) {
				Static382.anIntArray476[local11] = (local11 << 12) / arg1;
			}
			Static106.anInt2356 = arg1;
			Static60.anInt1437 = arg1 * 32;
			Static396.anInt6840 = arg1 - 1;
		}
		if (Static340.anInt6286 == arg0) {
			return;
		}
		if (Static106.anInt2356 == arg0) {
			Static285.anIntArray401 = Static382.anIntArray476;
		} else {
			Static285.anIntArray401 = new int[arg0];
			for (local11 = 0; local11 < arg0; local11++) {
				Static285.anIntArray401[local11] = (local11 << 12) / arg0;
			}
		}
		Static311.anInt5681 = arg0 - 1;
		Static340.anInt6286 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBI)V")
	public static void method4202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = Static123.aClass21_Sub1_1.anInt871 * arg1 >> 8;
		if (local14 != 0 && arg2 != -1) {
			Static60.method1187(local14, Static238.aClass56_60, arg2);
			Static358.aBoolean419 = true;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Z")
	public static boolean method4203() {
		try {
			return Static130.method4847();
		} catch (@Pc(15) IOException local15) {
			Static237.method3708();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(78) String local78 = "T2 - " + (Static62.aClass184_57 == null ? -1 : Static62.aClass184_57.method4515()) + "," + (Static62.aClass184_58 == null ? -1 : Static62.aClass184_58.method4515()) + "," + (Static286.aClass184_217 == null ? -1 : Static286.aClass184_217.method4515()) + " - " + Static113.anInt6862 + "," + (Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray453[0] + Static108.anInt3458) + "," + (Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray454[0] + Static339.anInt6223) + " - ";
			for (@Pc(80) int local80 = 0; local80 < Static113.anInt6862 && local80 < 50; local80++) {
				local78 = local78 + Static110.aClass3_Sub2_Sub2_1.aByteArray95[local80] + ",";
			}
			Static379.method1671(local20, local78);
			Static378.method5234();
			return true;
		}
	}
}
