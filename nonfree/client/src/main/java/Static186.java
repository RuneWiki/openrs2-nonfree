import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!sk;")
	public static Class25 aClass25_2;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "B")
	public static byte aByte55;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!gb;")
	public static final Class139 aClass139_1 = new Class139();

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!gb;")
	public static final Class139 aClass139_2 = new Class139();

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!gb;")
	public static final Class139 aClass139_3 = new Class139();

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!gb;")
	public static final Class139 aClass139_4 = new Class139();

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public static void method3006() {
		Static335.anInt6114 = -1;
		Static424.aClass3_Sub9_Sub5_3 = null;
		Static548.aClass143_125 = null;
		Static54.anInt1418 = 1;
		Static231.anInt4426 = 0;
		Static230.aBoolean341 = false;
		Static279.anInt5228 = 2;
		Static399.anInt5283 = -1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
	public static void method3007(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub6_Sub7 local15 = Static198.method3146((long) arg0, 12);
		local15.method1709();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[I[J)V")
	public static void method3008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg0) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) long local21 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg1; local55 < arg0; local55++) {
			if (local21 + (long) (local55 & local53) > arg3[local55]) {
				@Pc(77) long local77 = arg3[local55];
				arg3[local55] = arg3[local17];
				arg3[local17] = local77;
				@Pc(91) int local91 = arg2[local55];
				arg2[local55] = arg2[local17];
				arg2[local17++] = local91;
			}
		}
		arg3[arg0] = arg3[local17];
		arg3[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method3008(local17 - 1, arg1, arg2, arg3);
		method3008(arg0, local17 + 1, arg2, arg3);
	}
}
