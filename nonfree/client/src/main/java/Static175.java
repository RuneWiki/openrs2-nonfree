import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "[I")
	public static int[] anIntArray427 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "J")
	public static volatile long aLong135 = 0L;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1219 = Static8.method128("Wordpack geladen)3");

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1220 = Static8.method128("<br>(X");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIILclient!hc;I)V")
	public static void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1_Sub6 arg5, @OriginalArg(7) int arg6) {
		@Pc(27) int local27;
		if (arg3 < 0 || arg3 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local27 = arg5.method544();
				if (local27 == 0) {
					break;
				}
				if (local27 == 1) {
					arg5.method544();
					break;
				}
				if (local27 <= 49) {
					arg5.method544();
				}
			}
			return;
		}
		Static2.aByteArrayArrayArray1[arg4][arg3][arg6] = 0;
		while (true) {
			local27 = arg5.method544();
			if (local27 == 0) {
				if (arg4 == 0) {
					Static135.anIntArrayArrayArray5[0][arg3][arg6] = -Static166.method3059(arg1 + arg6 + 556238, arg0 + 932731 + arg3) * 8;
				} else {
					Static135.anIntArrayArrayArray5[arg4][arg3][arg6] = Static135.anIntArrayArrayArray5[arg4 - 1][arg3][arg6] - 240;
				}
				break;
			}
			if (local27 == 1) {
				@Pc(88) int local88 = arg5.method544();
				if (local88 == 1) {
					local88 = 0;
				}
				if (arg4 == 0) {
					Static135.anIntArrayArrayArray5[0][arg3][arg6] = -local88 * 8;
				} else {
					Static135.anIntArrayArrayArray5[arg4][arg3][arg6] = Static135.anIntArrayArrayArray5[arg4 - 1][arg3][arg6] - local88 * 8;
				}
				break;
			}
			if (local27 <= 49) {
				Static28.aByteArrayArrayArray5[arg4][arg3][arg6] = arg5.method548();
				Static107.aByteArrayArrayArray4[arg4][arg3][arg6] = (byte) ((local27 - 2) / 4);
				Static60.aByteArrayArrayArray3[arg4][arg3][arg6] = (byte) (arg2 + local27 - 2 & 0x3);
			} else if (local27 <= 81) {
				Static2.aByteArrayArrayArray1[arg4][arg3][arg6] = (byte) (local27 - 49);
			} else {
				Static171.aByteArrayArrayArray8[arg4][arg3][arg6] = (byte) (local27 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method3158() {
		aClass18_1220 = null;
		anIntArray427 = null;
		aClass18_1219 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ea;I)Z")
	public static boolean method3159(@OriginalArg(0) Class18 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static20.anInt570; local19++) {
			if (arg0.method734(Static142.aClass18Array20[local19])) {
				return true;
			}
		}
		return arg0.method734(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.aClass18_908);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public static void method3160() {
		Static17.aClass14_8 = new Class14(32);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)I")
	public static int method3161(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local9 * local34 >> 12;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void method3162(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static48.method1038(arg0)) {
			return;
		}
		@Pc(20) Class20[] local20 = Static148.aClass20ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local20.length; local26++) {
			@Pc(32) Class20 local32 = local20[local26];
			if (local32.anObjectArray25 != null) {
				@Pc(39) Class1_Sub10 local39 = new Class1_Sub10();
				local39.aClass20_6 = local32;
				local39.anObjectArray28 = local32.anObjectArray25;
				Static31.method685(local39, 2000000);
			}
		}
	}
}
