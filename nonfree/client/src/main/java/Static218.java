import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Lclient!lc;")
	public static Class98 aClass98_168;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	public static int anInt5362;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
	public static int anInt5374 = 0;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "[I")
	public static int[] anIntArray477 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "[I")
	public static int[] anIntArray478 = new int[1000];

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
	public static int anInt5375 = -1;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!lc;Ljava/lang/String;)Lclient!am;")
	public static Class9 method4255(@OriginalArg(1) Class98 arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = arg0.method2376(arg1);
		if (local10 == -1) {
			return new Class9(0);
		}
		@Pc(23) int[] local23 = arg0.method2384(local10);
		@Pc(29) Class9 local29 = new Class9(local23.length);
		for (@Pc(31) int local31 = 0; local31 < local29.anInt203; local31++) {
			@Pc(46) Class4_Sub17 local46 = new Class4_Sub17(arg0.method2396(local23[local31], local10));
			local29.aStringArray2[local31] = local46.method1841();
			local29.aByteArray3[local31] = local46.method1892();
			local29.anIntArray22[local31] = local46.method1889();
			local29.anIntArray21[local31] = local46.method1889();
		}
		return local29;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[Lclient!gj;)V")
	public static void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub14[] arg1) {
		Static281.aClass4_Sub14ArrayArray3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!p;)Lclient!da;")
	public static Class4_Sub6 method4260(@OriginalArg(1) Class4_Sub17 arg0) {
		arg0.method1874();
		@Pc(15) int local15 = arg0.method1874();
		@Pc(19) Class4_Sub6 local19 = Static194.method3024(local15);
		local19.anInt5511 = arg0.method1874();
		@Pc(28) int local28 = arg0.method1874();
		for (@Pc(36) int local36 = 0; local36 < local28; local36++) {
			@Pc(45) int local45 = arg0.method1874();
			local19.method4381(arg0, local45);
		}
		local19.method4370();
		return local19;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public static void method4261() {
		anIntArray477 = null;
		aClass98_168 = null;
		aByteArrayArrayArray21 = null;
		anIntArray478 = null;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IC)Z")
	public static boolean method4262(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
