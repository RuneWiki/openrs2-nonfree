import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
	public static int anInt5755;

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_43 = new Class344(30, -1);

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_44 = new Class344(9, 2);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIBI)V")
	public static void method4442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static289.anInt5872 && arg1 <= Static160.anInt3347) {
			@Pc(19) int local19 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3);
			@Pc(25) int local25 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg0);
			Static455.method6676(arg2, local25, arg1, local19);
		}
	}
}
