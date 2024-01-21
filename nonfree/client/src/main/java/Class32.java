import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QKAIVGGT")
public final class Class32 {

	@OriginalMember(owner = "client!QKAIVGGT", name = "a", descriptor = "I")
	private static int anInt484 = 20411;

	@OriginalMember(owner = "client!QKAIVGGT", name = "b", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!QKAIVGGT", name = "c", descriptor = "Lclient!MFMVIYHT;")
	private static Class10_Sub1_Sub3 aClass10_Sub1_Sub3_2 = new Class10_Sub1_Sub3(true, new byte[100]);

	@OriginalMember(owner = "client!QKAIVGGT", name = "d", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!QKAIVGGT", name = "a", descriptor = "(ILclient!MFMVIYHT;I)Ljava/lang/String;")
	public static String method371(@OriginalArg(1) Class10_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg0.method311();
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
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("56026, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QKAIVGGT", name = "a", descriptor = "(Ljava/lang/String;ILclient!MFMVIYHT;)V")
	public static void method372(@OriginalArg(0) String arg0, @OriginalArg(2) Class10_Sub1_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(24) int local24 = -1;
			for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
				@Pc(32) char local32 = arg0.charAt(local26);
				@Pc(34) int local34 = 0;
				for (@Pc(36) int local36 = 0; local36 < aCharArray4.length; local36++) {
					if (local32 == aCharArray4[local36]) {
						local34 = local36;
						break;
					}
				}
				if (local34 > 12) {
					local34 += 195;
				}
				if (local24 == -1) {
					if (local34 < 13) {
						local24 = local34;
					} else {
						arg1.method301(local34);
					}
				} else if (local34 < 13) {
					arg1.method301((local24 << 4) + local34);
					local24 = -1;
				} else {
					arg1.method301((local24 << 4) + (local34 >> 4));
					local24 = local34 & 0xF;
				}
			}
			if (local24 != -1) {
				arg1.method301(local24 << 4);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("76466, " + arg0 + ", " + 569 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QKAIVGGT", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method373(@OriginalArg(1) String arg0) {
		try {
			aClass10_Sub1_Sub3_2.anInt428 = 0;
			method372(arg0, aClass10_Sub1_Sub3_2);
			@Pc(9) int local9 = aClass10_Sub1_Sub3_2.anInt428;
			aClass10_Sub1_Sub3_2.anInt428 = 0;
			return method371(aClass10_Sub1_Sub3_2, local9);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("80320, " + 0 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
