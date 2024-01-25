import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt375 = -1;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[S")
	public static final short[] aShortArray1 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIILclient!ah;)V")
	public static void method341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub1 arg4) {
		@Pc(4) Class75 local4 = Static371.method4772(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt4921 = (arg1 << Static145.anInt2581) + Static390.anInt7654;
		arg4.anInt4917 = arg3;
		arg4.anInt4916 = (arg2 << Static145.anInt2581) + Static390.anInt7654;
		for (@Pc(28) Class251 local28 = local4.aClass251_2; local28 != null; local28 = local28.aClass251_3) {
			if (local28.aClass8_Sub3_2.aBoolean518) {
				@Pc(38) int local38 = local28.aClass8_Sub3_2.method5882();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt4917 += local8;
			arg4.aBoolean360 = true;
		}
		local4.aClass8_Sub1_1 = arg4;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIB)V")
	public static void method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = Static413.aClass49_Sub1_1.anInt3203 * arg2 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static417.method5641(Static268.aClass211_65, local6, arg1);
			Static26.aBoolean37 = true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method343() {
		Static18.aClass95Array1 = null;
		Static23.aClass95_23 = null;
		Static283.aClass123_6 = null;
		Static69.aClass95Array7 = null;
		Static112.aClass95Array5 = null;
		Static378.aClass123_7 = null;
		Static359.aClass95Array12 = null;
		Static384.aClass95Array14 = null;
		Static44.aClass95Array2 = null;
		Static274.aClass95Array9 = null;
		Static412.aClass95Array15 = null;
		Static102.aClass95Array4 = null;
		Static366.aClass95Array13 = null;
		Static164.aClass95Array6 = null;
		Static450.aClass95Array16 = null;
		Static342.aClass95Array10 = null;
		Static49.aClass123_1 = null;
		Static335.aClass95_18 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIBI)V")
	public static void method345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static39.method544(arg2, Static254.anInt4211, Static275.anInt4594);
		@Pc(22) int local22 = Static39.method544(arg4, Static254.anInt4211, Static275.anInt4594);
		@Pc(28) int local28 = Static39.method544(arg0, Static62.anInt1114, Static207.anInt3632);
		@Pc(34) int local34 = Static39.method544(arg1, Static62.anInt1114, Static207.anInt3632);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static249.method6044(Static267.anIntArrayArray50[local36], arg3, local34, local28);
		}
	}
}
