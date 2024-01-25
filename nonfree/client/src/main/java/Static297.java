import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!sn", name = "cb", descriptor = "Lclient!ij;")
	public static Class93 aClass93_115;

	@OriginalMember(owner = "client!sn", name = "db", descriptor = "Lclient!sg;")
	public static Class54 aClass54_3;

	@OriginalMember(owner = "client!sn", name = "fb", descriptor = "I")
	public static int anInt5809;

	@OriginalMember(owner = "client!sn", name = "gb", descriptor = "I")
	public static int anInt5810 = 0;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V")
	public static void method5148() {
		Static212.aClass109_45.method2858();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIB)Lclient!vg;")
	public static Class201 method5150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class201 local12 = Static262.method4616(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass201Array121 == null || arg1 >= local12.aClass201Array121.length) {
			return null;
		} else {
			return local12.aClass201Array121[arg1];
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z")
	public static boolean method5151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class156 local7 = Static111.method1967(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local7.method4224(arg0);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)V")
	public static void method5153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class4_Sub1 local13 = local7.aClass4_Sub1_2;
		@Pc(16) Class4_Sub1 local16 = local7.aClass4_Sub1_1;
		if (local13 != null) {
			local13.anInt3791 = local13.anInt3791 * arg3 / 16;
			local13.anInt3794 = local13.anInt3794 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt3791 = local16.anInt3791 * arg3 / 16;
			local16.anInt3794 = local16.anInt3794 * arg3 / 16;
		}
	}
}
