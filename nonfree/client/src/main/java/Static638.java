import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "F")
	public static float aFloat195 = 1.0F;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_125 = new Class274(68, 1);

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "Z")
	public static boolean aBoolean590 = false;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([BIIBII)Z")
	public static boolean method6580(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class2_Sub34 local17 = new Class2_Sub34(arg0);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method6866();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(104) Class350 local104;
				do {
					@Pc(70) int local70;
					@Pc(75) int local75;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method6863();
										if (local42 == 0) {
											continue label70;
										}
										local17.method6904();
									}
									local42 = local17.method6863();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local17.method6904() >> 2;
									local70 = local60 + arg2;
									local75 = local54 + arg4;
								} while (local70 <= 0);
							} while (local75 <= 0);
						} while (arg1 - 1 <= local70);
					} while (local75 >= arg3 - 1);
					local104 = Static619.aClass281_4.method6734(local19);
				} while (local66 == 22 && Static404.aClass2_Sub13_2.aClass33_Sub17_1.method6029() == 0 && local104.anInt9624 == 0 && local104.anInt9665 != 1 && !local104.aBoolean703);
				if (!local104.method8089()) {
					local7 = false;
					Static491.anInt8369++;
				}
				local36 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[FI[FIIIII[II[I)V")
	public static void method6581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11) {
		@Pc(11) int local11 = arg10 + arg4 * arg0;
		@Pc(18) int local18 = arg1 * arg7 + arg5;
		@Pc(27) int local27 = arg0 - arg6;
		@Pc(31) int local31 = arg7 - arg6;
		@Pc(35) int local35;
		@Pc(42) int local42;
		if (arg9 == null) {
			for (local35 = 0; local35 < arg8; local35++) {
				local42 = local11 + arg6;
				while (local11 < local42) {
					arg3[local18++] = arg2[local11++];
				}
				local11 += local27;
				local18 += local31;
			}
		} else if (arg2 == null) {
			for (local35 = 0; local35 < arg8; local35++) {
				local42 = arg6 + local11;
				while (local11 < local42) {
					arg11[local18++] = arg9[local11++];
				}
				local11 += local27;
				local18 += local31;
			}
		} else {
			for (local35 = 0; local35 < arg8; local35++) {
				local42 = local11 + arg6;
				while (local11 < local42) {
					arg11[local18] = arg9[local11];
					arg3[local18++] = arg2[local11++];
				}
				local18 += local31;
				local11 += local27;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
	public static int method6582(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
