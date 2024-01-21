import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!db", name = "Tc", descriptor = "Lclient!wb;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!db", name = "Ec", descriptor = "Lclient!je;")
	private static Class40 aClass40_319 = Static69.method1231("Please remove ");

	@OriginalMember(owner = "client!db", name = "Gc", descriptor = "Lclient!je;")
	public static Class40 aClass40_320 = aClass40_319;

	@OriginalMember(owner = "client!db", name = "Hc", descriptor = "Lclient!je;")
	public static Class40 aClass40_321 = Static69.method1231("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!db", name = "Ic", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[250][];

	@OriginalMember(owner = "client!db", name = "Jc", descriptor = "Lclient!je;")
	public static Class40 aClass40_322 = aClass40_319;

	@OriginalMember(owner = "client!db", name = "Kc", descriptor = "Lclient!je;")
	public static Class40 aClass40_323 = Static69.method1231(" loggt sich aus)3");

	@OriginalMember(owner = "client!db", name = "Lc", descriptor = "Lclient!je;")
	public static Class40 aClass40_324 = Static69.method1231("Welt");

	@OriginalMember(owner = "client!db", name = "Oc", descriptor = "Lclient!je;")
	private static Class40 aClass40_327 = Static69.method1231(" has logged in)3");

	@OriginalMember(owner = "client!db", name = "Mc", descriptor = "Lclient!je;")
	public static Class40 aClass40_325 = aClass40_327;

	@OriginalMember(owner = "client!db", name = "Nc", descriptor = "Lclient!je;")
	public static Class40 aClass40_326 = Static69.method1231("Fallen lassen");

	@OriginalMember(owner = "client!db", name = "Uc", descriptor = "I")
	public static int anInt605 = 0;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)I")
	public static int method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return (arg0 / 32 << 7) + ((arg2 / 4 << 10) + (arg1 / 2));
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(B)V")
	public static void method372() {
		Static93.aClass55_75.method1413();
		Static32.aClass55_29.method1413();
		Static110.aClass55_49.method1413();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([Lclient!kc;IZ)V")
	public static void method373(@OriginalArg(0) Class2_Sub13[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class2_Sub13 local14 = arg0[local8];
			if (local14 != null && arg1 == local14.anInt1543 && (!local14.aBoolean112 || !Static49.method883(local14))) {
				if (local14.anInt1583 == 0) {
					if (!local14.aBoolean112 && Static49.method883(local14) && Static134.aClass2_Sub13_10 != local14) {
						continue;
					}
					method373(arg0, local14.anInt1560);
					if (local14.aClass2_Sub13Array2 != null) {
						method373(local14.aClass2_Sub13Array2, local14.anInt1560);
					}
					@Pc(62) Class2_Sub11 local62 = (Class2_Sub11) Static61.aClass77_6.method2034((long) local14.anInt1560);
					if (local62 != null) {
						Static119.method2008(local62.anInt1313);
					}
				}
				if (local14.anInt1583 == 6) {
					@Pc(93) int local93;
					if (local14.anInt1575 != -1 || local14.anInt1561 != -1) {
						@Pc(88) boolean local88 = Static5.method127(local14);
						if (local88) {
							local93 = local14.anInt1561;
						} else {
							local93 = local14.anInt1575;
						}
						if (local93 != -1) {
							@Pc(106) Class2_Sub1_Sub7 local106 = Static40.method724(local93);
							local14.anInt1582 += Static49.anInt1315;
							while (local14.anInt1582 > local106.anIntArray210[local14.anInt1595]) {
								local14.anInt1582 -= local106.anIntArray210[local14.anInt1595];
								local14.anInt1595++;
								if (local14.anInt1595 >= local106.anIntArray212.length) {
									local14.anInt1595 -= local106.anInt1974;
									if (local14.anInt1595 < 0 || local106.anIntArray212.length <= local14.anInt1595) {
										local14.anInt1595 = 0;
									}
								}
								Static17.method316(local14);
							}
						}
					}
					if (local14.anInt1588 != 0 && !local14.aBoolean112) {
						@Pc(188) int local188 = local14.anInt1588 >> 16;
						@Pc(192) int local192 = local188 * Static49.anInt1315;
						local14.anInt1580 = local192 + local14.anInt1580 & 0x7FF;
						local93 = local14.anInt1588 << 16 >> 16;
						local93 *= Static49.anInt1315;
						local14.anInt1557 = local14.anInt1557 + local93 & 0x7FF;
						Static17.method316(local14);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public static void method374() {
		aClass40_326 = null;
		aClass40_322 = null;
		aClass82_1 = null;
		aClass40_325 = null;
		aClass40_327 = null;
		aClass40_323 = null;
		aClass40_324 = null;
		aClass40_321 = null;
		aClass40_319 = null;
		aByteArrayArray2 = null;
		aClass40_320 = null;
	}
}
