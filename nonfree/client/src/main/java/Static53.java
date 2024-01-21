import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public static int anInt1795;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray43 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false };

	@OriginalMember(owner = "client!l", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_636 = Static56.method1206("Loaded wordpack");

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_637 = Static56.method1206("Drop @lre@");

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_638 = Static56.method1206("Please remove ");

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_639 = Static56.method1206("flash3:");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!da;ZII)V")
	public static void method1153(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 * arg1 + arg2 * arg2;
		if (local11 <= 4225 || local11 >= 90000) {
			Static66.method1348(arg2, arg0, arg1);
			return;
		}
		@Pc(36) int local36 = Static106.anInt2795 + Static12.anInt542 & 0x7FF;
		@Pc(40) int local40 = Static35.anIntArray200[local36];
		@Pc(48) int local48 = local40 * 256 / (Static57.anInt2681 + 256);
		@Pc(52) int local52 = Static35.anIntArray205[local36];
		@Pc(60) int local60 = local52 * 256 / (Static57.anInt2681 + 256);
		@Pc(70) int local70 = arg2 * local60 + local48 * arg1 >> 16;
		@Pc(81) int local81 = local60 * arg1 - local48 * arg2 >> 16;
		@Pc(87) double local87 = Math.atan2((double) local70, (double) local81);
		@Pc(93) int local93 = (int) (Math.sin(local87) * 63.0D);
		@Pc(99) int local99 = (int) (Math.cos(local87) * 57.0D);
		Static37.aClass2_Sub1_Sub3_Sub2_4.method465(local93 + 88, -local99 + 83 + -20, local87);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method1154() {
		Static3.aClass2_Sub6_Sub1_1.method681();
		@Pc(20) int local20 = Static3.aClass2_Sub6_Sub1_1.method687(8);
		@Pc(29) int local29;
		if (Static49.anInt2696 > local20) {
			for (local29 = local20; local29 < Static49.anInt2696; local29++) {
				Static77.anIntArray318[Static99.anInt2672++] = Static57.anIntArray383[local29];
			}
		}
		if (local20 > Static49.anInt2696) {
			throw new RuntimeException("gnpov1");
		}
		Static49.anInt2696 = 0;
		for (local29 = 0; local29 < local20; local29++) {
			@Pc(63) int local63 = Static57.anIntArray383[local29];
			@Pc(67) Class2_Sub1_Sub4_Sub6_Sub2 local67 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local63];
			@Pc(72) int local72 = Static3.aClass2_Sub6_Sub1_1.method687(1);
			if (local72 == 0) {
				Static57.anIntArray383[Static49.anInt2696++] = local63;
				local67.anInt2030 = Static49.anInt2694;
			} else {
				@Pc(92) int local92 = Static3.aClass2_Sub6_Sub1_1.method687(2);
				if (local92 == 0) {
					Static57.anIntArray383[Static49.anInt2696++] = local63;
					local67.anInt2030 = Static49.anInt2694;
					Static91.anIntArray352[Static64.anInt624++] = local63;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local92 == 1) {
						Static57.anIntArray383[Static49.anInt2696++] = local63;
						local67.anInt2030 = Static49.anInt2694;
						local139 = Static3.aClass2_Sub6_Sub1_1.method687(3);
						local67.method1267(false, local139);
						local149 = Static3.aClass2_Sub6_Sub1_1.method687(1);
						if (local149 == 1) {
							Static91.anIntArray352[Static64.anInt624++] = local63;
						}
					} else if (local92 == 2) {
						Static57.anIntArray383[Static49.anInt2696++] = local63;
						local67.anInt2030 = Static49.anInt2694;
						local139 = Static3.aClass2_Sub6_Sub1_1.method687(3);
						local67.method1267(true, local139);
						local149 = Static3.aClass2_Sub6_Sub1_1.method687(3);
						local67.method1267(true, local149);
						@Pc(203) int local203 = Static3.aClass2_Sub6_Sub1_1.method687(1);
						if (local203 == 1) {
							Static91.anIntArray352[Static64.anInt624++] = local63;
						}
					} else if (local92 == 3) {
						Static77.anIntArray318[Static99.anInt2672++] = local63;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!kc;BIII)[B")
	public static byte[] method1155(@OriginalArg(0) Class11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) long local22 = (long) (arg2 * 37 + arg3 & 0xFFFF) + ((long) arg1 << 32) + (long) (arg2 << 16);
		if (Static87.aClass17_83 != null) {
			@Pc(30) Class2_Sub1_Sub7 local30 = (Class2_Sub1_Sub7) Static87.aClass17_83.method786(local22);
			if (local30 != null) {
				return local30.aByteArray15;
			}
		}
		@Pc(41) byte[] local41 = arg0.method338(arg2, arg3);
		if (local41 == null) {
			return null;
		} else {
			if (Static87.aClass17_83 != null) {
				Static87.aClass17_83.method783(new Class2_Sub1_Sub7(local41), local22);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!lc;")
	public static Class31 method1156(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static89.method1499(arg0);
		} else if (arg0 < 10000000) {
			return Static37.method974(new Class31[] { Static89.method1499(arg0 / 1000), Static4.aClass31_61 });
		} else {
			return Static37.method974(new Class31[] { Static89.method1499(arg0 / 1000000), Static98.aClass31_394 });
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method1157() {
		aClass31_637 = null;
		aClass31_636 = null;
		aBooleanArray43 = null;
		aClass31_638 = null;
		aClass31_639 = null;
	}
}
