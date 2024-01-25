import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "[Lclient!jj;")
	public static Class83_Sub1[] aClass83_Sub1Array2;

	@OriginalMember(owner = "client!vp", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString248 = "yellow:";

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "[I")
	public static final int[] anIntArray531 = new int[14];

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class116 method5560(@OriginalArg(1) int arg0) {
		@Pc(10) Class154 local10 = Static238.aClass154_76;
		@Pc(19) Class116 local19;
		synchronized (Static238.aClass154_76) {
			local19 = (Class116) Static238.aClass154_76.method4222((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static269.aClass11_115.method288(Static76.method1400(arg0), Static318.method5281(arg0));
		local19 = new Class116();
		local19.anInt3756 = arg0;
		if (local39 != null) {
			local19.method3179(new Class4_Sub7(local39));
		}
		local19.method3180();
		@Pc(60) Class154 local60 = Static238.aClass154_76;
		synchronized (Static238.aClass154_76) {
			Static238.aClass154_76.method4221((long) arg0, local19);
			return local19;
		}
	}
}
