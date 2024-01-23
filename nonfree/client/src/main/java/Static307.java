import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
	public static int[] anIntArray577 = new int[14];

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public static int anInt5933 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method4641(@OriginalArg(0) Class15_Sub2 arg0) {
		@Pc(14) int local14 = arg0.anInt5335 - Static268.anInt5236;
		@Pc(25) int local25 = arg0.anInt5346 * 128 + arg0.method4286() * 64;
		@Pc(37) int local37 = arg0.anInt5350 * 128 + arg0.method4286() * 64;
		if (arg0.anInt5320 == 0) {
			arg0.anInt5313 = 1024;
		}
		if (arg0.anInt5320 == 1) {
			arg0.anInt5313 = 1536;
		}
		if (arg0.anInt5320 == 2) {
			arg0.anInt5313 = 0;
		}
		arg0.anInt5296 = 0;
		arg0.anInt5358 += (local25 - arg0.anInt5358) / local14;
		if (arg0.anInt5320 == 3) {
			arg0.anInt5313 = 512;
		}
		arg0.anInt5371 += (local37 - arg0.anInt5371) / local14;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII)V")
	public static void method4643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class150 local3 = new Class150();
		local3.anInt4799 = arg1 / 128;
		local3.anInt4813 = arg2 / 128;
		local3.anInt4805 = arg3 / 128;
		local3.anInt4821 = arg4 / 128;
		local3.anInt4802 = arg0;
		local3.anInt4814 = arg1;
		local3.anInt4806 = arg2;
		local3.anInt4810 = arg3;
		local3.anInt4817 = arg4;
		local3.anInt4811 = arg5;
		local3.anInt4819 = arg6;
		Static254.aClass150Array2[Static166.anInt3672++] = local3;
	}
}
