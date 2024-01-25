import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
	public static int anInt1917;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	public static int anInt1918;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient!qo;")
	public static final Class3_Sub40 aClass3_Sub40_1 = new Class3_Sub40(0, 0);

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "J")
	public static long aLong44 = -1L;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	public static int anInt1921 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZII)V")
	public static void method1846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static224.aClass315_11.method7572(Static287.aClass176_24.method4986(Static380.anInt7247));
		@Pc(54) int local54;
		@Pc(26) int local26;
		if (Static506.aBoolean755) {
			for (@Pc(62) Class3_Sub1_Sub10 local62 = (Class3_Sub1_Sub10) Static379.aClass30_9.method780(); local62 != null; local62 = (Class3_Sub1_Sub10) Static379.aClass30_9.method783()) {
				if (local62.anInt5812 == 1) {
					local26 = Static390.method6146((Class3_Sub1_Sub4) local62.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66);
				} else {
					local26 = Static12.method177(local62);
				}
				if (local26 > local13) {
					local13 = local26;
				}
			}
			local54 = Static462.anInt8390 * 16 + 21;
			local13 += 8;
			Static554.anInt9455 = (Static599.aBoolean832 ? 26 : 22) + Static462.anInt8390 * 16;
		} else {
			for (@Pc(20) Class3_Sub1_Sub4 local20 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local20 != null; local20 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
				local26 = Static390.method6146(local20);
				if (local26 > local13) {
					local13 = local26;
				}
			}
			Static554.anInt9455 = Static443.anInt8026 * 16 + (Static599.aBoolean832 ? 26 : 22);
			local54 = Static443.anInt8026 * 16 + 21;
			local13 += 8;
		}
		@Pc(127) int local127 = arg1 - local13 / 2;
		if (Static114.anInt2970 < local13 + local127) {
			local127 = Static114.anInt2970 - local13;
		}
		if (local127 < 0) {
			local127 = 0;
		}
		local26 = arg0;
		if (Static256.anInt5669 < local54 + arg0) {
			local26 = Static256.anInt5669 - local54;
		}
		if (local26 < 0) {
			local26 = 0;
		}
		Static326.anInt6543 = local127;
		Static434.anInt7939 = local26;
		Static433.aBoolean672 = true;
		Static582.anInt9731 = local13;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZI)Z")
	public static boolean method1847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(45) int local45 = Static426.aShort104 + local7 * (Static604.aShort118 - Static426.aShort104) / 100;
		Static467.anInt8440 = Static467.anInt8439 * local45 >> 8;
		@Pc(57) int local57 = local45 * arg1 >> 8;
		@Pc(63) int local63 = 16384 - arg5 & 0x3FFF;
		@Pc(70) int local70 = 16384 - arg6 & 0x3FFF;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		@Pc(76) int local76 = local57;
		if (local63 != 0) {
			local74 = -local57 * Class3_Sub1_Sub2.anIntArray84[local63] >> 14;
			local76 = local57 * Class3_Sub1_Sub2.anIntArray85[local63] >> 14;
		}
		if (local70 != 0) {
			local72 = local76 * Class3_Sub1_Sub2.anIntArray84[local70] >> 14;
			local76 = local76 * Class3_Sub1_Sub2.anIntArray85[local70] >> 14;
		}
		Static136.anInt3505 = 0;
		Static299.anInt8877 = arg5;
		Static641.anInt10516 = arg0 - local74;
		Static289.anInt5908 = arg4 - local76;
		Static465.anInt8425 = arg2 - local72;
		Static166.anInt3989 = arg6;
	}
}
