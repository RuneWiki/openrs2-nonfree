import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
	public static int anInt6919;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!r;IIZ)Lclient!la;")
	public static Class96 method5580(@OriginalArg(0) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(14) Class144 local14 = Static57.method964(arg1, arg2, arg0);
		return local14 == null ? null : local14.aClass96_8;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "([BIII)[B")
	public static byte[] method5581(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) byte[] local27;
		if (arg1 > 0) {
			local27 = new byte[arg2];
			for (@Pc(29) int local29 = 0; local29 < arg2; local29++) {
				local27[local29] = arg0[arg1 + local29];
			}
		} else {
			local27 = arg0;
		}
		@Pc(55) Class166 local55 = new Class166();
		local55.method3444();
		local55.method3442(local27, (long) (arg2 * 8));
		@Pc(69) byte[] local69 = new byte[64];
		local55.method3443(local69);
		return local69;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method5583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static330.anInt6025 && Static194.anInt3788 >= arg2 && arg7 >= Static330.anInt6025 && Static194.anInt3788 >= arg7 && Static330.anInt6025 <= arg6 && arg6 <= Static194.anInt3788 && Static330.anInt6025 <= arg5 && arg5 <= Static194.anInt3788 && arg1 >= Static120.anInt2491 && arg1 <= Static71.anInt1350 && arg8 >= Static120.anInt2491 && Static71.anInt1350 >= arg8 && arg4 >= Static120.anInt2491 && arg4 <= Static71.anInt1350 && arg0 >= Static120.anInt2491 && arg0 <= Static71.anInt1350) {
			Static548.method7477(arg7, arg8, arg5, arg4, arg6, arg2, arg0, arg3, arg1);
		} else {
			Static108.method1510(arg7, arg8, arg0, arg2, arg4, arg1, arg3, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5586(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static436.aCharArray10[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(80) int local80 = local54.length() - 1;
					local54.setCharAt(local80, Character.toUpperCase(local54.charAt(local80)));
					local72 = ' ';
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}
}
