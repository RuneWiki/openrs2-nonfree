import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!wl", name = "L", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array17;

	@OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
	public static final int anInt9361 = 2;

	@OriginalMember(owner = "client!wl", name = "R", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_171 = new Class133(50, -1);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!kea;ILclient!kea;Lclient!kea;Lclient!kea;)V")
	public static void method7733(@OriginalArg(0) Class161 arg0, @OriginalArg(2) Class161 arg1, @OriginalArg(3) Class161 arg2, @OriginalArg(4) Class161 arg3) {
		Static337.aClass161_70 = arg2;
		Static365.aClass161_82 = arg3;
		Static246.aClass161_55 = arg1;
		Static323.aClass161_65 = arg0;
		Static459.aClass245ArrayArray2 = new Class245[Static337.aClass161_70.method4239()][];
		Static57.aBooleanArray6 = new boolean[Static337.aClass161_70.method4239()];
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lclient!ka;")
	public static Class3_Sub10_Sub10 method7734(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub10_Sub10 local10 = (Class3_Sub10_Sub10) Static152.aClass168_1.method4551((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static310.aClass161_61.method4243(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static287.method4866(local20);
			Static152.aClass168_1.method4547((long) arg0, local10);
			return local10;
		}
	}
}
