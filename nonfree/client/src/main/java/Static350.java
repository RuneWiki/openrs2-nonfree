import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public static int anInt6802;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Lclient!am;")
	public static Class11 aClass11_155;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString255 = "glow2:";

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
	public static boolean aBoolean591 = false;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Z")
	public static volatile boolean aBoolean592 = true;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString256 = "glow1:";

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ur;B)V")
	public static void method5644(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0) {
		if (Static282.anInt5713 >= 400) {
			return;
		}
		@Pc(12) Class34 local12 = arg0.aClass34_1;
		if (local12.anIntArray108 != null) {
			local12 = local12.method748();
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean56) {
			return;
		}
		@Pc(33) String local33 = local12.aString28;
		if (local12.anInt872 != 0) {
			@Pc(43) String local43 = Static269.anInt5508 == 1 ? Static66.aString45 : Static112.aString84;
			local33 = local33 + Static28.method4994(Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727, local12.anInt872) + " (" + local43 + local12.anInt872 + ")";
		}
		if (Static315.anInt1642 == 1) {
			Static285.method4888(0, Static243.aString186 + " -> <col=ffff00>" + local33, (long) arg0.anInt6535, Static107.anInt6873, Static277.aString206, 0, 48);
		} else if (Static247.aBoolean436) {
			@Pc(310) Class4_Sub1_Sub21 local310 = Static81.anInt1731 == -1 ? null : Static98.method5502(Static81.anInt1731);
			if ((Static184.anInt4052 & 0x2) != 0) {
				if (local310 == null || local12.method747(Static81.anInt1731, local310.anInt6695) != local310.anInt6695) {
					Static285.method4888(0, Static195.aString145 + " -> <col=ffff00>" + local33, (long) arg0.anInt6535, Static232.anInt4817, Static316.aString197, 0, 20);
				}
				return;
			}
		} else {
			@Pc(74) String[] local74 = local12.aStringArray4;
			if (Static121.aBoolean229) {
				local74 = Static153.method2979(local74);
			}
			@Pc(84) int local84;
			if (local74 != null) {
				for (local84 = 4; local84 >= 0; local84--) {
					if (local74[local84] != null && (Static269.anInt5508 != 0 || !local74[local84].equalsIgnoreCase(Static325.aString239))) {
						@Pc(103) byte local103 = 0;
						@Pc(105) int local105 = Static98.anInt6645;
						if (local84 == 0) {
							local103 = 40;
						}
						if (local84 == 1) {
							local103 = 50;
						}
						if (local84 == 2) {
							local103 = 37;
						}
						if (local84 == 3) {
							local103 = 30;
						}
						if (local84 == 4) {
							local103 = 12;
						}
						if (local84 == local12.anInt881) {
							local105 = local12.anInt883;
						}
						if (local84 == local12.anInt860) {
							local105 = local12.anInt855;
						}
						Static285.method4888(0, "<col=ffff00>" + local33, (long) arg0.anInt6535, local105, local74[local84], 0, local103);
					}
				}
			}
			if (Static269.anInt5508 == 0 && local74 != null) {
				for (local84 = 4; local84 >= 0; local84--) {
					if (local74[local84] != null && local74[local84].equalsIgnoreCase(Static325.aString239)) {
						@Pc(202) short local202 = 0;
						if (local12.anInt872 > Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727) {
							local202 = 2000;
						}
						@Pc(211) short local211 = 0;
						if (local84 == 0) {
							local211 = 40;
						}
						if (local84 == 1) {
							local211 = 50;
						}
						if (local84 == 2) {
							local211 = 37;
						}
						if (local84 == 3) {
							local211 = 30;
						}
						if (local84 == 4) {
							local211 = 12;
						}
						if (local211 != 0) {
							local211 += local202;
						}
						Static285.method4888(0, "<col=ffff00>" + local33, (long) arg0.anInt6535, local12.anInt876, local74[local84], 0, local211);
					}
				}
			}
			Static285.method4888(0, "<col=ffff00>" + local33, (long) arg0.anInt6535, Static225.anInt4711, Static8.aString8, 0, 1011);
			return;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I")
	public static int method5646(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(24) int local24 = (local14 >>> 2 & 0x33333333) + (local14 & 0x33333333);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(50) int local50 = local38 + (local38 >>> 16);
		return local50 & 0xFF;
	}
}
