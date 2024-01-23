import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[[[Lclient!i;")
	public static Class1_Sub14[][][] aClass1_Sub14ArrayArrayArray3;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!ol;")
	public static Class117 aClass117_12 = new Class117(8);

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public static int anInt3492 = 500;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString101 = "shake:";

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public static int anInt3493 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2779(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method2780() {
		if (Static112.aClass59ArrayArray1 == null) {
			return;
		}
		@Pc(8) Class59 local8 = new Class59();
		for (@Pc(10) int local10 = 0; local10 < 13; local10++) {
			for (@Pc(17) int local17 = 0; local17 < 13; local17++) {
				Static112.aClass59ArrayArray1[local10][local17] = local8;
			}
		}
	}
}
