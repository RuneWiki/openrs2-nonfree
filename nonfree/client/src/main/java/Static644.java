import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "D")
	public static double aDouble24;

	@OriginalMember(owner = "client!wo", name = "kb", descriptor = "I")
	public static int anInt10415;

	@OriginalMember(owner = "client!wo", name = "D", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_179 = new Class145(56, 2);

	@OriginalMember(owner = "client!wo", name = "fb", descriptor = "Z")
	public static boolean aBoolean756 = false;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
	public static void method8849(@OriginalArg(1) int arg0) {
		Static223.anInt3813 = arg0;
		@Pc(11) Class69 local11 = Static86.aClass69_10;
		synchronized (Static86.aClass69_10) {
			Static86.aClass69_10.method1905();
		}
		local11 = Static570.aClass69_60;
		synchronized (Static570.aClass69_60) {
			Static570.aClass69_60.method1905();
		}
	}
}
