import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!gq;")
	public static final Class124 aClass124_1 = new Class124(0, 3, Static246.aClass152_14);

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!gq;")
	public static final Class124 aClass124_2 = new Class124(1, 3, Static246.aClass152_14);

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "Lclient!gq;")
	public static final Class124 aClass124_3 = new Class124(2, 4, Static246.aClass152_10);

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "Lclient!gq;")
	public static final Class124 aClass124_4 = new Class124(3, 1, Static246.aClass152_14);

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!gq;")
	public static final Class124 aClass124_5 = new Class124(4, 2, Static246.aClass152_14);

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "Lclient!gq;")
	public static final Class124 aClass124_6 = new Class124(5, 3, Static246.aClass152_14);

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Lclient!gq;")
	public static final Class124 aClass124_7 = new Class124(6, 4, Static246.aClass152_14);

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	public static final int anInt4002 = Static673.method9349(16);

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_56 = new Class218(36, 8);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "([I[II[ILclient!wc;)V")
	public static void method3651(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class28_Sub1_Sub1_Sub1_Sub1 arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg2.length; local8++) {
			@Pc(14) int local14 = arg2[local8];
			@Pc(18) int local18 = arg0[local8];
			@Pc(22) int local22 = arg1[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && local24 < arg3.aClass107Array3.length; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg3.aClass107Array3[local24] = null;
					} else {
						@Pc(48) Class372 local48 = Static243.aClass343_3.method8356(local14);
						@Pc(51) int local51 = local48.anInt10254;
						@Pc(56) Class107 local56 = arg3.aClass107Array3[local24];
						if (local56 != null) {
							if (local56.anInt3426 == local14) {
								if (local51 == 0) {
									local56 = arg3.aClass107Array3[local24] = null;
								} else if (local51 == 1) {
									local56.anInt3421 = 1;
									local56.anInt3424 = 0;
									local56.anInt3423 = local22;
									local56.anInt3418 = 0;
									local56.anInt3419 = 0;
									if (!arg3.aBoolean819) {
										Static548.method7844(arg3, local48, 0);
									}
								} else if (local51 == 2) {
									local56.anInt3419 = 0;
								}
							} else if (local48.anInt10249 >= Static243.aClass343_3.method8356(local56.anInt3426).anInt10249) {
								local56 = arg3.aClass107Array3[local24] = null;
							}
						}
						if (local56 == null) {
							local56 = arg3.aClass107Array3[local24] = new Class107();
							local56.anInt3421 = 1;
							local56.anInt3423 = local22;
							local56.anInt3424 = 0;
							local56.anInt3418 = 0;
							local56.anInt3419 = 0;
							local56.anInt3426 = local14;
							if (!arg3.aBoolean819) {
								Static548.method7844(arg3, local48, 0);
							}
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)Lclient!gq;")
	public static Class124 method3652(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass124_1;
		} else if (arg0 == 1) {
			return aClass124_2;
		} else if (arg0 == 2) {
			return aClass124_3;
		} else if (arg0 == 3) {
			return aClass124_4;
		} else if (arg0 == 4) {
			return aClass124_5;
		} else if (arg0 == 5) {
			return aClass124_6;
		} else if (arg0 == 6) {
			return aClass124_7;
		} else {
			return null;
		}
	}
}
