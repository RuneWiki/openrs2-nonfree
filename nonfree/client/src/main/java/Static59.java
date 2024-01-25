import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!ps;Lclient!r;)V")
	public static void method1015(@OriginalArg(1) Class273 arg0, @OriginalArg(2) Class162 arg1) {
		@Pc(31) boolean local31 = Static466.aClass130_2.method2314(arg0.anInt6805, arg0.aBoolean547 ? Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1 : null, arg1, arg0.anInt6813, arg0.anInt6867 | 0xFF000000, arg0.anInt6830, arg0.anInt6824) == null;
		if (local31) {
			Static78.aClass70_4.method1269(new Class2_Sub1(arg0.anInt6805, arg0.anInt6830, arg0.anInt6824, arg0.anInt6867 | 0xFF000000, arg0.anInt6813, arg0.aBoolean547));
			Static155.method2111(arg0);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1016(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 3);
		local8.method6227();
		local8.aString118 = arg1;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V")
	public static void method1017() {
		if (Static388.anIntArray410 != null && Static135.anIntArray552 != null) {
			return;
		}
		Static388.anIntArray410 = new int[256];
		Static135.anIntArray552 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static388.anIntArray410[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static135.anIntArray552[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIBII)V")
	public static void method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static275.anInt4756 && arg2 <= Static48.anInt898) {
			@Pc(19) int local19 = Static290.method4092(Static89.anInt1576, arg3, Static130.anInt2131);
			@Pc(25) int local25 = Static290.method4092(Static89.anInt1576, arg1, Static130.anInt2131);
			Static22.method326(local25, local19, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg3 + 1;
		Static437.method5735(arg4, Static238.anIntArrayArray36[arg3], arg1, arg0);
		@Pc(18) int local18 = arg2 - 1;
		Static437.method5735(arg4, Static238.anIntArrayArray36[arg2], arg1, arg0);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(31) int[] local31 = Static238.anIntArrayArray36[local25];
			local31[arg4] = local31[arg1] = arg0;
		}
	}
}
