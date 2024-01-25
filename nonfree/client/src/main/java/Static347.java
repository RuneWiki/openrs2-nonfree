import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "[I")
	public static int[] anIntArray701;

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "Lclient!nd;")
	public static Class238 aClass238_277;

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_215 = new Class200(74, -1);

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
	public static final int anInt9929 = Static138.method2523(1600);

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_173 = new Class145(25, 3);

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)Z")
	public static boolean method8439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(18) Class5 local18 = Static79.aClass304_2.method6956(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local18.method90(arg1);
	}
}
