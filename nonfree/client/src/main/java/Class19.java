import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KDXWZDUJ")
public final class Class19 {

	@OriginalMember(owner = "client!KDXWZDUJ", name = "a", descriptor = "I")
	private static int anInt327 = 954;

	@OriginalMember(owner = "client!KDXWZDUJ", name = "b", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!KDXWZDUJ", name = "c", descriptor = "Lclient!PGNBHFUF;")
	private static Class4_Sub1_Sub4 aClass4_Sub1_Sub4_3 = new Class4_Sub1_Sub4(5, new byte[100]);

	@OriginalMember(owner = "client!KDXWZDUJ", name = "d", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!KDXWZDUJ", name = "a", descriptor = "(BILclient!PGNBHFUF;)Ljava/lang/String;")
	public static String method219(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub4 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method355();
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
			@Pc(103) boolean local103 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(111) char local111 = aCharArray1[local18];
				if (local103 && local111 >= 'a' && local111 <= 'z') {
					aCharArray1[local18] = (char) (aCharArray1[local18] - 32);
					local103 = false;
				}
				if (local111 == '.' || local111 == '!' || local111 == '?') {
					local103 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("60589, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KDXWZDUJ", name = "a", descriptor = "(Lclient!PGNBHFUF;Ljava/lang/String;Z)V")
	public static void method220(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
				@Pc(27) char local27 = arg1.charAt(local21);
				@Pc(29) int local29 = 0;
				for (@Pc(31) int local31 = 0; local31 < aCharArray2.length; local31++) {
					if (local27 == aCharArray2[local31]) {
						local29 = local31;
						break;
					}
				}
				if (local29 > 12) {
					local29 += 195;
				}
				if (local15 == -1) {
					if (local29 < 13) {
						local15 = local29;
					} else {
						arg0.method345(local29);
					}
				} else if (local29 < 13) {
					arg0.method345((local15 << 4) + local29);
					local15 = -1;
				} else {
					arg0.method345((local15 << 4) + (local29 >> 4));
					local15 = local29 & 0xF;
				}
			}
			if (local15 != -1) {
				arg0.method345(local15 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("51510, " + arg0 + ", " + arg1 + ", " + true + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KDXWZDUJ", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method221(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			aClass4_Sub1_Sub4_3.anInt506 = 0;
			method220(aClass4_Sub1_Sub4_3, arg0);
			@Pc(9) int local9 = aClass4_Sub1_Sub4_3.anInt506;
			aClass4_Sub1_Sub4_3.anInt506 = 0;
			@Pc(16) boolean local16 = false;
			return method219(local9, aClass4_Sub1_Sub4_3);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("77855, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
