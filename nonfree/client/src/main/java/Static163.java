import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!nh;")
	public static Class1_Sub19 aClass1_Sub19_1;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1050 = Static81.method1507("Use");

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1051 = Static81.method1507("Started 3d library");

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1052 = aClass24_1051;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1053 = aClass24_1050;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
	public static int anInt3581 = 3;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!le;)V")
	public static void method2733(@OriginalArg(1) Class1_Sub2_Sub8_Sub2 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static77.anIntArray160.length; local12++) {
			Static77.anIntArray160[local12] = 0;
		}
		@Pc(37) int local37;
		for (@Pc(28) int local28 = 0; local28 < 5000; local28++) {
			local37 = (int) (Math.random() * 128.0D * (double) 256);
			Static77.anIntArray160[local37] = (int) (Math.random() * 256.0D);
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		@Pc(64) int local64;
		for (local37 = 0; local37 < 20; local37++) {
			for (local53 = 1; local53 < 255; local53++) {
				for (local56 = 1; local56 < 127; local56++) {
					local64 = local56 + (local53 << 7);
					Static145.anIntArray272[local64] = (Static77.anIntArray160[local64 - 128] + Static77.anIntArray160[local64 - 1] + Static77.anIntArray160[local64 + 1] + Static77.anIntArray160[local64 - -128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static77.anIntArray160;
			Static77.anIntArray160 = Static145.anIntArray272;
			Static145.anIntArray272 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local53 = 0;
		for (local56 = 0; local56 < arg0.anInt2562; local56++) {
			for (local64 = 0; local64 < arg0.anInt2563; local64++) {
				if (arg0.aByteArray24[local53++] != 0) {
					@Pc(145) int local145 = local64 + arg0.anInt2561 + 16;
					@Pc(152) int local152 = arg0.anInt2559 + local56 + 16;
					@Pc(159) int local159 = local145 + (local152 << 7);
					Static77.anIntArray160[local159] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([Lclient!dj;BII[S)V")
	public static void method2734(@OriginalArg(0) Class24[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(9) int local9 = (arg1 + arg2) / 2;
		@Pc(11) int local11 = arg1;
		@Pc(15) Class24 local15 = arg0[local9];
		arg0[local9] = arg0[arg2];
		arg0[arg2] = local15;
		@Pc(29) short local29 = arg3[local9];
		arg3[local9] = arg3[arg2];
		arg3[arg2] = local29;
		for (@Pc(41) int local41 = arg1; local41 < arg2; local41++) {
			if (local15 == null || arg0[local41] != null && (local41 & 0x1) > arg0[local41].method756(local15)) {
				@Pc(66) Class24 local66 = arg0[local41];
				arg0[local41] = arg0[local11];
				arg0[local11] = local66;
				@Pc(80) short local80 = arg3[local41];
				arg3[local41] = arg3[local11];
				arg3[local11++] = local80;
			}
		}
		arg0[arg2] = arg0[local11];
		arg0[local11] = local15;
		arg3[arg2] = arg3[local11];
		arg3[local11] = local29;
		method2734(arg0, arg1, local11 - 1, arg3);
		method2734(arg0, local11 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public static void method2736() {
		for (@Pc(19) Class1_Sub11 local19 = (Class1_Sub11) Static115.aClass57_25.method1876(); local19 != null; local19 = (Class1_Sub11) Static115.aClass57_25.method1873()) {
			@Pc(24) int local24 = local19.anInt2169;
			if (Static110.method1903(local24)) {
				@Pc(30) boolean local30 = true;
				@Pc(34) Class98[] local34 = Static4.aClass98ArrayArray3[local24];
				for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
					if (local34[local36] != null) {
						local30 = local34[local36].aBoolean211;
						break;
					}
				}
				if (!local30) {
					@Pc(64) int local64 = (int) local19.aLong149;
					@Pc(68) Class98 local68 = Static188.method3229(local64);
					if (local68 != null) {
						Static199.method2199(local68);
					}
				}
			}
		}
	}
}
