import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BXSNHAGP")
public final class Class6 {

	@OriginalMember(owner = "client!BXSNHAGP", name = "a", descriptor = "Z")
	private static boolean aBoolean8;

	@OriginalMember(owner = "client!BXSNHAGP", name = "b", descriptor = "Z")
	private static boolean aBoolean9;

	@OriginalMember(owner = "client!BXSNHAGP", name = "c", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!BXSNHAGP", name = "d", descriptor = "Lclient!TQYMAXSO;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_1 = new Class8_Sub1_Sub3(new byte[100], -631);

	@OriginalMember(owner = "client!BXSNHAGP", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!BXSNHAGP", name = "a", descriptor = "(IILclient!TQYMAXSO;)Ljava/lang/String;")
	public static String method26(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				@Pc(21) int local21 = arg1.method406();
				local27 = local21 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local27 - 195];
					local5 = -1;
				} else if (local27 < 13) {
					aCharArray1[local3++] = aCharArray2[local27];
				} else {
					local5 = local27;
				}
				local27 = local21 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local27 - 195];
					local5 = -1;
				} else if (local27 < 13) {
					aCharArray1[local3++] = aCharArray2[local27];
				} else {
					local5 = local27;
				}
			}
			@Pc(105) boolean local105 = true;
			for (local27 = 0; local27 < local3; local27++) {
				@Pc(113) char local113 = aCharArray1[local27];
				if (local105 && local113 >= 'a' && local113 <= 'z') {
					aCharArray1[local27] = (char) (aCharArray1[local27] - 32);
					local105 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local105 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("9130, " + arg0 + ", " + -765 + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXSNHAGP", name = "a", descriptor = "(Ljava/lang/String;ILclient!TQYMAXSO;)V")
	public static void method27(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(17) boolean local17 = false;
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
				@Pc(27) char local27 = arg0.charAt(local21);
				@Pc(29) int local29 = 0;
				for (@Pc(31) int local31 = 0; local31 < aCharArray2.length; local31++) {
					if (local27 == aCharArray2[local31]) {
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
						arg2.method396(local29);
					}
				} else if (local29 < 13) {
					arg2.method396((local19 << 4) + local29);
					local19 = -1;
				} else {
					arg2.method396((local19 << 4) + (local29 >> 4));
					local19 = local29 & 0xF;
				}
			}
			if (local19 != -1) {
				arg2.method396(local19 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("76974, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXSNHAGP", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method28(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			aClass8_Sub1_Sub3_1.anInt620 = 0;
			method27(arg0, 922, aClass8_Sub1_Sub3_1);
			if (arg1 != 0) {
				aBoolean9 = !aBoolean9;
			}
			@Pc(17) int local17 = aClass8_Sub1_Sub3_1.anInt620;
			aClass8_Sub1_Sub3_1.anInt620 = 0;
			return method26(local17, aClass8_Sub1_Sub3_1);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("42012, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
