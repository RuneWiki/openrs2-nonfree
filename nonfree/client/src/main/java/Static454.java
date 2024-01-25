import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wq", name = "N", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray22;

	@OriginalMember(owner = "client!wq", name = "O", descriptor = "Lclient!l;")
	public static Class11 aClass11_21;

	@OriginalMember(owner = "client!wq", name = "F", descriptor = "[I")
	public static final int[] anIntArray625 = new int[100];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
	public static String method5771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(19) int local19 = arg1 + arg0;
		for (@Pc(21) int local21 = arg0; local21 < local19; local21++) {
			@Pc(29) int local29 = arg2[local21] & 0xFF;
			if (local29 < 128) {
				local8[local10++] = (char) local29;
			} else if (local29 >= 194) {
				@Pc(63) int local63;
				if (local29 < 224) {
					if (local19 <= local21 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local63 = arg2[local21] & 0xFF;
					if (local63 < 128 || local63 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local63 & 0xFFFFFF7F | (local29 & 0x3FFFF3F) << 6);
				} else if (local29 < 240) {
					if (local21 + 2 >= local19) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local63 = arg2[local21] & 0xFF;
					if (local63 < 128 || local63 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(134) int local134 = arg2[local21] & 0xFF;
					if (local134 < 128 || local134 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local134 & 0xFFFFFF7F | (local29 & 0xFFFFFF1F) << 12 | (local63 & 0x3FFFF7F) << 6);
				} else if (local29 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!lc;ZIIIII)V")
	public static void method5772(@OriginalArg(0) Class139 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static225.anInt4941 >= 50 || (arg0 == null || arg0.anIntArrayArray30 == null || arg0.anIntArrayArray30.length <= arg5 || arg0.anIntArrayArray30[arg5] == null)) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray30[arg5][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg0.anIntArrayArray30[arg5].length > 1) {
			local61 = (int) ((double) arg0.anIntArrayArray30[arg5].length * Math.random());
			if (local61 > 0) {
				local38 = arg0.anIntArrayArray30[arg5][local61];
			}
		}
		@Pc(74) int local74 = local34 & 0x1F;
		if (local74 == 0) {
			if (arg1) {
				Static90.method1614(0, 255, local38, local44);
			}
		} else if (Static130.aClass153_Sub1_1.anInt5246 != 0) {
			local61 = arg4 - 64 >> 7;
			@Pc(104) int local104 = arg2 - 64 >> 7;
			Static205.aClass252Array1[Static225.anInt4941++] = new Class252((byte) 1, local38, local44, 0, 255, local74 + (local104 << 8) + (local61 << 16) + (arg3 << 24));
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BILclient!go;I)V")
	public static void method5773(@OriginalArg(1) int arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) int arg2) {
		if (Static191.aClass95_9 != null || Static331.aBoolean372 || (arg1 == null || Static378.method4849(arg1) == null)) {
			return;
		}
		Static191.aClass95_9 = arg1;
		Static36.aClass95_1 = Static378.method4849(arg1);
		Static44.anInt727 = arg2;
		Static98.anInt1995 = arg0;
		Static66.anInt1242 = 0;
		Static268.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)V")
	public static void method5775(@OriginalArg(1) int arg0) {
		@Pc(19) Class7_Sub4_Sub14 local19 = Static54.method750(arg0, 1);
		local19.method4710();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIII)V")
	public static void method5776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static278.method3708(arg0, Static82.anInt1667, Static316.anInt5188);
		@Pc(25) int local25 = Static278.method3708(arg3, Static82.anInt1667, Static316.anInt5188);
		@Pc(31) int local31 = Static278.method3708(arg2, Static137.anInt2576, Static293.anInt4886);
		@Pc(37) int local37 = Static278.method3708(arg5, Static137.anInt2576, Static293.anInt4886);
		@Pc(45) int local45 = Static278.method3708(arg1 + arg0, Static82.anInt1667, Static316.anInt5188);
		@Pc(54) int local54 = Static278.method3708(arg3 - arg1, Static82.anInt1667, Static316.anInt5188);
		for (@Pc(56) int local56 = local11; local56 < local45; local56++) {
			Static404.method5769(Static353.anIntArrayArray48[local56], local31, local37, arg4);
		}
		for (@Pc(72) int local72 = local25; local72 > local54; local72--) {
			Static404.method5769(Static353.anIntArrayArray48[local72], local31, local37, arg4);
		}
		@Pc(94) int local94 = Static278.method3708(arg2 + arg1, Static137.anInt2576, Static293.anInt4886);
		@Pc(103) int local103 = Static278.method3708(arg5 - arg1, Static137.anInt2576, Static293.anInt4886);
		for (@Pc(105) int local105 = local45; local105 <= local54; local105++) {
			@Pc(111) int[] local111 = Static353.anIntArrayArray48[local105];
			Static404.method5769(local111, local31, local94, arg4);
			Static404.method5769(local111, local103, local37, arg4);
		}
	}
}
