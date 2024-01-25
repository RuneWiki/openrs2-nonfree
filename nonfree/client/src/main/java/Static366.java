import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "[[Lclient!hd;")
	public static Class130[][] aClass130ArrayArray1;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString75 = "";

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	public static void method5382() {
		Static524.aClass5_4 = null;
		Static440.aClass5_34 = null;
		Static524.aClass5_3 = null;
		Static519.aClass5Array19 = null;
		Static582.aClass5_38 = null;
		Static483.aClass5_36 = null;
		Static468.aClass5_35 = null;
		Static567.aClass5_25 = null;
		Static83.aClass5_6 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJILclient!in;Lclient!ua;IIII)V")
	public static void method5383(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class160 arg2, @OriginalArg(4) Class181 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg7 * arg7 + arg1 * arg1;
		if (arg0 < (long) local16) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg2.anInt4182 / 2, arg2.anInt4156 / 2);
		if (local32 * local32 >= local16) {
			Static82.method1353(arg4, arg7, arg3, arg6, arg2, Static518.aClass5Array20[arg5], arg1);
			return;
		}
		local32 -= 10;
		@Pc(62) int local62;
		if (Static358.anInt9363 == 4) {
			local62 = (int) Static331.aFloat172 & 0x3FFF;
		} else {
			local62 = (int) Static331.aFloat172 + Static272.anInt5007 & 0x3FFF;
		}
		@Pc(76) int local76 = Class85_Sub8.anIntArray426[local62];
		@Pc(80) int local80 = Class85_Sub8.anIntArray427[local62];
		if (Static358.anInt9363 != 4) {
			local80 = local80 * 256 / (Static267.anInt4887 + 256);
			local76 = local76 * 256 / (Static267.anInt4887 + 256);
		}
		@Pc(109) int local109 = local80 * arg1 + local76 * arg7 >> 14;
		@Pc(120) int local120 = local80 * arg7 - arg1 * local76 >> 14;
		@Pc(126) double local126 = Math.atan2((double) local109, (double) local120);
		@Pc(133) int local133 = (int) ((double) local32 * Math.sin(local126));
		@Pc(140) int local140 = (int) (Math.cos(local126) * (double) local32);
		Static12.aClass5Array3[arg5].method7797((float) local133 + (float) arg6 + (float) arg2.anInt4182 / 2.0F, (float) arg4 + (float) arg2.anInt4156 / 2.0F - (float) local140, 4096, (int) (-local126 / 6.283185307179586D * 65535.0D));
	}
}
