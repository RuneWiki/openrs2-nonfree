import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
	public static int anInt1383;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	public static int anInt1379 = 0;

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public static void method1130() {
		Static259.anInt5240 = 0;
		Static280.anInt5624 = 0;
		Static221.anInt4695 = 0;
		Static273.aByte24 = 0;
		Static240.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!jh;I)I")
	public static int method1133(@OriginalArg(0) Class2_Sub4_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt2863;
		@Pc(13) Class91 local13 = arg0.method2095();
		if (arg0.anInt2820 == local13.anInt3138) {
			local9 = arg0.anInt2872;
		} else if (local13.anInt3125 == arg0.anInt2820 || arg0.anInt2820 == local13.anInt3130 || local13.anInt3132 == arg0.anInt2820 || local13.anInt3155 == arg0.anInt2820) {
			local9 = arg0.anInt2864;
		} else if (arg0.anInt2820 == local13.anInt3134 || local13.anInt3131 == arg0.anInt2820 || arg0.anInt2820 == local13.anInt3147 || arg0.anInt2820 == local13.anInt3148) {
			local9 = arg0.anInt2873;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
	public static void method1134() {
		Static173.aClass89_24.method2266();
		Static135.aClass89_17.method2266();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!jn;Lclient!wg;ZIILclient!mf;BI)V")
	public static void method1135(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) Class1_Sub31 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class107 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class27 local12 = null;
		if (arg5.anInt3784 == 0) {
			if ((double) Static268.aFloat34 == 3.0D) {
				local12 = Static121.aClass27_11;
			}
			if ((double) Static268.aFloat34 == 4.0D) {
				local12 = Static197.aClass27_26;
			}
			if ((double) Static268.aFloat34 == 6.0D) {
				local12 = Static176.aClass27_22;
			}
			if ((double) Static268.aFloat34 >= 8.0D) {
				local12 = Static168.aClass27_20;
			}
		} else if (arg5.anInt3784 == 1) {
			if ((double) Static268.aFloat34 == 3.0D) {
				local12 = Static176.aClass27_22;
			}
			if ((double) Static268.aFloat34 == 4.0D) {
				local12 = Static168.aClass27_20;
			}
			if ((double) Static268.aFloat34 == 6.0D) {
				local12 = Static145.aClass27_42;
			}
			if ((double) Static268.aFloat34 >= 8.0D) {
				local12 = Static209.aClass27_30;
			}
		} else if (arg5.anInt3784 == 2) {
			if ((double) Static268.aFloat34 == 3.0D) {
				local12 = Static145.aClass27_42;
			}
			if ((double) Static268.aFloat34 == 4.0D) {
				local12 = Static209.aClass27_30;
			}
			if ((double) Static268.aFloat34 == 6.0D) {
				local12 = Static176.aClass27_23;
			}
			if ((double) Static268.aFloat34 >= 8.0D) {
				local12 = Static252.aClass27_35;
			}
		}
		if (local12 == null) {
			return;
		}
		@Pc(120) int local120 = 0;
		@Pc(123) int local123 = arg5.anInt3773;
		if (arg0.aBoolean192 && arg5.anInt3795 != -1) {
			local123 = arg5.anInt3795;
		}
		@Pc(143) int local143 = Static160.aClass1_Sub3_Sub5_1.method3515(arg5.aString237, null, Static27.aStringArray35);
		@Pc(146) int local146 = arg0.anInt3109;
		if (arg2) {
			local146 -= local12.method685() * local143 / 2;
		} else {
			local146 -= arg6 + (local143 - 1) * local12.method687() + local12.method685() / 2;
		}
		@Pc(181) int local181 = local146 - local12.method685();
		local146 += local12.method685() / 2;
		@Pc(190) int local190;
		@Pc(223) int local223;
		for (local190 = 0; local190 < local143; local190++) {
			@Pc(201) String local201 = Static27.aStringArray35[local190];
			if (local143 - 1 > local190) {
				local201 = local201.substring(0, local201.length() - 4);
			}
			local223 = local12.method678(local201);
			if (local120 < local223) {
				local120 = local223;
			}
		}
		arg1.anInt6197 = local181 + arg3;
		arg1.anInt6185 = arg4 + arg0.anInt3106 - local120 / 2;
		arg1.anInt6187 = local120 / 2 + arg0.anInt3106 + arg4;
		arg1.anInt6189 = local181 + local143 * local12.method687() + arg3;
		@Pc(278) int local278 = local181 + 2;
		local190 = arg0.anInt3106 - local120 / 2 - 5;
		if (arg5.anInt3766 != 0) {
			Static231.method3650(local190, local278, local120 + 10, local181 + 1 - (-(local143 * local12.method687()) + local278), arg5.anInt3766, arg5.anInt3766 >>> 24);
		}
		if (arg5.anInt3770 != 0) {
			Static231.method3623(local190, local278, local120 + 10, -local278 + 1 + local181 - -(local143 * local12.method687()), arg5.anInt3770, arg5.anInt3770 >>> 24);
		}
		for (local223 = 0; local223 < local143; local223++) {
			@Pc(359) String local359 = Static27.aStringArray35[local223];
			if (local223 < local143 - 1) {
				local359 = local359.substring(0, local359.length() - 4);
			}
			@Pc(381) int local381 = local12.method678(local359);
			local12.method682(local359, arg0.anInt3106, local146, local123);
			if (local381 > local120) {
				local120 = local381;
			}
			local146 += local12.method687();
		}
	}
}
