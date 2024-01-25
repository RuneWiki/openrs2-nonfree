import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!tc", name = "Qb", descriptor = "I")
	public static int anInt8419;

	@OriginalMember(owner = "client!tc", name = "pb", descriptor = "Z")
	public static boolean aBoolean618 = false;

	@OriginalMember(owner = "client!tc", name = "Jb", descriptor = "[I")
	public static int[] anIntArray575 = null;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Lclient!bm;")
	public static Class1_Sub3_Sub5 method6969(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub5 local10 = (Class1_Sub3_Sub5) Static118.aClass157_2.method3684((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static221.aClass111_49.method2441(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static216.method3590(local25);
			Static118.aClass157_2.method3687((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!ga;II)Lclient!sfa;")
	public static Class1_Sub3_Sub17 method6970(@OriginalArg(1) Class111 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class1_Sub20 local14 = new Class1_Sub20(arg0.method2441(arg2, arg1));
		@Pc(49) Class1_Sub3_Sub17 local49 = new Class1_Sub3_Sub17(arg2, local14.method4388(), local14.method4388(), local14.method4371(), local14.method4371(), local14.method4393() == 1, local14.method4393(), local14.method4393());
		@Pc(55) int local55 = local14.method4393();
		for (@Pc(57) int local57 = 0; local57 < local55; local57++) {
			local49.aClass361_91.method7855(new Class1_Sub42(local14.method4393(), local14.method4426(), local14.method4426(), local14.method4426(), local14.method4426(), local14.method4426(), local14.method4426(), local14.method4426(), local14.method4426()));
		}
		local49.method6739();
		return local49;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILclient!r;IIIII)V")
	public static void method6971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface7 local11 = (Interface7) Static387.method5565(arg4, arg0, arg2);
		@Pc(20) Class306 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static146.aClass214_1.method4897(local11.method7276());
			local26 = local11.method7278() & 0x3;
			local30 = local11.method7279();
			if (local20.anInt8391 == -1) {
				local45 = arg1;
				if (local20.anInt8387 > 0) {
					local45 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg3.method6447(4, local45, arg5, arg6);
					} else if (local26 == 1) {
						arg3.method6443(arg5, arg6, local45, 4);
					} else if (local26 == 2) {
						arg3.method6447(4, local45, arg5 + 3, arg6);
					} else if (local26 == 3) {
						arg3.method6443(arg5, arg6 + 3, local45, 4);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg3.method6418(1, arg5, arg6, 1, local45);
					} else if (local26 == 1) {
						arg3.method6418(1, arg5 + 3, arg6, 1, local45);
					} else if (local26 == 2) {
						arg3.method6418(1, arg5 + 3, arg6 + 3, 1, local45);
					} else if (local26 == 3) {
						arg3.method6418(1, arg5, arg6 + 3, 1, local45);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg3.method6443(arg5, arg6, local45, 4);
					} else if (local26 == 1) {
						arg3.method6447(4, local45, arg5 + 3, arg6);
					} else if (local26 == 2) {
						arg3.method6443(arg5, arg6 + 3, local45, 4);
					} else if (local26 == 3) {
						arg3.method6447(4, local45, arg5, arg6);
					}
				}
			} else {
				Static459.method6513(arg5, arg6, local20, arg3, local26);
			}
		}
		local11 = (Interface7) Static18.method537(arg4, arg0, arg2, ge.class);
		if (local11 != null) {
			local20 = Static146.aClass214_1.method4897(local11.method7276());
			local26 = local11.method7278() & 0x3;
			local30 = local11.method7279();
			if (local20.anInt8391 != -1) {
				Static459.method6513(arg5, arg6, local20, arg3, local26);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt8387 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg3.method6427(local45, arg5, arg6, arg5 + 3, arg6 - -3);
				} else {
					arg3.method6427(local45, arg5, arg6 + 3, arg5 - -3, arg6);
				}
			}
		}
		local11 = (Interface7) Static17.method507(arg4, arg0, arg2);
		if (local11 == null) {
			return;
		}
		local20 = Static146.aClass214_1.method4897(local11.method7276());
		local26 = local11.method7278() & 0x3;
		if (local20.anInt8391 != -1) {
			Static459.method6513(arg5, arg6, local20, arg3, local26);
			return;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)Z")
	public static boolean method6978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[ILclient!kba;[I[I)V")
	public static void method6981(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class20_Sub2_Sub4_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) int local9 = arg0[local3];
			@Pc(13) int local13 = arg2[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg1.aClass313Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass313Array3[local19] = null;
					} else {
						@Pc(36) Class131 local36 = Static594.aClass311_2.method7009(local9);
						@Pc(39) int local39 = local36.anInt3742;
						@Pc(44) Class313 local44 = arg1.aClass313Array3[local19];
						if (local44 != null) {
							if (local44.anInt8491 == local9) {
								if (local39 == 0) {
									local44 = arg1.aClass313Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt8493 = 0;
									local44.anInt8489 = 0;
									local44.anInt8492 = 1;
									local44.anInt8488 = local17;
									local44.anInt8490 = 0;
									Static171.method2603(0, arg1.anInt8796, local36, arg1.anInt8795, arg1.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg1);
								} else if (local39 == 2) {
									local44.anInt8490 = 0;
								}
							} else if (local36.anInt3734 >= Static594.aClass311_2.method7009(local44.anInt8491).anInt3734) {
								local44 = arg1.aClass313Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg1.aClass313Array3[local19] = new Class313();
							local44.anInt8491 = local9;
							local44.anInt8493 = 0;
							local44.anInt8490 = 0;
							local44.anInt8488 = local17;
							local44.anInt8492 = 1;
							local44.anInt8489 = 0;
							Static171.method2603(0, arg1.anInt8796, local36, arg1.anInt8795, arg1.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg1);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
