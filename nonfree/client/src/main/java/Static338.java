import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!qa;Lclient!er;III)V")
	public static void method4295(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class82 local12;
		if (arg3 < Static362.anInt6113) {
			local12 = Static159.aClass82ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass20_Sub2_1 != null && local12.aClass20_Sub2_1.method5110()) {
				arg1.method5116(true, Static329.anInt5395, 0, local12.aClass20_Sub2_1, arg0, 0);
			}
		}
		if (arg4 < Static362.anInt6113) {
			local12 = Static159.aClass82ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass20_Sub2_1 != null && local12.aClass20_Sub2_1.method5110()) {
				arg1.method5116(true, 0, 0, local12.aClass20_Sub2_1, arg0, Static329.anInt5395);
			}
		}
		if (arg3 < Static362.anInt6113 && arg4 < Static195.anInt3127) {
			local12 = Static159.aClass82ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass20_Sub2_1 != null && local12.aClass20_Sub2_1.method5110()) {
				arg1.method5116(true, Static329.anInt5395, 0, local12.aClass20_Sub2_1, arg0, Static329.anInt5395);
			}
		}
		if (arg3 < Static362.anInt6113 && arg4 > 0) {
			local12 = Static159.aClass82ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass20_Sub2_1 != null && local12.aClass20_Sub2_1.method5110()) {
				arg1.method5116(true, Static329.anInt5395, 0, local12.aClass20_Sub2_1, arg0, -Static329.anInt5395);
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4298(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				local47.append(Static240.aCharArray3[(int) (local51 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(FFFFFILclient!uv;IZII)[B")
	public static byte[] method4299(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) Class10 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static452.method5604(arg2, local10, arg4, arg3, arg0, arg5, 0, arg1);
		return local10;
	}
}
