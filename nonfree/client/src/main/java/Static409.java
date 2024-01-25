import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!po", name = "cb", descriptor = "I")
	public static int anInt7962;

	@OriginalMember(owner = "client!po", name = "db", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!po", name = "fb", descriptor = "Lclient!lq;")
	public static Class202 aClass202_8;

	@OriginalMember(owner = "client!po", name = "U", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_109 = new Class90(5, 1);

	@OriginalMember(owner = "client!po", name = "Y", descriptor = "Lclient!gca;")
	public static final Class119 aClass119_6 = new Class119();

	@OriginalMember(owner = "client!po", name = "eb", descriptor = "I")
	public static int anInt7963 = 0;

	@OriginalMember(owner = "client!po", name = "gb", descriptor = "I")
	public static final int anInt7964 = 0;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)V")
	public static void method6223() {
		Static226.anInt4729 = -1;
		Static384.anInt7552 = -1;
		Static291.anInt5976 = 0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!is;III)V")
	public static void method6225(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static430.aBoolean586) {
			@Pc(13) Class275 local13 = Static494.anInt9306 == -1 ? null : Static245.aClass107_2.method2503(Static494.anInt9306);
			if (Static70.method1542(arg0).method6325() && (Static264.anInt5328 & 0x20) != 0 && (local13 == null || arg0.method3704(local13.anInt8186, Static494.anInt9306) != local13.anInt8186)) {
				Static437.method6478(arg0.anInt4765, 0L, arg0.anInt4785, arg0.anInt4793, true, Static317.aString131, 10, Static393.aString154 + " -> " + arg0.aString97, false, Static398.anInt7799);
			}
		}
		@Pc(81) String local81;
		for (@Pc(72) int local72 = 9; local72 >= 5; local72--) {
			local81 = Static190.method3140(local72, arg0);
			if (local81 != null) {
				Static437.method6478(arg0.anInt4765, (long) (local72 + 1), arg0.anInt4785, arg0.anInt4793, true, local81, 1009, arg0.aString97, false, Static233.method3767(local72, arg0));
			}
		}
		local81 = Static476.method6911(arg0);
		if (local81 != null) {
			Static437.method6478(arg0.anInt4765, 0L, arg0.anInt4785, arg0.anInt4793, true, local81, 23, arg0.aString97, false, arg0.anInt4798);
		}
		for (@Pc(142) int local142 = 4; local142 >= 0; local142--) {
			@Pc(149) String local149 = Static190.method3140(local142, arg0);
			if (local149 != null) {
				Static437.method6478(arg0.anInt4765, (long) (local142 + 1), arg0.anInt4785, arg0.anInt4793, true, local149, 13, arg0.aString97, false, Static233.method3767(local142, arg0));
			}
		}
		if (!Static70.method1542(arg0).method6332()) {
			return;
		}
		if (arg0.aString98 == null) {
			Static437.method6478(arg0.anInt4765, 0L, arg0.anInt4785, arg0.anInt4793, true, Static223.aClass152_13.method3624(Static142.anInt3088), 44, "", false, -1);
		} else {
			Static437.method6478(arg0.anInt4765, 0L, arg0.anInt4785, arg0.anInt4793, true, arg0.aString98, 44, "", false, -1);
		}
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(III)V")
	public static void method6227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static173.method2881(local7.aClass21_Sub1_Sub3_2);
		Static173.method2881(local7.aClass21_Sub1_Sub3_1);
		if (local7.aClass21_Sub1_Sub3_2 != null) {
			local7.aClass21_Sub1_Sub3_2 = null;
		}
		if (local7.aClass21_Sub1_Sub3_1 != null) {
			local7.aClass21_Sub1_Sub3_1 = null;
		}
	}
}
