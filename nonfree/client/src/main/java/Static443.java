import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	public static int anInt7125 = -2;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_210 = new Class107(67, 10);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI)Z")
	public static boolean method5834(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub5 local8 = new Class1_Sub5(arg0);
		@Pc(12) int local12 = local8.method5366();
		if (local12 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method5366() == 1;
		if (local30) {
			Static27.method571(local8);
		}
		Static173.method2780(local8);
		return true;
	}
}
