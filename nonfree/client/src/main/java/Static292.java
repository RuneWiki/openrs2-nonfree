import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public static int anInt5932;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[16];

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	public static int anInt5928 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZ)V")
	public static void method5020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 13);
		local8.method8631();
		local8.anInt10489 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZIIIIII)V")
	public static void method5021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = Static429.method6586(arg2, Static583.anInt9761, Static246.anInt5506);
		@Pc(21) int local21 = Static429.method6586(arg3, Static583.anInt9761, Static246.anInt5506);
		@Pc(27) int local27 = Static429.method6586(arg4, Static202.anInt4720, Static472.anInt6105);
		@Pc(33) int local33 = Static429.method6586(arg6, Static202.anInt4720, Static472.anInt6105);
		@Pc(41) int local41 = Static429.method6586(arg5 + arg2, Static583.anInt9761, Static246.anInt5506);
		@Pc(50) int local50 = Static429.method6586(arg3 - arg5, Static583.anInt9761, Static246.anInt5506);
		for (@Pc(52) int local52 = local15; local52 < local41; local52++) {
			Static580.method8027(Static104.anIntArrayArray24[local52], local33, local27, arg0);
		}
		for (@Pc(68) int local68 = local21; local68 > local50; local68--) {
			Static580.method8027(Static104.anIntArrayArray24[local68], local33, local27, arg0);
		}
		@Pc(90) int local90 = Static429.method6586(arg5 + arg4, Static202.anInt4720, Static472.anInt6105);
		@Pc(99) int local99 = Static429.method6586(arg6 - arg5, Static202.anInt4720, Static472.anInt6105);
		for (@Pc(101) int local101 = local41; local101 <= local50; local101++) {
			@Pc(107) int[] local107 = Static104.anIntArrayArray24[local101];
			Static580.method8027(local107, local90, local27, arg0);
			Static580.method8027(local107, local99, local90, arg1);
			Static580.method8027(local107, local33, local99, arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	public static void method5022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub1_Sub21 local13 = Static57.method8561(arg0, 1);
		local13.method8631();
		local13.anInt10489 = arg1;
	}
}
