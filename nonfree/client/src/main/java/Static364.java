import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!hg;")
	public static Class158 aClass158_7;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!kia;")
	public static final Class201 aClass201_6 = new Class201("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method5391(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub5_Sub6 local16 = Static478.method6972((long) arg0, 8);
		local16.method2686();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5392(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
