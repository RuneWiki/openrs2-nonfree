import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!ps", name = "H", descriptor = "Lclient!om;")
	public static Class246 aClass246_259;

	@OriginalMember(owner = "client!ps", name = "G", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_13 = new Class260(2, 2);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIIIII)V")
	public static void method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(15) Class122[] local15 = Static443.aClass122Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class122 local23 = local15[local17];
			if (local23 != null && local23.anInt3557 == 2) {
				Static591.method7780(local23.anInt3555, local23.anInt3553, arg2 >> 1, local23.anInt3552, arg0 >> 1, local23.anInt3551 * 2);
				if (Static449.anIntArray577[0] > -1 && Static305.anInt5560 % 20 < 10) {
					Static56.aClass46Array2[local23.anInt3547].method7606(Static449.anIntArray577[0] + arg3 - 12, Static449.anIntArray577[1] + arg1 - 28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!lk;)Lclient!lk;")
	public static Class203 method7487(@OriginalArg(1) Class203 arg0) {
		if (arg0.anInt5518 != -1) {
			return Static414.method5954(arg0.anInt5518);
		}
		@Pc(26) int local26 = arg0.anInt5531 >>> 16;
		@Pc(31) Class262 local31 = new Class262(Static227.aClass310_15);
		for (@Pc(36) Class3_Sub28 local36 = (Class3_Sub28) local31.method5904(); local36 != null; local36 = (Class3_Sub28) local31.method5905()) {
			if (local36.anInt5333 == local26) {
				return Static414.method5954((int) local36.aLong273);
			}
		}
		return null;
	}
}
