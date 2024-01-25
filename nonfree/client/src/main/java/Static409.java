import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "Lclient!kr;")
	public static Class194 aClass194_231;

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "Lclient!vq;")
	public static Class361 aClass361_1;

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_232 = new Class194(2, 1);

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBI)I")
	public static int method6362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
	public static void method6364() {
		if (!Static425.aBoolean536) {
			return;
		}
		@Pc(16) Class344 local16 = Static258.method4328(Static491.anInt8353, Static260.anInt5074);
		if (local16 != null && local16.anObjectArray20 != null) {
			@Pc(25) Class3_Sub36 local25 = new Class3_Sub36();
			local25.anObjectArray1 = local16.anObjectArray20;
			local25.aClass344_6 = local16;
			Static400.method6288(local25);
		}
		Static425.aBoolean536 = false;
		Static80.anInt1600 = -1;
		Static174.anInt3360 = -1;
		if (local16 != null) {
			Static605.method8323(local16);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	public static void method6365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(16, arg1);
		local8.method1474();
		local8.anInt1728 = arg0;
	}
}
