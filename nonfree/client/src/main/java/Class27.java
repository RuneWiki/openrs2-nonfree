import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QFWDHRAY")
public final class Class27 {

	@OriginalMember(owner = "client!QFWDHRAY", name = "a", descriptor = "I")
	private static int anInt610 = 810;

	@OriginalMember(owner = "client!QFWDHRAY", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!QFWDHRAY", name = "c", descriptor = "Lclient!GHHPHSRU;")
	private static Class3_Sub1_Sub2 aClass3_Sub1_Sub2_3 = new Class3_Sub1_Sub2(-527, new byte[100]);

	@OriginalMember(owner = "client!QFWDHRAY", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!QFWDHRAY", name = "a", descriptor = "(ILclient!GHHPHSRU;I)Ljava/lang/String;")
	public static String method407(@OriginalArg(1) Class3_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(24) int local24;
			for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
				@Pc(18) int local18 = arg0.method89();
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
			signlink.reporterror("89491, " + -375 + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QFWDHRAY", name = "a", descriptor = "(Ljava/lang/String;Lclient!GHHPHSRU;B)V")
	public static void method408(@OriginalArg(0) String arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
				@Pc(27) char local27 = arg0.charAt(local21);
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
				if (local19 == -1) {
					if (local29 < 13) {
						local19 = local29;
					} else {
						arg1.method79(local29);
					}
				} else if (local29 < 13) {
					arg1.method79((local19 << 4) + local29);
					local19 = -1;
				} else {
					arg1.method79((local19 << 4) + (local29 >> 4));
					local19 = local29 & 0xF;
				}
			}
			if (local19 != -1) {
				arg1.method79(local19 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("12752, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QFWDHRAY", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method409(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			aClass3_Sub1_Sub2_3.anInt257 = 0;
			method408(arg1, aClass3_Sub1_Sub2_3);
			@Pc(9) int local9 = aClass3_Sub1_Sub2_3.anInt257;
			@Pc(13) boolean local13 = false;
			aClass3_Sub1_Sub2_3.anInt257 = 0;
			return method407(aClass3_Sub1_Sub2_3, local9);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("9627, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
