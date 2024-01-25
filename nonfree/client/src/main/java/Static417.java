import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!ke;")
	public static final Class137 aClass137_35 = new Class137(16);

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
	public static int anInt6988 = 0;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString65 = "";

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIZ)I")
	public static int method5673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) Class6_Sub17 local17 = Static85.method1523(arg0, arg2);
		if (local17 == null) {
			return -1;
		} else if (arg1 >= 0 && local17.anIntArray289.length > arg1) {
			return local17.anIntArray289[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIII)V")
	public static void method5674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 + 1;
		Static73.method1404(Static347.anIntArrayArray54[arg3], arg4, arg2, arg1);
		@Pc(17) int local17 = arg0 - 1;
		Static73.method1404(Static347.anIntArrayArray54[arg0], arg4, arg2, arg1);
		for (@Pc(35) int local35 = local8; local35 <= local17; local35++) {
			@Pc(41) int[] local41 = Static347.anIntArrayArray54[local35];
			local41[arg1] = local41[arg4] = arg2;
		}
	}
}
