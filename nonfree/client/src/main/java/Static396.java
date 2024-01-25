import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!ti", name = "gb", descriptor = "I")
	public static int anInt7017;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "J")
	public static long aLong201 = -1L;

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "Z")
	public static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!ti", name = "kb", descriptor = "[I")
	public static final int[] anIntArray566 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public static void method5596() {
		@Pc(10) int local10 = Static157.aClass185_Sub1_1.method4641(Static192.anInt3828);
		if (local10 == 0) {
			Static180.aByteArrayArrayArray3 = null;
			Static296.method5577(0);
		} else if (local10 == 1) {
			Static407.method5680((byte) 0);
			Static296.method5577(512);
			if (Static398.aByteArrayArrayArray17 != null) {
				Static2.method15();
			}
		} else {
			Static407.method5680((byte) (Static213.anInt4343 - 4 & 0xFF));
			Static296.method5577(2);
		}
		Static57.anInt1361 = Static59.anInt1472;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZ)I")
	public static int method5600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class4_Sub38 local8 = Static351.method5112(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray540.length > arg1) {
			return local8.anIntArray540[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg6 < 0 || arg5 >= Static193.anInt3853 - 1 || arg6 >= Static301.anInt5585 - 1) {
			return;
		}
		if (Static294.aClass162ArrayArrayArray2 == null) {
			return;
		}
		@Pc(46) Interface12 local46;
		if (arg2 != 0) {
			if (arg2 == 1) {
				local46 = (Interface12) Static177.method3233(arg0, arg5, arg6);
				if (local46 != null) {
					if (!(local46 instanceof Class11_Sub3_Sub3)) {
						@Pc(55) int local55 = local46.method6320();
						if (arg1 != 4 && arg1 != 5) {
							if (arg1 == 6) {
								Static343.method4799(arg0, 4, local55, arg6, arg2, arg3 + 4, arg4, arg5);
							} else if (arg1 == 7) {
								Static343.method4799(arg0, 4, local55, arg6, arg2, (arg3 + 2 & 0x3) + 4, arg4, arg5);
								return;
							} else if (arg1 == 8) {
								Static343.method4799(arg0, 4, local55, arg6, arg2, arg3 + 4, arg4, arg5);
								Static343.method4799(arg0, 4, local55, arg6, arg2, (arg3 + 2 & 0x3) + 4, arg4, arg5);
								return;
							}
							return;
						}
						Static343.method4799(arg0, 4, local55, arg6, arg2, arg3, arg4, arg5);
						return;
					}
					((Class11_Sub3_Sub3) local46).aClass165_2.method4173(arg4);
					return;
				}
				return;
			}
			if (arg2 != 2) {
				if (arg2 == 3) {
					local46 = (Interface12) Static241.method4021(arg0, arg5, arg6);
					if (local46 != null) {
						if (!(local46 instanceof Class11_Sub1_Sub3)) {
							Static343.method4799(arg0, arg1, local46.method6320(), arg6, arg2, arg3, arg4, arg5);
							return;
						}
						((Class11_Sub1_Sub3) local46).aClass165_4.method4173(arg4);
						return;
					}
				}
				return;
			}
			local46 = (Interface12) Static422.method5870(arg0, arg5, arg6, wo.class);
			if (local46 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local46 instanceof Class11_Sub5_Sub4) {
					((Class11_Sub5_Sub4) local46).aClass165_3.method4173(arg4);
					return;
				}
				Static343.method4799(arg0, arg1, local46.method6320(), arg6, arg2, arg3, arg4, arg5);
				return;
			}
			return;
		}
		local46 = (Interface12) Static278.method4397(arg0, arg5, arg6);
		@Pc(248) Interface12 local248 = (Interface12) Static384.method5418(arg0, arg5, arg6);
		if (local46 != null && arg1 != 2) {
			if (local46 instanceof Class11_Sub2_Sub1) {
				((Class11_Sub2_Sub1) local46).aClass165_1.method4173(arg4);
			} else {
				Static343.method4799(arg0, arg1, local46.method6320(), arg6, arg2, arg3, arg4, arg5);
			}
		}
		if (local248 == null) {
			return;
		}
		if (!(local248 instanceof Class11_Sub2_Sub1)) {
			Static343.method4799(arg0, arg1, local248.method6320(), arg6, arg2, arg3, arg4, arg5);
			return;
		}
		((Class11_Sub2_Sub1) local248).aClass165_1.method4173(arg4);
		return;
	}
}
