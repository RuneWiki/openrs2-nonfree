import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XMKPAVXA")
public final class Class46 {

	@OriginalMember(owner = "client!XMKPAVXA", name = "a", descriptor = "Z")
	private static boolean aBoolean175 = true;

	@OriginalMember(owner = "client!XMKPAVXA", name = "b", descriptor = "I")
	private static int anInt755 = -90;

	@OriginalMember(owner = "client!XMKPAVXA", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!XMKPAVXA", name = "d", descriptor = "Lclient!BJPWOXRJ;")
	private static Class1_Sub1_Sub2 aClass1_Sub1_Sub2_5 = new Class1_Sub1_Sub2(false, new byte[100]);

	@OriginalMember(owner = "client!XMKPAVXA", name = "e", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!XMKPAVXA", name = "a", descriptor = "(Lclient!BJPWOXRJ;II)Ljava/lang/String;")
	public static String method500(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = -1;
			@Pc(26) int local26;
			for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
				@Pc(20) int local20 = arg0.method22();
				local26 = local20 >> 4 & 0xF;
				if (local13 != -1) {
					aCharArray3[local11++] = aCharArray4[(local13 << 4) + local26 - 195];
					local13 = -1;
				} else if (local26 < 13) {
					aCharArray3[local11++] = aCharArray4[local26];
				} else {
					local13 = local26;
				}
				local26 = local20 & 0xF;
				if (local13 != -1) {
					aCharArray3[local11++] = aCharArray4[(local13 << 4) + local26 - 195];
					local13 = -1;
				} else if (local26 < 13) {
					aCharArray3[local11++] = aCharArray4[local26];
				} else {
					local13 = local26;
				}
			}
			@Pc(104) boolean local104 = true;
			for (local26 = 0; local26 < local11; local26++) {
				@Pc(112) char local112 = aCharArray3[local26];
				if (local104 && local112 >= 'a' && local112 <= 'z') {
					aCharArray3[local26] = (char) (aCharArray3[local26] - 32);
					local104 = false;
				}
				if (local112 == '.' || local112 == '!' || local112 == '?') {
					local104 = true;
				}
			}
			return new String(aCharArray3, 0, local11);
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("14058, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XMKPAVXA", name = "a", descriptor = "(BLclient!BJPWOXRJ;Ljava/lang/String;)V")
	public static void method501(@OriginalArg(1) Class1_Sub1_Sub2 arg0, @OriginalArg(2) String arg1) {
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
						arg0.method12(local25);
					}
				} else if (local25 < 13) {
					arg0.method12((local15 << 4) + local25);
					local15 = -1;
				} else {
					arg0.method12((local15 << 4) + (local25 >> 4));
					local15 = local25 & 0xF;
				}
			}
			if (local15 != -1) {
				arg0.method12(local15 << 4);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("73138, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XMKPAVXA", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method502(@OriginalArg(1) String arg0) {
		try {
			aClass1_Sub1_Sub2_5.anInt10 = 0;
			method501(aClass1_Sub1_Sub2_5, arg0);
			@Pc(9) int local9 = aClass1_Sub1_Sub2_5.anInt10;
			aClass1_Sub1_Sub2_5.anInt10 = 0;
			return method500(aClass1_Sub1_Sub2_5, local9);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("75770, " + -42231 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
