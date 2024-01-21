import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "J")
	public static long aLong24;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "Lclient!od;")
	public static Class60 aClass60_232 = Static41.method597("(U0a )2 in: ");

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Lclient!lb;")
	public static Class45 aClass45_3 = new Class45();

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
	public static int anInt737 = 0;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "Lclient!od;")
	public static Class60 aClass60_233 = Static41.method597("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
	public static int anInt749 = 0;

	@OriginalMember(owner = "client!db", name = "Mb", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!db", name = "Ob", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!db", name = "Sb", descriptor = "Lclient!od;")
	public static Class60 aClass60_234 = Static41.method597(":tradereq:");

	@OriginalMember(owner = "client!db", name = "Vb", descriptor = "Lclient!od;")
	private static Class60 aClass60_236 = Static41.method597("Loading sprites )2 ");

	@OriginalMember(owner = "client!db", name = "Tb", descriptor = "Lclient!od;")
	public static Class60 aClass60_235 = aClass60_236;

	@OriginalMember(owner = "client!db", name = "Ub", descriptor = "I")
	public static int anInt767 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBI)I")
	public static int method400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local5 << 13 ^ local5;
		@Pc(34) int local34 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	public static void method404() {
		aClass60_232 = null;
		aClass60_236 = null;
		aClass45_3 = null;
		aLongArray2 = null;
		aClass60_233 = null;
		aClass60_234 = null;
		aClass60_235 = null;
	}
}
