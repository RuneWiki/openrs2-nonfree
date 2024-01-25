import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "[Lclient!w;")
	public static Class367[] aClass367Array1;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
	public static int[] anIntArray404;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public static int anInt6469;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lclient!lr;")
	public static Class196 method5555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass196_2;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method5556() {
		Static640.anInt10662 = 200;
		Static258.anInt5160 = (int) ((double) Static442.anInt7975 * 34.46D);
		Static258.anInt5160 <<= 0x2;
		if (Static162.aClass100_7.method8809()) {
			Static258.anInt5160 += 512;
		}
		Static263.method4676(false);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/io/File;Z[BI)V")
	public static void method5558(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local25.readFully(arg1, 0, arg2);
		} catch (@Pc(32) EOFException local32) {
		}
		local25.close();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIBI)Z")
	public static boolean method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg1; local7++) {
			for (@Pc(11) int local11 = arg4; local11 <= arg3; local11++) {
				if (arg2 == Static394.anIntArrayArray30[local7][local11] && Static7.anIntArrayArray1[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!vd;IILclient!vd;)V")
	public static void method5561(@OriginalArg(0) Class353 arg0, @OriginalArg(3) Class353 arg1) {
		Static563.aClass353_116 = arg1;
		Static501.aClass353_101 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!dh;[II)Lclient!bn;")
	public static Class38 method5562(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(12) int[] local12 = null;
		@Pc(14) int[] local14 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg1.aByteArray34 != null) {
			@Pc(24) int local24 = arg1.anInt1998;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			local14 = new int[local24];
			local18 = new float[local24][];
			@Pc(88) int local88;
			@Pc(142) int local142;
			for (@Pc(82) int local82 = 0; local82 < arg0; local82++) {
				local88 = arg2[local82];
				if (arg1.aByteArray34[local88] != -1) {
					@Pc(101) int local101 = arg1.aByteArray34[local88] & 0xFF;
					for (@Pc(103) int local103 = 0; local103 < 3; local103++) {
						@Pc(118) short local118;
						if (local103 == 0) {
							local118 = arg1.aShortArray38[local88];
						} else if (local103 == 1) {
							local118 = arg1.aShortArray37[local88];
						} else {
							local118 = arg1.aShortArray39[local88];
						}
						@Pc(137) int local137 = arg1.anIntArray132[local118];
						local142 = arg1.anIntArray133[local118];
						@Pc(147) int local147 = arg1.anIntArray130[local118];
						if (local137 < local27[local101]) {
							local27[local101] = local137;
						}
						if (local137 > local30[local101]) {
							local30[local101] = local137;
						}
						if (local33[local101] > local142) {
							local33[local101] = local142;
						}
						if (local142 > local36[local101]) {
							local36[local101] = local142;
						}
						if (local147 < local39[local101]) {
							local39[local101] = local147;
						}
						if (local42[local101] < local147) {
							local42[local101] = local147;
						}
					}
				}
			}
			local12 = new int[local24];
			local16 = new int[local24];
			for (local88 = 0; local88 < local24; local88++) {
				@Pc(246) byte local246 = arg1.aByteArray31[local88];
				if (local246 > 0) {
					local12[local88] = (local30[local88] + local27[local88]) / 2;
					local14[local88] = (local33[local88] + local36[local88]) / 2;
					local16[local88] = (local42[local88] + local39[local88]) / 2;
					@Pc(313) float local313;
					@Pc(338) float local338;
					@Pc(315) float local315;
					if (local246 == 1) {
						local142 = arg1.anIntArray131[local88];
						if (local142 == 0) {
							local313 = 1.0F;
							local315 = 1.0F;
						} else if (local142 <= 0) {
							local313 = (float) -local142 / 1024.0F;
							local315 = 1.0F;
						} else {
							local315 = (float) local142 / 1024.0F;
							local313 = 1.0F;
						}
						local338 = 64.0F / (float) arg1.anIntArray134[local88];
					} else if (local246 == 2) {
						local315 = 64.0F / (float) arg1.anIntArray138[local88];
						local313 = 64.0F / (float) arg1.anIntArray131[local88];
						local338 = 64.0F / (float) arg1.anIntArray134[local88];
					} else {
						local338 = (float) arg1.anIntArray134[local88] / 1024.0F;
						local313 = (float) arg1.anIntArray131[local88] / 1024.0F;
						local315 = (float) arg1.anIntArray138[local88] / 1024.0F;
					}
					local18[local88] = Static539.method7916(local315, arg1.aShortArray40[local88], local338, arg1.aByteArray30[local88] & 0xFF, arg1.aShortArray43[local88], local313, arg1.aShortArray45[local88]);
				}
			}
		}
		return new Class38(local12, local14, local16, local18);
	}
}
