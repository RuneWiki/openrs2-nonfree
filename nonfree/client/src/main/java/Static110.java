import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1067 = Static187.method3089("Checking for updates )2 ");

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1065 = aClass92_1067;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "[Lclient!ve;")
	public static final Class3_Sub1[] aClass3_Sub1Array1 = new Class3_Sub1[256];

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_7 = new Class77(260);

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1066 = Static187.method3089("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "[I")
	public static final int[] anIntArray176 = new int[100];

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
	public static int anInt2382 = 0;

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
	public static int anInt2383 = 0;

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "[I")
	public static final int[] anIntArray177 = new int[50];

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
	public static int anInt2386 = -1;

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1068 = Static187.method3089("yellow:");

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1069 = aClass92_1068;

	@OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
	public static int anInt2387 = 0;

	@OriginalMember(owner = "client!lc", name = "gb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1070 = aClass92_1068;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public static void method1653() {
		if (Static22.anIntArray48 != null && Static7.anIntArray17 != null) {
			return;
		}
		Static7.anIntArray17 = new int[256];
		Static22.anIntArray48 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static22.anIntArray48[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static7.anIntArray17[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	public static void method1654() {
		Static11.anImage1 = null;
		Static129.aFontMetrics1 = null;
		Static62.aFont1 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIILclient!e;IZJ)Z")
	public static boolean method1656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class8 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static115.anInt2477 || local4 >= Static160.anInt3334) {
					return false;
				}
				@Pc(25) Class1_Sub17 local25 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt2380 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class16 local49 = new Class16();
		local49.aLong30 = arg11;
		local49.anInt546 = arg0;
		local49.anInt543 = arg5;
		local49.anInt541 = arg6;
		local49.anInt544 = arg7;
		local49.aClass8_2 = arg8;
		local49.anInt542 = arg9;
		local49.anInt536 = arg1;
		local49.anInt540 = arg2;
		local49.anInt547 = arg1 + arg3 - 1;
		local49.anInt537 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static179.aClass1_Sub17ArrayArrayArray1[local124][local92][local95] == null) {
						Static179.aClass1_Sub17ArrayArrayArray1[local124][local92][local95] = new Class1_Sub17(local124, local92, local95);
					}
				}
				@Pc(157) Class1_Sub17 local157 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][local92][local95];
				local157.aClass16Array3[local157.anInt2380] = local49;
				local157.anIntArray178[local157.anInt2380] = local98;
				local157.anInt2385 |= local98;
				local157.anInt2380++;
			}
		}
		if (arg10) {
			Static26.aClass16Array1[Static60.anInt1454++] = local49;
		}
		return true;
	}
}
