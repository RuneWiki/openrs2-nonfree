import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!bs", name = "L", descriptor = "Lclient!ne;")
	public static final Class166 aClass166_2 = new Class166("LOCAL", 4);

	@OriginalMember(owner = "client!bs", name = "T", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_30 = new Class214(9, -2);

	@OriginalMember(owner = "client!bs", name = "U", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_15 = new Class167(64);

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)V")
	public static void method635(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub3_Sub13 local13 = Static397.method4998(14, arg0);
		local13.method3458();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)Z")
	public static boolean method636(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(DI)V")
	public static void method637(@OriginalArg(0) double arg0) {
		if (Static82.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static341.anIntArray336[local7] = local19 > 255 ? 255 : local19;
		}
		Static82.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIBLclient!od;II)Lclient!we;")
	public static Class5_Sub1_Sub1 method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class128_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean362 || Static298.method3895(arg0) && Static298.method3895(arg1)) {
			return new Class5_Sub1_Sub1(arg2, 3553, arg3, arg4, arg0, arg1, true);
		} else if (arg2.aBoolean372) {
			return new Class5_Sub1_Sub1(arg2, 34037, arg3, arg4, arg0, arg1, true);
		} else {
			return new Class5_Sub1_Sub1(arg2, arg3, arg4, arg0, arg1, Static88.method1286(arg0), Static88.method1286(arg1), true);
		}
	}
}
