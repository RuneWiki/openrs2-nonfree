import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BIIII)V")
	public static void method8054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static280.anInt5114 <= arg1 && Static356.anInt6028 >= arg1) {
			@Pc(21) int local21 = Static27.method393(arg3, Static85.anInt1313, Static316.anInt6313);
			@Pc(27) int local27 = Static27.method393(arg0, Static85.anInt1313, Static316.anInt6313);
			Static580.method7996(arg1, local21, arg2, local27);
		}
	}
}
