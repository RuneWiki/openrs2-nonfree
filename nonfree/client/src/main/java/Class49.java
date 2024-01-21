import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BILclient!lb;)Ljava/lang/String;")
	public static String method677(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg2.method473();
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
			@Pc(99) boolean local99 = false;
			@Pc(107) boolean local107 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(115) char local115 = aCharArray3[local18];
				if (local107 && local115 >= 'a' && local115 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local107 = false;
				}
				if (local115 == '.' || local115 == '!') {
					local107 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("77981, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;BLclient!lb;)V")
	public static void method678(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
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
						arg1.method463(local35);
					}
				} else if (local35 < 13) {
					arg1.method463((local25 << 4) + local35);
					local25 = -1;
				} else {
					arg1.method463((local25 << 4) + (local35 >> 4));
					local25 = local35 & 0xF;
				}
			}
			if (local25 != -1) {
				arg1.method463(local25 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("70924, " + arg0 + ", " + 126 + ", " + arg1 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}
}
