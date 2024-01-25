import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array24;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!in;")
	public static final Class169 aClass169_121 = new Class169(97, 4);

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[2];

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "Lclient!in;")
	public static final Class169 aClass169_122 = new Class169(26, 6);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZZIIIII)V")
	public static void method4411(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 <= arg5) {
			return;
		}
		@Pc(15) int local15 = (arg5 + arg3) / 2;
		@Pc(17) int local17 = arg5;
		@Pc(21) Class234_Sub1 local21 = Static604.aClass234_Sub1Array2[local15];
		Static604.aClass234_Sub1Array2[local15] = Static604.aClass234_Sub1Array2[arg3];
		Static604.aClass234_Sub1Array2[arg3] = local21;
		for (@Pc(33) int local33 = arg5; local33 < arg3; local33++) {
			if (Static605.method9058(Static604.aClass234_Sub1Array2[local33], arg2, arg0, arg4, local21, arg1) <= 0) {
				@Pc(53) Class234_Sub1 local53 = Static604.aClass234_Sub1Array2[local33];
				Static604.aClass234_Sub1Array2[local33] = Static604.aClass234_Sub1Array2[local17];
				Static604.aClass234_Sub1Array2[local17++] = local53;
			}
		}
		Static604.aClass234_Sub1Array2[arg3] = Static604.aClass234_Sub1Array2[local17];
		Static604.aClass234_Sub1Array2[local17] = local21;
		method4411(arg0, arg1, arg2, local17 - 1, arg4, arg5);
		method4411(arg0, arg1, arg2, arg3, arg4, local17 + 1);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
	public static int method4412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static141.aShortArrayArray7 == null ? 0 : Static141.aShortArrayArray7[arg0][arg1] & 0xFFFF;
	}
}
