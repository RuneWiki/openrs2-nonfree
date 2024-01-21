import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IQRKADXA")
public final class Class13 {

	@OriginalMember(owner = "client!IQRKADXA", name = "a", descriptor = "I")
	private static int anInt167 = 9;

	@OriginalMember(owner = "client!IQRKADXA", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!IQRKADXA", name = "c", descriptor = "Lclient!SVWJKJVI;")
	private static Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1 = new Class1_Sub1_Sub4(new byte[100], true);

	@OriginalMember(owner = "client!IQRKADXA", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!IQRKADXA", name = "a", descriptor = "(Lclient!SVWJKJVI;II)Ljava/lang/String;")
	public static String method136(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(24) int local24;
			for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
				@Pc(18) int local18 = arg0.method405();
				local24 = local18 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local24 - 195];
					local5 = -1;
				} else if (local24 < 13) {
					aCharArray2[local3++] = aCharArray3[local24];
				} else {
					local5 = local24;
				}
				local24 = local18 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local24 - 195];
					local5 = -1;
				} else if (local24 < 13) {
					aCharArray2[local3++] = aCharArray3[local24];
				} else {
					local5 = local24;
				}
			}
			@Pc(102) boolean local102 = true;
			for (local24 = 0; local24 < local3; local24++) {
				@Pc(110) char local110 = aCharArray2[local24];
				if (local102 && local110 >= 'a' && local110 <= 'z') {
					aCharArray2[local24] = (char) (aCharArray2[local24] - 32);
					local102 = false;
				}
				if (local110 == '.' || local110 == '!' || local110 == '?') {
					local102 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("28315, " + arg0 + ", " + arg1 + ", " + -562 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IQRKADXA", name = "a", descriptor = "(Lclient!SVWJKJVI;ILjava/lang/String;)V")
	public static void method137(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
				@Pc(27) char local27 = arg1.charAt(local21);
				@Pc(29) int local29 = 0;
				for (@Pc(31) int local31 = 0; local31 < aCharArray3.length; local31++) {
					if (local27 == aCharArray3[local31]) {
						local29 = local31;
						break;
					}
				}
				if (local29 > 12) {
					local29 += 195;
				}
				if (local15 == -1) {
					if (local29 < 13) {
						local15 = local29;
					} else {
						arg0.method395(local29);
					}
				} else if (local29 < 13) {
					arg0.method395((local15 << 4) + local29);
					local15 = -1;
				} else {
					arg0.method395((local15 << 4) + (local29 >> 4));
					local15 = local29 & 0xF;
				}
			}
			if (local15 != -1) {
				arg0.method395(local15 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("96440, " + arg0 + ", " + 815 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IQRKADXA", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method138(@OriginalArg(1) String arg0) {
		try {
			aClass1_Sub1_Sub4_1.anInt624 = 0;
			method137(aClass1_Sub1_Sub4_1, arg0);
			@Pc(15) int local15 = aClass1_Sub1_Sub4_1.anInt624;
			aClass1_Sub1_Sub4_1.anInt624 = 0;
			return method136(aClass1_Sub1_Sub4_1, local15);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("49771, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
