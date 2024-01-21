import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IWFUJXTN")
public final class Class19 {

	@OriginalMember(owner = "client!IWFUJXTN", name = "a", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!IWFUJXTN", name = "b", descriptor = "I")
	private static int anInt307 = -18411;

	@OriginalMember(owner = "client!IWFUJXTN", name = "c", descriptor = "I")
	private static int anInt308 = 7;

	@OriginalMember(owner = "client!IWFUJXTN", name = "d", descriptor = "I")
	private static int anInt309 = 48;

	@OriginalMember(owner = "client!IWFUJXTN", name = "e", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!IWFUJXTN", name = "f", descriptor = "Lclient!WBEWPIXO;")
	private static Class3_Sub3_Sub4 aClass3_Sub3_Sub4_3 = new Class3_Sub3_Sub4((byte) -115, new byte[100]);

	@OriginalMember(owner = "client!IWFUJXTN", name = "g", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!IWFUJXTN", name = "a", descriptor = "(IZLclient!WBEWPIXO;)Ljava/lang/String;")
	public static String method179(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = -1;
			@Pc(24) int local24;
			for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
				@Pc(18) int local18 = arg1.method468();
				local24 = local18 >> 4 & 0xF;
				if (local11 != -1) {
					aCharArray1[local9++] = aCharArray2[(local11 << 4) + local24 - 195];
					local11 = -1;
				} else if (local24 < 13) {
					aCharArray1[local9++] = aCharArray2[local24];
				} else {
					local11 = local24;
				}
				local24 = local18 & 0xF;
				if (local11 != -1) {
					aCharArray1[local9++] = aCharArray2[(local11 << 4) + local24 - 195];
					local11 = -1;
				} else if (local24 < 13) {
					aCharArray1[local9++] = aCharArray2[local24];
				} else {
					local11 = local24;
				}
			}
			@Pc(102) boolean local102 = true;
			for (local24 = 0; local24 < local9; local24++) {
				@Pc(110) char local110 = aCharArray1[local24];
				if (local102 && local110 >= 'a' && local110 <= 'z') {
					aCharArray1[local24] = (char) (aCharArray1[local24] - 32);
					local102 = false;
				}
				if (local110 == '.' || local110 == '!' || local110 == '?') {
					local102 = true;
				}
			}
			return new String(aCharArray1, 0, local9);
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("71908, " + arg0 + ", " + false + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IWFUJXTN", name = "a", descriptor = "(ILclient!WBEWPIXO;Ljava/lang/String;)V")
	public static void method180(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub4 arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg2.length() > 80) {
				arg2 = arg2.substring(0, 80);
			}
			arg2 = arg2.toLowerCase();
			if (arg0 != -18411) {
				anInt309 = -59;
			}
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < arg2.length(); local22++) {
				@Pc(28) char local28 = arg2.charAt(local22);
				@Pc(30) int local30 = 0;
				for (@Pc(32) int local32 = 0; local32 < aCharArray2.length; local32++) {
					if (local28 == aCharArray2[local32]) {
						local30 = local32;
						break;
					}
				}
				if (local30 > 12) {
					local30 += 195;
				}
				if (local20 == -1) {
					if (local30 < 13) {
						local20 = local30;
					} else {
						arg1.method458(local30);
					}
				} else if (local30 < 13) {
					arg1.method458((local20 << 4) + local30);
					local20 = -1;
				} else {
					arg1.method458((local20 << 4) + (local30 >> 4));
					local20 = local30 & 0xF;
				}
			}
			if (local20 != -1) {
				arg1.method458(local20 << 4);
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("75952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IWFUJXTN", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method181(@OriginalArg(0) String arg0) {
		try {
			aClass3_Sub3_Sub4_3.anInt738 = 0;
			method180(anInt307, aClass3_Sub3_Sub4_3, arg0);
			@Pc(9) int local9 = aClass3_Sub3_Sub4_3.anInt738;
			aClass3_Sub3_Sub4_3.anInt738 = 0;
			@Pc(17) String local17 = method179(local9, aClass3_Sub3_Sub4_3);
			if (anInt308 > 7 || anInt308 < 7) {
				aBoolean73 = !aBoolean73;
			}
			return local17;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("57542, " + arg0 + ", " + 7 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
