import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GVESONCD")
public final class Class12 {

	@OriginalMember(owner = "client!GVESONCD", name = "a", descriptor = "Z")
	private static boolean aBoolean52 = true;

	@OriginalMember(owner = "client!GVESONCD", name = "b", descriptor = "I")
	private static int anInt267 = 4;

	@OriginalMember(owner = "client!GVESONCD", name = "c", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!GVESONCD", name = "d", descriptor = "Lclient!MLYYHULT;")
	private static Class3_Sub1_Sub2 aClass3_Sub1_Sub2_2 = new Class3_Sub1_Sub2(true, new byte[100]);

	@OriginalMember(owner = "client!GVESONCD", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!GVESONCD", name = "a", descriptor = "(ILclient!MLYYHULT;I)Ljava/lang/String;")
	public static String method136(@OriginalArg(1) Class3_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg0.method200();
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
			@Pc(96) boolean local96 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(110) char local110 = aCharArray1[local18];
				if (local96 && local110 >= 'a' && local110 <= 'z') {
					aCharArray1[local18] = (char) (aCharArray1[local18] - 32);
					local96 = false;
				}
				if (local110 == '.' || local110 == '!' || local110 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("175, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GVESONCD", name = "a", descriptor = "(ILjava/lang/String;Lclient!MLYYHULT;)V")
	public static void method137(@OriginalArg(1) String arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(23) int local23 = -1;
			for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
				@Pc(31) char local31 = arg0.charAt(local25);
				@Pc(33) int local33 = 0;
				for (@Pc(35) int local35 = 0; local35 < aCharArray2.length; local35++) {
					if (local31 == aCharArray2[local35]) {
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
						arg1.method190(local33);
					}
				} else if (local33 < 13) {
					arg1.method190((local23 << 4) + local33);
					local23 = -1;
				} else {
					arg1.method190((local23 << 4) + (local33 >> 4));
					local23 = local33 & 0xF;
				}
			}
			if (local23 != -1) {
				arg1.method190(local23 << 4);
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("19351, " + 652 + ", " + arg0 + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GVESONCD", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method138(@OriginalArg(1) String arg0) {
		try {
			aClass3_Sub1_Sub2_2.anInt429 = 0;
			method137(arg0, aClass3_Sub1_Sub2_2);
			@Pc(9) int local9 = aClass3_Sub1_Sub2_2.anInt429;
			aClass3_Sub1_Sub2_2.anInt429 = 0;
			return method136(aClass3_Sub1_Sub2_2, local9);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("99370, " + 0 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
