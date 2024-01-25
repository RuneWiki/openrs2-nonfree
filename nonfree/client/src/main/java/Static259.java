import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	public static int anInt4879;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	public static int anInt4881;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_26 = new Class68(200);

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
	public static int anInt4877 = -1;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "[I")
	public static final int[] anIntArray314 = new int[6];

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
	public static int anInt4882 = 0;

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "J")
	public static long aLong160 = -1L;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!uu;Lclient!ya;)V")
	public static void method3755(@OriginalArg(1) Class247 arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(33) boolean local33 = Static444.aClass206_3.method4700(arg1, arg0.anInt6779, arg0.aBoolean613 ? Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1 : null, arg0.anInt6828, arg0.anInt6832, arg0.anInt6831, arg0.anInt6778 | 0xFF000000) == null;
		if (local33) {
			Static379.aClass183_45.method4137(new Class4_Sub17(arg0.anInt6779, arg0.anInt6832, arg0.anInt6831, arg0.anInt6778 | 0xFF000000, arg0.anInt6828, arg0.aBoolean613));
			Static63.method1142(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!wn;I[[B)V")
	public static void method3757(@OriginalArg(0) Class266_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt7302; local18++) {
			Static159.method2701();
			for (@Pc(24) int local24 = 0; local24 < Static326.anInt5666 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static283.anInt5187 >> 3; local28++) {
					@Pc(32) boolean local32 = false;
					@Pc(40) int local40 = Static313.anIntArrayArrayArray12[local18][local24][local28];
					if (local40 != -1) {
						@Pc(49) int local49 = local40 >> 24 & 0x3;
						if (!arg0.aBoolean687 || local49 == 0) {
							@Pc(63) int local63 = local40 >> 1 & 0x3;
							@Pc(69) int local69 = local40 >> 14 & 0x3FF;
							@Pc(75) int local75 = local40 >> 3 & 0x7FF;
							@Pc(85) int local85 = (local69 / 8 << 8) + local75 / 8;
							for (@Pc(87) int local87 = 0; local87 < Static308.anIntArray372.length; local87++) {
								if (Static308.anIntArray372[local87] == local85 && arg1[local87] != null) {
									@Pc(109) Class4_Sub12 local109 = new Class4_Sub12(arg1[local87]);
									arg0.method5640(local63, local109, local49, Static175.aClass213Array1, local75, local18, local28 * 8, local24 * 8, local69);
									arg0.method5647(local18, local28 * 8, local109, local16[0] == -1 ? local16 : null, Static122.aClass19_16, local75, local69, local63, local49, local24 * 8);
									local32 = true;
									break;
								}
							}
						}
					}
					if (!local32) {
						arg0.method5631(8, local18, 8, local28 * 8, local24 * 8);
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static10.aClass242_1 = Static296.aClass217_1.method4934(local16[1], local16[0], local16[2], local16[3], Static238.aClass226_1);
			Static100.anInt2023 = local16[4];
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([ILclient!rs;[IZ[I)V")
	public static void method3758(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class16_Sub1_Sub5_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg0[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg1.aClass165Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass165Array3[local19] = null;
					} else {
						@Pc(40) Class138 local40 = Static182.aClass55_1.method1397(local9);
						@Pc(43) int local43 = local40.anInt4406;
						@Pc(48) Class165 local48 = arg1.aClass165Array3[local19];
						if (local48 != null) {
							if (local9 == local48.anInt5139) {
								if (local43 == 0) {
									local48 = arg1.aClass165Array3[local19] = null;
								} else if (local43 == 1) {
									local48.anInt5140 = 1;
									local48.anInt5138 = 0;
									local48.anInt5142 = 0;
									local48.anInt5143 = 0;
									local48.anInt5141 = local17;
									Static15.method156(arg1.anInt6893, 0, arg1.aByte82, arg1.anInt6892, local40, false);
								} else if (local43 == 2) {
									local48.anInt5143 = 0;
								}
							} else if (local40.anInt4413 >= Static182.aClass55_1.method1397(local48.anInt5139).anInt4413) {
								local48 = arg1.aClass165Array3[local19] = null;
							}
						}
						if (local48 == null) {
							local48 = arg1.aClass165Array3[local19] = new Class165();
							local48.anInt5140 = 1;
							local48.anInt5141 = local17;
							local48.anInt5139 = local9;
							local48.anInt5142 = 0;
							local48.anInt5138 = 0;
							local48.anInt5143 = 0;
							Static15.method156(arg1.anInt6893, 0, arg1.aByte82, arg1.anInt6892, local40, false);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
