import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt1035;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(IBLclient!lb;)Ljava/lang/String;")
	public static String method678(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method474();
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
			@Pc(96) boolean local96 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(104) char local104 = aCharArray3[local18];
				if (local96 && local104 >= 'a' && local104 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local104 == '.' || local104 == '!') {
					local96 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("18888, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;ZLclient!lb;)V")
	public static void method679(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
				@Pc(26) char local26 = arg0.charAt(local20);
				@Pc(28) int local28 = 0;
				for (@Pc(30) int local30 = 0; local30 < aCharArray4.length; local30++) {
					if (local26 == aCharArray4[local30]) {
						local28 = local30;
						break;
					}
				}
				if (local28 > 12) {
					local28 += 195;
				}
				if (local15 == -1) {
					if (local28 < 13) {
						local15 = local28;
					} else {
						arg1.method464(local28);
					}
				} else if (local28 < 13) {
					arg1.method464((local15 << 4) + local28);
					local15 = -1;
				} else {
					arg1.method464((local15 << 4) + (local28 >> 4));
					local15 = local28 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method464(local15 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("77533, " + arg0 + ", " + true + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}
}
