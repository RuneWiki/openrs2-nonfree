import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt3461;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public static int anInt3459 = 0;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	public static void method3159() {
		Static135.method2881(Static159.anInt3440);
		@Pc(17) int local17 = (Static240.anInt4829 >> 10) + (Static286.anInt6699 >> 3);
		@Pc(26) int local26 = (Static129.anInt3039 >> 10) + (Static136.anInt3193 >> 3);
		Static261.aByteArrayArray20 = new byte[18][];
		Static332.anIntArray490 = new int[18];
		Static224.aByteArrayArray18 = new byte[18][];
		Static65.aByteArrayArray4 = new byte[18][];
		Static189.anIntArray337 = new int[18];
		Static115.aByteArrayArray13 = new byte[18][];
		Static90.anIntArrayArray63 = new int[18][4];
		Static247.anIntArray418 = new int[18];
		Static184.anIntArray327 = new int[18];
		Static155.anIntArray297 = new int[18];
		Static83.anIntArray202 = new int[18];
		Static293.aByteArrayArray16 = new byte[18][];
		@Pc(73) int local73 = 0;
		@Pc(93) int local93;
		for (@Pc(82) int local82 = (local17 - (Static350.anInt6637 >> 4)) / 8; local82 <= ((Static350.anInt6637 >> 4) + local17) / 8; local82++) {
			for (local93 = (local26 - (Static105.anInt2647 >> 4)) / 8; local93 <= (local26 + (Static105.anInt2647 >> 4)) / 8; local93++) {
				@Pc(102) int local102 = (local82 << 8) + local93;
				Static155.anIntArray297[local73] = local102;
				Static247.anIntArray418[local73] = Static287.aClass193_77.method5066("m" + local82 + "_" + local93);
				Static83.anIntArray202[local73] = Static287.aClass193_77.method5066("l" + local82 + "_" + local93);
				Static189.anIntArray337[local73] = Static287.aClass193_77.method5066("n" + local82 + "_" + local93);
				Static332.anIntArray490[local73] = Static287.aClass193_77.method5066("um" + local82 + "_" + local93);
				Static184.anIntArray327[local73] = Static287.aClass193_77.method5066("ul" + local82 + "_" + local93);
				if (Static189.anIntArray337[local73] == -1) {
					Static247.anIntArray418[local73] = -1;
					Static83.anIntArray202[local73] = -1;
					Static332.anIntArray490[local73] = -1;
					Static184.anIntArray327[local73] = -1;
				}
				local73++;
			}
		}
		for (local93 = local73; local93 < Static189.anIntArray337.length; local93++) {
			Static189.anIntArray337[local93] = -1;
			Static247.anIntArray418[local93] = -1;
			Static83.anIntArray202[local93] = -1;
			Static332.anIntArray490[local93] = -1;
			Static184.anIntArray327[local93] = -1;
		}
		Static120.method2528(8, false, local26, local17, true, 0, 8);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)V")
	public static void method3160(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static77.aFloat23 = local7;
		if (Static353.anInt2640 == 2) {
			Static337.anInt6445 = local7;
			Static80.anInt2124 = 0;
			Static217.anInt4437 = local15;
		}
		Static106.aFloat31 = local15;
		Static212.method2560();
		Static73.aBoolean138 = true;
	}
}
