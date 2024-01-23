import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!oi;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	public static int anInt3004;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	public static int anInt2996 = 0;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!i;")
	private static Class41 aClass41_845 = Static184.method2923("Location");

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_844 = aClass41_845;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array44 = new Class41[100];

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "[I")
	public static int[] anIntArray322 = new int[1000];

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!ae;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_2 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
	public static int anInt3009 = 1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
	public static void method2084(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static187.method2974(arg0)) {
			return;
		}
		@Pc(24) Class80[] local24 = Static68.aClass80ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(32) Class80 local32 = local24[local26];
			if (local32.anObjectArray12 != null) {
				@Pc(39) Class2_Sub5 local39 = new Class2_Sub5();
				local39.aClass80_3 = local32;
				local39.anObjectArray3 = local32.anObjectArray12;
				Static120.method2033(local39, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)V")
	public static void method2085(@OriginalArg(1) long arg0) {
		if (arg0 == (long) 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < Static60.anInt4785; local13++) {
			if (Static83.aLongArray6[local13] == arg0) {
				Static60.anInt4785--;
				for (@Pc(31) int local31 = local13; local31 < Static60.anInt4785; local31++) {
					Static83.aLongArray6[local31] = Static83.aLongArray6[local31 + 1];
					aClass41Array44[local31] = aClass41Array44[local31 + 1];
				}
				Static18.anInt491 = Static60.anInt4782;
				aClass2_Sub3_Sub1_2.method221(126);
				aClass2_Sub3_Sub1_2.method190(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	public static void method2086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt1382; local12++) {
			@Pc(18) Class51 local18 = local7.aClass51Array1[local12];
			if ((local18.aLong69 >> 29 & 0x3L) == 2L && local18.anInt2305 == arg1 && local18.anInt2308 == arg2) {
				Static122.method2041(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method2087() {
		if (Static149.aClass29_1 != null) {
			@Pc(12) Class29 local12 = Static149.aClass29_1;
			synchronized (Static149.aClass29_1) {
				Static149.aClass29_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method2089() {
		@Pc(1) Object local1 = Static30.anObject1;
		synchronized (Static30.anObject1) {
			if (Static199.anInt4469 == 0) {
				Static111.aClass83_2.method2618(new Class20(), 5);
			}
			Static199.anInt4469 = 600;
		}
	}
}
