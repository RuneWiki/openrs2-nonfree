import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public static int anInt2610;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	public static int anInt2621;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public static int anInt2607 = 0;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	public static int anInt2617 = 2301979;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method2076(@OriginalArg(1) Class1_Sub11 arg0) {
		label85: while (true) {
			if (arg0.aByteArray47.length > arg0.anInt3264) {
				@Pc(13) boolean local13 = false;
				@Pc(15) int local15 = 0;
				@Pc(17) int local17 = 0;
				if (arg0.method2690() == 1) {
					local13 = true;
					local15 = arg0.method2690();
					local17 = arg0.method2690();
				}
				@Pc(38) int local38 = arg0.method2690();
				@Pc(42) int local42 = arg0.method2690();
				@Pc(49) int local49 = local38 * 64 - Static264.anInt5177;
				@Pc(60) int local60 = Static95.anInt2218 + Static254.anInt4979 - local42 * 64 - 1;
				@Pc(94) byte local94;
				@Pc(83) int local83;
				if (local49 >= 0 && local60 - 63 >= 0 && Static164.anInt3508 > local49 + 63 && Static95.anInt2218 > local60) {
					local83 = local49 >> 6;
					@Pc(116) int local116 = local60 >> 6;
					@Pc(118) int local118 = 0;
					while (true) {
						if (local118 >= 64) {
							continue label85;
						}
						for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
							if (!local13 || local118 >= local15 * 8 && local15 * 8 + 8 > local118 && local125 >= local17 * 8 && local125 < local17 * 8 + 8) {
								local94 = arg0.method2663();
								if (local94 != 0) {
									if (Static24.aByteArrayArrayArray22[local83][local116] == null) {
										Static24.aByteArrayArrayArray22[local83][local116] = new byte[4096];
									}
									Static24.aByteArrayArrayArray22[local83][local116][local118 + (63 - local125 << 6)] = local94;
									@Pc(211) byte local211 = arg0.method2663();
									if (Static267.aByteArrayArrayArray24[local83][local116] == null) {
										Static267.aByteArrayArrayArray24[local83][local116] = new byte[4096];
									}
									Static267.aByteArrayArrayArray24[local83][local116][(63 - local125 << 6) + local118] = local211;
								}
							}
						}
						local118++;
					}
				}
				local83 = 0;
				while (true) {
					if ((local13 ? 64 : 4096) <= local83) {
						continue label85;
					}
					local94 = arg0.method2663();
					if (local94 != 0) {
						arg0.anInt3264++;
					}
					local83++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
	public static int method2080(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!in;)V")
	public static void method2083(@OriginalArg(1) Class71 arg0) {
		@Pc(7) Class71 local7 = Static261.method4009(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static148.anInt3206;
			local13 = Static3.anInt122;
		} else {
			local13 = local7.anInt2722;
			local11 = local7.anInt2698;
		}
		Static202.method3259(local13, local11, false, arg0);
		Static7.method1805(local11, arg0, local13);
	}
}
