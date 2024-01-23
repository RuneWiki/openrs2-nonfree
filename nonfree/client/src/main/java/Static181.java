import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!si", name = "R", descriptor = "Lclient!i;")
	private static Class41 aClass41_1105 = Static184.method2923("Existing User");

	@OriginalMember(owner = "client!si", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_1104 = aClass41_1105;

	@OriginalMember(owner = "client!si", name = "K", descriptor = "Lclient!ob;")
	public static Class70 aClass70_16 = new Class70(4096);

	@OriginalMember(owner = "client!si", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_1106 = Static184.method2923("Untersuchen");

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!q;)Lclient!q;")
	public static Class80 method2898(@OriginalArg(1) Class80 arg0) {
		if (arg0.anInt3697 != -1) {
			return Static212.method3256(arg0.anInt3697);
		}
		@Pc(19) int local19 = arg0.anInt3661 >>> 16;
		for (@Pc(32) Class2_Sub21 local32 = (Class2_Sub21) Static113.aClass70_8.method2203(); local32 != null; local32 = (Class2_Sub21) Static113.aClass70_8.method2204()) {
			if (local19 == local32.anInt3435) {
				return Static212.method3256((int) local32.aLong150);
			}
		}
		return null;
	}
}
