import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt6269 = 0;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_157 = new Class163(49, 2);

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_158 = new Class163(42, 4);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
	public static int method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static328.anIntArrayArray46 == null ? 0 : Static328.anIntArrayArray46[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[Lclient!ga;)V")
	public static void method5158(@OriginalArg(0) int arg0, @OriginalArg(2) Class82[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class82 local13 = arg1[local7];
			if (local13 != null && local13.anInt2259 == arg0 && !Static54.method1044(local13)) {
				if (local13.anInt2252 == 0) {
					method5158(local13.anInt2208, arg1);
					if (local13.aClass82Array1 != null) {
						method5158(local13.anInt2208, local13.aClass82Array1);
					}
					@Pc(51) Class3_Sub10 local51 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local13.anInt2208);
					if (local51 != null) {
						Static275.method3806(local51.anInt827);
					}
				}
				if (local13.anInt2252 == 6 && local13.anInt2227 != -1) {
					@Pc(74) Class261 local74 = Static444.aClass59_3.method1552(local13.anInt2227);
					if (local74 != null) {
						local13.anInt2267 += Static46.anInt814;
						while (local74.anIntArray493[local13.anInt2202] < local13.anInt2267) {
							local13.anInt2267 -= local74.anIntArray493[local13.anInt2202];
							local13.anInt2202++;
							if (local13.anInt2202 >= local74.anIntArray494.length) {
								local13.anInt2202 -= local74.anInt7413;
								if (local13.anInt2202 < 0 || local13.anInt2202 >= local74.anIntArray494.length) {
									local13.anInt2202 = 0;
								}
							}
							local13.anInt2219 = local13.anInt2202 + 1;
							if (local13.anInt2219 >= local74.anIntArray494.length) {
								local13.anInt2219 -= local74.anInt7413;
								if (local13.anInt2219 < 0 || local74.anIntArray494.length <= local13.anInt2219) {
									local13.anInt2219 = -1;
								}
							}
							Static463.method6297(local13);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5160(@OriginalArg(1) String arg0) {
		Static349.method4875(0, "", 0, "", arg0);
	}
}
