import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "F")
	public static float aFloat220;

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
	public static int anInt8671 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIBII)V")
	public static void method7267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 - arg3;
		@Pc(14) int local14 = arg2 - arg0;
		if (local14 == 0) {
			if (local9 != 0) {
				Static473.method7079(arg4, arg3, arg1, arg0);
			}
		} else if (local9 == 0) {
			Static164.method2784(arg1, arg2, arg0, arg3);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(58) boolean local58 = local9 > local14;
			@Pc(62) int local62;
			@Pc(64) int local64;
			if (local58) {
				local62 = arg0;
				local64 = arg2;
				arg0 = arg3;
				arg2 = arg4;
				arg3 = local62;
				arg4 = local64;
			}
			if (arg2 < arg0) {
				local62 = arg0;
				arg0 = arg2;
				local64 = arg3;
				arg2 = local62;
				arg3 = arg4;
				arg4 = local64;
			}
			local62 = arg3;
			local64 = arg2 - arg0;
			@Pc(103) int local103 = arg4 - arg3;
			@Pc(108) int local108 = -(local64 >> 1);
			@Pc(119) int local119 = arg3 >= arg4 ? -1 : 1;
			if (local103 < 0) {
				local103 = -local103;
			}
			@Pc(133) int local133;
			if (local58) {
				for (local133 = arg0; local133 <= arg2; local133++) {
					Static130.anIntArrayArray89[local133][local62] = arg1;
					local108 += local103;
					if (local108 > 0) {
						local108 -= local64;
						local62 += local119;
					}
				}
			} else {
				for (local133 = arg0; local133 <= arg2; local133++) {
					Static130.anIntArrayArray89[local62][local133] = arg1;
					local108 += local103;
					if (local108 > 0) {
						local62 += local119;
						local108 -= local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIB)B")
	public static byte method7268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method7269() {
		return Static452.aBoolean600 || Static431.aClass2_Sub44_3 == null ? "" : Static431.aClass2_Sub44_3.aString180;
	}
}
