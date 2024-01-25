import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!nka", name = "e", descriptor = "Lclient!rha;")
	public static Class2_Sub23_Sub5 aClass2_Sub23_Sub5_2;

	@OriginalMember(owner = "client!nka", name = "t", descriptor = "I")
	private static int anInt1611;

	@OriginalMember(owner = "client!nka", name = "q", descriptor = "Z")
	private static boolean aBoolean179;

	@OriginalMember(owner = "client!nka", name = "d", descriptor = "Z")
	private static boolean aBoolean180;

	@OriginalMember(owner = "client!nka", name = "E", descriptor = "Z")
	private static boolean aBoolean181;

	@OriginalMember(owner = "client!nka", name = "S", descriptor = "Z")
	private static boolean aBoolean182;

	@OriginalMember(owner = "client!nka", name = "n", descriptor = "I")
	private static int anInt1612;

	@OriginalMember(owner = "client!nka", name = "u", descriptor = "I")
	private static int anInt1613;

	@OriginalMember(owner = "client!nka", name = "P", descriptor = "I")
	private static int anInt1614;

	@OriginalMember(owner = "client!nka", name = "db", descriptor = "Z")
	private static boolean aBoolean183;

	@OriginalMember(owner = "client!nka", name = "bb", descriptor = "Z")
	private static boolean aBoolean184;

	@OriginalMember(owner = "client!nka", name = "w", descriptor = "Z")
	private static boolean aBoolean185;

	@OriginalMember(owner = "client!nka", name = "D", descriptor = "Z")
	private static boolean aBoolean186;

	@OriginalMember(owner = "client!nka", name = "N", descriptor = "Z")
	private static boolean aBoolean187;

	@OriginalMember(owner = "client!nka", name = "ab", descriptor = "I")
	private static int anInt1615;

	@OriginalMember(owner = "client!nka", name = "Q", descriptor = "Z")
	private static boolean aBoolean188;

	@OriginalMember(owner = "client!nka", name = "H", descriptor = "Z")
	private static boolean aBoolean189;

	@OriginalMember(owner = "client!nka", name = "r", descriptor = "Z")
	private static boolean aBoolean190;

	@OriginalMember(owner = "client!nka", name = "C", descriptor = "Z")
	private static boolean aBoolean191;

	@OriginalMember(owner = "client!nka", name = "gb", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_29 = new Class349(20, 4);

	@OriginalMember(owner = "client!nka", name = "Z", descriptor = "[I")
	public static final int[] anIntArray123 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!nka", name = "cb", descriptor = "[I")
	public static final int[] anIntArray124 = new int[2];

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method1390(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static194.anInt3157 >= 100) {
			Static79.method1194(Static289.aClass191_38.method4067(Static414.anInt9485));
			return;
		}
		@Pc(25) String local25 = Static15.method237(arg1);
		if (local25 == null) {
			return;
		}
		@Pc(75) String local75;
		for (@Pc(31) int local31 = 0; local31 < Static194.anInt3157; local31++) {
			@Pc(41) String local41 = Static15.method237(Static12.aStringArray2[local31]);
			if (local41 != null && local41.equals(local25)) {
				Static79.method1194(arg1 + Static289.aClass191_39.method4067(Static414.anInt9485));
				return;
			}
			if (Static514.aStringArray37[local31] != null) {
				local75 = Static15.method237(Static514.aStringArray37[local31]);
				if (local75 != null && local75.equals(local25)) {
					Static79.method1194(arg1 + Static289.aClass191_39.method4067(Static414.anInt9485));
					return;
				}
			}
		}
		for (@Pc(113) int local113 = 0; local113 < Static143.anInt2455; local113++) {
			local75 = Static15.method237(Static80.aStringArray8[local113]);
			if (local75 != null && local75.equals(local25)) {
				Static79.method1194(Static289.aClass191_44.method4067(Static414.anInt9485) + arg1 + Static289.aClass191_45.method4067(Static414.anInt9485));
				return;
			}
			if (Static180.aStringArray23[local113] != null) {
				@Pc(162) String local162 = Static15.method237(Static180.aStringArray23[local113]);
				if (local162 != null && local162.equals(local25)) {
					Static79.method1194(Static289.aClass191_44.method4067(Static414.anInt9485) + arg1 + Static289.aClass191_45.method4067(Static414.anInt9485));
					return;
				}
			}
		}
		if (Static15.method237(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4).equals(local25)) {
			Static79.method1194(Static289.aClass191_41.method4067(Static414.anInt9485));
			return;
		}
		@Pc(226) Class221 local226 = Static87.method1292();
		@Pc(237) Class2_Sub33 local237 = Static592.method8154(Static405.aClass349_95, local226.aClass48_1);
		local237.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(arg1) + 1);
		local237.aClass2_Sub20_Sub2_1.method8541(arg1);
		local237.aClass2_Sub20_Sub2_1.method8584(arg0 ? 1 : 0);
		local226.method5173(local237);
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(I)V")
	public static void method1392() {
		if (Static599.anInt9311 < 102) {
			Static599.anInt9311 += 6;
		}
		@Pc(33) int local33;
		if (Static509.anInt8051 != -1 && Static277.aLong144 < Static567.method7863()) {
			for (local33 = Static509.anInt8051; local33 < Static149.aStringArray12.length; local33++) {
				if (Static149.aStringArray12[local33].startsWith("pause")) {
					@Pc(58) int local58 = 5;
					try {
						local58 = Integer.parseInt(Static149.aStringArray12[local33].substring(6));
					} catch (@Pc(67) Exception local67) {
					}
					Static180.method5442("Pausing for " + local58 + " seconds...");
					Static509.anInt8051 = local33 + 1;
					Static277.aLong144 = Static567.method7863() + (long) (local58 * 1000);
					return;
				}
				Static570.aString99 = Static149.aStringArray12[local33];
				Static291.method4103(false);
			}
			Static509.anInt8051 = -1;
		}
		if (Static204.anInt3328 != 0) {
			Static371.anInt5925 -= Static204.anInt3328 * 5;
			if (Static646.anInt9910 <= Static371.anInt5925) {
				Static371.anInt5925 = Static646.anInt9910 - 1;
			}
			Static204.anInt3328 = 0;
			if (Static371.anInt5925 < 0) {
				Static371.anInt5925 = 0;
			}
		}
		for (local33 = 0; local33 < Static510.anInt8118; local33++) {
			@Pc(144) Interface21 local144 = Static176.anInterface21Array2[local33];
			@Pc(148) int local148 = local144.method9556();
			@Pc(152) char local152 = local144.method9558();
			@Pc(156) int local156 = local144.method9557();
			if (local148 == 84) {
				Static291.method4103(false);
			}
			if (local148 == 80) {
				Static291.method4103(true);
			} else if (local148 == 66 && (local156 & 0x4) != 0) {
				if (Static446.aClipboard1 != null) {
					@Pc(465) String local465 = "";
					for (@Pc(470) int local470 = Static371.aStringArray22.length - 1; local470 >= 0; local470--) {
						if (Static371.aStringArray22[local470] != null && Static371.aStringArray22[local470].length() > 0) {
							local465 = local465 + Static371.aStringArray22[local470] + '\n';
						}
					}
					Static446.aClipboard1.setContents(new StringSelection(local465), (ClipboardOwner) null);
				}
			} else if (local148 == 67 && (local156 & 0x4) != 0) {
				if (Static446.aClipboard1 != null) {
					try {
						@Pc(438) Transferable local438 = Static446.aClipboard1.getContents((Object) null);
						if (local438 != null) {
							@Pc(445) String local445 = (String) local438.getTransferData(DataFlavor.stringFlavor);
							if (local445 != null) {
								@Pc(452) String[] local452 = Static100.method1530(local445, '\n');
								Static425.method6178(local452);
							}
						}
					} catch (@Pc(457) Exception local457) {
					}
				}
			} else if (local148 == 85 && Static135.anInt2247 > 0) {
				Static570.aString99 = Static570.aString99.substring(0, Static135.anInt2247 - 1) + Static570.aString99.substring(Static135.anInt2247);
				Static135.anInt2247--;
			} else if (local148 == 101 && Static135.anInt2247 < Static570.aString99.length()) {
				Static570.aString99 = Static570.aString99.substring(0, Static135.anInt2247) + Static570.aString99.substring(Static135.anInt2247 + 1);
			} else if (local148 == 96 && Static135.anInt2247 > 0) {
				Static135.anInt2247--;
			} else if (local148 == 97 && Static135.anInt2247 < Static570.aString99.length()) {
				Static135.anInt2247++;
			} else if (local148 == 102) {
				Static135.anInt2247 = 0;
			} else if (local148 == 103) {
				Static135.anInt2247 = Static570.aString99.length();
			} else if (local148 == 104 && Static371.aStringArray22.length > Static566.anInt8894) {
				Static566.anInt8894++;
				Static629.method8519();
				Static135.anInt2247 = Static570.aString99.length();
			} else if (local148 == 105 && Static566.anInt8894 > 0) {
				Static566.anInt8894--;
				Static629.method8519();
				Static135.anInt2247 = Static570.aString99.length();
			} else if (Static543.method7587(local152) || "\\/.:, _-+[]~@".indexOf(local152) != -1) {
				Static570.aString99 = Static570.aString99.substring(0, Static135.anInt2247) + Static176.anInterface21Array2[local33].method9558() + Static570.aString99.substring(Static135.anInt2247);
				Static135.anInt2247++;
			}
		}
		Static510.anInt8118 = 0;
		Static117.anInt1953 = 0;
		Static668.method9110(-77);
	}

	@OriginalMember(owner = "client!nka", name = "l", descriptor = "(I)V")
	public static void method1394() {
		if (Static14.aByteArray1 != null) {
			Static704.method9420();
		} else if (Static233.anInt3710 == -1) {
			Static16.method242(Static376.aString64, Static489.aString91);
		} else {
			Static504.method7143();
		}
	}
}
