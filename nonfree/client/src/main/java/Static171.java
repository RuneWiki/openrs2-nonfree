import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	public static int anInt3390 = 0;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
	public static boolean aBoolean210 = true;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "F")
	public static float aFloat28 = 0.0F;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	public static int anInt3391 = -2;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
	public static int anInt3392 = 0;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "J")
	public static long aLong121 = 0L;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIILclient!en;IJ)Z")
	public static boolean method2688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class12 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static177.method2746(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!p;ZI)V")
	public static void method2689(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (Static287.aClass137_3 == null) {
			return;
		}
		try {
			Static287.aClass137_3.method3389(0L);
			Static287.aClass137_3.method3398(arg0.aByteArray30, 24, arg1);
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void method2690() {
		aByteArrayArray13 = null;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!lc;Lclient!lc;IB)Lclient!kg;")
	public static Class4_Sub2_Sub12_Sub1 method2691(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) Class98 arg2) {
		return Static292.method4344(arg0, 0, arg2) ? Static201.method3114(arg1.method2396(0, arg0)) : null;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!si;Lclient!si;)V")
	public static void method2692(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_230 != null) {
			arg1.method4391();
		}
		arg1.aClass4_230 = arg0.aClass4_230;
		arg1.aClass4_231 = arg0;
		arg1.aClass4_230.aClass4_231 = arg1;
		arg1.aClass4_231.aClass4_230 = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Lclient!dm;")
	public static Class35 method2693(@OriginalArg(0) int arg0) {
		@Pc(10) Class35 local10 = (Class35) Static256.aClass33_37.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static87.aClass98_55.method2396(arg0, 4);
		local10 = new Class35();
		if (local21 != null) {
			local10.method871(new Class4_Sub17(local21), arg0);
		}
		Static256.aClass33_37.method845(local10, (long) arg0);
		return local10;
	}
}
