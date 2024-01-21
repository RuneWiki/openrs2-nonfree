import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!na;")
	public static Class2_Sub9 aClass2_Sub9_1;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt4 = 2;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!je;")
	private static Class40 aClass40_1 = Static69.method1231("Welcome to RuneScape");

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	public static int anInt8 = 0;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public static int anInt9 = 0;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_2 = aClass40_1;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
	public static int anInt13 = 99;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Lclient!je;")
	private static Class40 aClass40_3 = Static69.method1231("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "Lclient!je;")
	public static Class40 aClass40_4 = aClass40_3;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I")
	public static int method5(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg1);
		return Static120.aClass2_Sub1_Sub12_1 != null && local10 == Static120.aClass2_Sub1_Sub12_1.aLong100 ? aClass2_Sub9_1.anInt976 * 99 / (aClass2_Sub9_1.aByteArray16.length - Static120.aClass2_Sub1_Sub12_1.aByte6) + 1 : 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method7() {
		aClass2_Sub9_1 = null;
		aClass40_1 = null;
		Class1.anIntArray1 = null;
		aClass40_4 = null;
		aClass40_2 = null;
		aClass40_3 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILclient!ua;)V")
	public static void method11(@OriginalArg(1) int arg0, @OriginalArg(2) Class24_Sub1 arg1) {
		if (Static19.aClass2_Sub9_2 == null) {
			Static75.method1249(255, 0, (byte) 0, 255, null, true);
			Static79.aClass24_Sub1Array1[arg0] = arg1;
		} else {
			Static19.aClass2_Sub9_2.anInt976 = arg0 * 8 + 5;
			@Pc(20) int local20 = Static19.aClass2_Sub9_2.method622();
			@Pc(24) int local24 = Static19.aClass2_Sub9_2.method622();
			arg1.method1946(local20, local24);
		}
	}
}
