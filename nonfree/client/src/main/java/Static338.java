import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "Lclient!ud;")
	public static Class198 aClass198_3;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "Lclient!tc;")
	public static Class91 aClass91_10;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "Lclient!wf;")
	public static final Class215 aClass215_7 = new Class215(128);

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	public static int anInt3906 = 0;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!lm;Lclient!gk;Lclient!en;)V")
	public static void method3590(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class5_Sub18 arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(10) Class54 local10 = arg0.method3308(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5577();
		if (local10.method5565() > local16) {
			local16 = local10.method5565();
		}
		@Pc(32) int local32 = arg1.anInt2291;
		@Pc(35) int local35 = arg1.anInt2297;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(57) int local57;
		@Pc(84) int local84;
		if (arg0.aString211 != null) {
			local37 = Static65.aClass138_3.method3729(null, arg0.aString211, Static122.aStringArray14, null);
			for (local57 = 0; local57 < local37; local57++) {
				@Pc(63) String local63 = Static122.aStringArray14[local57];
				if (local57 < local37 - 1) {
					local63 = local63.substring(0, local63.length() - 4);
				}
				local84 = Static228.aClass75_8.method2162(local63);
				if (local39 < local84) {
					local39 = local84;
				}
			}
			local41 = local37 * Static228.aClass75_8.method2158() + Static228.aClass75_8.method2160() / 2;
		}
		local57 = arg1.anInt2291 + local16 / 2;
		@Pc(123) int local123 = arg1.anInt2297;
		if (local32 < local16 + Static186.anInt6006) {
			local57 = local16 / 2 + Static186.anInt6006 + local39 / 2 + 10 + 5;
			local32 = Static186.anInt6006;
		} else if (Static186.anInt6013 - local16 < local32) {
			local57 = Static186.anInt6013 - local39 / 2 - local16 / 2 - 10 - 5;
			local32 = Static186.anInt6013 - local16;
		}
		if (local16 + Static186.anInt6009 > local35) {
			local123 = local16 / 2 + Static186.anInt6009 + 10;
			local35 = Static186.anInt6009;
		} else if (local35 > Static186.anInt6014 - local16) {
			local123 = Static186.anInt6014 - local41 - local16 / 2 - 10;
			local35 = Static186.anInt6014 - local16;
		}
		local84 = (int) (Math.atan2((double) (local32 - arg1.anInt2291), (double) (local35 - arg1.anInt2297)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5579((float) local32 + (float) local16 / 2.0F, (float) local35 + (float) local16 / 2.0F, 4096, local84);
		@Pc(266) int local266 = -2;
		@Pc(268) int local268 = -2;
		@Pc(270) int local270 = -2;
		@Pc(272) int local272 = -2;
		if (arg0.aString211 != null) {
			local268 = local123;
			local266 = local57 - local39 / 2 - 5;
			local270 = local39 + local266 + 10;
			local272 = local123 + Static228.aClass75_8.method2158() * local37 + 3;
			if (arg0.anInt3582 != 0) {
				arg2.method4835(local123, local266, local272 - local123, local270 - local266, arg0.anInt3582);
			}
			if (arg0.anInt3571 != 0) {
				arg2.method4830(arg0.anInt3571, local123, local266, local272 - local123, -local266 + local270);
			}
			for (@Pc(346) int local346 = 0; local346 < local37; local346++) {
				@Pc(352) String local352 = Static122.aStringArray14[local346];
				if (local37 - 1 > local346) {
					local352 = local352.substring(0, local352.length() - 4);
				}
				Static228.aClass75_8.method2161(arg2, local352, local57, local123, arg0.anInt3580);
				local123 += Static228.aClass75_8.method2158();
			}
		}
		local16 >>= 0x1;
		if ((local32 - local16 >= Static270.anInt5171 || local16 + local32 <= Static270.anInt5171 || local35 - local16 >= Static274.anInt5378 || Static274.anInt5378 >= local35 + local16) && (Static270.anInt5171 <= local266 || Static270.anInt5171 >= local270 || Static274.anInt5378 <= local268 || Static274.anInt5378 >= local272)) {
			return;
		}
		if (arg0.aStringArray24[4] != null) {
			Static345.method5684(1006, arg0.aStringArray24[4], arg0.aString210, -1, 0, 0, (long) arg1.anInt2293);
		}
		if (arg0.aStringArray24[3] != null) {
			Static345.method5684(1003, arg0.aStringArray24[3], arg0.aString210, -1, 0, 0, (long) arg1.anInt2293);
		}
		if (arg0.aStringArray24[2] != null) {
			Static345.method5684(1008, arg0.aStringArray24[2], arg0.aString210, -1, 0, 0, (long) arg1.anInt2293);
		}
		if (arg0.aStringArray24[1] != null) {
			Static345.method5684(1010, arg0.aStringArray24[1], arg0.aString210, -1, 0, 0, (long) arg1.anInt2293);
		}
		if (arg0.aStringArray24[0] != null) {
			Static345.method5684(1011, arg0.aStringArray24[0], arg0.aString210, -1, 0, 0, (long) arg1.anInt2293);
			return;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ra;Lclient!en;Z)V")
	public static void method3594(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class59 arg1) {
		@Pc(10) Class37[] local10 = Static360.method918(arg0, Static319.anInt6051);
		Static323.aClass54Array24 = new Class54[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static323.aClass54Array24[local16] = arg1.method4872(local10[local16]);
		}
		local10 = Static360.method918(arg0, Static298.anInt5726);
		Static50.aClass54Array5 = new Class54[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static50.aClass54Array5[local47] = arg1.method4872(local10[local47]);
		}
		local10 = Static360.method918(arg0, Static40.anInt987);
		Static112.aClass54Array13 = new Class54[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static112.aClass54Array13[local74] = arg1.method4872(local10[local74]);
		}
		local10 = Static360.method918(arg0, Static81.anInt1955);
		Static288.aClass54Array22 = new Class54[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static288.aClass54Array22[local101] = arg1.method4872(local10[local101]);
		}
		local10 = Static360.method918(arg0, Static125.anInt2609);
		Static29.aClass54Array2 = new Class54[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static29.aClass54Array2[local132] = arg1.method4872(local10[local132]);
		}
		local10 = Static360.method918(arg0, Static137.anInt2337);
		Static148.aClass54Array15 = new Class54[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static148.aClass54Array15[local163] = arg1.method4872(local10[local163]);
		}
		local10 = Static360.method918(arg0, Static190.anInt3778);
		Static109.aClass54Array12 = new Class54[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static109.aClass54Array12[local194] = arg1.method4872(local10[local194]);
		}
		local10 = Static360.method918(arg0, Static192.anInt3800);
		Static160.aClass54Array16 = new Class54[local10.length];
		for (@Pc(225) int local225 = 0; local225 < local10.length; local225++) {
			Static160.aClass54Array16[local225] = arg1.method4872(local10[local225]);
		}
		local10 = Static360.method918(arg0, Static241.anInt4685);
		Static98.aClass54Array9 = new Class54[local10.length];
		for (@Pc(257) int local257 = 0; local257 < local10.length; local257++) {
			Static98.aClass54Array9[local257] = arg1.method4872(local10[local257]);
		}
		local10 = Static360.method918(arg0, Static293.anInt5620);
		Static260.aClass54Array25 = new Class54[local10.length];
		for (@Pc(288) int local288 = 0; local288 < local10.length; local288++) {
			Static260.aClass54Array25[local288] = arg1.method4872(local10[local288]);
		}
		local10 = Static360.method918(arg0, Static177.anInt2357);
		Static225.aClass54Array17 = new Class54[local10.length];
		for (@Pc(315) int local315 = 0; local315 < local10.length; local315++) {
			Static225.aClass54Array17[local315] = arg1.method4872(local10[local315]);
		}
		local10 = Static360.method918(arg0, Static334.anInt6311);
		Static29.aClass54Array1 = new Class54[local10.length];
		for (@Pc(346) int local346 = 0; local346 < local10.length; local346++) {
			Static29.aClass54Array1[local346] = arg1.method4872(local10[local346]);
		}
		local10 = Static360.method918(arg0, Static204.anInt3947);
		Static32.aClass54Array3 = new Class54[local10.length];
		for (@Pc(377) int local377 = 0; local377 < local10.length; local377++) {
			Static32.aClass54Array3[local377] = arg1.method4872(local10[local377]);
		}
		Static29.aClass54_1 = arg1.method4872(Static360.method907(arg0, Static12.anInt373, 0));
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BILclient!bk;)Ljava/lang/String;")
	public static String method3596(@OriginalArg(2) Class5_Sub1 arg0) {
		try {
			@Pc(7) int local7 = arg0.method1866();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt2029 += Static105.aClass110_1.method3004(local15, arg0.anInt2029, local7, arg0.aByteArray18, 0);
			return Static326.method5503(local15, local7, 0);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}
}
