import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	public static int anInt5200;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "Lclient!ir;")
	public static Class100 aClass100_105;

	@OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
	public static int anInt5215;

	@OriginalMember(owner = "client!qr", name = "Hb", descriptor = "I")
	public static int anInt5250;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "[Lclient!cm;")
	public static final Class36[] aClass36Array1 = new Class36[29];

	@OriginalMember(owner = "client!qr", name = "V", descriptor = "I")
	public static int anInt5226 = 0;

	@OriginalMember(owner = "client!qr", name = "db", descriptor = "Ljava/lang/String;")
	public static final String aString186 = "glow2:";

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (Static19.anInt533 <= arg7 && Static4.anInt75 >= arg7 && arg5 >= Static19.anInt533 && Static4.anInt75 >= arg5 && arg1 >= Static19.anInt533 && Static4.anInt75 >= arg1 && arg6 >= Static19.anInt533 && arg6 <= Static4.anInt75 && arg4 >= Static236.anInt4721 && Static73.anInt1425 >= arg4 && arg0 >= Static236.anInt4721 && arg0 <= Static73.anInt1425 && Static236.anInt4721 <= arg8 && Static73.anInt1425 >= arg8 && Static236.anInt4721 <= arg3 && arg3 <= Static73.anInt1425) {
			Static307.method5177(arg5, arg8, arg4, arg2, arg1, arg6, arg0, arg3, arg7);
		} else {
			Static105.method1782(arg6, arg1, arg4, arg0, arg2, arg8, arg3, arg5, arg7);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4403(@OriginalArg(1) String arg0) {
		return Static41.method727(10, arg0);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!de;)V")
	public static void method4409(@OriginalArg(1) Class42 arg0) {
		@Pc(14) Class39 local14 = null;
		try {
			@Pc(18) Class207 local18 = arg0.method964();
			while (local18.anInt6346 == 0) {
				Static134.method2241(1L);
			}
			if (local18.anInt6346 == 1) {
				local14 = (Class39) local18.anObject7;
				@Pc(37) Class3_Sub4 local37 = Static167.method2701();
				local14.method902(local37.anInt4268, 0, local37.aByteArray70);
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			if (local14 != null) {
				local14.method903();
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!sf;IILclient!tj;Lclient!sj;III)V")
	public static void method4411(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class122 arg4, @OriginalArg(5) Class181 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class211 local15 = Static136.method2268(arg2);
		if (local15 == null || !local15.aBoolean440 || !local15.method5562()) {
			return;
		}
		@Pc(34) int local34;
		if (local15.anIntArray555 != null) {
			@Pc(32) int[] local32 = new int[local15.anIntArray555.length];
			@Pc(48) int local48;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (anInt5200 == 4) {
					local48 = (int) Static57.aFloat3 & 0x3FFF;
				} else {
					local48 = (int) Static57.aFloat3 + Static42.anInt892 & 0x3FFF;
				}
				@Pc(59) int local59 = Class19.anIntArray20[local48];
				@Pc(63) int local63 = Class19.anIntArray21[local48];
				if (anInt5200 != 4) {
					local59 = local59 * 256 / (Static12.anInt309 + 256);
					local63 = local63 * 256 / (Static12.anInt309 + 256);
				}
				local32[local34 * 2] = (local63 * (arg6 + local15.anIntArray555[local34 * 2] * 4) + local59 * (local15.anIntArray555[local34 * 2 + 1] * 4 + arg0) >> 15) + arg7 + arg5.anInt5704 / 2;
				local32[local34 * 2 + 1] = arg3 + arg5.anInt5721 / 2 - (-(local59 * (local15.anIntArray555[local34 * 2] * 4 + arg6)) + (local15.anIntArray555[local34 * 2 + 1] * 4 + arg0) * local63 >> 15);
			}
			Static326.method5322(arg4, local32, local15.anInt6606, arg5.anIntArray466, arg5.anIntArray457);
			for (local48 = 0; local48 < local32.length / 2 - 1; local48++) {
				arg4.method4782(local32[local48 * 2], local32[local48 * 2 + 1], local32[local48 * 2 + 2], local32[(local48 + 1) * 2 + 1], local15.anInt6611, arg1, arg7, arg3);
			}
			arg4.method4782(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local15.anInt6611, arg1, arg7, arg3);
		}
		@Pc(269) Class57 local269 = null;
		if (local15.anInt6612 != -1) {
			local269 = local15.method5567(false, arg4);
			if (local269 != null) {
				Static47.method811(arg5, arg3, arg7, local269, arg0, arg6, arg1);
			}
		}
		if (local15.aString250 == null) {
			return;
		}
		local34 = 0;
		if (local269 != null) {
			local34 = local269.method5447();
		}
		@Pc(302) Class120 local302 = Static232.aClass120_5;
		@Pc(304) Class209 local304 = Static82.aClass209_1;
		if (local15.anInt6593 == 1) {
			local302 = Static83.aClass120_1;
			local304 = Static303.aClass209_9;
		}
		if (local15.anInt6593 == 2) {
			local302 = Static243.aClass120_6;
			local304 = Static191.aClass209_6;
		}
		Static336.method5503(arg0, arg5, local15.aString250, local304, local302, local15.anInt6588, arg6, arg7, arg3, local34, arg1);
		return;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!tj;ILclient!sj;)V")
	public static void method4412(@OriginalArg(0) Class122 arg0, @OriginalArg(2) Class181 arg1) {
		Static273.method4609(arg0, 0, arg1, 0);
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)Lclient!rr;")
	public static Class58_Sub1 method4413() {
		return Static302.aClass58_Sub1Array2.length > Static260.anInt5196 ? Static302.aClass58_Sub1Array2[Static260.anInt5196++] : null;
	}
}
