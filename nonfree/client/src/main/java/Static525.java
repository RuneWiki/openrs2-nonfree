import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "[I")
	public static final int[] anIntArray568 = new int[32];

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_122 = new Class218(101, 0);

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "[I")
	public static final int[] anIntArray569 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_123 = new Class218(54, 4);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ha;Lclient!gaa;B)V")
	public static void method7483(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class108 arg1) {
		@Pc(31) boolean local31 = Static367.aClass281_1.method6979(arg1.anInt4012, arg1.anInt4090, arg1.anInt4059, arg1.anInt4026 | 0xFF000000, arg1.aBoolean350 ? Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 : null, arg1.anInt4068, arg0) == null;
		if (local31) {
			Static238.aClass276_35.method6906(new Class3_Sub19(arg1.anInt4059, arg1.anInt4012, arg1.anInt4068, arg1.anInt4026 | 0xFF000000, arg1.anInt4090, arg1.aBoolean350));
			Static139.method3135(arg1);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)Z")
	public static boolean method7484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static281.method5317(arg0, arg1) || Static350.method5752(arg0, arg1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BII)Z")
	public static boolean method7485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static244.aByteArrayArrayArray10[1].length && arg0 < Static244.aByteArrayArrayArray10[1][arg1].length) {
			return (Static244.aByteArrayArrayArray10[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)I")
	public static int method7487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static244.aByteArrayArrayArray10[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static244.aByteArrayArrayArray10[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
