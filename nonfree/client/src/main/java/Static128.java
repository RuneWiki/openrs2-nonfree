import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!pe;")
	public static Class254 aClass254_100;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
	public static int anInt7242;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lclient!fi;")
	public static Class2_Sub3 method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub3_1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
	public static void method6030(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class305 local13 = Static282.method4864(arg2, arg0);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray15 != null) {
			@Pc(23) Class3_Sub38 local23 = new Class3_Sub38();
			local23.anObjectArray4 = local13.anObjectArray15;
			local23.aClass305_11 = local13;
			local23.aString78 = arg1;
			local23.anInt7101 = arg3;
			Static597.method8423(local23);
		}
		if (Static75.anInt1880 != 10 || !Static68.method1694(local13).method1758(arg3 - 1)) {
			return;
		}
		@Pc(63) Class3_Sub9 local63;
		if (arg3 == 1) {
			local63 = Static587.method8316(Static187.aClass40_2, Static592.aClass230_111);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 2) {
			local63 = Static587.method8316(Static187.aClass40_2, Static258.aClass230_56);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 3) {
			local63 = Static587.method8316(Static187.aClass40_2, Static394.aClass230_75);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 4) {
			local63 = Static587.method8316(Static187.aClass40_2, Static327.aClass230_66);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 5) {
			local63 = Static587.method8316(Static187.aClass40_2, Static486.aClass230_95);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 6) {
			local63 = Static587.method8316(Static187.aClass40_2, Static252.aClass230_55);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 7) {
			local63 = Static587.method8316(Static187.aClass40_2, Static82.aClass230_11);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 8) {
			local63 = Static587.method8316(Static187.aClass40_2, Static288.aClass230_60);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 9) {
			local63 = Static587.method8316(Static187.aClass40_2, Static64.aClass230_15);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
		if (arg3 == 10) {
			local63 = Static587.method8316(Static187.aClass40_2, Static184.aClass230_41);
			Static216.method3754(arg0, local13.anInt9216, arg2, local63);
			Static230.method3933(local63);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
	public static void method6031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static377.anInt7315; local5++) {
			@Pc(10) Rectangle local10 = Class43.aRectangleArray6[local5];
			if (local10.x + local10.width > arg2 && local10.x < arg2 + arg0 && arg1 < local10.height + local10.y && arg3 + arg1 > local10.y) {
				Static52.aBooleanArray4[local5] = true;
			}
		}
	}
}
