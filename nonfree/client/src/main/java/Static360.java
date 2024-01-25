import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_129 = new Class119(12, 6);

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
	public static int anInt6098 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IFFIIILclient!gi;FIIF[BIF)V")
	public static void method4755(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(6) Class89 arg3, @OriginalArg(7) float arg4, @OriginalArg(10) float arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) int arg7, @OriginalArg(13) float arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(47) int local47;
		@Pc(57) int local57;
		for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
			arg3.method3434(arg4 * 127.0F, arg0, arg2 / (float) 16, arg1 / (float) 128, local10, 0, arg8 / (float) 128);
			local47 = arg7;
			arg4 *= arg5;
			arg1 *= 2.0F;
			for (local57 = 0; local57 < 16384; local57++) {
				arg6[local47] = (byte) ((float) arg6[local47] + local10[local57]);
				local47++;
			}
			arg2 *= 2.0F;
			arg8 *= 2.0F;
		}
		local47 = arg7;
		for (local57 = 0; local57 < 16384; local57++) {
			arg6[local47] = (byte) (arg6[local47] + 127);
			local47++;
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
	public static void method4757() {
		if (!Static415.aBoolean587) {
			return;
		}
		while (true) {
			while (Static35.anInt997 < Static57.aClass117_Sub1Array3.length) {
				@Pc(29) Class117_Sub1 local29 = Static57.aClass117_Sub1Array3[Static35.anInt997];
				if (local29 != null && local29.anInt7360 == -1) {
					if (Static37.aClass3_Sub1_2 == null) {
						Static37.aClass3_Sub1_2 = Static369.aClass151_1.method3711(local29.aString65);
					}
					@Pc(53) int local53 = Static37.aClass3_Sub1_2.anInt64;
					if (local53 == -1) {
						return;
					}
					local29.anInt7360 = local53;
					Static37.aClass3_Sub1_2 = null;
					Static35.anInt997++;
				} else {
					Static35.anInt997++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(JI)V")
	public static void method4758(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static352.method4669(arg0 - 1L);
			Static352.method4669(1L);
		} else {
			Static352.method4669(arg0);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!pa;)Z")
	public static boolean method4760(@OriginalArg(1) Interface8 arg0) {
		@Pc(18) Class93 local18 = Static435.aClass30_4.method769(arg0.method4808());
		if (local18.anInt2764 == -1) {
			return true;
		} else {
			@Pc(30) Class236 local30 = Static326.aClass164_3.method3868(local18.anInt2764);
			return local30.anInt6427 == -1 ? true : local30.method4999();
		}
	}
}
