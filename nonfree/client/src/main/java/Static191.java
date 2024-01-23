import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!oi", name = "Z", descriptor = "[[[Lclient!kb;")
	public static Class1_Sub19[][][] aClass1_Sub19ArrayArrayArray2;

	@OriginalMember(owner = "client!oi", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString130 = null;

	@OriginalMember(owner = "client!oi", name = "T", descriptor = "Lclient!cd;")
	public static Class22 aClass22_15 = new Class22(16);

	@OriginalMember(owner = "client!oi", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString131 = "K";

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
	public static boolean method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static149.anInt2777; local1++) {
			@Pc(8) Class114 local8 = Static174.aClass114Array2[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt3063 == 1) {
				local17 = local8.anInt3042 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt3044 + (local8.anInt3052 * local17 >> 8);
					local39 = local8.anInt3062 + (local8.anInt3066 * local17 >> 8);
					local49 = local8.anInt3058 + (local8.anInt3051 * local17 >> 8);
					local59 = local8.anInt3045 + (local8.anInt3061 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt3063 == 2) {
				local17 = arg0 - local8.anInt3042;
				if (local17 > 0) {
					local29 = local8.anInt3044 + (local8.anInt3052 * local17 >> 8);
					local39 = local8.anInt3062 + (local8.anInt3066 * local17 >> 8);
					local49 = local8.anInt3058 + (local8.anInt3051 * local17 >> 8);
					local59 = local8.anInt3045 + (local8.anInt3061 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt3063 == 3) {
				local17 = local8.anInt3044 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt3042 + (local8.anInt3057 * local17 >> 8);
					local39 = local8.anInt3055 + (local8.anInt3053 * local17 >> 8);
					local49 = local8.anInt3058 + (local8.anInt3051 * local17 >> 8);
					local59 = local8.anInt3045 + (local8.anInt3061 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt3063 == 4) {
				local17 = arg2 - local8.anInt3044;
				if (local17 > 0) {
					local29 = local8.anInt3042 + (local8.anInt3057 * local17 >> 8);
					local39 = local8.anInt3055 + (local8.anInt3053 * local17 >> 8);
					local49 = local8.anInt3058 + (local8.anInt3051 * local17 >> 8);
					local59 = local8.anInt3045 + (local8.anInt3061 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt3063 == 5) {
				local17 = arg1 - local8.anInt3058;
				if (local17 > 0) {
					local29 = local8.anInt3042 + (local8.anInt3057 * local17 >> 8);
					local39 = local8.anInt3055 + (local8.anInt3053 * local17 >> 8);
					local49 = local8.anInt3044 + (local8.anInt3052 * local17 >> 8);
					local59 = local8.anInt3062 + (local8.anInt3066 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!pl;)V")
	public static void method2912(@OriginalArg(1) Class1_Sub24 arg0) {
		@Pc(1) long local1 = 0L;
		if (arg0.anInt4110 == 0) {
			local1 = Static291.method4472(arg0.anInt4104, arg0.anInt4112, arg0.anInt4100);
		}
		if (arg0.anInt4110 == 1) {
			local1 = Static101.method1647(arg0.anInt4104, arg0.anInt4112, arg0.anInt4100);
		}
		@Pc(31) int local31 = -1;
		if (arg0.anInt4110 == 2) {
			local1 = Static242.method3841(arg0.anInt4104, arg0.anInt4112, arg0.anInt4100);
		}
		if (arg0.anInt4110 == 3) {
			local1 = Static287.method4359(arg0.anInt4104, arg0.anInt4112, arg0.anInt4100);
		}
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = 0;
		if (local1 != (long) 0) {
			local62 = (int) local1 >> 14 & 0x1F;
			local64 = (int) local1 >> 20 & 0x3;
			local31 = (int) (local1 >>> 32) & Integer.MAX_VALUE;
		}
		arg0.anInt4105 = local31;
		arg0.anInt4111 = local64;
		arg0.anInt4116 = local62;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2913(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static147.anInt2712; local11++) {
			if (arg0.equalsIgnoreCase(Static147.aStringArray12[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZIII)I")
	public static int method2914(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static39.aClass22_2.method633((long) arg2);
		if (local12 == null) {
			return 0;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local12.anIntArray235.length; local26++) {
			if (local12.anIntArray235[local26] >= 0 && local12.anIntArray235[local26] < Static54.anInt1155) {
				@Pc(56) Class120 local56 = Static183.method4458(local12.anIntArray235[local26]);
				if (local56.aClass22_14 != null) {
					@Pc(68) Class1_Sub30 local68 = (Class1_Sub30) local56.aClass22_14.method633((long) arg1);
					if (local68 != null) {
						if (arg0) {
							local24 += local12.anIntArray234[local26] * local68.anInt5344;
						} else {
							local24 += local68.anInt5344;
						}
					}
				}
			}
		}
		return local24;
	}
}
