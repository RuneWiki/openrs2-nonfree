import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lclient!wia;")
	public static Class402 aClass402_3;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IB)Z")
	public static boolean method8621(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 12 || arg0 == 10;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	public static void method8622() {
		Static382.aClass244_1 = new Class244(8);
		Static25.anInt311 = 0;
		for (@Pc(24) Class4_Sub7 local24 = (Class4_Sub7) Static624.aClass320_8.method7605(); local24 != null; local24 = (Class4_Sub7) Static624.aClass320_8.method7608()) {
			local24.method3630();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILclient!oh;II)V")
	public static void method8623(@OriginalArg(1) Class273 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static335.anInt5132 = arg2;
		Static445.anInt7222 = arg1;
		Static564.aClass273_16 = arg0;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIIIIIZI)Z")
	public static boolean method8625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0];
		@Pc(13) int local13 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0];
		if (local8 < 0 || local8 >= Static426.anInt6942 || local13 < 0 || Static280.anInt6752 <= local13) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static426.anInt6942 && arg5 >= 0 && arg5 < Static280.anInt6752) {
			@Pc(91) int local91 = Static322.method4462(arg7, arg2, arg6, local13, arg1, Static626.aClass226Array1[Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133], arg5, Static127.anIntArray158, arg0, Static405.anIntArray468, local8, arg4, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046(), arg3);
			if (local91 < 1) {
				return false;
			}
			Static392.anInt6487 = Static127.anIntArray158[local91 - 1];
			Static371.anInt5924 = Static405.anIntArray468[local91 - 1];
			Static397.aBoolean554 = false;
			Static566.method7859();
			return true;
		} else {
			return false;
		}
	}
}
