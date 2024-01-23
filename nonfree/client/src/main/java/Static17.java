import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "Lclient!ia;")
	private static Class51 aClass51_136 = Static64.method1101(" is already on your friend list)3");

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_137 = Static64.method1101("rot:");

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_138 = aClass51_136;

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "Lclient!th;")
	public static Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;I)V")
	public static void method323(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class70 arg3) {
		Static73.aClass70_21 = arg2;
		Static188.aClass70_39 = arg3;
		Static32.aClass70_12 = arg0;
		Static111.aClass70_26 = arg1;
		Static64.aClass71ArrayArray1 = new Class71[Static111.aClass70_26.method3514()][];
		Static122.aBooleanArray18 = new boolean[Static111.aClass70_26.method3514()];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIILclient!ib;)V")
	public static void method324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1_Sub1 arg2) {
		if (arg1 == arg2.anInt3585 && arg1 != -1) {
			@Pc(15) Class40 local15 = Static32.method546(arg1);
			@Pc(18) int local18 = local15.anInt1245;
			if (local18 == 1) {
				arg2.anInt3576 = 0;
				arg2.anInt3583 = 0;
				arg2.anInt3599 = arg0;
				arg2.anInt3595 = 0;
				Static79.method1375(arg2.anInt3598, Static73.aClass5_Sub1_Sub1_1 == arg2, arg2.anInt3576, local15, arg2.anInt3624);
			}
			if (local18 == 2) {
				arg2.anInt3583 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt3585 == -1 || Static32.method546(arg1).anInt1246 >= Static32.method546(arg2.anInt3585).anInt1246) {
			arg2.anInt3595 = 0;
			arg2.anInt3585 = arg1;
			arg2.anInt3599 = arg0;
			arg2.anInt3576 = 0;
			arg2.anInt3583 = 0;
			arg2.anInt3619 = arg2.anInt3603;
			if (arg2.anInt3585 != -1) {
				Static79.method1375(arg2.anInt3598, arg2 == Static73.aClass5_Sub1_Sub1_1, arg2.anInt3576, Static32.method546(arg2.anInt3585), arg2.anInt3624);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ib;)I")
	public static int method325(@OriginalArg(1) Class5_Sub1_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt1940;
		if (arg0.anInt3620 == arg0.anInt3618) {
			local13 = arg0.anInt1939;
		} else if (arg0.anInt3591 == arg0.anInt3620) {
			local13 = arg0.anInt1955;
		}
		return local13;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	public static void method328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class124 local7 = Static144.method2492(arg0);
		@Pc(10) int local10 = local7.anInt4668;
		@Pc(13) int local13 = local7.anInt4660;
		@Pc(16) int local16 = local7.anInt4667;
		@Pc(23) int local23 = Class45.anIntArray97[local16 - local13];
		if (arg1 < 0 || local23 < arg1) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static169.method2897(local10, ~local23 & Static230.anIntArray379[local10] | arg1 << local13 & local23);
	}
}
