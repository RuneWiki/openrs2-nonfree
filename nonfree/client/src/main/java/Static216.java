import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_137 = new Class67(45, 12);

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_58 = new Class242(62, 6);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V")
	public static void method3113() {
		@Pc(5) Class77 local5 = Static85.aClass77_52;
		synchronized (Static85.aClass77_52) {
			Static85.aClass77_52.method1386(5);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	public static void method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass11_Sub2_2 != null) {
			local7.aClass11_Sub2_2 = null;
		}
	}
}
