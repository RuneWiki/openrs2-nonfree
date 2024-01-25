import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "J")
	public static long aLong16;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
	public static int anInt344;

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "[S")
	private static final short[] aShortArray2 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "[J")
	public static final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "[S")
	private static final short[] aShortArray3 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
	public static int anInt345 = 104;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "[S")
	private static final short[] aShortArray4 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
	public static int anInt351 = 0;

	@OriginalMember(owner = "client!ar", name = "v", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_14 = new Class194(56, 28);

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray2, aShortArray3, aShortArray4 };

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
	public static void method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static64.method1061(arg0)) {
			Static535.method7744(Static319.aClass344ArrayArray2[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILclient!ha;)Lclient!fd;")
	public static Class103 method330(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(12) Class3_Sub40 local12 = (Class3_Sub40) Static580.aClass25_45.method426((long) arg0);
		if (local12 != null) {
			@Pc(24) Class3_Sub23_Sub4 local24 = local12.aClass172_Sub1_1.method7045();
			local12.aBoolean534 = true;
			if (local24 != null) {
				return local24.method8001(arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[IILclient!vo;)Lclient!hh;")
	public static Class144 method332(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class359 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(21) float[][] local21 = null;
		if (arg2.aByteArray100 != null) {
			@Pc(27) int local27 = arg2.anInt9836;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(33) int[] local33 = new int[local27];
			@Pc(36) int[] local36 = new int[local27];
			@Pc(39) int[] local39 = new int[local27];
			@Pc(42) int[] local42 = new int[local27];
			@Pc(45) int[] local45 = new int[local27];
			for (@Pc(47) int local47 = 0; local47 < local27; local47++) {
				local30[local47] = Integer.MAX_VALUE;
				local33[local47] = -2147483647;
				local36[local47] = Integer.MAX_VALUE;
				local39[local47] = -2147483647;
				local42[local47] = Integer.MAX_VALUE;
				local45[local47] = -2147483647;
			}
			local7 = new int[local27];
			local11 = new int[local27];
			local9 = new int[local27];
			@Pc(94) int local94;
			@Pc(147) int local147;
			for (@Pc(88) int local88 = 0; local88 < arg0; local88++) {
				local94 = arg1[local88];
				if (arg2.aByteArray100[local94] != -1) {
					@Pc(107) int local107 = arg2.aByteArray100[local94] & 0xFF;
					for (@Pc(109) int local109 = 0; local109 < 3; local109++) {
						@Pc(123) short local123;
						if (local109 == 0) {
							local123 = arg2.aShortArray156[local94];
						} else if (local109 == 1) {
							local123 = arg2.aShortArray149[local94];
						} else {
							local123 = arg2.aShortArray150[local94];
						}
						@Pc(142) int local142 = arg2.anIntArray625[local123];
						local147 = arg2.anIntArray632[local123];
						@Pc(152) int local152 = arg2.anIntArray627[local123];
						if (local142 < local30[local107]) {
							local30[local107] = local142;
						}
						if (local33[local107] < local142) {
							local33[local107] = local142;
						}
						if (local36[local107] > local147) {
							local36[local107] = local147;
						}
						if (local147 > local39[local107]) {
							local39[local107] = local147;
						}
						if (local152 < local42[local107]) {
							local42[local107] = local152;
						}
						if (local45[local107] < local152) {
							local45[local107] = local152;
						}
					}
				}
			}
			local21 = new float[local27][];
			for (local94 = 0; local94 < local27; local94++) {
				@Pc(230) byte local230 = arg2.aByteArray103[local94];
				if (local230 > 0) {
					local7[local94] = (local30[local94] + local33[local94]) / 2;
					local9[local94] = (local39[local94] + local36[local94]) / 2;
					local11[local94] = (local45[local94] + local42[local94]) / 2;
					@Pc(285) float local285;
					@Pc(319) float local319;
					@Pc(287) float local287;
					if (local230 == 1) {
						local147 = arg2.anIntArray624[local94];
						if (local147 == 0) {
							local285 = 1.0F;
							local287 = 1.0F;
						} else if (local147 > 0) {
							local287 = (float) local147 / 1024.0F;
							local285 = 1.0F;
						} else {
							local287 = 1.0F;
							local285 = (float) -local147 / 1024.0F;
						}
						local319 = 64.0F / (float) arg2.anIntArray628[local94];
					} else if (local230 == 2) {
						local319 = 64.0F / (float) arg2.anIntArray628[local94];
						local287 = 64.0F / (float) arg2.anIntArray622[local94];
						local285 = 64.0F / (float) arg2.anIntArray624[local94];
					} else {
						local319 = (float) arg2.anIntArray628[local94] / 1024.0F;
						local287 = (float) arg2.anIntArray622[local94] / 1024.0F;
						local285 = (float) arg2.anIntArray624[local94] / 1024.0F;
					}
					local21[local94] = Static42.method748(arg2.aShortArray147[local94], arg2.aShortArray152[local94], arg2.aByteArray102[local94] & 0xFF, local287, arg2.aShortArray154[local94], local319, local285);
				}
			}
		}
		return new Class144(local7, local9, local11, local21);
	}
}
