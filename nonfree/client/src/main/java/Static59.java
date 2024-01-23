import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!jb;")
	public static Class28 aClass28_26;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public static int anInt1433;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!uf;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public static int anInt1428 = 0;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!hd;")
	public static Class50 aClass50_10 = new Class50(16);

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public static int anInt1431 = -1;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public static int anInt1432 = 0;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!sc;")
	private static Class107 aClass107_402 = Static231.method3737("OFF");

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_401 = aClass107_402;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "[I")
	public static int[] anIntArray126 = new int[25];

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	public static int anInt1434 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)J")
	public static long method1131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass40_1 == null ? 0L : local7.aClass40_1.aLong49;
	}
}
