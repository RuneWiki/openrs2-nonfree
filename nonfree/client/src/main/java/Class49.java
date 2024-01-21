import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "Z")
	private static boolean aBoolean265;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "Z")
	private static boolean aBoolean266;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(new byte[100], aBoolean265);

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Lclient!lb;II)Ljava/lang/String;")
	public static String method683(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(24) int local24;
			for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
				@Pc(18) int local18 = arg0.method480();
				local24 = local18 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local24 - 195];
					local5 = -1;
				} else if (local24 < 13) {
					aCharArray3[local3++] = aCharArray4[local24];
				} else {
					local5 = local24;
				}
				local24 = local18 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local24 - 195];
					local5 = -1;
				} else if (local24 < 13) {
					aCharArray3[local3++] = aCharArray4[local24];
				} else {
					local5 = local24;
				}
			}
			@Pc(102) boolean local102 = true;
			for (local24 = 0; local24 < local3; local24++) {
				@Pc(110) char local110 = aCharArray3[local24];
				if (local102 && local110 >= 'a' && local110 <= 'z') {
					aCharArray3[local24] = (char) (aCharArray3[local24] - 32);
					local102 = false;
				}
				if (local110 == '.' || local110 == '!' || local110 == '?') {
					local102 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("66047, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Lclient!lb;ILjava/lang/String;)V")
	public static void method684(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(24) int local24 = -1;
			for (@Pc(26) int local26 = 0; local26 < arg1.length(); local26++) {
				@Pc(32) char local32 = arg1.charAt(local26);
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
						arg0.method470(local34);
					}
				} else if (local34 < 13) {
					arg0.method470((local24 << 4) + local34);
					local24 = -1;
				} else {
					arg0.method470((local24 << 4) + (local34 >> 4));
					local24 = local34 & 0xF;
				}
			}
			if (local24 != -1) {
				arg0.method470(local24 << 4);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("80533, " + arg0 + ", " + -41401 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method685(@OriginalArg(1) String arg0) {
		try {
			aClass1_Sub1_Sub3_8.anInt733 = 0;
			method684(aClass1_Sub1_Sub3_8, arg0);
			@Pc(9) int local9 = aClass1_Sub1_Sub3_8.anInt733;
			aClass1_Sub1_Sub3_8.anInt733 = 0;
			return method683(aClass1_Sub1_Sub3_8, local9);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("41676, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
