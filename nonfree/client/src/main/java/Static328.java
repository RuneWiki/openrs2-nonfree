import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array7;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_95 = new Class394("", 16);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIZI)V")
	public static void method5085(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static639.method8642(arg0, arg2, 0, Static394.aClass6_Sub1Array2.length - 1, arg1, arg3);
		Static125.aClass5_Sub29_1 = null;
		Static415.anInt7348 = 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIILclient!uaa;)V")
	public static void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class345 arg2) {
		if (Static55.aBoolean60) {
			@Pc(14) Class233 local14 = Static412.anInt7320 == -1 ? null : Static191.aClass381_2.method8728(Static412.anInt7320);
			if (Static84.method1822(arg2).method454() && (Static24.anInt7340 & 0x20) != 0 && (local14 == null || arg2.method8070(Static412.anInt7320, local14.anInt6763) != local14.anInt6763)) {
				Static282.method4539(Static421.aString59, false, arg2.anInt9654, Static233.anInt4241, false, 0L, arg2.anInt9664, 9, (long) (arg2.anInt9664 | arg2.anInt9611 << 0), arg2.anInt9611, Static199.aString28 + " -> " + arg2.aString90, true);
			}
		}
		@Pc(85) String local85;
		for (@Pc(78) int local78 = 9; local78 >= 5; local78--) {
			local85 = Static435.method8379(arg2, local78);
			if (local85 != null) {
				Static282.method4539(local85, false, arg2.anInt9654, Static559.method7738(local78, arg2), false, (long) (local78 + 1), arg2.anInt9664, 1012, (long) (arg2.anInt9611 << 0 | arg2.anInt9664), arg2.anInt9611, arg2.aString90, true);
			}
		}
		local85 = Static531.method7465(arg2);
		if (local85 != null) {
			Static282.method4539(local85, false, arg2.anInt9654, arg2.anInt9609, false, 0L, arg2.anInt9664, 45, (long) (arg2.anInt9611 << 0 | arg2.anInt9664), arg2.anInt9611, arg2.aString90, true);
		}
		for (@Pc(166) int local166 = 4; local166 >= 0; local166--) {
			@Pc(173) String local173 = Static435.method8379(arg2, local166);
			if (local173 != null) {
				Static282.method4539(local173, false, arg2.anInt9654, Static559.method7738(local166, arg2), false, (long) (local166 + 1), arg2.anInt9664, 52, (long) (arg2.anInt9664 | arg2.anInt9611 << 0), arg2.anInt9611, arg2.aString90, true);
			}
		}
		if (!Static84.method1822(arg2).method460()) {
			return;
		}
		if (arg2.aString94 == null) {
			Static282.method4539(Static64.aClass52_10.method907(Static544.anInt8937), false, arg2.anInt9654, -1, false, 0L, arg2.anInt9664, 18, (long) (arg2.anInt9611 << 0 | arg2.anInt9664), arg2.anInt9611, "", true);
		} else {
			Static282.method4539(arg2.aString94, false, arg2.anInt9654, -1, false, 0L, arg2.anInt9664, 18, (long) (arg2.anInt9664 | arg2.anInt9611 << 0), arg2.anInt9611, "", true);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBJIILclient!wm;IZ)V")
	public static void method5088(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class390 arg3) {
		Static561.anInt9131 = arg2;
		Static496.anInt8309 = 0;
		Static234.aClass390_55 = arg3;
		Static548.aLong256 = arg1;
		Static26.anInt352 = 1;
		Static577.anInt9443 = arg0;
		Static128.aBoolean231 = false;
		Static439.aClass5_Sub17_Sub1_3 = null;
		Static67.anInt1002 = 0;
		Static171.anInt3389 = 10000;
	}
}
