import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!cd;")
	public static Class6_Sub3_Sub3_Sub1 aClass6_Sub3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!ge;")
	public static Class7 aClass7_28;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_784 = Static80.method1463("Freunde");

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!rd;")
	public static Class63 aClass63_785 = Static80.method1463("welle2:");

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!rd;")
	private static Class63 aClass63_786 = Static80.method1463("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_787 = aClass63_786;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	public static int anInt1509 = 0;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_788 = Static80.method1463("@gr3@");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
	public static void method1031(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static123.aClass6_Sub3_Sub3_Sub2_6.anIntArray221;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(41) int local41;
		@Pc(43) int local43;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local41 = (52736 - local29 * 512) * 4 + 24628;
			for (local43 = 1; local43 < 103; local43++) {
				if ((Static103.aByteArrayArrayArray92[arg0][local43][local29] & 0x18) == 0) {
					Static76.aClass19_1.method659(local8, local41, arg0, local43, local29);
				}
				if (arg0 < 3 && (Static103.aByteArrayArrayArray92[arg0 + 1][local43][local29] & 0x8) != 0) {
					Static76.aClass19_1.method659(local8, local41, arg0 + 1, local43, local29);
				}
				local41 += 4;
			}
		}
		Static123.aClass6_Sub3_Sub3_Sub2_6.method1256();
		local41 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		local43 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(157) int local157;
		for (@Pc(153) int local153 = 1; local153 < 103; local153++) {
			for (local157 = 1; local157 < 103; local157++) {
				if ((Static103.aByteArrayArrayArray92[arg0][local157][local153] & 0x18) == 0) {
					Static7.method120(local157, local153, arg0, local43, local41);
				}
				if (arg0 < 3 && (Static103.aByteArrayArrayArray92[arg0 + 1][local157][local153] & 0x8) != 0) {
					Static7.method120(local157, local153, arg0 + 1, local43, local41);
				}
			}
		}
		Static116.anInt3159 = 0;
		for (local157 = 0; local157 < 104; local157++) {
			for (@Pc(222) int local222 = 0; local222 < 104; local222++) {
				@Pc(230) int local230 = Static76.aClass19_1.method694(Static101.anInt2810, local157, local222);
				if (local230 != 0) {
					local230 = local230 >> 14 & 0x7FFF;
					@Pc(246) int local246 = Static123.method2172(local230).anInt1670;
					if (local246 >= 0) {
						@Pc(250) int local250 = local157;
						@Pc(252) int local252 = local222;
						if (local246 != 22 && local246 != 29 && local246 != 34 && local246 != 36 && local246 != 46 && local246 != 47 && local246 != 48) {
							@Pc(282) int[][] local282 = Static15.aClass30Array1[Static101.anInt2810].anIntArrayArray18;
							for (@Pc(284) int local284 = 0; local284 < 10; local284++) {
								@Pc(291) int local291 = (int) (Math.random() * 4.0D);
								if (local291 == 0 && local250 > 0 && local250 > local157 - 3 && (local282[local250 - 1][local252] & 0x1280108) == 0) {
									local250--;
								}
								if (local291 == 1 && local250 < 103 && local250 < local157 + 3 && (local282[local250 + 1][local252] & 0x1280180) == 0) {
									local250++;
								}
								if (local291 == 2 && local252 > 0 && local222 - 3 < local252 && (local282[local250][local252 - 1] & 0x1280102) == 0) {
									local252--;
								}
								if (local291 == 3 && local252 < 103 && local222 + 3 > local252 && (local282[local250][local252 + 1] & 0x1280120) == 0) {
									local252++;
								}
							}
						}
						Static94.aClass6_Sub3_Sub3_Sub2Array8[Static116.anInt3159] = Static116.aClass6_Sub3_Sub3_Sub2Array12[local246];
						Static72.anIntArray232[Static116.anInt3159] = local250;
						Static30.anIntArray124[Static116.anInt3159] = local252;
						Static116.anInt3159++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method1032() {
		aClass63_786 = null;
		aClass63_784 = null;
		aClass6_Sub3_Sub3_Sub1_2 = null;
		aClass7_28 = null;
		aClass63_788 = null;
		aClass63_785 = null;
		aClass63_787 = null;
	}
}
