import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_143 = new Class100(28, 0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IJ)I")
	public static int method9157(@OriginalArg(1) long arg0) {
		Static625.method8782(arg0);
		return Static170.aCalendar1.get(1);
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
	public static void method9162() {
		Static158.aClass264_20.method6360();
	}

	@OriginalMember(owner = "client!je", name = "i", descriptor = "(I)V")
	public static void method9163() {
		if (Static217.anInt4094 < 102) {
			Static217.anInt4094 += 6;
		}
		@Pc(23) int local23;
		if (Static332.anInt6279 != -1 && Static94.aLong53 < Static521.method7499()) {
			for (local23 = Static332.anInt6279; local23 < Static56.aStringArray6.length; local23++) {
				if (Static56.aStringArray6[local23].startsWith("pause")) {
					@Pc(42) int local42 = 5;
					try {
						local42 = Integer.parseInt(Static56.aStringArray6[local23].substring(6));
					} catch (@Pc(51) Exception local51) {
					}
					Static466.method6830("Pausing for " + local42 + " seconds...");
					Static332.anInt6279 = local23 + 1;
					Static94.aLong53 = Static521.method7499() + (long) (local42 * 1000);
					return;
				}
				Static76.aString15 = Static56.aStringArray6[local23];
				Static37.method841(false);
			}
			Static332.anInt6279 = -1;
		}
		if (Static23.anInt426 != 0) {
			Static157.anInt3114 -= Static23.anInt426 * 5;
			if (Static559.anInt9499 <= Static157.anInt3114) {
				Static157.anInt3114 = Static559.anInt9499 - 1;
			}
			Static23.anInt426 = 0;
			if (Static157.anInt3114 < 0) {
				Static157.anInt3114 = 0;
			}
		}
		for (local23 = 0; local23 < Static569.anInt9812; local23++) {
			@Pc(122) Interface7 local122 = Static433.anInterface7Array3[local23];
			@Pc(126) int local126 = local122.method3427();
			@Pc(130) char local130 = local122.method3428();
			@Pc(134) int local134 = local122.method3430();
			if (local126 == 84) {
				Static37.method841(false);
			}
			if (local126 == 80) {
				Static37.method841(true);
			} else if (local126 == 66 && (local134 & 0x4) != 0) {
				if (Static518.aClipboard3 != null) {
					@Pc(157) String local157 = "";
					for (@Pc(162) int local162 = Static286.aStringArray14.length - 1; local162 >= 0; local162--) {
						if (Static286.aStringArray14[local162] != null && Static286.aStringArray14[local162].length() > 0) {
							local157 = local157 + Static286.aStringArray14[local162] + '\n';
						}
					}
					Static518.aClipboard3.setContents(new StringSelection(local157), (ClipboardOwner) null);
				}
			} else if (local126 == 67 && (local134 & 0x4) != 0) {
				if (Static518.aClipboard3 != null) {
					@Pc(217) Transferable local217 = Static518.aClipboard3.getContents((Object) null);
					if (local217 != null) {
						try {
							@Pc(224) String local224 = (String) local217.getTransferData(DataFlavor.stringFlavor);
							if (local224 != null) {
								@Pc(231) String[] local231 = Static111.method1920('\n', local224);
								Static517.method7485(local231);
							}
						} catch (@Pc(236) Exception local236) {
						}
					}
				}
			} else if (local126 == 85 && Static283.anInt4865 > 0) {
				Static76.aString15 = Static76.aString15.substring(0, Static283.anInt4865 - 1) + Static76.aString15.substring(Static283.anInt4865);
				Static283.anInt4865--;
			} else if (local126 == 101 && Static283.anInt4865 < Static76.aString15.length()) {
				Static76.aString15 = Static76.aString15.substring(0, Static283.anInt4865) + Static76.aString15.substring(Static283.anInt4865 + 1);
			} else if (local126 == 96 && Static283.anInt4865 > 0) {
				Static283.anInt4865--;
			} else if (local126 == 97 && Static283.anInt4865 < Static76.aString15.length()) {
				Static283.anInt4865++;
			} else if (local126 == 102) {
				Static283.anInt4865 = 0;
			} else if (local126 == 103) {
				Static283.anInt4865 = Static76.aString15.length();
			} else if (local126 == 104 && Static286.aStringArray14.length > Static166.anInt3247) {
				Static166.anInt3247++;
				Static326.method5122();
				Static283.anInt4865 = Static76.aString15.length();
			} else if (local126 == 105 && Static166.anInt3247 > 0) {
				Static166.anInt3247--;
				Static326.method5122();
				Static283.anInt4865 = Static76.aString15.length();
			} else if (Static232.method3510(local130) || "\\/.:, _-+[]~@".indexOf(local130) != -1) {
				Static76.aString15 = Static76.aString15.substring(0, Static283.anInt4865) + Static433.anInterface7Array3[local23].method3428() + Static76.aString15.substring(Static283.anInt4865);
				Static283.anInt4865++;
			}
		}
		Static189.anInt3564 = 0;
		Static569.anInt9812 = 0;
		Static31.method720();
	}
}
