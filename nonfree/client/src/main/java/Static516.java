import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Lclient!bp;")
	public static Class38 aClass38_5;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public static int anInt9255;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public static int anInt9256;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[S")
	public static short[] aShortArray136;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!n;")
	public static Interface11 anInterface11_13;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public static int anInt9258;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "F")
	public static float aFloat188 = 0.0F;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI[BII[BII)V")
	public static void method7625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg2[local26] += arg5[arg4++];
				@Pc(38) int local38 = arg0++;
				arg2[local38] += arg5[arg4++];
				@Pc(50) int local50 = arg0++;
				arg2[local50] += arg5[arg4++];
				@Pc(62) int local62 = arg0++;
				arg2[local62] += arg5[arg4++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg0++;
				arg2[local26] += arg5[arg4++];
			}
			arg4 += arg6;
			arg0 += arg7;
		}
	}
}
