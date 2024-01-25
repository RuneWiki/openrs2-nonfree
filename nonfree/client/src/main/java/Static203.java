import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "[Lclient!kw;")
	public static Class178[] aClass178Array6;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public static int anInt3380 = -1;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_11 = new Class320(20);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3085(@OriginalArg(1) Class22 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static347.aBoolean360) {
			local7 = Static308.method4570();
			local9 = Static541.method7180();
		}
		arg0.KA(local7, local9, local7 + Static681.anInt10652, 350 - -local9);
		arg0.aa(local7, local9, Static681.anInt10652, 350, Static720.anInt11176 << 24 | 0x332277, 1);
		Static218.method3251(local9 + 350, local7, local7 + Static681.anInt10652, local9);
		@Pc(54) int local54 = 350 / Static269.anInt4155;
		@Pc(64) int local64;
		if (Static181.anInt3158 > 0) {
			local64 = 342 - Static269.anInt4155;
			@Pc(74) int local74 = local54 * local64 / (local54 + Static181.anInt3158 - 1);
			@Pc(76) int local76 = 4;
			if (Static181.anInt3158 > 1) {
				local76 = (local64 - local74) * (Static181.anInt3158 + (-1 - Static630.anInt9714)) / (Static181.anInt3158 - 1) + 4;
			}
			arg0.aa(local7 + Static681.anInt10652 - 16, local9 - -local76, 12, local74, Static720.anInt11176 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = Static630.anInt9714; Static630.anInt9714 + local54 > local118 && Static181.anInt3158 > local118; local118++) {
				@Pc(127) String[] local127 = Static104.method2099(Static547.aStringArray37[local118], '\b');
				@Pc(134) int local134 = (Static681.anInt10652 - 24) / local127.length;
				for (@Pc(136) int local136 = 0; local136 < local127.length; local136++) {
					@Pc(144) int local144 = local136 * local134 + 8;
					arg0.KA(local144 + local7, local9, local7 + local144 + local134 - 8, local9 - -350);
					Static480.aClass57_9.method9131(-16777216, local9 + 350 - (local118 - Static630.anInt9714) * Static269.anInt4155 - Static52.aClass169_1.anInt4042 - Static447.anInt6833 - 2, -1, local144 + local7, Static64.method1481(local127[local136]));
				}
			}
		}
		Static607.aClass57_12.method9134(local9 + 350 - 20, -16777216, local7 - (-Static681.anInt10652 + 25), "Build: 665", -1);
		if (12 != 12) {
			return;
		}
		arg0.KA(local7, local9, Static681.anInt10652 + local7, local9 + 350);
		arg0.method9402(Static681.anInt10652, local9 + 350 - Static447.anInt6833, -1, local7);
		Static561.aClass57_10.method9131(-16777216, local9 + 349 - Static677.aClass169_12.anInt4042, -1, local7 + 10, "--> " + Static64.method1481(Static689.aString129));
		if (!Static213.aBoolean221) {
			return;
		}
		local64 = -1;
		if (Static716.anInt11157 % 30 > 15) {
			local64 = 16777215;
		}
		arg0.method9330(Static677.aClass169_12.method3653("--> " + Static64.method1481(Static689.aString129).substring(0, Static685.anInt6069)) + local7 + 10, 12, local64, local9 + 350 - Static677.aClass169_12.anInt4042 - 11);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)I")
	public static int method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(17) int local17 = local7 >= 8 ? arg3 : arg0;
		@Pc(40) int local40 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg0 : arg1;
		return ((local7 & 0x1) == 0 ? local17 : -local17) + ((local7 & 0x2) == 0 ? local40 : -local40);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[B)Z")
	public static boolean method3087(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class3_Sub2 local15 = new Class3_Sub2(arg0);
		@Pc(19) int local19 = local15.method2048(255);
		if (local19 != 2) {
			return false;
		}
		@Pc(37) boolean local37 = local15.method2048(255) == 1;
		if (local37) {
			Static76.method1621(local15);
		}
		Static489.method9232(local15);
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method3088(@OriginalArg(0) Class22 arg0) {
		for (@Pc(6) Class9_Sub5 local6 = (Class9_Sub5) Static228.aClass319_15.method7195(); local6 != null; local6 = (Class9_Sub5) Static228.aClass319_15.method7188()) {
			if (local6.aBoolean437) {
				local6.method5573(arg0);
			}
		}
		if (82 <= 75) {
			aClass178Array6 = null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z[B)V")
	public static void method3090(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(arg0);
		while (true) {
			@Pc(21) int local21 = local10.method2048(255);
			if (local21 == 0) {
				return;
			}
			if (local21 == 1) {
				@Pc(36) int local36 = local10.method2028(-14795);
				if (Static480.anInt7532 == -1) {
					Static480.anInt7532 = local36;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Lclient!w;")
	public static Class3_Sub7_Sub21 method3091() {
		@Pc(10) Class3_Sub7_Sub21 local10 = (Class3_Sub7_Sub21) Static647.aClass147_13.method3334();
		if (local10 != null) {
			local10.method9596();
			local10.method9251();
			return local10;
		}
		@Pc(34) Class3_Sub7_Sub21 local34;
		do {
			local34 = (Class3_Sub7_Sub21) Static274.aClass147_4.method3334();
			if (local34 == null) {
				return null;
			}
			if (local34.method9258() > Static517.method6965()) {
				return null;
			}
			local34.method9596();
			local34.method9251();
		} while ((local34.aLong336 & Long.MIN_VALUE) == 0L);
		return local34;
	}
}
