import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dja", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!dja", name = "n", descriptor = "I")
	public static int anInt1880 = -2;

	@OriginalMember(owner = "client!dja", name = "P", descriptor = "I")
	public static int anInt1899 = 0;

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(B)V")
	public static void method1747() {
		if (anInt1899 <= 0) {
			Static505.aString91 = "";
			return;
		}
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static223.aStringArray14.length; local10++) {
			if (Static223.aStringArray14[local10].indexOf("--> ") != -1) {
				@Pc(23) int local23 = ~anInt1899;
				local8++;
				if (local23 == ~local8) {
					Static505.aString91 = Static223.aStringArray14[local10].substring(Static223.aStringArray14[local10].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILclient!rv;I)Ljava/lang/String;")
	public static String method1750(@OriginalArg(1) Class5_Sub15 arg0) {
		try {
			@Pc(12) int local12 = arg0.method3690();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local12];
			arg0.anInt4144 += Static651.aClass211_1.method5093(arg0.aByteArray45, arg0.anInt4144, local12, local20, 0);
			return Static621.method8308(local12, 0, local20);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}
}
