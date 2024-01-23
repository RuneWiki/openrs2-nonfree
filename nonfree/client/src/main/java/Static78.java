import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	public static int anInt1467;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
	public static int anInt1479;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
	public static void method1217() {
		if (!Static283.aBoolean393 || Static58.aBoolean85) {
			return;
		}
		@Pc(15) Class3_Sub25[][][] local15 = Static146.aClass3_Sub25ArrayArrayArray7;
		for (@Pc(22) int local22 = 0; local22 < local15.length; local22++) {
			@Pc(34) Class3_Sub25[][] local34 = local15[local22];
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				for (@Pc(46) int local46 = 0; local46 < local34[local36].length; local46++) {
					@Pc(62) Class3_Sub25 local62 = local34[local36][local46];
					if (local62 != null) {
						@Pc(78) Class10_Sub4_Sub1 local78;
						if (local62.aClass13_1 != null && local62.aClass13_1.aClass10_1 instanceof Class10_Sub4_Sub1) {
							local78 = (Class10_Sub4_Sub1) local62.aClass13_1.aClass10_1;
							if ((Long.MIN_VALUE & local62.aClass13_1.aLong15) == 0L) {
								local78.method1535(false, true, true, false, true, true);
							} else {
								local78.method1535(true, true, true, true, true, true);
							}
						}
						if (local62.aClass95_1 != null) {
							if (local62.aClass95_1.aClass10_9 instanceof Class10_Sub4_Sub1) {
								local78 = (Class10_Sub4_Sub1) local62.aClass95_1.aClass10_9;
								if ((Long.MIN_VALUE & local62.aClass95_1.aLong124) == 0L) {
									local78.method1535(false, true, true, false, true, true);
								} else {
									local78.method1535(true, true, true, true, true, true);
								}
							}
							if (local62.aClass95_1.aClass10_8 instanceof Class10_Sub4_Sub1) {
								local78 = (Class10_Sub4_Sub1) local62.aClass95_1.aClass10_8;
								if ((Long.MIN_VALUE & local62.aClass95_1.aLong124) == 0L) {
									local78.method1535(false, true, true, false, true, true);
								} else {
									local78.method1535(true, true, true, true, true, true);
								}
							}
						}
						if (local62.aClass19_1 != null) {
							if (local62.aClass19_1.aClass10_3 instanceof Class10_Sub4_Sub1) {
								local78 = (Class10_Sub4_Sub1) local62.aClass19_1.aClass10_3;
								if ((Long.MIN_VALUE & local62.aClass19_1.aLong20) == 0L) {
									local78.method1535(false, true, true, false, true, true);
								} else {
									local78.method1535(true, true, true, true, true, true);
								}
							}
							if (local62.aClass19_1.aClass10_2 instanceof Class10_Sub4_Sub1) {
								local78 = (Class10_Sub4_Sub1) local62.aClass19_1.aClass10_2;
								if ((local62.aClass19_1.aLong20 & Long.MIN_VALUE) == 0L) {
									local78.method1535(false, true, true, false, true, true);
								} else {
									local78.method1535(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(273) int local273 = 0; local273 < local62.anInt4483; local273++) {
							if (local62.aClass85Array3[local273].aClass10_7 instanceof Class10_Sub4_Sub1) {
								@Pc(295) Class10_Sub4_Sub1 local295 = (Class10_Sub4_Sub1) local62.aClass85Array3[local273].aClass10_7;
								if ((Long.MIN_VALUE & local62.aClass85Array3[local273].aLong107) == 0L) {
									local295.method1535(false, true, true, false, true, true);
								} else {
									local295.method1535(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static58.aBoolean85 = true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!wd;I)V")
	public static void method1218(@OriginalArg(0) Class192 arg0) {
		Static105.aClass192_1 = arg0;
	}
}
