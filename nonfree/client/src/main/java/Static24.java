import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!as", name = "j", descriptor = "Lclient!tf;")
	public static Class322 aClass322_5;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "I")
	public static int anInt485;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Lclient!bs;")
	public static final Class40 aClass40_2 = new Class40();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!tf;ILclient!tf;)V")
	public static void method429(@OriginalArg(1) Class322 arg0, @OriginalArg(3) Class322 arg1) {
		Static203.aClass322_96 = arg1;
		Static140.aClass322_56 = arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIII)V")
	public static void method431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static561.anInt2703 < arg0 || Static395.anInt6904 > arg2) {
			return;
		}
		@Pc(23) boolean local23;
		if (arg4 < Static469.anInt4270) {
			local23 = false;
			arg4 = Static469.anInt4270;
		} else if (Static325.anInt5516 >= arg4) {
			local23 = true;
		} else {
			local23 = false;
			arg4 = Static325.anInt5516;
		}
		@Pc(40) boolean local40;
		if (arg1 < Static469.anInt4270) {
			local40 = false;
			arg1 = Static469.anInt4270;
		} else if (arg1 > Static325.anInt5516) {
			arg1 = Static325.anInt5516;
			local40 = false;
		} else {
			local40 = true;
		}
		if (arg0 >= Static395.anInt6904) {
			Static583.method7816(Static158.anIntArrayArray66[arg0++], arg3, arg4, arg1);
		} else {
			arg0 = Static395.anInt6904;
		}
		if (Static561.anInt2703 >= arg2) {
			Static583.method7816(Static158.anIntArrayArray66[arg2--], arg3, arg4, arg1);
		} else {
			arg2 = Static561.anInt2703;
		}
		@Pc(103) int local103;
		if (local23 && local40) {
			for (local103 = arg0; local103 <= arg2; local103++) {
				@Pc(147) int[] local147 = Static158.anIntArrayArray66[local103];
				local147[arg4] = local147[arg1] = arg3;
			}
		} else if (local23) {
			for (local103 = arg0; local103 <= arg2; local103++) {
				Static158.anIntArrayArray66[local103][arg4] = arg3;
			}
		} else if (local40) {
			for (local103 = arg0; local103 <= arg2; local103++) {
				Static158.anIntArrayArray66[local103][arg1] = arg3;
			}
		}
	}
}
