import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "Lclient!gj;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
	public static int anInt1017;

	@OriginalMember(owner = "client!cj", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
	public static int anInt1018;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString5 = "";

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_37 = new Class217(87, 4);

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
	public static int anInt1013 = 0;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "[I")
	public static final int[] anIntArray72 = new int[250];

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_3 = new Class42();

	@OriginalMember(owner = "client!cj", name = "cb", descriptor = "[I")
	public static final int[] anIntArray73 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method981(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static204.method3760(0, arg5, arg4, arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method982(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 2);
		local8.method3480();
		local8.aString34 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static45.anIntArrayArrayArray32[arg0][local16][local20] == -Static339.anInt6001) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static153.anInt3177) + 1;
			@Pc(142) int local142 = (arg3 << Static153.anInt3177) + 2;
			@Pc(151) int local151 = Static258.aClass36Array2[arg0].method4431(arg1, arg3) + arg5;
			if (!Static158.method2988(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static153.anInt3177) - 1;
			if (!Static158.method2988(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static153.anInt3177) - 1;
			if (!Static158.method2988(local20, local151, local177)) {
				return false;
			} else if (Static158.method2988(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static368.method6084(arg0, arg1, arg3)) {
			local16 = arg1 << Static153.anInt3177;
			local20 = arg3 << Static153.anInt3177;
			return Static158.method2988(local16 + 1, Static258.aClass36Array2[arg0].method4431(arg1, arg3) + arg5, local20 + 1) && Static158.method2988(local16 + Static66.anInt1552 - 1, Static258.aClass36Array2[arg0].method4431(arg1 + 1, arg3) + arg5, local20 + 1) && Static158.method2988(local16 + Static66.anInt1552 - 1, Static258.aClass36Array2[arg0].method4431(arg1 + 1, arg3 + 1) + arg5, local20 + Static66.anInt1552 - 1) && Static158.method2988(local16 + 1, Static258.aClass36Array2[arg0].method4431(arg1, arg3 + 1) + arg5, local20 + Static66.anInt1552 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIZI)V")
	public static void method984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static177.method3442(arg1);
		@Pc(23) int local23 = 0;
		@Pc(28) int local28 = arg1 - arg0;
		if (local28 < 0) {
			local28 = 0;
		}
		@Pc(37) int local37 = arg1;
		@Pc(40) int local40 = -arg1;
		@Pc(42) int local42 = local28;
		@Pc(45) int local45 = -local28;
		@Pc(47) int local47 = -1;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(90) int local90;
		if (Static131.anInt2843 <= arg2 && arg2 <= Static38.anInt945) {
			@Pc(57) int[] local57 = Static43.anIntArrayArray57[arg2];
			local65 = Static11.method912(arg3 - arg1, Static122.anInt1360, Static93.anInt5014);
			local73 = Static11.method912(arg1 + arg3, Static122.anInt1360, Static93.anInt5014);
			local82 = Static11.method912(arg3 - local28, Static122.anInt1360, Static93.anInt5014);
			local90 = Static11.method912(local28 + arg3, Static122.anInt1360, Static93.anInt5014);
			Static367.method6081(arg4, local65, local57, local82);
			Static367.method6081(arg5, local82, local57, local90);
			Static367.method6081(arg4, local90, local57, local73);
		}
		@Pc(110) int local110 = -1;
		while (local23 < local37) {
			local47 += 2;
			local110 += 2;
			local45 += local110;
			local40 += local47;
			if (local45 >= 0 && local42 >= 1) {
				local42--;
				Static360.anIntArray510[local42] = local23;
				local45 -= local42 << 1;
			}
			local23++;
			@Pc(257) int local257;
			@Pc(266) int local266;
			@Pc(273) int[] local273;
			@Pc(158) int local158;
			if (local40 >= 0) {
				local37--;
				local40 -= local37 << 1;
				local158 = arg2 - local37;
				local65 = local37 + arg2;
				if (local65 >= Static131.anInt2843 && local158 <= Static38.anInt945) {
					if (local37 >= local28) {
						local73 = Static11.method912(arg3 + local23, Static122.anInt1360, Static93.anInt5014);
						local82 = Static11.method912(arg3 - local23, Static122.anInt1360, Static93.anInt5014);
						if (local65 <= Static38.anInt945) {
							Static367.method6081(arg4, local82, Static43.anIntArrayArray57[local65], local73);
						}
						if (local158 >= Static131.anInt2843) {
							Static367.method6081(arg4, local82, Static43.anIntArrayArray57[local158], local73);
						}
					} else {
						local73 = Static360.anIntArray510[local37];
						local82 = Static11.method912(local23 + arg3, Static122.anInt1360, Static93.anInt5014);
						local90 = Static11.method912(arg3 - local23, Static122.anInt1360, Static93.anInt5014);
						local257 = Static11.method912(local73 + arg3, Static122.anInt1360, Static93.anInt5014);
						local266 = Static11.method912(arg3 - local73, Static122.anInt1360, Static93.anInt5014);
						if (Static38.anInt945 >= local65) {
							local273 = Static43.anIntArrayArray57[local65];
							Static367.method6081(arg4, local90, local273, local266);
							Static367.method6081(arg5, local266, local273, local257);
							Static367.method6081(arg4, local257, local273, local82);
						}
						if (local158 >= Static131.anInt2843) {
							local273 = Static43.anIntArrayArray57[local158];
							Static367.method6081(arg4, local90, local273, local266);
							Static367.method6081(arg5, local266, local273, local257);
							Static367.method6081(arg4, local257, local273, local82);
						}
					}
				}
			}
			local158 = arg2 - local23;
			local65 = arg2 + local23;
			if (local65 >= Static131.anInt2843 && Static38.anInt945 >= local158) {
				local73 = arg3 + local37;
				local82 = arg3 - local37;
				if (local73 >= Static93.anInt5014 && local82 <= Static122.anInt1360) {
					local73 = Static11.method912(local73, Static122.anInt1360, Static93.anInt5014);
					local82 = Static11.method912(local82, Static122.anInt1360, Static93.anInt5014);
					if (local23 >= local28) {
						if (local65 <= Static38.anInt945) {
							Static367.method6081(arg4, local82, Static43.anIntArrayArray57[local65], local73);
						}
						if (Static131.anInt2843 <= local158) {
							Static367.method6081(arg4, local82, Static43.anIntArrayArray57[local158], local73);
						}
					} else {
						local90 = local42 >= local23 ? local42 : Static360.anIntArray510[local23];
						local257 = Static11.method912(local90 + arg3, Static122.anInt1360, Static93.anInt5014);
						local266 = Static11.method912(arg3 - local90, Static122.anInt1360, Static93.anInt5014);
						if (local65 <= Static38.anInt945) {
							local273 = Static43.anIntArrayArray57[local65];
							Static367.method6081(arg4, local82, local273, local266);
							Static367.method6081(arg5, local266, local273, local257);
							Static367.method6081(arg4, local257, local273, local73);
						}
						if (Static131.anInt2843 <= local158) {
							local273 = Static43.anIntArrayArray57[local158];
							Static367.method6081(arg4, local82, local273, local266);
							Static367.method6081(arg5, local266, local273, local257);
							Static367.method6081(arg4, local257, local273, local73);
						}
					}
				}
			}
		}
	}
}
