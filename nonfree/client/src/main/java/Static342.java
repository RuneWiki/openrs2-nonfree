import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	public static int anInt6304 = 0;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_41 = new Class238();

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "[I")
	public static final int[] anIntArray539 = new int[1000];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public static void method5478() {
		Static120.aClass41_29.method825();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "()V")
	public static void method5479() {
		for (@Pc(1) int local1 = 0; local1 < Static94.anInt2018; local1++) {
			@Pc(6) Class1_Sub2 local6 = Static313.aClass1_Sub2Array3[local1];
			Static256.method4420(local6);
			Static313.aClass1_Sub2Array3[local1] = null;
		}
		Static94.anInt2018 = 0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)V")
	public static void method5480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg0 <= arg2) {
			for (local10 = arg0; local10 < arg2; local10++) {
				Static152.anIntArrayArray30[local10][arg1] = arg3;
			}
		} else {
			for (local10 = arg2; local10 < arg0; local10++) {
				Static152.anIntArrayArray30[local10][arg1] = arg3;
			}
		}
	}
}
