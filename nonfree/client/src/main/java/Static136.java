import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
	public static int anInt3052;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "[I")
	public static final int[] anIntArray248 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_911 = Static81.method1507("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_912 = Static81.method1507("Bad session id)3");

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_913 = Static81.method1507(":clanreq:");

	@OriginalMember(owner = "client!oe", name = "Z", descriptor = "[I")
	public static int[] anIntArray250 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!oe", name = "db", descriptor = "Lclient!dj;")
	public static Class24 aClass24_914 = aClass24_912;

	@OriginalMember(owner = "client!oe", name = "lb", descriptor = "[I")
	public static final int[] anIntArray251 = new int[25];

	@OriginalMember(owner = "client!oe", name = "qb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_915 = Static81.method1507("titlebutton");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!ve;)Z")
	public static boolean method2383(@OriginalArg(1) int arg0, @OriginalArg(2) Class69 arg1) {
		@Pc(10) byte[] local10 = arg1.method2202(arg0);
		if (local10 == null) {
			return false;
		} else {
			Static150.method2585(local10);
			return true;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!nf;II)V")
	public static void method2386(@OriginalArg(0) Class69_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static108.aClass1_Sub7_2 == null) {
			Static24.method501(null, (byte) 0, 255, 0, true, 255);
			Static85.aClass69_Sub1Array2[arg1] = arg0;
		} else {
			Static108.aClass1_Sub7_2.anInt3592 = arg1 * 8 + 5;
			@Pc(23) int local23 = Static108.aClass1_Sub7_2.method2793();
			@Pc(27) int local27 = Static108.aClass1_Sub7_2.method2793();
			arg0.method2231(local27, local23);
		}
	}
}
