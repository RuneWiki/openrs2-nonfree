import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public static int anInt3148;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	public static int anInt3149;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_860 = Static184.method2923("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt3150 = -1;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
	public static int anInt3153 = 0;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Lclient!i;")
	private static Class41 aClass41_861 = Static184.method2923("Create a free account");

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_862 = Static184.method2923("Cabbage");

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_863 = aClass41_861;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIILclient!u;I)V")
	public static void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class12_Sub3 arg3) {
		Static84.method1526(arg1, arg2, arg3.anInt3961, arg0, arg3.anInt3949);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIZII)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static17.anInt457 || Static45.anInt1337 > arg0) {
			return;
		}
		@Pc(33) boolean local33;
		if (Static60.anInt4779 > arg2) {
			local33 = false;
			arg2 = Static60.anInt4779;
		} else if (Static11.anInt385 >= arg2) {
			local33 = true;
		} else {
			arg2 = Static11.anInt385;
			local33 = false;
		}
		@Pc(56) boolean local56;
		if (arg4 < Static60.anInt4779) {
			arg4 = Static60.anInt4779;
			local56 = false;
		} else if (Static11.anInt385 >= arg4) {
			local56 = true;
		} else {
			arg4 = Static11.anInt385;
			local56 = false;
		}
		if (arg3 >= Static45.anInt1337) {
			Static204.method3147(arg2, arg1, arg4, Static3.anIntArrayArray1[arg3++]);
		} else {
			arg3 = Static45.anInt1337;
		}
		if (arg0 <= Static17.anInt457) {
			Static204.method3147(arg2, arg1, arg4, Static3.anIntArrayArray1[arg0--]);
		} else {
			arg0 = Static17.anInt457;
		}
		@Pc(117) int local117;
		if (local33 && local56) {
			for (local117 = arg3; local117 <= arg0; local117++) {
				@Pc(159) int[] local159 = Static3.anIntArrayArray1[local117];
				local159[arg2] = local159[arg4] = arg1;
			}
			return;
		}
		if (local33) {
			for (local117 = arg3; local117 <= arg0; local117++) {
				Static3.anIntArrayArray1[local117][arg2] = arg1;
			}
			return;
		}
		if (local56) {
			for (local117 = arg3; local117 <= arg0; local117++) {
				Static3.anIntArrayArray1[local117][arg4] = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BI)V")
	public static void method2161(@OriginalArg(0) byte[] arg0) {
		@Pc(3) int local3 = 0;
		while (true) {
			while (local3 < arg0.length) {
				@Pc(21) int local21 = (arg0[local3++] & 0xFF) * 64 - Static15.anInt422;
				@Pc(33) int local33 = (arg0[local3++] & 0xFF) * 64 - Static105.anInt2549;
				@Pc(82) byte local82;
				@Pc(61) int local61;
				if (local21 > 0 && local33 > 0 && Static95.anInt2353 > local21 + 64 && Static40.anInt1214 > local33 + 64) {
					local61 = local21 >> 6;
					@Pc(69) int local69 = Static40.anInt1214 - local33 - 1 >> 6;
					for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
						for (@Pc(75) int local75 = -64; local75 < 0; local75++) {
							local82 = arg0[local3++];
							if (local82 != 0) {
								if (Static6.aByteArrayArrayArray1[local61][local69] == null) {
									Static6.aByteArrayArrayArray1[local61][local69] = new byte[4096];
								}
								Static6.aByteArrayArrayArray1[local61][local69][local71 + (-(local75 + 1) << 6)] = local82;
								@Pc(117) byte local117 = arg0[local3++];
								if (Static84.aByteArrayArrayArray4[local61][local69] == null) {
									Static84.aByteArrayArrayArray4[local61][local69] = new byte[4096];
								}
								Static84.aByteArrayArrayArray4[local61][local69][(-(local75 + 1) << 6) + local71] = local117;
							}
						}
					}
				} else {
					for (local61 = -4096; local61 < 0; local61++) {
						local82 = arg0[local3++];
						if (local82 != 0) {
							local3++;
						}
					}
				}
			}
			return;
		}
	}
}
