import java.io.IOException;
import java.net.Socket;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
	public static int anInt4364;

	@OriginalMember(owner = "client!qj", name = "eb", descriptor = "[[B")
	public static byte[][] aByteArrayArray35;

	@OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
	public static int anInt4358 = 0;

	@OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
	public static int anInt4367 = -1;

	@OriginalMember(owner = "client!qj", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString267 = "Please remove ";

	@OriginalMember(owner = "client!qj", name = "ib", descriptor = "[I")
	public static int[] anIntArray462 = new int[2000];

	@OriginalMember(owner = "client!qj", name = "jb", descriptor = "Ljava/lang/String;")
	public static String aString268 = null;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V")
	public static void method3631() {
		Static258.aClass26_52.method517(5);
		Static66.aClass26_11.method517(5);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	public static void method3633() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glDisableClientState(32886);
		Static94.method1610(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static94.method1589();
		for (@Pc(19) int local19 = 0; local19 < Static105.aClass4_Sub12ArrayArray1[0].length; local19++) {
			@Pc(31) Class4_Sub12 local31 = Static105.aClass4_Sub12ArrayArray1[0][local19];
			if (local31.anInt2356 >= 0 && Static249.method3957(Static158.anInterface5_1.method444(local31.anInt2356))) {
				local1.glColor4fv(Static88.method1553(local31.anInt2351), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean162 ? 1.0F : 0.5F);
				local31.method1868(Static6.aClass4_Sub19ArrayArrayArray1, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static94.method1618();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static94.method1591();
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
	public static void method3634() {
		Static281.method4347();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			Static296.aClass30Array1[local12].method579();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3635(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		for (@Pc(21) int local21 = 0; local21 < Static188.anInt6076; local21++) {
			@Pc(28) Class165 local28 = Static287.method4398(local21);
			if ((!arg1 || local28.aBoolean350) && local28.anInt5090 == -1 && local28.anInt5078 == -1 && local28.anInt5057 == 0 && local28.aString315.toLowerCase().indexOf(local4) != -1) {
				if (local10 >= 250) {
					Static76.anInt5738 = -1;
					Static293.aShortArray114 = null;
					return;
				}
				if (local13.length <= local10) {
					@Pc(80) short[] local80 = new short[local13.length * 2];
					for (@Pc(82) int local82 = 0; local82 < local10; local82++) {
						local80[local82] = local13[local82];
					}
					local13 = local80;
				}
				local13[local10++] = (short) local21;
			}
		}
		Static76.anInt5738 = local10;
		Static167.anInt3497 = 0;
		Static293.aShortArray114 = local13;
		@Pc(118) String[] local118 = new String[Static76.anInt5738];
		for (@Pc(120) int local120 = 0; local120 < Static76.anInt5738; local120++) {
			local118[local120] = Static287.method4398(local13[local120]).aString315;
		}
		Static44.method714(Static293.aShortArray114, local118);
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
	public static void method3636() {
		Static91.aClass26_19.method511();
		Static205.aClass26_43.method511();
		Static273.aClass26_18.method511();
		Static177.aClass26_32.method511();
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(B)V")
	public static void method3637() {
		if (Static133.anInt2574 == 0 || Static133.anInt2574 == 5) {
			return;
		}
		try {
			if (++Static237.anInt4459 > 2000) {
				if (Static134.aClass52_7 != null) {
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
				}
				if (Static190.anInt3570 >= 1) {
					Static133.anInt2574 = 0;
					Static75.anInt1641 = -5;
					return;
				}
				if (Static256.anInt4867 == Static109.anInt2194) {
					Static256.anInt4867 = Static220.anInt4045;
				} else {
					Static256.anInt4867 = Static109.anInt2194;
				}
				Static190.anInt3570++;
				Static133.anInt2574 = 1;
				Static237.anInt4459 = 0;
			}
			if (Static133.anInt2574 == 1) {
				Static304.aClass185_8 = Static276.aClass139_4.method3505(Static251.aString299, Static256.anInt4867);
				Static133.anInt2574 = 2;
			}
			if (Static133.anInt2574 == 2) {
				if (Static304.aClass185_8.anInt5623 == 2) {
					throw new IOException();
				}
				if (Static304.aClass185_8.anInt5623 != 1) {
					return;
				}
				Static134.aClass52_7 = new Class52((Socket) Static304.aClass185_8.anObject7, Static276.aClass139_4);
				Static304.aClass185_8 = null;
				@Pc(111) long local111 = Static28.aLong23 = Static108.method1747(Static114.aString132);
				@Pc(118) int local118 = (int) (local111 >> 16 & 0x1FL);
				Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
				Static110.aClass4_Sub10_Sub1_1.method4618(14);
				Static110.aClass4_Sub10_Sub1_1.method4618(local118);
				Static134.aClass52_7.method1107(Static110.aClass4_Sub10_Sub1_1.aByteArray71, 2);
				if (Static30.aClass103_1 != null) {
					Static30.aClass103_1.method3009();
				}
				if (Static249.aClass103_2 != null) {
					Static249.aClass103_2.method3009();
				}
				@Pc(152) int local152 = Static134.aClass52_7.method1105();
				if (Static30.aClass103_1 != null) {
					Static30.aClass103_1.method3009();
				}
				if (Static249.aClass103_2 != null) {
					Static249.aClass103_2.method3009();
				}
				if (local152 != 0) {
					Static75.anInt1641 = local152;
					Static133.anInt2574 = 0;
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
					return;
				}
				Static133.anInt2574 = 3;
			}
			if (Static133.anInt2574 == 3) {
				if (Static134.aClass52_7.method1101() < 8) {
					return;
				}
				@Pc(197) int[] local197 = new int[4];
				Static134.aClass52_7.method1099(0, Static189.aClass4_Sub10_Sub1_2.aByteArray71, 8);
				Static189.aClass4_Sub10_Sub1_2.anInt5713 = 0;
				Static269.aLong131 = Static189.aClass4_Sub10_Sub1_2.method4659();
				local197[1] = (int) (Math.random() * 9.9999999E7D);
				local197[3] = (int) Static269.aLong131;
				local197[0] = (int) (Math.random() * 9.9999999E7D);
				Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
				local197[2] = (int) (Static269.aLong131 >> 32);
				Static110.aClass4_Sub10_Sub1_1.method4618(10);
				Static110.aClass4_Sub10_Sub1_1.method4654(local197[0]);
				Static110.aClass4_Sub10_Sub1_1.method4654(local197[1]);
				Static110.aClass4_Sub10_Sub1_1.method4654(local197[2]);
				Static110.aClass4_Sub10_Sub1_1.method4654(local197[3]);
				Static110.aClass4_Sub10_Sub1_1.method4619(Static108.method1747(Static114.aString132));
				Static110.aClass4_Sub10_Sub1_1.method4612(Static63.aString76);
				Static110.aClass4_Sub10_Sub1_1.method4665(Static71.aBigInteger1, Static263.aBigInteger2);
				Static217.aClass4_Sub10_Sub1_3.anInt5713 = 0;
				if (Static169.anInt3304 == 40) {
					Static217.aClass4_Sub10_Sub1_3.method4618(18);
				} else {
					Static217.aClass4_Sub10_Sub1_3.method4618(16);
				}
				Static217.aClass4_Sub10_Sub1_3.method4668(Static110.aClass4_Sub10_Sub1_1.anInt5713 + Static111.method1792(aString268) + 163);
				Static217.aClass4_Sub10_Sub1_3.method4654(550);
				Static217.aClass4_Sub10_Sub1_3.method4618(Static21.anInt1047);
				Static217.aClass4_Sub10_Sub1_3.method4618(Static47.aBoolean52 ? 1 : 0);
				Static217.aClass4_Sub10_Sub1_3.method4618(1);
				Static217.aClass4_Sub10_Sub1_3.method4618(Static35.method557());
				Static217.aClass4_Sub10_Sub1_3.method4668(Static31.anInt526);
				Static217.aClass4_Sub10_Sub1_3.method4668(Static40.anInt690);
				Static217.aClass4_Sub10_Sub1_3.method4618(Static55.anInt1125);
				Static251.method3986(Static217.aClass4_Sub10_Sub1_3);
				Static217.aClass4_Sub10_Sub1_3.method4612(aString268);
				Static217.aClass4_Sub10_Sub1_3.method4654(Static259.anInt4939);
				Static217.aClass4_Sub10_Sub1_3.method4654(Static179.method2819());
				Static78.aBoolean104 = true;
				Static217.aClass4_Sub10_Sub1_3.method4668(Static290.anInt5427);
				Static217.aClass4_Sub10_Sub1_3.method4654(Static99.aClass58_46.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static150.aClass58_66.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static70.aClass58_39.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static51.aClass58_27.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static258.aClass58_92.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static102.aClass58_47.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static278.aClass58_98.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static161.aClass58_69.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static7.aClass58_4.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static54.aClass58_29.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static233.aClass58_71.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static127.aClass58_57.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static165.aClass58_73.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static152.aClass58_67.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static210.aClass58_78.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static225.aClass58_83.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static174.aClass58_76.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static275.aClass58_96.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static249.aClass58_88.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static204.aClass58_79.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static2.aClass58_1.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static16.aClass58_24.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static28.aClass58_10.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static219.aClass58_82.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static248.aClass58_87.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static21.aClass58_30.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static153.aClass58_68.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static305.aClass58_102.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4654(Static206.aClass58_80.method1369());
				Static217.aClass4_Sub10_Sub1_3.method4631(Static110.aClass4_Sub10_Sub1_1.aByteArray71, Static110.aClass4_Sub10_Sub1_1.anInt5713);
				Static134.aClass52_7.method1107(Static217.aClass4_Sub10_Sub1_3.aByteArray71, Static217.aClass4_Sub10_Sub1_3.anInt5713);
				Static110.aClass4_Sub10_Sub1_1.method4676(local197);
				for (@Pc(594) int local594 = 0; local594 < 4; local594++) {
					local197[local594] += 50;
				}
				Static189.aClass4_Sub10_Sub1_2.method4676(local197);
				Static133.anInt2574 = 4;
			}
			if (Static133.anInt2574 == 4) {
				if (Static134.aClass52_7.method1101() < 1) {
					return;
				}
				@Pc(626) int local626 = Static134.aClass52_7.method1105();
				if (local626 == 21) {
					Static133.anInt2574 = 7;
				} else if (local626 == 29) {
					Static133.anInt2574 = 10;
				} else if (local626 == 1) {
					Static75.anInt1641 = local626;
					Static133.anInt2574 = 5;
					return;
				} else if (local626 == 2) {
					Static133.anInt2574 = 8;
				} else if (local626 == 15) {
					Static75.anInt1641 = local626;
					Static133.anInt2574 = 0;
					return;
				} else if (local626 == 23 && Static190.anInt3570 < 1) {
					Static133.anInt2574 = 1;
					Static237.anInt4459 = 0;
					Static190.anInt3570++;
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
					return;
				} else {
					Static75.anInt1641 = local626;
					Static133.anInt2574 = 0;
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
					return;
				}
			}
			if (Static133.anInt2574 == 6) {
				Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
				Static110.aClass4_Sub10_Sub1_1.method4687(17);
				Static134.aClass52_7.method1107(Static110.aClass4_Sub10_Sub1_1.aByteArray71, Static110.aClass4_Sub10_Sub1_1.anInt5713);
				Static133.anInt2574 = 4;
				return;
			}
			if (Static133.anInt2574 == 7) {
				if (Static134.aClass52_7.method1101() >= 1) {
					Static93.anInt2582 = Static134.aClass52_7.method1105() * 60 + 180;
					Static133.anInt2574 = 0;
					Static75.anInt1641 = 21;
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
					return;
				}
				return;
			}
			if (Static133.anInt2574 == 10) {
				if (Static134.aClass52_7.method1101() < 1) {
					return;
				}
				Static225.anInt4325 = Static134.aClass52_7.method1105();
				Static75.anInt1641 = 29;
				Static133.anInt2574 = 0;
				Static134.aClass52_7.method1103();
				Static134.aClass52_7 = null;
				return;
			}
			if (Static133.anInt2574 == 8) {
				if (Static134.aClass52_7.method1101() < 14) {
					return;
				}
				Static134.aClass52_7.method1099(0, Static189.aClass4_Sub10_Sub1_2.aByteArray71, 14);
				Static189.aClass4_Sub10_Sub1_2.anInt5713 = 0;
				Static133.anInt2576 = Static189.aClass4_Sub10_Sub1_2.method4666();
				Static81.anInt1877 = Static189.aClass4_Sub10_Sub1_2.method4666();
				Static42.aBoolean47 = Static189.aClass4_Sub10_Sub1_2.method4666() == 1;
				Static207.aBoolean287 = Static189.aClass4_Sub10_Sub1_2.method4666() == 1;
				Static179.aBoolean241 = Static189.aClass4_Sub10_Sub1_2.method4666() == 1;
				Static60.aBoolean67 = Static189.aClass4_Sub10_Sub1_2.method4666() == 1;
				Static204.aBoolean277 = Static189.aClass4_Sub10_Sub1_2.method4666() == 1;
				Static273.anInt2022 = Static189.aClass4_Sub10_Sub1_2.method4653();
				Static306.aBoolean400 = Static189.aClass4_Sub10_Sub1_2.method4666() == 1;
				Static293.aBoolean371 = Static189.aClass4_Sub10_Sub1_2.method4666() == 1;
				Static265.method4169(Static293.aBoolean371);
				Static153.method2460(Static293.aBoolean371);
				Static112.method4415(Static293.aBoolean371);
				if (!Static47.aBoolean52) {
					if (Static42.aBoolean47 && !Static179.aBoolean241 || Static306.aBoolean400) {
						try {
							Static319.method1852(Static276.aClass139_4.anApplet1, "zap");
						} catch (@Pc(906) Throwable local906) {
						}
					} else {
						try {
							Static319.method1852(Static276.aClass139_4.anApplet1, "unzap");
						} catch (@Pc(916) Throwable local916) {
						}
					}
				}
				try {
					Static319.method1852(Static276.aClass139_4.anApplet1, "loggedin");
				} catch (@Pc(924) Throwable local924) {
				}
				Static34.anInt552 = Static189.aClass4_Sub10_Sub1_2.method4683();
				Static21.anInt1052 = Static189.aClass4_Sub10_Sub1_2.method4653();
				Static133.anInt2574 = 9;
			}
			if (Static133.anInt2574 == 9) {
				if (Static134.aClass52_7.method1101() >= Static21.anInt1052) {
					Static189.aClass4_Sub10_Sub1_2.anInt5713 = 0;
					Static134.aClass52_7.method1099(0, Static189.aClass4_Sub10_Sub1_2.aByteArray71, Static21.anInt1052);
					Static75.anInt1641 = 2;
					Static133.anInt2574 = 0;
					Static36.method559();
					Static177.anInt3360 = -1;
					Static262.method4126(false);
					Static34.anInt552 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(975) IOException local975) {
			if (Static134.aClass52_7 != null) {
				Static134.aClass52_7.method1103();
				Static134.aClass52_7 = null;
			}
			if (Static190.anInt3570 < 1) {
				Static190.anInt3570++;
				Static133.anInt2574 = 1;
				if (Static109.anInt2194 == Static256.anInt4867) {
					Static256.anInt4867 = Static220.anInt4045;
				} else {
					Static256.anInt4867 = Static109.anInt2194;
				}
				Static237.anInt4459 = 0;
			} else {
				Static133.anInt2574 = 0;
				Static75.anInt1641 = -4;
			}
		}
	}
}
