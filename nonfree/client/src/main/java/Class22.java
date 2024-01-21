import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LSYVWAVF")
public final class Class22 {

	@OriginalMember(owner = "client!LSYVWAVF", name = "a", descriptor = "I")
	private static int anInt419 = 897;

	@OriginalMember(owner = "client!LSYVWAVF", name = "b", descriptor = "Z")
	private static boolean aBoolean99 = true;

	@OriginalMember(owner = "client!LSYVWAVF", name = "c", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!LSYVWAVF", name = "d", descriptor = "Lclient!NHEPCMLW;")
	private static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_4 = new Class3_Sub1_Sub3((byte) -103, new byte[100]);

	@OriginalMember(owner = "client!LSYVWAVF", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!LSYVWAVF", name = "a", descriptor = "(IZLclient!NHEPCMLW;)Ljava/lang/String;")
	public static String method255(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method274();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray1[local3++] = aCharArray2[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray1[local3++] = aCharArray2[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray1[local3++] = aCharArray2[local18];
				} else {
					local5 = local18;
				}
			}
			@Pc(96) boolean local96 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(104) char local104 = aCharArray1[local18];
				if (local96 && local104 >= 'a' && local104 <= 'z') {
					aCharArray1[local18] = (char) (aCharArray1[local18] - 32);
					local96 = false;
				}
				if (local104 == '.' || local104 == '!' || local104 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray1, 0, local3);
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("59918, " + arg0 + ", " + true + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LSYVWAVF", name = "a", descriptor = "(ILclient!NHEPCMLW;Ljava/lang/String;)V")
	public static void method256(@OriginalArg(1) Class3_Sub1_Sub3 arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(23) int local23 = -1;
			for (@Pc(25) int local25 = 0; local25 < arg1.length(); local25++) {
				@Pc(31) char local31 = arg1.charAt(local25);
				@Pc(33) int local33 = 0;
				for (@Pc(35) int local35 = 0; local35 < aCharArray2.length; local35++) {
					if (local31 == aCharArray2[local35]) {
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
						arg0.method264(local33);
					}
				} else if (local33 < 13) {
					arg0.method264((local23 << 4) + local33);
					local23 = -1;
				} else {
					arg0.method264((local23 << 4) + (local33 >> 4));
					local23 = local33 & 0xF;
				}
			}
			if (local23 != -1) {
				arg0.method264(local23 << 4);
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("38640, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LSYVWAVF", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method257(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			aClass3_Sub1_Sub3_4.anInt441 = 0;
			method256(aClass3_Sub1_Sub3_4, arg1);
			@Pc(9) int local9 = aClass3_Sub1_Sub3_4.anInt441;
			aClass3_Sub1_Sub3_4.anInt441 = 0;
			if (arg0 != 0) {
				aBoolean99 = !aBoolean99;
			}
			return method255(local9, aClass3_Sub1_Sub3_4);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("12869, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
