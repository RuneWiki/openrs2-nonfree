import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt3935 = 1;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1518 = Static120.method1824("Login limit exceeded)3");

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1513 = aClass80_1518;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1516 = Static120.method1824("Loaded wordpack");

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1514 = aClass80_1516;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array29 = new Class80[1000];

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1515 = Static120.method1824("Loading )2 please wait)3");

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public static int anInt3939 = 0;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1517 = aClass80_1515;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public static void method2820(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static188.method3068(arg0)) {
			return;
		}
		@Pc(19) Class77[] local19 = Static57.aClass77ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local19.length; local25++) {
			@Pc(31) Class77 local31 = local19[local25];
			if (local31.anObjectArray15 != null) {
				@Pc(38) Class3_Sub16 local38 = new Class3_Sub16();
				local38.anObjectArray3 = local31.anObjectArray15;
				local38.aClass77_10 = local31;
				Static181.method2906(2000000, local38);
			}
		}
	}
}
