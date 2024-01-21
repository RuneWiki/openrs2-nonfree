import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HPMMYBXT")
public final class Class15 {

	@OriginalMember(owner = "client!HPMMYBXT", name = "a", descriptor = "Z")
	private static boolean aBoolean74;

	@OriginalMember(owner = "client!HPMMYBXT", name = "b", descriptor = "I")
	private static int anInt408 = 313;

	@OriginalMember(owner = "client!HPMMYBXT", name = "c", descriptor = "I")
	private static int anInt409 = -391;

	@OriginalMember(owner = "client!HPMMYBXT", name = "d", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!HPMMYBXT", name = "e", descriptor = "Lclient!EYMNCFMK;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(new byte[100], 0);

	@OriginalMember(owner = "client!HPMMYBXT", name = "f", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!HPMMYBXT", name = "a", descriptor = "(ILclient!EYMNCFMK;I)Ljava/lang/String;")
	public static String method283(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
				@Pc(12) int local12 = arg1.method155();
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
			if (arg0 <= 0) {
				anInt409 = 460;
			}
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
			signlink.reporterror("46139, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HPMMYBXT", name = "a", descriptor = "(ILclient!EYMNCFMK;Ljava/lang/String;)V")
	public static void method284(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(23) int local23 = -1;
			for (@Pc(25) int local25 = 0; local25 < arg1.length(); local25++) {
				@Pc(31) char local31 = arg1.charAt(local25);
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
						arg0.method145(local33);
					}
				} else if (local33 < 13) {
					arg0.method145((local23 << 4) + local33);
					local23 = -1;
				} else {
					arg0.method145((local23 << 4) + (local33 >> 4));
					local23 = local33 & 0xF;
				}
			}
			if (local23 != -1) {
				arg0.method145(local23 << 4);
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("13613, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HPMMYBXT", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method285(@OriginalArg(1) String arg0) {
		try {
			aClass1_Sub1_Sub3_1.anInt301 = 0;
			method284(aClass1_Sub1_Sub3_1, arg0);
			@Pc(15) int local15 = aClass1_Sub1_Sub3_1.anInt301;
			aClass1_Sub1_Sub3_1.anInt301 = 0;
			return method283(anInt408, aClass1_Sub1_Sub3_1, local15);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("92817, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
