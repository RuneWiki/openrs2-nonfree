import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
	public static int anInt7650;

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_273 = new Class179(36, -2);

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZLclient!ha;Z)Lclient!da;")
	public static Class19 method6632(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class132 arg2) {
		@Pc(9) Class290 local9 = Static27.method6634(arg1, arg0, arg2);
		return local9 == null ? null : local9.aClass19_11;
	}
}
