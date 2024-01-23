import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!fo", name = "P", descriptor = "[I")
	public static int[] anIntArray193 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
	public static int anInt1887 = 0;

	@OriginalMember(owner = "client!fo", name = "W", descriptor = "[I")
	public static int[] anIntArray196 = new int[5];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)Lclient!ij;")
	public static Class79 method1379(@OriginalArg(1) int arg0) {
		@Pc(6) Class79 local6 = (Class79) Static230.aClass89_16.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static288.aClass168_197.method4058(arg0, 3);
		local6 = new Class79();
		if (local21 != null) {
			local6.method1874(new Class1_Sub14(local21));
		}
		Static230.aClass89_16.method2272((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIBII)V")
	public static void method1381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static57.anInt6309 == 0 || arg3 == 0 || Static168.anInt3772 >= 50 || arg0 == -1) {
			return;
		}
		Static270.anIntArray486[Static168.anInt3772] = arg0;
		Static277.anIntArray502[Static168.anInt3772] = arg3;
		Static23.anIntArray55[Static168.anInt3772] = arg1;
		Static150.aClass172Array1[Static168.anInt3772] = null;
		Static39.anIntArray122[Static168.anInt3772] = 0;
		Static256.anIntArray476[Static168.anInt3772] = arg2;
		Static168.anInt3772++;
	}
}
