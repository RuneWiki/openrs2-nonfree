import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!vk", name = "I", descriptor = "Lclient!cg;")
	public static Class22 aClass22_102;

	@OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
	public static int anInt5674;

	@OriginalMember(owner = "client!vk", name = "N", descriptor = "Lclient!cg;")
	public static Class22 aClass22_103;

	@OriginalMember(owner = "client!vk", name = "T", descriptor = "Lclient!co;")
	public static Class4_Sub6_Sub2 aClass4_Sub6_Sub2_3;

	@OriginalMember(owner = "client!vk", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString189 = "red:";

	@OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
	public static int anInt5677 = 0;

	@OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
	public static int anInt5678 = -1;

	@OriginalMember(owner = "client!vk", name = "R", descriptor = "[F")
	public static float[] aFloatArray28 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V")
	public static void method4552(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg1) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) long local29 = arg0[local23];
		arg0[local23] = arg0[arg1];
		arg0[arg1] = local29;
		@Pc(43) Object local43 = arg3[local23];
		arg3[local23] = arg3[arg1];
		arg3[arg1] = local43;
		for (@Pc(55) int local55 = arg2; local55 < arg1; local55++) {
			if (arg0[local55] < (long) (local55 & 0x1) + local29) {
				@Pc(78) long local78 = arg0[local55];
				arg0[local55] = arg0[local25];
				arg0[local25] = local78;
				@Pc(92) Object local92 = arg3[local55];
				arg3[local55] = arg3[local25];
				arg3[local25++] = local92;
			}
		}
		arg0[arg1] = arg0[local25];
		arg0[local25] = local29;
		arg3[arg1] = arg3[local25];
		arg3[local25] = local43;
		method4552(arg0, local25 - 1, arg2, arg3);
		method4552(arg0, arg1, local25 + 1, arg3);
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(III)I")
	public static int method4554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub33 local10 = (Class4_Sub33) Static49.aClass163_15.method4188((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && local10.anIntArray463.length > arg1) {
			return local10.anIntArray463[arg1];
		} else {
			return -1;
		}
	}
}
