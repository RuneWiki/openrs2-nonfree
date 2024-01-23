import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!mj", name = "bb", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array8;

	@OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
	public static int anInt3879 = 50;

	@OriginalMember(owner = "client!mj", name = "Q", descriptor = "[I")
	public static int[] anIntArray345 = new int[anInt3879];

	@OriginalMember(owner = "client!mj", name = "R", descriptor = "[I")
	public static int[] anIntArray346 = new int[anInt3879];

	@OriginalMember(owner = "client!mj", name = "X", descriptor = "[I")
	public static int[] anIntArray347 = new int[anInt3879];

	@OriginalMember(owner = "client!mj", name = "Y", descriptor = "[I")
	public static int[] anIntArray348 = new int[anInt3879];

	@OriginalMember(owner = "client!mj", name = "ab", descriptor = "[I")
	public static int[] anIntArray349 = new int[anInt3879];

	@OriginalMember(owner = "client!mj", name = "db", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33 = new String[anInt3879];

	@OriginalMember(owner = "client!mj", name = "gb", descriptor = "[I")
	public static int[] anIntArray350 = new int[anInt3879];

	@OriginalMember(owner = "client!mj", name = "hb", descriptor = "[I")
	public static int[] anIntArray351 = new int[anInt3879];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!aj;)V")
	public static void method2803(@OriginalArg(0) Class7 arg0) {
		for (@Pc(2) int local2 = arg0.anInt214; local2 <= arg0.anInt218; local2++) {
			for (@Pc(9) int local9 = arg0.anInt220; local9 <= arg0.anInt212; local9++) {
				@Pc(22) Class1_Sub2 local22 = Static7.aClass1_Sub2ArrayArrayArray1[arg0.anInt222][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt45; local26++) {
						if (local22.aClass7Array1[local26] == arg0) {
							local22.anInt45--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt45; local44++) {
								local22.aClass7Array1[local44] = local22.aClass7Array1[local44 + 1];
								local22.anIntArray2[local44] = local22.anIntArray2[local44 + 1];
							}
							local22.aClass7Array1[local22.anInt45] = null;
							break;
						}
					}
					local22.anInt54 = 0;
					for (local26 = 0; local26 < local22.anInt45; local26++) {
						local22.anInt54 |= local22.anIntArray2[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public static void method2808(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(1, arg0);
		local8.method4464();
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)I")
	public static int method2812() {
		return 14;
	}
}
