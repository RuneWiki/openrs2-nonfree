import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "[Lclient!sl;")
	public static Class184[] aClass184Array1;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "Z")
	public static boolean aBoolean412;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	public static int anInt4499 = 0;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "S")
	public static short aShort61 = 32767;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)Lclient!jh;")
	public static Class96 method4051(@OriginalArg(0) int arg0) {
		@Pc(5) Class119 local5 = Static335.aClass119_205;
		@Pc(14) Class96 local14;
		synchronized (Static335.aClass119_205) {
			local14 = (Class96) Static335.aClass119_205.method3311((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static110.aClass191_72.method5459(Static196.method3533(arg0), Static328.method5760(arg0));
		local14 = new Class96();
		local14.anInt3132 = arg0;
		if (local39 != null) {
			local14.method2950(new Class2_Sub10(local39));
		}
		local14.method2953();
		if (local14.aBoolean283) {
			local14.aBoolean276 = false;
			local14.anInt3117 = 0;
		}
		if (!Static125.aBoolean236 && local14.aBoolean272) {
			local14.anIntArray258 = null;
			local14.aStringArray27 = null;
		}
		@Pc(80) Class119 local80 = Static335.aClass119_205;
		synchronized (Static335.aClass119_205) {
			Static335.aClass119_205.method3308(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZII)V")
	public static void method4052(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub26 local14 = Static42.method991(arg0, arg1);
		if (local14 != null) {
			for (@Pc(19) int local19 = 0; local19 < local14.anIntArray270.length; local19++) {
				local14.anIntArray270[local19] = -1;
				local14.anIntArray269[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Lclient!wk;")
	public static Class66 method4054() {
		try {
			return new Class66_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class66) Class.forName("Class66_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class66_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg3 < 0 || Static95.anInt6381 - 1 <= arg2 || arg3 >= Static237.anInt4532 - 1) {
			return;
		}
		if (Static275.aClass8ArrayArrayArray4 == null) {
			return;
		}
		@Pc(48) Interface9 local48;
		if (arg4 != 0) {
			if (arg4 == 1) {
				local48 = (Interface9) Static226.method3034(arg5, arg2, arg3);
				if (local48 != null) {
					if (local48 instanceof Class62_Sub5_Sub1) {
						((Class62_Sub5_Sub1) local48).aClass49_3.method1583(arg1);
						return;
					}
					@Pc(64) int local64 = local48.method5583();
					if (arg6 != 4 && arg6 != 5) {
						if (arg6 != 6) {
							if (arg6 == 7) {
								Static180.method3292(local64, arg4, 4, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg3, arg5);
							} else if (arg6 == 8) {
								Static180.method3292(local64, arg4, 4, arg0 + 4, arg2, arg1, arg3, arg5);
								Static180.method3292(local64, arg4, 4, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg3, arg5);
								return;
							}
							return;
						}
						Static180.method3292(local64, arg4, 4, arg0 + 4, arg2, arg1, arg3, arg5);
						return;
					}
					Static180.method3292(local64, arg4, 4, arg0, arg2, arg1, arg3, arg5);
					return;
				}
				return;
			}
			if (arg4 == 2) {
				local48 = (Interface9) Static280.method5066(arg5, arg2, arg3, vl.class);
				if (local48 != null) {
					if (arg6 == 11) {
						arg6 = 10;
					}
					if (local48 instanceof Class62_Sub1_Sub1) {
						((Class62_Sub1_Sub1) local48).aClass49_1.method1583(arg1);
						return;
					}
					Static180.method3292(local48.method5583(), arg4, arg6, arg0, arg2, arg1, arg3, arg5);
					return;
				}
				return;
			}
			if (arg4 == 3) {
				local48 = (Interface9) Static104.method4927(arg5, arg2, arg3);
				if (local48 != null) {
					if (local48 instanceof Class62_Sub3_Sub1) {
						((Class62_Sub3_Sub1) local48).aClass49_2.method1583(arg1);
						return;
					}
					Static180.method3292(local48.method5583(), arg4, arg6, arg0, arg2, arg1, arg3, arg5);
					return;
				}
			}
			return;
		}
		local48 = (Interface9) Static230.method4018(arg5, arg2, arg3);
		@Pc(248) Interface9 local248 = (Interface9) Static255.method4618(arg5, arg2, arg3);
		if (local48 != null && arg6 != 2) {
			if (local48 instanceof Class62_Sub4_Sub1) {
				((Class62_Sub4_Sub1) local48).aClass49_4.method1583(arg1);
			} else {
				Static180.method3292(local48.method5583(), arg4, arg6, arg0, arg2, arg1, arg3, arg5);
			}
		}
		if (local248 == null) {
			return;
		}
		if (local248 instanceof Class62_Sub4_Sub1) {
			((Class62_Sub4_Sub1) local248).aClass49_4.method1583(arg1);
			return;
		}
		Static180.method3292(local248.method5583(), arg4, arg6, arg0, arg2, arg1, arg3, arg5);
		return;
	}
}
