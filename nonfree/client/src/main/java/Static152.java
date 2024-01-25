import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "Lclient!ct;")
	public static Class30 aClass30_43;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	public static int anInt3171;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "Lclient!ct;")
	public static Class30 aClass30_44;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "Lclient!ct;")
	public static Class30 aClass30_45;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "[S")
	public static final short[] aShortArray65 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)V")
	public static void method2914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static112.aClass21_72 = new Class21(arg1);
		Static104.aClass21_68 = new Class21(arg0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)Lclient!wl;")
	public static Class222 method2917(@OriginalArg(1) int arg0) {
		@Pc(5) Class21 local5 = Static29.aClass21_29;
		@Pc(14) Class222 local14;
		synchronized (Static29.aClass21_29) {
			local14 = (Class222) Static29.aClass21_29.method854((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static91.aClass30_111.method1161(arg0, 3);
		local14 = new Class222();
		if (local30 != null) {
			local14.method5988(new Class1_Sub7(local30));
		}
		@Pc(45) Class21 local45 = Static29.aClass21_29;
		synchronized (Static29.aClass21_29) {
			Static29.aClass21_29.method843(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZLjava/lang/String;Z)Z")
	public static boolean method2918(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local41 >= '0' && local41 <= '9') {
				local73 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local73 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local73 = local41 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local26) {
				local73 = -local73;
			}
			@Pc(112) int local112 = local30 * 10 + local73;
			if (local30 != local112 / 10) {
				return false;
			}
			local28 = true;
			local30 = local112;
		}
		return local28;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V")
	public static void method2919() {
		Static301.aClass21_154.method851();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!bf;Z)Z")
	public static boolean method2920(@OriginalArg(0) Class11_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static258.aClass36Array2 == Static200.aClass36Array4;
		@Pc(8) int local8 = 0;
		arg0.method5879();
		if (arg0.aShort94 < 0 || arg0.aShort93 < 0 || arg0.aShort92 >= Static300.anInt5778 || arg0.aShort91 >= Static354.anInt6714) {
			return false;
		}
		@Pc(34) int local34;
		for (@Pc(30) int local30 = arg0.aShort94; local30 <= arg0.aShort92; local30++) {
			for (local34 = arg0.aShort93; local34 <= arg0.aShort91; local34++) {
				@Pc(41) Class155 local41 = Static94.method2043(arg0.aByte79, local30, local34);
				if (local41 != null) {
					@Pc(45) int local45 = 0;
					if (local30 > arg0.aShort94) {
						local45++;
					}
					if (local30 < arg0.aShort92) {
						local45 += 4;
					}
					if (local34 > arg0.aShort93) {
						local45 += 8;
					}
					if (local34 < arg0.aShort91) {
						local45 += 2;
					}
					@Pc(70) Class187 local70 = Static125.method2623(arg0, local45);
					@Pc(73) Class187 local73 = local41.aClass187_2;
					if (local73 == null) {
						local41.aClass187_2 = local70;
					} else {
						while (local73.aClass187_3 != null) {
							local73 = local73.aClass187_3;
						}
						local73.aClass187_3 = local70;
					}
					local41.aByte35 = (byte) (local41.aByte35 | local45);
				}
				if (local6 && Static118.anIntArrayArray20[local30][local34] != 0) {
					local8 = Static118.anIntArrayArray20[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort94; local34 <= arg0.aShort92; local34++) {
				for (@Pc(130) int local130 = arg0.aShort93; local130 <= arg0.aShort91; local130++) {
					if (Static118.anIntArrayArray20[local34][local130] == 0) {
						Static118.anIntArrayArray20[local34][local130] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static144.aClass11_Sub2Array1[Static159.anInt3269++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void method2921() {
		Static193.aClass21_107.method844(5);
	}
}
