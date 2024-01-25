import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!eq", name = "F", descriptor = "Lclient!dk;")
	public static Class54 aClass54_28;

	@OriginalMember(owner = "client!eq", name = "I", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_33 = new Class134("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!eq", name = "B", descriptor = "Lclient!de;")
	public static final Class50 aClass50_6 = new Class50(14, 0, 4, 1);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Lclient!sq;")
	public static Class228 method1478(@OriginalArg(0) int arg0) {
		@Pc(10) Class228 local10 = (Class228) Static253.aClass132_33.method2701((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static414.aClass54_112.method1126(1, arg0);
		local10 = new Class228();
		local10.anInt6222 = arg0;
		if (local20 != null) {
			local10.method4850(new Class2_Sub13(local20));
		}
		local10.method4853();
		if (local10.anInt6215 == 2 && Static43.aClass72_10.method1659((long) arg0) == null) {
			Static43.aClass72_10.method1653(new Class2_Sub20(Static160.anInt2717), (long) arg0);
			Static241.aClass228Array1[Static160.anInt2717++] = local10;
		}
		Static253.aClass132_33.method2711(local10, (long) arg0);
		return local10;
	}
}
