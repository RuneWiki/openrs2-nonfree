import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SLOJMIHA")
public final class Class35 {

	@OriginalMember(owner = "client!SLOJMIHA", name = "a", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!SLOJMIHA", name = "b", descriptor = "Lclient!LBBVYYXO;")
	private static Class2_Sub1_Sub3 aClass2_Sub1_Sub3_3 = new Class2_Sub1_Sub3((byte) 114, new byte[100]);

	@OriginalMember(owner = "client!SLOJMIHA", name = "c", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!SLOJMIHA", name = "a", descriptor = "(Lclient!LBBVYYXO;II)Ljava/lang/String;")
	public static String method437(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
				@Pc(12) int local12 = arg0.method267();
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
			@Pc(100) boolean local100 = false;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(108) char local108 = aCharArray3[local18];
				if (local96 && local108 >= 'a' && local108 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local108 == '.' || local108 == '!' || local108 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("96034, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SLOJMIHA", name = "a", descriptor = "(Ljava/lang/String;Lclient!LBBVYYXO;Z)V")
	public static void method438(@OriginalArg(0) String arg0, @OriginalArg(1) Class2_Sub1_Sub3 arg1) {
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
						arg1.method257(local28);
					}
				} else if (local28 < 13) {
					arg1.method257((local18 << 4) + local28);
					local18 = -1;
				} else {
					arg1.method257((local18 << 4) + (local28 >> 4));
					local18 = local28 & 0xF;
				}
			}
			if (local18 != -1) {
				arg1.method257(local18 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("287, " + arg0 + ", " + arg1 + ", " + false + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SLOJMIHA", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method439(@OriginalArg(0) String arg0) {
		try {
			aClass2_Sub1_Sub3_3.anInt283 = 0;
			method438(arg0, aClass2_Sub1_Sub3_3);
			@Pc(15) int local15 = aClass2_Sub1_Sub3_3.anInt283;
			aClass2_Sub1_Sub3_3.anInt283 = 0;
			return method437(aClass2_Sub1_Sub3_3, 555, local15);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("41494, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
