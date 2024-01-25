import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!st", name = "R", descriptor = "[I")
	public static int[] anIntArray587;

	@OriginalMember(owner = "client!st", name = "S", descriptor = "I")
	public static int anInt9112;

	@OriginalMember(owner = "client!st", name = "T", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!st", name = "P", descriptor = "Z")
	public static boolean aBoolean757 = true;

	@OriginalMember(owner = "client!st", name = "Q", descriptor = "[I")
	public static final int[] anIntArray586 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!oa;Lclient!cq;III)V")
	public static void method7449(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class125 local12;
		if (arg3 < Static223.anInt4520) {
			local12 = Static580.aClass125ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass2_Sub1_1 != null && local12.aClass2_Sub1_1.method8388()) {
				arg1.method8387(0, 0, arg0, Static480.anInt8971, local12.aClass2_Sub1_1, true);
			}
		}
		if (arg4 < Static223.anInt4520) {
			local12 = Static580.aClass125ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass2_Sub1_1 != null && local12.aClass2_Sub1_1.method8388()) {
				arg1.method8387(Static480.anInt8971, 0, arg0, 0, local12.aClass2_Sub1_1, true);
			}
		}
		if (arg3 < Static223.anInt4520 && arg4 < Static416.anInt10065) {
			local12 = Static580.aClass125ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass2_Sub1_1 != null && local12.aClass2_Sub1_1.method8388()) {
				arg1.method8387(Static480.anInt8971, 0, arg0, Static480.anInt8971, local12.aClass2_Sub1_1, true);
			}
		}
		if (arg3 < Static223.anInt4520 && arg4 > 0) {
			local12 = Static580.aClass125ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass2_Sub1_1 != null && local12.aClass2_Sub1_1.method8388()) {
				arg1.method8387(-Static480.anInt8971, 0, arg0, Static480.anInt8971, local12.aClass2_Sub1_1, true);
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)V")
	public static void method7452(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub6 local13 = Static367.method6025(3, arg0);
		local13.method1896();
	}
}
