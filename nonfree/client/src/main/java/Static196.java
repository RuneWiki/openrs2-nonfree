import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "[I")
	public static final int[] anIntArray347 = new int[32];

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public static int anInt3897 = 0;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Lclient!vc;")
	public static Class361 method3563() {
		return Static127.method2388();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([BII[BIIIIZ)V")
	public static void method3564(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(19) int local19 = -(arg5 & 0x3);
		for (@Pc(22) int local22 = -arg7; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg4++;
				arg3[local30] = (byte) (arg3[local30] - arg0[arg6++]);
				@Pc(43) int local43 = arg4++;
				arg3[local43] = (byte) (arg3[local43] - arg0[arg6++]);
				@Pc(56) int local56 = arg4++;
				arg3[local56] = (byte) (arg3[local56] - arg0[arg6++]);
				@Pc(69) int local69 = arg4++;
				arg3[local69] = (byte) (arg3[local69] - arg0[arg6++]);
			}
			for (@Pc(85) int local85 = local19; local85 < 0; local85++) {
				local30 = arg4++;
				arg3[local30] = (byte) (arg3[local30] - arg0[arg6++]);
			}
			arg6 += arg2;
			arg4 += arg1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!gaa;)I")
	public static int method3565(@OriginalArg(1) Class3_Sub25_Sub1 arg0) {
		@Pc(15) int local15 = arg0.method3402(2);
		@Pc(28) int local28;
		if (local15 == 0) {
			local28 = 0;
		} else if (local15 == 1) {
			local28 = arg0.method3402(5);
		} else if (local15 == 2) {
			local28 = arg0.method3402(8);
		} else {
			local28 = arg0.method3402(11);
		}
		return local28;
	}
}
