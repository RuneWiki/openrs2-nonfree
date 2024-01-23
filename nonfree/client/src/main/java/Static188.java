import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "Lclient!i;")
	public static Class41 aClass41_1142 = Static184.method2923("::tele 0)1");

	@OriginalMember(owner = "client!te", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_1143 = Static184.method2923("sl_flags");

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_1144 = Static184.method2923("m");

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array68 = new Class41[100];

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "Lclient!i;")
	public static Class41 aClass41_1145 = Static184.method2923("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II[Lclient!ia;III[BZIII)V")
	public static void method2995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(11) int local11 = -1;
		@Pc(16) Class2_Sub3 local16 = new Class2_Sub3(arg5);
		while (true) {
			@Pc(20) int local20 = local16.method194();
			if (local20 == 0) {
				return;
			}
			@Pc(24) int local24 = 0;
			local11 += local20;
			while (true) {
				@Pc(32) int local32 = local16.method212();
				if (local32 == 0) {
					break;
				}
				local24 += local32 - 1;
				@Pc(46) int local46 = local24 >> 6 & 0x3F;
				@Pc(50) int local50 = local24 & 0x3F;
				@Pc(54) int local54 = local24 >> 12;
				@Pc(58) int local58 = local16.method209();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (arg6 == local54 && arg1 <= local46 && local46 < arg1 + 8 && arg3 <= local50 && local50 < arg3 + 8) {
					@Pc(101) Class2_Sub2_Sub14 local101 = Static168.method2705(local11);
					@Pc(118) int local118 = Static62.method1150(local101.anInt3040, arg0, local50 & 0x7, local46 & 0x7, local101.anInt3050, local66) + arg8;
					@Pc(135) int local135 = Static95.method1653(local50 & 0x7, local46 & 0x7, local66, local101.anInt3050, local101.anInt3040, arg0) + arg7;
					if (local118 > 0 && local135 > 0 && local118 < 103 && local135 < 103) {
						@Pc(149) Class42 local149 = null;
						@Pc(153) int local153 = arg4;
						if ((Static102.aByteArrayArrayArray7[1][local118][local135] & 0x2) == 2) {
							local153 = arg4 - 1;
						}
						if (local153 >= 0) {
							local149 = arg2[local153];
						}
						Static198.method3079(true, arg4, arg0 + local66 & 0x3, local62, Static217.aBoolean290, local11, arg4, local149, local135, local118);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBIZ)V")
	public static void method2997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static187.method2974(arg1)) {
			Static140.method2216(arg0, arg3, -1, arg2, Static68.aClass80ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BILclient!nb;)Z")
	public static boolean method2999(@OriginalArg(1) int arg0, @OriginalArg(2) Class15 arg1) {
		@Pc(8) byte[] local8 = arg1.method406(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static216.method3293(local8);
			return true;
		}
	}
}
