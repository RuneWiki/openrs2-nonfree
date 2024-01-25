import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!bq;")
	public static Class26 aClass26_3;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	public static int anInt5576;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array19;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "[I")
	public static final int[] anIntArray442 = new int[14];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	public static void method4668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class200 local12 = Static160.method2551(arg1);
		@Pc(15) int local15 = local12.anInt6198;
		@Pc(18) int local18 = local12.anInt6197;
		@Pc(21) int local21 = local12.anInt6200;
		@Pc(28) int local28 = Class20.anIntArray22[local21 - local18];
		if (arg0 < 0 || local28 < arg0) {
			arg0 = 0;
		}
		local28 <<= local18;
		Static16.method390(Static38.anIntArray55[local15] & ~local28 | arg0 << local18 & local28, local15);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method4670() {
		for (@Pc(10) Class3_Sub42 local10 = (Class3_Sub42) Static83.aClass127_3.method3402(); local10 != null; local10 = (Class3_Sub42) Static83.aClass127_3.method3400()) {
			if (local10.anInt6536 == -1) {
				local10.anInt6545 = 0;
				Static164.method5310(local10);
			} else {
				local10.method5717();
			}
		}
	}
}
