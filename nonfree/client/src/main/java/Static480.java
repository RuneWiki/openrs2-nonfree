import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	public static int anInt7907;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Lclient!wn;")
	public static Class41_Sub2_Sub1_Sub4_Sub2 aClass41_Sub2_Sub1_Sub4_Sub2_2;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_17 = new Class358(13, 0, 1, 0);

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_86 = new Class303(7, -1);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!et;")
	public static Class41_Sub2_Sub1 method6569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class38 local14 = local7.aClass38_2; local14 != null; local14 = local14.aClass38_1) {
			@Pc(18) Class41_Sub2_Sub1 local18 = local14.aClass41_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort147 == arg1 && local18.aShort144 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method6571() {
		if (Static202.anInt3741 < 102) {
			Static202.anInt3741 += 6;
		}
		@Pc(22) int local22;
		if (Static446.anInt7471 != -1 && Static458.aLong218 < Static158.method2936()) {
			for (local22 = Static446.anInt7471; local22 < Static37.aStringArray4.length; local22++) {
				if (Static37.aStringArray4[local22].startsWith("pause")) {
					@Pc(32) int local32 = 5;
					try {
						local32 = Integer.parseInt(Static37.aStringArray4[local22].substring(6));
					} catch (@Pc(41) Exception local41) {
					}
					Static359.method5539("Pausing for " + local32 + " seconds...");
					Static446.anInt7471 = local22 + 1;
					Static458.aLong218 = (long) (local32 * 1000) + Static158.method2936();
					return;
				}
				Static274.aString32 = Static37.aStringArray4[local22];
				Static66.method1439(false);
			}
			Static446.anInt7471 = -1;
		}
		if (Static255.anInt4511 != 0) {
			Static98.anInt1998 -= Static255.anInt4511 * 5;
			if (Static59.anInt1292 <= Static98.anInt1998) {
				Static98.anInt1998 = Static59.anInt1292 - 1;
			}
			Static255.anInt4511 = 0;
			if (Static98.anInt1998 < 0) {
				Static98.anInt1998 = 0;
			}
		}
		for (local22 = 0; local22 < Static158.anInt3266; local22++) {
			@Pc(127) Interface7 local127 = Static11.anInterface7Array1[local22];
			@Pc(131) int local131 = local127.method3368();
			@Pc(135) char local135 = local127.method3370();
			@Pc(139) int local139 = local127.method3366();
			if (local131 == 84) {
				Static66.method1439(false);
			}
			if (local131 == 80) {
				Static66.method1439(true);
			} else if (local131 == 66 && (local139 & 0x4) != 0) {
				if (Static377.aClipboard1 != null) {
					@Pc(483) String local483 = "";
					for (@Pc(488) int local488 = Static421.aStringArray28.length - 1; local488 >= 0; local488--) {
						if (Static421.aStringArray28[local488] != null && Static421.aStringArray28[local488].length() > 0) {
							local483 = local483 + Static421.aStringArray28[local488] + '\n';
						}
					}
					Static377.aClipboard1.setContents(new StringSelection(local483), null);
				}
			} else if (local131 == 67 && (local139 & 0x4) != 0) {
				if (Static377.aClipboard1 != null) {
					@Pc(175) Transferable local175 = Static377.aClipboard1.getContents(null);
					if (local175 != null) {
						try {
							@Pc(182) String local182 = (String) local175.getTransferData(DataFlavor.stringFlavor);
							if (local182 != null) {
								@Pc(189) String[] local189 = Static572.method7699('\n', local182);
								if (local189.length <= 1) {
									Static274.aString32 = Static274.aString32 + local182;
								} else {
									for (@Pc(206) int local206 = 0; local206 < local189.length; local206++) {
										if (local189[local206].startsWith("pause")) {
											@Pc(225) int local225 = 5;
											try {
												local225 = Integer.parseInt(local189[local206].substring(6));
											} catch (@Pc(234) Exception local234) {
											}
											Static359.method5539("Pausing for " + local225 + " seconds...");
											Static446.anInt7471 = local206 + 1;
											Static37.aStringArray4 = local189;
											Static458.aLong218 = Static158.method2936() + (long) (local225 * 1000);
											return;
										}
										Static274.aString32 = local189[local206];
										Static66.method1439(false);
									}
								}
							}
						} catch (@Pc(271) Exception local271) {
						}
					}
				}
			} else if (local131 == 85 && Static252.anInt4476 > 0) {
				Static274.aString32 = Static274.aString32.substring(0, Static252.anInt4476 - 1) + Static274.aString32.substring(Static252.anInt4476);
				Static252.anInt4476--;
			} else if (local131 == 101 && Static252.anInt4476 < Static274.aString32.length()) {
				Static274.aString32 = Static274.aString32.substring(0, Static252.anInt4476) + Static274.aString32.substring(Static252.anInt4476 + 1);
			} else if (local131 == 96 && Static252.anInt4476 > 0) {
				Static252.anInt4476--;
			} else if (local131 == 97 && Static252.anInt4476 < Static274.aString32.length()) {
				Static252.anInt4476++;
			} else if (local131 == 102) {
				Static252.anInt4476 = 0;
			} else if (local131 == 103) {
				Static252.anInt4476 = Static274.aString32.length();
			} else if (local131 == 104 && Static35.anInt639 < Static421.aStringArray28.length) {
				Static35.anInt639++;
				Static21.method352();
				Static252.anInt4476 = Static274.aString32.length();
			} else if (local131 == 105 && Static35.anInt639 > 0) {
				Static35.anInt639--;
				Static21.method352();
				Static252.anInt4476 = Static274.aString32.length();
			} else if (Static3.method5712(local135) || local135 == ':' || local135 == ',' || local135 == ' ' || local135 == '_' || local135 == '-' || local135 == '+' || local135 == '[' || local135 == ']') {
				Static274.aString32 = Static274.aString32.substring(0, Static252.anInt4476) + Static11.anInterface7Array1[local22].method3370() + Static274.aString32.substring(Static252.anInt4476);
				Static252.anInt4476++;
			}
		}
		Static222.anInt3930 = 0;
		Static158.anInt3266 = 0;
		Static238.method3668();
	}
}
