import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Z")
	public static boolean aBoolean206;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	public static int anInt2977;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Z")
	public static boolean aBoolean207;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
	public static int anInt2979;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString177 = "wave2:";

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Lclient!ve;")
	public static Class182 method2422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class182 local14 = local7.aClass182_1;
			local7.aClass182_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	public static void method2423(@OriginalArg(0) int arg0) {
		Static178.method2795(Static178.anInt3364, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static178.method2788(-50.0F, -60.0F, -50.0F);
		Static178.method2794(Static178.anInt3365, 0, false);
		Static178.method2790();
	}
}
