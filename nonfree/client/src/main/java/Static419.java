import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!oaa", name = "P", descriptor = "I")
	private static int anInt1536;

	@OriginalMember(owner = "client!oaa", name = "Q", descriptor = "I")
	private static int anInt1537;

	@OriginalMember(owner = "client!oaa", name = "R", descriptor = "Z")
	private static boolean aBoolean121;

	@OriginalMember(owner = "client!oaa", name = "S", descriptor = "Z")
	private static boolean aBoolean122;

	@OriginalMember(owner = "client!oaa", name = "T", descriptor = "Z")
	private static boolean aBoolean123;

	@OriginalMember(owner = "client!oaa", name = "U", descriptor = "Z")
	private static boolean aBoolean124;

	@OriginalMember(owner = "client!oaa", name = "V", descriptor = "I")
	private static int anInt1538;

	@OriginalMember(owner = "client!oaa", name = "W", descriptor = "I")
	private static int anInt1539;

	@OriginalMember(owner = "client!oaa", name = "X", descriptor = "I")
	private static int anInt1540;

	@OriginalMember(owner = "client!oaa", name = "Y", descriptor = "Z")
	private static boolean aBoolean125;

	@OriginalMember(owner = "client!oaa", name = "Z", descriptor = "Z")
	private static boolean aBoolean126;

	@OriginalMember(owner = "client!oaa", name = "ab", descriptor = "I")
	private static int anInt1541;

	@OriginalMember(owner = "client!oaa", name = "bb", descriptor = "Z")
	private static boolean aBoolean127;

	@OriginalMember(owner = "client!oaa", name = "cb", descriptor = "Z")
	private static boolean aBoolean128;

	@OriginalMember(owner = "client!oaa", name = "db", descriptor = "Z")
	private static boolean aBoolean129;

	@OriginalMember(owner = "client!oaa", name = "eb", descriptor = "Z")
	private static boolean aBoolean130;

	@OriginalMember(owner = "client!oaa", name = "fb", descriptor = "I")
	private static int anInt1542;

	@OriginalMember(owner = "client!oaa", name = "gb", descriptor = "I")
	private static int anInt1543;

	@OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
	public static int anInt1525 = 1;

	@OriginalMember(owner = "client!oaa", name = "D", descriptor = "Lclient!sw;")
	public static final Class327 aClass327_2 = new Class327(4);

	@OriginalMember(owner = "client!oaa", name = "N", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_31 = new Class180(39, -1);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)[Lclient!ib;")
	public static Class147[] method1503() {
		return new Class147[] { Static487.aClass147_8, Static371.aClass147_6, Static440.aClass147_7, Static152.aClass147_3, Static56.aClass147_1, Static101.aClass147_2, Static613.aClass147_9 };
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBI)V")
	public static void method1505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class3_Sub11_Sub4 local19 = Static583.method8201(18, (long) arg1 << 32 | (long) arg0);
		local19.method2194();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)Z")
	public static boolean method1507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
