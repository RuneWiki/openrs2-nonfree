import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!sha", name = "Ib", descriptor = "Lclient!ae;")
	public static Class8 aClass8_125;

	@OriginalMember(owner = "client!sha", name = "o", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_308 = new Class179(116, 9);

	@OriginalMember(owner = "client!sha", name = "Xb", descriptor = "[I")
	public static final int[] anIntArray614 = new int[4];

	@OriginalMember(owner = "client!sha", name = "yd", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_128 = new Class289(78, -1);

	@OriginalMember(owner = "client!sha", name = "Ad", descriptor = "[Lclient!il;")
	public static final Class167[] aClass167Array1 = new Class167[8];

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
	public static void method7681() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static558.aClass277Array1[local7] = null;
		}
		Static339.anInt5859 = 0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
	public static void method7683(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		Static12.aString10 = arg0;
		Static633.aString140 = arg2;
		Static516.aBoolean595 = arg1;
		if (!Static516.aBoolean595 && (Static12.aString10.equals("") || Static633.aString140.equals(""))) {
			Static82.method1399(3);
			return;
		}
		Static84.aBoolean106 = false;
		if (Static560.anInt1380 != 1) {
			Static607.anInt9849 = 0;
			Static199.anInt3464 = -1;
		}
		Static82.method1399(-3);
		Static190.anInt3237 = 1;
		Static182.anInt3142 = 0;
		Static655.anInt10514 = 0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "([FFIFIIIIIII[F)V")
	public static void method7684(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10) {
		@Pc(5) int local5 = arg9 - arg4;
		@Pc(13) int local13 = arg5 - arg2;
		@Pc(17) int local17 = arg8 - arg7;
		@Pc(38) float local38 = arg10[2] * (float) local13 + arg10[1] * (float) local17 + arg10[0] * (float) local5;
		@Pc(59) float local59 = arg10[3] * (float) local5 + arg10[4] * (float) local17 + arg10[5] * (float) local13;
		@Pc(80) float local80 = arg10[6] * (float) local5 + (float) local17 * arg10[7] + (float) local13 * arg10[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local91 *= arg1;
		}
		@Pc(105) float local105 = arg3 + local59 + 0.5F;
		@Pc(118) float local118;
		if (arg6 == 1) {
			local118 = local91;
			local91 = -local105;
			local105 = local118;
		} else if (arg6 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg6 == 3) {
			local118 = local91;
			local91 = local105;
			local105 = -local118;
		}
		arg0[1] = local105;
		arg0[0] = local91;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZLclient!vt;ILjava/awt/Component;)Lclient!sh;")
	public static Class64 method7688(@OriginalArg(0) int arg0, @OriginalArg(2) Class380 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static328.anInt8868 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class64 local33 = (Class64) Class.forName("Class64_Sub1").getDeclaredConstructor().newInstance();
			local33.anInt1969 = arg0;
			local33.anIntArray115 = new int[(Static555.aBoolean676 ? 2 : 1) * 256];
			local33.method1733(arg3);
			local33.anInt1968 = (arg0 & 0xFFFFFC00) + 1024;
			if (local33.anInt1968 > 16384) {
				local33.anInt1968 = 16384;
			}
			local33.method1740(local33.anInt1968);
			if (Static555.anInt9293 > 0 && Static536.aClass69_1 == null) {
				Static536.aClass69_1 = new Class69();
				Static536.aClass69_1.aClass380_2 = arg1;
				arg1.method8815(Static536.aClass69_1, Static555.anInt9293);
			}
			if (Static536.aClass69_1 != null) {
				if (Static536.aClass69_1.aClass64Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static536.aClass69_1.aClass64Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(119) Class64_Sub2 local119 = new Class64_Sub2(arg1, arg2);
				local119.anInt1969 = arg0;
				local119.anIntArray115 = new int[(Static555.aBoolean676 ? 2 : 1) * 256];
				local119.method1733(arg3);
				local119.anInt1968 = 16384;
				local119.method1740(local119.anInt1968);
				if (Static555.anInt9293 > 0 && Static536.aClass69_1 == null) {
					Static536.aClass69_1 = new Class69();
					Static536.aClass69_1.aClass380_2 = arg1;
					arg1.method8815(Static536.aClass69_1, Static555.anInt9293);
				}
				if (Static536.aClass69_1 != null) {
					if (Static536.aClass69_1.aClass64Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static536.aClass69_1.aClass64Array1[arg2] = local119;
				}
				return local119;
			} catch (@Pc(181) Throwable local181) {
				return new Class64();
			}
		}
	}
}
