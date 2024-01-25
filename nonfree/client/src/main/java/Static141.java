import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "Lclient!ep;")
	public static Class93 aClass93_9;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
	public static void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub3 local13 = local7.aClass11_Sub3_2;
		@Pc(16) Class11_Sub3 local16 = local7.aClass11_Sub3_1;
		if (local13 != null) {
			local13.anInt8628 = local13.anInt8628 * arg3 / (0x10 << Static494.anInt8859 - 7);
			local13.anInt8627 = local13.anInt8627 * arg3 / (0x10 << Static494.anInt8859 - 7);
		}
		if (local16 != null) {
			local16.anInt8628 = local16.anInt8628 * arg3 / (0x10 << Static494.anInt8859 - 7);
			local16.anInt8627 = local16.anInt8627 * arg3 / (0x10 << Static494.anInt8859 - 7);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([S[Ljava/lang/String;B)V")
	public static void method2651(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static3.method5142(arg1.length - 1, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2654(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				local49.append(Static267.aCharArray4[(int) (local60 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}
}
