import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YXRFKVAX")
public final class Class47 {

	@OriginalMember(owner = "client!YXRFKVAX", name = "a", descriptor = "B")
	private static byte aByte24 = 111;

	@OriginalMember(owner = "client!YXRFKVAX", name = "b", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!YXRFKVAX", name = "c", descriptor = "Lclient!TKPFKOXP;")
	private static Class2_Sub1_Sub4 aClass2_Sub1_Sub4_4 = new Class2_Sub1_Sub4(859, new byte[100]);

	@OriginalMember(owner = "client!YXRFKVAX", name = "d", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!YXRFKVAX", name = "a", descriptor = "(IILclient!TKPFKOXP;)Ljava/lang/String;")
	public static String method551(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method492();
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
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("95264, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXRFKVAX", name = "a", descriptor = "(Lclient!TKPFKOXP;BLjava/lang/String;)V")
	public static void method552(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg2.length() > 80) {
				arg2 = arg2.substring(0, 80);
			}
			arg2 = arg2.toLowerCase();
			if (arg1 == 111) {
				@Pc(19) int local19 = -1;
				for (@Pc(21) int local21 = 0; local21 < arg2.length(); local21++) {
					@Pc(27) char local27 = arg2.charAt(local21);
					@Pc(29) int local29 = 0;
					for (@Pc(31) int local31 = 0; local31 < aCharArray4.length; local31++) {
						if (local27 == aCharArray4[local31]) {
							local29 = local31;
							break;
						}
					}
					if (local29 > 12) {
						local29 += 195;
					}
					if (local19 == -1) {
						if (local29 < 13) {
							local19 = local29;
						} else {
							arg0.method482(local29);
						}
					} else if (local29 < 13) {
						arg0.method482((local19 << 4) + local29);
						local19 = -1;
					} else {
						arg0.method482((local19 << 4) + (local29 >> 4));
						local19 = local29 & 0xF;
					}
				}
				if (local19 != -1) {
					arg0.method482(local19 << 4);
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("78397, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXRFKVAX", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method553(@OriginalArg(0) String arg0) {
		try {
			aClass2_Sub1_Sub4_4.anInt672 = 0;
			method552(aClass2_Sub1_Sub4_4, aByte24, arg0);
			@Pc(15) int local15 = aClass2_Sub1_Sub4_4.anInt672;
			aClass2_Sub1_Sub4_4.anInt672 = 0;
			return method551(local15, aClass2_Sub1_Sub4_4);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("40133, " + arg0 + ", " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
