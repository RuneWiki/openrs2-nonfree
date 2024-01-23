import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!in", name = "qb", descriptor = "[Lclient!aj;")
	public static Class1_Sub4[] aClass1_Sub4Array1;

	@OriginalMember(owner = "client!in", name = "Yc", descriptor = "Lclient!vi;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!in", name = "pb", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!in", name = "Wb", descriptor = "[I")
	public static int[] anIntArray242 = new int[200];

	@OriginalMember(owner = "client!in", name = "id", descriptor = "I")
	public static int anInt2723 = 0;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(BI)Lclient!ad;")
	public static Class4 method2105(@OriginalArg(1) int arg0) {
		@Pc(18) Class4 local18 = (Class4) Static250.aClass135_32.method3316((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(29) byte[] local29 = Static141.aClass91_113.method2495(34, arg0);
		local18 = new Class4();
		if (local29 != null) {
			local18.method139(arg0, new Class1_Sub11(local29));
		}
		Static250.aClass135_32.method3321((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
	public static void method2109(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static130.method2227(arg0, 8);
		local8.method3911();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Lclient!fd;")
	public static Class44 method2110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass44_1 == null ? null : local7.aClass44_1;
	}
}
