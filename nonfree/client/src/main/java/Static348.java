import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIILclient!oa;I)Lclient!ba;")
	public static Class2 method5670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(14) Class2 local14 = (Class2) Static549.aClass125_71.method3512(local6);
		if (local14 == null) {
			@Pc(24) Class222 local24 = Static264.method4649(arg2, Static549.aClass161_119);
			if (local24 == null) {
				return null;
			}
			if (local24.anInt6710 < 13) {
				local24.method5605();
			}
			local14 = arg4.method7443(local24, 2055, Static274.anInt5655, 64, 768);
			Static549.aClass125_71.method3519(local6, local14);
		}
		local14 = local14.method5775((byte) 2, 2055, true);
		if (arg1 != 0) {
			local14.I(arg1);
		}
		if (arg5 != 0) {
			local14.AA(arg5);
		}
		if (arg0 != 0) {
			local14.v(arg0);
		}
		if (arg3 != 0) {
			local14.m(0, arg3, 0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLclient!oa;)V")
	public static void method5672(@OriginalArg(1) Class5 arg0) {
		for (@Pc(6) Class4_Sub4 local6 = (Class4_Sub4) Static73.aClass90_20.method2326(); local6 != null; local6 = (Class4_Sub4) Static73.aClass90_20.method2325()) {
			if (local6.aBoolean361) {
				local6.method4591(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!w;III[Z)Z")
	public static boolean method5673(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static511.aClass52Array3 != Static238.aClass52Array2) {
			@Pc(11) int local11 = Static163.aClass52Array4[arg1].sa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class52 local18 = Static163.aClass52Array4[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.sa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method7831(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.aa(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
