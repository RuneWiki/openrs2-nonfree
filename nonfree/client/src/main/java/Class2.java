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

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!mb;I)Ljava/lang/String;")
	public static String method36(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(25) int local25;
			for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
				@Pc(19) int local19 = arg1.method467();
				local25 = local19 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local25 - 195];
					local5 = -1;
				} else if (local25 < 13) {
					aCharArray1[local3++] = aCharArray2[local25];
				} else {
					local5 = local25;
				}
				local25 = local19 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local25 - 195];
					local5 = -1;
				} else if (local25 < 13) {
					aCharArray1[local3++] = aCharArray2[local25];
				} else {
					local5 = local25;
				}
			}
			@Pc(103) boolean local103 = true;
			for (local25 = 0; local25 < local3; local25++) {
				@Pc(111) char local111 = aCharArray1[local25];
				if (local103 && local111 >= 'a' && local111 <= 'z') {
					aCharArray1[local25] = (char) (aCharArray1[local25] - 32);
					local103 = false;
				}
				if (local111 == '.' || local111 == '!') {
					local103 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("95835, " + arg0 + ", " + arg1 + ", " + -19777 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLjava/lang/String;Lclient!mb;)V")
	public static void method37(@OriginalArg(1) String arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
				@Pc(32) char local32 = arg0.charAt(local26);
				@Pc(34) int local34 = 0;
				for (@Pc(36) int local36 = 0; local36 < aCharArray2.length; local36++) {
					if (local32 == aCharArray2[local36]) {
						local34 = local36;
						break;
					}
				}
				if (local34 > 12) {
					local34 += 195;
				}
				if (local15 == -1) {
					if (local34 < 13) {
						local15 = local34;
					} else {
						arg1.method457(local34);
					}
				} else if (local34 < 13) {
					arg1.method457((local15 << 4) + local34);
					local15 = -1;
				} else {
					arg1.method457((local15 << 4) + (local34 >> 4));
					local15 = local34 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method457(local15 << 4);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("3193, " + false + ", " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}
}
