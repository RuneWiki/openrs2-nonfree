import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
	public static int anInt6008;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "Lclient!u;")
	public static final Class352 aClass352_6 = new Class352("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!aa;IIILclient!vo;BIJ)V")
	public static void method5409(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class381 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7) {
		@Pc(12) int local12 = arg4 * arg4 + arg3 * arg3;
		if (arg7 < (long) local12) {
			return;
		}
		@Pc(29) int local29 = Math.min(arg5.anInt10159 / 2, arg5.anInt10131 / 2);
		if (local29 * local29 >= local12) {
			Static161.method3199(arg1, arg5, Static684.aClass49Array19[arg2], arg0, arg4, arg6, arg3);
			return;
		}
		local29 -= 10;
		@Pc(61) int local61;
		if (Static526.anInt8626 == 4) {
			local61 = (int) Static409.aFloat135 & 0x3FFF;
		} else {
			local61 = (int) Static409.aFloat135 + Static51.anInt622 & 0x3FFF;
		}
		@Pc(72) int local72 = Class6_Sub2_Sub12.anIntArray293[local61];
		@Pc(76) int local76 = Class6_Sub2_Sub12.anIntArray292[local61];
		if (Static526.anInt8626 != 4) {
			local76 = local76 * 256 / (Static41.anInt542 + 256);
			local72 = local72 * 256 / (Static41.anInt542 + 256);
		}
		@Pc(105) int local105 = local76 * arg4 + local72 * arg3 >> 14;
		@Pc(116) int local116 = arg3 * local76 - local72 * arg4 >> 14;
		@Pc(122) double local122 = Math.atan2((double) local105, (double) local116);
		@Pc(129) int local129 = (int) ((double) local29 * Math.sin(local122));
		@Pc(136) int local136 = (int) (Math.cos(local122) * (double) local29);
		Static22.aClass49Array5[arg2].method8999((float) local129 + (float) arg5.anInt10159 / 2.0F + (float) arg6, (float) arg0 + (float) arg5.anInt10131 / 2.0F - (float) local136, 4096, (int) (-local122 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IJB)Ljava/lang/String;")
	public static String method5411(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static302.method4852(arg1);
		@Pc(10) int local10 = Static390.aCalendar1.get(5);
		@Pc(20) int local20 = Static390.aCalendar1.get(2);
		@Pc(24) int local24 = Static390.aCalendar1.get(1);
		return arg0 == 3 ? Static542.method7711(arg0, arg1) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static331.aStringArrayArray8[arg0][local20] + "-" + local24;
	}
}
