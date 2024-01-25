import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public static int anInt2265 = -1;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_9 = new Class110(9, 7);

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_20 = new Class230(47, 3);

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_27 = new Class276(67, 3);

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_21 = new Class230(10, 16);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[FFIBIFIIIIIF)V")
	public static void method2075(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg0 - arg4;
		@Pc(17) int local17 = arg8 - arg10;
		@Pc(21) int local21 = arg9 - arg3;
		@Pc(42) float local42 = (float) local21 * arg1[2] + arg1[1] * (float) local17 + arg1[0] * (float) local5;
		@Pc(63) float local63 = (float) local5 * arg1[3] + arg1[4] * (float) local17 + (float) local21 * arg1[5];
		@Pc(84) float local84 = (float) local21 * arg1[8] + (float) local5 * arg1[6] + (float) local17 * arg1[7];
		@Pc(109) float local109;
		@Pc(102) float local102;
		if (arg6 == 0) {
			local102 = arg11 + 0.5F - local84;
			local109 = arg2 + local42 + 0.5F;
		} else if (arg6 == 1) {
			local102 = local84 + arg11 + 0.5F;
			local109 = local42 + arg2 + 0.5F;
		} else if (arg6 == 2) {
			local102 = arg5 + 0.5F - local63;
			local109 = arg2 + 0.5F - local42;
		} else if (arg6 == 3) {
			local102 = arg5 + 0.5F - local63;
			local109 = arg2 + local42 + 0.5F;
		} else if (arg6 == 4) {
			local109 = arg11 + local84 + 0.5F;
			local102 = arg5 + 0.5F - local63;
		} else {
			local109 = arg11 + 0.5F - local84;
			local102 = arg5 + 0.5F - local63;
		}
		@Pc(207) float local207;
		if (arg7 == 1) {
			local207 = local109;
			local109 = -local102;
			local102 = local207;
		} else if (arg7 == 2) {
			local109 = -local109;
			local102 = -local102;
		} else if (arg7 == 3) {
			local207 = local109;
			local109 = local102;
			local102 = -local207;
		}
		Static455.aFloat177 = local102;
		Static404.aFloat171 = local109;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I")
	public static int method2077() {
		return Static476.anInt8920++;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!fd;I)V")
	public static void method2079(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(6) byte[] local6 = new byte[24];
		if (Static574.aClass9_4 != null) {
			@Pc(26) int local26;
			try {
				Static574.aClass9_4.method371(0L);
				Static574.aClass9_4.method373(local6);
				for (local26 = 0; local26 < 24 && local6[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local26 = 0; local26 < 24; local26++) {
					local6[local26] = -1;
				}
			}
		}
		arg0.method6500(24, local6);
	}
}
