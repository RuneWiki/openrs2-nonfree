import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aia", name = "A", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!aia", name = "C", descriptor = "Lclient!gca;")
	public static Class3_Sub23 aClass3_Sub23_1;

	@OriginalMember(owner = "client!aia", name = "G", descriptor = "Lclient!la;")
	public static Class196 aClass196_7;

	@OriginalMember(owner = "client!aia", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[6][];

	@OriginalMember(owner = "client!aia", name = "F", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIBIIILclient!ha;IIIILclient!ip;)V")
	public static void method865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class3_Sub4_Sub13 arg10) {
		if (arg8 > arg0 && arg3 + arg0 > arg8 && arg2 - 13 < arg4 && arg4 < arg2 + 3 && arg10.aBoolean306) {
			arg9 = arg6;
		}
		@Pc(32) int[] local32 = null;
		if (Static13.method8716(arg10.anInt4577)) {
			local32 = Static320.aClass53_2.method1770((int) arg10.aLong136).anIntArray50;
		} else if (arg10.anInt4575 != -1) {
			local32 = Static320.aClass53_2.method1770(arg10.anInt4575).anIntArray50;
		} else if (Static582.method8235(arg10.anInt4577)) {
			@Pc(112) Class3_Sub28 local112 = (Class3_Sub28) Static551.aClass280_43.method7107((long) arg10.aLong136);
			if (local112 != null) {
				@Pc(117) Class4_Sub1_Sub2_Sub1_Sub1 local117 = local112.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				@Pc(120) Class109 local120 = local117.aClass109_1;
				if (local120.anIntArray147 != null) {
					local120 = local120.method2813(Static373.aClass150_1);
				}
				if (local120 != null) {
					local32 = local120.anIntArray146;
				}
			}
		} else if (Static213.method3609(arg10.anInt4577)) {
			@Pc(75) Class299 local75;
			if (arg10.anInt4577 == 1009) {
				local75 = Static105.aClass302_1.method7466((int) arg10.aLong136);
			} else {
				local75 = Static105.aClass302_1.method7466((int) (arg10.aLong136 >>> 32 & 0x7FFFFFFFL));
			}
			if (local75.anIntArray533 != null) {
				local75 = local75.method7418(Static373.aClass150_1);
			}
			if (local75 != null) {
				local32 = local75.anIntArray537;
			}
		}
		@Pc(145) String local145 = Static481.method7189(arg10);
		if (local32 != null) {
			local145 = local145 + Static291.method4631(local32);
		}
		Static460.aClass62_9.method8360(Static167.aClass24Array8, arg9, Static51.anIntArray48, arg2, local145, arg0 + 3);
		if (arg10.aBoolean307) {
			Static287.aClass24_15.method8559(Static489.aClass282_12.method7135(local145) + arg0 + 5, arg2 + -12);
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)Lclient!hl;")
	public static Class142 method867(@OriginalArg(0) int arg0) {
		@Pc(10) Class142 local10 = (Class142) Static313.aClass102_34.method2677((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = aClass196_7.method5102(1, arg0);
		local10 = new Class142();
		local10.anInt4126 = arg0;
		if (local20 != null) {
			local10.method3656(new Class3_Sub3(local20));
		}
		local10.method3658();
		if (local10.anInt4112 == 2 && Static326.aClass280_26.method7107((long) arg0) == null) {
			Static326.aClass280_26.method7109(new Class3_Sub19(Static190.anInt3599), (long) arg0);
			Static314.aClass142Array1[Static190.anInt3599++] = local10;
		}
		Static313.aClass102_34.method2674((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(II)V")
	public static void method868(@OriginalArg(0) int arg0) {
		if (Static324.anInt8117 == 0) {
			Static594.aClass3_Sub7_Sub2_3.method2441(arg0);
		} else {
			Static141.anInt2838 = arg0;
		}
	}
}
