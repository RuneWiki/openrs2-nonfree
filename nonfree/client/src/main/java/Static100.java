import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!df", name = "K", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	public static int anInt1550;

	@OriginalMember(owner = "client!df", name = "P", descriptor = "I")
	private static int anInt1551;

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
	private static int anInt1552;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "I")
	private static int anInt1553;

	@OriginalMember(owner = "client!df", name = "S", descriptor = "Z")
	private static boolean aBoolean100;

	@OriginalMember(owner = "client!df", name = "T", descriptor = "Z")
	private static boolean aBoolean101;

	@OriginalMember(owner = "client!df", name = "U", descriptor = "I")
	private static int anInt1554;

	@OriginalMember(owner = "client!df", name = "V", descriptor = "I")
	private static int anInt1555;

	@OriginalMember(owner = "client!df", name = "W", descriptor = "I")
	private static int anInt1556;

	@OriginalMember(owner = "client!df", name = "X", descriptor = "Z")
	private static boolean aBoolean102;

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "Z")
	private static boolean aBoolean103;

	@OriginalMember(owner = "client!df", name = "Z", descriptor = "Z")
	private static boolean aBoolean104;

	@OriginalMember(owner = "client!df", name = "ab", descriptor = "Z")
	private static boolean aBoolean105;

	@OriginalMember(owner = "client!df", name = "bb", descriptor = "Z")
	private static boolean aBoolean106;

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
	private static int anInt1557;

	@OriginalMember(owner = "client!df", name = "db", descriptor = "I")
	private static int anInt1558;

	@OriginalMember(owner = "client!df", name = "eb", descriptor = "Z")
	private static boolean aBoolean107;

	@OriginalMember(owner = "client!df", name = "fb", descriptor = "Z")
	private static boolean aBoolean108;

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "Z")
	private static boolean aBoolean109;

	@OriginalMember(owner = "client!df", name = "C", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "Lclient!rha;")
	public static final Class315 aClass315_2 = new Class315();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lclient!kn;")
	public static Class200 method1446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class200 local7 = new Class200();
		local7.anInt5851 = -1;
		local7.anInt5846 = arg1 + 5 + 1;
		local7.anInt5838 = -1;
		local7.anInt5841 = arg0 + 6;
		local7.anIntArrayArray23 = new int[local7.anInt5841][local7.anInt5846];
		local7.method5299();
		return local7;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
	public static boolean method1457(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
