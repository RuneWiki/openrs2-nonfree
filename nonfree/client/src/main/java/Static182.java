import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "[[Lclient!ne;")
	public static Class146[][] aClass146ArrayArray1;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	public static int anInt3769 = 0;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	public static int anInt3773 = 0;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	public static int anInt3775 = 2;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "S")
	public static short aShort55 = 32767;

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "Lclient!bn;")
	public static final Class25 aClass25_19 = new Class25(16);

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
	public static int anInt3778 = 0;

	@OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
	public static int anInt3784 = 0;

	@OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
	public static int anInt3785 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lclient!um;")
	public static Class1_Sub8 method3510(@OriginalArg(1) int arg0) {
		@Pc(7) Class126[] local7 = Class14_Sub25.aClass126Array1;
		synchronized (Class14_Sub25.aClass126Array1) {
			@Pc(27) Class1_Sub8 local27;
			if (arg0 >= Class14_Sub25.aClass126Array1.length || Class14_Sub25.aClass126Array1[arg0].method3396()) {
				local27 = new Class1_Sub8();
				local27.aClass1_Sub3Array1 = new Class1_Sub3[arg0];
				for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
					local27.aClass1_Sub3Array1[local33] = new Class1_Sub3();
				}
			} else {
				local27 = (Class1_Sub8) Class14_Sub25.aClass126Array1[arg0].method3399();
				local27.method5701();
				@Pc(66) int local66 = Static256.anIntArray443[arg0]--;
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!fn;ILclient!e;IIIII)V")
	public static void method3512(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Interface7 local11 = null;
		if (arg6 == 0) {
			local11 = (Interface7) Static242.method4277(arg5, arg1, arg4);
		}
		if (arg6 == 1) {
			local11 = (Interface7) Static216.method3896(arg5, arg1, arg4);
		}
		if (arg6 == 2) {
			local11 = (Interface7) Static263.method4514(arg5, arg1, arg4, up.class);
		}
		if (arg6 == 3) {
			local11 = (Interface7) Static274.method4660(arg5, arg1, arg4);
		}
		if (local11 == null) {
			return;
		}
		@Pc(65) int local65 = local11.method4066();
		@Pc(69) int local69 = local11.method4067();
		@Pc(75) Class59 local75 = Static232.method2200(local11.method4070());
		if (local75.method1969()) {
			Static31.method758(arg4, arg1, arg5, local75);
		}
		if (local11.method4069()) {
			local11.method4068(arg2);
		}
		if (arg6 != 0) {
			if (arg6 == 1) {
				Static1.method5705(arg5, arg1, arg4);
				return;
			}
			if (arg6 == 2) {
				Static84.method2077(arg5, arg1, arg4, up.class);
				if (local75.anInt1960 == 0 || local75.anInt1950 + arg1 >= Static195.anInt3965 || Static298.anInt5716 <= local75.anInt1950 + arg4 || Static195.anInt3965 <= local75.anInt1912 + arg1 || Static298.anInt5716 <= arg4 + local75.anInt1912) {
					return;
				}
				arg0.method2118(local75.aBoolean135, arg1, local75.anInt1912, local75.anInt1950, arg4, !local75.aBoolean132, local69);
			} else if (arg6 == 3) {
				Static164.method3266(arg5, arg1, arg4);
				if (local75.anInt1960 == 1) {
					arg0.method2133(arg1, arg4);
					return;
				}
			}
			return;
		}
		Static141.method2824(arg5, arg1, arg4);
		if (local75.anInt1960 != 0) {
			arg0.method2127(arg1, arg4, local69, local65, local75.aBoolean135, !local75.aBoolean132);
			return;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lclient!br;")
	public static Class14_Sub5 method3514() {
		if (Static241.aClass18_35 == null || Static50.aClass165_1 == null) {
			return null;
		}
		Static50.aClass165_1.method4351(Static241.aClass18_35);
		@Pc(23) Class14_Sub5 local23 = (Class14_Sub5) Static50.aClass165_1.method4354();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class52 local32 = Static247.method4306(local23.anInt725);
			return local32 != null && local32.aBoolean113 && local32.method1767() ? local23 : Static311.method5699();
		}
	}
}
