import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "[I")
	public static int[] anIntArray452;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Lclient!nm;")
	public static Class119 aClass119_73;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString138 = "Opened title screen";

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString139 = "glow3:";

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
	public static int anInt4028 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ph;Lclient!ph;)V")
	public static void method3488(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0.aClass1_Sub5_72 != null) {
			arg0.method4577();
		}
		arg0.aClass1_Sub5_73 = arg1.aClass1_Sub5_73;
		arg0.aClass1_Sub5_72 = arg1;
		arg0.aClass1_Sub5_72.aClass1_Sub5_73 = arg0;
		arg0.aClass1_Sub5_73.aClass1_Sub5_72 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!km;IIIII)V")
	public static void method3489(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static311.anInt5590) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static220.anInt4129) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static298.anInt5372 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class1_Sub16 local71 = Static254.aClass1_Sub16ArrayArrayArray3[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static280.anIntArrayArrayArray13[local17][local28][local39] + Static280.anIntArrayArrayArray13[local17][local28 + 1][local39] + Static280.anIntArrayArrayArray13[local17][local28][local39 + 1] + Static280.anIntArrayArrayArray13[local17][local28 + 1][local39 + 1]) / 4 - (Static280.anIntArrayArrayArray13[arg1][arg2][arg3] + Static280.anIntArrayArrayArray13[arg1][arg2 + 1][arg3] + Static280.anIntArrayArrayArray13[arg1][arg2][arg3 + 1] + Static280.anIntArrayArrayArray13[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class39 local161 = local71.aClass39_1;
									if (local161 != null) {
										if (local161.aClass11_4.method4301()) {
											arg0.method4296(local161.aClass11_4, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass11_3 != null && local161.aClass11_3.method4301()) {
											arg0.method4296(local161.aClass11_3, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt2573; local232++) {
										@Pc(241) Class45 local241 = local71.aClass45Array2[local232];
										if (local241 != null && local241.aClass11_5.method4301() && (local28 == local241.anInt1360 || local28 == local3) && (local39 == local241.anInt1359 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt1362 + 1 - local241.anInt1360;
											@Pc(278) int local278 = local241.anInt1355 + 1 - local241.anInt1359;
											arg0.method4296(local241.aClass11_5, (local241.anInt1360 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt1359 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
	public static void method3491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class16 local3 = Static311.method4642(arg1);
		@Pc(6) int local6 = local3.anInt535;
		@Pc(18) int local18 = local3.anInt538;
		@Pc(21) int local21 = local3.anInt539;
		@Pc(28) int local28 = Class110.anIntArray296[local21 - local18];
		if (arg0 < 0 || local28 < arg0) {
			arg0 = 0;
		}
		local28 <<= local18;
		Static213.method4575(local28 & arg0 << local18 | Static99.anIntArray148[local6] & ~local28, local6);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3492(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static100.method4620(arg0, "%0a", "\n"));
	}
}
