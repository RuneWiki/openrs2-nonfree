import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GDVTWATR")
public final class Class13 {

	@OriginalMember(owner = "client!GDVTWATR", name = "a", descriptor = "B")
	private static byte aByte16 = 1;

	@OriginalMember(owner = "client!GDVTWATR", name = "c", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!GDVTWATR", name = "d", descriptor = "Lclient!PQBRPYKE;")
	private static Class6_Sub1_Sub4 aClass6_Sub1_Sub4_2 = new Class6_Sub1_Sub4(888, new byte[100]);

	@OriginalMember(owner = "client!GDVTWATR", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!GDVTWATR", name = "a", descriptor = "(IILclient!PQBRPYKE;)Ljava/lang/String;")
	public static String method112(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1_Sub4 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(28) int local28;
			for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
				@Pc(22) int local22 = arg1.method239();
				local28 = local22 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local28 - 195];
					local5 = -1;
				} else if (local28 < 13) {
					aCharArray1[local3++] = aCharArray2[local28];
				} else {
					local5 = local28;
				}
				local28 = local22 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local28 - 195];
					local5 = -1;
				} else if (local28 < 13) {
					aCharArray1[local3++] = aCharArray2[local28];
				} else {
					local5 = local28;
				}
			}
			@Pc(106) boolean local106 = true;
			for (local28 = 0; local28 < local3; local28++) {
				@Pc(114) char local114 = aCharArray1[local28];
				if (local106 && local114 >= 'a' && local114 <= 'z') {
					aCharArray1[local28] = (char) (aCharArray1[local28] + -32);
					local106 = false;
				}
				if (local114 == '.' || local114 == '!' || local114 == '?') {
					local106 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("89596, " + arg0 + ", " + -503 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GDVTWATR", name = "a", descriptor = "(Ljava/lang/String;Lclient!PQBRPYKE;B)V")
	public static void method113(@OriginalArg(0) String arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			@Pc(24) int local24;
			if (1 == aByte16) {
				@Pc(20) boolean local20 = false;
			} else {
				for (local24 = 1; local24 > 0; local24++) {
				}
			}
			for (local24 = 0; local24 < arg0.length(); local24++) {
				@Pc(37) char local37 = arg0.charAt(local24);
				@Pc(39) int local39 = 0;
				for (@Pc(41) int local41 = 0; local41 < aCharArray2.length; local41++) {
					if (local37 == aCharArray2[local41]) {
						local39 = local41;
						break;
					}
				}
				if (local39 > 12) {
					local39 += 195;
				}
				if (local15 == -1) {
					if (local39 < 13) {
						local15 = local39;
					} else {
						arg1.method229(local39);
					}
				} else if (local39 < 13) {
					arg1.method229((local15 << 4) + local39);
					local15 = -1;
				} else {
					arg1.method229((local15 << 4) + (local39 >> 4));
					local15 = local39 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method229(local15 << 4);
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("17220, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GDVTWATR", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method114(@OriginalArg(1) String arg0) {
		try {
			aClass6_Sub1_Sub4_2.anInt390 = 0;
			method113(arg0, aClass6_Sub1_Sub4_2, (byte) 1);
			@Pc(18) int local18 = aClass6_Sub1_Sub4_2.anInt390;
			aClass6_Sub1_Sub4_2.anInt390 = 0;
			return method112(local18, aClass6_Sub1_Sub4_2);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("50346, " + false + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
