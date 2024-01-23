import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Lclient!lc;")
	public static Class98 aClass98_146;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!kk;")
	public static Class92 aClass92_1 = new Class92();

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "J")
	public static long aLong173 = 0L;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Lclient!dh;")
	public static Class33 aClass33_37 = new Class33(64);

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "[S")
	public static short[] aShortArray78 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "[S")
	public static short[] aShortArray79 = new short[] { 38, 36, 58, 17, 23, 34, 9, 21 };

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method3857() {
		aClass33_37 = null;
		aClass98_146 = null;
		aShortArray78 = null;
		aClass92_1 = null;
		aShortArray79 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZBII)V")
	public static void method3858(@OriginalArg(0) boolean arg0) {
		Static79.anInt1529 = 22050;
		Static224.anInt4442 = 2;
		Static14.aBoolean153 = arg0;
	}
}
