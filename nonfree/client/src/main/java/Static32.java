import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "Lclient!ac;")
	public static Class3 aClass3_4;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_471 = Static14.method2017("Fertigkeit)2");

	@OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
	public static int anInt900 = -1;

	@OriginalMember(owner = "client!g", name = "db", descriptor = "Lclient!kc;")
	private static Class36 aClass36_472 = Static14.method2017("System update in: ");

	@OriginalMember(owner = "client!g", name = "gb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_473 = Static14.method2017("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_474 = Static14.method2017("Einloggen");

	@OriginalMember(owner = "client!g", name = "rb", descriptor = "[I")
	public static int[] anIntArray128 = new int[4000];

	@OriginalMember(owner = "client!g", name = "sb", descriptor = "I")
	public static int anInt910 = 0;

	@OriginalMember(owner = "client!g", name = "ub", descriptor = "Lclient!kc;")
	public static Class36 aClass36_475 = aClass36_472;

	@OriginalMember(owner = "client!g", name = "vb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_476 = Static14.method2017("gelb:");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBI)V")
	public static void method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static51.anInt2599 == 0 || arg0 == 0 || Static115.anInt1793 >= 50) {
			return;
		}
		Static111.anIntArray344[Static115.anInt1793] = arg2;
		Static80.anIntArray246[Static115.anInt1793] = arg0;
		Static74.anIntArray237[Static115.anInt1793] = arg1;
		Static101.aClass7Array1[Static115.anInt1793] = null;
		Static59.anIntArray197[Static115.anInt1793] = 0;
		Static115.anInt1793++;
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
	public static void method705() {
		anIntArray128 = null;
		aClass36_476 = null;
		aClass36_473 = null;
		aClass36_475 = null;
		aClass36_472 = null;
		aClass36_471 = null;
		aClass36_474 = null;
		aClass3_4 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)I")
	public static int method707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + local4 * (arg1 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + local4 * (arg1 & 0xFF00) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III[Lclient!kc;)Lclient!kc;")
	public static Class36 method708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class36[] arg2) {
		@Pc(1) int local1 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			if (arg2[local7 + arg0] == null) {
				arg2[arg0 + local7] = Static94.aClass36_1171;
			}
			local1 += arg2[local7 + arg0].anInt1442;
		}
		@Pc(41) byte[] local41 = new byte[local1];
		@Pc(43) int local43 = 0;
		@Pc(52) Class36 local52;
		for (@Pc(45) int local45 = 0; local45 < arg1; local45++) {
			local52 = arg2[local45 + arg0];
			Static122.method709(local52.aByteArray9, 0, local41, local43, local52.anInt1442);
			local43 += local52.anInt1442;
		}
		local52 = new Class36();
		local52.aByteArray9 = local41;
		local52.anInt1442 = local1;
		return local52;
	}
}
