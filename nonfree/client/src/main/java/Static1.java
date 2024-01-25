import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
	public static final int[] anIntArray504 = new int[14];

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_43 = new Class293(10);

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString102 = "";

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILclient!ha;IIBLclient!li;IIII)V")
	public static void method5722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class5_Sub4_Sub14 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 < arg9 && arg8 + arg2 > arg9 && arg1 - 13 < arg7 && arg1 + 3 > arg7 && arg6.aBoolean475) {
			arg4 = arg5;
		}
		@Pc(36) int[] local36 = null;
		if (Static40.method723(arg6.anInt5598)) {
			local36 = Static479.aClass348_1.method8197((int) arg6.aLong165).anIntArray697;
		} else if (arg6.anInt5600 != -1) {
			local36 = Static479.aClass348_1.method8197(arg6.anInt5600).anIntArray697;
		} else if (Static453.method6733(arg6.anInt5598)) {
			@Pc(68) Class5_Sub13 local68 = (Class5_Sub13) Static51.aClass81_11.method1599((long) (int) arg6.aLong165);
			if (local68 != null) {
				@Pc(73) Class14_Sub1_Sub1_Sub3_Sub2 local73 = local68.aClass14_Sub1_Sub1_Sub3_Sub2_1;
				@Pc(76) Class271 local76 = local73.aClass271_1;
				if (local76.anIntArray591 != null) {
					local76 = local76.method6476(Static564.aClass304_1);
				}
				if (local76 != null) {
					local36 = local76.anIntArray589;
				}
			}
		} else if (Static488.method7158(arg6.anInt5598)) {
			@Pc(110) Class283 local110;
			if (arg6.anInt5598 == 1009) {
				local110 = Static525.aClass371_4.method8554((int) arg6.aLong165);
			} else {
				local110 = Static525.aClass371_4.method8554((int) (arg6.aLong165 >>> 32 & 0x7FFFFFFFL));
			}
			if (local110.anIntArray623 != null) {
				local110 = local110.method6858(Static564.aClass304_1);
			}
			if (local110 != null) {
				local36 = local110.anIntArray621;
			}
		}
		@Pc(147) String local147 = Static172.method2653(arg6);
		if (local36 != null) {
			local147 = local147 + Static605.method8431(local36);
		}
		Static471.aClass6_12.method7219(Static394.anIntArray545, arg4, local147, arg2 + 3, arg1, Static158.aClass44Array7);
		if (arg6.aBoolean474) {
			Static493.aClass44_21.method5312(arg2 + Static457.aClass298_11.method6965(local147) + 5, arg1 + -12);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method5723() {
		@Pc(10) Class293 local10 = Static15.aClass293_5;
		synchronized (Static15.aClass293_5) {
			Static15.aClass293_5.method6930();
		}
		local10 = Static214.aClass293_26;
		synchronized (Static214.aClass293_26) {
			Static214.aClass293_26.method6930();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([Ljava/lang/Object;I[JIB)V")
	public static void method5724(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg1; local56 < arg3; local56++) {
			if ((long) (local56 & local54) + local20 > arg2[local56]) {
				@Pc(73) long local73 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16] = local73;
				@Pc(87) Object local87 = arg0[local56];
				arg0[local56] = arg0[local16];
				arg0[local16++] = local87;
			}
		}
		arg2[arg3] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method5724(arg0, arg1, arg2, local16 - 1);
		method5724(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Z")
	public static boolean method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!fb;")
	public static Class14_Sub1_Sub1 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class66 local14 = local7.aClass66_2; local14 != null; local14 = local14.aClass66_1) {
			@Pc(18) Class14_Sub1_Sub1 local18 = local14.aClass14_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort74 == arg1 && local18.aShort71 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method5728() {
		if (Static211.aClass248ArrayArray1 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static211.aClass248ArrayArray1.length; local17++) {
			for (@Pc(21) int local21 = 0; local21 < Static211.aClass248ArrayArray1[local17].length; local21++) {
				Static211.aClass248ArrayArray1[local17][local21] = Static235.aClass248_1;
			}
		}
	}
}
