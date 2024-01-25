import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!nl;")
	public static final Class258 aClass258_4 = new Class258("", 16);

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "[I")
	public static int[] anIntArray149 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[Lclient!dk;")
	public static final Interface3[] anInterface3Array2 = new Interface3[128];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method2648() {
		Static316.anIntArrayArray36 = null;
		Static247.aClass3_Sub28_8 = null;
		Static587.anInt9587 = -1;
		Static231.anInt4426 = 0;
		Static119.anInt2324 = 0;
		Static334.anInt5845 = 0;
		Static723.method9428();
		Static714.anInt11156 = 0;
		Static82.anInt1266 = 0;
		Static650.anInt10443 = 0;
		Static339.anInt5859 = 0;
		for (@Pc(29) int local29 = 0; local29 < Static672.aClass387Array1.length; local29++) {
			Static672.aClass387Array1[local29] = null;
		}
		Static101.method1318();
		for (@Pc(50) int local50 = 0; local50 < 2048; local50++) {
			Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local50] = null;
		}
		Static337.anInt5854 = 0;
		Static612.aClass136_44.method3505();
		Static32.anInt518 = 0;
		Static46.aClass136_5.method3505();
		method2651();
		Static317.anInt5604 = 0;
		Static577.aClass362_1.method8661();
		Static267.aClass3_Sub56_2 = null;
		Static319.aClass237_7 = null;
		Static410.aClass3_Sub56_3 = null;
		if (false) {
			anIntArray149 = null;
		}
		Static78.aLong62 = 0L;
		Static474.aClass237_4 = null;
		Static647.aClass3_Sub46_2 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static111.method1983(arg0, arg1) & Static206.method9439(arg0, arg1);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public static void method2651() {
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			Static197.aBooleanArray10[local14] = false;
		}
		Static197.anInt3483 = -1;
		Static674.anInt10663 = 0;
		Static573.anInt9429 = -1;
		Static283.anInt5140 = -1;
		Static175.anInt10579 = 1;
		Static647.anInt10427 = 0;
		Static153.anInt2819 = -1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)V")
	public static void method2652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static381.aClass330_7.method7911(94, Static476.aClass279_24.method6992(Static141.anInt2658));
		@Pc(64) int local64;
		@Pc(32) int local32;
		if (Static367.aBoolean490) {
			for (@Pc(20) Class3_Sub4_Sub17 local20 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7031(); local20 != null; local20 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7035()) {
				if (local20.anInt8611 == 1) {
					local32 = Static494.method7145((Class3_Sub4_Sub5) local20.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66);
				} else {
					local32 = Static593.method8152(local20);
				}
				if (local32 > local13) {
					local13 = local32;
				}
			}
			local64 = Static332.anInt5826 * 16 + 21;
			local13 += 8;
			Static188.anInt3322 = (Static470.aBoolean628 ? 26 : 22) + Static332.anInt5826 * 16;
		} else {
			for (@Pc(85) Class3_Sub4_Sub5 local85 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local85 != null; local85 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
				local32 = Static494.method7145(local85);
				if (local13 < local32) {
					local13 = local32;
				}
			}
			local13 += 8;
			local64 = Static285.anInt5168 * 16 + 21;
			Static188.anInt3322 = Static285.anInt5168 * 16 + (Static470.aBoolean628 ? 26 : 22);
		}
		@Pc(137) int local137 = arg1 - local13 / 2;
		if (Static575.anInt9435 < local137 + local13) {
			local137 = Static575.anInt9435 - local13;
		}
		if (local137 < 0) {
			local137 = 0;
		}
		local32 = arg0;
		if (Static272.anInt5005 < local64 + arg0) {
			local32 = Static272.anInt5005 - local64;
		}
		if (local32 < 0) {
			local32 = 0;
		}
		Static121.anInt2335 = local137;
		Static555.aBoolean678 = true;
		Static65.anInt1025 = local32;
		Static655.anInt10491 = local13;
	}
}
