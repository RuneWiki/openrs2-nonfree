import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EDPSKMQR")
public final class Class13 {

	@OriginalMember(owner = "client!EDPSKMQR", name = "a", descriptor = "Z")
	private static boolean aBoolean61 = true;

	@OriginalMember(owner = "client!EDPSKMQR", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!EDPSKMQR", name = "c", descriptor = "Lclient!CFARFRSG;")
	private static Class1_Sub1_Sub2 aClass1_Sub1_Sub2_1 = new Class1_Sub1_Sub2(new byte[100], 792);

	@OriginalMember(owner = "client!EDPSKMQR", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!EDPSKMQR", name = "a", descriptor = "(IILclient!CFARFRSG;)Ljava/lang/String;")
	public static String method185(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = -1;
			@Pc(29) int local29;
			for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
				@Pc(23) int local23 = arg1.method59();
				local29 = local23 >> 4 & 0xF;
				if (local16 != -1) {
					aCharArray2[local14++] = aCharArray3[(local16 << 4) + local29 - 195];
					local16 = -1;
				} else if (local29 < 13) {
					aCharArray2[local14++] = aCharArray3[local29];
				} else {
					local16 = local29;
				}
				local29 = local23 & 0xF;
				if (local16 != -1) {
					aCharArray2[local14++] = aCharArray3[(local16 << 4) + local29 - 195];
					local16 = -1;
				} else if (local29 < 13) {
					aCharArray2[local14++] = aCharArray3[local29];
				} else {
					local16 = local29;
				}
			}
			@Pc(107) boolean local107 = true;
			for (local29 = 0; local29 < local14; local29++) {
				@Pc(115) char local115 = aCharArray2[local29];
				if (local107 && local115 >= 'a' && local115 <= 'z') {
					aCharArray2[local29] = (char) (aCharArray2[local29] - 32);
					local107 = false;
				}
				if (local115 == '.' || local115 == '!' || local115 == '?') {
					local107 = true;
				}
			}
			return new String(aCharArray2, 0, local14);
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("37378, " + -916 + ", " + arg0 + ", " + arg1 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDPSKMQR", name = "a", descriptor = "(Ljava/lang/String;BLclient!CFARFRSG;)V")
	public static void method186(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub2 arg2) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			@Pc(20) boolean local20 = false;
			for (@Pc(31) int local31 = 0; local31 < arg0.length(); local31++) {
				@Pc(37) char local37 = arg0.charAt(local31);
				@Pc(39) int local39 = 0;
				for (@Pc(41) int local41 = 0; local41 < aCharArray3.length; local41++) {
					if (local37 == aCharArray3[local41]) {
						local39 = local41;
						break;
					}
				}
				if (local39 > 12) {
					local39 += 195;
				}
				if (local15 == -1) {
					if (local39 < 13) {
						local15 = local39;
					} else {
						arg2.method49(local39);
					}
				} else if (local39 < 13) {
					arg2.method49((local15 << 4) + local39);
					local15 = -1;
				} else {
					arg2.method49((local15 << 4) + (local39 >> 4));
					local15 = local39 & 0xF;
				}
			}
			if (local15 != -1) {
				arg2.method49(local15 << 4);
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("33578, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDPSKMQR", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method187(@OriginalArg(1) String arg0) {
		try {
			aClass1_Sub1_Sub2_1.anInt153 = 0;
			method186(arg0, (byte) 6, aClass1_Sub1_Sub2_1);
			@Pc(17) int local17 = aClass1_Sub1_Sub2_1.anInt153;
			aClass1_Sub1_Sub2_1.anInt153 = 0;
			return method185(local17, aClass1_Sub1_Sub2_1);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("73332, " + -211 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
