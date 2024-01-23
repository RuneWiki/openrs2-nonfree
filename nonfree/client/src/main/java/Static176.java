import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	public static int anInt3474;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "Lclient!fm;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lclient!nj;")
	public static Class120 method2710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass120_1 == null ? null : local7.aClass120_1;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V")
	public static void method2711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < Static211.anInt4341; local11++) {
			@Pc(22) Class140 local22 = Static272.method4047(local11);
			if (local22 != null) {
				@Pc(30) int local30 = local22.anInt4598;
				if (local30 >= 0 && !Static96.anInterface4_1.method1271(local30)) {
					local30 = -1;
				}
				@Pc(96) int local96;
				@Pc(57) int local57;
				@Pc(63) int local63;
				@Pc(89) int local89;
				if (local22.anInt4597 >= 0) {
					local57 = local22.anInt4597;
					local63 = arg1 + (local57 & 0x7F);
					if (local63 < 0) {
						local63 = 0;
					} else if (local63 > 127) {
						local63 = 127;
					}
					local89 = (local57 & 0x380) + ((local57 + arg0 & 0xFC00) + local63);
					local96 = Static96.anIntArray135[Static264.method4229(local89, 96)];
				} else if (local30 >= 0) {
					local96 = Static96.anIntArray135[Static264.method4229(Static96.anInterface4_1.method1259(local30), 96)];
				} else if (local22.anInt4601 == -1) {
					local96 = -1;
				} else {
					local57 = local22.anInt4601;
					local63 = arg1 + (local57 & 0x7F);
					if (local63 < 0) {
						local63 = 0;
					} else if (local63 > 127) {
						local63 = 127;
					}
					local89 = (local57 & 0x380) + (arg0 + local57 & 0xFC00) + local63;
					local96 = Static96.anIntArray135[Static264.method4229(local89, 96)];
				}
				Static247.anIntArray475[local11 + 1] = local96;
			}
		}
	}
}
