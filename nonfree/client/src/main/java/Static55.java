import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bv", name = "P", descriptor = "Lclient!sq;")
	public static Class319 aClass319_1;

	@OriginalMember(owner = "client!bv", name = "E", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "Lclient!tba;")
	public static final Class323 aClass323_5 = new Class323(32);

	@OriginalMember(owner = "client!bv", name = "M", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!bv", name = "N", descriptor = "Lclient!bia;")
	public static final Class36 aClass36_1 = new Class36(2);

	@OriginalMember(owner = "client!bv", name = "O", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_26 = new Class200(39, 8);

	@OriginalMember(owner = "client!bv", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString12 = "";

	@OriginalMember(owner = "client!bv", name = "R", descriptor = "[I")
	public static final int[] anIntArray87 = new int[4096];

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!ha;ILclient!aa;Lclient!ria;III)V")
	public static void method1294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) Class303 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(23) Class353 local23 = Static240.aClass336_5.method7855(arg7);
		if (local23 == null || !local23.aBoolean708 || !local23.method8340(Static382.aClass282_1)) {
			return;
		}
		@Pc(43) int local43;
		if (local23.anIntArray691 != null) {
			@Pc(41) int[] local41 = new int[local23.anIntArray691.length];
			@Pc(53) int local53;
			@Pc(66) int local66;
			@Pc(70) int local70;
			for (local43 = 0; local43 < local41.length / 2; local43++) {
				if (Static407.anInt6909 == 4) {
					local53 = (int) Static225.aFloat85 & 0x3FFF;
				} else {
					local53 = Static463.anInt7491 + (int) Static225.aFloat85 & 0x3FFF;
				}
				local66 = Class290.anIntArray546[local53];
				local70 = Class290.anIntArray547[local53];
				if (Static407.anInt6909 != 4) {
					local66 = local66 * 256 / (Static594.anInt9866 + 256);
					local70 = local70 * 256 / (Static594.anInt9866 + 256);
				}
				local41[local43 * 2] = arg5.anInt7914 / 2 + arg6 + (local70 * (arg0 + local23.anIntArray691[local43 * 2] * 4) + (local23.anIntArray691[local43 * 2 + 1] * 4 + arg3) * local66 >> 14);
				local41[local43 * 2 + 1] = arg5.anInt7971 / 2 + arg1 - (local70 * (arg3 + local23.anIntArray691[local43 * 2 + 1] * 4) - local66 * (arg0 + local23.anIntArray691[local43 * 2] * 4) >> 14);
			}
			Static3.method67(arg2, local41, local23.anInt9800, arg5.anIntArray581, arg5.anIntArray574);
			if (local23.anInt9799 <= 0) {
				for (local53 = 0; local53 < local41.length / 2 - 1; local53++) {
					arg2.method8096(local41[local53 * 2], local41[local53 * 2 + 1], local41[(local53 + 1) * 2], local41[local53 * 2 + 2 + 1], local23.anIntArray692[local23.aByteArray101[local53] & 0xFF], arg4, arg6, arg1);
				}
				arg2.method8096(local41[local41.length - 2], local41[local41.length - 1], local41[0], local41[1], local23.anIntArray692[local23.aByteArray101[local23.aByteArray101.length - 1] & 0xFF], arg4, arg6, arg1);
			} else {
				@Pc(322) int local322;
				@Pc(332) int local332;
				@Pc(351) int local351;
				@Pc(363) int local363;
				for (local53 = 0; local53 < local41.length / 2 - 1; local53++) {
					local66 = local41[local53 * 2];
					local70 = local41[local53 * 2 + 1];
					local322 = local41[(local53 + 1) * 2];
					local332 = local41[(local53 + 1) * 2 + 1];
					if (local322 < local66) {
						local351 = local66;
						local66 = local322;
						local363 = local70;
						local70 = local332;
						local322 = local351;
						local332 = local363;
					} else if (local66 == local322 && local332 < local70) {
						local351 = local70;
						local70 = local332;
						local332 = local351;
					}
					arg2.method8144(local66, local70, local322, local332, local23.anIntArray692[local23.aByteArray101[local53] & 0xFF], arg4, arg6, arg1, local23.anInt9799, local23.anInt9808, local23.anInt9813);
				}
				local66 = local41[local41.length - 2];
				local70 = local41[local41.length - 1];
				local322 = local41[0];
				local332 = local41[1];
				if (local322 < local66) {
					local351 = local66;
					local66 = local322;
					local363 = local70;
					local70 = local332;
					local322 = local351;
					local332 = local363;
				} else if (local66 == local322 && local70 > local332) {
					local351 = local70;
					local70 = local332;
					local332 = local351;
				}
				arg2.method8144(local66, local70, local322, local332, local23.anIntArray692[local23.aByteArray101[local23.aByteArray101.length - 1] & 0xFF], arg4, arg6, arg1, local23.anInt9799, local23.anInt9808, local23.anInt9813);
			}
		}
		@Pc(489) Class31 local489 = null;
		if (local23.anInt9818 != -1) {
			local489 = local23.method8338(false, arg2);
			if (local489 != null) {
				Static579.method8033(arg0, arg4, local489, arg6, arg3, arg5, arg1);
			}
		}
		if (local23.aString100 == null) {
			return;
		}
		local43 = 0;
		if (local489 != null) {
			local43 = local489.method8789();
		}
		@Pc(522) Class37 local522 = Static591.aClass37_12;
		@Pc(524) Class183 local524 = Static539.aClass183_11;
		if (local23.anInt9795 == 1) {
			local522 = Static39.aClass37_1;
			local524 = Static266.aClass183_7;
		}
		if (local23.anInt9795 == 2) {
			local524 = Static551.aClass183_13;
			local522 = Static544.aClass37_8;
		}
		Static35.method848(local23.anInt9822, arg5, arg0, arg6, local524, arg1, local522, local23.aString100, arg4, local43, arg3);
		return;
	}
}
