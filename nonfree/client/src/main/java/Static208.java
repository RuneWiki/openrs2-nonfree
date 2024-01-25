import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
	public static int anInt4361;

	@OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
	public static int anInt4355 = 0;

	@OriginalMember(owner = "client!nq", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString167 = "rating: ";

	@OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
	public static int anInt4358 = 0;

	@OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
	public static int anInt4363 = -1;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
	public static void method3730() {
		Static228.aClass37_75.method919();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IB)V")
	public static void method3731(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static263.method4739();
		} else if (arg0 == 2) {
			Static237.method4326();
		} else if (arg0 == 3) {
			Static153.method2683();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)Lclient!qn;")
	public static Class2 method3734() {
		try {
			return (Class2) Class.forName("Class2_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIZZI)Lclient!mj;")
	public static Class1_Sub26 method3735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub26 local7 = new Class1_Sub26();
		local7.anInt3825 = arg1;
		local7.anInt3826 = arg0;
		Static298.aClass207_35.method5552(local7, (long) arg3);
		Static19.method334(arg1);
		@Pc(36) Class163 local36 = Static248.method22(arg3);
		if (local36 != null) {
			Static340.method5639(local36);
		}
		if (Static50.aClass163_5 != null) {
			Static340.method5639(Static50.aClass163_5);
			Static50.aClass163_5 = null;
		}
		Static269.method4852();
		if (local36 != null) {
			Static154.method2689(local36, !arg2);
		}
		if (!arg2) {
			Static122.method1973(arg1);
		}
		if (!arg2 && Static129.anInt2569 != -1) {
			Static125.method2001(1, Static129.anInt2569);
		}
		return local7;
	}

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)I")
	public static int method3736() {
		return 2;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V")
	public static void method3737() {
		@Pc(5) Class37 local5 = Static114.aClass37_39;
		synchronized (Static114.aClass37_39) {
			Static114.aClass37_39.method920(5);
		}
		local5 = Static287.aClass37_91;
		synchronized (Static287.aClass37_91) {
			Static287.aClass37_91.method920(5);
		}
		local5 = Static211.aClass37_70;
		synchronized (Static211.aClass37_70) {
			Static211.aClass37_70.method920(5);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ic;)V")
	public static void method3738(@OriginalArg(0) Class1_Sub19_Sub1 arg0) {
		if (Static168.anInt3459 >= 255) {
			return;
		}
		Static174.aClass1_Sub19_Sub1Array4[Static168.anInt3459] = arg0;
		Static331.aBooleanArray18[Static168.anInt3459] = false;
		Static168.anInt3459++;
		@Pc(18) int local18 = arg0.anInt2490;
		if (arg0.aBoolean201) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt2490;
		if (arg0.aBoolean200) {
			local26 = Static132.anInt6773 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt2484 + 64 - arg0.anInt2479 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt2484 + arg0.anInt2479 - 64 >> 7;
			if (local66 >= Static3.anInt38) {
				local66 = Static3.anInt38 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray39[local38++];
				@Pc(96) int local96 = (arg0.anInt2482 + 64 - arg0.anInt2479 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static97.anInt1852) {
					local104 = Static97.anInt1852 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static87.anIntArrayArrayArray4[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static87.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static168.anInt3459;
					} else if ((local126 & 0xFF00) == 0) {
						Static87.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static168.anInt3459 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static87.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static168.anInt3459 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static87.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static168.anInt3459 << 24;
					}
				}
			}
		}
	}
}
