import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "[I")
	public static final int[] anIntArray240 = new int[50];

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "[B")
	public static final byte[] aByteArray44 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[8];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2700(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static296.anInt6002 >= 100 && !Static123.aBoolean232 || Static296.anInt6002 >= 200) {
			Static198.method3549(Static215.aClass93_84.method2819(Static21.anInt455));
			return;
		}
		@Pc(33) String local33 = Static335.method5804(arg0);
		if (local33 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(38) int local38 = 0; local38 < Static296.anInt6002; local38++) {
			@Pc(46) String local46 = Static335.method5804(Static287.aStringArray53[local38]);
			if (local46 != null && local46.equals(local33)) {
				Static198.method3549(arg0 + Static133.aClass93_54.method2819(Static21.anInt455));
				return;
			}
			if (Static110.aStringArray15[local38] != null) {
				local76 = Static335.method5804(Static110.aStringArray15[local38]);
				if (local76 != null && local76.equals(local33)) {
					Static198.method3549(arg0 + Static133.aClass93_54.method2819(Static21.anInt455));
					return;
				}
			}
		}
		for (@Pc(106) int local106 = 0; local106 < Static355.anInt6969; local106++) {
			local76 = Static335.method5804(Static283.aStringArray51[local106]);
			if (local76 != null && local76.equals(local33)) {
				Static198.method3549(Static310.aClass93_108.method2819(Static21.anInt455) + arg0 + Static137.aClass93_55.method2819(Static21.anInt455));
				return;
			}
			if (Static266.aStringArray48[local106] != null) {
				@Pc(149) String local149 = Static335.method5804(Static266.aStringArray48[local106]);
				if (local149 != null && local149.equals(local33)) {
					Static198.method3549(Static310.aClass93_108.method2819(Static21.anInt455) + arg0 + Static137.aClass93_55.method2819(Static21.anInt455));
					return;
				}
			}
		}
		if (Static335.method5804(Static41.aClass62_Sub1_Sub2_Sub2_2.aString48).equals(local33)) {
			Static198.method3549(Static279.aClass93_103.method2819(Static21.anInt455));
		} else {
			Static74.aClass2_Sub10_Sub1_2.method2049(224);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(arg0));
			Static74.aClass2_Sub10_Sub1_2.method4443(arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public static void method2701() {
		if (Static333.anInt6673 != 0) {
			Static235.anInt4515 -= Static333.anInt6673 * 5;
			if (Static235.anInt4515 >= Static324.anInt6551) {
				Static235.anInt4515 = Static324.anInt6551 - 1;
			}
			if (Static235.anInt4515 < 0) {
				Static235.anInt4515 = 0;
			}
			Static333.anInt6673 = 0;
		}
		if (Static105.anInt2372 < 102) {
			Static105.anInt2372 += 6;
		}
		@Pc(53) int local53;
		for (@Pc(45) int local45 = 0; local45 < Static49.anInt1100; local45++) {
			local53 = Static138.aClass69Array1[local45].method5553();
			@Pc(59) char local59 = Static138.aClass69Array1[local45].method5546();
			if (local53 == 84) {
				Static189.method5118();
			} else if (Static92.aClass97_2.method5672(82) && local53 == 66) {
				if (Static95.aClipboard2 != null) {
					@Pc(351) String local351 = "";
					for (@Pc(356) int local356 = Static158.aStringArray28.length - 1; local356 >= 0; local356--) {
						if (Static158.aStringArray28[local356] != null && Static158.aStringArray28[local356].length() > 0) {
							local351 = local351 + Static158.aStringArray28[local356] + '\n';
						}
					}
					Static95.aClipboard2.setContents(new StringSelection(local351), null);
				}
			} else if (Static92.aClass97_2.method5672(82) && local53 == 67) {
				if (Static95.aClipboard2 != null) {
					@Pc(293) Transferable local293 = Static95.aClipboard2.getContents(null);
					if (local293 != null) {
						try {
							@Pc(300) String local300 = (String) local293.getTransferData(DataFlavor.stringFlavor);
							if (local300 != null) {
								@Pc(307) String[] local307 = Static336.method5829(local300, '\n');
								if (local307.length <= 1) {
									Static291.aString57 = Static291.aString57 + local300;
								} else {
									for (@Pc(326) int local326 = 0; local326 < local307.length; local326++) {
										Static291.aString57 = local307[local326];
										Static189.method5118();
									}
								}
							}
						} catch (@Pc(345) Exception local345) {
						}
					}
				}
			} else if (local53 == 85 && Static209.anInt4724 > 0) {
				Static291.aString57 = Static291.aString57.substring(0, Static209.anInt4724 - 1) + Static291.aString57.substring(Static209.anInt4724);
				Static209.anInt4724--;
			} else if (local53 == 101 && Static209.anInt4724 < Static291.aString57.length()) {
				Static291.aString57 = Static291.aString57.substring(0, Static209.anInt4724) + Static291.aString57.substring(Static209.anInt4724 + 1);
			} else if (local53 == 96 && Static209.anInt4724 > 0) {
				Static209.anInt4724--;
			} else if (local53 == 97 && Static209.anInt4724 < Static291.aString57.length()) {
				Static209.anInt4724++;
			} else if (local53 == 102) {
				Static209.anInt4724 = 0;
			} else if (local53 == 103) {
				Static209.anInt4724 = Static291.aString57.length();
			} else if (local53 == 104 && Static345.anInt654 < Static158.aStringArray28.length) {
				Static345.anInt654++;
				Static262.method4744();
				Static209.anInt4724 = Static291.aString57.length();
			} else if (local53 == 105 && Static345.anInt654 > 0) {
				Static345.anInt654--;
				Static262.method4744();
				Static209.anInt4724 = Static291.aString57.length();
			} else if (Static248.method4500(local59) || local59 == ':' || local59 == ',' || local59 == ' ' || local59 == '_' || local59 == '-' || local59 == '+') {
				Static291.aString57 = Static291.aString57.substring(0, Static209.anInt4724) + Static138.aClass69Array1[local45].method5546() + Static291.aString57.substring(Static209.anInt4724);
				Static209.anInt4724++;
			}
		}
		Static49.anInt1100 = 0;
		for (local53 = 0; local53 < 100; local53++) {
			@Pc(411) int local411;
			if (Static175.aBooleanArray17[local53]) {
				local411 = Static276.anIntArray413[local53]++;
				if (Static276.anIntArray413[local53] > 102) {
					Static175.aBooleanArray17[local53] = false;
				}
			} else {
				local411 = Static276.anIntArray413[local53]--;
				if (Static276.anIntArray413[local53] < 0) {
					Static335.anIntArray501[local53] = (int) (Math.random() * (double) Static136.anInt2829);
					Static25.anIntArray103[local53] = (int) (Math.random() * 350.0D);
					Static276.anIntArray413[local53] = 0;
					Static175.aBooleanArray17[local53] = true;
				}
			}
		}
		Static253.method5944();
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
	public static void method2702() {
		Static49.method1191(Static114.anInt6585);
		@Pc(17) int local17 = (Static287.anInt5819 >> 10) + (Static138.anInt2879 >> 3);
		@Pc(30) int local30 = (Static290.anInt5837 >> 10) + (Static342.anInt6864 >> 3);
		Static304.anIntArray452 = new int[18];
		Static341.aByteArrayArray22 = new byte[18][];
		Static279.anIntArray415 = new int[18];
		Static50.anIntArray96 = new int[18];
		Static251.anIntArray377 = new int[18];
		Static177.anIntArrayArray107 = new int[18][4];
		Static201.anIntArray310 = new int[18];
		Static226.aByteArrayArray12 = new byte[18][];
		Static121.aByteArrayArray8 = new byte[18][];
		Static10.aByteArrayArray2 = new byte[18][];
		Static266.anIntArray398 = new int[18];
		Static229.aByteArrayArray7 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(97) int local97;
		for (@Pc(86) int local86 = (local17 - (Static95.anInt6381 >> 4)) / 8; local86 <= (local17 + (Static95.anInt6381 >> 4)) / 8; local86++) {
			for (local97 = (local30 - (Static237.anInt4532 >> 4)) / 8; local97 <= ((Static237.anInt4532 >> 4) + local30) / 8; local97++) {
				@Pc(105) int local105 = (local86 << 8) + local97;
				Static201.anIntArray310[local77] = local105;
				Static50.anIntArray96[local77] = Static122.aClass191_148.method5446("m" + local86 + "_" + local97);
				Static304.anIntArray452[local77] = Static122.aClass191_148.method5446("l" + local86 + "_" + local97);
				Static266.anIntArray398[local77] = Static122.aClass191_148.method5446("n" + local86 + "_" + local97);
				Static251.anIntArray377[local77] = Static122.aClass191_148.method5446("um" + local86 + "_" + local97);
				Static279.anIntArray415[local77] = Static122.aClass191_148.method5446("ul" + local86 + "_" + local97);
				if (Static266.anIntArray398[local77] == -1) {
					Static50.anIntArray96[local77] = -1;
					Static304.anIntArray452[local77] = -1;
					Static251.anIntArray377[local77] = -1;
					Static279.anIntArray415[local77] = -1;
				}
				local77++;
			}
		}
		for (local97 = local77; local97 < Static266.anIntArray398.length; local97++) {
			Static266.anIntArray398[local97] = -1;
			Static50.anIntArray96[local97] = -1;
			Static304.anIntArray452[local97] = -1;
			Static251.anIntArray377[local97] = -1;
			Static279.anIntArray415[local97] = -1;
		}
		Static282.method5084(8, 8, local17, true, 0, local30, false);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	public static void method2703() {
		if (Static120.anIntArray232 != null) {
			return;
		}
		Static120.anIntArray232 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(89) float local89 = (1.0F - local50) * local59;
				@Pc(98) float local98 = (1.0F - local50 * local82) * local59;
				@Pc(108) float local108 = (1.0F - (1.0F - local82) * local50) * local59;
				if (local76 == 0) {
					local63 = local108;
					local61 = local59;
					local65 = local89;
				} else if (local76 == 1) {
					local65 = local89;
					local63 = local59;
					local61 = local98;
				} else if (local76 == 2) {
					local63 = local59;
					local61 = local89;
					local65 = local108;
				} else if (local76 == 3) {
					local63 = local98;
					local61 = local89;
					local65 = local59;
				} else if (local76 == 4) {
					local63 = local89;
					local65 = local59;
					local61 = local108;
				} else if (local76 == 5) {
					local61 = local59;
					local65 = local98;
					local63 = local89;
				}
				local61 = (float) Math.pow((double) local61, local24);
				local63 = (float) Math.pow((double) local63, local24);
				local65 = (float) Math.pow((double) local65, local24);
				@Pc(198) int local198 = (int) (local61 * 256.0F);
				@Pc(203) int local203 = (int) (local63 * 256.0F);
				@Pc(208) int local208 = (int) (local65 * 256.0F);
				@Pc(220) int local220 = (local203 << 8) + (local198 << 16) + local208 - 16777216;
				Static120.anIntArray232[local26++] = local220;
			}
		}
	}
}
