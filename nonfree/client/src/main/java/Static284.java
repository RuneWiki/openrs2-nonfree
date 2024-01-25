import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Lclient!dp;")
	public static Class51 aClass51_15;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
	public static final int anInt4914 = 1406;

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
	public static int anInt4915 = -1;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_176 = new Class48(6, -1);

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
	public static int anInt4918 = 0;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
	public static int anInt4919 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIZIIZ)V")
	public static void method4329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(24) int local24 = (arg1 + arg0) / 2;
		@Pc(26) int local26 = arg1;
		@Pc(30) Class124_Sub1 local30 = Static52.aClass124_Sub1Array1[local24];
		Static52.aClass124_Sub1Array1[local24] = Static52.aClass124_Sub1Array1[arg0];
		Static52.aClass124_Sub1Array1[arg0] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg0; local42++) {
			if (Static346.method4880(arg4, arg3, Static52.aClass124_Sub1Array1[local42], local30, arg2, arg5) <= 0) {
				@Pc(62) Class124_Sub1 local62 = Static52.aClass124_Sub1Array1[local42];
				Static52.aClass124_Sub1Array1[local42] = Static52.aClass124_Sub1Array1[local26];
				Static52.aClass124_Sub1Array1[local26++] = local62;
			}
		}
		Static52.aClass124_Sub1Array1[arg0] = Static52.aClass124_Sub1Array1[local26];
		Static52.aClass124_Sub1Array1[local26] = local30;
		method4329(local26 - 1, arg1, arg2, arg3, arg4, arg5);
		method4329(arg0, local26 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
	public static int method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static351.aByteArrayArray20 == null ? 0 : (Static351.aByteArrayArray20[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public static void method4331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass25_Sub5_1 != null) {
			local7.aClass25_Sub5_1 = null;
		}
		if (local7.aClass25_Sub5_2 != null) {
			local7.aClass25_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public static void method4332() {
		for (@Pc(10) Class1_Sub6_Sub16 local10 = (Class1_Sub6_Sub16) Static310.aClass17_63.method202(); local10 != null; local10 = (Class1_Sub6_Sub16) Static310.aClass17_63.method207()) {
			@Pc(15) Class25_Sub1_Sub2 local15 = local10.aClass25_Sub1_Sub2_1;
			if (local15.aByte70 != Static122.anInt2188 || local15.anInt2247 < Static366.anInt5883) {
				local10.method5577();
				local15.method1832();
			} else if (Static366.anInt5883 >= local15.anInt2233) {
				if (local15.anInt2238 > 0) {
					@Pc(57) Class25_Sub1_Sub1_Sub2 local57 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local15.anInt2238 - 1];
					if (local57 != null && local57.anInt6080 >= 0 && local57.anInt6080 < Static92.anInt1675 * 128 && local57.anInt6077 >= 0 && local57.anInt6077 < Static262.anInt6340 * 128) {
						local15.method1833(Static236.method3260(local15.aByte70, local57.anInt6077, local57.anInt6080) - local15.anInt2252, local57.anInt6080, Static366.anInt5883, local57.anInt6077);
					}
				}
				if (local15.anInt2238 < 0) {
					@Pc(114) int local114 = -local15.anInt2238 - 1;
					@Pc(125) Class25_Sub1_Sub1_Sub1 local125;
					if (local114 == Static43.anInt861) {
						local125 = Static321.aClass25_Sub1_Sub1_Sub1_2;
					} else {
						local125 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local114];
					}
					if (local125 != null && local125.anInt6080 >= 0 && local125.anInt6080 < Static92.anInt1675 * 128 && local125.anInt6077 >= 0 && Static262.anInt6340 * 128 > local125.anInt6077) {
						local15.method1833(Static236.method3260(local15.aByte70, local125.anInt6077, local125.anInt6080) - local15.anInt2252, local125.anInt6080, Static366.anInt5883, local125.anInt6077);
					}
				}
				local15.method1834(Static109.anInt1911);
				Static31.method498(local15, true);
			}
		}
	}
}
