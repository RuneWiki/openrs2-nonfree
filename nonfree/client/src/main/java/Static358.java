import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!rj", name = "T", descriptor = "Lclient!gw;")
	public static Class93 aClass93_7;

	@OriginalMember(owner = "client!rj", name = "X", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "Lclient!bj;")
	public static final Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "Lclient!ua;")
	public static Class243 aClass243_1 = new Class243(8);

	@OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
	public static int anInt6108 = 1;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ga;ILclient!aa;Lclient!i;III)V")
	public static void method5004(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2 arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Static27.anInt490 == 4) {
			local21 = (int) Static19.aFloat6 & 0x3FFF;
		} else {
			local21 = (int) Static19.aFloat6 + Static139.anInt2475 & 0x3FFF;
		}
		@Pc(42) int local42 = Math.max(arg1.anInt2192 / 2, arg1.anInt2216 / 2) + 10;
		@Pc(50) int local50 = arg2 * arg2 + arg0 * arg0;
		if (local42 * local42 < local50) {
			return;
		}
		@Pc(64) int local64 = Class65.anIntArray88[local21];
		@Pc(68) int local68 = Class65.anIntArray87[local21];
		if (Static27.anInt490 != 4) {
			local68 = local68 * 256 / (Static197.anInt3551 + 256);
			local64 = local64 * 256 / (Static197.anInt3551 + 256);
		}
		@Pc(97) int local97 = local64 * arg0 + arg2 * local68 >> 15;
		@Pc(108) int local108 = arg0 * local68 - local64 * arg2 >> 15;
		arg3.method5833(local97 + arg5 + arg1.anInt2192 / 2 - arg3.d() / 2, arg6 - (-(arg1.anInt2216 / 2) - -local108 + arg3.ga() / 2), arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "(I)Z")
	public static boolean method5007() {
		return Static63.anInt7101 == 0 ? Static407.aClass3_Sub1_Sub4_3.method6319() : true;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I")
	public static int method5008(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIII[FFIIIFFI)V")
	public static void method5011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg6 - arg1;
		@Pc(9) int local9 = arg8 - arg7;
		@Pc(17) int local17 = arg11 - arg3;
		@Pc(38) float local38 = (float) local9 * arg4[2] + arg4[0] * (float) local5 + (float) local17 * arg4[1];
		@Pc(63) float local63 = arg4[5] * (float) local9 + (float) local17 * arg4[4] + arg4[3] * (float) local5;
		@Pc(84) float local84 = arg4[7] * (float) local17 + (float) local5 * arg4[6] + arg4[8] * (float) local9;
		@Pc(109) float local109;
		@Pc(102) float local102;
		if (arg0 == 0) {
			local102 = arg9 + 0.5F - local84;
			local109 = local38 + arg10 + 0.5F;
		} else if (arg0 == 1) {
			local102 = arg9 + local84 + 0.5F;
			local109 = local38 + arg10 + 0.5F;
		} else if (arg0 == 2) {
			local102 = arg5 + 0.5F - local63;
			local109 = arg10 + 0.5F - local38;
		} else if (arg0 == 3) {
			local102 = arg5 + 0.5F - local63;
			local109 = arg10 + local38 + 0.5F;
		} else if (arg0 == 4) {
			local109 = local84 + arg9 + 0.5F;
			local102 = arg5 + 0.5F - local63;
		} else {
			local102 = arg5 + 0.5F - local63;
			local109 = arg9 + 0.5F - local84;
		}
		@Pc(207) float local207;
		if (arg2 == 1) {
			local207 = local109;
			local109 = -local102;
			local102 = local207;
		} else if (arg2 == 2) {
			local109 = -local109;
			local102 = -local102;
		} else if (arg2 == 3) {
			local207 = local109;
			local109 = local102;
			local102 = -local207;
		}
		Static233.aFloat59 = local109;
		Static216.aFloat54 = local102;
	}
}
