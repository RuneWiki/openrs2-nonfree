import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	public static int anInt2564;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Lclient!pq;")
	public static Class251 aClass251_50;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII)V")
	public static void method2163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		Static475.aFloat174 = local11;
		if (Static354.anInt6233 == 2) {
			Static261.anInt4257 = local3;
			Static162.anInt2840 = local11;
			Static218.anInt3720 = 0;
		}
		Static399.aFloat167 = local3;
		Static318.method4939();
		Static244.aBoolean263 = true;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!u;I)V")
	public static void method2164(@OriginalArg(0) Class6_Sub48 arg0) {
		if (!Static330.aBoolean415) {
			arg0.method7849();
			Static374.anInt6451--;
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(IIII)V")
	public static void method2166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static303.aByteArrayArrayArray13 = new byte[4][arg1][arg0];
	}
}
