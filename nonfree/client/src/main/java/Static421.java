import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
	public static int anInt7834;

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_60 = new Class231(260);

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "Lclient!wo;")
	public static final Class316 aClass316_3 = new Class316();

	@OriginalMember(owner = "client!ro", name = "z", descriptor = "Lclient!ud;")
	public static final Class281 aClass281_5 = new Class281();

	@OriginalMember(owner = "client!ro", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[200];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIZIIII)V")
	public static void method6556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg2 < 1 || Static363.anInt1158 - 2 < arg4 || Static511.anInt8889 - 2 < arg2) {
			return;
		}
		@Pc(25) int local25 = arg7;
		if (arg7 < 3 && Static169.method2839(arg4, arg2)) {
			local25 = arg7 + 1;
		}
		if (!Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923) && !Static426.method6572(arg4, local25, arg2, Static348.anInt6407)) {
			return;
		}
		if (Static399.aClass262ArrayArrayArray2 == null) {
			return;
		}
		Static290.aClass200_Sub1_2.method7413(arg6, arg4, Static207.aClass99Array1[arg7], arg7, arg2, Static103.aClass39_3);
		if (arg5 >= 0) {
			@Pc(71) boolean local71 = Static281.aClass2_Sub19_Sub1_1.aBoolean183;
			Static281.aClass2_Sub19_Sub1_1.aBoolean183 = true;
			Static290.aClass200_Sub1_2.method7415(Static103.aClass39_3, arg2, arg3, arg1, arg4, local25, arg7, arg5, Static207.aClass99Array1[arg7], arg0);
			Static281.aClass2_Sub19_Sub1_1.aBoolean183 = local71;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method6557(@OriginalArg(1) Class39 arg0) {
		if (Static323.anInt6016 < 2 && !Static21.aBoolean31 || Static72.aClass310_4 != null) {
			return;
		}
		@Pc(34) String local34;
		if (Static21.aBoolean31 && Static323.anInt6016 < 2) {
			local34 = Static131.aString66 + Static180.aClass202_104.method5139(Static172.anInt6352) + Static125.aString61 + " ->";
		} else if (Static150.aBoolean224 && Static311.aClass189_1.method4710(81) && Static323.anInt6016 > 2) {
			local34 = Static288.method5991((Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283.aClass2_283);
		} else {
			@Pc(53) Class2_Sub44 local53 = (Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283;
			local34 = Static288.method5991(local53);
			@Pc(59) int[] local59 = null;
			if (Static450.method6872(local53.anInt8460)) {
				local59 = Static464.aClass115_1.method2970((int) local53.aLong215).anIntArray682;
			} else if (local53.anInt8465 != -1) {
				local59 = Static464.aClass115_1.method2970(local53.anInt8465).anIntArray682;
			} else if (Static224.method3540(local53.anInt8460)) {
				@Pc(130) Class2_Sub11 local130 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local53.aLong215);
				if (local130 != null) {
					@Pc(135) Class1_Sub1_Sub2_Sub2 local135 = local130.aClass1_Sub1_Sub2_Sub2_1;
					@Pc(138) Class12 local138 = local135.aClass12_1;
					if (local138.anIntArray21 != null) {
						local138 = local138.method455(Static84.aClass302_1);
					}
					if (local138 != null) {
						local59 = local138.anIntArray22;
					}
				}
			} else if (Static326.method5156(local53.anInt8460)) {
				@Pc(93) Class129 local93;
				if (local53.anInt8460 == 1006) {
					local93 = Static505.aClass206_4.method5326((int) local53.aLong215);
				} else {
					local93 = Static505.aClass206_4.method5326((int) (local53.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local93.anIntArray392 != null) {
					local93 = local93.method3276(Static84.aClass302_1);
				}
				if (local93 != null) {
					local59 = local93.anIntArray396;
				}
			}
			if (local59 != null) {
				local34 = local34 + Static98.method1916(local59);
			}
		}
		if (Static323.anInt6016 > 2) {
			local34 = local34 + "<col=ffffff> / " + (Static323.anInt6016 - 2) + Static349.aClass202_190.method5139(Static172.anInt6352);
		}
		if (Static203.aClass310_7 != null) {
			@Pc(221) Class47 local221 = Static203.aClass310_7.method7639(arg0);
			if (local221 == null) {
				local221 = Static175.aClass47_1;
			}
			local221.method7613(Static95.anIntArray142, Static100.anInt1983, Static203.aClass310_7.anInt9168, Static166.aRandom1, Static203.aClass310_7.anInt9172, Static203.aClass310_7.anInt9169, Static203.aClass310_7.anInt9163, Static203.aClass310_7.anInt9197, Static405.anInt7615, Static203.aClass310_7.anInt9198, Static414.anInt8621, local34, Static55.anIntArray91, Static376.aClass35Array31);
			Static330.method3994(Static95.anIntArray142[3], Static95.anIntArray142[0], Static95.anIntArray142[2], Static95.anIntArray142[1]);
		} else if (Static157.aClass310_6 != null && Static230.aClass212_2 == Static185.aClass212_1) {
			@Pc(287) int local287 = Static175.aClass47_1.method7602(local34, Static262.anInt7124 + 4, Static376.aClass35Array31, Static55.anIntArray91, Static166.aRandom1, Static189.anInt3454 + 16, Static405.anInt7615);
			Static330.method3994(16, Static262.anInt7124 + 4, Static188.aClass52_2.method1582(local34) + local287, Static189.anInt3454);
		}
	}
}
