import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "[[[Lclient!vb;")
	public static Class2_Sub31[][][] aClass2_Sub31ArrayArrayArray2;

	@OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
	public static int anInt3867;

	@OriginalMember(owner = "client!nm", name = "X", descriptor = "Lclient!jd;")
	public static Class84 aClass84_75;

	@OriginalMember(owner = "client!nm", name = "cb", descriptor = "I")
	public static int anInt3871;

	@OriginalMember(owner = "client!nm", name = "db", descriptor = "I")
	public static int anInt3872 = -1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BB)V")
	public static void method3127(@OriginalArg(1) byte arg0) {
		if (Static104.aByteArrayArrayArray6 == null) {
			Static104.aByteArrayArrayArray6 = new byte[4][104][104];
		}
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			for (@Pc(28) int local28 = 0; local28 < 104; local28++) {
				for (@Pc(33) int local33 = 0; local33 < 104; local33++) {
					Static104.aByteArrayArrayArray6[local21][local28][local33] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZIIIII)V")
	public static void method3128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(14) int local14 = arg1 + arg0;
		@Pc(19) int local19 = arg2 - arg1;
		@Pc(24) int local24 = arg3 + arg1;
		@Pc(26) int local26;
		for (local26 = arg3; local26 < local24; local26++) {
			Static133.method2321(arg2, arg0, Static274.anIntArrayArray50[local26], arg5);
		}
		for (local26 = arg4; local26 > local10; local26--) {
			Static133.method2321(arg2, arg0, Static274.anIntArrayArray50[local26], arg5);
		}
		for (local26 = local24; local26 <= local10; local26++) {
			@Pc(83) int[] local83 = Static274.anIntArrayArray50[local26];
			Static133.method2321(local14, arg0, local83, arg5);
			Static133.method2321(arg2, local19, local83, arg5);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V")
	public static void method3129(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static27.method518(arg2, -1, 9, arg1, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V")
	public static void method3131(@OriginalArg(1) int arg0) {
		if (Static261.anIntArray476 == null || arg0 > Static261.anIntArray476.length) {
			Static261.anIntArray476 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
	public static void method3132() {
		for (@Pc(6) int local6 = 0; local6 < Static31.anInt575; local6++) {
			@Pc(17) Class140 local17 = Static105.method1956(local6);
			if (local17 != null && local17.anInt4464 == 0) {
				Static171.anIntArray297[local6] = 0;
				Static249.anIntArray446[local6] = 0;
			}
		}
		Static9.aClass79_1 = new Class79(16);
	}
}
