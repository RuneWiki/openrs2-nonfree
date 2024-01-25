import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "Lclient!em;")
	public static final Class83 aClass83_128 = new Class83(72, 0);

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "[Lclient!sr;")
	public static Class248_Sub1[] aClass248_Sub1Array1 = new Class248_Sub1[0];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method4900(@OriginalArg(0) Class78 arg0) {
		if (Static22.anInt572 < 2 && !Static563.aBoolean697 || Static488.aClass160_36 != null) {
			return;
		}
		@Pc(40) String local40;
		if (Static563.aBoolean697 && Static22.anInt572 < 2) {
			local40 = Static318.aString69 + Static375.aClass253_36.method5453(Static161.anInt3095) + Static146.aString26 + " ->";
		} else if (Static240.aBoolean315 && Static326.aClass97_3.method2365(81) && Static22.anInt572 > 2) {
			local40 = Static262.method3792((Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285.aClass1_285);
		} else {
			@Pc(69) Class1_Sub40 local69 = (Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285;
			local40 = Static262.method3792(local69);
			@Pc(77) int[] local77 = null;
			if (Static176.method2783(local69.anInt7819)) {
				local77 = Static230.aClass225_1.method4857((int) local69.aLong199).anIntArray352;
			} else if (local69.anInt7818 != -1) {
				local77 = Static230.aClass225_1.method4857(local69.anInt7818).anIntArray352;
			} else if (Static308.method4628(local69.anInt7819)) {
				@Pc(109) Class1_Sub33 local109 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local69.aLong199);
				if (local109 != null) {
					@Pc(114) Class11_Sub1_Sub1_Sub3_Sub2 local114 = local109.aClass11_Sub1_Sub1_Sub3_Sub2_2;
					@Pc(117) Class354 local117 = local114.aClass354_1;
					if (local117.anIntArray597 != null) {
						local117 = local117.method7683(Static390.aClass353_29);
					}
					if (local117 != null) {
						local77 = local117.anIntArray595;
					}
				}
			} else if (Static13.method257(local69.anInt7819)) {
				@Pc(151) Class178 local151;
				if (local69.anInt7819 == 1010) {
					local151 = Static347.aClass122_4.method2770((int) local69.aLong199);
				} else {
					local151 = Static347.aClass122_4.method2770((int) (local69.aLong199 >>> 32 & 0x7FFFFFFFL));
				}
				if (local151.anIntArray252 != null) {
					local151 = local151.method3713(Static390.aClass353_29);
				}
				if (local151 != null) {
					local77 = local151.anIntArray253;
				}
			}
			if (local77 != null) {
				local40 = local40 + Static254.method2368(local77);
			}
		}
		if (Static22.anInt572 > 2) {
			local40 = local40 + "<col=ffffff> / " + (Static22.anInt572 - 2) + Static375.aClass253_29.method5453(Static161.anInt3095);
		}
		if (Static120.aClass160_8 != null) {
			@Pc(262) Class96 local262 = Static120.aClass160_8.method3359(arg0);
			if (local262 == null) {
				local262 = Static62.aClass96_4;
			}
			local262.method7260(Static42.anIntArray43, Static129.aRandom1, Static171.anInt3218, Static120.aClass160_8.anInt4225, Static120.aClass160_8.anInt4182, Static120.aClass160_8.anInt4204, Static519.aClass5Array19, Static129.anInt2583, Static120.aClass160_8.anInt4149, local40, Static120.aClass160_8.anInt4208, Static316.anInt5790, Static120.aClass160_8.anInt4156, Static230.anIntArray218);
			Static95.method1439(Static42.anIntArray43[1], Static42.anIntArray43[3], Static42.anIntArray43[0], Static42.anIntArray43[2]);
		} else if (Static298.aClass160_18 != null && Static101.aClass42_1 == Static354.aClass42_4) {
			@Pc(242) int local242 = Static62.aClass96_4.method7251(Static316.anInt5790, Static129.aRandom1, local40, Static519.aClass5Array19, Static34.anInt728 + 16, Static230.anIntArray218, Static209.anInt8894 + 4);
			Static95.method1439(Static34.anInt728, 16, Static209.anInt8894 + 4, Static88.aClass352_7.method7572(local40) - -local242);
			return;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)Lclient!lf;")
	public static Class204 method4903(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static287.aFloat105 == 3.0D) {
				return Static43.aClass204_1;
			}
			if ((double) Static287.aFloat105 == 4.0D) {
				return Static249.aClass204_4;
			}
			if ((double) Static287.aFloat105 == 6.0D) {
				return Static476.aClass204_7;
			}
			if ((double) Static287.aFloat105 >= 8.0D) {
				return Static500.aClass204_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static287.aFloat105 == 3.0D) {
				return Static476.aClass204_7;
			}
			if ((double) Static287.aFloat105 == 4.0D) {
				return Static500.aClass204_8;
			}
			if ((double) Static287.aFloat105 == 6.0D) {
				return Static445.aClass204_6;
			}
			if ((double) Static287.aFloat105 >= 8.0D) {
				return Static370.aClass204_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static287.aFloat105 == 3.0D) {
				return Static445.aClass204_6;
			}
			if ((double) Static287.aFloat105 == 4.0D) {
				return Static370.aClass204_5;
			}
			if ((double) Static287.aFloat105 == 6.0D) {
				return Static72.aClass204_2;
			}
			if ((double) Static287.aFloat105 >= 8.0D) {
				return Static182.aClass204_3;
			}
		}
		return null;
	}
}
