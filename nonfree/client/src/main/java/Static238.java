import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public static int anInt4072;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Z")
	public static boolean aBoolean267;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "[I")
	public static final int[] anIntArray367 = new int[4096];

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public static int anInt4073 = -1;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public static int anInt4074 = 0;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
	public static final int[] anIntArray368 = new int[14];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method3715() {
		for (@Pc(15) Class6_Sub1_Sub9 local15 = (Class6_Sub1_Sub9) Static439.aClass88_46.method1882(); local15 != null; local15 = (Class6_Sub1_Sub9) Static439.aClass88_46.method1891()) {
			@Pc(20) Class3_Sub3_Sub4 local20 = local15.aClass3_Sub3_Sub4_1;
			if (Static4.anInt30 != local20.aByte93 || local20.anInt4319 < Static125.anInt2225) {
				local15.method5977();
				local20.method3907();
			} else if (Static125.anInt2225 >= local20.anInt4334) {
				if (local20.anInt4317 > 0) {
					@Pc(42) Class3_Sub3_Sub6_Sub2 local42 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local20.anInt4317 - 1];
					if (local42 != null && local42.anInt6675 >= 0 && Static84.anInt1632 * 128 > local42.anInt6675 && local42.anInt6677 >= 0 && Static261.anInt4480 * 128 > local42.anInt6677) {
						local20.method3908(Static125.anInt2225, Static165.method2689(local42.anInt6675, local20.aByte93, local42.anInt6677) - local20.anInt4314, local42.anInt6677, local42.anInt6675);
					}
				}
				if (local20.anInt4317 < 0) {
					@Pc(100) int local100 = -local20.anInt4317 - 1;
					@Pc(109) Class3_Sub3_Sub6_Sub1 local109;
					if (local100 == Static251.anInt4268) {
						local109 = Static134.aClass3_Sub3_Sub6_Sub1_1;
					} else {
						local109 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local100];
					}
					if (local109 != null && local109.anInt6675 >= 0 && local109.anInt6675 < Static84.anInt1632 * 128 && local109.anInt6677 >= 0 && Static261.anInt4480 * 128 > local109.anInt6677) {
						local20.method3908(Static125.anInt2225, Static165.method2689(local109.anInt6675, local20.aByte93, local109.anInt6677) - local20.anInt4314, local109.anInt6677, local109.anInt6675);
					}
				}
				local20.method3911(Static338.anInt5679);
				Static9.method128(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLclient!hf;ILjava/awt/Canvas;Lclient!vl;)Lclient!qq;")
	public static Class28 method3716(@OriginalArg(0) int arg0, @OriginalArg(2) Class103 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Interface11 arg4) {
		return new Class28_Sub1(arg2, arg3, arg4, arg0, arg1);
	}
}
