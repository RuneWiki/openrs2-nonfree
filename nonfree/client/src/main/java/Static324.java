import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
	public static int anInt5598;

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_100 = new Class322(4, 4);

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_45 = new Class359(4);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Z")
	public static boolean method5085(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	public static void method5088() {
		if (Static360.anInt6079 < 102) {
			Static360.anInt6079 += 6;
		}
		@Pc(30) int local30;
		if (Static5.anInt44 != -1 && Static329.aLong191 < Static549.method7758()) {
			for (local30 = Static5.anInt44; local30 < Static337.aStringArray24.length; local30++) {
				if (Static337.aStringArray24[local30].startsWith("pause")) {
					@Pc(55) int local55 = 5;
					try {
						local55 = Integer.parseInt(Static337.aStringArray24[local30].substring(6));
					} catch (@Pc(64) Exception local64) {
					}
					Static655.method8761("Pausing for " + local55 + " seconds...");
					Static5.anInt44 = local30 + 1;
					Static329.aLong191 = (long) (local55 * 1000) + Static549.method7758();
					return;
				}
				Static623.aString118 = Static337.aStringArray24[local30];
				Static224.method4039(false);
			}
			Static5.anInt44 = -1;
		}
		if (Static79.anInt1140 != 0) {
			Static577.anInt9220 -= Static79.anInt1140 * 5;
			if (Static577.anInt9220 >= Static573.anInt9177) {
				Static577.anInt9220 = Static573.anInt9177 - 1;
			}
			if (Static577.anInt9220 < 0) {
				Static577.anInt9220 = 0;
			}
			Static79.anInt1140 = 0;
		}
		for (local30 = 0; local30 < Static686.anInt10489; local30++) {
			@Pc(145) Interface17 local145 = Static350.anInterface17Array2[local30];
			@Pc(149) int local149 = local145.method8950();
			@Pc(155) char local155 = local145.method8951();
			@Pc(159) int local159 = local145.method8949();
			if (local149 == 84) {
				Static224.method4039(false);
			}
			if (local149 == 80) {
				Static224.method4039(true);
			} else if (local149 == 66 && (local159 & 0x4) != 0) {
				if (Static4.aClipboard1 != null) {
					@Pc(201) String local201 = "";
					for (@Pc(206) int local206 = Static177.aStringArray14.length - 1; local206 >= 0; local206--) {
						if (Static177.aStringArray14[local206] != null && Static177.aStringArray14[local206].length() > 0) {
							local201 = local201 + Static177.aStringArray14[local206] + '\n';
						}
					}
					Static4.aClipboard1.setContents(new StringSelection(local201), (ClipboardOwner) null);
				}
			} else if (local149 == 67 && (local159 & 0x4) != 0) {
				if (Static4.aClipboard1 != null) {
					@Pc(508) Transferable local508 = Static4.aClipboard1.getContents((Object) null);
					if (local508 != null) {
						try {
							@Pc(515) String local515 = (String) local508.getTransferData(DataFlavor.stringFlavor);
							if (local515 != null) {
								@Pc(522) String[] local522 = Static26.method332('\n', local515);
								Static107.method2043(local522);
							}
						} catch (@Pc(527) Exception local527) {
						}
					}
				}
			} else if (local149 == 85 && Static315.anInt5467 > 0) {
				Static623.aString118 = Static623.aString118.substring(0, Static315.anInt5467 - 1) + Static623.aString118.substring(Static315.anInt5467);
				Static315.anInt5467--;
			} else if (local149 == 101 && Static315.anInt5467 < Static623.aString118.length()) {
				Static623.aString118 = Static623.aString118.substring(0, Static315.anInt5467) + Static623.aString118.substring(Static315.anInt5467 + 1);
			} else if (local149 == 96 && Static315.anInt5467 > 0) {
				Static315.anInt5467--;
			} else if (local149 == 97 && Static315.anInt5467 < Static623.aString118.length()) {
				Static315.anInt5467++;
			} else if (local149 == 102) {
				Static315.anInt5467 = 0;
			} else if (local149 == 103) {
				Static315.anInt5467 = Static623.aString118.length();
			} else if (local149 == 104 && Static233.anInt4508 < Static177.aStringArray14.length) {
				Static233.anInt4508++;
				Static231.method4110();
				Static315.anInt5467 = Static623.aString118.length();
			} else if (local149 == 105 && Static233.anInt4508 > 0) {
				Static233.anInt4508--;
				Static231.method4110();
				Static315.anInt5467 = Static623.aString118.length();
			} else if (Static158.method3118(local155) || "\\/.:, _-+[]~@".indexOf(local155) != -1) {
				Static623.aString118 = Static623.aString118.substring(0, Static315.anInt5467) + Static350.anInterface17Array2[local30].method8951() + Static623.aString118.substring(Static315.anInt5467);
				Static315.anInt5467++;
			}
		}
		Static575.anInt9550 = 0;
		Static686.anInt10489 = 0;
		Static35.method456();
	}
}
