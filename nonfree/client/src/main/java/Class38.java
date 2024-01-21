import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class38 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
	private static boolean aBoolean142;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!kb;)Ljava/lang/String;")
	public static String method487(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method380();
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
				@Pc(111) char local111 = aCharArray3[local18];
				if (local96 && local111 >= 'a' && local111 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local111 == '.' || local111 == '!') {
					local96 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("74540, " + -17950 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;ZLclient!kb;)V")
	public static void method488(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(23) int local23 = -1;
			for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
				@Pc(31) char local31 = arg0.charAt(local25);
				@Pc(33) int local33 = 0;
				for (@Pc(35) int local35 = 0; local35 < aCharArray4.length; local35++) {
					if (local31 == aCharArray4[local35]) {
						local33 = local35;
						break;
					}
				}
				if (local33 > 12) {
					local33 += 195;
				}
				if (local23 == -1) {
					if (local33 < 13) {
						local23 = local33;
					} else {
						arg1.method372(local33);
					}
				} else if (local33 < 13) {
					arg1.method372((local23 << 4) + local33);
					local23 = -1;
				} else {
					arg1.method372((local23 << 4) + (local33 >> 4));
					local23 = local33 & 0xF;
				}
			}
			if (local23 != -1) {
				arg1.method372(local23 << 4);
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("1567, " + arg0 + ", " + true + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}
}
