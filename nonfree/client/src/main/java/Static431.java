import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
	public static int anInt7666;

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "F")
	public static float aFloat131 = 0.0F;

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "[I")
	public static final int[] anIntArray554 = new int[2];

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_179 = new Class200(0, 6);

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_180 = new Class200(26, 6);

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_138 = new Class145(41, -1);

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_139 = new Class145(40, 2);

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
	public static int anInt7668 = 0;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZB)Z")
	public static boolean method6717(@OriginalArg(0) boolean arg0) {
		@Pc(14) boolean local14 = Static141.aClass13_27.method8093();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static141.aClass13_27.method8108();
		} else if (!Static141.aClass13_27.method8116()) {
			arg0 = false;
		}
		if (arg0 == local14) {
			return false;
		} else {
			Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub26_1, arg0 ? 1 : 0);
			Static531.method7366();
			return true;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIII)I")
	public static int method6721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static60.anInt1449 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg2 - Static371.anInt9384;
		@Pc(23) int local23 = arg0 - Static371.anInt9385;
		for (@Pc(28) Class2_Sub13 local28 = (Class2_Sub13) Static371.aClass114_54.method2772(); local28 != null; local28 = (Class2_Sub13) Static371.aClass114_54.method2762()) {
			if (arg1 == local28.anInt2179) {
				@Pc(36) int local36 = local28.anInt2183;
				@Pc(39) int local39 = local28.anInt2178;
				@Pc(49) int local49 = Static371.anInt9385 + local39 | Static371.anInt9384 + local36 << 14;
				@Pc(69) int local69 = (local23 - local39) * (-local39 + local23) + (local19 - local36) * (-local36 + local19);
				if (local12 < 0 || local14 > local69) {
					local14 = local69;
					local12 = local49;
				}
			}
		}
		return local12;
	}
}
