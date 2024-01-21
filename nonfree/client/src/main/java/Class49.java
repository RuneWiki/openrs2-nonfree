import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt1030 = 257;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(new byte[100], 58);

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Lclient!lb;II)Ljava/lang/String;")
	public static String method683(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = -1;
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) int local21 = arg0.method480();
				local27 = local21 >> 4 & 0xF;
				if (local14 != -1) {
					aCharArray3[local12++] = aCharArray4[(local14 << 4) + local27 - 195];
					local14 = -1;
				} else if (local27 < 13) {
					aCharArray3[local12++] = aCharArray4[local27];
				} else {
					local14 = local27;
				}
				local27 = local21 & 0xF;
				if (local14 != -1) {
					aCharArray3[local12++] = aCharArray4[(local14 << 4) + local27 - 195];
					local14 = -1;
				} else if (local27 < 13) {
					aCharArray3[local12++] = aCharArray4[local27];
				} else {
					local14 = local27;
				}
			}
			@Pc(105) boolean local105 = true;
			for (local27 = 0; local27 < local12; local27++) {
				@Pc(113) char local113 = aCharArray3[local27];
				if (local105 && local113 >= 'a' && local113 <= 'z') {
					aCharArray3[local27] = (char) (aCharArray3[local27] - 32);
					local105 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local105 = true;
				}
			}
			return new String(aCharArray3, 0, local12);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("51605, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLclient!lb;Ljava/lang/String;)V")
	public static void method684(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
				@Pc(27) char local27 = arg1.charAt(local21);
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
						arg0.method470(local29);
					}
				} else if (local29 < 13) {
					arg0.method470((local19 << 4) + local29);
					local19 = -1;
				} else {
					arg0.method470((local19 << 4) + (local29 >> 4));
					local19 = local29 & 0xF;
				}
			}
			if (local19 != -1) {
				arg0.method470(local19 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("44878, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method685(@OriginalArg(1) String arg0) {
		try {
			aClass1_Sub1_Sub3_8.anInt742 = 0;
			method684(aClass1_Sub1_Sub3_8, arg0);
			@Pc(9) int local9 = aClass1_Sub1_Sub3_8.anInt742;
			aClass1_Sub1_Sub3_8.anInt742 = 0;
			return method683(aClass1_Sub1_Sub3_8, local9);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("8093, " + 59 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
