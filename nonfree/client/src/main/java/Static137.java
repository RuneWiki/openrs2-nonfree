import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "[I")
	public static final int[] anIntArray168 = new int[2048];

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLclient!qj;)V")
	public static void method2309(@OriginalArg(1) Class100_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static143.anObject52 == null) {
			@Pc(9) Class127_Sub1_Sub1 local9 = new Class127_Sub1_Sub1();
			local16 = local9.method3055();
			Static143.anObject52 = Static276.method3094(local16);
		}
		if (Static517.anObject45 == null) {
			@Pc(27) Class127_Sub2_Sub1 local27 = new Class127_Sub2_Sub1();
			local16 = local27.method7413();
			Static517.anObject45 = Static276.method3094(local16);
		}
		@Pc(47) Class125 local47 = arg0.aClass125_1;
		if (local47.method2991() && Static36.anObject7 == null) {
			local16 = Static450.method6450(16.0F, 0.5F, 0.6F, 4.0F, new Class4_Sub1(419684), 4.0F);
			Static36.anObject7 = Static276.method3094(local16);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BD)V")
	public static void method2310(@OriginalArg(1) double arg0) {
		if (arg0 == Static23.aDouble1) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static484.anIntArray585[local7] = local19 <= 255 ? local19 : 255;
		}
		Static23.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILclient!qj;ZI[I)Lclient!ar;")
	public static Class23_Sub1_Sub1 method2317(@OriginalArg(1) int arg0, @OriginalArg(2) Class100_Sub3 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3) {
		if (arg1.aBoolean597 || Static19.method380(arg0) && Static19.method380(arg2)) {
			return new Class23_Sub1_Sub1(arg1, 3553, arg0, arg2, false, arg3);
		} else if (arg1.aBoolean586) {
			return new Class23_Sub1_Sub1(arg1, 34037, arg0, arg2, false, arg3);
		} else {
			return new Class23_Sub1_Sub1(arg1, arg0, arg2, Static89.method7259(arg0), Static89.method7259(arg2), arg3);
		}
	}
}
