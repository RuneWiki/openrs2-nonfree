import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "Lclient!jd;")
	public static Class20 aClass20_4;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "Z")
	public static boolean aBoolean129;

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "Lclient!wia;")
	public static Class386 aClass386_19;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
	public static int anInt1719;

	@OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
	private static int anInt1723;

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
	private static int anInt1724;

	@OriginalMember(owner = "client!bg", name = "X", descriptor = "Z")
	private static boolean aBoolean131;

	@OriginalMember(owner = "client!bg", name = "Y", descriptor = "Z")
	private static boolean aBoolean132;

	@OriginalMember(owner = "client!bg", name = "Z", descriptor = "Z")
	private static boolean aBoolean133;

	@OriginalMember(owner = "client!bg", name = "ab", descriptor = "Z")
	private static boolean aBoolean134;

	@OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
	private static int anInt1725;

	@OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
	private static int anInt1726;

	@OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
	private static int anInt1727;

	@OriginalMember(owner = "client!bg", name = "eb", descriptor = "Z")
	private static boolean aBoolean135;

	@OriginalMember(owner = "client!bg", name = "fb", descriptor = "Z")
	private static boolean aBoolean136;

	@OriginalMember(owner = "client!bg", name = "gb", descriptor = "I")
	private static int anInt1728;

	@OriginalMember(owner = "client!bg", name = "hb", descriptor = "Z")
	private static boolean aBoolean137;

	@OriginalMember(owner = "client!bg", name = "ib", descriptor = "Z")
	private static boolean aBoolean138;

	@OriginalMember(owner = "client!bg", name = "jb", descriptor = "Z")
	private static boolean aBoolean139;

	@OriginalMember(owner = "client!bg", name = "kb", descriptor = "Z")
	private static boolean aBoolean140;

	@OriginalMember(owner = "client!bg", name = "mb", descriptor = "I")
	private static int anInt1729;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_6 = new Class262();

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
	public static int anInt1717 = 0;

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_7 = new Class262();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;ILclient!so;)I")
	public static int method1450(@OriginalArg(0) String arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		@Pc(6) int local6 = arg1.anInt7264;
		@Pc(18) byte[] local18 = Static264.method3852(arg0);
		arg1.method5863(local18.length);
		arg1.anInt7264 += Static655.aClass335_1.method8168(arg1.aByteArray84, local18.length, arg1.anInt7264, 0, local18);
		return arg1.anInt7264 - local6;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z")
	public static boolean method1457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static563.method8117(arg1, arg0) | (arg1 & 0x70000) != 0 || Static79.method1488(arg1, arg0);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
	public static void method1458() {
		Static420.method6222();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			Static226.aClass226Array3[local12].method5368();
		}
		Static405.method6013();
		Static242.method3619();
		Static135.method2159();
		System.gc();
		Static677.aClass137_47.ya();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!wia;BII)Lclient!dba;")
	public static Class67 method1465(@OriginalArg(0) Class386 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) byte[] local17 = arg0.method9196(0, arg1);
		return local17 == null ? null : new Class67(local17);
	}
}
