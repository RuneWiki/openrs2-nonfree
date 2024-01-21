import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class41 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	private static int anInt784 = 410;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!kb;)Ljava/lang/String;")
	public static String method537(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = -1;
			@Pc(24) int local24;
			for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
				@Pc(18) int local18 = arg1.method383();
				local24 = local18 >> 4 & 0xF;
				if (local11 != -1) {
					aCharArray3[local9++] = aCharArray4[(local11 << 4) + local24 - 195];
					local11 = -1;
				} else if (local24 < 13) {
					aCharArray3[local9++] = aCharArray4[local24];
				} else {
					local11 = local24;
				}
				local24 = local18 & 0xF;
				if (local11 != -1) {
					aCharArray3[local9++] = aCharArray4[(local11 << 4) + local24 - 195];
					local11 = -1;
				} else if (local24 < 13) {
					aCharArray3[local9++] = aCharArray4[local24];
				} else {
					local11 = local24;
				}
			}
			@Pc(102) boolean local102 = true;
			for (local24 = 0; local24 < local9; local24++) {
				@Pc(110) char local110 = aCharArray3[local24];
				if (local102 && local110 >= 'a' && local110 <= 'z') {
					aCharArray3[local24] = (char) (aCharArray3[local24] - 32);
					local102 = false;
				}
				if (local110 == '.' || local110 == '!') {
					local102 = true;
				}
			}
			return new String(aCharArray3, 0, local9);
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("93566, " + -137 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;BLclient!kb;)V")
	public static void method538(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
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
						arg1.method373(local35);
					}
				} else if (local35 < 13) {
					arg1.method373((local25 << 4) + local35);
					local25 = -1;
				} else {
					arg1.method373((local25 << 4) + (local35 >> 4));
					local25 = local35 & 0xF;
				}
			}
			if (local25 != -1) {
				arg1.method373(local25 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("93575, " + arg0 + ", " + -82 + ", " + arg1 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}
}
