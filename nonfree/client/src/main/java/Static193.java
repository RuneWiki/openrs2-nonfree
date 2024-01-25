import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!wo;")
	public static Class216 aClass216_64;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Lclient!g;")
	public static Class71 method3722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class71 local7 = new Class71();
		local7.anInt2247 = arg1 + 5 + 1;
		local7.anInt2240 = -1;
		local7.anInt2230 = -1;
		local7.anInt2229 = arg0 + 6;
		local7.anIntArrayArray24 = new int[local7.anInt2247][local7.anInt2229];
		local7.method1945();
		return local7;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZB)V")
	public static void method3724(@OriginalArg(0) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local11 = Static8.aByteArrayArray21;
			local13 = 1;
		} else {
			local11 = Static345.aByteArrayArray25;
			local13 = 4;
		}
		for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
			Static63.method4863();
			for (@Pc(26) int local26 = 0; local26 < Static233.anInt5573 >> 3; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static134.anInt2971 >> 3; local30++) {
					@Pc(34) boolean local34 = false;
					@Pc(42) int local42 = Static133.anIntArrayArrayArray8[local21][local26][local30];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0 || local51 == 0) {
							@Pc(64) int local64 = local42 >> 1 & 0x3;
							@Pc(70) int local70 = local42 >> 14 & 0x3FF;
							@Pc(76) int local76 = local42 >> 3 & 0x7FF;
							@Pc(86) int local86 = local76 / 8 + (local70 / 8 << 8);
							for (@Pc(88) int local88 = 0; local88 < Static222.anIntArray416.length; local88++) {
								if (local86 == Static222.anIntArray416[local88] && local11[local88] != null) {
									@Pc(121) int[] local121 = Static147.method2938(local11[local88], local26 * 8, Static29.aClass71Array1, local51, local70, local21, arg0, local76, Static208.aClass32_11, local64, local30 * 8);
									if (local7 == null && local121 != null) {
										local7 = local121;
									}
									local34 = true;
									break;
								}
							}
						}
					}
					if (!local34) {
						Static64.method1566(local30 * 8, 8, local21, local26 * 8, 8);
					}
				}
			}
		}
		if (local7 == null) {
			Static127.aClass212_1 = null;
		} else {
			Static127.aClass212_1 = Static357.method3872(local7[3], local7[2], local7[0], local7[1]);
			Static176.anInt3801 = local7[4];
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public static void method3725() {
		@Pc(9) Class87 local9 = Static320.aClass87_46;
		synchronized (Static320.aClass87_46) {
			Static320.aClass87_46.method2477();
		}
	}
}
