import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "Lclient!nq;")
	public static Class144 aClass144_35;

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
	public static void method1711(@OriginalArg(1) boolean arg0) {
		@Pc(13) int[] local13 = null;
		@Pc(17) byte local17;
		@Pc(19) byte[][] local19;
		if (arg0) {
			local19 = Static245.aByteArrayArray49;
			local17 = 1;
		} else {
			local17 = 4;
			local19 = Static178.aByteArrayArray25;
		}
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			Static168.method2723();
			for (@Pc(34) int local34 = 0; local34 < Static24.anInt454 >> 3; local34++) {
				for (@Pc(38) int local38 = 0; local38 < Static240.anInt4832 >> 3; local38++) {
					@Pc(42) boolean local42 = false;
					@Pc(50) int local50 = Static230.anIntArrayArrayArray12[local27][local34][local38];
					if (local50 != -1) {
						@Pc(60) int local60 = local50 >> 24 & 0x3;
						if (!arg0 || local60 == 0) {
							@Pc(70) int local70 = local50 >> 1 & 0x3;
							@Pc(76) int local76 = local50 >> 14 & 0x3FF;
							@Pc(82) int local82 = local50 >> 3 & 0x7FF;
							@Pc(92) int local92 = (local76 / 8 << 8) + local82 / 8;
							for (@Pc(94) int local94 = 0; local94 < Static157.anIntArray201.length; local94++) {
								if (Static157.anIntArray201[local94] == local92 && local19[local94] != null) {
									@Pc(125) int[] local125 = Static336.method5481(Static211.aClass92Array1, local38 * 8, local34 * 8, Static107.aClass129_4, local76, local60, arg0, local27, local70, local82, local19[local94]);
									local42 = true;
									if (local13 == null && local125 != null) {
										local13 = local125;
									}
									break;
								}
							}
						}
					}
					if (!local42) {
						Static87.method1248(local38 * 8, 8, local27, local34 * 8, 8);
					}
				}
			}
		}
		if (local13 == null) {
			Static162.aClass39_1 = null;
		} else {
			Static162.aClass39_1 = Static326.method4978(local13[0], local13[2], local13[3], local13[1]);
			Static82.anInt1503 = local13[4];
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZI)I")
	public static int method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static108.aClass77Array2 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(16) int local16 = arg1 >> 7;
			@Pc(20) int local20 = arg4 >> 7;
			if (arg3 < 0 || arg0 < 0 || Static24.anInt454 - 1 < arg3 || Static240.anInt4832 - 1 < arg0) {
				return 0;
			} else if (local16 >= 1 && local20 >= 1 && Static24.anInt454 - 1 >= local16 && Static240.anInt4832 - 1 >= local20) {
				@Pc(88) boolean local88 = (Static1.aByteArrayArrayArray1[1][arg1 >> 7][arg4 >> 7] & 0x2) != 0;
				@Pc(113) boolean local113;
				@Pc(129) boolean local129;
				if ((arg1 & 0x7F) == 0) {
					local113 = (Static1.aByteArrayArrayArray1[1][local16 - 1][arg4 >> 7] & 0x2) != 0;
					local129 = (Static1.aByteArrayArrayArray1[1][local16][arg4 >> 7] & 0x2) != 0;
					if (local113 != local129) {
						local88 = (Static1.aByteArrayArrayArray1[1][arg3][arg0] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x7F) == 0) {
					local113 = (Static1.aByteArrayArrayArray1[1][arg1 >> 7][local20 - 1] & 0x2) != 0;
					local129 = (Static1.aByteArrayArrayArray1[1][arg1 >> 7][local20] & 0x2) != 0;
					if (local129 != local113) {
						local88 = (Static1.aByteArrayArrayArray1[1][arg3][arg0] & 0x2) != 0;
					}
				}
				if (local88) {
					arg2++;
				}
				return Static108.aClass77Array2[arg2].method4133(arg1, arg4);
			} else {
				return 0;
			}
		} else {
			return Static108.aClass77Array2[arg2].method4133(arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public static void method1714() {
		@Pc(5) Class26 local5 = Static262.aClass26_49;
		synchronized (Static262.aClass26_49) {
			Static262.aClass26_49.method328();
		}
	}
}
