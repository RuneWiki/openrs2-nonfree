import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BOHPYYUF")
public final class Class6 {

	@OriginalMember(owner = "client!BOHPYYUF", name = "b", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!BOHPYYUF", name = "c", descriptor = "Lclient!RSWRPCHR;")
	private static Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!BOHPYYUF", name = "d", descriptor = "[C")
	private static char[] aCharArray2;

	static {
		aBoolean18 = true;
		aCharArray1 = new char[100];
		aClass2_Sub1_Sub4_1 = new Class2_Sub1_Sub4(new byte[100], -46859);
		aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };
	}

	@OriginalMember(owner = "client!BOHPYYUF", name = "a", descriptor = "(Lclient!RSWRPCHR;IB)Ljava/lang/String;")
	public static String method50(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg0.method340();
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
				@Pc(111) char local111 = aCharArray1[local18];
				if (local96 && local111 >= 'a' && local111 <= 'z') {
					aCharArray1[local18] = (char) (aCharArray1[local18] - 32);
					local96 = false;
				}
				if (local111 == '.' || local111 == '!' || local111 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("50120, " + arg0 + ", " + arg1 + ", " + 14 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOHPYYUF", name = "a", descriptor = "(ILclient!RSWRPCHR;Ljava/lang/String;)V")
	public static void method51(@OriginalArg(1) Class2_Sub1_Sub4 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(25) int local25 = -1;
			for (@Pc(27) int local27 = 0; local27 < arg1.length(); local27++) {
				@Pc(33) char local33 = arg1.charAt(local27);
				@Pc(35) int local35 = 0;
				for (@Pc(37) int local37 = 0; local37 < aCharArray2.length; local37++) {
					if (local33 == aCharArray2[local37]) {
						local35 = local37;
						break;
					}
				}
				if (local35 > 12) {
					local35 += 195;
				}
				if (local25 == -1) {
					if (local35 < 13) {
						local25 = local35;
					} else {
						arg0.method330(local35);
					}
				} else if (local35 < 13) {
					arg0.method330((local25 << 4) + local35);
					local25 = -1;
				} else {
					arg0.method330((local25 << 4) + (local35 >> 4));
					local25 = local35 & 0xF;
				}
			}
			if (local25 != -1) {
				arg0.method330(local25 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("64063, " + -438 + ", " + arg0 + ", " + arg1 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOHPYYUF", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method52(@OriginalArg(1) String arg0) {
		try {
			aClass2_Sub1_Sub4_1.anInt556 = 0;
			method51(aClass2_Sub1_Sub4_1, arg0);
			@Pc(15) int local15 = aClass2_Sub1_Sub4_1.anInt556;
			aClass2_Sub1_Sub4_1.anInt556 = 0;
			return method50(aClass2_Sub1_Sub4_1, local15);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("2019, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
