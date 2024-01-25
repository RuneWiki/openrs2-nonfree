import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!sv", name = "T", descriptor = "I")
	public static int anInt8369;

	@OriginalMember(owner = "client!sv", name = "P", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_243 = new Class363(90, 0);

	@OriginalMember(owner = "client!sv", name = "Q", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_244 = new Class363(116, 0);

	@OriginalMember(owner = "client!sv", name = "S", descriptor = "Z")
	public static boolean aBoolean650 = false;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)Lclient!ce;")
	public static Class51 method6943(@OriginalArg(1) int arg0) {
		@Pc(10) Class51 local10 = (Class51) Static344.aClass313_37.method6989((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static251.aClass259_81.method5985(arg0, 0);
		local10 = new Class51();
		if (local28 != null) {
			local10.method941(new Class2_Sub15(local28));
		}
		local10.method944();
		Static344.aClass313_37.method6980((long) arg0, local10);
		return local10;
	}
}
