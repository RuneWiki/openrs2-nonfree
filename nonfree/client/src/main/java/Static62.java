import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_10;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "Z")
	public static boolean aBoolean79;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "Lclient!kh;")
	private static Class60 aClass60_486 = Static200.method3116("Feb");

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "Lclient!kh;")
	private static Class60 aClass60_487 = Static200.method3116("Oct");

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "Lclient!kh;")
	private static Class60 aClass60_488 = Static200.method3116("Nov");

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "Lclient!kh;")
	private static Class60 aClass60_489 = Static200.method3116("May");

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "Lclient!kh;")
	private static Class60 aClass60_490 = Static200.method3116("Aug");

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "Lclient!kh;")
	private static Class60 aClass60_491 = Static200.method3116("Jan");

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "Lclient!kh;")
	private static Class60 aClass60_496 = Static200.method3116("Mar");

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_498 = Static200.method3116("Apr");

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "Lclient!kh;")
	private static Class60 aClass60_492 = Static200.method3116("Jun");

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lclient!kh;")
	private static Class60 aClass60_493 = Static200.method3116("Jul");

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "Lclient!kh;")
	private static Class60 aClass60_494 = Static200.method3116("Sep");

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lclient!kh;")
	private static Class60 aClass60_495 = Static200.method3116("Dec");

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array10 = new Class60[] { aClass60_491, aClass60_486, aClass60_496, aClass60_498, aClass60_489, aClass60_492, aClass60_493, aClass60_490, aClass60_494, aClass60_487, aClass60_488, aClass60_495 };

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "Lclient!kh;")
	public static Class60 aClass60_497 = Static200.method3116("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIIIII)V")
	public static void method1118(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class8 local13 = local7.aClass8_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt344;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class105 local58 = local7.aClass105_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt4523;
		@Pc(67) int local67 = local58.anInt4521;
		@Pc(70) int local70 = local58.anInt4524;
		@Pc(73) int local73 = local58.anInt4522;
		@Pc(77) int[] local77 = Static118.anIntArrayArray43[local23];
		@Pc(81) int[] local81 = Static96.anIntArrayArray34[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method1120(@OriginalArg(1) Class60 arg0) {
		if (Static37.aClass1_Sub26Array1 == null) {
			return;
		}
		@Pc(12) long local12 = arg0.method1829();
		@Pc(14) int local14 = 0;
		if (local12 == 0L) {
			return;
		}
		while (Static37.aClass1_Sub26Array1.length > local14 && Static37.aClass1_Sub26Array1[local14].aLong150 != local12) {
			local14++;
		}
		if (local14 < Static37.aClass1_Sub26Array1.length && Static37.aClass1_Sub26Array1[local14] != null) {
			Static96.aClass1_Sub9_Sub1_3.method953(49);
			Static96.aClass1_Sub9_Sub1_3.method897(Static37.aClass1_Sub26Array1[local14].aLong150);
		}
	}
}
