import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hka", name = "v", descriptor = "I")
	public static int anInt4271 = 0;

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(FIZFIIILclient!gv;F[BFIFI)V")
	public static void method3899(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(7) Class126 arg2, @OriginalArg(8) float arg3, @OriginalArg(9) byte[] arg4, @OriginalArg(10) float arg5, @OriginalArg(11) int arg6, @OriginalArg(12) float arg7, @OriginalArg(13) int arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(39) int local39;
		@Pc(57) int local57;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			arg2.method7898(arg0 / (float) 128, arg3 / (float) 16, arg6, 0, arg1 / (float) 128, arg7 * 127.0F, local10);
			local39 = arg8;
			arg0 *= 2.0F;
			arg1 *= 2.0F;
			arg7 *= arg5;
			arg3 *= 2.0F;
			for (local57 = 0; local57 < 16384; local57++) {
				arg4[local39] = (byte) (int) ((float) arg4[local39] + local10[local57]);
				local39++;
			}
		}
		local39 = arg8;
		for (local57 = 0; local57 < 16384; local57++) {
			arg4[local39] = (byte) (arg4[local39] + 127);
			local39++;
		}
	}

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "(III)Lclient!kp;")
	public static Class28_Sub1_Sub4 method3901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method3902() {
		if (Static43.aBoolean74 || Static150.aClass3_Sub11_Sub14_2 == null) {
			return "";
		} else if ((Static150.aClass3_Sub11_Sub14_2.aString67 == null || Static150.aClass3_Sub11_Sub14_2.aString67.length() == 0) && Static150.aClass3_Sub11_Sub14_2.aString66 != null && Static150.aClass3_Sub11_Sub14_2.aString66.length() > 0) {
			return Static150.aClass3_Sub11_Sub14_2.aString66;
		} else {
			return Static150.aClass3_Sub11_Sub14_2.aString67;
		}
	}
}
