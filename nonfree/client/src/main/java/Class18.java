import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JFSYEOAW")
public final class Class18 {

	@OriginalMember(owner = "client!JFSYEOAW", name = "a", descriptor = "I")
	private static int anInt342 = -642;

	@OriginalMember(owner = "client!JFSYEOAW", name = "b", descriptor = "I")
	private static int anInt343 = -63;

	@OriginalMember(owner = "client!JFSYEOAW", name = "c", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!JFSYEOAW", name = "d", descriptor = "Lclient!JHKSAGUC;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(new byte[100], 8);

	@OriginalMember(owner = "client!JFSYEOAW", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!JFSYEOAW", name = "a", descriptor = "(IZLclient!JHKSAGUC;)Ljava/lang/String;")
	public static String method221(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = -1;
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				@Pc(21) int local21 = arg1.method238();
				local27 = local21 >> 4 & 0xF;
				if (local14 != -1) {
					aCharArray1[local12++] = aCharArray2[(local14 << 4) + local27 - 195];
					local14 = -1;
				} else if (local27 < 13) {
					aCharArray1[local12++] = aCharArray2[local27];
				} else {
					local14 = local27;
				}
				local27 = local21 & 0xF;
				if (local14 != -1) {
					aCharArray1[local12++] = aCharArray2[(local14 << 4) + local27 - 195];
					local14 = -1;
				} else if (local27 < 13) {
					aCharArray1[local12++] = aCharArray2[local27];
				} else {
					local14 = local27;
				}
			}
			@Pc(105) boolean local105 = true;
			for (local27 = 0; local27 < local12; local27++) {
				@Pc(113) char local113 = aCharArray1[local27];
				if (local105 && local113 >= 'a' && local113 <= 'z') {
					aCharArray1[local27] = (char) (aCharArray1[local27] - 32);
					local105 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local105 = true;
				}
			}
			return new String(aCharArray1, 0, local12);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("46789, " + arg0 + ", " + true + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JFSYEOAW", name = "a", descriptor = "(Lclient!JHKSAGUC;ILjava/lang/String;)V")
	public static void method222(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < arg1.length(); local22++) {
				@Pc(28) char local28 = arg1.charAt(local22);
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
						arg0.method228(local30);
					}
				} else if (local30 < 13) {
					arg0.method228((local20 << 4) + local30);
					local20 = -1;
				} else {
					arg0.method228((local20 << 4) + (local30 >> 4));
					local20 = local30 & 0xF;
				}
			}
			if (local20 != -1) {
				arg0.method228(local20 << 4);
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("62208, " + arg0 + ", " + 10246 + ", " + arg1 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JFSYEOAW", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method223(@OriginalArg(1) String arg0) {
		try {
			aClass1_Sub1_Sub3_1.anInt352 = 0;
			method222(aClass1_Sub1_Sub3_1, arg0);
			@Pc(9) int local9 = aClass1_Sub1_Sub3_1.anInt352;
			aClass1_Sub1_Sub3_1.anInt352 = 0;
			return method221(local9, aClass1_Sub1_Sub3_1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("36228, " + 861 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
