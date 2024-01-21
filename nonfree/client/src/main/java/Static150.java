import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "Z")
	public static boolean aBoolean144;

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1447 = Static193.method3027("Loading sprites )2 ");

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1446 = aClass70_1447;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "Lclient!gj;")
	public static final Class40 aClass40_11 = new Class40(32);

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1452 = Static193.method3027("FULL");

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1448 = aClass70_1452;

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1449 = Static193.method3027("Unable to connect)3");

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "[I")
	public static final int[] anIntArray225 = new int[100];

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1450 = Static193.method3027("Connection timed out)3");

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1451 = null;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1453 = aClass70_1449;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1454 = Static193.method3027("<col=ffff00>");

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
	public static volatile int anInt3086 = -1;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1455 = aClass70_1450;

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1456 = aClass70_1449;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V")
	public static void method2199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static127.anInt2495; local8++) {
			if (Static35.anIntArray38[local8] + anIntArray225[local8] > arg2 && arg0 + arg2 > Static35.anIntArray38[local8] && arg1 < Static59.anIntArray136[local8] + Static175.anIntArray292[local8] && Static59.anIntArray136[local8] < arg3 + arg1) {
				Static70.aBooleanArray3[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public static int method2200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			arg1--;
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local12;
	}
}
