import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)V")
	public static void method5259(@OriginalArg(1) boolean arg0) {
		Static342.anInt6506 = 0;
		Static24.anInt578 = 0;
		Static272.method4854();
		Static215.method3977(arg0);
		Static361.method5983();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static24.anInt578; local22++) {
			local28 = Static162.anIntArray242[local22];
			if (Static231.aClass11_Sub2_Sub6_Sub2Array1[local28].anInt6745 != Static51.anInt1301) {
				if (Static231.aClass11_Sub2_Sub6_Sub2Array1[local28].aClass208_1.method5542()) {
					Static195.method3641(Static231.aClass11_Sub2_Sub6_Sub2Array1[local28]);
				}
				Static231.aClass11_Sub2_Sub6_Sub2Array1[local28].method5906(null);
				Static231.aClass11_Sub2_Sub6_Sub2Array1[local28] = null;
			}
		}
		if (Static366.anInt7026 != Static180.aClass1_Sub7_Sub2_2.anInt2219) {
			throw new RuntimeException("gnp1 pos:" + Static180.aClass1_Sub7_Sub2_2.anInt2219 + " psize:" + Static366.anInt7026);
		}
		for (local28 = 0; local28 < Static277.anInt5394; local28++) {
			if (Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static277.anInt5394);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIZII)V")
	public static void method5261(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static38.method933(arg3, Static164.aClass135_Sub1Array2.length - 1, arg2, arg0, 0, arg1);
		Static331.aClass1_Sub12_3 = null;
		Static51.anInt1312 = 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ct;Lclient!ct;I)V")
	public static void method5263(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		Static91.aClass30_111 = arg0;
		Static28.aClass30_5 = arg1;
		Static91.aClass30_111.method1180(3);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ct;I)V")
	public static void method5266(@OriginalArg(0) Class30 arg0) {
		Static185.aClass30_28 = arg0;
		Static220.anInt4449 = Static185.aClass30_28.method1180(15);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method5268() {
		try {
			if (Static310.anInt5974 == 1) {
				@Pc(12) int local12 = Static40.aClass1_Sub6_Sub4_2.method4069();
				if (local12 > 0 && Static40.aClass1_Sub6_Sub4_2.method4083()) {
					local12 -= Static61.anInt1495;
					if (local12 < 0) {
						local12 = 0;
					}
					Static40.aClass1_Sub6_Sub4_2.method4060(local12);
					return;
				}
				Static40.aClass1_Sub6_Sub4_2.method4068();
				Static40.aClass1_Sub6_Sub4_2.method4082();
				Static174.aClass158_1 = null;
				Static311.aClass1_Sub31_4 = null;
				if (Class11_Sub2_Sub3.lb == null) {
					Static310.anInt5974 = 0;
				} else {
					Static310.anInt5974 = 2;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static40.aClass1_Sub6_Sub4_2.method4068();
			Static310.anInt5974 = 0;
			Static311.aClass1_Sub31_4 = null;
			Class11_Sub2_Sub3.lb = null;
			Static174.aClass158_1 = null;
		}
	}
}
