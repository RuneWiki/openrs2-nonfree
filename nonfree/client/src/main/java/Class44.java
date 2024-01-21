import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VOWJQLLT")
public final class Class44 {

	@OriginalMember(owner = "client!VOWJQLLT", name = "a", descriptor = "Z")
	private static boolean aBoolean165 = true;

	@OriginalMember(owner = "client!VOWJQLLT", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!VOWJQLLT", name = "c", descriptor = "Lclient!XGRGMPUQ;")
	private static Class5_Sub1_Sub4 aClass5_Sub1_Sub4_5 = new Class5_Sub1_Sub4(new byte[100], -82);

	@OriginalMember(owner = "client!VOWJQLLT", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!VOWJQLLT", name = "a", descriptor = "(Lclient!XGRGMPUQ;II)Ljava/lang/String;")
	public static String method304(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
				@Pc(12) int local12 = arg0.method437();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray2[local3++] = aCharArray3[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray2[local3++] = aCharArray3[local18];
				} else {
					local5 = local18;
				}
			}
			@Pc(96) boolean local96 = true;
			@Pc(100) boolean local100 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(108) char local108 = aCharArray2[local18];
				if (local96 && local108 >= 'a' && local108 <= 'z') {
					aCharArray2[local18] = (char) (aCharArray2[local18] - 32);
					local96 = false;
				}
				if (local108 == '.' || local108 == '!' || local108 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("39295, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VOWJQLLT", name = "a", descriptor = "(Ljava/lang/String;Lclient!XGRGMPUQ;Z)V")
	public static void method305(@OriginalArg(0) String arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				@Pc(23) char local23 = arg0.charAt(local17);
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < aCharArray3.length; local27++) {
					if (local23 == aCharArray3[local27]) {
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
						arg1.method427(local25);
					}
				} else if (local25 < 13) {
					arg1.method427((local15 << 4) + local25);
					local15 = -1;
				} else {
					arg1.method427((local15 << 4) + (local25 >> 4));
					local15 = local25 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method427(local15 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("82842, " + arg0 + ", " + arg1 + ", " + true + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VOWJQLLT", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method306(@OriginalArg(1) String arg0) {
		try {
			aClass5_Sub1_Sub4_5.anInt755 = 0;
			method305(arg0, aClass5_Sub1_Sub4_5);
			@Pc(9) int local9 = aClass5_Sub1_Sub4_5.anInt755;
			aClass5_Sub1_Sub4_5.anInt755 = 0;
			return method304(aClass5_Sub1_Sub4_5, 7, local9);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("51931, " + true + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
