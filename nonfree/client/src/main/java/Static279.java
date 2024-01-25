import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method3851(@OriginalArg(0) Class167 arg0) {
		if (Static57.anInt1114 != Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 && (Static389.aClass227ArrayArrayArray3 != null && Static379.method5266(arg0, Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101))) {
			Static57.anInt1114 = Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([IZ[Ljava/lang/Object;)V")
	public static void method3853(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static324.method4495(arg0.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public static void method3854() {
		Static54.anImage1 = null;
		Static257.aFont1 = null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZLclient!nj;)Lclient!ko;")
	public static Class3_Sub4 method3855(@OriginalArg(1) Class3_Sub25 arg0) {
		arg0.method4096();
		@Pc(17) int local17 = arg0.method4096();
		@Pc(21) Class3_Sub4 local21 = Static55.method1095(local17);
		local21.anInt7510 = arg0.method4096();
		@Pc(30) int local30 = arg0.method4096();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			@Pc(38) int local38 = arg0.method4096();
			local21.method6141(arg0, local38);
		}
		local21.method6146();
		return local21;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ia;III[Z)Z")
	public static boolean method3856(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static178.aClass55Array1 != Static349.aClass55Array3) {
			@Pc(11) int local11 = Static182.aClass55Array2[arg1].R(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class55 local18 = Static182.aClass55Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.R(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method3815(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.H(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
