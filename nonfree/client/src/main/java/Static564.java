import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Z")
	public static boolean aBoolean693 = false;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public static int anInt9904 = -1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!r;ZI)Lclient!gda;")
	public static Class114 method8080(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class32 local9 = Static271.method4718(arg0, arg1, true);
		return local9 == null ? null : local9.aClass114_1;
	}
}
