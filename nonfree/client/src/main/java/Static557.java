import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method92(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static412.method5918(local18) : local18;
		} else if (arg1 instanceof Class230) {
			@Pc(34) Class230 local34 = (Class230) arg1;
			return local34.method5478();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
	public static int method95(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(24) int local24 = (local10 >>> 2 & 0xB3333333) + (local10 & 0x33333333);
		@Pc(37) int local37 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZZ)V")
	public static void method96(@OriginalArg(0) boolean arg0) {
		if (Static221.aString45.length() == 0) {
			return;
		}
		Static444.method6281("--> " + Static221.aString45);
		Static363.method5455(Static221.aString45, arg0, false);
		Static326.anInt5812 = 0;
		Static221.aString45 = "";
		Static292.anInt5390 = 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
	public static int method98(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBZII)V")
	public static void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static309.aClass100ArrayArrayArray2 == null) {
			Static185.aClass66_14.method6794(arg0, arg1, arg4, arg3, -16777216);
		} else if (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 >= 0 && Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 < Static38.anInt740 * 512 && Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 >= 0 && Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 < Static38.anInt741 * 512) {
			Static523.anInt8897++;
			if (Static129.aClass10_Sub1_Sub2_Sub2_1 != null && Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 + 256 - Static129.aClass10_Sub1_Sub2_Sub2_1.method7021() * 256 >> 9 == Static319.anInt5739 && Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 + 256 - Static129.aClass10_Sub1_Sub2_Sub2_1.method7021() * 256 >> 9 == Static435.anInt7462) {
				Static319.anInt5739 = -1;
				Static435.anInt7462 = -1;
				Static52.method798();
			}
			Static29.method531();
			if (!arg2) {
				Static220.method3805();
			}
			Static417.method6032();
			Static250.method4211(arg0, arg3, arg1, arg4, true);
			@Pc(108) int local108 = Static147.anInt3283;
			@Pc(110) int local110 = Static244.anInt4833;
			@Pc(112) int local112 = Static565.anInt9457;
			@Pc(114) int local114 = Static274.anInt5201;
			@Pc(133) int local133;
			@Pc(168) int local168;
			if (Static555.anInt9335 == 1) {
				local133 = (int) Static330.aFloat102;
				if (Static31.anInt591 >> 8 > local133) {
					local133 = Static31.anInt591 >> 8;
				}
				if (Static21.aBooleanArray5[4] && local133 < Static492.anIntArray655[4] + 128) {
					local133 = Static492.anIntArray655[4] + 128;
				}
				local168 = (int) Static477.aFloat164 + Static164.anInt3575 & 0x3FFF;
				Static126.method2698(local168, local133, (local133 >> 3) * 3 + 600 << 2, local110, Static303.anInt5529, Static195.anInt4188, Static160.method3164(Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934, Static320.anInt5748, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929) - 200);
			} else if (Static555.anInt9335 == 4) {
				local133 = (int) Static330.aFloat102;
				if (local133 < Static31.anInt591 >> 8) {
					local133 = Static31.anInt591 >> 8;
				}
				if (Static21.aBooleanArray5[4] && Static492.anIntArray655[4] + 128 > local133) {
					local133 = Static492.anIntArray655[4] + 128;
				}
				local168 = (int) Static477.aFloat164 & 0x3FFF;
				Static126.method2698(local168, local133, (local133 >> 3) * 3 + 600 << 2, local110, Static303.anInt5529, Static195.anInt4188, Static160.method3164(Static460.anInt7816, Static320.anInt5748, Static391.anInt6854) - 200);
			} else if (Static555.anInt9335 == 5) {
				Static434.method6167(local110);
			}
			local133 = Static473.anInt7978;
			local168 = Static569.anInt4616;
			@Pc(270) int local270 = Static563.anInt9436;
			@Pc(272) int local272 = Static348.anInt6087;
			@Pc(274) int local274 = Static37.anInt738;
			@Pc(317) int local317;
			for (@Pc(276) int local276 = 0; local276 < 5; local276++) {
				if (Static21.aBooleanArray5[local276]) {
					local317 = (int) (Math.random() * (double) (Static354.anIntArray513[local276] * 2 + 1) - (double) Static354.anIntArray513[local276] + Math.sin((double) Static133.anIntArray297[local276] * ((double) Static29.anIntArray110[local276] / 100.0D)) * (double) Static492.anIntArray655[local276]);
					if (local276 == 1) {
						Static569.anInt4616 += local317 << 2;
					}
					if (local276 == 2) {
						Static563.anInt9436 += local317 << 2;
					}
					if (local276 == 4) {
						Static348.anInt6087 += local317;
						if (Static348.anInt6087 < 1024) {
							Static348.anInt6087 = 1024;
						} else if (Static348.anInt6087 > 3072) {
							Static348.anInt6087 = 3072;
						}
					}
					if (local276 == 3) {
						Static37.anInt738 = local317 + Static37.anInt738 & 0x3FFF;
					}
					if (local276 == 0) {
						Static473.anInt7978 += local317 << 2;
					}
				}
			}
			if (Static473.anInt7978 < 0) {
				Static473.anInt7978 = 0;
			}
			if ((Static173.anInt3719 << 9) - 1 < Static473.anInt7978) {
				Static473.anInt7978 = (Static173.anInt3719 << 9) - 1;
			}
			if (Static563.anInt9436 < 0) {
				Static563.anInt9436 = 0;
			}
			if (Static563.anInt9436 > (Static357.anInt6212 << 9) - 1) {
				Static563.anInt9436 = (Static357.anInt6212 << 9) - 1;
			}
			Static164.method3180();
			Static2.method50();
			Static185.aClass66_14.ca(local108, local114, local108 + local112, local110 + local114);
			Static185.aClass66_14.method6795();
			local317 = Static148.anInt7119;
			if (Static122.aClass255_3 == null) {
				Static185.aClass66_14.D(local317);
			} else {
				Static122.aClass255_3.method5706(local108, Static185.aClass66_14, Static529.anInt8997 << 3, local110, local114, Static37.anInt738, local317, Static348.anInt6087, local112);
			}
			Static464.method6712();
			Static488.aClass134_6.pa(Static473.anInt7978, Static569.anInt4616, Static563.anInt9436, -Static348.anInt6087 & 0x3FFF, -Static37.anInt738 & 0x3FFF, -Static235.anInt4750 & 0x3FFF);
			Static185.aClass66_14.method6823(Static488.aClass134_6);
			Static185.aClass66_14.m(local108 + local112 / 2, local110 / 2 + local114, Static535.anInt9061 << 1, Static535.anInt9061 << 1);
			Static485.method6741(Static535.anInt9061 << 1, Static535.anInt9061 << 1, local110 / 2 + local114, local112 / 2 + local108);
			Static550.method7601(Static569.anInt4616, -Static235.anInt4750 & 0x3FFF, -Static348.anInt6087 & 0x3FFF, Static563.anInt9436, -Static37.anInt738 & 0x3FFF, Static473.anInt7978);
			@Pc(557) byte local557 = Static189.aClass4_Sub2_Sub1_1.method7667(Static403.anInt6994) == 2 ? (byte) Static523.anInt8897 : 1;
			Static266.method4354(Static185.aClass66_14, Static237.anInt7561, Static511.anInt940, Static488.aClass134_6, Static473.anInt7978, Static569.anInt4616, Static563.anInt9436, Static567.aByteArrayArrayArray21, Static8.anIntArray700, Static269.anIntArray445, Static242.anIntArray425, Static83.anIntArray721, Static277.anIntArray450, Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 + 1, local557, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 >> 9, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 >> 9, !Static189.aClass4_Sub2_Sub1_1.aBoolean652);
			Static464.method6712();
			if (Static598.anInt9831 == 10) {
				Static519.method7290(local114, local110, local112, local108);
				Static80.method1404(local108, local110, local114, local112);
				Static368.method5540(local112, local108, local110, local114);
				Static470.method6546(local108, local110, local114, local112);
			}
			Static174.method3326();
			Static37.anInt738 = local274;
			Static473.anInt7978 = local133;
			Static569.anInt4616 = local168;
			Static563.anInt9436 = local270;
			Static348.anInt6087 = local272;
			if (Static486.aBoolean563 && Static160.aClass207_1.method4636() == 0) {
				Static486.aBoolean563 = false;
			}
			if (Static486.aBoolean563) {
				Static185.aClass66_14.method6794(local112, local108, local110, local114, -16777216);
				Static433.method6141(Static275.aClass198_11.method4407(Static56.anInt953), false, Static185.aClass66_14, Static375.aClass91_7, Static162.aClass196_4);
			}
		} else {
			Static185.aClass66_14.method6794(arg0, arg1, arg4, arg3, -16777216);
		}
	}
}
