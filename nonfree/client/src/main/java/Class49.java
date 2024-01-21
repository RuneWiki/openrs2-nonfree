import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
	private static int anInt1030;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "I")
	private static int anInt1031;

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt1029 = 991;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(new byte[100], 15787);

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLclient!lb;I)Ljava/lang/String;")
	public static String method679(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg0.method476();
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
				@Pc(109) char local109 = aCharArray3[local18];
				if (local96 && local109 >= 'a' && local109 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local109 == '.' || local109 == '!' || local109 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("44303, " + -94 + ", " + arg0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;Lclient!lb;I)V")
	public static void method680(@OriginalArg(0) String arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(18) int local18 = -1;
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
				if (local18 == -1) {
					if (local28 < 13) {
						local18 = local28;
					} else {
						arg1.method466(local28);
					}
				} else if (local28 < 13) {
					arg1.method466((local18 << 4) + local28);
					local18 = -1;
				} else {
					arg1.method466((local18 << 4) + (local28 >> 4));
					local18 = local28 & 0xF;
				}
			}
			if (local18 != -1) {
				arg1.method466(local18 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("17960, " + arg0 + ", " + arg1 + ", " + 991 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method681(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			aClass1_Sub1_Sub3_8.anInt734 = 0;
			method680(arg0, aClass1_Sub1_Sub3_8);
			@Pc(9) int local9 = aClass1_Sub1_Sub3_8.anInt734;
			if (arg1 != 0) {
				anInt1030 = -64;
			}
			aClass1_Sub1_Sub3_8.anInt734 = 0;
			return method679(aClass1_Sub1_Sub3_8, local9);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("99118, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
