import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "[Lclient!te;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array4;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!lf;")
	public static Class1_Sub2_Sub11_Sub1_Sub1 aClass1_Sub2_Sub11_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "[I")
	public static int[] anIntArray64 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
	public static int anInt1125 = 50;

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public static void method825() {
		for (@Pc(6) Class1_Sub13 local6 = (Class1_Sub13) Static120.aClass102_14.method3086(); local6 != null; local6 = (Class1_Sub13) Static120.aClass102_14.method3087()) {
			@Pc(16) int local16 = local6.anInt1677;
			if (Static54.method933(local16)) {
				@Pc(24) Class71[] local24 = Static64.aClass71ArrayArray1[local16];
				@Pc(26) boolean local26 = true;
				for (@Pc(28) int local28 = 0; local28 < local24.length; local28++) {
					if (local24[local28] != null) {
						local26 = local24[local28].aBoolean122;
						break;
					}
				}
				if (!local26) {
					@Pc(52) int local52 = (int) local6.aLong170;
					@Pc(56) Class71 local56 = Static7.method102(local52);
					if (local56 != null) {
						Static82.method1438(local56);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[Lclient!me;Z)V")
	public static void method826(@OriginalArg(0) int arg0, @OriginalArg(1) Class71[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class71 local9 = arg1[local3];
			if (local9 != null && local9.anInt2785 == arg0 && (!local9.aBoolean122 || !Static33.method583(local9))) {
				if (local9.anInt2777 == 0) {
					if (!local9.aBoolean122 && Static33.method583(local9) && local9 != Static86.aClass71_18) {
						continue;
					}
					method826(local9.anInt2807, arg1);
					if (local9.aClass71Array2 != null) {
						method826(local9.anInt2807, local9.aClass71Array2);
					}
					@Pc(59) Class1_Sub13 local59 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local9.anInt2807);
					if (local59 != null) {
						Static125.method2776(local59.anInt1677);
					}
				}
				if (local9.anInt2777 == 6) {
					@Pc(88) int local88;
					if (local9.anInt2782 != -1 || local9.anInt2795 != -1) {
						@Pc(83) boolean local83 = Static194.method3244(local9);
						if (local83) {
							local88 = local9.anInt2795;
						} else {
							local88 = local9.anInt2782;
						}
						if (local88 != -1) {
							@Pc(100) Class40 local100 = Static32.method546(local88);
							if (local100 != null) {
								local9.anInt2818 += Static48.anInt1156;
								while (local9.anInt2818 > local100.anIntArray76[local9.anInt2793]) {
									local9.anInt2818 -= local100.anIntArray76[local9.anInt2793];
									local9.anInt2793++;
									if (local100.anIntArray75.length <= local9.anInt2793) {
										local9.anInt2793 -= local100.anInt1248;
										if (local9.anInt2793 < 0 || local9.anInt2793 >= local100.anIntArray75.length) {
											local9.anInt2793 = 0;
										}
									}
									Static82.method1438(local9);
								}
							}
						}
					}
					if (local9.anInt2856 != 0 && !local9.aBoolean122) {
						@Pc(188) int local188 = local9.anInt2856 >> 16;
						@Pc(192) int local192 = local188 * Static48.anInt1156;
						local88 = local9.anInt2856 << 16 >> 16;
						local9.anInt2776 = local9.anInt2776 + local192 & 0x7FF;
						local88 *= Static48.anInt1156;
						local9.anInt2825 = local88 + local9.anInt2825 & 0x7FF;
						Static82.method1438(local9);
					}
				}
			}
		}
	}
}
