import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
	public static int anInt1251;

	@OriginalMember(owner = "client!bfa", name = "E", descriptor = "I")
	public static int anInt1252;

	@OriginalMember(owner = "client!bfa", name = "v", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_3 = new Class102(8);

	@OriginalMember(owner = "client!bfa", name = "F", descriptor = "[I")
	public static final int[] anIntArray35 = new int[1000];

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([I[IZ[ILclient!gt;)V")
	public static void method1333(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class4_Sub1_Sub2_Sub1_Sub1 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(18) int local18 = arg2[local7];
			@Pc(22) int local22 = arg0[local7];
			@Pc(26) int local26 = arg1[local7];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg3.aClass256Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg3.aClass256Array3[local28] = null;
					} else {
						@Pc(46) Class361 local46 = Static115.aClass227_1.method5968(local18);
						@Pc(49) int local49 = local46.anInt9867;
						@Pc(54) Class256 local54 = arg3.aClass256Array3[local28];
						if (local54 != null) {
							if (local54.anInt7639 == local18) {
								if (local49 == 0) {
									local54 = arg3.aClass256Array3[local28] = null;
								} else if (local49 == 1) {
									local54.anInt7629 = 0;
									local54.anInt7637 = 1;
									local54.anInt7631 = 0;
									local54.anInt7636 = local26;
									local54.anInt7633 = 0;
									if (!arg3.aBoolean405) {
										Static74.method1765(0, local46, arg3);
									}
								} else if (local49 == 2) {
									local54.anInt7633 = 0;
								}
							} else if (local46.anInt9855 >= Static115.aClass227_1.method5968(local54.anInt7639).anInt9855) {
								local54 = arg3.aClass256Array3[local28] = null;
							}
						}
						if (local54 == null) {
							local54 = arg3.aClass256Array3[local28] = new Class256();
							local54.anInt7629 = 0;
							local54.anInt7637 = 1;
							local54.anInt7639 = local18;
							local54.anInt7631 = 0;
							local54.anInt7636 = local26;
							local54.anInt7633 = 0;
							if (!arg3.aBoolean405) {
								Static74.method1765(0, local46, arg3);
							}
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZIII)I")
	public static int method1335(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub32 local8 = Static210.method3568(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray267.length) {
			return local8.anIntArray267[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Z)V")
	public static void method1336() {
		Static615.method8508();
	}
}
