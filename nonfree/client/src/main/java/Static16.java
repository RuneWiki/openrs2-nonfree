import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	public static int anInt398;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lclient!bg;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "[I")
	public static final int[] anIntArray79 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
	public static int anInt400 = 127;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
	public static int anInt401 = 16777215;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	public static void method488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(17) int local17 = -arg2;
		@Pc(19) int local19 = -1;
		Static264.method4096(Static267.anIntArrayArray38[arg3], arg1, arg2 + arg0, arg0 + -arg2);
		while (local12 < local14) {
			local19 += 2;
			local12++;
			local17 += local19;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(55) int[] local55 = Static267.anIntArrayArray38[arg3 + local14];
				@Pc(61) int[] local61 = Static267.anIntArrayArray38[arg3 - local14];
				@Pc(66) int local66 = arg0 + local12;
				@Pc(71) int local71 = arg0 - local12;
				Static264.method4096(local55, arg1, local66, local71);
				Static264.method4096(local61, arg1, local66, local71);
			}
			@Pc(88) int local88 = arg0 + local14;
			@Pc(93) int local93 = arg0 - local14;
			@Pc(99) int[] local99 = Static267.anIntArrayArray38[arg3 + local12];
			@Pc(105) int[] local105 = Static267.anIntArrayArray38[arg3 - local12];
			Static264.method4096(local99, arg1, local88, local93);
			Static264.method4096(local105, arg1, local88, local93);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
	public static void method490(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}
}
