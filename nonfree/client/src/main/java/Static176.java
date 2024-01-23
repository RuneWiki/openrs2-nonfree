import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!vl;")
	public static Class187 aClass187_7;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Lclient!in;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray50 = new int[5][5000];

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method4595() {
		if (Static313.aClass101_2 != null) {
			Static313.aClass101_2.method2814();
		}
		if (Static199.aClass101_1 != null) {
			Static199.aClass101_1.method2814();
		}
		Static90.method3646(Static119.aBoolean428);
		Static313.aClass101_2 = Static280.method4158(22050, Static117.aClass117_3, 0, Static304.aCanvas1);
		Static313.aClass101_2.method2809(Static172.aClass1_Sub4_Sub3_2);
		Static199.aClass101_1 = Static280.method4158(2048, Static117.aClass117_3, 1, Static304.aCanvas1);
		Static199.aClass101_1.method2809(Static303.aClass1_Sub4_Sub2_2);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
	public static void method4598(@OriginalArg(0) int arg0) {
		if (Static258.anInt5016 == arg0) {
			return;
		}
		@Pc(29) boolean local29 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (Static258.anInt5016 == 0) {
			Static209.method3311();
		}
		if (arg0 == 40) {
			Static115.method1842();
		}
		if (arg0 != 40 && Static147.aClass7_4 != null) {
			Static147.aClass7_4.method105();
			Static147.aClass7_4 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static300.anInt5677 = 0;
			Static210.anInt4147 = 1;
			Static121.anInt2452 = 0;
			Static233.anInt4697 = 0;
			Static13.anInt220 = 1;
			Static162.method2753(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static268.method4661();
		}
		if (arg0 == 5) {
			Static215.method3398(Static241.aClass138_64);
		} else {
			Static168.method4613();
		}
		@Pc(114) boolean local114 = Static258.anInt5016 == 5 || Static258.anInt5016 == 10 || Static258.anInt5016 == 28;
		if (local29 != local114) {
			if (local29) {
				Static142.anInt2796 = Static215.anInt4228;
				if (Static311.anInt5846 == 0) {
					Static59.method1015();
				} else {
					Static45.method812(Static132.aClass138_42, 255, Static215.anInt4228);
				}
				Static272.aClass40_2.method852(false);
			} else {
				Static59.method1015();
				Static272.aClass40_2.method852(true);
			}
		}
		if (Static291.aBoolean404 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static291.method4312();
		}
		Static258.anInt5016 = arg0;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public static void method4599() {
		Static29.aClass156_1.method3826();
		Static51.aClass5_6.method55();
		Static73.aClass5_9.method55();
	}
}
