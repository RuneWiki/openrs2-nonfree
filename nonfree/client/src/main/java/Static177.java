import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "[I")
	public static int[] anIntArray633;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Lclient!ke;")
	public static Class43 aClass43_44;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "[I")
	public static int[] anIntArray632 = new int[2048];

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1534 = Static146.method2172("Mem:");

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "Lclient!sa;")
	public static Class74 aClass74_12 = new Class74(8);

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "J")
	public static volatile long aLong131 = 0L;

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1535 = Static146.method2172("<col=00ffff>");

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1536 = Static146.method2172("Location");

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1537 = aClass77_1536;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method2964() {
		aClass74_12 = null;
		anIntArray632 = null;
		aClass77_1536 = null;
		aClass77_1537 = null;
		aClass77_1535 = null;
		anIntArray633 = null;
		aClass77_1534 = null;
		aClass43_44 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method2965() {
		for (@Pc(5) int local5 = 0; local5 < Static174.anInt4449; local5++) {
			@Pc(10) int local10 = Static6.anIntArray25[local5];
			@Pc(14) Class2_Sub2_Sub1_Sub6_Sub1 local14 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local10];
			@Pc(18) int local18 = Static74.aClass2_Sub18_Sub1_1.method2387();
			if ((local18 & 0x20) != 0) {
				local18 += Static74.aClass2_Sub18_Sub1_1.method2387() << 8;
			}
			Static176.method2955(local10, local18, local14);
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
	public static void method2966() {
		Static64.aClass82_27.method2698();
	}
}
