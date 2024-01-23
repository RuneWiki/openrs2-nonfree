import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!f;")
	public static Class53_Sub1_Sub1 aClass53_Sub1_Sub1_2;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public static void method2462() {
		if (Static47.anInt885 <= 0) {
			Static69.aClass52_1 = Static134.aClass52_7;
			Static134.aClass52_7 = null;
			Static15.method233(40);
		} else {
			Static115.method1819();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[Lclient!ma;")
	public static Class56[] method2463() {
		@Pc(8) Class56[] local8 = new Class56[Static143.anInt2748];
		for (@Pc(10) int local10 = 0; local10 < Static143.anInt2748; local10++) {
			if (Static94.aBoolean138) {
				local8[local10] = new Class56_Sub2(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local10], Static187.anIntArray391[local10], Static110.anIntArray185[local10], Static301.anIntArray643[local10], Static230.aByteArrayArray36[local10], Static58.anIntArray85);
			} else {
				local8[local10] = new Class56_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local10], Static187.anIntArray391[local10], Static110.anIntArray185[local10], Static301.anIntArray643[local10], Static230.aByteArrayArray36[local10], Static58.anIntArray85);
			}
		}
		Static304.method4707();
		return local8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[I[III)V")
	public static void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(25) int local25 = arg3;
		@Pc(31) int local31 = (arg0 + arg3) / 2;
		@Pc(35) int local35 = arg2[local31];
		arg2[local31] = arg2[arg0];
		arg2[arg0] = local35;
		@Pc(49) int local49 = arg1[local31];
		arg1[local31] = arg1[arg0];
		arg1[arg0] = local49;
		for (@Pc(61) int local61 = arg3; local61 < arg0; local61++) {
			if (arg2[local61] > (local61 & 0x1) + local35) {
				@Pc(81) int local81 = arg2[local61];
				arg2[local61] = arg2[local25];
				arg2[local25] = local81;
				@Pc(95) int local95 = arg1[local61];
				arg1[local61] = arg1[local25];
				arg1[local25++] = local95;
			}
		}
		arg2[arg0] = arg2[local25];
		arg2[local25] = local35;
		arg1[arg0] = arg1[local25];
		arg1[local25] = local49;
		method2466(local25 - 1, arg1, arg2, arg3);
		method2466(arg0, arg1, arg2, local25 + 1);
	}
}
