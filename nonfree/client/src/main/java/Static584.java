import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!sea;")
	public static Class308 aClass308_194;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
	public static int anInt9623 = 0;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "[I")
	public static int[] anIntArray615 = new int[2];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBLclient!gj;IIFII[BFFFFI)V")
	public static void method7818(@OriginalArg(2) Class119 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) float arg2, @OriginalArg(6) int arg3, @OriginalArg(8) byte[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(56) int local56;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg0.method6221(arg7 * 127.0F, local12, arg2 / (float) 128, arg6 / (float) 16, arg3, 0, arg5 / (float) 128);
			local42 = arg1;
			arg6 *= 2.0F;
			arg5 *= 2.0F;
			arg2 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg4[local42] = (byte) ((float) arg4[local42] + local12[local56]);
				local42++;
			}
			arg7 *= arg8;
		}
		local42 = arg1;
		for (local56 = 0; local56 < 16384; local56++) {
			arg4[local42] = (byte) (arg4[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method7819(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static392.method5632(arg0, arg1, -1, -1);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)V")
	public static void method7821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static501.anInt8748) {
			Static95.anIntArray77 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static95.anIntArray77[local13] = (local13 << 12) / arg0;
			}
			Static258.anInt4723 = arg0 * 32;
			Static326.anInt4973 = arg0 - 1;
			Static501.anInt8748 = arg0;
		}
		if (arg1 == Static8.anInt5990) {
			return;
		}
		if (Static501.anInt8748 == arg1) {
			Static583.anIntArray614 = Static95.anIntArray77;
		} else {
			Static583.anIntArray614 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static583.anIntArray614[local13] = (local13 << 12) / arg1;
			}
		}
		Static98.anInt1743 = arg1 - 1;
		Static8.anInt5990 = arg1;
	}
}
