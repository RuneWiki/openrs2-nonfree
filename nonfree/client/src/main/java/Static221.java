import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "[I")
	public static final int[] anIntArray414 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3315(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static310.method4308(Static180.aClass27_63);
		Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(arg1) + 1);
		Static337.aClass10_Sub8_Sub2_2.method2518(arg0);
		Static337.aClass10_Sub8_Sub2_2.method2465(arg1);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIB)V")
	public static void method3316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 > Static160.anInt3220 || Static319.anInt5496 > arg2) {
			return;
		}
		@Pc(24) boolean local24;
		if (Static115.anInt2362 > arg4) {
			arg4 = Static115.anInt2362;
			local24 = false;
		} else if (arg4 > Static146.anInt3034) {
			local24 = false;
			arg4 = Static146.anInt3034;
		} else {
			local24 = true;
		}
		@Pc(44) boolean local44;
		if (arg1 < Static115.anInt2362) {
			local44 = false;
			arg1 = Static115.anInt2362;
		} else if (arg1 <= Static146.anInt3034) {
			local44 = true;
		} else {
			local44 = false;
			arg1 = Static146.anInt3034;
		}
		if (Static319.anInt5496 > arg3) {
			arg3 = Static319.anInt5496;
		} else {
			Static212.method3267(arg4, arg1, arg0, Class10_Sub10_Sub1.lb[arg3++]);
		}
		if (arg2 > Static160.anInt3220) {
			arg2 = Static160.anInt3220;
		} else {
			Static212.method3267(arg4, arg1, arg0, Class10_Sub10_Sub1.lb[arg2--]);
		}
		@Pc(98) int local98;
		if (local24 && local44) {
			for (local98 = arg3; local98 <= arg2; local98++) {
				@Pc(104) int[] local104 = Class10_Sub10_Sub1.lb[local98];
				local104[arg4] = local104[arg1] = arg0;
			}
		} else if (local24) {
			for (local98 = arg3; local98 <= arg2; local98++) {
				Class10_Sub10_Sub1.lb[local98][arg4] = arg0;
			}
		} else if (local44) {
			for (local98 = arg3; local98 <= arg2; local98++) {
				Class10_Sub10_Sub1.lb[local98][arg1] = arg0;
			}
		}
	}
}
