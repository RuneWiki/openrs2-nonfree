import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt1009;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
	private static int anInt1010 = 3109;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "I")
	private static int anInt1011 = 9384;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(new byte[100], (byte) -93);

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(IILclient!lb;)Ljava/lang/String;")
	public static String method683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg2.method480();
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
				@Pc(104) char local104 = aCharArray3[local18];
				if (local96 && local104 >= 'a' && local104 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local104 == '.' || local104 == '!' || local104 == '?') {
					local96 = true;
				}
			}
			if (arg1 != 0) {
				for (@Pc(141) int local141 = 1; local141 > 0; local141++) {
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("79669, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;Lclient!lb;I)V")
	public static void method684(@OriginalArg(0) String arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				@Pc(23) char local23 = arg0.charAt(local17);
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < aCharArray4.length; local27++) {
					if (local23 == aCharArray4[local27]) {
						local25 = local27;
						break;
					}
				}
				if (local25 > 12) {
					local25 += 195;
				}
				if (local15 == -1) {
					if (local25 < 13) {
						local15 = local25;
					} else {
						arg1.method470(local25);
					}
				} else if (local25 < 13) {
					arg1.method470((local15 << 4) + local25);
					local15 = -1;
				} else {
					arg1.method470((local15 << 4) + (local25 >> 4));
					local15 = local25 & 0xF;
				}
			}
			if (arg2 != 3109) {
				for (@Pc(99) int local99 = 1; local99 > 0; local99++) {
				}
			}
			if (local15 != -1) {
				arg1.method470(local15 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("85447, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method685(@OriginalArg(1) String arg0) {
		try {
			aClass1_Sub1_Sub3_8.anInt720 = 0;
			method684(arg0, aClass1_Sub1_Sub3_8, anInt1010);
			@Pc(9) int local9 = aClass1_Sub1_Sub3_8.anInt720;
			if (anInt1011 != 9384) {
				throw new NullPointerException();
			}
			aClass1_Sub1_Sub3_8.anInt720 = 0;
			return method683(local9, anInt1009, aClass1_Sub1_Sub3_8);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("66418, " + 9384 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}
}
