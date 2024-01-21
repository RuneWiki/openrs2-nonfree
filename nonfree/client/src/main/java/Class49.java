import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "I")
	private static int anInt1055;

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt1054 = 1000;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "Z")
	private static boolean aBoolean254 = true;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(anInt1054, new byte[100]);

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BILclient!lb;)Ljava/lang/String;")
	public static String method683(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method480();
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
				@Pc(111) char local111 = aCharArray3[local18];
				if (local96 && local111 >= 'a' && local111 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local111 == '.' || local111 == '!' || local111 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("34593, " + -66 + ", " + arg0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Lclient!lb;ZLjava/lang/String;)V")
	public static void method684(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
				@Pc(26) char local26 = arg1.charAt(local20);
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
				if (local15 == -1) {
					if (local28 < 13) {
						local15 = local28;
					} else {
						arg0.method470(local28);
					}
				} else if (local28 < 13) {
					arg0.method470((local15 << 4) + local28);
					local15 = -1;
				} else {
					arg0.method470((local15 << 4) + (local28 >> 4));
					local15 = local28 & 0xF;
				}
			}
			if (local15 != -1) {
				arg0.method470(local15 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("64566, " + arg0 + ", " + true + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method685(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			aClass1_Sub1_Sub3_8.anInt751 = 0;
			@Pc(7) boolean local7 = false;
			method684(aClass1_Sub1_Sub3_8, arg1);
			@Pc(18) int local18 = aClass1_Sub1_Sub3_8.anInt751;
			aClass1_Sub1_Sub3_8.anInt751 = 0;
			return method683(local18, aClass1_Sub1_Sub3_8);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("68976, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
