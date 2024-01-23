import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "Lclient!mn;")
	public static Class115 aClass115_7;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
	public static int anInt1488;

	@OriginalMember(owner = "client!fb", name = "R", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1280(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[BI)I")
	public static int method1282(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local7 = Class174.anIntArray505[(arg1[local14] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)V")
	public static void method1283() {
		Static112.aClass46_17.method1079();
	}
}
