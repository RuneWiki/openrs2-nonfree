import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZRHRGDTH")
public final class Class50 {

	@OriginalMember(owner = "client!ZRHRGDTH", name = "b", descriptor = "Z")
	private static boolean aBoolean216;

	@OriginalMember(owner = "client!ZRHRGDTH", name = "a", descriptor = "Z")
	private static boolean aBoolean215 = true;

	@OriginalMember(owner = "client!ZRHRGDTH", name = "c", descriptor = "I")
	private static int anInt815 = 8378;

	@OriginalMember(owner = "client!ZRHRGDTH", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!ZRHRGDTH", name = "e", descriptor = "Lclient!RGCGKKUR;")
	private static Class6_Sub1_Sub4 aClass6_Sub1_Sub4_5 = new Class6_Sub1_Sub4(new byte[100], (byte) -17);

	@OriginalMember(owner = "client!ZRHRGDTH", name = "f", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!ZRHRGDTH", name = "a", descriptor = "(Lclient!RGCGKKUR;II)Ljava/lang/String;")
	public static String method545(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg0.method411();
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
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("80209, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZRHRGDTH", name = "a", descriptor = "(Lclient!RGCGKKUR;ILjava/lang/String;)V")
	public static void method546(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(18) int local18;
			if (anInt815 != 8378) {
				for (local18 = 1; local18 > 0; local18++) {
				}
			}
			local18 = -1;
			for (@Pc(27) int local27 = 0; local27 < arg1.length(); local27++) {
				@Pc(33) char local33 = arg1.charAt(local27);
				@Pc(35) int local35 = 0;
				for (@Pc(37) int local37 = 0; local37 < aCharArray4.length; local37++) {
					if (local33 == aCharArray4[local37]) {
						local35 = local37;
						break;
					}
				}
				if (local35 > 12) {
					local35 += 195;
				}
				if (local18 == -1) {
					if (local35 < 13) {
						local18 = local35;
					} else {
						arg0.method401(local35);
					}
				} else if (local35 < 13) {
					arg0.method401((local18 << 4) + local35);
					local18 = -1;
				} else {
					arg0.method401((local18 << 4) + (local35 >> 4));
					local18 = local35 & 0xF;
				}
			}
			if (local18 != -1) {
				arg0.method401(local18 << 4);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("11351, " + arg0 + ", " + 8378 + ", " + arg1 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZRHRGDTH", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method547(@OriginalArg(0) String arg0) {
		try {
			aClass6_Sub1_Sub4_5.anInt704 = 0;
			method546(aClass6_Sub1_Sub4_5, arg0);
			@Pc(17) int local17 = aClass6_Sub1_Sub4_5.anInt704;
			aClass6_Sub1_Sub4_5.anInt704 = 0;
			return method545(aClass6_Sub1_Sub4_5, local17);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("59546, " + arg0 + ", " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
