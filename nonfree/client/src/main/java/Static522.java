import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static522 {

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "Lclient!mc;")
	public static Class198 aClass198_16 = null;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_146 = new Class45(53, 8);

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_147 = new Class45(12, 6);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII)V")
	public static void method7743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1003) {
			Static312.method5021(Static93.aClass98_1, arg2, arg0);
		} else if (arg1 == 1012) {
			Static312.method5021(Static336.aClass98_6, arg2, arg0);
		} else if (arg1 == 1001) {
			Static312.method5021(Static523.aClass98_12, arg2, arg0);
		} else if (arg1 == 1006) {
			Static312.method5021(Static381.aClass98_7, arg2, arg0);
		} else if (arg1 == 1004) {
			Static312.method5021(Static538.aClass98_13, arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
	public static void method7747() {
		Static8.anInt119 = -1;
		Static273.anInt5444 = -1;
		Static540.anInt9595 = 0;
		Static141.anInt3151 = -1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(JJ)J")
	public static long method7749(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
