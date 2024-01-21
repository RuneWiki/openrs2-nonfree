import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RJLRTDJR")
public final class Class37 {

	@OriginalMember(owner = "client!RJLRTDJR", name = "b", descriptor = "[C")
	private static char[] aCharArray2;

	@OriginalMember(owner = "client!RJLRTDJR", name = "c", descriptor = "Lclient!MVHXDWGI;")
	private static Class1_Sub1_Sub4 aClass1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!RJLRTDJR", name = "d", descriptor = "[C")
	private static char[] aCharArray3;

	static {
		aBoolean142 = true;
		aCharArray2 = new char[100];
		aClass1_Sub1_Sub4_4 = new Class1_Sub1_Sub4(0, new byte[100]);
		aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };
	}

	@OriginalMember(owner = "client!RJLRTDJR", name = "a", descriptor = "(IILclient!MVHXDWGI;)Ljava/lang/String;")
	public static String method447(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = -1;
			@Pc(28) int local28;
			for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
				@Pc(22) int local22 = arg1.method294();
				local28 = local22 >> 4 & 0xF;
				if (local15 != -1) {
					aCharArray2[local13++] = aCharArray3[(local15 << 4) + local28 - 195];
					local15 = -1;
				} else if (local28 < 13) {
					aCharArray2[local13++] = aCharArray3[local28];
				} else {
					local15 = local28;
				}
				local28 = local22 & 0xF;
				if (local15 != -1) {
					aCharArray2[local13++] = aCharArray3[(local15 << 4) + local28 - 195];
					local15 = -1;
				} else if (local28 < 13) {
					aCharArray2[local13++] = aCharArray3[local28];
				} else {
					local15 = local28;
				}
			}
			@Pc(106) boolean local106 = true;
			for (local28 = 0; local28 < local13; local28++) {
				@Pc(114) char local114 = aCharArray2[local28];
				if (local106 && local114 >= 'a' && local114 <= 'z') {
					aCharArray2[local28] = (char) (aCharArray2[local28] - 32);
					local106 = false;
				}
				if (local114 == '.' || local114 == '!' || local114 == '?') {
					local106 = true;
				}
			}
			return new String(aCharArray2, 0, local13);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("26211, " + -73 + ", " + arg0 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RJLRTDJR", name = "a", descriptor = "(Lclient!MVHXDWGI;Ljava/lang/String;I)V")
	public static void method448(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(27) int local27 = 0; local27 < arg1.length(); local27++) {
				@Pc(33) char local33 = arg1.charAt(local27);
				@Pc(35) int local35 = 0;
				for (@Pc(37) int local37 = 0; local37 < aCharArray3.length; local37++) {
					if (local33 == aCharArray3[local37]) {
						local35 = local37;
						break;
					}
				}
				if (local35 > 12) {
					local35 += 195;
				}
				if (local15 == -1) {
					if (local35 < 13) {
						local15 = local35;
					} else {
						arg0.method284(local35);
					}
				} else if (local35 < 13) {
					arg0.method284((local15 << 4) + local35);
					local15 = -1;
				} else {
					arg0.method284((local15 << 4) + (local35 >> 4));
					local15 = local35 & 0xF;
				}
			}
			if (local15 != -1) {
				arg0.method284(local15 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("86133, " + arg0 + ", " + arg1 + ", " + -699 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RJLRTDJR", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method449(@OriginalArg(0) String arg0) {
		try {
			aClass1_Sub1_Sub4_4.anInt529 = 0;
			method448(aClass1_Sub1_Sub4_4, arg0);
			@Pc(9) int local9 = aClass1_Sub1_Sub4_4.anInt529;
			aClass1_Sub1_Sub4_4.anInt529 = 0;
			return method447(local9, aClass1_Sub1_Sub4_4);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("89620, " + arg0 + ", " + 8 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}
}
