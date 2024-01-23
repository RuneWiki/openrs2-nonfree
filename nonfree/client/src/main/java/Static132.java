import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[Lclient!pc;")
	public static Class134[] aClass134Array2;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString93 = "";

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString94 = "Loading world list data";

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!l;")
	public static Class98 aClass98_16 = new Class98(50);

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!l;")
	public static Class98 aClass98_17 = new Class98(8);

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	public static void method2216() {
		Static123.aClass98_15.method2572();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	public static void method2217() {
		for (@Pc(1) int local1 = 0; local1 < Static158.anInt2948; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static295.anInt4973; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static307.anInt6023; local11++) {
					@Pc(22) Class3_Sub25 local22 = Static146.aClass3_Sub25ArrayArrayArray7[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class19 local27 = local22.aClass19_1;
						if (local27 != null && local27.aClass10_3.method4976()) {
							Static32.method504(local27.aClass10_3, local1, local6, local11, 1, 1);
							if (local27.aClass10_2 != null && local27.aClass10_2.method4976()) {
								Static32.method504(local27.aClass10_2, local1, local6, local11, 1, 1);
								local27.aClass10_3.method4983(local27.aClass10_2, 0, 0, 0, false);
								local27.aClass10_2 = local27.aClass10_2.method4972();
							}
							local27.aClass10_3 = local27.aClass10_3.method4972();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt4483; local83++) {
							@Pc(92) Class85 local92 = local22.aClass85Array3[local83];
							if (local92 != null && local92.aClass10_7.method4976()) {
								Static32.method504(local92.aClass10_7, local1, local6, local11, local92.anInt2474 + 1 - local92.anInt2482, local92.anInt2478 - local92.anInt2480 + 1);
								local92.aClass10_7 = local92.aClass10_7.method4972();
							}
						}
						@Pc(131) Class13 local131 = local22.aClass13_1;
						if (local131 != null && local131.aClass10_1.method4976()) {
							Static54.method837(local131.aClass10_1, local1, local6, local11);
							local131.aClass10_1 = local131.aClass10_1.method4972();
						}
					}
				}
			}
		}
	}
}
