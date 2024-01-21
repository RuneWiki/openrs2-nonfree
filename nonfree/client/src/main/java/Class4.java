import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CHVNTVHC")
public final class Class4 {

	@OriginalMember(owner = "client!CHVNTVHC", name = "b", descriptor = "I")
	private static int anInt51;

	@OriginalMember(owner = "client!CHVNTVHC", name = "a", descriptor = "I")
	private static int anInt50 = 76;

	@OriginalMember(owner = "client!CHVNTVHC", name = "c", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!CHVNTVHC", name = "d", descriptor = "Lclient!UAWAYCTK;")
	private static Class6_Sub2_Sub3 aClass6_Sub2_Sub3_2 = new Class6_Sub2_Sub3(741, new byte[100]);

	@OriginalMember(owner = "client!CHVNTVHC", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!CHVNTVHC", name = "a", descriptor = "(Lclient!UAWAYCTK;II)Ljava/lang/String;")
	public static String method37(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg0.method402();
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
			@Pc(100) boolean local100 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(108) char local108 = aCharArray1[local18];
				if (local100 && local108 >= 'a' && local108 <= 'z') {
					aCharArray1[local18] = (char) (aCharArray1[local18] - 32);
					local100 = false;
				}
				if (local108 == '.' || local108 == '!' || local108 == '?') {
					local100 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("41052, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CHVNTVHC", name = "a", descriptor = "(Ljava/lang/String;ILclient!UAWAYCTK;)V")
	public static void method38(@OriginalArg(0) String arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < arg0.length(); local22++) {
				@Pc(28) char local28 = arg0.charAt(local22);
				@Pc(30) int local30 = 0;
				for (@Pc(32) int local32 = 0; local32 < aCharArray2.length; local32++) {
					if (local28 == aCharArray2[local32]) {
						local30 = local32;
						break;
					}
				}
				if (local30 > 12) {
					local30 += 195;
				}
				if (local20 == -1) {
					if (local30 < 13) {
						local20 = local30;
					} else {
						arg1.method392(local30);
					}
				} else if (local30 < 13) {
					arg1.method392((local20 << 4) + local30);
					local20 = -1;
				} else {
					arg1.method392((local20 << 4) + (local30 >> 4));
					local20 = local30 & 0xF;
				}
			}
			if (local20 != -1) {
				arg1.method392(local20 << 4);
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("22586, " + arg0 + ", " + -16600 + ", " + arg1 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CHVNTVHC", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method39(@OriginalArg(1) String arg0) {
		try {
			aClass6_Sub2_Sub3_2.anInt609 = 0;
			method38(arg0, aClass6_Sub2_Sub3_2);
			@Pc(18) int local18 = aClass6_Sub2_Sub3_2.anInt609;
			aClass6_Sub2_Sub3_2.anInt609 = 0;
			return method37(aClass6_Sub2_Sub3_2, local18);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("21221, " + 76 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
