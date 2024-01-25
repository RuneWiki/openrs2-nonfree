import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
	public static int anInt4249;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Lclient!aa;")
	public static Class2_Sub1_Sub1 method3416(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub1 local15 = (Class2_Sub1_Sub1) Static187.aClass111_2.method2310((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static436.aClass171_96.method3658(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static104.method1543(local25);
			Static187.aClass111_2.method2312(local15, (long) arg0);
			return local15;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Z")
	public static boolean method3417() {
		try {
			return Static2.method32();
		} catch (@Pc(17) IOException local17) {
			Static75.method1141();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(80) String local80 = "T2 - " + (Static117.aClass25_55 == null ? -1 : Static117.aClass25_55.method473()) + "," + (Static463.aClass25_185 == null ? -1 : Static463.aClass25_185.method473()) + "," + (Static359.aClass25_154 == null ? -1 : Static359.aClass25_154.method473()) + " - " + Static302.anInt5465 + "," + (Static386.anInt7205 + Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0]) + "," + (Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0] + Static153.anInt2798) + " - ";
			for (@Pc(82) int local82 = 0; local82 < Static302.anInt5465 && local82 < 50; local82++) {
				local80 = local80 + Static202.aClass2_Sub17_Sub1_1.aByteArray94[local82] + ",";
			}
			Static22.method402(local22, local80);
			Static360.method5072(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BIIII)Z")
	public static boolean method3418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static326.aByteArrayArrayArray15[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static326.aByteArrayArrayArray15[arg0][arg3][arg2] & 0x10) == 0) {
			return arg1 == Static441.method5937(arg3, arg2, arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZ)V")
	public static void method3419(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static202.aClass2_Sub17_Sub1_1.method5581(Static302.anInt5465) >= 15) {
				@Pc(18) int local18 = Static202.aClass2_Sub17_Sub1_1.method5577(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class2_Sub34 local30 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local18);
					@Pc(36) Class11_Sub5_Sub2_Sub2 local36;
					if (local30 == null) {
						local36 = new Class11_Sub5_Sub2_Sub2();
						local36.anInt7670 = local18;
						local30 = new Class2_Sub34(local36);
						Static400.aClass220_41.method5104(local30, (long) local18);
						local23 = true;
						Static226.aClass2_Sub34Array1[Static30.anInt548++] = local30;
					}
					local36 = local30.aClass11_Sub5_Sub2_Sub2_2;
					Static164.anIntArray253[Static458.anInt7721++] = local18;
					local36.anInt7634 = Static277.anInt5022;
					if (local36.aClass82_1 != null && local36.aClass82_1.method1897()) {
						Static115.method1881(local36);
					}
					@Pc(94) int local94;
					if (arg0) {
						local94 = Static202.aClass2_Sub17_Sub1_1.method5577(8);
						if (local94 > 127) {
							local94 -= 256;
						}
					} else {
						local94 = Static202.aClass2_Sub17_Sub1_1.method5577(5);
						if (local94 > 15) {
							local94 -= 32;
						}
					}
					local36.method6235(Static227.aClass54_2.method1128(Static202.aClass2_Sub17_Sub1_1.method5577(14)));
					@Pc(132) int local132 = Static202.aClass2_Sub17_Sub1_1.method5577(2);
					@Pc(137) int local137 = Static202.aClass2_Sub17_Sub1_1.method5577(1);
					@Pc(144) int local144;
					if (arg0) {
						local144 = Static202.aClass2_Sub17_Sub1_1.method5577(8);
						if (local144 > 127) {
							local144 -= 256;
						}
					} else {
						local144 = Static202.aClass2_Sub17_Sub1_1.method5577(5);
						if (local144 > 15) {
							local144 -= 32;
						}
					}
					@Pc(174) int local174 = (Static202.aClass2_Sub17_Sub1_1.method5577(3) + 4 & 0x83800007) << 11;
					@Pc(179) int local179 = Static202.aClass2_Sub17_Sub1_1.method5577(1);
					if (local179 == 1) {
						Static290.anIntArray441[Static439.anInt7382++] = local18;
					}
					local36.method6229(local36.aClass82_1.anInt1963);
					local36.anInt7673 = local36.aClass82_1.anInt1974 << 3;
					if (local23) {
						local36.method6225(true, local174);
					}
					local36.method6233(local36.method6215(), Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0] + local94, local132, local144 + Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0], local137 == 1);
					if (local36.aClass82_1.method1897()) {
						Static238.method3230(local36.aByte101, null, 0, local36.anIntArray633[0], local36.anIntArray632[0], local36, null);
					}
					continue;
				}
			}
			Static202.aClass2_Sub17_Sub1_1.method5579();
			return;
		}
	}
}
