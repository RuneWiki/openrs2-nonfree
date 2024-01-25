import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Lclient!cga;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
	public static final int[] anIntArray473 = new int[5];

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "[Lclient!ah;")
	public static final Class9[] aClass9Array1 = new Class9[35];

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "[I")
	public static final int[] anIntArray474 = new int[5];

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
	public static boolean aBoolean625 = false;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ega;I)V")
	public static void method6128(@OriginalArg(0) Class3_Sub14 arg0) {
		arg0.aBoolean807 = false;
		if (arg0.aClass3_Sub6_5 != null) {
			arg0.aClass3_Sub6_5.anInt1101 = 0;
		}
		for (@Pc(20) Class3_Sub14 local20 = arg0.method7822(); local20 != null; local20 = arg0.method7819()) {
			method6128(local20);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!tc;I)Lclient!tc;")
	public static Class305 method6129(@OriginalArg(0) Class305 arg0) {
		@Pc(6) Class305 local6 = Static68.method1696(arg0);
		if (local6 == null) {
			local6 = arg0.aClass305_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)V")
	public static void method6131(@OriginalArg(0) int arg0) {
		if (!Static402.method8391(arg0)) {
			return;
		}
		@Pc(12) Class305[] local12 = Static108.aClass305ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			@Pc(23) Class305 local23 = local12[local18];
			if (local23 != null) {
				local23.anInt9186 = 1;
				local23.anInt9204 = 0;
				local23.anInt9183 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([BII)[B")
	public static byte[] method6132(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static602.method4666(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)I")
	public static int method6133(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	public static void method6134() {
		if (Static331.anIntArray442 != null) {
			return;
		}
		Static331.anIntArray442 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(23) int local23 = 0; local23 < 65536; local23++) {
			@Pc(35) double local35 = (double) (local23 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(46) double local46 = (double) (local23 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(53) double local53 = (double) (local23 & 0x7F) / 128.0D;
			@Pc(55) double local55 = local53;
			@Pc(57) double local57 = local53;
			@Pc(59) double local59 = local53;
			if (local46 != 0.0D) {
				@Pc(73) double local73;
				if (local53 < 0.5D) {
					local73 = (local46 + 1.0D) * local53;
				} else {
					local73 = local46 + local53 - local53 * local46;
				}
				@Pc(90) double local90 = local53 * 2.0D - local73;
				@Pc(94) double local94 = local35 + 0.3333333333333333D;
				if (local94 > 1.0D) {
					local94--;
				}
				@Pc(108) double local108 = local35 - 0.3333333333333333D;
				if (local94 * 6.0D < 1.0D) {
					local55 = (local73 - local90) * 6.0D * local94 + local90;
				} else if (local94 * 2.0D < 1.0D) {
					local55 = local73;
				} else if (local94 * 3.0D < 2.0D) {
					local55 = local90 + (local73 - local90) * (0.6666666666666666D - local94) * 6.0D;
				} else {
					local55 = local90;
				}
				if (local108 < 0.0D) {
					local108++;
				}
				if (local35 * 6.0D < 1.0D) {
					local57 = local90 + (local73 - local90) * 6.0D * local35;
				} else if (local35 * 2.0D < 1.0D) {
					local57 = local73;
				} else if (local35 * 3.0D < 2.0D) {
					local57 = local90 + (local73 - local90) * (-local35 + 0.6666666666666666D) * 6.0D;
				} else {
					local57 = local90;
				}
				if (local108 * 6.0D < 1.0D) {
					local59 = (local73 - local90) * 6.0D * local108 + local90;
				} else if (local108 * 2.0D < 1.0D) {
					local59 = local73;
				} else if (local108 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local108) * 6.0D * (local73 - local90) + local90;
				} else {
					local59 = local90;
				}
			}
			local55 = Math.pow(local55, local17);
			local57 = Math.pow(local57, local17);
			local59 = Math.pow(local59, local17);
			@Pc(278) int local278 = (int) (local55 * 256.0D);
			@Pc(283) int local283 = (int) (local57 * 256.0D);
			@Pc(288) int local288 = (int) (local59 * 256.0D);
			@Pc(298) int local298 = local288 + (local283 << 8) + (local278 << 16);
			Static331.anIntArray442[local23] = local298;
		}
	}
}
