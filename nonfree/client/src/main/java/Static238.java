import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[Lclient!rr;")
	public static Class331[] aClass331Array1;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	public static int anInt3789 = -2;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	public static int anInt3790 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)Lclient!vq;")
	public static Class9_Sub10 method3424() {
		@Pc(14) Class9_Sub10 local14 = (Class9_Sub10) Static693.aClass319_14.method7197();
		if (local14 == null) {
			return new Class9_Sub10();
		} else {
			Static137.anInt2611--;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
	public static void method3425() {
		if (Static720.anInt11176 < 102) {
			Static720.anInt11176 += 6;
		}
		@Pc(32) int local32;
		if (Static59.anInt1492 != -1 && Static32.aLong30 < Static517.method6965()) {
			for (local32 = Static59.anInt1492; local32 < Static497.aStringArray33.length; local32++) {
				if (Static497.aStringArray33[local32].startsWith("pause")) {
					@Pc(57) int local57 = 5;
					try {
						local57 = Integer.parseInt(Static497.aStringArray33[local32].substring(6));
					} catch (@Pc(66) Exception local66) {
					}
					Static369.method5071("Pausing for " + local57 + " seconds...");
					Static59.anInt1492 = local32 + 1;
					Static32.aLong30 = (long) (local57 * 1000) + Static517.method6965();
					return;
				}
				Static689.aString129 = Static497.aStringArray33[local32];
				Static567.method7365(false);
			}
			Static59.anInt1492 = -1;
		}
		if (Static452.anInt6919 != 0) {
			Static630.anInt9714 -= Static452.anInt6919 * 5;
			if (Static630.anInt9714 >= Static181.anInt3158) {
				Static630.anInt9714 = Static181.anInt3158 - 1;
			}
			if (Static630.anInt9714 < 0) {
				Static630.anInt9714 = 0;
			}
			Static452.anInt6919 = 0;
		}
		for (local32 = 0; local32 < Static303.anInt4880; local32++) {
			@Pc(154) Interface26 local154 = Static708.anInterface26Array2[local32];
			@Pc(158) int local158 = local154.method5024();
			@Pc(162) char local162 = local154.method5026();
			@Pc(166) int local166 = local154.method5023();
			if (local158 == 84) {
				Static567.method7365(false);
			}
			if (local158 == 80) {
				Static567.method7365(true);
			} else if (local158 == 66 && (local166 & 0x4) != 0) {
				if (Static627.aClipboard1 != null) {
					@Pc(473) String local473 = "";
					for (@Pc(478) int local478 = Static547.aStringArray37.length - 1; local478 >= 0; local478--) {
						if (Static547.aStringArray37[local478] != null && Static547.aStringArray37[local478].length() > 0) {
							local473 = local473 + Static547.aStringArray37[local478] + '\n';
						}
					}
					Static627.aClipboard1.setContents(new StringSelection(local473), (ClipboardOwner) null);
				}
			} else if (local158 == 67 && (local166 & 0x4) != 0) {
				if (Static627.aClipboard1 != null) {
					try {
						@Pc(446) Transferable local446 = Static627.aClipboard1.getContents((Object) null);
						if (local446 != null) {
							@Pc(453) String local453 = (String) local446.getTransferData(DataFlavor.stringFlavor);
							if (local453 != null) {
								@Pc(460) String[] local460 = Static104.method2099(local453, '\n');
								Static240.method6914(local460);
							}
						}
					} catch (@Pc(465) Exception local465) {
					}
				}
			} else if (local158 == 85 && Static685.anInt6069 > 0) {
				Static689.aString129 = Static689.aString129.substring(0, Static685.anInt6069 - 1) + Static689.aString129.substring(Static685.anInt6069);
				Static685.anInt6069--;
			} else if (local158 == 101 && Static685.anInt6069 < Static689.aString129.length()) {
				Static689.aString129 = Static689.aString129.substring(0, Static685.anInt6069) + Static689.aString129.substring(Static685.anInt6069 + 1);
			} else if (local158 == 96 && Static685.anInt6069 > 0) {
				Static685.anInt6069--;
			} else if (local158 == 97 && Static685.anInt6069 < Static689.aString129.length()) {
				Static685.anInt6069++;
			} else if (local158 == 102) {
				Static685.anInt6069 = 0;
			} else if (local158 == 103) {
				Static685.anInt6069 = Static689.aString129.length();
			} else if (local158 == 104 && Static547.aStringArray37.length > Static77.anInt1736) {
				Static77.anInt1736++;
				Static454.method6016();
				Static685.anInt6069 = Static689.aString129.length();
			} else if (local158 == 105 && Static77.anInt1736 > 0) {
				Static77.anInt1736--;
				Static454.method6016();
				Static685.anInt6069 = Static689.aString129.length();
			} else if (Static78.method1726(local162) || "\\/.:, _-+[]~@".indexOf(local162) != -1) {
				Static689.aString129 = Static689.aString129.substring(0, Static685.anInt6069) + Static708.anInterface26Array2[local32].method5026() + Static689.aString129.substring(Static685.anInt6069);
				Static685.anInt6069++;
			}
		}
		Static303.anInt4880 = 0;
		Static362.anInt5713 = 0;
		Static402.method5423();
	}
}
