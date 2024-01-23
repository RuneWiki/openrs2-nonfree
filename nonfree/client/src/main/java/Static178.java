import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!rg", name = "ib", descriptor = "I")
	public static int anInt4146;

	@OriginalMember(owner = "client!rg", name = "jb", descriptor = "Lclient!oe;")
	public static Class72 aClass72_244;

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "Lclient!qe;")
	private static Class78 aClass78_716 = Static199.method3560("Players");

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_717 = Static199.method3560("compass");

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "Lclient!jh;")
	public static Class53 aClass53_15 = new Class53(50);

	@OriginalMember(owner = "client!rg", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_718 = aClass78_716;

	@OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
	public static int anInt4142 = 0;

	@OriginalMember(owner = "client!rg", name = "hb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_719 = Static199.method3560("<col=ffff00>");

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(III)V")
	public static void method3271() {
		for (@Pc(1) int local1 = 0; local1 < Static78.anInt1716; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static173.anInt3981; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static159.anInt4174; local7++) {
					@Pc(16) Class2_Sub12 local16 = Static226.aClass2_Sub12ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class27 local21 = local16.aClass27_1;
						if (local21 != null && local21.aClass5_2.method3772()) {
							Static202.method3585(local21.aClass5_2, local1, local4, local7, 1, 1);
							if (local21.aClass5_3 != null && local21.aClass5_3.method3772()) {
								Static202.method3585(local21.aClass5_3, local1, local4, local7, 1, 1);
								local21.aClass5_2.method3771(local21.aClass5_3, 0, 0, 0, false);
								local21.aClass5_3 = local21.aClass5_3.method3781();
							}
							local21.aClass5_2 = local21.aClass5_2.method3781();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt775; local77++) {
							@Pc(83) Class100 local83 = local16.aClass100Array3[local77];
							if (local83 != null && local83.aClass5_8.method3772()) {
								Static202.method3585(local83.aClass5_8, local1, local4, local7, local83.anInt4525 + 1 - local83.anInt4529, local83.anInt4528 - local83.anInt4517 + 1);
								local83.aClass5_8 = local83.aClass5_8.method3781();
							}
						}
						@Pc(125) Class106 local125 = local16.aClass106_1;
						if (local125 != null && local125.aClass5_11.method3772()) {
							Static170.method3113(local125.aClass5_11, local1, local4, local7);
							local125.aClass5_11 = local125.aClass5_11.method3781();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)V")
	public static void method3272() {
		for (@Pc(1) int local1 = 0; local1 < Static14.anInt3439; local1++) {
			@Pc(9) Class2_Sub3_Sub19 local9 = Static169.method3105(local1);
			if (local9 != null && local9.anInt2831 == 0) {
				Static94.anIntArray369[local1] = 0;
				Static198.anIntArray724[local1] = 0;
			}
		}
		Static213.aClass103_11 = new Class103(16);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
	public static void method3274() {
		@Pc(14) int local14 = Static32.anInt4049 - (int) ((double) Static118.aClass64_8.anInt3021 / Static174.aDouble11);
		@Pc(23) int local23 = (int) ((double) Static118.aClass64_8.anInt3021 / Static174.aDouble11) + Static32.anInt4049;
		@Pc(33) int local33 = Static223.anInt4831 - (int) ((double) Static118.aClass64_8.anInt3040 / Static174.aDouble11);
		if (local14 < 0) {
			Static22.anInt416 = -1;
			Static32.anInt4049 = (int) ((double) Static118.aClass64_8.anInt3021 / Static174.aDouble11);
			Static4.anInt123 = -1;
		}
		if (local23 > Static151.anInt3457) {
			Static32.anInt4049 = Static151.anInt3457 - (int) ((double) Static118.aClass64_8.anInt3021 / Static174.aDouble11);
			Static4.anInt123 = -1;
			Static22.anInt416 = -1;
		}
		@Pc(76) int local76 = (int) ((double) Static118.aClass64_8.anInt3040 / Static174.aDouble11) + Static223.anInt4831;
		if (local33 < 0) {
			Static4.anInt123 = -1;
			Static22.anInt416 = -1;
			Static223.anInt4831 = (int) ((double) Static118.aClass64_8.anInt3040 / Static174.aDouble11);
		}
		if (local76 > Static30.anInt547) {
			Static22.anInt416 = -1;
			Static223.anInt4831 = Static30.anInt547 - (int) ((double) Static118.aClass64_8.anInt3040 / Static174.aDouble11);
			Static4.anInt123 = -1;
		}
	}
}
