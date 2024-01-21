import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2 aClass3_Sub2_Sub3_Sub2_5;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	public static int anInt3206;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1106 = Static65.method1172(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	public static int anInt3201 = 0;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1107 = Static65.method1172("null");

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public static int anInt3204 = 0;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "[I")
	public static int[] anIntArray369 = new int[5];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([SBII[Lclient!kb;)V")
	public static void method2326(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class46[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(24) int local24 = (arg2 + arg1) / 2;
		@Pc(26) int local26 = arg2;
		@Pc(30) Class46 local30 = arg3[local24];
		arg3[local24] = arg3[arg1];
		arg3[arg1] = local30;
		@Pc(44) short local44 = arg0[local24];
		arg0[local24] = arg0[arg1];
		arg0[arg1] = local44;
		for (@Pc(56) int local56 = arg2; local56 < arg1; local56++) {
			if (local30 == null || arg3[local56] != null && arg3[local56].method1378(local30) < (local56 & 0x1)) {
				@Pc(80) Class46 local80 = arg3[local56];
				arg3[local56] = arg3[local26];
				arg3[local26] = local80;
				@Pc(94) short local94 = arg0[local56];
				arg0[local56] = arg0[local26];
				arg0[local26++] = local94;
			}
		}
		arg3[arg1] = arg3[local26];
		arg3[local26] = local30;
		arg0[arg1] = arg0[local26];
		arg0[local26] = local44;
		method2326(arg0, local26 - 1, arg2, arg3);
		method2326(arg0, arg1, local26 + 1, arg3);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public static void method2327() {
		aClass46_1106 = null;
		aClass46_1107 = null;
		anIntArray369 = null;
		aClass3_Sub2_Sub3_Sub2_5 = null;
	}
}
