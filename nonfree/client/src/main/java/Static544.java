import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "I")
	private static int anInt9115;

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
	private static int anInt9116;

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
	private static int anInt9117;

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
	private static int anInt9118;

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "[I")
	private static int[] anIntArray502;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
	private static int anInt9119;

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
	private static int anInt9120;

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
	private static int anInt9121;

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V")
	private static void method7621(@OriginalArg(0) int arg0) {
		if (anInt9117 < 0) {
			anInt9115 = 0;
			anInt9116 = 0;
			anInt9118 = 0;
			anInt9121 = 2147483646;
			return;
		}
		method7626(0, anInt9117);
		@Pc(18) int local18 = anIntArray502[1];
		if (local18 < arg0) {
			local18 = arg0;
		}
		@Pc(27) int local27;
		for (local27 = 0; local27 < anInt9117; local27 += 4) {
			@Pc(34) int local34 = anIntArray502[local27 + 1];
			if (local18 < local34) {
				break;
			}
			@Pc(41) int local41 = anIntArray502[local27];
			@Pc(47) int local47 = anIntArray502[local27 + 2];
			@Pc(53) int local53 = anIntArray502[local27 + 3];
			@Pc(63) int local63 = (local47 - local41 << 16) / (local53 - local34);
			@Pc(69) int local69 = (local41 << 16) + 32768;
			anIntArray502[local27] = local69 + (local18 - local34) * local63;
			anIntArray502[local27 + 2] = local63;
		}
		anInt9118 = 0;
		anInt9116 = local27;
		anInt9115 = local27;
		anInt9121 = local18 - 1;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ha;[II[I[I)V")
	public static void method7622(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method7624(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ha;[II)V")
	public static void method7623(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method7624(arg0, arg1, arg1.length, arg2, (int[]) null, (int[]) null);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ha;[IIII[I[I)V")
	private static void method7624(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.K(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method7629();
		method7628(arg1, arg2);
		method7621(local2[1]);
		while (true) {
			@Pc(36) int local36;
			@Pc(38) int local38;
			@Pc(40) int local40;
			do {
				if (!method7627(local2[3])) {
					return;
				}
				local36 = anInt9120;
				local38 = anInt9119;
				local40 = anInt9121;
				if (arg4 == null) {
					break;
				}
				@Pc(48) int local48 = local40 - local2[1];
				if (local36 < arg4[local48] + local2[0]) {
					local36 = arg4[local48] + local2[0];
				}
				if (local38 > arg4[local48] + arg5[local48] + local2[0]) {
					local38 = arg4[local48] + arg5[local48] + local2[0];
				}
			} while (local38 - local36 <= 0);
			arg0.U(local36, local40, local38 - local36, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)V")
	private static void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray502[local6 - 4];
					@Pc(17) int local17 = anIntArray502[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray502[local6 - 4] = local17;
						anIntArray502[local6] = local13;
						local13 = anIntArray502[local6 - 2];
						anIntArray502[local6 - 2] = anIntArray502[local6 + 2];
						anIntArray502[local6 + 2] = local13;
						local13 = anIntArray502[local6 - 1];
						anIntArray502[local6 - 1] = anIntArray502[local6 + 3];
						anIntArray502[local6 + 3] = local13;
					}
				}
				if (!local2) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)V")
	private static void method7626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(8) int local8 = arg0;
		@Pc(12) int local12 = anIntArray502[arg0];
		@Pc(18) int local18 = anIntArray502[arg0 + 1];
		@Pc(24) int local24 = anIntArray502[arg0 + 2];
		@Pc(30) int local30 = anIntArray502[arg0 + 3];
		for (@Pc(34) int local34 = arg0 + 4; local34 < arg1; local34 += 4) {
			@Pc(41) int local41 = anIntArray502[local34 + 1];
			if (local41 < local18) {
				anIntArray502[local8] = anIntArray502[local34];
				anIntArray502[local8 + 1] = local41;
				anIntArray502[local8 + 2] = anIntArray502[local34 + 2];
				anIntArray502[local8 + 3] = anIntArray502[local34 + 3];
				local8 += 4;
				anIntArray502[local34] = anIntArray502[local8];
				anIntArray502[local34 + 1] = anIntArray502[local8 + 1];
				anIntArray502[local34 + 2] = anIntArray502[local8 + 2];
				anIntArray502[local34 + 3] = anIntArray502[local8 + 3];
			}
		}
		anIntArray502[local8] = local12;
		anIntArray502[local8 + 1] = local18;
		anIntArray502[local8 + 2] = local24;
		anIntArray502[local8 + 3] = local30;
		method7626(arg0, local8);
		method7626(local8 + 4, arg1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)Z")
	private static boolean method7627(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt9116;
		@Pc(3) int local3 = anInt9115;
		@Pc(5) int local5 = anInt9121;
		while (local3 >= local1) {
			local5++;
			anInt9121 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(17) int local17 = anInt9118;
			@Pc(24) int local24;
			@Pc(31) int local31;
			while (local1 < anInt9117) {
				local24 = anIntArray502[local1 + 1];
				if (local5 < local24) {
					break;
				}
				local31 = anIntArray502[local1];
				@Pc(37) int local37 = anIntArray502[local1 + 2];
				@Pc(43) int local43 = anIntArray502[local1 + 3];
				@Pc(53) int local53 = (local37 - local31 << 16) / (local43 - local24);
				@Pc(59) int local59 = (local31 << 16) + 32768;
				anIntArray502[local1] = local59;
				anIntArray502[local1 + 2] = local53;
				local1 += 4;
			}
			for (local24 = local17; local24 < local1; local24 += 4) {
				local31 = anIntArray502[local24 + 3];
				if (local5 >= local31) {
					anIntArray502[local24] = anIntArray502[local17];
					anIntArray502[local24 + 1] = anIntArray502[local17 + 1];
					anIntArray502[local24 + 2] = anIntArray502[local17 + 2];
					anIntArray502[local24 + 3] = anIntArray502[local17 + 3];
					local17 += 4;
				}
			}
			if (local17 == anInt9117) {
				anInt9117 = 0;
				return false;
			}
			method7625(local17, local1);
			anInt9118 = local17;
			anInt9116 = local1;
			local3 = local17;
		}
		anInt9120 = anIntArray502[local3] >> 16;
		anInt9119 = anIntArray502[local3 + 4] >> 16;
		anIntArray502[local3] += anIntArray502[local3 + 2];
		anIntArray502[local3 + 4] += anIntArray502[local3 + 6];
		local3 += 8;
		anInt9115 = local3;
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([III)V")
	private static void method7628(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt9117 + (arg1 << 1);
		@Pc(18) int local18;
		if (anIntArray502 == null || anIntArray502.length < local5) {
			@Pc(16) int[] local16 = new int[local5];
			for (local18 = 0; local18 < anInt9117; local18++) {
				local16[local18] = anIntArray502[local18];
			}
			anIntArray502 = local16;
		}
		@Pc(37) int local37 = arg1;
		@Pc(41) int local41 = local37 - 2;
		for (local18 = 0; local18 < local37; local18 += 2) {
			@Pc(50) int local50 = arg0[local41 + 1];
			@Pc(56) int local56 = arg0[local18 + 1];
			if (local50 < local56) {
				anIntArray502[anInt9117++] = arg0[local41];
				anIntArray502[anInt9117++] = local50;
				anIntArray502[anInt9117++] = arg0[local18];
				anIntArray502[anInt9117++] = local56;
			} else if (local56 < local50) {
				anIntArray502[anInt9117++] = arg0[local18];
				anIntArray502[anInt9117++] = local56;
				anIntArray502[anInt9117++] = arg0[local41];
				anIntArray502[anInt9117++] = local50;
			}
			local41 = local18;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "()V")
	private static void method7629() {
		anInt9117 = 0;
	}
}
