import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PBQQFQEC")
public final class Class34 {

	@OriginalMember(owner = "client!PBQQFQEC", name = "b", descriptor = "Z")
	private static boolean aBoolean114;

	@OriginalMember(owner = "client!PBQQFQEC", name = "c", descriptor = "Z")
	private static boolean aBoolean115;

	@OriginalMember(owner = "client!PBQQFQEC", name = "a", descriptor = "I")
	private static int anInt589 = 1;

	@OriginalMember(owner = "client!PBQQFQEC", name = "d", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!PBQQFQEC", name = "e", descriptor = "Lclient!XJCNBMKS;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = new Class1_Sub1_Sub3((byte) 9, new byte[100]);

	@OriginalMember(owner = "client!PBQQFQEC", name = "f", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!PBQQFQEC", name = "a", descriptor = "(ZILclient!XJCNBMKS;)Ljava/lang/String;")
	public static String method332(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			if (arg0) {
				anInt589 = 291;
			}
			@Pc(22) int local22;
			for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
				@Pc(16) int local16 = arg2.method498();
				local22 = local16 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local22 - 195];
					local5 = -1;
				} else if (local22 < 13) {
					aCharArray1[local3++] = aCharArray2[local22];
				} else {
					local5 = local22;
				}
				local22 = local16 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local22 - 195];
					local5 = -1;
				} else if (local22 < 13) {
					aCharArray1[local3++] = aCharArray2[local22];
				} else {
					local5 = local22;
				}
			}
			@Pc(100) boolean local100 = true;
			for (local22 = 0; local22 < local3; local22++) {
				@Pc(108) char local108 = aCharArray1[local22];
				if (local100 && local108 >= 'a' && local108 <= 'z') {
					aCharArray1[local22] = (char) (aCharArray1[local22] - 32);
					local100 = false;
				}
				if (local108 == '.' || local108 == '!' || local108 == '?') {
					local100 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("286, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBQQFQEC", name = "a", descriptor = "(Lclient!XJCNBMKS;ZLjava/lang/String;)V")
	public static void method333(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg2.length() > 80) {
				arg2 = arg2.substring(0, 80);
			}
			arg2 = arg2.toLowerCase();
			if (!arg1) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < arg2.length(); local20++) {
					@Pc(26) char local26 = arg2.charAt(local20);
					@Pc(28) int local28 = 0;
					for (@Pc(30) int local30 = 0; local30 < aCharArray2.length; local30++) {
						if (local26 == aCharArray2[local30]) {
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
							arg0.method488(local28);
						}
					} else if (local28 < 13) {
						arg0.method488((local18 << 4) + local28);
						local18 = -1;
					} else {
						arg0.method488((local18 << 4) + (local28 >> 4));
						local18 = local28 & 0xF;
					}
				}
				if (local18 != -1) {
					arg0.method488(local18 << 4);
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("53769, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBQQFQEC", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method334(@OriginalArg(0) String arg0) {
		try {
			aClass1_Sub1_Sub3_4.anInt806 = 0;
			method333(aClass1_Sub1_Sub3_4, aBoolean115, arg0);
			@Pc(9) int local9 = aClass1_Sub1_Sub3_4.anInt806;
			aClass1_Sub1_Sub3_4.anInt806 = 0;
			return method332(aBoolean114, local9, aClass1_Sub1_Sub3_4);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("50996, " + arg0 + ", " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
