import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "Kb", descriptor = "Lclient!pe;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!ae", name = "Mb", descriptor = "I")
	public static int anInt275;

	@OriginalMember(owner = "client!ae", name = "Ib", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_60 = Static158.method3034("swe");

	@OriginalMember(owner = "client!ae", name = "Rb", descriptor = "[I")
	public static final int[] anIntArray27 = new int[500];

	@OriginalMember(owner = "client!ae", name = "Sb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_61 = Static158.method3034("red:");

	@OriginalMember(owner = "client!ae", name = "Tb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_62 = Static158.method3034(")3runescape)3com");

	@OriginalMember(owner = "client!ae", name = "Wb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_63 = Static158.method3034("::noclip");

	@OriginalMember(owner = "client!ae", name = "hc", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_71 = Static158.method3034("Loaded interfaces");

	@OriginalMember(owner = "client!ae", name = "Xb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_64 = aClass60_71;

	@OriginalMember(owner = "client!ae", name = "Yb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_65 = aClass60_61;

	@OriginalMember(owner = "client!ae", name = "Zb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_66 = Static158.method3034("settings=");

	@OriginalMember(owner = "client!ae", name = "ac", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_67 = Static158.method3034("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ae", name = "cc", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_68 = Static158.method3034("sl_arrows");

	@OriginalMember(owner = "client!ae", name = "dc", descriptor = "Lclient!ob;")
	public static Class60 aClass60_69 = aClass60_67;

	@OriginalMember(owner = "client!ae", name = "gc", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_70 = aClass60_61;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIZ)I")
	public static int method249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static147.aByteArrayArrayArray36[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static147.aByteArrayArrayArray36[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIB)V")
	public static void method250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class72 local12 = Static181.method3381(arg2, arg0);
		if (local12 != null && local12.anObjectArray20 != null) {
			@Pc(25) Class2_Sub25 local25 = new Class2_Sub25();
			local25.aClass72_15 = local12;
			local25.anObjectArray29 = local12.anObjectArray20;
			Static197.method3578(local25);
		}
		Static115.anInt3208 = arg2;
		Static101.anInt2923 = arg1;
		Static141.anInt3690 = arg0;
		Static58.aBoolean74 = true;
		Static39.method900(local12);
	}
}
