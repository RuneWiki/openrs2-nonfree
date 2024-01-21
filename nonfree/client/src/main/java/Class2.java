import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!mb;ZI)Ljava/lang/String;")
	public static String method40(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg0.method498();
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
			signlink.reporterror("95971, " + arg0 + ", " + true + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;Lclient!mb;)V")
	public static void method41(@OriginalArg(1) String arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
				@Pc(26) char local26 = arg0.charAt(local20);
				@Pc(28) int local28 = 0;
				for (@Pc(30) int local30 = 0; local30 < aCharArray2.length; local30++) {
					if (local26 == aCharArray2[local30]) {
						local28 = local30;
						break;
					}
				}
				if (local28 > 12) {
					local28 += 195;
				}
				if (local18 == -1) {
					if (local28 < 13) {
						local18 = local28;
					} else {
						arg1.method488(local28);
					}
				} else if (local28 < 13) {
					arg1.method488((local18 << 4) + local28);
					local18 = -1;
				} else {
					arg1.method488((local18 << 4) + (local28 >> 4));
					local18 = local28 & 0xF;
				}
			}
			if (local18 != -1) {
				arg1.method488(local18 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("57407, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}
}
