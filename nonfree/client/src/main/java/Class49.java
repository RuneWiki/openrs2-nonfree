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

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILclient!lb;B)Ljava/lang/String;")
	public static String method676(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method472();
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
			if (arg2 != 6) {
				throw new NullPointerException();
			}
			@Pc(99) boolean local99 = false;
			@Pc(106) boolean local106 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(115) char local115 = aCharArray3[local18];
				if (local106 && local115 >= 'a' && local115 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local106 = false;
				}
				if (local115 == '.' || local115 == '!') {
					local106 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("81846, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILclient!lb;Ljava/lang/String;)V")
	public static void method677(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg2.length() > 80) {
				arg2 = arg2.substring(0, 80);
			}
			arg2 = arg2.toLowerCase();
			@Pc(17) int local17;
			if (arg0 <= 0) {
				for (local17 = 1; local17 > 0; local17++) {
				}
			}
			local17 = -1;
			for (@Pc(26) int local26 = 0; local26 < arg2.length(); local26++) {
				@Pc(32) char local32 = arg2.charAt(local26);
				@Pc(34) int local34 = 0;
				for (@Pc(36) int local36 = 0; local36 < aCharArray4.length; local36++) {
					if (local32 == aCharArray4[local36]) {
						local34 = local36;
						break;
					}
				}
				if (local34 > 12) {
					local34 += 195;
				}
				if (local17 == -1) {
					if (local34 < 13) {
						local17 = local34;
					} else {
						arg1.method462(local34);
					}
				} else if (local34 < 13) {
					arg1.method462((local17 << 4) + local34);
					local17 = -1;
				} else {
					arg1.method462((local17 << 4) + (local34 >> 4));
					local17 = local34 & 0xF;
				}
			}
			if (local17 != -1) {
				arg1.method462(local17 << 4);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("90239, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}
}
