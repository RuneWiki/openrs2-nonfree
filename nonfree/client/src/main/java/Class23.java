import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KUSEAONH")
public final class Class23 {

	@OriginalMember(owner = "client!KUSEAONH", name = "a", descriptor = "I")
	private static int anInt346 = 110;

	@OriginalMember(owner = "client!KUSEAONH", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!KUSEAONH", name = "c", descriptor = "Lclient!GLMIQHJI;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_3 = new Class8_Sub1_Sub3(new byte[100], -49015);

	@OriginalMember(owner = "client!KUSEAONH", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!KUSEAONH", name = "a", descriptor = "(Lclient!GLMIQHJI;II)Ljava/lang/String;")
	public static String method282(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) int local21 = arg0.method165();
				local27 = local21 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local27 - 195];
					local5 = -1;
				} else if (local27 < 13) {
					aCharArray2[local3++] = aCharArray3[local27];
				} else {
					local5 = local27;
				}
				local27 = local21 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local27 - 195];
					local5 = -1;
				} else if (local27 < 13) {
					aCharArray2[local3++] = aCharArray3[local27];
				} else {
					local5 = local27;
				}
			}
			@Pc(105) boolean local105 = true;
			for (local27 = 0; local27 < local3; local27++) {
				@Pc(113) char local113 = aCharArray2[local27];
				if (local105 && local113 >= 'a' && local113 <= 'z') {
					aCharArray2[local27] = (char) (aCharArray2[local27] - 32);
					local105 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local105 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("56942, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEAONH", name = "a", descriptor = "(Ljava/lang/String;ILclient!GLMIQHJI;)V")
	public static void method283(@OriginalArg(0) String arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
				@Pc(27) char local27 = arg0.charAt(local21);
				@Pc(29) int local29 = 0;
				for (@Pc(31) int local31 = 0; local31 < aCharArray3.length; local31++) {
					if (local27 == aCharArray3[local31]) {
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
						arg1.method155(local29);
					}
				} else if (local29 < 13) {
					arg1.method155((local19 << 4) + local29);
					local19 = -1;
				} else {
					arg1.method155((local19 << 4) + (local29 >> 4));
					local19 = local29 & 0xF;
				}
			}
			if (local19 != -1) {
				arg1.method155(local19 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("81909, " + arg0 + ", " + 24891 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEAONH", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method284(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			aClass8_Sub1_Sub3_3.anInt253 = 0;
			if (arg1 >= 0) {
				anInt346 = 125;
			}
			method283(arg0, aClass8_Sub1_Sub3_3);
			@Pc(13) int local13 = aClass8_Sub1_Sub3_3.anInt253;
			aClass8_Sub1_Sub3_3.anInt253 = 0;
			return method282(aClass8_Sub1_Sub3_3, local13);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("3057, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
