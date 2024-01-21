import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZIBXIXQC")
public final class Class49 {

	@OriginalMember(owner = "client!ZIBXIXQC", name = "b", descriptor = "Z")
	private static boolean aBoolean221;

	@OriginalMember(owner = "client!ZIBXIXQC", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!ZIBXIXQC", name = "d", descriptor = "Lclient!NQUAUMDT;")
	private static Class6_Sub2_Sub3 aClass6_Sub2_Sub3_5 = new Class6_Sub2_Sub3(-587, new byte[100]);

	@OriginalMember(owner = "client!ZIBXIXQC", name = "e", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!ZIBXIXQC", name = "a", descriptor = "(IZLclient!NQUAUMDT;)Ljava/lang/String;")
	public static String method537(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method262();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray3[local3++] = aCharArray4[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray3[local3++] = aCharArray4[local18];
				} else {
					local5 = local18;
				}
			}
			@Pc(102) boolean local102 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(110) char local110 = aCharArray3[local18];
				if (local102 && local110 >= 'a' && local110 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local102 = false;
				}
				if (local110 == '.' || local110 == '!' || local110 == '?') {
					local102 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("21776, " + arg0 + ", " + false + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZIBXIXQC", name = "a", descriptor = "(Ljava/lang/String;Lclient!NQUAUMDT;I)V")
	public static void method538(@OriginalArg(0) String arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				@Pc(23) char local23 = arg0.charAt(local17);
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
						arg1.method252(local25);
					}
				} else if (local25 < 13) {
					arg1.method252((local15 << 4) + local25);
					local15 = -1;
				} else {
					arg1.method252((local15 << 4) + (local25 >> 4));
					local15 = local25 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method252(local15 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("12667, " + arg0 + ", " + arg1 + ", " + -113 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZIBXIXQC", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method539(@OriginalArg(1) String arg0) {
		try {
			aClass6_Sub2_Sub3_5.anInt404 = 0;
			method538(arg0, aClass6_Sub2_Sub3_5);
			@Pc(9) int local9 = aClass6_Sub2_Sub3_5.anInt404;
			aClass6_Sub2_Sub3_5.anInt404 = 0;
			return method537(local9, aClass6_Sub2_Sub3_5);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("62385, " + 21 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
