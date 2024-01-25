import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
	public static int anInt5544;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public static void method5093() {
		Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
		Static350.aClass305_326 = null;
		Static43.aClass305_340 = null;
		Static381.aClass305_360 = null;
		Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
		Static494.anInt8660 = 0;
		Static508.anInt8899 = 0;
		Static396.anInt6970 = 0;
		Static517.aClass305_447 = null;
		Static409.method6500();
		Static160.method7799();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static511.aClass20_Sub1_Sub1_Sub1Array1[local31] = null;
		}
		Static107.aClass20_Sub1_Sub1_Sub1_1 = null;
		for (@Pc(47) int local47 = 0; local47 < Static342.anInt6322; local47++) {
			@Pc(54) Class20_Sub1_Sub1_Sub2 local54 = Static35.aClass1_Sub41Array1[local47].aClass20_Sub1_Sub1_Sub2_2;
			if (local54 != null) {
				local54.anInt9034 = -1;
			}
		}
		Static199.method1510();
		Static170.anInt3418 = 1;
		Static506.method7745(9);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static258.aBooleanArray17[local74] = true;
		}
		Static504.method7719();
		Static434.aLong207 = 0L;
		Static125.aClass1_Sub16_1 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)V")
	public static void method5094(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static341.anInt6297;
		@Pc(20) int local20;
		@Pc(28) int local28;
		if (Static397.anInt6990 != local12) {
			local20 = local12 - Static397.anInt6990;
			local28 = (int) (arg0 * (long) local20 / 320L);
			if (local20 <= 0) {
				if (local28 == 0) {
					local28 = -1;
				} else if (local28 < local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = 1;
			} else if (local20 < local28) {
				local28 = local20;
			}
			Static397.anInt6990 += local28;
		}
		@Pc(70) int local70 = Static181.anInt3812;
		if (!Static286.aClass1_Sub15_Sub1_1.aBoolean528) {
			Static135.aFloat193 += Static360.aFloat140 * (float) arg0 / 40.0F * 8.0F;
			Static49.aFloat29 += (float) arg0 * Static349.aFloat136 / 40.0F * 8.0F;
		}
		if (Static60.anInt1483 != local70) {
			local20 = local70 - Static60.anInt1483;
			local28 = (int) (arg0 * (long) local20 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local20 < local28) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local20 > local28) {
				local28 = local20;
			}
			Static60.anInt1483 += local28;
		}
		Static25.method772();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public static void method5095(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(6, arg0);
		local8.method6700();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!dn;Lclient!dn;Lclient!qa;I)V")
	public static void method5096(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class4 arg2) {
		Static379.aClass96_12 = Static363.method5898(Static447.anInt7829, arg1);
		Static403.aClass36_3 = arg2.method7193(Static379.aClass96_12, Static547.method1918(arg0, Static447.anInt7829));
		Static234.aClass96_8 = Static363.method5898(Static226.anInt4370, arg1);
		Static186.aClass36_1 = arg2.method7193(Static234.aClass96_8, Static547.method1918(arg0, Static226.anInt4370));
		Static270.aClass96_10 = Static363.method5898(Static54.anInt1389, arg1);
		Static511.aClass36_4 = arg2.method7193(Static270.aClass96_10, Static547.method1918(arg0, Static54.anInt1389));
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!pq;ILclient!dn;)V")
	public static void method5098(@OriginalArg(0) Class229 arg0, @OriginalArg(2) Class69 arg1) {
		Static133.aClass229_15 = arg0;
		Static352.aClass69_70 = arg1;
		Static529.aString217 = "";
		if (Static380.aString170.startsWith("win")) {
			Static529.aString217 = Static529.aString217 + "windows/";
		} else if (Static380.aString170.startsWith("linux")) {
			Static529.aString217 = Static529.aString217 + "linux/";
		} else if (Static380.aString170.startsWith("mac")) {
			Static529.aString217 = Static529.aString217 + "macos/";
		}
		if (Static380.anInt6743 == 2) {
			Static529.aString217 = Static529.aString217 + "msjava/";
		} else if (Static380.aString165.startsWith("amd64") || Static380.aString165.startsWith("x86_64")) {
			Static529.aString217 = Static529.aString217 + "x86_64/";
		} else if (Static380.aString165.startsWith("i586") || Static380.aString165.startsWith("x86")) {
			Static529.aString217 = Static529.aString217 + "x86/";
		} else if (Static380.aString165.startsWith("ppc")) {
			Static529.aString217 = Static529.aString217 + "ppc/";
		} else {
			Static529.aString217 = Static529.aString217 + "universal/";
		}
	}
}
