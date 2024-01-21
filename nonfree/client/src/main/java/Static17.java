import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!j;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!tb;")
	public static Class44 aClass44_9;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "[I")
	public static int[] anIntArray30 = new int[1000];

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public static int anInt473 = 0;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!n;")
	public static Class52 aClass52_10 = new Class52(30);

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!oa;")
	private static Class56 aClass56_236 = Static33.method650("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_237 = aClass56_236;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method346() {
		anIntArray30 = null;
		aClass36_1 = null;
		aClass44_9 = null;
		aClass56_237 = null;
		aClass56_236 = null;
		aClass52_10 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!oa;Lclient!tb;BLclient!oa;)Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 method347(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(3) Class56 arg2) {
		@Pc(14) int local14 = arg1.method1148(arg0);
		@Pc(20) int local20 = arg1.method1136(arg2, local14);
		return Static73.method1332(local20, local14, arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZJ)V")
	public static void method348(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static63.anInt1820; local12++) {
			if (arg0 == Static84.aLongArray24[local12]) {
				Static115.aBoolean157 = true;
				Static63.anInt1820--;
				for (@Pc(32) int local32 = local12; local32 < Static63.anInt1820; local32++) {
					Static84.aLongArray24[local32] = Static84.aLongArray24[local32 + 1];
				}
				Static111.aClass3_Sub2_Sub1_4.method325(172);
				Static111.aClass3_Sub2_Sub1_4.method300(arg0);
				break;
			}
		}
	}
}
