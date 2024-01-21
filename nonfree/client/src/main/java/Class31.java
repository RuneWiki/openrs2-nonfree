import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OCQVXKDE")
public final class Class31 {

	@OriginalMember(owner = "client!OCQVXKDE", name = "a", descriptor = "I")
	private static int anInt309 = -977;

	@OriginalMember(owner = "client!OCQVXKDE", name = "b", descriptor = "Z")
	private static boolean aBoolean96 = true;

	@OriginalMember(owner = "client!OCQVXKDE", name = "c", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!OCQVXKDE", name = "d", descriptor = "Lclient!PKHWFJLM;")
	private static Class5_Sub1_Sub4 aClass5_Sub1_Sub4_4 = new Class5_Sub1_Sub4(new byte[100], 0);

	@OriginalMember(owner = "client!OCQVXKDE", name = "e", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!OCQVXKDE", name = "a", descriptor = "(IBLclient!PKHWFJLM;)Ljava/lang/String;")
	public static String method204(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				@Pc(21) int local21 = arg1.method240();
				local27 = local21 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local27 - 195];
					local5 = -1;
				} else if (local27 < 13) {
					aCharArray2[local3++] = aCharArray3[local27];
				} else {
					local5 = local27;
				}
				local27 = local21 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local27 - 195];
					local5 = -1;
				} else if (local27 < 13) {
					aCharArray2[local3++] = aCharArray3[local27];
				} else {
					local5 = local27;
				}
			}
			@Pc(105) boolean local105 = true;
			for (local27 = 0; local27 < local3; local27++) {
				@Pc(113) char local113 = aCharArray2[local27];
				if (local105 && local113 >= 'a' && local113 <= 'z') {
					aCharArray2[local27] = (char) (aCharArray2[local27] - 32);
					local105 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local105 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("56171, " + arg0 + ", " + -7 + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCQVXKDE", name = "a", descriptor = "(Ljava/lang/String;Lclient!PKHWFJLM;I)V")
	public static void method205(@OriginalArg(0) String arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(23) int local23 = -1;
			for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
				@Pc(31) char local31 = arg0.charAt(local25);
				@Pc(33) int local33 = 0;
				for (@Pc(35) int local35 = 0; local35 < aCharArray3.length; local35++) {
					if (local31 == aCharArray3[local35]) {
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
						arg1.method230(local33);
					}
				} else if (local33 < 13) {
					arg1.method230((local23 << 4) + local33);
					local23 = -1;
				} else {
					arg1.method230((local23 << 4) + (local33 >> 4));
					local23 = local33 & 0xF;
				}
			}
			if (local23 != -1) {
				arg1.method230(local23 << 4);
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("86213, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCQVXKDE", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method206(@OriginalArg(1) String arg0) {
		try {
			aClass5_Sub1_Sub4_4.anInt429 = 0;
			method205(arg0, aClass5_Sub1_Sub4_4);
			@Pc(9) int local9 = aClass5_Sub1_Sub4_4.anInt429;
			aClass5_Sub1_Sub4_4.anInt429 = 0;
			return method204(local9, aClass5_Sub1_Sub4_4);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("48288, " + 24865 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
