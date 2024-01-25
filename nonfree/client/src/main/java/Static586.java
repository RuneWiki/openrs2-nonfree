import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public static int anInt10150;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "Lclient!jn;")
	public static Class176 aClass176_132;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)Lclient!sb;")
	public static Class299 method8304(@OriginalArg(1) int arg0) {
		@Pc(8) Class299[] local8 = Static116.method2469();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class299 local21 = local8[local15];
			if (local21.anInt8686 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
