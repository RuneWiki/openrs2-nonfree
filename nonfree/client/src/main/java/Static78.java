import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
	public static int anInt1548;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	public static int anInt1545 = -1;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	public static int anInt1546 = 999999;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "[I")
	public static final int[] anIntArray143 = new int[8];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!m;IILclient!kj;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class109 method1350(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class138 arg2, @OriginalArg(4) Canvas arg3) {
		return new h(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method1352(@OriginalArg(0) Class109 arg0) {
		for (@Pc(1) int local1 = Static201.anInt3737; local1 < Static107.anInt1964; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static377.anInt6467; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static378.anInt6480; local7++) {
					@Pc(16) Class211 local16 = Static268.aClass211ArrayArrayArray4[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class26_Sub1 local21 = local16.aClass26_Sub1_2;
						@Pc(24) Class26_Sub1 local24 = local16.aClass26_Sub1_3;
						if (local21 != null && local21.method5512()) {
							Static266.method3894(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5512()) {
								Static266.method3894(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5514(0, 0, local21, 0, arg0, false);
								local24.method5516();
							}
							local21.method5516();
						}
						for (@Pc(70) Class125 local70 = local16.aClass125_3; local70 != null; local70 = local70.aClass125_1) {
							@Pc(74) Class26_Sub2 local74 = local70.aClass26_Sub2_1;
							if (local74 != null && local74.method5512()) {
								Static266.method3894(arg0, local74, local1, local4, local7, local74.aShort92 + 1 - local74.aShort93, local74.aShort95 - local74.aShort94 + 1);
								local74.method5516();
							}
						}
						@Pc(111) Class26_Sub4 local111 = local16.aClass26_Sub4_2;
						if (local111 != null && local111.method5512()) {
							Static324.method4569(arg0, local111, local1, local4, local7);
							local111.method5516();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "()V")
	public static void method1353() {
		for (@Pc(1) int local1 = 0; local1 < Static139.anInt2353; local1++) {
			if (!Static439.aBooleanArray29[local1]) {
				@Pc(10) Class124 local10 = Static110.aClass124Array2[local1];
				@Pc(13) Class1_Sub5 local13 = local10.aClass1_Sub5_1;
				@Pc(16) int local16 = local10.anInt3439;
				@Pc(22) int local22 = local13.method3327() - Static122.anInt2160;
				@Pc(30) int local30 = (local22 * 2 >> Static139.anInt2355) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method3333() - local22 >> Static139.anInt2355;
				@Pc(53) int local53 = local13.method3325() - local22 >> Static139.anInt2355;
				@Pc(61) int local61 = local13.method3325() + local22 >> Static139.anInt2355;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static378.anInt6480) {
					local61 = Static378.anInt6480 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray52[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static377.anInt6467) {
						local108 = Static377.anInt6467 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class26_Sub2 local141 = Static278.method5819(local16, local125, local78, bt.class);
						if (local141 != null && local141.aByte94 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte94 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray52[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray52[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray52[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray52[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static439.aBooleanArray29[local1] = true;
				Static92.aClass136Array1[local16].method5979(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	public static void method1354() {
		Static416.anInt7247 = Static167.aClass101_3.anInt2378 + Static167.aClass101_3.anInt2376 + 2;
		Static397.anInt6904 = Static98.aClass101_2.anInt2376 + Static98.aClass101_2.anInt2378 + 2;
		Static35.aStringArray21 = new String[500];
		for (@Pc(32) int local32 = 0; local32 < Static35.aStringArray21.length; local32++) {
			Static35.aStringArray21[local32] = "";
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method1355(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return Static122.method1812(arg1, local18);
		} else if (arg0 instanceof Class6) {
			@Pc(30) Class6 local30 = (Class6) arg0;
			return local30.method206(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBI)Lclient!ss;")
	public static Class219 method1356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class219 local15 = Static103.method1572(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass219Array3 == null || local15.aClass219Array3.length <= arg1) {
			return null;
		} else {
			return local15.aClass219Array3[arg1];
		}
	}
}
