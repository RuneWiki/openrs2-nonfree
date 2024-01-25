import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Lclient!nq;")
	public static Class144 aClass144_108;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_115 = new Class117("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public static int anInt6377 = 0;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "[I")
	public static final int[] anIntArray525 = new int[14];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lclient!an;")
	public static Class13 method5453(@OriginalArg(0) int arg0) {
		@Pc(10) Class13 local10 = (Class13) Static18.aClass26_2.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static147.aClass144_42.method3896(arg0, 31);
		local10 = new Class13();
		if (local25 != null) {
			local10.method170(new Class11_Sub25(local25), arg0);
		}
		Static18.aClass26_2.method330((long) arg0, local10);
		return local10;
	}
}
