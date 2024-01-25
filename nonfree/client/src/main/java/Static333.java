import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString63;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public static int anInt6366 = 0;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
	public static final int[] anIntArray494 = new int[250];

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "J")
	public static long aLong210 = 0L;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	public static int anInt6382 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLclient!hl;)V")
	public static void method5389(@OriginalArg(1) Class8_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt4958 - Static199.anInt4137;
		@Pc(20) int local20 = arg0.anInt4912 * 128 + arg0.method4349() * 64;
		@Pc(38) int local38 = arg0.anInt4974 * 128 + arg0.method4349() * 64;
		arg0.anInt6702 += (local38 - arg0.anInt6702) / local9;
		arg0.anInt4990 = 0;
		arg0.anInt6701 += (local20 - arg0.anInt6701) / local9;
		if (arg0.anInt4962 == 0) {
			arg0.method4331(8192);
		}
		if (arg0.anInt4962 == 1) {
			arg0.method4331(12288);
		}
		if (arg0.anInt4962 == 2) {
			arg0.method4331(0);
		}
		if (arg0.anInt4962 == 3) {
			arg0.method4331(4096);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method5390() {
		Static189.aClass198_142.method5213();
	}
}
