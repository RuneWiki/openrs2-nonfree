import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "B")
	private static byte aByte40 = 92;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
	private static int anInt1057 = 8573;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(-49365, new byte[100]);

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILclient!lb;I)Ljava/lang/String;")
	public static String method683(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = -1;
			@Pc(22) int local22;
			for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
				@Pc(16) int local16 = arg1.method480();
				local22 = local16 >> 4 & 0xF;
				if (local9 != -1) {
					aCharArray3[local7++] = aCharArray4[(local9 << 4) + local22 - 195];
					local9 = -1;
				} else if (local22 < 13) {
					aCharArray3[local7++] = aCharArray4[local22];
				} else {
					local9 = local22;
				}
				local22 = local16 & 0xF;
				if (local9 != -1) {
					aCharArray3[local7++] = aCharArray4[(local9 << 4) + local22 - 195];
					local9 = -1;
				} else if (local22 < 13) {
					aCharArray3[local7++] = aCharArray4[local22];
				} else {
					local9 = local22;
				}
			}
			@Pc(100) boolean local100 = true;
			for (local22 = 0; local22 < local7; local22++) {
				@Pc(108) char local108 = aCharArray3[local22];
				if (local100 && local108 >= 'a' && local108 <= 'z') {
					aCharArray3[local22] = (char) (aCharArray3[local22] - 32);
					local100 = false;
				}
				if (local108 == '.' || local108 == '!' || local108 == '?') {
					local100 = true;
				}
			}
			return new String(aCharArray3, 0, local7);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("39956, " + arg0 + ", " + arg1 + ", " + 964 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;BLclient!lb;)V")
	public static void method684(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			if (aByte40 == 92) {
				if (arg0.length() > 80) {
					arg0 = arg0.substring(0, 80);
				}
				arg0 = arg0.toLowerCase();
				@Pc(19) int local19 = -1;
				for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
					@Pc(27) char local27 = arg0.charAt(local21);
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
							arg1.method470(local29);
						}
					} else if (local29 < 13) {
						arg1.method470((local19 << 4) + local29);
						local19 = -1;
					} else {
						arg1.method470((local19 << 4) + (local29 >> 4));
						local19 = local29 & 0xF;
					}
				}
				if (local19 != -1) {
					arg1.method470(local19 << 4);
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("12700, " + arg0 + ", " + 92 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method685(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 >= 0) {
				anInt1057 = -152;
			}
			aClass1_Sub1_Sub3_8.anInt763 = 0;
			method684(arg1, aClass1_Sub1_Sub3_8);
			@Pc(13) int local13 = aClass1_Sub1_Sub3_8.anInt763;
			aClass1_Sub1_Sub3_8.anInt763 = 0;
			return method683(local13, aClass1_Sub1_Sub3_8);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("75515, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
