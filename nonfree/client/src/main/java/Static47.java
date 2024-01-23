import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
	public static boolean aBoolean71;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public static int anInt1046 = 0;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!da", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15 = new String[200];

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString39 = null;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	public static int anInt1049 = 0;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
	public static int[] anIntArray74 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V")
	public static void method745(@OriginalArg(0) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(13) byte local13;
		@Pc(15) byte[][] local15;
		if (Static116.aBoolean188 && arg0) {
			local15 = Static109.aByteArrayArray8;
			local13 = 1;
		} else {
			local13 = 4;
			local15 = Static177.aByteArrayArray7;
		}
		for (@Pc(27) int local27 = 0; local27 < local13; local27++) {
			Static16.method2745();
			for (@Pc(34) int local34 = 0; local34 < 13; local34++) {
				for (@Pc(39) int local39 = 0; local39 < 13; local39++) {
					@Pc(44) boolean local44 = false;
					@Pc(52) int local52 = Static4.anIntArrayArrayArray1[local27][local34][local39];
					if (local52 != -1) {
						@Pc(64) int local64 = local52 >> 24 & 0x3;
						if (!arg0 || local64 == 0) {
							@Pc(78) int local78 = local52 >> 1 & 0x3;
							@Pc(84) int local84 = local52 >> 14 & 0x3FF;
							@Pc(90) int local90 = local52 >> 3 & 0x7FF;
							@Pc(101) int local101 = (local84 / 8 << 8) + (local90 / 8);
							for (@Pc(103) int local103 = 0; local103 < Static13.anIntArray15.length; local103++) {
								if (Static13.anIntArray15[local103] == local101 && local15[local103] != null) {
									@Pc(140) int[] local140 = Static197.method3044(local27, local84, local34 * 8, local39 * 8, arg0, local90, local64, local15[local103], local78, Static159.aClass112Array1);
									if (local7 == null && local140 != null) {
										local7 = local140;
									}
									local44 = true;
									break;
								}
							}
						}
					}
					if (!local44) {
						Static182.method2786(local34 * 8, local27, 8, 8, local39 * 8);
					}
				}
			}
		}
		if (local7 == null) {
			Static181.anInt3564 = -1;
			return;
		}
		Static160.anInt3256 = local7[2];
		Static216.anInt4457 = local7[1];
		Static82.anInt1791 = local7[4];
		Static181.anInt3564 = local7[0];
		Static39.anInt857 = local7[3];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method746(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static282.method648(arg0, -1, arg2, arg1, null);
	}
}
