import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!bi;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
	public static int anInt5406;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	public static int anInt5414;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "Lclient!jm;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
	public static int anInt5417;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "Lclient!jd;")
	public static Class84 aClass84_112;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	public static int anInt5409 = -1;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Z")
	public static boolean aBoolean435 = false;

	@OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
	public static int anInt5416 = 0;

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
	public static int anInt5421 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V")
	public static void method4336() {
		Static174.aClass46_30.method1068(5);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIII[Lclient!f;[B)V")
	public static void method4339(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class52[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class2_Sub26 local17 = new Class2_Sub26(arg4);
		while (true) {
			@Pc(23) int local23 = local17.method4240();
			if (local23 == 0) {
				return;
			}
			@Pc(32) int local32 = 0;
			local12 += local23;
			while (true) {
				@Pc(40) int local40 = local17.method4217();
				if (local40 == 0) {
					break;
				}
				local32 += local40 - 1;
				@Pc(59) int local59 = local32 >> 6 & 0x3F;
				@Pc(63) int local63 = local32 & 0x3F;
				@Pc(67) int local67 = local17.method4261();
				@Pc(71) int local71 = local32 >> 12;
				@Pc(75) int local75 = local67 >> 2;
				@Pc(80) int local80 = local59 + arg1;
				@Pc(84) int local84 = local67 & 0x3;
				@Pc(88) int local88 = local63 + arg2;
				if (local80 > 0 && local88 > 0 && local80 < 103 && local88 < 103) {
					@Pc(103) Class52 local103 = null;
					if (!arg0) {
						@Pc(108) int local108 = local71;
						if ((Static134.aByteArrayArrayArray9[1][local80][local88] & 0x2) == 2) {
							local108 = local71 - 1;
						}
						if (local108 >= 0) {
							local103 = arg3[local108];
						}
					}
					Static121.method2216(local80, !arg0, local103, arg0, local75, local84, local71, local71, local12, local88);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public static void method4340() {
		Static146.aClass46_25.method1077();
	}
}
