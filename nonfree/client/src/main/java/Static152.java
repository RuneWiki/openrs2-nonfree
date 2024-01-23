import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Lclient!ek;")
	public static Class42 aClass42_42;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
	public static int[] anIntArray342 = new int[1000];

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIILclient!ml;IJZ)Z")
	public static boolean method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static84.method1512(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!sb;IZLclient!aj;IIILclient!qj;)V")
	public static void method2797(@OriginalArg(0) Class2_Sub8_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub24 arg6) {
		@Pc(3) Class87 local3 = null;
		if (arg3.anInt169 == 0) {
			if ((double) Static250.aFloat32 == 3.0D) {
				local3 = Static31.aClass87_2;
			}
			if ((double) Static250.aFloat32 == 4.0D) {
				local3 = Static89.aClass87_4;
			}
			if ((double) Static250.aFloat32 == 6.0D) {
				local3 = Static279.aClass87_7;
			}
			if ((double) Static250.aFloat32 >= 8.0D) {
				local3 = Static73.aClass87_3;
			}
		} else if (arg3.anInt169 == 1) {
			if ((double) Static250.aFloat32 == 3.0D) {
				local3 = Static279.aClass87_7;
			}
			if ((double) Static250.aFloat32 == 4.0D) {
				local3 = Static73.aClass87_3;
			}
			if ((double) Static250.aFloat32 == 6.0D) {
				local3 = Static180.aClass87_5;
			}
			if ((double) Static250.aFloat32 >= 8.0D) {
				local3 = Static281.aClass87_8;
			}
		} else if (arg3.anInt169 == 2) {
			if ((double) Static250.aFloat32 == 3.0D) {
				local3 = Static180.aClass87_5;
			}
			if ((double) Static250.aFloat32 == 4.0D) {
				local3 = Static281.aClass87_8;
			}
			if ((double) Static250.aFloat32 == 6.0D) {
				local3 = Static256.aClass87_6;
			}
			if ((double) Static250.aFloat32 >= 8.0D) {
				local3 = Static13.aClass87_1;
			}
		}
		if (local3 == null) {
			return;
		}
		@Pc(116) int local116 = arg3.anInt147;
		if (arg0.aBoolean326 && arg3.anInt158 != -1) {
			local116 = arg3.anInt158;
		}
		@Pc(133) int local133 = Static92.aClass2_Sub8_Sub5_2.method1231(arg3.aString9, null, Static96.aStringArray18);
		@Pc(136) int local136 = arg0.anInt4976;
		if (arg2) {
			local136 -= local133 * local3.method2486() / 2;
		} else {
			local136 -= (local133 - 1) * local3.method2487() + arg1 + local3.method2486() / 2;
		}
		@Pc(172) int local172 = local136 - local3.method2486();
		local136 += local3.method2486() / 2;
		@Pc(181) int local181 = 0;
		@Pc(183) int local183;
		@Pc(211) int local211;
		for (local183 = 0; local183 < local133; local183++) {
			@Pc(190) String local190 = Static96.aStringArray18[local183];
			if (local133 - 1 > local183) {
				local190 = local190.substring(0, local190.length() - 4);
			}
			local211 = local3.method2478(local190);
			if (local211 > local181) {
				local181 = local211;
			}
		}
		arg6.anInt4673 = local172 + arg5;
		arg6.anInt4669 = arg0.anInt4973 + local181 / 2 + arg4;
		arg6.anInt4675 = arg0.anInt4973 + arg4 - local181 / 2;
		@Pc(253) int local253 = local172 + 2;
		arg6.anInt4677 = arg5 + local172 + local3.method2487() * local133;
		local183 = arg0.anInt4973 - local181 / 2 - 5;
		if (arg3.anInt163 != 0) {
			Static77.method1443(local183, local253, local181 + 10, local3.method2487() * local133 + local172 - local253 + 1, arg3.anInt163, arg3.anInt163 >>> 24);
		}
		if (arg3.anInt168 != 0) {
			Static77.method1454(local183, local253, local181 + 10, local172 + local133 * local3.method2487() - local253 + 1, arg3.anInt168, arg3.anInt168 >>> 24);
		}
		for (local211 = 0; local211 < local133; local211++) {
			@Pc(336) String local336 = Static96.aStringArray18[local211];
			if (local133 - 1 > local211) {
				local336 = local336.substring(0, local336.length() - 4);
			}
			@Pc(354) int local354 = local3.method2478(local336);
			if (local354 > local181) {
				local181 = local354;
			}
			local3.method2485(local336, arg0.anInt4973, local136, local116);
			local136 += local3.method2487();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)Lclient!eb;")
	public static Class2_Sub8_Sub6 method2798(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub8_Sub6 local8 = (Class2_Sub8_Sub6) Static159.aClass157_30.method4031((long) arg0);
		if (local8 != null) {
			return local8;
		}
		local8 = Static261.method4099(Static275.aClass42_95, arg0, Static203.aClass42_62);
		if (local8 != null) {
			Static159.aClass157_30.method4026((long) arg0, local8);
		}
		return local8;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)[F")
	public static float[] method2800() {
		@Pc(7) float local7 = Static235.method3804() + Static235.method3808();
		@Pc(9) int local9 = Static235.method3805();
		@Pc(24) float local24 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		Static180.aFloatArray9[3] = 1.0F;
		@Pc(37) float local37 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(39) float local39 = 0.58823526F;
		Static180.aFloatArray9[0] = local7 * local39 * Static18.aFloatArray1[0] * local37;
		@Pc(58) float local58 = (float) (local9 & 0xFF) / 255.0F;
		Static180.aFloatArray9[2] = local39 * local58 * Static18.aFloatArray1[2] * local7;
		Static180.aFloatArray9[1] = local24 * Static18.aFloatArray1[1] * local39 * local7;
		return Static180.aFloatArray9;
	}
}
