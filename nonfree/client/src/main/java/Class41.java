import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class41 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!kb;)Ljava/lang/String;")
	public static String method525(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = -1;
			@Pc(25) int local25;
			for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
				@Pc(19) int local19 = arg1.method372();
				local25 = local19 >> 4 & 0xF;
				if (local12 != -1) {
					aCharArray3[local10++] = aCharArray4[(local12 << 4) + local25 - 195];
					local12 = -1;
				} else if (local25 < 13) {
					aCharArray3[local10++] = aCharArray4[local25];
				} else {
					local12 = local25;
				}
				local25 = local19 & 0xF;
				if (local12 != -1) {
					aCharArray3[local10++] = aCharArray4[(local12 << 4) + local25 - 195];
					local12 = -1;
				} else if (local25 < 13) {
					aCharArray3[local10++] = aCharArray4[local25];
				} else {
					local12 = local25;
				}
			}
			@Pc(103) boolean local103 = true;
			for (local25 = 0; local25 < local10; local25++) {
				@Pc(111) char local111 = aCharArray3[local25];
				if (local103 && local111 >= 'a' && local111 <= 'z') {
					aCharArray3[local25] = (char) (aCharArray3[local25] - 32);
					local103 = false;
				}
				if (local111 == '.' || local111 == '!') {
					local103 = true;
				}
			}
			return new String(aCharArray3, 0, local10);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("40404, " + arg0 + ", " + 2 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!kb;Ljava/lang/String;B)V")
	public static void method526(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(18) boolean local18 = false;
			@Pc(29) int local29 = -1;
			for (@Pc(31) int local31 = 0; local31 < arg1.length(); local31++) {
				@Pc(37) char local37 = arg1.charAt(local31);
				@Pc(39) int local39 = 0;
				for (@Pc(41) int local41 = 0; local41 < aCharArray4.length; local41++) {
					if (local37 == aCharArray4[local41]) {
						local39 = local41;
						break;
					}
				}
				if (local39 > 12) {
					local39 += 195;
				}
				if (local29 == -1) {
					if (local39 < 13) {
						local29 = local39;
					} else {
						arg0.method362(local39);
					}
				} else if (local39 < 13) {
					arg0.method362((local29 << 4) + local39);
					local29 = -1;
				} else {
					arg0.method362((local29 << 4) + (local39 >> 4));
					local29 = local39 & 0xF;
				}
			}
			if (local29 != -1) {
				arg0.method362(local29 << 4);
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("46215, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
