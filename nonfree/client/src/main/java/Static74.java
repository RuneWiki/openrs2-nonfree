import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "Lclient!bn;")
	public static Class38 aClass38_3;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
	public static int anInt8666;

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBZII)V")
	public static void method7242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static256.aClass224ArrayArrayArray1 == null) {
			Static323.aClass9_8.method5409(arg0, arg1, -16777216, arg3, arg4);
		} else if (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >= 0 && Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 < Static228.anInt4746 * 512 && Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >= 0 && Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 < Static44.anInt1275 * 512) {
			Static555.anInt9478++;
			if (Static350.aClass11_Sub1_Sub1_Sub2_4 != null && Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 - (Static350.aClass11_Sub1_Sub1_Sub2_4.method6212() - 1) * 256 >> 9 == Static350.anInt5889 && Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 + 256 - Static350.aClass11_Sub1_Sub1_Sub2_4.method6212() * 256 >> 9 == Static484.anInt8777) {
				Static484.anInt8777 = -1;
				Static350.anInt5889 = -1;
				Static218.method3985();
			}
			Static505.method7520();
			if (!arg2) {
				Static218.method3984();
			}
			Static476.method7285();
			Static283.method4648(arg0, true, arg3, arg1, arg4);
			@Pc(114) int local114 = Static272.anInt5327;
			@Pc(116) int local116 = Static386.anInt7239;
			@Pc(118) int local118 = Static16.anInt779;
			@Pc(120) int local120 = Static512.anInt8696;
			@Pc(129) int local129;
			@Pc(168) int local168;
			if (Static84.anInt1994 == 1) {
				local129 = (int) Static200.aFloat100;
				if (local129 < Static263.anInt5268 >> 8) {
					local129 = Static263.anInt5268 >> 8;
				}
				if (Static518.aBooleanArray39[4] && local129 < Static556.anIntArray818[4] + 128) {
					local129 = Static556.anIntArray818[4] + 128;
				}
				local168 = (int) Static412.aFloat175 + Static416.anInt7786 & 0x3FFF;
				Static480.method7894(Static252.anInt5119, Static482.method7333(Static493.anInt8836, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347) - 200, local118, Static357.anInt6870, (local129 >> 3) * 3 + 600 << 2, local168, local129);
			} else if (Static84.anInt1994 == 4) {
				local129 = (int) Static200.aFloat100;
				if (local129 < Static263.anInt5268 >> 8) {
					local129 = Static263.anInt5268 >> 8;
				}
				if (Static518.aBooleanArray39[4] && local129 < Static556.anIntArray818[4] + 128) {
					local129 = Static556.anIntArray818[4] + 128;
				}
				local168 = (int) Static412.aFloat175 & 0x3FFF;
				Static480.method7894(Static252.anInt5119, Static482.method7333(Static493.anInt8836, Static131.anInt2843, Static99.anInt2351) - 200, local118, Static357.anInt6870, (local129 >> 3) * 3 + 600 << 2, local168, local129);
			} else if (Static84.anInt1994 == 5) {
				Static408.method6369(local118);
			}
			local129 = Static86.anInt2132;
			local168 = Static5.anInt142;
			@Pc(283) int local283 = Static390.anInt7318;
			@Pc(285) int local285 = Static348.anInt6726;
			@Pc(287) int local287 = Static393.anInt7341;
			@Pc(331) int local331;
			for (@Pc(289) int local289 = 0; local289 < 5; local289++) {
				if (Static518.aBooleanArray39[local289]) {
					local331 = (int) ((double) -Static205.anIntArray283[local289] + (double) (Static205.anIntArray283[local289] * 2 + 1) * Math.random() + Math.sin((double) Static314.anIntArray573[local289] * ((double) Static115.anIntArray203[local289] / 100.0D)) * (double) Static556.anIntArray818[local289]);
					if (local289 == 1) {
						Static5.anInt142 += local331 << 2;
					}
					if (local289 == 3) {
						Static393.anInt7341 = Static393.anInt7341 + local331 & 0x3FFF;
					}
					if (local289 == 0) {
						Static86.anInt2132 += local331 << 2;
					}
					if (local289 == 2) {
						Static390.anInt7318 += local331 << 2;
					}
					if (local289 == 4) {
						Static348.anInt6726 += local331;
						if (Static348.anInt6726 < 1024) {
							Static348.anInt6726 = 1024;
						} else if (Static348.anInt6726 > 3072) {
							Static348.anInt6726 = 3072;
						}
					}
				}
			}
			if (Static86.anInt2132 < 0) {
				Static86.anInt2132 = 0;
			}
			if (Static390.anInt7318 < 0) {
				Static390.anInt7318 = 0;
			}
			if (Static86.anInt2132 > (Static396.anInt7505 << 9) - 1) {
				Static86.anInt2132 = (Static396.anInt7505 << 9) - 1;
			}
			if ((Static54.anInt1441 << 9) - 1 < Static390.anInt7318) {
				Static390.anInt7318 = (Static54.anInt1441 << 9) - 1;
			}
			Static299.method4860();
			Static307.method1301();
			Static323.aClass9_8.ca(local120, local116, local120 + local114, local116 + local118);
			Static323.aClass9_8.method5430();
			local331 = Static263.anInt5267;
			if (aClass38_3 == null) {
				Static323.aClass9_8.D(local331);
			} else {
				aClass38_3.method1132(local116, local120, Static432.anInt7891 << 3, Static348.anInt6726, local114, local331, Static323.aClass9_8, local118, Static393.anInt7341);
			}
			Static186.method3607();
			Static19.aClass8_2.pa(Static86.anInt2132, Static5.anInt142, Static390.anInt7318, -Static348.anInt6726 & 0x3FFF, -Static393.anInt7341 & 0x3FFF, -Static268.anInt9015 & 0x3FFF);
			Static323.aClass9_8.method5429(Static19.aClass8_2);
			Static323.aClass9_8.m(local120 + local114 / 2, local116 - -(local118 / 2), Static374.anInt7026 << 1, Static374.anInt7026 << 1);
			Static428.method7183(Static374.anInt7026 << 1, local118 / 2 + local116, Static374.anInt7026 << 1, local120 + local114 / 2);
			Static6.method498(Static86.anInt2132, Static5.anInt142, -Static348.anInt6726 & 0x3FFF, -Static268.anInt9015 & 0x3FFF, Static390.anInt7318, -Static393.anInt7341 & 0x3FFF);
			@Pc(569) byte local569 = Static104.aClass6_Sub6_Sub1_4.method1070(Static5.anInt145) == 2 ? (byte) Static555.anInt9478 : 1;
			Static276.method4586(Static323.aClass9_8, Static508.anInt8998, Static43.anInt1257, Static19.aClass8_2, Static86.anInt2132, Static5.anInt142, Static390.anInt7318, Static68.aByteArrayArrayArray4, Static484.anIntArray773, Static564.anIntArray823, Static429.anIntArray567, Static493.anIntArray777, Static9.anIntArray43, Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 + 1, local569, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 9, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 9, !Static104.aClass6_Sub6_Sub1_4.aBoolean131);
			Static186.method3607();
			if (Static325.anInt6149 == 10) {
				Static421.method6528(local116, local120, local118, local114);
				Static252.method4419(local120, local118, local114, local116);
				Static58.method1303(local116, local120, local118, local114);
				Static273.method4577(local116, local120, local114, local118);
			}
			Static240.method4635();
			Static390.anInt7318 = local283;
			Static348.anInt6726 = local285;
			Static86.anInt2132 = local129;
			Static5.anInt142 = local168;
			Static393.anInt7341 = local287;
			if (Static474.aBoolean645 && Static352.aClass228_3.method5709() == 0) {
				Static474.aBoolean645 = false;
			}
			if (Static474.aBoolean645) {
				Static323.aClass9_8.method5409(local118, local114, -16777216, local116, local120);
				Static526.method7658(Static222.aClass152_11.method4002(Static286.anInt5468), false, Static42.aClass73_1);
			}
		} else {
			Static323.aClass9_8.method5409(arg0, arg1, -16777216, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public static void method7243() {
		Static471.anInt8685 = 0;
		Static397.anInt7513 = 0;
		Static214.anInt4563 = 0;
		Static435.anInt7938 = 0;
	}
}
