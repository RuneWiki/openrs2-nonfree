import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "Lclient!ri;")
	public static Class288 aClass288_2;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int anInt7807;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V")
	public static void method6585(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5) {
		Static574.method7621(arg0, -1, arg1, arg2, arg4, arg5, arg3, null);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(JIILclient!lk;Lclient!ua;IIII)V")
	public static void method6586(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class203 arg2, @OriginalArg(4) Class146 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg7 * arg7 + arg4 * arg4;
		if ((long) local14 > arg0) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg2.anInt5513 / 2, arg2.anInt5476 / 2);
		if (local34 * local34 >= local14) {
			Static555.method7393(arg2, arg4, arg5, arg7, arg3, Static405.aClass46Array13[arg6], arg1);
			return;
		}
		local34 -= 10;
		@Pc(69) int local69;
		if (Static446.anInt7363 == 4) {
			local69 = (int) Static439.aFloat151 & 0x3FFF;
		} else {
			local69 = Static278.anInt5101 + (int) Static439.aFloat151 & 0x3FFF;
		}
		@Pc(80) int local80 = Class3_Sub17.anIntArray175[local69];
		@Pc(84) int local84 = Class3_Sub17.anIntArray177[local69];
		if (Static446.anInt7363 != 4) {
			local84 = local84 * 256 / (Static435.anInt7196 + 256);
			local80 = local80 * 256 / (Static435.anInt7196 + 256);
		}
		@Pc(113) int local113 = local80 * arg4 + local84 * arg7 >> 14;
		@Pc(124) int local124 = arg4 * local84 - local80 * arg7 >> 14;
		@Pc(130) double local130 = Math.atan2((double) local113, (double) local124);
		@Pc(137) int local137 = (int) ((double) local34 * Math.sin(local130));
		@Pc(144) int local144 = (int) ((double) local34 * Math.cos(local130));
		Static245.aClass46Array10[arg6].method7611((float) arg2.anInt5513 / 2.0F + (float) arg1 + (float) local137, (float) arg2.anInt5476 / 2.0F + (float) arg5 - (float) local144, 4096, (int) (-local130 / 6.283185307179586D * 65535.0D));
	}
}
