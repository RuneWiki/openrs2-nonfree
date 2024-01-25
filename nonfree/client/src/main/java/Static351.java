import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!mfa", name = "l", descriptor = "Lclient!ria;")
	public static Class303 aClass303_13 = null;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[Ljava/lang/Object;[II)V")
	public static void method5266(@OriginalArg(0) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(12) int local12 = (arg0 + arg3) / 2;
		@Pc(14) int local14 = arg3;
		@Pc(18) int local18 = arg2[local12];
		arg2[local12] = arg2[arg0];
		arg2[arg0] = local18;
		@Pc(32) Object local32 = arg1[local12];
		arg1[local12] = arg1[arg0];
		arg1[arg0] = local32;
		@Pc(51) int local51 = ~local18 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg3; local53 < arg0; local53++) {
			if (arg2[local53] < (local53 & local51) + local18) {
				@Pc(71) int local71 = arg2[local53];
				arg2[local53] = arg2[local14];
				arg2[local14] = local71;
				@Pc(85) Object local85 = arg1[local53];
				arg1[local53] = arg1[local14];
				arg1[local14++] = local85;
			}
		}
		arg2[arg0] = arg2[local14];
		arg2[local14] = local18;
		arg1[arg0] = arg1[local14];
		arg1[local14] = local32;
		method5266(local14 - 1, arg1, arg2, arg3);
		method5266(arg0, arg1, arg2, local14 + 1);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(JIIIILclient!nd;ZB)V")
	public static void method5270(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class238 arg3) {
		Static64.anInt1727 = arg1;
		Static275.anInt5095 = 1;
		Static510.aClass238_229 = arg3;
		Static246.aBoolean357 = false;
		Static309.anInt7821 = arg2;
		Static79.aClass2_Sub11_Sub1_1 = null;
		Static40.anInt841 = 10000;
		Static114.anInt2410 = 0;
		Static15.aLong11 = arg0;
		Static543.anInt8776 = 0;
	}
}
