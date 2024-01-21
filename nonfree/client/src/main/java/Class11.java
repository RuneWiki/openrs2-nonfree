import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EXGZUGXN")
public final class Class11 {

	@OriginalMember(owner = "client!EXGZUGXN", name = "a", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!EXGZUGXN", name = "b", descriptor = "Lclient!EMWAMCXW;")
	private static Class2_Sub1_Sub3 aClass2_Sub1_Sub3_2 = new Class2_Sub1_Sub3(new byte[100], true);

	@OriginalMember(owner = "client!EXGZUGXN", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!EXGZUGXN", name = "a", descriptor = "(Lclient!EMWAMCXW;II)Ljava/lang/String;")
	public static String method136(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(9) boolean local9 = false;
			@Pc(22) int local22;
			for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
				@Pc(16) int local16 = arg0.method97();
				local22 = local16 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local22 - 195];
					local5 = -1;
				} else if (local22 < 13) {
					aCharArray2[local3++] = aCharArray3[local22];
				} else {
					local5 = local22;
				}
				local22 = local16 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local22 - 195];
					local5 = -1;
				} else if (local22 < 13) {
					aCharArray2[local3++] = aCharArray3[local22];
				} else {
					local5 = local22;
				}
			}
			@Pc(100) boolean local100 = true;
			for (local22 = 0; local22 < local3; local22++) {
				@Pc(108) char local108 = aCharArray2[local22];
				if (local100 && local108 >= 'a' && local108 <= 'z') {
					aCharArray2[local22] = (char) (aCharArray2[local22] - 32);
					local100 = false;
				}
				if (local108 == '.' || local108 == '!' || local108 == '?') {
					local100 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("60350, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXGZUGXN", name = "a", descriptor = "(ILjava/lang/String;Lclient!EMWAMCXW;)V")
	public static void method137(@OriginalArg(1) String arg0, @OriginalArg(2) Class2_Sub1_Sub3 arg1) {
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
						arg1.method87(local25);
					}
				} else if (local25 < 13) {
					arg1.method87((local15 << 4) + local25);
					local15 = -1;
				} else {
					arg1.method87((local15 << 4) + (local25 >> 4));
					local15 = local25 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method87(local15 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("78564, " + 921 + ", " + arg0 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXGZUGXN", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method138(@OriginalArg(1) String arg0) {
		try {
			aClass2_Sub1_Sub3_2.anInt136 = 0;
			method137(arg0, aClass2_Sub1_Sub3_2);
			@Pc(9) int local9 = aClass2_Sub1_Sub3_2.anInt136;
			aClass2_Sub1_Sub3_2.anInt136 = 0;
			return method136(aClass2_Sub1_Sub3_2, local9, 905);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("64938, " + false + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
