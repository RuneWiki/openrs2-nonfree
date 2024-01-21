import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!td", name = "S", descriptor = "Lclient!hf;")
	public static Class37 aClass37_3;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1543 = Static32.method683("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1546 = Static32.method683("skill)2");

	@OriginalMember(owner = "client!td", name = "K", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1544 = aClass49_1546;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1547 = Static32.method683("Username: ");

	@OriginalMember(owner = "client!td", name = "O", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1545 = aClass49_1547;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1548 = Static32.method683("sl_flags");

	@OriginalMember(owner = "client!td", name = "W", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1549 = Static32.method683(" ");

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method2659() {
		if (Static111.anIntArray222 != null && Static96.anIntArray205 != null) {
			return;
		}
		Static96.anIntArray205 = new int[256];
		Static111.anIntArray222 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static111.anIntArray222[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static96.anIntArray205[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!bg;ILclient!bg;Lclient!bg;)V")
	public static void method2660(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static163.aClass11_32 = arg1;
		Static65.aClass11_139 = arg2;
		Static27.aClass11_29 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II[Lclient!vg;)V")
	public static void method2662(@OriginalArg(1) int arg0, @OriginalArg(2) Class85[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class85 local17 = arg1[local11];
			if (local17 != null && arg0 == local17.anInt3851 && (!local17.aBoolean171 || !Static100.method1729(local17))) {
				if (local17.anInt3855 == 0) {
					if (!local17.aBoolean171 && Static100.method1729(local17) && Static184.aClass85_16 != local17) {
						continue;
					}
					method2662(local17.anInt3849, arg1);
					if (local17.aClass85Array2 != null) {
						method2662(local17.anInt3849, local17.aClass85Array2);
					}
					@Pc(72) Class2_Sub8 local72 = (Class2_Sub8) Static100.aClass25_7.method836((long) local17.anInt3849);
					if (local72 != null) {
						Static112.method1901(local72.anInt1201);
					}
				}
				if (local17.anInt3855 == 6) {
					@Pc(103) int local103;
					if (local17.anInt3863 != -1 || local17.anInt3844 != -1) {
						@Pc(98) boolean local98 = Static22.method401(local17);
						if (local98) {
							local103 = local17.anInt3844;
						} else {
							local103 = local17.anInt3863;
						}
						if (local103 != -1) {
							@Pc(116) Class2_Sub2_Sub4 local116 = Static29.method543(local103);
							local17.anInt3824 += Static170.anInt3724;
							while (local116.anIntArray36[local17.anInt3888] < local17.anInt3824) {
								local17.anInt3824 -= local116.anIntArray36[local17.anInt3888];
								local17.anInt3888++;
								if (local17.anInt3888 >= local116.anIntArray35.length) {
									local17.anInt3888 -= local116.anInt407;
									if (local17.anInt3888 < 0 || local116.anIntArray35.length <= local17.anInt3888) {
										local17.anInt3888 = 0;
									}
								}
								Static102.method1756(local17);
							}
						}
					}
					if (local17.anInt3878 != 0 && !local17.aBoolean171) {
						@Pc(194) int local194 = local17.anInt3878 >> 16;
						local103 = local17.anInt3878 << 16 >> 16;
						@Pc(205) int local205 = local194 * Static170.anInt3724;
						local103 *= Static170.anInt3724;
						local17.anInt3853 = local17.anInt3853 + local205 & 0x7FF;
						local17.anInt3862 = local103 + local17.anInt3862 & 0x7FF;
						Static102.method1756(local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method2663() {
		aClass49_1549 = null;
		aClass49_1546 = null;
		aClass49_1545 = null;
		aClass2_Sub2_Sub2_Sub2Array9 = null;
		aClass49_1543 = null;
		aClass37_3 = null;
		aClass49_1548 = null;
		aClass49_1547 = null;
		aClass49_1544 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)V")
	public static void method2664(@OriginalArg(1) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static1.anInt2; local3++) {
			@Pc(11) Class2_Sub2_Sub3_Sub7_Sub1 local11 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[Static1.anIntArray1[local3]];
			@Pc(20) long local20 = (long) Static1.anIntArray1[local3] << 32 | 0x20000000L;
			if (local11 != null && local11.method2733() && arg0 == local11.aClass2_Sub2_Sub15_1.aBoolean134 && local11.aClass2_Sub2_Sub15_1.method2475()) {
				@Pc(45) int local45 = local11.anInt3529 >> 7;
				@Pc(50) int local50 = local11.anInt3578 >> 7;
				if (local45 >= 0 && local45 < 104 && local50 >= 0 && local50 < 104) {
					if (local11.anInt3581 == 1 && (local11.anInt3529 & 0x7F) == 64 && (local11.anInt3578 & 0x7F) == 64) {
						if (Static78.anIntArrayArray17[local45][local50] == Static51.anInt1164) {
							continue;
						}
						Static78.anIntArrayArray17[local45][local50] = Static51.anInt1164;
					}
					if (!local11.aClass2_Sub2_Sub15_1.aBoolean137) {
						local20 |= Long.MIN_VALUE;
					}
					local11.anInt3558 = Static18.method346(local11.anInt3578 + (local11.anInt3581 - 1) * 64, Static66.anInt1396, local11.anInt3529 + (local11.anInt3581 - 1) * 64);
					Static86.method2730(Static66.anInt1396, local11.anInt3529, local11.anInt3578, local11.anInt3558, (local11.anInt3581 - 1) * 64 + 60, local11, local11.anInt3536, local20, local11.aBoolean150);
				}
			}
		}
	}
}
