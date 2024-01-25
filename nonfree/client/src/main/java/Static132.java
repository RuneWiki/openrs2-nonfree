import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	public static int anInt2386;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "Lclient!vu;")
	public static Class260 aClass260_2;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "[S")
	public static final short[] aShortArray5 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLclient!dc;)V")
	public static void method1981(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4917 == Static266.anInt4392 || arg0.anInt4903 == -1 || arg0.anInt4954 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class128 local30 = Static334.aClass62_2.method1418(arg0.anInt4903);
			if (local30.aBoolean201 || arg0.lb + 1 > local30.anIntArray276[arg0.anInt4929]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(58) int local58 = arg0.anInt4917 - arg0.anInt4898;
			@Pc(64) int local64 = Static266.anInt4392 - arg0.anInt4898;
			@Pc(75) int local75 = arg0.anInt4907 * 128 + arg0.method4009() * 64;
			@Pc(87) int local87 = arg0.anInt4920 * 128 + arg0.method4009() * 64;
			@Pc(98) int local98 = arg0.anInt4919 * 128 + arg0.method4009() * 64;
			@Pc(110) int local110 = arg0.anInt4949 * 128 + arg0.method4009() * 64;
			arg0.anInt6833 = (local64 * local98 + local75 * (local58 - local64)) / local58;
			arg0.anInt6835 = (local64 * local110 + (local58 - local64) * local87) / local58;
		}
		arg0.anInt4978 = 0;
		if (arg0.anInt4926 == 0) {
			arg0.method3999(false, 8192);
		}
		if (arg0.anInt4926 == 1) {
			arg0.method3999(false, 12288);
		}
		if (arg0.anInt4926 == 2) {
			arg0.method3999(false, 0);
		}
		if (arg0.anInt4926 == 3) {
			arg0.method3999(false, 4096);
		}
	}
}
