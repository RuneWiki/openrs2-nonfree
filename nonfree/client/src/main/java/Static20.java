import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!nb;")
	public static Class1_Sub3_Sub4_Sub2_Sub1 aClass1_Sub3_Sub4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_4;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public static int anInt652 = 0;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!af;")
	private static Class5 aClass5_328 = Static45.method1937("Loaded wordpack");

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!af;")
	public static Class5 aClass5_320 = aClass5_328;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!af;")
	private static Class5 aClass5_330 = Static45.method1937("Loading fonts )2 ");

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_321 = aClass5_330;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt653 = -1;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!af;")
	private static Class5 aClass5_327 = Static45.method1937(" is already on your friend list");

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_322 = aClass5_327;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public static int anInt654 = -1;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!af;")
	private static Class5 aClass5_323 = Static45.method1937("Please reload this page)3");

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "[I")
	public static int[] anIntArray83 = new int[2048];

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_324 = aClass5_323;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_325 = Static45.method1937("Titelbild geladen)3");

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_326 = Static45.method1937("<col=ffffff>");

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	public static int anInt658 = 0;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!af;")
	public static Class5 aClass5_329 = Static45.method1937("event_opbase");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZI)Lclient!af;")
	public static Class5 method486(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) int local3 = 1;
		for (@Pc(19) int local19 = arg0 / 10; local19 != 0; local19 /= 10) {
			local3++;
		}
		@Pc(30) int local30 = local3;
		if (arg0 < 0 || arg1) {
			local30 = local3 + 1;
		}
		@Pc(38) byte[] local38 = new byte[local30];
		if (arg0 < 0) {
			local38[0] = 45;
		} else if (arg1) {
			local38[0] = 43;
		}
		for (@Pc(57) int local57 = 0; local57 < local3; local57++) {
			@Pc(63) int local63 = arg0 % 10;
			if (local63 < 0) {
				local63 = -local63;
			}
			if (local63 > 9) {
				local63 += 39;
			}
			arg0 /= 10;
			local38[local30 - local57 - 1] = (byte) (local63 + 48);
		}
		@Pc(101) Class5 local101 = new Class5();
		local101.anInt178 = local30;
		local101.aByteArray2 = local38;
		return local101;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
	public static void method487(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static8.aClass1_Sub3_Sub1_Sub2_1.anIntArray171;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (103 - local25) * 512 * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static25.aByteArrayArrayArray1[arg0][local40][local25] & 0x18) == 0) {
					Static44.aClass68_1.method1864(local8, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static25.aByteArrayArrayArray1[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static44.aClass68_1.method1864(local8, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static8.aClass1_Sub3_Sub1_Sub2_1.method734();
		local38 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((238 - (10 - ((int) (Math.random() * 20.0D))) << 8) - (-((int) (Math.random() * 20.0D)) + -238) - 10);
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(156) int local156;
		for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
			for (local156 = 1; local156 < 103; local156++) {
				if ((Static25.aByteArrayArrayArray1[arg0][local156][local147] & 0x18) == 0) {
					Static49.method867(local38, local156, local147, local40, arg0);
				}
				if (arg0 < 3 && (Static25.aByteArrayArrayArray1[arg0 + 1][local156][local147] & 0x8) != 0) {
					Static49.method867(local38, local156, local147, local40, arg0 + 1);
				}
			}
		}
		anInt652 = 0;
		for (local156 = 0; local156 < 104; local156++) {
			for (@Pc(227) int local227 = 0; local227 < 104; local227++) {
				@Pc(235) int local235 = Static44.aClass68_1.method1862(Static7.anInt213, local156, local227);
				if (local235 != 0) {
					local235 = local235 >> 14 & 0x7FFF;
					@Pc(251) int local251 = Static131.method2263(local235).anInt1666;
					if (local251 >= 0) {
						@Pc(258) int local258 = local156;
						@Pc(260) int local260 = local227;
						if (local251 != 22 && local251 != 29 && local251 != 34 && local251 != 36 && local251 != 46 && local251 != 47 && local251 != 48) {
							@Pc(292) int[][] local292 = Static131.aClass49Array1[Static7.anInt213].anIntArrayArray58;
							for (@Pc(294) int local294 = 0; local294 < 10; local294++) {
								@Pc(301) int local301 = (int) (Math.random() * 4.0D);
								if (local301 == 0 && local258 > 0 && local156 - 3 < local258 && (local292[local258 - 1][local260] & 0x12C0108) == 0) {
									local258--;
								}
								if (local301 == 1 && local258 < 103 && local258 < local156 + 3 && (local292[local258 + 1][local260] & 0x12C0180) == 0) {
									local258++;
								}
								if (local301 == 2 && local260 > 0 && local260 > local227 - 3 && (local292[local258][local260 - 1] & 0x12C0102) == 0) {
									local260--;
								}
								if (local301 == 3 && local260 < 103 && local260 < local227 + 3 && (local292[local258][local260 + 1] & 0x12C0120) == 0) {
									local260++;
								}
							}
						}
						Static112.aClass1_Sub3_Sub1_Sub2Array9[anInt652] = Static86.aClass1_Sub3_Sub1_Sub2Array4[local251];
						Static9.anIntArray38[anInt652] = local258;
						Static1.anIntArray12[anInt652] = local260;
						anInt652++;
					}
				}
			}
		}
		Static90.aClass43_1.method2194();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method488() {
		aClass5_329 = null;
		aClass5_328 = null;
		aClass5_322 = null;
		aClass41_Sub1_4 = null;
		aClass5_321 = null;
		aClass5_325 = null;
		aClass5_326 = null;
		aClass1_Sub3_Sub4_Sub2_Sub1_1 = null;
		anIntArray83 = null;
		aClass5_327 = null;
		aClass5_324 = null;
		aClass5_320 = null;
		aClass5_323 = null;
		aClass5_330 = null;
	}
}
