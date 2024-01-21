import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array2;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!hb;")
	public static Class4_Sub2_Sub8 aClass4_Sub2_Sub8_1;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!gd;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!ja;")
	private static Class39 aClass39_206 = Static28.method504("Continue");

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_205 = aClass39_206;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method186() {
		Static35.aClass4_Sub16_Sub1_1.method1494();
		@Pc(13) int local13 = Static35.aClass4_Sub16_Sub1_1.method1500(8);
		@Pc(30) int local30;
		if (local13 < Static72.anInt799) {
			for (local30 = local13; local30 < Static72.anInt799; local30++) {
				Static38.anIntArray103[Static113.anInt2837++] = Static33.anIntArray94[local30];
			}
		}
		if (Static72.anInt799 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static72.anInt799 = 0;
		for (local30 = 0; local30 < local13; local30++) {
			@Pc(72) int local72 = Static33.anIntArray94[local30];
			@Pc(76) Class4_Sub2_Sub1_Sub1_Sub2 local76 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local72];
			@Pc(81) int local81 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
			if (local81 == 0) {
				Static33.anIntArray94[Static72.anInt799++] = local72;
				local76.anInt2681 = Static71.anInt1738;
			} else {
				@Pc(104) int local104 = Static35.aClass4_Sub16_Sub1_1.method1500(2);
				if (local104 == 0) {
					Static33.anIntArray94[Static72.anInt799++] = local72;
					local76.anInt2681 = Static71.anInt1738;
					Static35.anIntArray101[Static30.anInt785++] = local72;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local104 == 1) {
						Static33.anIntArray94[Static72.anInt799++] = local72;
						local76.anInt2681 = Static71.anInt1738;
						local148 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
						local76.method1909(false, local148);
						local158 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
						if (local158 == 1) {
							Static35.anIntArray101[Static30.anInt785++] = local72;
						}
					} else if (local104 == 2) {
						Static33.anIntArray94[Static72.anInt799++] = local72;
						local76.anInt2681 = Static71.anInt1738;
						local148 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
						local76.method1909(true, local148);
						local158 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
						local76.method1909(true, local158);
						@Pc(212) int local212 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
						if (local212 == 1) {
							Static35.anIntArray101[Static30.anInt785++] = local72;
						}
					} else if (local104 == 3) {
						Static38.anIntArray103[Static113.anInt2837++] = local72;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method187(@OriginalArg(1) int arg0) {
		if (Static32.aClass4_Sub20Array1 != null && arg0 >= 0 && arg0 < Static32.aClass4_Sub20Array1.length && Static32.aClass4_Sub20Array1[arg0] != null) {
			Static114.aClass4_Sub16_Sub1_3.method1499(255);
			Static114.aClass4_Sub16_Sub1_3.method1457(Static32.aClass4_Sub20Array1[arg0].aLong155);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	public static void method188(@OriginalArg(1) int arg0) {
		Static130.anInt3175 += arg0 * 128;
		@Pc(25) int local25;
		if (Static130.anInt3175 > Static64.anIntArray177.length) {
			Static130.anInt3175 -= Static64.anIntArray177.length;
			local25 = (int) (Math.random() * 12.0D);
			Static121.method2079(Static111.aClass4_Sub2_Sub3_Sub4Array7[local25]);
		}
		@Pc(36) int local36 = arg0 * 128;
		local25 = 0;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(74) int local74;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local74 = Static113.anIntArray306[local25 + local36] - Static64.anIntArray177[Static64.anIntArray177.length - 1 & Static130.anInt3175 + local25] * arg0 / 6;
			if (local74 < 0) {
				local74 = 0;
			}
			Static113.anIntArray306[local25++] = local74;
		}
		@Pc(100) int local100;
		@Pc(102) int local102;
		@Pc(109) int local109;
		for (local74 = 256 - arg0; local74 < 256; local74++) {
			local100 = local74 * 128;
			for (local102 = 0; local102 < 128; local102++) {
				local109 = (int) (Math.random() * 100.0D);
				if (local109 < 50 && local102 > 10 && local102 < 118) {
					Static113.anIntArray306[local100 + local102] = 255;
				} else {
					Static113.anIntArray306[local102 + local100] = 0;
				}
			}
		}
		if (Static6.anInt244 > 0) {
			Static6.anInt244 -= arg0 * 4;
		}
		if (Static36.anInt910 > 0) {
			Static36.anInt910 -= arg0 * 4;
		}
		if (Static6.anInt244 == 0 && Static36.anInt910 == 0) {
			local100 = (int) (Math.random() * (double) (2000 / arg0));
			if (local100 == 1) {
				Static36.anInt910 = 1024;
			}
			if (local100 == 0) {
				Static6.anInt244 = 1024;
			}
		}
		for (local100 = 0; local100 < 256 - arg0; local100++) {
			Static85.anIntArray223[local100] = Static85.anIntArray223[arg0 + local100];
		}
		for (local102 = 256 - arg0; local102 < 256; local102++) {
			Static85.anIntArray223[local102] = (int) (Math.sin((double) Static14.anInt364 / 14.0D) * 16.0D + Math.sin((double) Static14.anInt364 / 15.0D) * 14.0D + Math.sin((double) Static14.anInt364 / 16.0D) * 12.0D);
			Static14.anInt364++;
		}
		Static106.anInt2594 += arg0;
		local109 = ((Static71.anInt1738 & 0x1) + arg0) / 2;
		if (local109 <= 0) {
			return;
		}
		@Pc(294) int local294;
		@Pc(301) int local301;
		for (@Pc(285) int local285 = 0; local285 < Static106.anInt2594 * 100; local285++) {
			local294 = (int) (Math.random() * 124.0D) + 2;
			local301 = (int) (Math.random() * 128.0D) + 128;
			Static113.anIntArray306[local294 + (local301 << 7)] = 192;
		}
		Static106.anInt2594 = 0;
		@Pc(332) int local332;
		@Pc(335) int local335;
		for (local294 = 0; local294 < 256; local294++) {
			local301 = 0;
			local332 = local294 * 128;
			for (local335 = -local109; local335 < 128; local335++) {
				if (local109 + local335 < 128) {
					local301 += Static113.anIntArray306[local109 + local335 + local332];
				}
				if (local335 - local109 - 1 >= 0) {
					local301 -= Static113.anIntArray306[local332 + local335 - local109 - 1];
				}
				if (local335 >= 0) {
					Static130.anIntArray365[local335 + local332] = local301 / (local109 * 2 + 1);
				}
			}
		}
		for (local301 = 0; local301 < 128; local301++) {
			local332 = 0;
			for (local335 = -local109; local335 < 256; local335++) {
				@Pc(418) int local418 = local335 * 128;
				if (local335 + local109 < 256) {
					local332 += Static130.anIntArray365[local301 + local418 + local109 * 128];
				}
				if (local335 - local109 - 1 >= 0) {
					local332 -= Static130.anIntArray365[local301 + local418 - local109 * 128 - 128];
				}
				if (local335 >= 0) {
					Static113.anIntArray306[local301 + local418] = local332 / (local109 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method189() {
		aClass4_Sub2_Sub8_1 = null;
		aClass39_206 = null;
		aClass31_1 = null;
		aClass39_205 = null;
		aClass4_Sub2_Sub3_Sub1Array2 = null;
		aCanvas1 = null;
		Class8.anIntArray29 = null;
	}
}
