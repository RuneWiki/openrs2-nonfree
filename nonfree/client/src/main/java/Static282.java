import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jha", name = "V", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_123 = new Class251(52, 3);

	@OriginalMember(owner = "client!jha", name = "O", descriptor = "Lclient!ke;")
	public static final Class199 aClass199_6 = new Class199();

	@OriginalMember(owner = "client!jha", name = "Q", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_17 = new Class125(64);

	@OriginalMember(owner = "client!jha", name = "K", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_149 = new Class160(16, 1);

	@OriginalMember(owner = "client!jha", name = "N", descriptor = "Z")
	public static boolean aBoolean384 = true;

	@OriginalMember(owner = "client!jha", name = "P", descriptor = "Lclient!mda;")
	public static final Class231 aClass231_5 = new Class231();

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILclient!bh;Lclient!rg;Lclient!eba;Lclient!rg;Lclient!rg;)Z")
	public static boolean method4745(@OriginalArg(1) Class37 arg0, @OriginalArg(2) Class310 arg1, @OriginalArg(3) Class14_Sub1_Sub3 arg2, @OriginalArg(4) Class310 arg3, @OriginalArg(5) Class310 arg4) {
		Static472.aClass14_Sub1_Sub3_3 = arg2;
		Static267.aClass310_59 = arg4;
		Static354.aClass37_2 = arg0;
		Static497.aClass310_100 = arg1;
		Static127.aClass310_138 = arg3;
		Static269.anIntArray561 = new int[16];
		for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
			Static269.anIntArray561[local18] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZB)Z")
	public static boolean method4746(@OriginalArg(0) boolean arg0) {
		@Pc(19) boolean local19 = Static103.aClass144_3.method6898();
		if (local19 == arg0) {
			return true;
		}
		if (!arg0) {
			Static103.aClass144_3.method6916();
		} else if (!Static103.aClass144_3.method6892()) {
			arg0 = false;
		}
		if (arg0 == local19) {
			return false;
		} else {
			Static181.aClass14_Sub26_9.method5270(arg0 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub23_1);
			Static574.method8188();
			return true;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZII)Z")
	public static boolean method4747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static218.method3768(arg0, arg1) | Static221.method3810(arg0, arg1) | Static24.method368(arg0, arg1)) & Static512.method9099(arg0, arg1);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIIII)I")
	public static int method4749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class141.anIntArray208[arg0 * 8192 / arg3] >> 1;
		return (arg1 * (65536 - local15) >> 16) + (arg2 * local15 >> 16);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!gba;IILclient!ha;II)V")
	public static void method4750(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class144 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class146 local9 = Static94.aClass334_3.method8127(arg0.anInt2993);
		if (local9.anInt3728 == -1) {
			return;
		}
		if (arg0.aBoolean207) {
			@Pc(24) int local24 = arg2 + arg0.anInt2983;
			arg2 = local24 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(39) Class45 local39 = local9.method3249(arg2, arg0.aBoolean205, arg3);
		if (local39 == null) {
			return;
		}
		@Pc(46) int local46 = arg0.anInt2959;
		@Pc(49) int local49 = arg0.anInt2975;
		if ((arg2 & 0x1) == 1) {
			local49 = arg0.anInt2959;
			local46 = arg0.anInt2975;
		}
		@Pc(65) int local65 = local39.method7508();
		@Pc(68) int local68 = local39.method7504();
		if (local9.aBoolean271) {
			local68 = local49 * 4;
			local65 = local46 * 4;
		}
		if (local9.anInt3722 == 0) {
			local39.method7502(arg1, arg4 - (local49 - 1) * 4, local65, local68);
		} else {
			local39.method7493(arg1, arg4 + 4 - local49 * 4, local65, local68, 0, local9.anInt3722 | 0xFF000000, 1);
		}
	}
}
