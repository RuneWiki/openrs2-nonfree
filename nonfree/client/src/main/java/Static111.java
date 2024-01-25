import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "Lclient!dd;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
	public static int anInt2678;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
	public static int anInt2679;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
	public static int anInt2680;

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_40 = new Class287(11, -1);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILclient!ua;ILclient!pca;IILclient!r;)V")
	public static void method2256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class53 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class251 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class31 arg7) {
		@Pc(10) Class338 local10 = Static550.aClass189_3.method4642(arg6);
		if (local10 == null || !local10.aBoolean643 || !local10.method7661(Static206.aClass143_3)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray561 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray561.length];
			@Pc(42) int local42;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static188.anInt4080 == 4) {
					local42 = (int) Static209.aFloat229 & 0x3FFF;
				} else {
					local42 = (int) Static209.aFloat229 + Static270.anInt5118 & 0x3FFF;
				}
				@Pc(56) int local56 = Class3_Sub28.anIntArray232[local42];
				@Pc(60) int local60 = Class3_Sub28.anIntArray231[local42];
				if (Static188.anInt4080 != 4) {
					local60 = local60 * 256 / (Static350.anInt6241 + 256);
					local56 = local56 * 256 / (Static350.anInt6241 + 256);
				}
				local28[local30 * 2] = arg5 + arg4.anInt7285 / 2 + (local60 * (arg0 + local10.anIntArray561[local30 * 2] * 4) + local56 * (local10.anIntArray561[local30 * 2 + 1] * 4 + arg3) >> 14);
				local28[local30 * 2 + 1] = arg4.anInt7215 / 2 + arg1 - (local60 * (local10.anIntArray561[local30 * 2 + 1] * 4 + arg3) - (local10.anIntArray561[local30 * 2] * 4 + arg0) * local56 >> 14);
			}
			Static316.method4683(arg7, local28, local10.anInt9738, arg4.anIntArray409, arg4.anIntArray414);
			for (local42 = 0; local42 < local28.length / 2 - 1; local42++) {
				arg7.method8056(local28[local42 * 2], local28[local42 * 2 + 1], local28[local42 * 2 + 2], local28[(local42 + 1) * 2 + 1], local10.anInt9726, arg2, arg5, arg1);
			}
			arg7.method8056(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt9726, arg2, arg5, arg1);
		}
		@Pc(268) Class73 local268 = null;
		if (local10.anInt9741 != -1) {
			local268 = local10.method7654(arg7, false);
			if (local268 != null) {
				Static297.method6895(arg2, arg0, arg5, arg1, arg4, arg3, local268);
			}
		}
		if (local10.aString255 == null) {
			return;
		}
		local30 = 0;
		if (local268 != null) {
			local30 = local268.u();
		}
		@Pc(301) Class63 local301 = Static393.aClass63_9;
		@Pc(303) Class328 local303 = Static441.aClass328_10;
		if (local10.anInt9742 == 1) {
			local301 = Static2.aClass63_1;
			local303 = Static318.aClass328_8;
		}
		if (local10.anInt9742 == 2) {
			local301 = Static465.aClass63_10;
			local303 = Static35.aClass328_1;
		}
		Static341.method4972(arg1, arg4, local10.aString255, arg3, local301, arg5, local10.anInt9736, local303, local30, arg2, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public static void method2257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static31.aClass89_1 == Static40.aClass89_2) {
			if (Static546.method7486(arg0, 1, arg1, 1, 0, -2, 0, false)) {
				return;
			}
			Static546.method7486(arg0, 1, arg1, 1, 0, -3, 0, false);
		} else if (Static546.method7486(arg0, 1, arg1, 1, 0, -3, 0, false)) {
			return;
		} else {
			Static546.method7486(arg0, 1, arg1, 1, 0, -2, 0, false);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!pca;B)Lclient!pca;")
	public static Class251 method2259(@OriginalArg(0) Class251 arg0) {
		@Pc(13) Class251 local13 = Static70.method1704(arg0);
		if (local13 == null) {
			local13 = arg0.aClass251_11;
		}
		return local13;
	}
}
