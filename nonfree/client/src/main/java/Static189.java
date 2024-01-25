import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
	public static int anInt4142;

	@OriginalMember(owner = "client!lm", name = "Y", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
	public static int anInt4126 = -1;

	@OriginalMember(owner = "client!lm", name = "W", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_123 = new Class157(33, 11);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!dr;Z)V")
	public static void method3531(@OriginalArg(0) Class37 arg0) {
		if (Static225.anInt4918 < 2 && !Static60.aBoolean109 || Static18.aClass68_1 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static60.aBoolean109 && Static225.anInt4918 < 2) {
			local41 = Static295.aString63 + Static176.aClass140_94.method4155(Static239.anInt2803) + Static228.aString46 + " ->";
		} else if (Static231.aBoolean433 && Static166.aClass25_1.method398(81) && Static225.anInt4918 > 2) {
			local41 = Static159.method2497((Class2_Sub31) Static103.aClass180_24.aClass2_207.aClass2_252.aClass2_252);
		} else {
			@Pc(60) Class2_Sub31 local60 = (Class2_Sub31) Static103.aClass180_24.aClass2_207.aClass2_252;
			local41 = Static159.method2497(local60);
			@Pc(66) int[] local66 = null;
			if (Static2.method59(local60.anInt5368)) {
				local66 = Static310.aClass184_2.method5040((int) local60.aLong163).anIntArray296;
			} else if (Static223.method4181(local60.anInt5368)) {
				@Pc(123) Class1_Sub2_Sub3_Sub2 local123 = Static95.aClass1_Sub2_Sub3_Sub2Array1[(int) local60.aLong163];
				if (local123 != null) {
					@Pc(128) Class139 local128 = local123.aClass139_1;
					if (local128.anIntArray350 != null) {
						local128 = local128.method4120();
					}
					if (local128 != null) {
						local66 = local128.anIntArray351;
					}
				}
			} else if (Static237.method4310(local60.anInt5368)) {
				@Pc(93) Class74 local93;
				if (local60.anInt5368 == 1002) {
					local93 = Static228.method4210((int) local60.aLong163);
				} else {
					local93 = Static228.method4210((int) (local60.aLong163 >>> 32 & 0x7FFFFFFFL));
				}
				if (local93.anIntArray161 != null) {
					local93 = local93.method1997();
				}
				if (local93 != null) {
					local66 = local93.anIntArray164;
				}
			}
			if (local66 != null) {
				local41 = local41 + Static106.method2086(local66);
			}
		}
		if (Static225.anInt4918 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static225.anInt4918 - 2) + Static317.aClass140_147.method4155(Static239.anInt2803);
		}
		if (Static328.aClass68_40 != null) {
			@Pc(236) Class71 local236 = Static328.aClass68_40.method1870(arg0);
			if (local236 == null) {
				local236 = Static25.aClass71_1;
			}
			local236.method5237(Static328.aClass68_40.anInt1888, Static200.anInt4354, Static328.aClass68_40.anInt1845, Static328.aClass68_40.anInt1834, Static286.anIntArray450, Static65.aClass46Array24, Static275.anInt5640, local41, Static328.aClass68_40.anInt1874, Static328.aClass68_40.anInt1862, Static244.aRandom1, Static328.aClass68_40.anInt1865, Static173.anInt3945, Static87.anIntArray130);
			Static237.method4317(Static286.anIntArray450[0], Static286.anIntArray450[3], Static286.anIntArray450[2], Static286.anIntArray450[1]);
		} else if (Static80.aClass68_8 != null && Static13.aClass172_1 == Static30.aClass172_2) {
			@Pc(217) int local217 = Static25.aClass71_1.method5251(local41, Static291.anInt5262 + 4, Static87.anIntArray130, Static65.aClass46Array24, Static244.aRandom1, Static251.anInt5259 + 16, Static275.anInt5640);
			Static237.method4317(Static291.anInt5262 + 4, 16, Static99.aClass82_3.method2230(local41) + local217, Static251.anInt5259);
			return;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
	public static void method3532() {
		if (Static293.aString58.toLowerCase().indexOf("microsoft") != -1) {
			Static278.anIntArray442[219] = 42;
			Static278.anIntArray442[223] = 28;
			Static278.anIntArray442[191] = 73;
			Static278.anIntArray442[187] = 27;
			Static278.anIntArray442[189] = 26;
			Static278.anIntArray442[220] = 74;
			Static278.anIntArray442[188] = 71;
			Static278.anIntArray442[186] = 57;
			Static278.anIntArray442[222] = 59;
			Static278.anIntArray442[192] = 58;
			Static278.anIntArray442[190] = 72;
			Static278.anIntArray442[221] = 43;
			return;
		}
		Static278.anIntArray442[59] = 57;
		Static278.anIntArray442[93] = 43;
		if (Static293.aMethod1 == null) {
			Static278.anIntArray442[222] = 59;
			Static278.anIntArray442[192] = 58;
		} else {
			Static278.anIntArray442[192] = 28;
			Static278.anIntArray442[520] = 59;
			Static278.anIntArray442[222] = 58;
		}
		Static278.anIntArray442[44] = 71;
		Static278.anIntArray442[46] = 72;
		Static278.anIntArray442[45] = 26;
		Static278.anIntArray442[61] = 27;
		Static278.anIntArray442[91] = 42;
		Static278.anIntArray442[92] = 74;
		Static278.anIntArray442[47] = 73;
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)Z")
	public static boolean method3533() {
		return Static260.anInt5453 != 0 || Static291.anInt5264 >= 2;
	}
}
