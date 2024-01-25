import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "Lclient!la;")
	public static Class196 aClass196_129;

	@OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
	public static int anInt9803 = 0;

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString107 = null;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	public static void method8399() {
		Static127.aClass42_1 = new Class42(8);
		Static549.anInt9261 = 0;
		for (@Pc(17) Class4_Sub10 local17 = (Class4_Sub10) Static88.aClass120_1.method2966(); local17 != null; local17 = (Class4_Sub10) Static88.aClass120_1.method2962()) {
			local17.method7855();
		}
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)V")
	public static void method8400() {
		Static274.anInt4964 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static56.aClass3_Sub3Array1[local13] = null;
			Static420.aByteArray80[local13] = 1;
			Static135.aClass12Array1[local13] = null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIIZI)V")
	public static void method8403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(19) int local19 = arg3 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(40) int local40 = local19 * (Static301.aShort78 - Static598.aShort130) / 100 + Static598.aShort130;
		if (Static20.aShort1 > local40) {
			local40 = Static20.aShort1;
		} else if (local40 > Static626.aShort131) {
			local40 = Static626.aShort131;
		}
		@Pc(62) int local62 = arg3 * 512 * local40 / (arg1 * 334);
		@Pc(96) int local96;
		@Pc(103) int local103;
		@Pc(67) short local67;
		if (local62 < Static492.aShort113) {
			local67 = Static492.aShort113;
			local40 = local67 * arg1 * 334 / (arg3 * 512);
			if (local40 > Static626.aShort131) {
				local40 = Static626.aShort131;
				local96 = local40 * arg3 * 512 / (local67 * 334);
				local103 = (arg1 - local96) / 2;
				if (arg4) {
					Static323.aClass5_9.la();
					Static323.aClass5_9.method7528(arg2, arg3, local103, arg0, -16777216);
					Static323.aClass5_9.method7528(arg1 + arg2 - local103, arg3, local103, arg0, -16777216);
				}
				arg1 -= local103 * 2;
				arg2 += local103;
			}
		} else if (local62 > Static92.aShort27) {
			local67 = Static92.aShort27;
			local40 = arg1 * 334 * local67 / (arg3 * 512);
			if (local40 < Static20.aShort1) {
				local40 = Static20.aShort1;
				local96 = arg1 * 334 * local67 / (local40 * 512);
				local103 = (arg3 - local96) / 2;
				if (arg4) {
					Static323.aClass5_9.la();
					Static323.aClass5_9.method7528(arg2, local103, arg1, arg0, -16777216);
					Static323.aClass5_9.method7528(arg2, local103, arg1, arg0 + arg3 - local103, -16777216);
				}
				arg0 += local103;
				arg3 -= local103 * 2;
			}
		}
		Static596.anInt9758 = (short) arg1;
		Static506.anInt8740 = (short) arg3;
		Static517.anInt8967 = arg0;
		Static509.anInt8807 = arg2;
		Static105.anInt2311 = local40 * arg3 / 334;
	}
}
