import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KJZMDELZ")
public final class Class22 {

	@OriginalMember(owner = "client!KJZMDELZ", name = "a", descriptor = "Z")
	private static boolean aBoolean78 = true;

	@OriginalMember(owner = "client!KJZMDELZ", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!KJZMDELZ", name = "c", descriptor = "Lclient!WNCFPLWV;")
	private static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_4 = new Class3_Sub1_Sub4((byte) -58, new byte[100]);

	@OriginalMember(owner = "client!KJZMDELZ", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!KJZMDELZ", name = "a", descriptor = "(ILclient!WNCFPLWV;I)Ljava/lang/String;")
	public static String method238(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method458();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray2[local3++] = aCharArray3[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray2[local3++] = aCharArray3[local18];
				} else {
					local5 = local18;
				}
			}
			@Pc(96) boolean local96 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(113) char local113 = aCharArray2[local18];
				if (local96 && local113 >= 'a' && local113 <= 'z') {
					aCharArray2[local18] = (char) (aCharArray2[local18] - 32);
					local96 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("58969, " + arg0 + ", " + arg1 + ", " + -21362 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJZMDELZ", name = "a", descriptor = "(Ljava/lang/String;Lclient!WNCFPLWV;B)V")
	public static void method239(@OriginalArg(0) String arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(27) int local27 = 0; local27 < arg0.length(); local27++) {
				@Pc(33) char local33 = arg0.charAt(local27);
				@Pc(35) int local35 = 0;
				for (@Pc(37) int local37 = 0; local37 < aCharArray3.length; local37++) {
					if (local33 == aCharArray3[local37]) {
						local35 = local37;
						break;
					}
				}
				if (local35 > 12) {
					local35 += 195;
				}
				if (local15 == -1) {
					if (local35 < 13) {
						local15 = local35;
					} else {
						arg1.method448(local35);
					}
				} else if (local35 < 13) {
					arg1.method448((local15 << 4) + local35);
					local15 = -1;
				} else {
					arg1.method448((local15 << 4) + (local35 >> 4));
					local15 = local35 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method448(local15 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("27509, " + arg0 + ", " + arg1 + ", " + 109 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJZMDELZ", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method240(@OriginalArg(0) String arg0) {
		try {
			aClass3_Sub1_Sub4_4.anInt666 = 0;
			method239(arg0, aClass3_Sub1_Sub4_4);
			@Pc(15) int local15 = aClass3_Sub1_Sub4_4.anInt666;
			aClass3_Sub1_Sub4_4.anInt666 = 0;
			return method238(local15, aClass3_Sub1_Sub4_4);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("45606, " + arg0 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
