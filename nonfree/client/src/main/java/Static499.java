import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_168 = new Class151(127, 9);

	@OriginalMember(owner = "client!qq", name = "mb", descriptor = "Z")
	public static boolean aBoolean608 = false;

	@OriginalMember(owner = "client!qq", name = "Ab", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_55 = new Class352(50);

	@OriginalMember(owner = "client!qq", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray536 = new int[3];

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII)V")
	public static void method6749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 != 8 && arg2 != 16) {
			@Pc(167) Class73 local167 = Static267.aClass73ArrayArrayArray2[arg3][arg0][arg4];
			if (local167 == null) {
				local167 = new Class73(arg3);
			}
			if (arg2 == 1) {
				local167.aShort33 = (short) arg1;
				local167.aShort32 = (short) arg5;
			} else if (arg2 == 2) {
				local167.aShort35 = (short) arg5;
				local167.aShort34 = (short) arg1;
			}
			if (Static558.aBoolean670) {
				Static121.method2176();
			}
			return;
		}
		@Pc(23) int local23;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(56) int local56;
		if (arg2 != 8) {
			local23 = Static63.anInt1356 + (arg0 << Static273.anInt4424);
			local28 = local23 - Static63.anInt1356;
			local32 = arg4 << Static273.anInt4424;
			local36 = local32 + Static63.anInt1356;
			local44 = Static655.aClass42Array5[arg3].method7450(arg4, arg0 + 1);
			local56 = Static655.aClass42Array5[arg3].method7450(arg4 + 1, arg0);
			Static649.aClass292Array157[Static1.anInt6849++] = new Class292(arg2, arg3, local23, local28, local28, local23, local44, local56, local56 - arg5, -arg5 + local44, local32, local36, local36, local32);
			return;
		}
		local23 = arg0 << Static273.anInt4424;
		local28 = local23 + Static63.anInt1356;
		local32 = arg4 << Static273.anInt4424;
		local36 = Static63.anInt1356 + local32;
		local44 = Static655.aClass42Array5[arg3].method7450(arg4, arg0);
		local56 = Static655.aClass42Array5[arg3].method7450(arg4 + 1, arg0 + 1);
		Static649.aClass292Array157[Static1.anInt6849++] = new Class292(arg2, arg3, local23, local28, local28, local23, local44, local56, local56 - arg5, -arg5 + local44, local32, local36, local36, local32);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIILclient!uea;)V")
	public static void method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub48 arg3) {
		arg3.aClass4_Sub11_Sub1_2.method8860(arg2);
		arg3.aClass4_Sub11_Sub1_2.method8876(arg1);
		arg3.aClass4_Sub11_Sub1_2.method8891(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!gda;)V")
	public static void method6774(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class3_Sub1 local7 = null;
			for (@Pc(11) Class3_Sub1 local11 = Static114.aClass3_Sub1Array1[local4]; local11 != null; local11 = local11.aClass3_Sub1_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static114.aClass3_Sub1Array1[local4] = local11.aClass3_Sub1_23;
					} else {
						local7.aClass3_Sub1_23 = local11.aClass3_Sub1_23;
					}
					Static42.aBoolean73 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class3_Sub1 local43 = Static506.aClass3_Sub1Array3[local4]; local43 != null; local43 = local43.aClass3_Sub1_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static506.aClass3_Sub1Array3[local4] = local43.aClass3_Sub1_23;
					} else {
						local7.aClass3_Sub1_23 = local43.aClass3_Sub1_23;
					}
					Static42.aBoolean73 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class3_Sub1 local75 = Static596.aClass3_Sub1Array4[local4]; local75 != null; local75 = local75.aClass3_Sub1_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static596.aClass3_Sub1Array4[local4] = local75.aClass3_Sub1_23;
					} else {
						local7.aClass3_Sub1_23 = local75.aClass3_Sub1_23;
					}
					Static42.aBoolean73 = true;
					return;
				}
				local7 = local75;
			}
		}
	}
}
