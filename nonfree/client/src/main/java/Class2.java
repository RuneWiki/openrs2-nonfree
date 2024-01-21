import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
	private static boolean aBoolean20;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!mb;)Ljava/lang/String;")
	public static String method40(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method496();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray1[local3++] = aCharArray2[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray1[local3++] = aCharArray2[local18];
				} else {
					local5 = local18;
				}
			}
			@Pc(102) boolean local102 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(110) char local110 = aCharArray1[local18];
				if (local102 && local110 >= 'a' && local110 <= 'z') {
					aCharArray1[local18] = (char) (aCharArray1[local18] - 32);
					local102 = false;
				}
				if (local110 == '.' || local110 == '!') {
					local102 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("83047, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!mb;Ljava/lang/String;)V")
	public static void method41(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(27) int local27 = -1;
			for (@Pc(29) int local29 = 0; local29 < arg1.length(); local29++) {
				@Pc(35) char local35 = arg1.charAt(local29);
				@Pc(37) int local37 = 0;
				for (@Pc(39) int local39 = 0; local39 < aCharArray2.length; local39++) {
					if (local35 == aCharArray2[local39]) {
						local37 = local39;
						break;
					}
				}
				if (local37 > 12) {
					local37 += 195;
				}
				if (local27 == -1) {
					if (local37 < 13) {
						local27 = local37;
					} else {
						arg0.method486(local37);
					}
				} else if (local37 < 13) {
					arg0.method486((local27 << 4) + local37);
					local27 = -1;
				} else {
					arg0.method486((local27 << 4) + (local37 >> 4));
					local27 = local37 & 0xF;
				}
			}
			if (local27 != -1) {
				arg0.method486(local27 << 4);
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("56556, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}
}
