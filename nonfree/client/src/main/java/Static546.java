import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "[I")
	public static int[] anIntArray513;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	public static int anInt9446 = 0;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "Lclient!uh;")
	public static final Class342 aClass342_4 = new Class342();

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "[I")
	public static final int[] anIntArray514 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "[Lclient!oca;")
	public static final Class235[] aClass235Array1 = new Class235[37];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I")
	public static int method7688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static442.anIntArrayArray43 == null ? 0 : Static442.anIntArrayArray43[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V")
	public static void method7689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static469.aClass345_15.method8112(Static121.aClass84_24.method2710(Static372.anInt7083));
		@Pc(62) int local62;
		@Pc(28) int local28;
		if (Static577.aBoolean710) {
			for (@Pc(69) Class8_Sub5_Sub6 local69 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7327(); local69 != null; local69 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7326()) {
				if (local69.anInt3391 == 1) {
					local28 = Static170.method3366((Class8_Sub5_Sub7) local69.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66);
				} else {
					local28 = Static431.method6709(local69);
				}
				if (local28 > local15) {
					local15 = local28;
				}
			}
			local62 = Static156.anInt3931 * 16 + 21;
			local15 += 8;
			Static359.anInt6890 = (Static238.aBoolean398 ? 26 : 22) + Static156.anInt3931 * 16;
		} else {
			for (@Pc(22) Class8_Sub5_Sub7 local22 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local22 != null; local22 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
				local28 = Static170.method3366(local22);
				if (local15 < local28) {
					local15 = local28;
				}
			}
			Static359.anInt6890 = Static548.anInt9471 * 16 + (Static238.aBoolean398 ? 26 : 22);
			local15 += 8;
			local62 = Static548.anInt9471 * 16 + 21;
		}
		@Pc(131) int local131 = arg0 - local15 / 2;
		if (Static235.anInt5298 < local15 + local131) {
			local131 = Static235.anInt5298 - local15;
		}
		if (local131 < 0) {
			local131 = 0;
		}
		local28 = arg1;
		if (arg1 + local62 > Static313.anInt6355) {
			local28 = Static313.anInt6355 - local62;
		}
		if (local28 < 0) {
			local28 = 0;
		}
		Static465.anInt8462 = local131;
		Static122.anInt3308 = local28;
		Static306.anInt6216 = local15;
		Static211.aBoolean370 = true;
	}
}
