import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_128 = new Class397(129, 28);

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public static int anInt7979 = -1;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "Lclient!le;")
	public static final Class222 aClass222_4 = new Class222();

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_129 = new Class397(132, 3);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lclient!em;")
	public static Class100 method6841(@OriginalArg(1) int arg0) {
		@Pc(10) Class100 local10 = (Class100) Static694.aClass307_93.method7002((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static646.aClass182_118.method3985(arg0, 1);
		local10 = new Class100();
		local10.anInt2716 = arg0;
		if (local21 != null) {
			local10.method2495(new Class3_Sub2(local21));
		}
		local10.method2496();
		if (local10.anInt2719 == 2 && Static235.aClass313_19.method7104((long) arg0) == null) {
			Static235.aClass313_19.method7107((long) arg0, new Class3_Sub44(Static168.anInt2983));
			Static205.aClass100Array1[Static168.anInt2983++] = local10;
		}
		Static694.aClass307_93.method7000(local10, (long) arg0);
		return local10;
	}
}
