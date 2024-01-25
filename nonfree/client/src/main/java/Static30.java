import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Z")
	public static boolean aBoolean591;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Z")
	public static boolean aBoolean590 = false;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZI)V")
	public static void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class2_Sub44 local8 = Static432.method5828(arg1, arg0);
		if (local8 != null) {
			local8.method6072();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!qa;ILclient!cr;IIILclient!ea;)V")
	public static void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class41 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class14 arg7) {
		@Pc(10) Class83 local10 = Static304.aClass173_4.method4022(arg0);
		if (local10 == null || !local10.aBoolean196 || !local10.method1708(Static215.aClass225_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray133 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray133.length];
			@Pc(45) int local45;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static65.anInt7824 == 4) {
					local45 = (int) Static203.aFloat130 & 0x3FFF;
				} else {
					local45 = (int) Static203.aFloat130 + Static357.anInt3686 & 0x3FFF;
				}
				@Pc(56) int local56 = Class184.anIntArray349[local45];
				@Pc(60) int local60 = Class184.anIntArray350[local45];
				if (Static65.anInt7824 != 4) {
					local60 = local60 * 256 / (Static119.anInt2384 + 256);
					local56 = local56 * 256 / (Static119.anInt2384 + 256);
				}
				local28[local30 * 2] = (local60 * (local10.anIntArray133[local30 * 2] * 4 + arg6) + local56 * (local10.anIntArray133[local30 * 2 + 1] * 4 + arg5) >> 15) + arg4.anInt1622 / 2 + arg3;
				local28[local30 * 2 + 1] = arg1 + arg4.anInt1599 / 2 - ((arg5 + local10.anIntArray133[local30 * 2 + 1] * 4) * local60 - local56 * (arg6 + local10.anIntArray133[local30 * 2] * 4) >> 15);
			}
			Static247.method3818(arg2, local28, local10.anInt2309, arg4.anIntArray77, arg4.anIntArray76);
			for (local45 = 0; local45 < local28.length / 2 - 1; local45++) {
				arg2.method2222(local28[local45 * 2], local28[local45 * 2 + 1], local28[local45 * 2 + 2], local28[(local45 + 1) * 2 + 1], local10.anInt2332, arg7, arg3, arg1);
			}
			arg2.method2222(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt2332, arg7, arg3, arg1);
		}
		@Pc(269) Class76 local269 = null;
		if (local10.anInt2339 != -1) {
			local269 = local10.method1701(arg2, false);
			if (local269 != null) {
				Static40.method742(arg3, arg4, arg5, local269, arg1, arg7, arg6);
			}
		}
		if (local10.aString18 == null) {
			return;
		}
		local30 = 0;
		if (local269 != null) {
			local30 = local269.qa();
		}
		@Pc(302) Class56 local302 = Static418.aClass56_4;
		@Pc(304) Class210 local304 = Static434.aClass210_10;
		if (local10.anInt2312 == 1) {
			local302 = Static184.aClass56_2;
			local304 = Static56.aClass210_2;
		}
		if (local10.anInt2312 == 2) {
			local302 = Static193.aClass56_3;
			local304 = Static55.aClass210_1;
		}
		Static194.method3031(arg1, arg5, arg6, local10.anInt2335, local302, local30, local10.aString18, arg4, local304, arg3, arg7);
	}
}
