import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!dk;")
	public static Class1_Sub10 aClass1_Sub10_1 = new Class1_Sub10(0, 0);

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1324 = Static186.method3527("null");

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	public static int anInt4148 = 0;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	public static int anInt4150 = 5063219;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1325 = Static186.method3527("event_opbase");

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
	public static int anInt4153 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
	public static void method3273() {
		Static41.aClass84_17.method2577(5);
		Static182.aClass84_31.method2577(5);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)Lclient!qi;")
	public static Class94 method3274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1072; local13++) {
			@Pc(19) Class94 local19 = local7.aClass94Array1[local13];
			if ((local19.aLong143 >> 29 & 0x3L) == 2L && local19.anInt3686 == arg1 && local19.anInt3683 == arg2) {
				Static217.method3388(local19);
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([BB)[B")
	public static byte[] method3275(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static235.method866(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)V")
	public static void method3277() {
		@Pc(9) byte[][] local9 = Static6.aByteArrayArray1;
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static192.method3138();
			for (@Pc(21) int local21 = 0; local21 < 13; local21++) {
				for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
					@Pc(29) boolean local29 = false;
					@Pc(37) int local37 = Static7.anIntArrayArrayArray3[local15][local21][local25];
					if (local37 != -1) {
						@Pc(47) int local47 = local37 >> 24 & 0x3;
						@Pc(60) int local60 = local37 >> 1 & 0x3;
						@Pc(66) int local66 = local37 >> 14 & 0x3FF;
						@Pc(72) int local72 = local37 >> 3 & 0x7FF;
						@Pc(82) int local82 = local72 / 8 + (local66 / 8 << 8);
						for (@Pc(84) int local84 = 0; local84 < Static103.anIntArray197.length; local84++) {
							if (local82 == Static103.anIntArray197[local84] && local9[local84] != null) {
								local29 = true;
								Static139.method2307(local9[local84], local47, (local66 & 0x7) * 8, local25 * 8, local21 * 8, local15, (local72 & 0x7) * 8, Static22.aClass16Array1, local60);
								break;
							}
						}
					}
					if (!local29) {
						Static72.method1046(8, local21 * 8, 8, local25 * 8, local15);
					}
				}
			}
		}
	}
}
