import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YPBNZDGQ")
public final class Class47 {

	@OriginalMember(owner = "client!YPBNZDGQ", name = "a", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!YPBNZDGQ", name = "b", descriptor = "Lclient!BSNPYLEV;")
	private static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_4 = new Class2_Sub1_Sub2(new byte[100], (byte) 3);

	@OriginalMember(owner = "client!YPBNZDGQ", name = "c", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!YPBNZDGQ", name = "a", descriptor = "(ILclient!BSNPYLEV;I)Ljava/lang/String;")
	public static String method561(@OriginalArg(1) Class2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg0.method94();
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
			@Pc(106) boolean local106 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(114) char local114 = aCharArray3[local18];
				if (local106 && local114 >= 'a' && local114 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local106 = false;
				}
				if (local114 == '.' || local114 == '!' || local114 == '?') {
					local106 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("81782, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YPBNZDGQ", name = "a", descriptor = "(Ljava/lang/String;Lclient!BSNPYLEV;B)V")
	public static void method562(@OriginalArg(0) String arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(25) int local25 = -1;
			for (@Pc(27) int local27 = 0; local27 < arg0.length(); local27++) {
				@Pc(33) char local33 = arg0.charAt(local27);
				@Pc(35) int local35 = 0;
				for (@Pc(37) int local37 = 0; local37 < aCharArray4.length; local37++) {
					if (local33 == aCharArray4[local37]) {
						local35 = local37;
						break;
					}
				}
				if (local35 > 12) {
					local35 += 195;
				}
				if (local25 == -1) {
					if (local35 < 13) {
						local25 = local35;
					} else {
						arg1.method84(local35);
					}
				} else if (local35 < 13) {
					arg1.method84((local25 << 4) + local35);
					local25 = -1;
				} else {
					arg1.method84((local25 << 4) + (local35 >> 4));
					local25 = local35 & 0xF;
				}
			}
			if (local25 != -1) {
				arg1.method84(local25 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("35358, " + arg0 + ", " + arg1 + ", " + -4 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YPBNZDGQ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method563(@OriginalArg(1) String arg0) {
		try {
			aClass2_Sub1_Sub2_4.anInt81 = 0;
			method562(arg0, aClass2_Sub1_Sub2_4);
			@Pc(15) int local15 = aClass2_Sub1_Sub2_4.anInt81;
			aClass2_Sub1_Sub2_4.anInt81 = 0;
			return method561(aClass2_Sub1_Sub2_4, local15);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("30275, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
