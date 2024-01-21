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
	public static String method40(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6;
			if (arg2 != 2) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			local6 = 0;
			@Pc(15) int local15 = -1;
			@Pc(28) int local28;
			for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
				@Pc(22) int local22 = arg1.method498();
				local28 = local22 >> 4 & 0xF;
				if (local15 != -1) {
					aCharArray1[local6++] = aCharArray2[(local15 << 4) + local28 - 195];
					local15 = -1;
				} else if (local28 < 13) {
					aCharArray1[local6++] = aCharArray2[local28];
				} else {
					local15 = local28;
				}
				local28 = local22 & 0xF;
				if (local15 != -1) {
					aCharArray1[local6++] = aCharArray2[(local15 << 4) + local28 - 195];
					local15 = -1;
				} else if (local28 < 13) {
					aCharArray1[local6++] = aCharArray2[local28];
				} else {
					local15 = local28;
				}
			}
			@Pc(106) boolean local106 = true;
			for (local28 = 0; local28 < local6; local28++) {
				@Pc(114) char local114 = aCharArray1[local28];
				if (local106 && local114 >= 'a' && local114 <= 'z') {
					aCharArray1[local28] = (char) (aCharArray1[local28] - 32);
					local106 = false;
				}
				if (local114 == '.' || local114 == '!') {
					local106 = true;
				}
			}
			return new String(aCharArray1, 0, local6);
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("70690, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;Lclient!mb;I)V")
	public static void method41(@OriginalArg(0) String arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(25) int local25 = -1;
			for (@Pc(27) int local27 = 0; local27 < arg0.length(); local27++) {
				@Pc(33) char local33 = arg0.charAt(local27);
				@Pc(35) int local35 = 0;
				for (@Pc(37) int local37 = 0; local37 < aCharArray2.length; local37++) {
					if (local33 == aCharArray2[local37]) {
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
						arg1.method488(local35);
					}
				} else if (local35 < 13) {
					arg1.method488((local25 << 4) + local35);
					local25 = -1;
				} else {
					arg1.method488((local25 << 4) + (local35 >> 4));
					local25 = local35 & 0xF;
				}
			}
			if (local25 != -1) {
				arg1.method488(local25 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("45396, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}
}
