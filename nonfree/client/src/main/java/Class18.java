import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GTOTZKQF")
public final class Class18 {

	@OriginalMember(owner = "client!GTOTZKQF", name = "a", descriptor = "I")
	private static int anInt335;

	@OriginalMember(owner = "client!GTOTZKQF", name = "b", descriptor = "Z")
	private static boolean aBoolean91;

	@OriginalMember(owner = "client!GTOTZKQF", name = "c", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!GTOTZKQF", name = "d", descriptor = "Lclient!LDILQFVA;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(new byte[100], anInt335);

	@OriginalMember(owner = "client!GTOTZKQF", name = "e", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!GTOTZKQF", name = "a", descriptor = "(ILclient!LDILQFVA;B)Ljava/lang/String;")
	public static String method259(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method359();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray2[local3++] = aCharArray3[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray2[local3++] = aCharArray3[local18];
				} else {
					local5 = local18;
				}
			}
			@Pc(96) boolean local96 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(114) char local114 = aCharArray2[local18];
				if (local96 && local114 >= 'a' && local114 <= 'z') {
					aCharArray2[local18] = (char) (aCharArray2[local18] - 32);
					local96 = false;
				}
				if (local114 == '.' || local114 == '!' || local114 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("44408, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GTOTZKQF", name = "a", descriptor = "(ZLclient!LDILQFVA;Ljava/lang/String;)V")
	public static void method260(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
				@Pc(26) char local26 = arg1.charAt(local20);
				@Pc(28) int local28 = 0;
				for (@Pc(30) int local30 = 0; local30 < aCharArray3.length; local30++) {
					if (local26 == aCharArray3[local30]) {
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
						arg0.method349(local28);
					}
				} else if (local28 < 13) {
					arg0.method349((local15 << 4) + local28);
					local15 = -1;
				} else {
					arg0.method349((local15 << 4) + (local28 >> 4));
					local15 = local28 & 0xF;
				}
			}
			if (local15 != -1) {
				arg0.method349(local15 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("61709, " + false + ", " + arg0 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GTOTZKQF", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method261(@OriginalArg(0) String arg0) {
		try {
			aClass1_Sub1_Sub3_1.anInt443 = 0;
			method260(aClass1_Sub1_Sub3_1, arg0);
			@Pc(18) int local18 = aClass1_Sub1_Sub3_1.anInt443;
			aClass1_Sub1_Sub3_1.anInt443 = 0;
			return method259(local18, aClass1_Sub1_Sub3_1);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("34612, " + arg0 + ", " + 73 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
