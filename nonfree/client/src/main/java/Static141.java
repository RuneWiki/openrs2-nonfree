import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "[Lclient!qp;")
	public static final Class283[] aClass283Array33 = new Class283[35];

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt10589 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
	public static byte[] method8245(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static132.method2400(local13) : local13;
		} else if (arg0 instanceof Class247) {
			@Pc(27) Class247 local27 = (Class247) arg0;
			return local27.method5872();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static void method8247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class182 local28 = Static571.aClass182ArrayArrayArray3[local9][arg0][arg1] = Static571.aClass182ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class192 local33 = local28.aClass192_2; local33 != null; local33 = local33.aClass192_3) {
					@Pc(37) Class21_Sub1_Sub1 local37 = local33.aClass21_Sub1_Sub1_1;
					if (local37.aShort119 == arg0 && local37.aShort121 == arg1) {
						local37.aByte127--;
					}
				}
				if (local28.aClass21_Sub1_Sub5_1 != null) {
					local28.aClass21_Sub1_Sub5_1.aByte127--;
				}
				if (local28.aClass21_Sub1_Sub2_1 != null) {
					local28.aClass21_Sub1_Sub2_1.aByte127--;
				}
				if (local28.aClass21_Sub1_Sub2_2 != null) {
					local28.aClass21_Sub1_Sub2_2.aByte127--;
				}
				if (local28.aClass21_Sub1_Sub3_2 != null) {
					local28.aClass21_Sub1_Sub3_2.aByte127--;
				}
				if (local28.aClass21_Sub1_Sub3_1 != null) {
					local28.aClass21_Sub1_Sub3_1.aByte127--;
				}
			}
		}
		if (Static571.aClass182ArrayArrayArray3[0][arg0][arg1] == null) {
			Static571.aClass182ArrayArrayArray3[0][arg0][arg1] = new Class182(0);
			Static571.aClass182ArrayArrayArray3[0][arg0][arg1].aByte93 = 1;
		}
		Static571.aClass182ArrayArrayArray3[0][arg0][arg1].aClass182_1 = local7;
		Static571.aClass182ArrayArrayArray3[3][arg0][arg1] = null;
	}
}
