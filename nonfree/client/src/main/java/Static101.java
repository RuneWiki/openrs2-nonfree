import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
	public static int anInt2913;

	@OriginalMember(owner = "client!lb", name = "bb", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!lb", name = "nb", descriptor = "Z")
	public static boolean aBoolean113;

	@OriginalMember(owner = "client!lb", name = "ub", descriptor = "I")
	public static int anInt2923;

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_806 = Static158.method3034("Jul");

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
	public static int anInt2911 = 20;

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_807 = Static158.method3034("");

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_808 = Static158.method3034("Aug");

	@OriginalMember(owner = "client!lb", name = "wb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_820 = Static158.method3034("Jan");

	@OriginalMember(owner = "client!lb", name = "tb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_819 = Static158.method3034("Feb");

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_810 = Static158.method3034("Mar");

	@OriginalMember(owner = "client!lb", name = "lb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_816 = Static158.method3034("Apr");

	@OriginalMember(owner = "client!lb", name = "fb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_814 = Static158.method3034("May");

	@OriginalMember(owner = "client!lb", name = "cb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_812 = Static158.method3034("Jun");

	@OriginalMember(owner = "client!lb", name = "pb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_817 = Static158.method3034("Sep");

	@OriginalMember(owner = "client!lb", name = "ab", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_811 = Static158.method3034("Oct");

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_809 = Static158.method3034("Nov");

	@OriginalMember(owner = "client!lb", name = "rb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_818 = Static158.method3034("Dec");

	@OriginalMember(owner = "client!lb", name = "W", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array17 = new Class60[] { aClass60_820, aClass60_819, aClass60_810, aClass60_816, aClass60_814, aClass60_812, aClass60_806, aClass60_808, aClass60_817, aClass60_811, aClass60_809, aClass60_818 };

	@OriginalMember(owner = "client!lb", name = "db", descriptor = "Lclient!ob;")
	public static Class60 aClass60_813 = aClass60_807;

	@OriginalMember(owner = "client!lb", name = "gb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_815 = Static158.method3034("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
	public static int anInt2916 = 0;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public static void method2309(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static62.method1443(arg0)) {
			return;
		}
		@Pc(18) Class72[] local18 = Static197.aClass72ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
			@Pc(34) Class72 local34 = local18[local28];
			if (local34.anObjectArray14 != null) {
				@Pc(41) Class2_Sub25 local41 = new Class2_Sub25();
				local41.anObjectArray29 = local34.anObjectArray14;
				local41.aClass72_15 = local34;
				Static188.method3444(local41, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)Lclient!kh;")
	public static Class2_Sub1_Sub14 method2313(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub1_Sub14 local6 = (Class2_Sub1_Sub14) Static145.aClass89_55.method3437((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static84.aClass13_15.method521(Static47.method2315(arg0), Static150.method2968(arg0));
		local6 = new Class2_Sub1_Sub14();
		local6.anInt2847 = arg0;
		if (local24 != null) {
			local6.method2260(new Class2_Sub3(local24));
		}
		Static145.aClass89_55.method3432(local6, (long) arg0);
		return local6;
	}
}
