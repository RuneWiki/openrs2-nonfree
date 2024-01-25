import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	public static int anInt9296;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "Lclient!bk;")
	public static final Class31 aClass31_7 = new Class31();

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "Z")
	public static boolean aBoolean697 = false;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
	public static int anInt9301 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)Lclient!lc;")
	public static Class174 method8041(@OriginalArg(0) int arg0) {
		@Pc(8) Class174[] local8 = Static132.method2523();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class174 local24 = local8[local18];
			if (arg0 == local24.anInt5111) {
				return local24;
			}
		}
		return null;
	}
}
