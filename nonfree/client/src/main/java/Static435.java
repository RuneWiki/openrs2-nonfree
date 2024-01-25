import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Lclient!tl;")
	public static Class240 aClass240_2;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "[I")
	public static int[] anIntArray545;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Z")
	public static boolean aBoolean509 = true;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(JB)V")
	public static void method5777(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static38.method504(arg0 - 1L);
			Static38.method504(1L);
		} else {
			Static38.method504(arg0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZII)I")
	public static int method5779(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub25 local14 = Static242.method3222(false, arg0);
		if (local14 == null) {
			return Static332.aClass159_1.method3063(arg0).anInt1106;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(32) int local32 = 0; local32 < local14.anIntArray345.length; local32++) {
			if (local14.anIntArray345[local32] == -1) {
				local24++;
			}
		}
		return local24 + Static332.aClass159_1.method3063(arg0).anInt1106 - local14.anIntArray345.length;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!bf;)V")
	public static void method5780(@OriginalArg(1) Class8_Sub3_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt7351 - Static265.anInt4371;
		@Pc(21) int local21 = arg0.anInt7350 * 128 + arg0.method5894() * 64;
		@Pc(32) int local32 = arg0.anInt7411 * 128 + arg0.method5894() * 64;
		arg0.anInt7339 += (local21 - arg0.anInt7339) / local9;
		arg0.anInt7343 += (local32 - arg0.anInt7343) / local9;
		arg0.anInt7426 = 0;
		if (arg0.anInt7368 == 0) {
			arg0.method5887(8192);
		}
		if (arg0.anInt7368 == 1) {
			arg0.method5887(12288);
		}
		if (arg0.anInt7368 == 2) {
			arg0.method5887(0);
		}
		if (arg0.anInt7368 == 3) {
			arg0.method5887(4096);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)I")
	public static int method5781(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!hd;II)V")
	public static void method5782(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class71 local13 = arg1.method2064(Static39.aClass135_1);
		if (local13 == null) {
			return;
		}
		Static39.aClass135_1.OA(arg0, arg2, arg0 + arg1.anInt2617, arg1.anInt2590 + arg2);
		if (Static387.anInt6335 < 3) {
			Static335.aClass95_18.method5827((float) arg1.anInt2617 / 2.0F + (float) arg0, (float) arg1.anInt2590 / 2.0F + (float) arg2, ((int) -Static109.aFloat75 & 0x3FFF) << 2, local13, arg0, arg2);
		} else {
			Static39.aClass135_1.ca(-16777216, local13, arg0, arg2);
		}
	}
}
