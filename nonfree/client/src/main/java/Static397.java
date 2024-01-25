import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "[I")
	public static int[] anIntArray736;

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
	public static int anInt9636;

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_294 = new Class235(65, 6);

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray206 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIZI)Lclient!rb;")
	public static Class1_Sub44 method7857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub44 local7 = new Class1_Sub44();
		local7.anInt7685 = arg3;
		local7.anInt7686 = arg0;
		Static78.aClass187_8.method3795(local7, (long) arg1);
		Static520.method7227(arg3);
		@Pc(26) Class341 local26 = Static350.method4758(arg1);
		if (local26 != null) {
			Static442.method6111(local26);
		}
		if (Static205.aClass341_21 != null) {
			Static442.method6111(Static205.aClass341_21);
			Static205.aClass341_21 = null;
		}
		Static201.method3242();
		if (local26 != null) {
			Static417.method6106(local26, !arg2);
		}
		if (!arg2) {
			Static80.method1459(arg3);
		}
		if (!arg2 && Static422.anInt7311 != -1) {
			Static474.method7346(1, Static422.anInt7311);
		}
		return local7;
	}
}
