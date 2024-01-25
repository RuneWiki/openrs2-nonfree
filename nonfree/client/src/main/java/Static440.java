import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "F")
	public static float aFloat135;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!vd;")
	public static Class366 aClass366_6;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public static int anInt7528 = 0;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
	public static int anInt7534 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BZ)Z")
	public static boolean method6509(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub23 local8 = new Class5_Sub23(arg0);
		@Pc(18) int local18 = local8.method8529();
		if (local18 != 2) {
			return false;
		}
		@Pc(38) boolean local38 = local8.method8529() == 1;
		if (local38) {
			Static277.method4080(local8);
		}
		Static404.method5930(local8);
		return true;
	}
}
