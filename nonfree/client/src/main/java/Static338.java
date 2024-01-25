import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
	public static int anInt5777;

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
	public static int anInt5786;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
	public static int anInt5778 = 0;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "Z")
	public static boolean aBoolean660 = false;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "[I")
	public static int[] anIntArray396 = new int[2];

	@OriginalMember(owner = "client!qs", name = "A", descriptor = "[I")
	public static final int[] anIntArray397 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	public static void method4535() {
		if (Static453.aClass136_Sub1_1.method3522(Static14.anInt293) || Static456.anInt7534 == Static265.anInt4807) {
			Static334.method4489(Static185.aClass34_7);
			if (Static216.anInt3861 != Static265.anInt4807) {
				Static319.method4282();
			}
		} else {
			Static56.method981(10, Static432.anInt7295, false, Static414.anInt6796);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4536(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(15) int local15 = Static285.anInt5015;
		@Pc(17) int[] local17 = Static103.anIntArray135;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(29) Class25_Sub5_Sub1_Sub2 local29 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local17[local21]];
			if (local29 != null && local29 != Static447.aClass25_Sub5_Sub1_Sub2_4 && local29.aString51 != null && local29.aString51.equalsIgnoreCase(arg1)) {
				local19 = true;
				if (arg0 == 1) {
					Static52.method867(Static164.aClass103_119);
					Static18.aClass1_Sub28_Sub1_1.method5395(local17[local21]);
					Static18.aClass1_Sub28_Sub1_1.method5376(0);
				} else if (arg0 == 4) {
					Static52.method867(Static297.aClass103_211);
					Static18.aClass1_Sub28_Sub1_1.method5359(local17[local21]);
					Static18.aClass1_Sub28_Sub1_1.method5398(0);
				} else if (arg0 == 5) {
					Static52.method867(Static84.aClass103_48);
					Static18.aClass1_Sub28_Sub1_1.method5376(0);
					Static18.aClass1_Sub28_Sub1_1.method5395(local17[local21]);
				} else if (arg0 == 6) {
					Static52.method867(Static9.aClass103_7);
					Static18.aClass1_Sub28_Sub1_1.method5393(local17[local21]);
					Static18.aClass1_Sub28_Sub1_1.method5376(0);
				} else if (arg0 == 7) {
					Static52.method867(Static303.aClass103_256);
					Static18.aClass1_Sub28_Sub1_1.method5398(0);
					Static18.aClass1_Sub28_Sub1_1.method5395(local17[local21]);
				}
				break;
			}
		}
		if (!local19) {
			Static208.method2938(Static170.aClass119_80.method2673(Static394.anInt6582) + arg1);
		}
	}
}
