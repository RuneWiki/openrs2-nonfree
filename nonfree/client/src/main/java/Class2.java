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

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!mb;II)Ljava/lang/String;")
	public static String method40(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
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
			@Pc(96) boolean local96 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(115) char local115 = aCharArray1[local18];
				if (local96 && local115 >= 'a' && local115 <= 'z') {
					aCharArray1[local18] = (char) (aCharArray1[local18] - 32);
					local96 = false;
				}
				if (local115 == '.' || local115 == '!') {
					local96 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("42413, " + arg0 + ", " + arg1 + ", " + -468 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!mb;ILjava/lang/String;)V")
	public static void method41(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
				@Pc(27) char local27 = arg1.charAt(local21);
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
						arg0.method488(local29);
					}
				} else if (local29 < 13) {
					arg0.method488((local19 << 4) + local29);
					local19 = -1;
				} else {
					arg0.method488((local19 << 4) + (local29 >> 4));
					local19 = local29 & 0xF;
				}
			}
			if (local19 != -1) {
				arg0.method488(local19 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("40949, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}
}
