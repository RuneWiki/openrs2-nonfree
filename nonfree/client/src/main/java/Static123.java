import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!nd", name = "Ab", descriptor = "I")
	public static int anInt3073;

	@OriginalMember(owner = "client!nd", name = "Eb", descriptor = "Lclient!eb;")
	public static Class23 aClass23_4;

	@OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
	public static int anInt3062 = 0;

	@OriginalMember(owner = "client!nd", name = "ob", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1736 = Static118.method2249("Your account has been disabled)3");

	@OriginalMember(owner = "client!nd", name = "jb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1735 = aClass65_1736;

	@OriginalMember(owner = "client!nd", name = "Hb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1738 = Static118.method2249("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!nd", name = "pb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1737 = aClass65_1738;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method2347() {
		if (Static13.aBoolean36 && Static207.anInt4425 != Static37.anInt1034) {
			Static176.method2983(Static201.aClass6_Sub4_Sub1_3.anIntArray451[0], Static148.anInt3494, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], Static207.anInt4425, Static206.anInt4395);
		} else if (Static54.anInt3677 != Static207.anInt4425) {
			Static54.anInt3677 = Static207.anInt4425;
			Static50.method915(Static207.anInt4425);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!oc;SJLclient!oc;II)V")
	public static void method2348(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) short arg2, @OriginalArg(3) long arg3, @OriginalArg(4) Class65 arg4, @OriginalArg(6) int arg5) {
		if (Static198.aBoolean168 || Static101.anInt2533 >= 500) {
			return;
		}
		Static161.aClass65Array51[Static101.anInt2533] = arg4;
		Static198.aClass65Array62[Static101.anInt2533] = arg1;
		Static162.aShortArray52[Static101.anInt2533] = arg2;
		Static158.aLongArray7[Static101.anInt2533] = arg3;
		Static101.anIntArray288[Static101.anInt2533] = arg0;
		Static99.anIntArray280[Static101.anInt2533] = arg5;
		Static101.anInt2533++;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)V")
	public static void method2354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static173.method2925(arg0)) {
			Static15.method284(arg1, Static99.aClass97ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lclient!oc;ZII)Lclient!oc;")
	public static Class65 method2356(@OriginalArg(0) Class65[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
			if (arg0[local7 + arg1] == null) {
				arg0[local7 + arg1] = Static208.aClass65_2328;
			}
			local5 += arg0[arg1 + local7].anInt3190;
		}
		@Pc(40) int local40 = 0;
		@Pc(43) byte[] local43 = new byte[local5];
		@Pc(58) Class65 local58;
		for (@Pc(50) int local50 = 0; local50 < arg2; local50++) {
			local58 = arg0[arg1 + local50];
			Static217.method2361(local58.aByteArray37, 0, local43, local40, local58.anInt3190);
			local40 += local58.anInt3190;
		}
		local58 = new Class65();
		local58.anInt3190 = local5;
		local58.aByteArray37 = local43;
		return local58;
	}
}
