import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "Z")
	public static boolean aBoolean618;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_50 = new Class207(8);

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
	public static int anInt8302 = 0;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6707(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static304.aStringArray17.length; local12++) {
			if (Static304.aStringArray17[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BI)V")
	public static void method6709(@OriginalArg(1) int arg0) {
		Static69.anInt1339 = arg0;
		Static24.anInt582 = 100;
		Static413.anInt7319 = 3;
		Static514.anInt8865 = -1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLjava/awt/Canvas;Lclient!fa;)Lclient!r;")
	public static Class78 method6711(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface9 arg1) {
		return new Class78_Sub2(arg0, arg1);
	}
}
