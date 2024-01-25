import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!br", name = "x", descriptor = "I")
	public static int anInt1405;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "Lclient!kda;")
	public static Class160 aClass160_10;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "[B")
	public static final byte[] aByteArray15 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!br", name = "j", descriptor = "I")
	public static int anInt1395 = 0;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_6 = new Class316(8);

	@OriginalMember(owner = "client!br", name = "u", descriptor = "I")
	public static int anInt1403 = 0;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "I")
	public static int anInt1404 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)I")
	public static int method1407() {
		return 6;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!vp;Lclient!qa;ILclient!pa;IIII)V")
	public static void method1409(@OriginalArg(0) int arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class23 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class24 local10 = Static167.aClass250_4.method6143(arg5);
		if (local10 == null || !local10.aBoolean98 || !local10.method1184(Static343.aClass286_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray117 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray117.length];
			@Pc(43) int local43;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static464.anInt8003 == 4) {
					local43 = (int) Static443.aFloat151 & 0x3FFF;
				} else {
					local43 = (int) Static443.aFloat151 + Static96.anInt2375 & 0x3FFF;
				}
				@Pc(53) int local53 = Class307.anIntArray744[local43];
				@Pc(57) int local57 = Class307.anIntArray743[local43];
				if (Static464.anInt8003 != 4) {
					local57 = local57 * 256 / (Static189.anInt4000 + 256);
					local53 = local53 * 256 / (Static189.anInt4000 + 256);
				}
				local28[local30 * 2] = arg1.anInt8790 / 2 + arg3 + ((local10.anIntArray117[local30 * 2] * 4 + arg0) * local57 + (arg6 + local10.anIntArray117[local30 * 2 - -1] * 4) * local53 >> 15);
				local28[local30 * 2 + 1] = arg1.anInt8752 / 2 + arg7 - (-(local53 * (arg0 + local10.anIntArray117[local30 * 2] * 4)) + (arg6 + local10.anIntArray117[local30 * 2 + 1] * 4) * local57 >> 15);
			}
			Static498.method7142(arg2, local28, local10.anInt1177, arg1.anIntArray748, arg1.anIntArray757);
			for (local43 = 0; local43 < local28.length / 2 - 1; local43++) {
				arg2.method7594(local28[local43 * 2], local28[local43 * 2 + 1], local28[(local43 + 1) * 2], local28[local43 * 2 + 3], local10.anInt1144, arg4, arg3, arg7);
			}
			arg2.method7594(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt1144, arg4, arg3, arg7);
		}
		@Pc(259) Class12 local259 = null;
		if (local10.anInt1173 != -1) {
			local259 = local10.method1188(false, arg2);
			if (local259 != null) {
				Static167.method3274(arg1, arg0, arg4, arg7, local259, arg6, arg3);
			}
		}
		if (local10.aString3 == null) {
			return;
		}
		local30 = 0;
		if (local259 != null) {
			local30 = local259.la();
		}
		@Pc(293) Class27 local293 = Static58.aClass27_2;
		@Pc(295) Class177 local295 = Static179.aClass177_4;
		if (local10.anInt1155 == 1) {
			local293 = Static268.aClass27_4;
			local295 = Static449.aClass177_9;
		}
		if (local10.anInt1155 == 2) {
			local293 = Static106.aClass27_3;
			local295 = Static159.aClass177_3;
		}
		Static178.method3419(arg7, local10.anInt1172, arg6, arg1, arg0, arg3, arg4, local293, local30, local10.aString3, local295);
		return;
	}
}
