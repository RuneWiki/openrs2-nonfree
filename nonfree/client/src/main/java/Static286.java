import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public static int anInt5279;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "J")
	public static long aLong160 = 0L;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "[Lclient!bm;")
	public static final Class13[] aClass13Array1 = new Class13[128];

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4708(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static108.method1981(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method4709(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub7_Sub2 local12 = Static328.method5290(3, arg1);
		local12.method1198();
		local12.aString16 = arg0;
	}
}
