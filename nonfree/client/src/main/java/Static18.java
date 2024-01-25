import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!an", name = "v", descriptor = "I")
	public static int anInt6907 = 0;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "I")
	public static int anInt6908 = 0;

	@OriginalMember(owner = "client!an", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString84 = null;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V")
	public static void method6085() {
		if (Static132.anInt2496 < 102) {
			Static132.anInt2496 += 6;
		}
		@Pc(28) int local28;
		if (Static643.anInt10121 != -1 && Static429.method5935() > Static349.aLong160) {
			for (local28 = Static643.anInt10121; local28 < Static434.aStringArray34.length; local28++) {
				if (Static434.aStringArray34[local28].startsWith("pause")) {
					@Pc(38) int local38 = 5;
					try {
						local38 = Integer.parseInt(Static434.aStringArray34[local28].substring(6));
					} catch (@Pc(47) Exception local47) {
					}
					Static383.method8457("Pausing for " + local38 + " seconds...");
					Static643.anInt10121 = local28 + 1;
					Static349.aLong160 = (long) (local38 * 1000) + Static429.method5935();
					return;
				}
				Static330.aString58 = Static434.aStringArray34[local28];
				Static524.method7051(false);
			}
			Static643.anInt10121 = -1;
		}
		if (Static191.anInt3219 != 0) {
			Static319.anInt4944 -= Static191.anInt3219 * 5;
			if (Static249.anInt4093 <= Static319.anInt4944) {
				Static319.anInt4944 = Static249.anInt4093 - 1;
			}
			if (Static319.anInt4944 < 0) {
				Static319.anInt4944 = 0;
			}
			Static191.anInt3219 = 0;
		}
		for (local28 = 0; local28 < Static411.anInt5921; local28++) {
			@Pc(125) Interface26 local125 = Static76.anInterface26Array1[local28];
			@Pc(129) int local129 = local125.method7132();
			@Pc(135) char local135 = local125.method7134();
			@Pc(139) int local139 = local125.method7135();
			if (local129 == 84) {
				Static524.method7051(false);
			}
			if (local129 == 80) {
				Static524.method7051(true);
			} else if (local129 == 66 && (local139 & 0x4) != 0) {
				if (Static169.aClipboard1 != null) {
					@Pc(380) String local380 = "";
					for (@Pc(385) int local385 = Static489.aStringArray40.length - 1; local385 >= 0; local385--) {
						if (Static489.aStringArray40[local385] != null && Static489.aStringArray40[local385].length() > 0) {
							local380 = local380 + Static489.aStringArray40[local385] + '\n';
						}
					}
					Static169.aClipboard1.setContents(new StringSelection(local380), (ClipboardOwner) null);
				}
			} else if (local129 == 67 && (local139 & 0x4) != 0) {
				if (Static169.aClipboard1 != null) {
					@Pc(183) Transferable local183 = Static169.aClipboard1.getContents((Object) null);
					if (local183 != null) {
						try {
							@Pc(190) String local190 = (String) local183.getTransferData(DataFlavor.stringFlavor);
							if (local190 != null) {
								@Pc(197) String[] local197 = Static189.method2958('\n', local190);
								Static640.method8550(local197);
							}
						} catch (@Pc(202) Exception local202) {
						}
					}
				}
			} else if (local129 == 85 && Static631.anInt9864 > 0) {
				Static330.aString58 = Static330.aString58.substring(0, Static631.anInt9864 - 1) + Static330.aString58.substring(Static631.anInt9864);
				Static631.anInt9864--;
			} else if (local129 == 101 && Static631.anInt9864 < Static330.aString58.length()) {
				Static330.aString58 = Static330.aString58.substring(0, Static631.anInt9864) + Static330.aString58.substring(Static631.anInt9864 + 1);
			} else if (local129 == 96 && Static631.anInt9864 > 0) {
				Static631.anInt9864--;
			} else if (local129 == 97 && Static631.anInt9864 < Static330.aString58.length()) {
				Static631.anInt9864++;
			} else if (local129 == 102) {
				Static631.anInt9864 = 0;
			} else if (local129 == 103) {
				Static631.anInt9864 = Static330.aString58.length();
			} else if (local129 == 104 && Static489.aStringArray40.length > Static223.anInt3553) {
				Static223.anInt3553++;
				Static614.method8043();
				Static631.anInt9864 = Static330.aString58.length();
			} else if (local129 == 105 && Static223.anInt3553 > 0) {
				Static223.anInt3553--;
				Static614.method8043();
				Static631.anInt9864 = Static330.aString58.length();
			} else if (Static251.method1890(local135) || "\\/.:, _-+[]~@".indexOf(local135) != -1) {
				Static330.aString58 = Static330.aString58.substring(0, Static631.anInt9864) + Static76.anInterface26Array1[local28].method7134() + Static330.aString58.substring(Static631.anInt9864);
				Static631.anInt9864++;
			}
		}
		Static411.anInt5921 = 0;
		Static384.anInt5665 = 0;
		Static34.method8332();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZIII)I")
	public static int method6088(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub54 local8 = Static473.method6525(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray723.length > arg1) {
			return local8.anIntArray723[arg1];
		} else {
			return -1;
		}
	}
}
