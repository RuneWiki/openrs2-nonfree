import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array12;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_50 = new Class66(64);

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "[I")
	public static final int[] anIntArray437 = new int[1000];

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "[I")
	public static final int[] anIntArray438 = new int[50];

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1500 = Static177.method3050("leuchten3:");

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "Lclient!bg;")
	public static final Class11 aClass11_17 = new Class11();

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
	public static int anInt4101 = 0;

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "Z")
	public static boolean aBoolean169 = true;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
	public static int anInt4102 = 0;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IIIIIIII)V")
	public static void method3137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static165.method2751(arg5)) {
			Static30.method501(-1, arg3, arg6, Static54.aClass1ArrayArray1[arg5], arg1, arg2, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ca;IZIII)V")
	public static void method3139(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static57.anInt1406 >= 50 || (arg0.anIntArray53 == null || arg0.anIntArray53.length <= arg1)) {
			return;
		}
		@Pc(23) int local23 = arg0.anIntArray53[arg1];
		if (local23 == 0) {
			return;
		}
		@Pc(37) int local37 = local23 >> 4 & 0x7;
		@Pc(41) int local41 = local23 >> 8;
		@Pc(45) int local45 = local23 & 0xF;
		if (local45 == 0) {
			if (arg2) {
				Static91.method1804(local41, local37, 0);
			}
		} else if (Static122.anInt2962 != 0) {
			Static50.anIntArray124[Static57.anInt1406] = local41;
			Static67.anIntArray168[Static57.anInt1406] = local37;
			@Pc(77) int local77 = (arg4 - 64) / 128;
			anIntArray438[Static57.anInt1406] = 0;
			@Pc(87) int local87 = (arg3 - 64) / 128;
			Static6.aClass13Array1[Static57.anInt1406] = null;
			Static91.anIntArray223[Static57.anInt1406] = local45 + (local87 << 8) + (local77 << 16);
			Static57.anInt1406++;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(JI)V")
	public static void method3140(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static90.aClass4_Sub11_Sub1_1.method1285(206);
			Static90.aClass4_Sub11_Sub1_1.method1269(arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	public static void method3141() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(18) int local18 = 0; local18 < Static3.anInt86 - 1; local18++) {
				if (Static11.aShortArray5[local18] < 1000 && Static11.aShortArray5[local18 + 1] > 1000) {
					local3 = false;
					@Pc(38) Class46 local38 = Static166.aClass46Array24[local18];
					Static166.aClass46Array24[local18] = Static166.aClass46Array24[local18 + 1];
					Static166.aClass46Array24[local18 + 1] = local38;
					@Pc(56) Class46 local56 = Static83.aClass46Array15[local18];
					Static83.aClass46Array15[local18] = Static83.aClass46Array15[local18 + 1];
					Static83.aClass46Array15[local18 + 1] = local56;
					@Pc(74) int local74 = Static163.anIntArray370[local18];
					Static163.anIntArray370[local18] = Static163.anIntArray370[local18 + 1];
					Static163.anIntArray370[local18 + 1] = local74;
					@Pc(92) int local92 = Static123.anIntArray280[local18];
					Static123.anIntArray280[local18] = Static123.anIntArray280[local18 + 1];
					Static123.anIntArray280[local18 + 1] = local92;
					@Pc(110) short local110 = Static11.aShortArray5[local18];
					Static11.aShortArray5[local18] = Static11.aShortArray5[local18 + 1];
					Static11.aShortArray5[local18 + 1] = local110;
					@Pc(128) long local128 = Static40.aLongArray14[local18];
					Static40.aLongArray14[local18] = Static40.aLongArray14[local18 + 1];
					Static40.aLongArray14[local18 + 1] = local128;
				}
			}
		}
	}
}
