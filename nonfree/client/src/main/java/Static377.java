import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_90;

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_102 = new Class47(25, 3);

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	public static void method5603() {
		for (@Pc(8) int local8 = 0; local8 < Static559.anInt9221; local8++) {
			@Pc(14) Class39 local14 = Static546.aClass39Array1[local8];
			@Pc(16) boolean local16 = false;
			@Pc(217) int local217;
			if (local14.aClass6_Sub18_Sub1_1 == null) {
				local14.anInt1134--;
				if (local14.anInt1134 >= (local14.method1125() ? -1500 : -10)) {
					if (local14.aByte21 == 1 && local14.aClass141_1 == null) {
						local14.aClass141_1 = Static605.method3635(Static58.aClass251_18, local14.anInt1128, 0);
						if (local14.aClass141_1 == null) {
							continue;
						}
						local14.anInt1134 += local14.aClass141_1.method3638();
					} else if (local14.method1125() && (local14.aClass6_Sub22_1 == null || local14.aClass6_Sub19_Sub1_1 == null)) {
						if (local14.aClass6_Sub22_1 == null) {
							local14.aClass6_Sub22_1 = Static191.method3466(Static423.aClass251_97, local14.anInt1128);
						}
						if (local14.aClass6_Sub22_1 == null) {
							continue;
						}
						if (local14.aClass6_Sub19_Sub1_1 == null) {
							local14.aClass6_Sub19_Sub1_1 = local14.aClass6_Sub22_1.method3458(new int[] { 22050 });
							if (local14.aClass6_Sub19_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local14.anInt1134 < 0) {
						if (local14.anInt1127 == 0) {
							local217 = (local14.aByte21 == 3 ? Static140.aClass6_Sub48_Sub1_1.anInt8991 : Static140.aClass6_Sub48_Sub1_1.anInt8997) * local14.anInt1124 >> 8;
						} else {
							@Pc(124) int local124 = local14.anInt1127 >> 24 & 0x3;
							if (Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 == local124) {
								@Pc(139) int local139 = (local14.anInt1127 & 0xFF) << 9;
								@Pc(146) int local146 = local14.anInt1127 >> 16 & 0xFF;
								@Pc(155) int local155 = (local146 << 9) + 256 - Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542;
								if (local155 < 0) {
									local155 = -local155;
								}
								@Pc(167) int local167 = local14.anInt1127 >> 8 & 0xFF;
								@Pc(177) int local177 = (local167 << 9) + 256 - Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540;
								if (local177 < 0) {
									local177 = -local177;
								}
								@Pc(191) int local191 = local177 + local155 - 512;
								if (local191 > local139) {
									local14.anInt1134 = -99999;
									continue;
								}
								if (local191 < 0) {
									local191 = 0;
								}
								local217 = (local139 - local191) * Static140.aClass6_Sub48_Sub1_1.anInt9004 * local14.anInt1124 / local139 >> 8;
							} else {
								local217 = 0;
							}
						}
						if (local217 > 0) {
							@Pc(244) Class6_Sub19_Sub1 local244 = null;
							if (local14.aByte21 == 1) {
								local244 = local14.aClass141_1.method3637().method2832(Static23.aClass250_5);
							} else if (local14.method1125()) {
								local244 = local14.aClass6_Sub19_Sub1_1;
							}
							@Pc(272) Class6_Sub18_Sub1 local272 = local14.aClass6_Sub18_Sub1_1 = Static600.method2687(local244, local217);
							local272.method2685(local14.anInt1131 - 1);
							Static374.aClass6_Sub18_Sub4_2.method6378(local272);
						}
					}
				} else {
					local16 = true;
				}
			} else if (!local14.aClass6_Sub18_Sub1_1.method7803()) {
				local16 = true;
			}
			if (local16) {
				Static559.anInt9221--;
				for (local217 = local8; local217 < Static559.anInt9221; local217++) {
					Static546.aClass39Array1[local217] = Static546.aClass39Array1[local217 + 1];
				}
				local8--;
			}
		}
		if (Static422.aBoolean507 && !Static189.method3422()) {
			if (Static140.aClass6_Sub48_Sub1_1.anInt8993 != 0 && Static9.anInt281 != -1) {
				Static390.method5735(Static9.anInt281, Static140.aClass6_Sub48_Sub1_1.anInt8993, Static370.aClass251_89);
			}
			Static422.aBoolean507 = false;
		} else if (Static140.aClass6_Sub48_Sub1_1.anInt8993 != 0 && Static9.anInt281 != -1 && !Static189.method3422()) {
			@Pc(376) Class6_Sub31 local376 = Static114.method2007(Static393.aClass47_107, Static337.aClass324_1);
			local376.aClass6_Sub21_Sub2_2.method6033(Static9.anInt281);
			Static534.method7251(local376);
			Static9.anInt281 = -1;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V")
	public static void method5604(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub2_Sub7 local14 = Static401.method5861(arg0, 5);
		local14.method2580();
	}
}
