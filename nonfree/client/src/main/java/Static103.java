import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_963 = Static41.method597("<img=1>");

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!od;")
	private static Class60 aClass60_964 = Static41.method597("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "Lclient!od;")
	private static Class60 aClass60_965 = Static41.method597("Loading)3)3)3");

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "[I")
	public static int[] anIntArray317 = new int[1000];

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "Lclient!rc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "[Lclient!pf;")
	public static Class4_Sub3_Sub1_Sub5[] aClass4_Sub3_Sub1_Sub5Array1 = new Class4_Sub3_Sub1_Sub5[4];

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "Lclient!od;")
	public static Class60 aClass60_966 = aClass60_965;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "Lclient!od;")
	public static Class60 aClass60_967 = aClass60_964;

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array9 = new Class4_Sub3_Sub6_Sub3[1000];

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	public static void method1708() {
		aClass4_Sub3_Sub1_Sub5Array1 = null;
		aClass60_964 = null;
		anIntArray317 = null;
		aClass4_Sub3_Sub6_Sub3Array9 = null;
		aClass60_966 = null;
		aClass60_965 = null;
		aClass60_967 = null;
		aClass60_963 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BJ)V")
	public static void method1711(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static63.method997(arg0 - 1L);
			Static63.method997(1L);
		} else {
			Static63.method997(arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Z")
	public static boolean method1712(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public static void method1713(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static106.aClass4_Sub3_Sub6_Sub3_5.anIntArray297;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(43) int local43;
		@Pc(45) int local45;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local43 = (52736 - local29 * 512) * 4 + 24628;
			for (local45 = 1; local45 < 103; local45++) {
				if ((Static69.aByteArrayArrayArray5[arg0][local45][local29] & 0x18) == 0) {
					Static30.aClass48_1.method1045(local8, local43, arg0, local45, local29);
				}
				if (arg0 < 3 && (Static69.aByteArrayArrayArray5[arg0 + 1][local45][local29] & 0x8) != 0) {
					Static30.aClass48_1.method1045(local8, local43, arg0 + 1, local45, local29);
				}
				local43 += 4;
			}
		}
		Static106.aClass4_Sub3_Sub6_Sub3_5.method1624();
		local43 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 238 - 10;
		local45 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(164) int local164;
		for (@Pc(160) int local160 = 1; local160 < 103; local160++) {
			for (local164 = 1; local164 < 103; local164++) {
				if ((Static69.aByteArrayArrayArray5[arg0][local164][local160] & 0x18) == 0) {
					Static37.method567(local164, local160, local43, arg0, local45);
				}
				if (arg0 < 3 && (Static69.aByteArrayArrayArray5[arg0 + 1][local164][local160] & 0x8) != 0) {
					Static37.method567(local164, local160, local43, arg0 + 1, local45);
				}
			}
		}
		Static91.anInt2139 = 0;
		for (local164 = 0; local164 < 104; local164++) {
			for (@Pc(228) int local228 = 0; local228 < 104; local228++) {
				@Pc(236) int local236 = Static30.aClass48_1.method1031(Static77.anInt1866, local164, local228);
				if (local236 != 0) {
					local236 = local236 >> 14 & 0x7FFF;
					@Pc(254) int local254 = Static76.method1244(local236).anInt755;
					if (local254 >= 0) {
						@Pc(258) int local258 = local164;
						@Pc(260) int local260 = local228;
						if (local254 != 22 && local254 != 29 && local254 != 34 && local254 != 36 && local254 != 46 && local254 != 47 && local254 != 48) {
							@Pc(294) int[][] local294 = Static50.aClass28Array3[Static77.anInt1866].anIntArrayArray28;
							for (@Pc(296) int local296 = 0; local296 < 10; local296++) {
								@Pc(303) int local303 = (int) (Math.random() * 4.0D);
								if (local303 == 0 && local258 > 0 && local164 - 3 < local258 && (local294[local258 - 1][local260] & 0x12C0108) == 0) {
									local258--;
								}
								if (local303 == 1 && local258 < 103 && local164 + 3 > local258 && (local294[local258 + 1][local260] & 0x12C0180) == 0) {
									local258++;
								}
								if (local303 == 2 && local260 > 0 && local260 > local228 - 3 && (local294[local258][local260 - 1] & 0x12C0102) == 0) {
									local260--;
								}
								if (local303 == 3 && local260 < 103 && local228 + 3 > local260 && (local294[local258][local260 + 1] & 0x12C0120) == 0) {
									local260++;
								}
							}
						}
						aClass4_Sub3_Sub6_Sub3Array9[Static91.anInt2139] = Static128.aClass4_Sub3_Sub6_Sub3Array12[local254];
						Static5.anIntArray7[Static91.anInt2139] = local258;
						Static68.anIntArray192[Static91.anInt2139] = local260;
						Static91.anInt2139++;
					}
				}
			}
		}
		Static86.aClass14_1.method687();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)I")
	public static int method1714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = 65536 - Class4_Sub3_Sub6_Sub4.anIntArray304[arg3 * 1024 / arg2] >> 1;
		return (arg0 * (65536 - local17) >> 16) + (arg1 * local17 >> 16);
	}
}
