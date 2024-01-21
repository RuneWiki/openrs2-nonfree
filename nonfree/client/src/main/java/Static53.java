import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!je", name = "hc", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!je", name = "nc", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_17;

	@OriginalMember(owner = "client!je", name = "fc", descriptor = "Lclient!sc;")
	private static Class66 aClass66_913 = Static106.method1849("yellow:");

	@OriginalMember(owner = "client!je", name = "Vb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_912 = aClass66_913;

	@OriginalMember(owner = "client!je", name = "cc", descriptor = "I")
	public static final int anInt1743 = 3353893;

	@OriginalMember(owner = "client!je", name = "ec", descriptor = "Lclient!rc;")
	public static Class61 aClass61_11 = new Class61();

	@OriginalMember(owner = "client!je", name = "kc", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!je", name = "mc", descriptor = "Lclient!sc;")
	public static Class66 aClass66_914 = aClass66_913;

	@OriginalMember(owner = "client!je", name = "oc", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array10 = new Class66[100];

	@OriginalMember(owner = "client!je", name = "qc", descriptor = "Lclient!sc;")
	public static Class66 aClass66_915 = Static106.method1849("blinken3:");

	@OriginalMember(owner = "client!je", name = "rc", descriptor = "[I")
	public static int[] anIntArray247 = new int[500];

	@OriginalMember(owner = "client!je", name = "sc", descriptor = "Lclient!sc;")
	public static Class66 aClass66_916 = Static106.method1849(":tradereq:");

	@OriginalMember(owner = "client!je", name = "j", descriptor = "(B)V")
	public static void method1223() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!je", name = "u", descriptor = "(I)V")
	public static void method1226() {
		Static108.anIntArrayArray4 = new int[105][105];
		Static85.aByteArrayArrayArray14 = new byte[4][104][104];
		Static74.anInt2039 = 99;
		Static22.aByteArrayArrayArray6 = new byte[4][105][105];
		Static49.anIntArray230 = new int[104];
		Static29.anIntArray106 = new int[104];
		Static131.aByteArrayArrayArray16 = new byte[4][104][104];
		Static12.aByteArrayArrayArray5 = new byte[4][104][104];
		Static96.anIntArray417 = new int[104];
		Static38.anIntArray491 = new int[104];
		Static92.anIntArray402 = new int[104];
		Static76.anIntArrayArrayArray6 = new int[4][105][105];
		Static6.aByteArrayArrayArray4 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method1229(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return arg1 ? Static79.method1479(local21) : local21;
		} else if (arg0 instanceof Class40) {
			@Pc(35) Class40 local35 = (Class40) arg0;
			return local35.method1292();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!je", name = "w", descriptor = "(I)V")
	public static void method1233() {
		aClass5_Sub1_17 = null;
		aClass66_912 = null;
		anIntArray247 = null;
		aClass66_915 = null;
		aClass66Array10 = null;
		aClass66_913 = null;
		aClass66_916 = null;
		aClass66_914 = null;
		aClass61_11 = null;
		anIntArray246 = null;
	}
}
