import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public static int anInt4801 = 16777215;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public static int anInt4802 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public static void method3898() {
		if (Static296.anInt2704 == 5) {
			Static296.anInt2704 = 6;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZZ)V")
	public static void method3899(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static173.aClass1_Sub1_Sub1_1.method150(Static283.anInt4985) >= 15) {
				@Pc(16) int local16 = Static173.aClass1_Sub1_Sub1_1.method146(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static410.aClass26_Sub2_Sub2_Sub2Array1[local16] == null) {
						Static410.aClass26_Sub2_Sub2_Sub2Array1[local16] = new Class26_Sub2_Sub2_Sub2();
						Static410.aClass26_Sub2_Sub2_Sub2Array1[local16].anInt7097 = local16;
						local21 = true;
					}
					@Pc(42) Class26_Sub2_Sub2_Sub2 local42 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local16];
					Static212.anIntArray28[Static288.anInt5039++] = local16;
					local42.anInt7098 = Static403.anInt6978;
					if (local42.aClass66_1 != null && local42.aClass66_1.method1456()) {
						Static425.method5710(local42);
					}
					@Pc(73) int local73 = Static173.aClass1_Sub1_Sub1_1.method146(1);
					@Pc(80) int local80;
					if (arg0) {
						local80 = Static173.aClass1_Sub1_Sub1_1.method146(8);
						if (local80 > 127) {
							local80 -= 256;
						}
					} else {
						local80 = Static173.aClass1_Sub1_Sub1_1.method146(5);
						if (local80 > 15) {
							local80 -= 32;
						}
					}
					@Pc(102) int local102 = Static173.aClass1_Sub1_Sub1_1.method146(2);
					@Pc(107) int local107 = Static173.aClass1_Sub1_Sub1_1.method146(1);
					if (local107 == 1) {
						Static178.anIntArray272[Static74.anInt1467++] = local16;
					}
					local42.method5546(Static322.aClass187_2.method4504(Static173.aClass1_Sub1_Sub1_1.method146(14)));
					@Pc(139) int local139 = Static173.aClass1_Sub1_Sub1_1.method146(3) + 4 << 11 & 0x3E75;
					@Pc(146) int local146;
					if (arg0) {
						local146 = Static173.aClass1_Sub1_Sub1_1.method146(8);
						if (local146 > 127) {
							local146 -= 256;
						}
					} else {
						local146 = Static173.aClass1_Sub1_Sub1_1.method146(5);
						if (local146 > 15) {
							local146 -= 32;
						}
					}
					local42.method5539(local42.aClass66_1.anInt1717);
					local42.anInt7126 = local42.aClass66_1.anInt1704 << 3;
					if (local42.anInt7126 == 0) {
						local42.method5537(0);
					} else if (local21) {
						local42.method5537(local139);
					}
					local42.method5545(local102, Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray589[0] + local146, local73 == 1, Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray590[0] + local80, local42.method5535());
					if (local42.aClass66_1.method1456()) {
						Static409.method5547(0, local42.aByte95, null, local42.anIntArray590[0], local42.anIntArray589[0], local42, null);
					}
					continue;
				}
			}
			Static173.aClass1_Sub1_Sub1_1.method148();
			return;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZIIZ)V")
	public static void method3900(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static429.aLong216 = 0L;
		@Pc(13) int local13 = Static131.method5612();
		if (arg3 == 3 || local13 == 3) {
			arg1 = true;
		}
		if (!Static276.aClass109_10.method4754()) {
			arg1 = true;
		}
		Static219.method3314(arg0, arg2, local13, arg3, arg1);
	}
}
