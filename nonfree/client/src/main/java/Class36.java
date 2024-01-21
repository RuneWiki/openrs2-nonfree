import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class36 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private static boolean aBoolean112;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	private static boolean aBoolean111 = true;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!jb;I)Ljava/lang/String;")
	public static String method437(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(26) int local26;
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			@Pc(20) int local20 = arg0.method331();
			local26 = local20 >> 4 & 0xF;
			if (local5 != -1) {
				aCharArray3[local3++] = aCharArray4[(local5 << 4) + local26 - 195];
				local5 = -1;
			} else if (local26 < 13) {
				aCharArray3[local3++] = aCharArray4[local26];
			} else {
				local5 = local26;
			}
			local26 = local20 & 0xF;
			if (local5 != -1) {
				aCharArray3[local3++] = aCharArray4[(local5 << 4) + local26 - 195];
				local5 = -1;
			} else if (local26 < 13) {
				aCharArray3[local3++] = aCharArray4[local26];
			} else {
				local5 = local26;
			}
		}
		@Pc(104) boolean local104 = true;
		for (local26 = 0; local26 < local3; local26++) {
			@Pc(112) char local112 = aCharArray3[local26];
			if (local104 && local112 >= 'a' && local112 <= 'z') {
				aCharArray3[local26] = (char) (aCharArray3[local26] - 32);
				local104 = false;
			}
			if (local112 == '.' || local112 == '!') {
				local104 = true;
			}
		}
		return new String(aCharArray3, 0, local3);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!jb;Ljava/lang/String;I)V")
	public static void method438(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) String arg1) {
		if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		arg1 = arg1.toLowerCase();
		@Pc(23) int local23 = -1;
		for (@Pc(25) int local25 = 0; local25 < arg1.length(); local25++) {
			@Pc(31) char local31 = arg1.charAt(local25);
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
					arg0.method324(local33);
				}
			} else if (local33 < 13) {
				arg0.method324((local23 << 4) + local33);
				local23 = -1;
			} else {
				arg0.method324((local23 << 4) + (local33 >> 4));
				local23 = local33 & 0xF;
			}
		}
		if (local23 != -1) {
			arg0.method324(local23 << 4);
		}
	}
}
