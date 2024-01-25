import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public static int anInt6385 = 0;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "[I")
	public static final int[] anIntArray409 = new int[1];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(FIFF)I")
	public static int method5348(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(29) float local29 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(38) float local38 = arg1 < 0.0F ? -arg1 : arg1;
		if (local29 > local12 && local38 < local29) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local12 < local38 && local38 > local29) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ho;I)V")
	public static void method5349(@OriginalArg(0) Class2_Sub21 arg0) {
		if (Static469.aClass228ArrayArrayArray6 == null) {
			return;
		}
		@Pc(8) Interface14 local8 = null;
		if (arg0.anInt3035 == 0) {
			local8 = (Interface14) Static389.method5373(arg0.anInt3031, arg0.anInt3036, arg0.anInt3030);
		}
		if (arg0.anInt3035 == 1) {
			local8 = (Interface14) Static552.method7232(arg0.anInt3031, arg0.anInt3036, arg0.anInt3030);
		}
		if (arg0.anInt3035 == 2) {
			local8 = (Interface14) Static32.method551(arg0.anInt3031, arg0.anInt3036, arg0.anInt3030, je.class);
		}
		if (arg0.anInt3035 == 3) {
			local8 = (Interface14) Static347.method5019(arg0.anInt3031, arg0.anInt3036, arg0.anInt3030);
		}
		if (local8 == null) {
			arg0.anInt3023 = 0;
			arg0.anInt3032 = -1;
			arg0.anInt3034 = 0;
		} else {
			arg0.anInt3032 = local8.method7094();
			arg0.anInt3023 = local8.method7091();
			arg0.anInt3034 = local8.method7093();
		}
	}
}
