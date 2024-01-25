import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
	public static int anInt7668;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "Lclient!en;")
	public static final Class84 aClass84_7 = new Class84("", 16);

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	public static int anInt7667 = -1;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Lclient!or;")
	public static final Class259 aClass259_11 = new Class259();

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!in;IILclient!r;IILclient!ua;B)V")
	public static void method6122(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class181 arg7) {
		@Pc(10) Class345 local10 = Static144.aClass113_1.method2595(arg5);
		if (local10 == null || !local10.aBoolean687 || !local10.method7486(Static390.aClass353_29)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray580 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray580.length];
			@Pc(43) int local43;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static358.anInt9363 == 4) {
					local43 = (int) Static331.aFloat172 & 0x3FFF;
				} else {
					local43 = (int) Static331.aFloat172 + Static272.anInt5007 & 0x3FFF;
				}
				@Pc(54) int local54 = Class85_Sub8.anIntArray426[local43];
				@Pc(58) int local58 = Class85_Sub8.anIntArray427[local43];
				if (Static358.anInt9363 != 4) {
					local58 = local58 * 256 / (Static267.anInt4887 + 256);
					local54 = local54 * 256 / (Static267.anInt4887 + 256);
				}
				local28[local30 * 2] = ((local10.anIntArray580[local30 * 2] * 4 + arg6) * local58 + local54 * (arg2 + local10.anIntArray580[local30 * 2 + 1] * 4) >> 14) + arg3 + arg1.anInt4182 / 2;
				local28[local30 * 2 + 1] = arg1.anInt4156 / 2 + arg0 - ((arg2 + local10.anIntArray580[local30 * 2 + 1] * 4) * local58 - local54 * (arg6 + local10.anIntArray580[local30 * 2] * 4) >> 14);
			}
			Static261.method3777(arg4, local28, local10.anInt9176, arg1.anIntArray203, arg1.anIntArray204);
			for (local43 = 0; local43 < local28.length / 2 - 1; local43++) {
				arg4.method6807(local28[local43 * 2], local28[local43 * 2 + 1], local28[local43 * 2 + 2], local28[(local43 + 1) * 2 + 1], local10.anInt9165, arg7, arg3, arg0);
			}
			arg4.method6807(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt9165, arg7, arg3, arg0);
		}
		@Pc(261) Class5 local261 = null;
		if (local10.anInt9195 != -1) {
			local261 = local10.method7481(false, arg4);
			if (local261 != null) {
				Static82.method1353(arg0, arg2, arg7, arg3, arg1, local261, arg6);
			}
		}
		if (local10.aString101 == null) {
			return;
		}
		local30 = 0;
		if (local261 != null) {
			local30 = local261.u();
		}
		@Pc(296) Class96 local296 = Static442.aClass96_12;
		@Pc(298) Class352 local298 = Static439.aClass352_23;
		if (local10.anInt9173 == 1) {
			local298 = Static552.aClass352_20;
			local296 = Static339.aClass96_9;
		}
		if (local10.anInt9173 == 2) {
			local298 = Static88.aClass352_7;
			local296 = Static62.aClass96_4;
		}
		Static502.method6057(local30, local296, local298, arg3, arg7, arg1, arg0, arg6, arg2, local10.aString101, local10.anInt9169);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!sea;I)V")
	public static void method6127(@OriginalArg(0) Class308 arg0) {
		Static507.anInt8800 = arg0.method6558("hitmarks");
		Static2.anInt69 = arg0.method6558("hitbar_default");
		Static389.anInt6927 = arg0.method6558("timerbar_default");
		Static103.anInt1780 = arg0.method6558("headicons_pk");
		Static173.anInt3243 = arg0.method6558("headicons_prayer");
		Static12.anInt308 = arg0.method6558("hint_headicons");
		Static375.anInt6735 = arg0.method6558("hint_mapmarkers");
		Static371.anInt6685 = arg0.method6558("mapflag");
		Static387.anInt6919 = arg0.method6558("cross");
		Static162.anInt3141 = arg0.method6558("mapdots");
		Static310.anInt5690 = arg0.method6558("scrollbar");
		Static25.anInt620 = arg0.method6558("name_icons");
		Static477.anInt8225 = arg0.method6558("floorshadows");
		Static256.anInt4710 = arg0.method6558("compass");
		Static473.anInt8125 = arg0.method6558("otherlevel");
		Static392.anInt6972 = arg0.method6558("hint_mapedge");
	}
}
