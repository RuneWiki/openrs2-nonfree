import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!st;")
	public static Class297 aClass297_5;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)Z")
	public static boolean method5920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static523.anInt9056; local1++) {
			@Pc(6) Class89 local6 = Static244.aClass89Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2214 == 1) {
				local15 = local6.anInt2225 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2218 + (local6.anInt2221 * local15 >> 8);
					local37 = local6.anInt2219 + (local6.anInt2223 * local15 >> 8);
					local47 = local6.anInt2229 + (local6.anInt2230 * local15 >> 8);
					local57 = local6.anInt2228 + (local6.anInt2226 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2214 == 2) {
				local15 = arg0 - local6.anInt2225;
				if (local15 > 0) {
					local27 = local6.anInt2218 + (local6.anInt2221 * local15 >> 8);
					local37 = local6.anInt2219 + (local6.anInt2223 * local15 >> 8);
					local47 = local6.anInt2229 + (local6.anInt2230 * local15 >> 8);
					local57 = local6.anInt2228 + (local6.anInt2226 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2214 == 3) {
				local15 = local6.anInt2218 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2225 + (local6.anInt2213 * local15 >> 8);
					local37 = local6.anInt2216 + (local6.anInt2231 * local15 >> 8);
					local47 = local6.anInt2229 + (local6.anInt2230 * local15 >> 8);
					local57 = local6.anInt2228 + (local6.anInt2226 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2214 == 4) {
				local15 = arg2 - local6.anInt2218;
				if (local15 > 0) {
					local27 = local6.anInt2225 + (local6.anInt2213 * local15 >> 8);
					local37 = local6.anInt2216 + (local6.anInt2231 * local15 >> 8);
					local47 = local6.anInt2229 + (local6.anInt2230 * local15 >> 8);
					local57 = local6.anInt2228 + (local6.anInt2226 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2214 == 5) {
				local15 = arg1 - local6.anInt2229;
				if (local15 > 0) {
					local27 = local6.anInt2225 + (local6.anInt2213 * local15 >> 8);
					local37 = local6.anInt2216 + (local6.anInt2231 * local15 >> 8);
					local47 = local6.anInt2218 + (local6.anInt2221 * local15 >> 8);
					local57 = local6.anInt2219 + (local6.anInt2223 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B[[[Lclient!hl;)V")
	public static void method5921(@OriginalArg(1) Class133[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class133[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class133 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass15_Sub3_2 instanceof Interface22) {
							((Interface22) local32.aClass15_Sub3_2).method7172();
						}
						if (local32.aClass15_Sub4_2 instanceof Interface22) {
							((Interface22) local32.aClass15_Sub4_2).method7172();
						}
						if (local32.aClass15_Sub4_1 instanceof Interface22) {
							((Interface22) local32.aClass15_Sub4_1).method7172();
						}
						if (local32.aClass15_Sub1_2 instanceof Interface22) {
							((Interface22) local32.aClass15_Sub1_2).method7172();
						}
						if (local32.aClass15_Sub1_1 instanceof Interface22) {
							((Interface22) local32.aClass15_Sub1_1).method7172();
						}
						for (@Pc(82) Class315 local82 = local32.aClass315_1; local82 != null; local82 = local82.aClass315_3) {
							@Pc(87) Class15_Sub2 local87 = local82.aClass15_Sub2_2;
							if (local87 instanceof Interface22) {
								((Interface22) local87).method7172();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)J")
	public static synchronized long method5922() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static157.aLong167) {
			Static114.aLong33 += Static157.aLong167 - local5;
		}
		Static157.aLong167 = local5;
		return local5 + Static114.aLong33;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!jr;B)Lclient!oh;")
	public static Class233 method5923(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(7) String local7 = arg0.method6040();
		@Pc(14) Class114 local14 = Static551.method7703()[arg0.method6019()];
		@Pc(21) Class72 local21 = Static574.method4158()[arg0.method6019()];
		@Pc(25) int local25 = arg0.method6023();
		@Pc(29) int local29 = arg0.method6023();
		@Pc(33) int local33 = arg0.method6015();
		@Pc(37) int local37 = arg0.method6015();
		return new Class233(local7, local14, local21, local25, local29, local33, local37);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class6_Sub44 local7 = null;
		for (@Pc(12) Class6_Sub44 local12 = (Class6_Sub44) Static24.aClass298_14.method6809(); local12 != null; local12 = (Class6_Sub44) Static24.aClass298_14.method6821()) {
			if (arg1 == local12.anInt8227 && local12.anInt8222 == arg0 && arg3 == local12.anInt8228 && arg4 == local12.anInt8230) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub44();
			local7.anInt8230 = arg4;
			local7.anInt8222 = arg0;
			local7.anInt8227 = arg1;
			local7.anInt8228 = arg3;
			if (arg0 >= 0 && arg3 >= 0 && arg0 < Static18.anInt5706 && Static80.anInt1367 > arg3) {
				Static305.method1619(local7);
			}
			Static24.aClass298_14.method6812(local7);
		}
		local7.anInt8225 = arg5;
		local7.anInt8231 = 0;
		local7.anInt8221 = -1;
		local7.anInt8232 = arg6;
		local7.anInt8223 = arg2;
	}
}
