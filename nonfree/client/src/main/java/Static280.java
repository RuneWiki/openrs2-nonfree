import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jka", name = "F", descriptor = "Lclient!cca;")
	public static Class52 aClass52_2;

	@OriginalMember(owner = "client!jka", name = "G", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method3887(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static214.aBoolean244) {
			try {
				@Pc(20) Class35 local20 = (Class35) Class.forName("Class35_Sub1").getDeclaredConstructor().newInstance();
				local20.method574(arg0);
				return local20;
			} catch (@Pc(29) Throwable local29) {
				Static214.aBoolean244 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jka", name = "e", descriptor = "(B)V")
	public static void method3889() {
		if (Static514.anInt8682 < 102) {
			Static514.anInt8682 += 6;
		}
		@Pc(28) int local28;
		if (Static137.anInt2276 != -1 && Static124.method1947() > Static602.aLong301) {
			for (local28 = Static137.anInt2276; local28 < Static257.aStringArray16.length; local28++) {
				if (Static257.aStringArray16[local28].startsWith("pause")) {
					@Pc(47) int local47 = 5;
					try {
						local47 = Integer.parseInt(Static257.aStringArray16[local28].substring(6));
					} catch (@Pc(56) Exception local56) {
					}
					Static611.method8213("Pausing for " + local47 + " seconds...");
					Static137.anInt2276 = local28 + 1;
					Static602.aLong301 = Static124.method1947() + (long) (local47 * 1000);
					return;
				}
				Static505.aString91 = Static257.aStringArray16[local28];
				Static87.method1316(false);
			}
			Static137.anInt2276 = -1;
		}
		if (Static145.anInt2413 != 0) {
			Static206.anInt3291 -= Static145.anInt2413 * 5;
			if (Static331.anInt6012 <= Static206.anInt3291) {
				Static206.anInt3291 = Static331.anInt6012 - 1;
			}
			Static145.anInt2413 = 0;
			if (Static206.anInt3291 < 0) {
				Static206.anInt3291 = 0;
			}
		}
		for (local28 = 0; local28 < Static358.anInt6287; local28++) {
			@Pc(122) Interface18 local122 = Static90.anInterface18Array1[local28];
			@Pc(126) int local126 = local122.method5314();
			@Pc(130) char local130 = local122.method5313();
			@Pc(134) int local134 = local122.method5312();
			if (local126 == 84) {
				Static87.method1316(false);
			}
			if (local126 == 80) {
				Static87.method1316(true);
			} else if (local126 == 66 && (local134 & 0x4) != 0) {
				if (Static200.aClipboard1 != null) {
					@Pc(399) String local399 = "";
					for (@Pc(404) int local404 = Static223.aStringArray14.length - 1; local404 >= 0; local404--) {
						if (Static223.aStringArray14[local404] != null && Static223.aStringArray14[local404].length() > 0) {
							local399 = local399 + Static223.aStringArray14[local404] + '\n';
						}
					}
					Static200.aClipboard1.setContents(new StringSelection(local399), (ClipboardOwner) null);
				}
			} else if (local126 == 67 && (local134 & 0x4) != 0) {
				if (Static200.aClipboard1 != null) {
					@Pc(374) Transferable local374 = Static200.aClipboard1.getContents((Object) null);
					if (local374 != null) {
						try {
							@Pc(381) String local381 = (String) local374.getTransferData(DataFlavor.stringFlavor);
							if (local381 != null) {
								@Pc(388) String[] local388 = Static466.method6897('\n', local381);
								Static128.method2000(local388);
							}
						} catch (@Pc(393) Exception local393) {
						}
					}
				}
			} else if (local126 == 85 && Static124.anInt2153 > 0) {
				Static505.aString91 = Static505.aString91.substring(0, Static124.anInt2153 - 1) + Static505.aString91.substring(Static124.anInt2153);
				Static124.anInt2153--;
			} else if (local126 == 101 && Static124.anInt2153 < Static505.aString91.length()) {
				Static505.aString91 = Static505.aString91.substring(0, Static124.anInt2153) + Static505.aString91.substring(Static124.anInt2153 + 1);
			} else if (local126 == 96 && Static124.anInt2153 > 0) {
				Static124.anInt2153--;
			} else if (local126 == 97 && Static124.anInt2153 < Static505.aString91.length()) {
				Static124.anInt2153++;
			} else if (local126 == 102) {
				Static124.anInt2153 = 0;
			} else if (local126 == 103) {
				Static124.anInt2153 = Static505.aString91.length();
			} else if (local126 == 104 && Static223.aStringArray14.length > Static106.anInt1899) {
				Static106.anInt1899++;
				Static106.method1747();
				Static124.anInt2153 = Static505.aString91.length();
			} else if (local126 == 105 && Static106.anInt1899 > 0) {
				Static106.anInt1899--;
				Static106.method1747();
				Static124.anInt2153 = Static505.aString91.length();
			} else if (Static635.method8429(local130) || local130 == '\\' || local130 == '/' || local130 == '.' || local130 == ':' || local130 == ',' || local130 == ' ' || local130 == '_' || local130 == '-' || local130 == '+' || local130 == '[' || local130 == ']') {
				Static505.aString91 = Static505.aString91.substring(0, Static124.anInt2153) + Static90.anInterface18Array1[local28].method5313() + Static505.aString91.substring(Static124.anInt2153);
				Static124.anInt2153++;
			}
		}
		Static225.anInt3592 = 0;
		Static358.anInt6287 = 0;
		Static212.method3058();
	}
}
