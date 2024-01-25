import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!im;")
	public static final Class140 aClass140_56 = new Class140(33, 2);

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_156 = new Class296(34, 7);

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "Lclient!be;")
	public static final Class22 aClass22_2 = new Class22();

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_38 = new Class306("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)Lclient!bb;")
	public static Class19 method2593(@OriginalArg(0) int arg0) {
		@Pc(10) Class19 local10 = (Class19) Static122.aClass313_12.method7406((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static244.aClass171_79.method4339(1, arg0);
		local10 = new Class19();
		local10.anInt732 = arg0;
		if (local20 != null) {
			local10.method749(new Class1_Sub6(local20));
		}
		local10.method750();
		if (local10.anInt733 == 2 && Static134.aClass17_11.method738((long) arg0) == null) {
			Static134.aClass17_11.method737(new Class1_Sub9(Static453.anInt7743), (long) arg0);
			Static96.aClass19Array1[Static453.anInt7743++] = local10;
		}
		Static122.aClass313_12.method7399((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
	public static void method2602() {
		Static384.aClass313_46.method7403(50);
		Static416.aClass313_51.method7403(50);
		Static425.aClass313_54.method7403(50);
		Static431.aClass313_56.method7403(50);
		Static71.aClass313_7.method7403(50);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZZII)V")
	public static void method2606(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static16.method450(arg3, arg1, Static234.aClass185_Sub1Array1.length - 1, arg2, arg0, 0);
		Static110.anInt2232 = 0;
		Static222.aClass1_Sub44_2 = null;
	}
}
