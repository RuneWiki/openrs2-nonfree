import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_209 = Static161.method2452("sch-Utteln:");

	@OriginalMember(owner = "client!cg", name = "Rb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_212 = Static161.method2452(" ");

	@OriginalMember(owner = "client!cg", name = "ab", descriptor = "Lclient!dc;")
	public static Class20 aClass20_210 = aClass20_212;

	@OriginalMember(owner = "client!cg", name = "tb", descriptor = "I")
	public static int anInt534 = 0;

	@OriginalMember(owner = "client!cg", name = "wb", descriptor = "I")
	public static int anInt537 = 0;

	@OriginalMember(owner = "client!cg", name = "Eb", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI[I[II)V")
	public static void method420(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0--;
		if (local7 > 25) {
			local7 = 25;
		}
		@Pc(17) int local17 = arg1[arg0];
		@Pc(21) int local21 = arg2[arg0];
		if (arg3 == 0) {
			Static43.aClass5_Sub6_Sub1_2.method3087(149);
			Static43.aClass5_Sub6_Sub1_2.method3061(local7 + local7 + 3);
		}
		if (arg3 == 1) {
			Static43.aClass5_Sub6_Sub1_2.method3087(74);
			Static43.aClass5_Sub6_Sub1_2.method3061(local7 + local7 + 3 + 14);
		}
		if (arg3 == 2) {
			Static43.aClass5_Sub6_Sub1_2.method3087(177);
			Static43.aClass5_Sub6_Sub1_2.method3061(local7 + local7 + 3);
		}
		Static43.aClass5_Sub6_Sub1_2.method3028(Static110.anInt2295 + local17);
		Static43.aClass5_Sub6_Sub1_2.method3031(local21 + Static86.anInt1895);
		Static43.aClass5_Sub6_Sub1_2.method3029(Static201.aBooleanArray22[82] ? 1 : 0);
		Static166.anInt3320 = arg2[0];
		Static169.anInt3386 = arg1[0];
		for (@Pc(117) int local117 = 1; local117 < local7; local117++) {
			arg0--;
			Static43.aClass5_Sub6_Sub1_2.method3083(arg2[arg0] - local21);
			Static43.aClass5_Sub6_Sub1_2.method3083(arg1[arg0] - local17);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Z")
	public static boolean method423(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
	public static void method425() {
		Static52.aClass7_1.method1026();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static73.aLongArray19[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static53.aLongArray12[local22] = 0L;
		}
		Static128.anInt2678 = 0;
	}
}
