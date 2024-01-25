import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
	public static final int[] anIntArray278 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method3474() {
		if (Static523.aClass129_11 == null) {
			return;
		}
		if (Static523.aClass129_11.anInt3299 == 1) {
			Static523.aClass129_11 = null;
			return;
		}
		if (Static523.aClass129_11.anInt3299 == 2) {
			Static229.method7980(2, Static446.aClass231_3, Static94.aString21);
			Static523.aClass129_11 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	public static void method3475() {
		if (Static416.anInt7045 < 102) {
			Static416.anInt7045 += 6;
		}
		@Pc(28) int local28;
		if (Static283.anInt5293 != -1 && Static335.aLong157 < Static131.method2268()) {
			for (local28 = Static283.anInt5293; local28 < Static354.aStringArray75.length; local28++) {
				if (Static354.aStringArray75[local28].startsWith("pause")) {
					@Pc(38) int local38 = 5;
					try {
						local38 = Integer.parseInt(Static354.aStringArray75[local28].substring(6));
					} catch (@Pc(47) Exception local47) {
					}
					Static339.method5160("Pausing for " + local38 + " seconds...");
					Static283.anInt5293 = local28 + 1;
					Static335.aLong157 = (long) (local38 * 1000) + Static131.method2268();
					return;
				}
				Static337.aString75 = Static354.aStringArray75[local28];
				Static676.method8729(false);
			}
			Static283.anInt5293 = -1;
		}
		if (Static480.anInt8123 != 0) {
			Static392.anInt10294 -= Static480.anInt8123 * 5;
			if (Static275.anInt6800 <= Static392.anInt10294) {
				Static392.anInt10294 = Static275.anInt6800 - 1;
			}
			Static480.anInt8123 = 0;
			if (Static392.anInt10294 < 0) {
				Static392.anInt10294 = 0;
			}
		}
		for (local28 = 0; local28 < Static29.anInt896; local28++) {
			@Pc(123) Interface18 local123 = Static48.anInterface18Array1[local28];
			@Pc(127) int local127 = local123.method5673();
			@Pc(131) char local131 = local123.method5676();
			@Pc(135) int local135 = local123.method5675();
			if (local127 == 84) {
				Static676.method8729(false);
			}
			if (local127 == 80) {
				Static676.method8729(true);
			} else if (local127 == 66 && (local135 & 0x4) != 0) {
				if (Static60.aClipboard1 != null) {
					@Pc(416) String local416 = "";
					for (@Pc(421) int local421 = Static475.aStringArray64.length - 1; local421 >= 0; local421--) {
						if (Static475.aStringArray64[local421] != null && Static475.aStringArray64[local421].length() > 0) {
							local416 = local416 + Static475.aStringArray64[local421] + '\n';
						}
					}
					Static60.aClipboard1.setContents(new StringSelection(local416), (ClipboardOwner) null);
				}
			} else if (local127 == 67 && (local135 & 0x4) != 0) {
				if (Static60.aClipboard1 != null) {
					@Pc(389) Transferable local389 = Static60.aClipboard1.getContents((Object) null);
					if (local389 != null) {
						try {
							@Pc(396) String local396 = (String) local389.getTransferData(DataFlavor.stringFlavor);
							if (local396 != null) {
								@Pc(403) String[] local403 = Static325.method5062(local396, '\n');
								Static149.method2574(local403);
							}
						} catch (@Pc(410) Exception local410) {
						}
					}
				}
			} else if (local127 == 85 && Static22.anInt708 > 0) {
				Static337.aString75 = Static337.aString75.substring(0, Static22.anInt708 - 1) + Static337.aString75.substring(Static22.anInt708);
				Static22.anInt708--;
			} else if (local127 == 101 && Static22.anInt708 < Static337.aString75.length()) {
				Static337.aString75 = Static337.aString75.substring(0, Static22.anInt708) + Static337.aString75.substring(Static22.anInt708 + 1);
			} else if (local127 == 96 && Static22.anInt708 > 0) {
				Static22.anInt708--;
			} else if (local127 == 97 && Static22.anInt708 < Static337.aString75.length()) {
				Static22.anInt708++;
			} else if (local127 == 102) {
				Static22.anInt708 = 0;
			} else if (local127 == 103) {
				Static22.anInt708 = Static337.aString75.length();
			} else if (local127 == 104 && Static475.aStringArray64.length > Static280.anInt5243) {
				Static280.anInt5243++;
				Static228.method2114();
				Static22.anInt708 = Static337.aString75.length();
			} else if (local127 == 105 && Static280.anInt5243 > 0) {
				Static280.anInt5243--;
				Static228.method2114();
				Static22.anInt708 = Static337.aString75.length();
			} else if (Static496.method7044(local131) || local131 == '\' || local131 == '/' || local131 == '.' || local131 == ':' || local131 == ',' || local131 == ' ' || local131 == '_' || local131 == '-' || local131 == '+' || local131 == '[' || local131 == ']') {
				Static337.aString75 = Static337.aString75.substring(0, Static22.anInt708) + Static48.anInterface18Array1[local28].method5676() + Static337.aString75.substring(Static22.anInt708);
				Static22.anInt708++;
			}
		}
		Static29.anInt896 = 0;
		Static406.anInt6932 = 0;
		Static517.method7334();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/io/File;BI)[B")
	public static byte[] method3476(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg1];
			Static160.method2732(arg1, arg0, local14);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}
}
