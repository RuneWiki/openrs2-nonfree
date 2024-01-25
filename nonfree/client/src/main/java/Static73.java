import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Lclient!f;")
	public static Class78 aClass78_7;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "[I")
	public static final int[] anIntArray64 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_3 = new Class60(14, 18);

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_86 = new Class12(78, 12);

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public static int anInt1378 = 503;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
	public static int anInt1379 = 2;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIBII)I")
	public static int method1098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg3 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(19) int local19 = arg0;
			arg0 = arg2;
			arg2 = local19;
		}
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg5;
		} else if (local12 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return 7 + 1 - arg5 - arg2;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)I")
	public static int method1099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!ee;BFIIFIFI[BIFF)V")
	public static void method1100(@OriginalArg(1) Class68 arg0, @OriginalArg(3) float arg1, @OriginalArg(5) int arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) byte[] arg5, @OriginalArg(11) int arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(56) int local56;
		@Pc(74) int local74;
		for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
			arg0.method4376(local12, arg4 * 127.0F, 0, arg2, arg8 / (float) 128, arg7 / (float) 16, arg1 / (float) 128);
			local56 = arg6;
			arg8 *= 2.0F;
			arg4 *= arg3;
			arg1 *= 2.0F;
			arg7 *= 2.0F;
			for (local74 = 0; local74 < 16384; local74++) {
				arg5[local56] = (byte) ((float) arg5[local56] + local12[local74]);
				local56++;
			}
		}
		local56 = arg6;
		for (local74 = 0; local74 < 16384; local74++) {
			arg5[local56] = (byte) (arg5[local56] + 127);
			local56++;
		}
	}
}
