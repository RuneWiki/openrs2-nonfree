import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!js", name = "K", descriptor = "Lclient!mo;")
	public static Class143 aClass143_65;

	@OriginalMember(owner = "client!js", name = "A", descriptor = "Lclient!bn;")
	public static final Class25 aClass25_10 = new Class25(16);

	@OriginalMember(owner = "client!js", name = "L", descriptor = "Lclient!al;")
	public static final Class11 aClass11_72 = new Class11(64);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Lclient!ll;")
	public static Class129 method3071(@OriginalArg(1) int arg0) {
		@Pc(10) Class129 local10 = (Class129) Static294.aClass11_129.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static20.aClass143_15.method3745(1, arg0);
		local10 = new Class129();
		local10.anInt3779 = arg0;
		if (local20 != null) {
			local10.method3511(new Class14_Sub4(local20));
		}
		local10.method3509();
		if (local10.anInt3771 == 2 && Static182.aClass25_19.method691((long) arg0) == null) {
			Static182.aClass25_19.method687((long) arg0, new Class14_Sub34(Static31.anInt732));
			Static39.aClass129Array1[Static31.anInt732++] = local10;
		}
		Static294.aClass11_129.method219((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method3072(@OriginalArg(1) Class143 arg0) {
		Static238.aClass143_90 = arg0;
		Static46.anInt1172 = Static238.aClass143_90.method3732(19);
	}
}
