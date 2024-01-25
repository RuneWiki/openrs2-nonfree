import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	public static int anInt1015;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	public static int anInt1017;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!s;")
	public static final Class180 aClass180_1 = new Class180();

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Lclient!dp;B)V")
	public static void method884(@OriginalArg(0) Class53 arg0) {
		Static316.aClass53_144 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!bn;IZIILclient!pi;Lclient!ja;ILclient!ja;ZBI)Lclient!of;")
	public static Class40 method885(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class30 arg5, @OriginalArg(6) Class81 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class81 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(15) Class40 local15 = Static71.method1267(arg3, arg10, arg4, arg8, arg7, arg0, arg1);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class147 local23 = Static211.method3762(arg4);
		@Pc(35) int local35;
		if (arg7 > 1 && local23.anIntArray464 != null) {
			@Pc(33) int local33 = -1;
			for (local35 = 0; local35 < 10; local35++) {
				if (local23.anIntArray466[local35] <= arg7 && local23.anIntArray466[local35] != 0) {
					local33 = local23.anIntArray464[local35];
				}
			}
			if (local33 != -1) {
				local23 = Static211.method3762(local33);
			}
		}
		@Pc(71) Class57 local71 = Static287.method4917(local23.anInt3962, Static223.aClass53_104);
		if (local71 == null) {
			return null;
		}
		if (local23.aShortArray71 != null) {
			for (local35 = 0; local35 < local23.aShortArray71.length; local35++) {
				if (local23.aByteArray66 == null || local23.aByteArray66.length <= local35) {
					local71.method1142(local23.aShortArray71[local35], local23.aShortArray74[local35]);
				} else {
					local71.method1142(local23.aShortArray71[local35], Static289.aShortArray110[local23.aByteArray66[local35] & 0xFF]);
				}
			}
		}
		if (local23.aShortArray73 != null) {
			for (local35 = 0; local35 < local23.aShortArray73.length; local35++) {
				local71.method1143(local23.aShortArray72[local35], local23.aShortArray73[local35]);
			}
		}
		if (arg0 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				if (arg0.anIntArray61[local35] < Static263.aShortArrayArray46[local35].length) {
					local71.method1142(Static318.aShortArray113[local35], Static263.aShortArrayArray46[local35][arg0.anIntArray61[local35]]);
				}
				if (arg0.anIntArray61[local35] < Static191.aShortArrayArray32[local35].length) {
					local71.method1142(Static230.aShortArray76[local35], Static191.aShortArrayArray32[local35][arg0.anIntArray61[local35]]);
				}
			}
		}
		@Pc(214) short local214 = 1024;
		@Pc(216) boolean local216 = false;
		if (local23.anInt3971 != 128 || local23.anInt3965 != 128 || local23.anInt3949 != 128) {
			local214 = 1031;
			local216 = true;
		}
		@Pc(251) Class78 local251 = arg6.method3016(local71, local214, 0, local23.anInt3961 + 64, 768 - -local23.anInt3988);
		if (local216) {
			local251.method4657(local23.anInt3971, local23.anInt3965, local23.anInt3949);
		}
		@Pc(263) Class40 local263 = null;
		if (local23.anInt3940 != -1) {
			local263 = method885(arg0, 0, true, 0, local23.anInt3952, arg5, arg6, 10, arg8, true, 1);
			if (local263 == null) {
				return null;
			}
		} else if (local23.anInt3999 != -1) {
			local263 = method885(arg0, arg1, false, 0, local23.anInt3973, arg5, arg6, arg7, arg8, true, arg10);
			if (local263 == null) {
				return null;
			}
		}
		@Pc(313) int local313 = local23.anInt3950;
		arg6.method2985(16, 16, 512, 512);
		if (arg2) {
			local313 = (int) ((double) local313 * 1.5D);
		} else if (arg10 == 2) {
			local313 = (int) ((double) local313 * 1.04D);
		}
		@Pc(343) Class72 local343 = arg6.method3029();
		local343.method4071();
		arg6.method2954(local343);
		arg6.method2980(1.0F);
		arg6.method2993(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(362) Class72 local362 = arg6.method2990();
		local362.method4072(-local23.anInt3957 << 3);
		local362.method4074(local23.anInt3941 << 3);
		local362.method4068(local23.anInt3944, (Class207.anIntArray697[local23.anInt3959 << 3] * local313 >> 15) + local23.anInt4000 - (local251.method4639() / 2), (Class207.anIntArray698[local23.anInt3959 << 3] * local313 >> 15) + local23.anInt4000);
		local362.method4082(local23.anInt3959 << 3);
		@Pc(421) int local421 = arg6.method3025();
		@Pc(424) int local424 = arg6.method2983();
		arg6.method3019(50, Integer.MAX_VALUE);
		arg6.method3023();
		arg6.method3032();
		arg6.method2962(0, 0, 36, 32, 0, 0);
		if (!local251.method4632()) {
			return null;
		}
		local251.method4649(local362, null, 1);
		arg6.method3019(local421, local424);
		@Pc(461) int[] local461 = arg6.method2976();
		if (arg10 >= 1) {
			local461 = Static134.method2597(-16777215, local461);
			if (arg10 >= 2) {
				local461 = Static134.method2597(-1, local461);
			}
		}
		if (arg1 != 0) {
			Static135.method5226(local461, arg1);
		}
		arg6.method2996(local461, 36, 36, 32).method5077(0, 0);
		if (local23.anInt3940 != -1) {
			local263.method5077(0, 0);
		} else if (local23.anInt3999 != -1) {
			local263.method5077(0, 0);
		}
		if (arg3 == 1 || arg3 == 2 && (local23.anInt3997 == 1 || arg7 != 1) && arg7 != -1) {
			arg5.method5340(9, -256, -16777215, Static348.method5738(arg7), 0);
		}
		local461 = arg6.method2976();
		for (@Pc(561) int local561 = 0; local561 < local461.length; local561++) {
			if ((local461[local561] & 0xFFFFFF) == 0) {
				local461[local561] = 0;
			} else {
				local461[local561] |= 0xFF000000;
			}
		}
		@Pc(602) Class40 local602;
		if (arg9) {
			local602 = arg6.method2996(local461, 36, 36, 32);
		} else {
			local602 = arg8.method2996(local461, 36, 36, 32);
		}
		if (!arg9) {
			@Pc(618) Class202 local618 = new Class202();
			local618.anInt5942 = arg8.anInt2815;
			local618.anInt5943 = arg3;
			local618.anInt5937 = arg4;
			local618.anInt5940 = arg1;
			local618.anInt5941 = arg7;
			local618.anInt5936 = arg10;
			local618.aBoolean398 = arg0 != null;
			Static270.aClass137_1.method3629(local618, local602);
		}
		return local602;
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
	public static void method886() {
		Static17.aClass70_107.method1399();
	}
}
