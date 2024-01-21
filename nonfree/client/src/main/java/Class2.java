import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private static int anInt125 = 40639;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[C")
	private static char[] aCharArray1 = new char[100];

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!mb;II)Ljava/lang/String;")
	public static String method40(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = -1;
			@Pc(22) int local22;
			for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
				@Pc(16) int local16 = arg0.method498();
				local22 = local16 >> 4 & 0xF;
				if (local9 != -1) {
					aCharArray1[local7++] = aCharArray2[(local9 << 4) + local22 - 195];
					local9 = -1;
				} else if (local22 < 13) {
					aCharArray1[local7++] = aCharArray2[local22];
				} else {
					local9 = local22;
				}
				local22 = local16 & 0xF;
				if (local9 != -1) {
					aCharArray1[local7++] = aCharArray2[(local9 << 4) + local22 - 195];
					local9 = -1;
				} else if (local22 < 13) {
					aCharArray1[local7++] = aCharArray2[local22];
				} else {
					local9 = local22;
				}
			}
			@Pc(100) boolean local100 = true;
			for (local22 = 0; local22 < local7; local22++) {
				@Pc(108) char local108 = aCharArray1[local22];
				if (local100 && local108 >= 'a' && local108 <= 'z') {
					aCharArray1[local22] = (char) (aCharArray1[local22] - 32);
					local100 = false;
				}
				if (local108 == '.' || local108 == '!') {
					local100 = true;
				}
			}
			return new String(aCharArray1, 0, local7);
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("18389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;Lclient!mb;B)V")
	public static void method41(@OriginalArg(0) String arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 != 8) {
				anInt125 = 53;
			}
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < arg0.length(); local22++) {
				@Pc(28) char local28 = arg0.charAt(local22);
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
						arg1.method488(local30);
					}
				} else if (local30 < 13) {
					arg1.method488((local20 << 4) + local30);
					local20 = -1;
				} else {
					arg1.method488((local20 << 4) + (local30 >> 4));
					local20 = local30 & 0xF;
				}
			}
			if (local20 != -1) {
				arg1.method488(local20 << 4);
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("66333, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}
}
