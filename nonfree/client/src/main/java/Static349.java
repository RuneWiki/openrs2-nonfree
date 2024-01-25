import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Lclient!jb;")
	public static Class117 aClass117_27;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "[I")
	public static int[] anIntArray566 = new int[1];

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_249 = new Class92(21, 2);

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public static int anInt7451 = 0;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
	public static final int[] anIntArray567 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = Static207.anInt4136;
		@Pc(7) int[] local7 = Static322.anIntArray436;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < local5; local11++) {
			@Pc(18) Class1_Sub3_Sub3_Sub1 local18 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local7[local11]];
			if (local18 != null && local18 != Static113.aClass1_Sub3_Sub3_Sub1_4 && local18.aString47 != null && local18.aString47.equalsIgnoreCase(arg1)) {
				local9 = true;
				if (arg0 == 1) {
					Static414.method5552(Static302.aClass92_182);
					Static302.aClass3_Sub2_Sub2_2.method5995(0);
					Static302.aClass3_Sub2_Sub2_2.method6002(local7[local11]);
				} else if (arg0 == 4) {
					Static414.method5552(Static73.aClass92_57);
					Static302.aClass3_Sub2_Sub2_2.method5996(local7[local11]);
					Static302.aClass3_Sub2_Sub2_2.method6034(0);
				} else if (arg0 == 5) {
					Static414.method5552(Static414.aClass92_237);
					Static302.aClass3_Sub2_Sub2_2.method6030(0);
					Static302.aClass3_Sub2_Sub2_2.method6045(local7[local11]);
				} else if (arg0 == 6) {
					Static414.method5552(Static256.aClass92_155);
					Static302.aClass3_Sub2_Sub2_2.method6034(0);
					Static302.aClass3_Sub2_Sub2_2.method5996(local7[local11]);
				} else if (arg0 == 7) {
					Static414.method5552(Static98.aClass92_74);
					Static302.aClass3_Sub2_Sub2_2.method5996(local7[local11]);
					Static302.aClass3_Sub2_Sub2_2.method6034(0);
				}
				break;
			}
		}
		if (!local9) {
			Static206.method3380(Static84.aClass175_59.method4201(Static216.anInt4257) + arg1);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBI)V")
	public static void method5841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static139.method2522(15, 0);
		local15.method1570();
		local15.anInt1933 = arg1;
		local15.anInt1930 = arg0;
	}
}
