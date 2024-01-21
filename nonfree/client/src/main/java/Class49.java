import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YUIPFPJK")
public final class Class49 {

	@OriginalMember(owner = "client!YUIPFPJK", name = "b", descriptor = "Z")
	private static boolean aBoolean226;

	@OriginalMember(owner = "client!YUIPFPJK", name = "a", descriptor = "Z")
	private static boolean aBoolean225 = true;

	@OriginalMember(owner = "client!YUIPFPJK", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!YUIPFPJK", name = "d", descriptor = "Lclient!EGCCHUZS;")
	private static Class4_Sub1_Sub3 aClass4_Sub1_Sub3_5 = new Class4_Sub1_Sub3(new byte[100], false);

	@OriginalMember(owner = "client!YUIPFPJK", name = "e", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!YUIPFPJK", name = "a", descriptor = "(IILclient!EGCCHUZS;)Ljava/lang/String;")
	public static String method564(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(28) int local28;
			for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
				@Pc(22) int local22 = arg1.method167();
				local28 = local22 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local28 - 195];
					local5 = -1;
				} else if (local28 < 13) {
					aCharArray3[local3++] = aCharArray4[local28];
				} else {
					local5 = local28;
				}
				local28 = local22 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local28 - 195];
					local5 = -1;
				} else if (local28 < 13) {
					aCharArray3[local3++] = aCharArray4[local28];
				} else {
					local5 = local28;
				}
			}
			@Pc(106) boolean local106 = true;
			for (local28 = 0; local28 < local3; local28++) {
				@Pc(114) char local114 = aCharArray3[local28];
				if (local106 && local114 >= 'a' && local114 <= 'z') {
					aCharArray3[local28] = (char) (aCharArray3[local28] - 32);
					local106 = false;
				}
				if (local114 == '.' || local114 == '!' || local114 == '?') {
					local106 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("56812, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUIPFPJK", name = "a", descriptor = "(ZLclient!EGCCHUZS;Ljava/lang/String;)V")
	public static void method565(@OriginalArg(1) Class4_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < arg1.length(); local17++) {
				@Pc(23) char local23 = arg1.charAt(local17);
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < aCharArray4.length; local27++) {
					if (local23 == aCharArray4[local27]) {
						local25 = local27;
						break;
					}
				}
				if (local25 > 12) {
					local25 += 195;
				}
				if (local15 == -1) {
					if (local25 < 13) {
						local15 = local25;
					} else {
						arg0.method157(local25);
					}
				} else if (local25 < 13) {
					arg0.method157((local15 << 4) + local25);
					local15 = -1;
				} else {
					arg0.method157((local15 << 4) + (local25 >> 4));
					local15 = local25 & 0xF;
				}
			}
			if (local15 != -1) {
				arg0.method157(local15 << 4);
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("64561, " + true + ", " + arg0 + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUIPFPJK", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method566(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			aClass4_Sub1_Sub3_5.anInt242 = 0;
			method565(aClass4_Sub1_Sub3_5, arg0);
			@Pc(9) int local9 = aClass4_Sub1_Sub3_5.anInt242;
			aClass4_Sub1_Sub3_5.anInt242 = 0;
			@Pc(17) String local17 = method564(local9, aClass4_Sub1_Sub3_5);
			@Pc(21) boolean local21 = false;
			return local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("25500, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
