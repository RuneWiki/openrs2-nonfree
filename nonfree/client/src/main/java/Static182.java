import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
	private static int[] anIntArray420;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	private static int anInt3596;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	private static int anInt3597;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	private static int anInt3598;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	private static int anInt3599;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	private static int anInt3600;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	private static int anInt3601;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	private static int anInt3602;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
	private static void method3051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray420[arg0];
		@Pc(17) int local17 = anIntArray420[arg0 + 1];
		@Pc(23) int local23 = anIntArray420[arg0 + 2];
		@Pc(29) int local29 = anIntArray420[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray420[local33 + 1];
			if (local42 < local17) {
				anIntArray420[local7] = anIntArray420[local33];
				anIntArray420[local7 + 1] = local42;
				anIntArray420[local7 + 2] = anIntArray420[local33 + 2];
				anIntArray420[local7 + 3] = anIntArray420[local33 + 3];
				local7 += 4;
				anIntArray420[local33] = anIntArray420[local7];
				anIntArray420[local33 + 1] = anIntArray420[local7 + 1];
				anIntArray420[local33 + 2] = anIntArray420[local7 + 2];
				anIntArray420[local33 + 3] = anIntArray420[local7 + 3];
			}
		}
		anIntArray420[local7] = local11;
		anIntArray420[local7 + 1] = local17;
		anIntArray420[local7 + 2] = local23;
		anIntArray420[local7 + 3] = local29;
		method3051(arg0, local7);
		method3051(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method3052(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static234.anInt4684 - Static234.anInt4687 != arg4.length) {
			throw new IllegalStateException();
		}
		method3060();
		method3059(arg0, arg1);
		method3054(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
	private static void method3053() {
		if (anInt3599 < 0) {
			anInt3596 = 0;
			anInt3600 = 0;
			anInt3601 = 0;
			anInt3602 = 2147483646;
			return;
		}
		method3051(0, anInt3599);
		@Pc(17) int local17 = anIntArray420[1];
		if (local17 < Static234.anInt4687) {
			local17 = Static234.anInt4687;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3599; local26 += 4) {
			@Pc(35) int local35 = anIntArray420[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray420[local26];
			@Pc(49) int local49 = anIntArray420[local26 + 2];
			@Pc(55) int local55 = anIntArray420[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray420[local26] = local71 + (local17 - local35) * local65;
			anIntArray420[local26 + 2] = local65;
		}
		anInt3601 = 0;
		anInt3600 = local26;
		anInt3596 = local26;
		anInt3602 = local17 - 1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[I[I)V")
	private static void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method3053();
		while (true) {
			@Pc(4) int local4;
			@Pc(6) int local6;
			@Pc(8) int local8;
			do {
				if (!method3057()) {
					return;
				}
				local4 = anInt3597;
				local6 = anInt3598;
				local8 = anInt3602;
				if (arg2 == null) {
					break;
				}
				@Pc(14) int local14 = local8 - Static234.anInt4687;
				if (local4 < arg2[local14] + Static234.anInt4685) {
					local4 = arg2[local14] + Static234.anInt4685;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static234.anInt4685) {
					local6 = arg2[local14] + arg3[local14] + Static234.anInt4685;
				}
			} while (local4 >= local6);
			Static234.method3982(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
	private static void method3056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray420[local10 - 4];
					@Pc(23) int local23 = anIntArray420[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray420[local10 - 4] = local23;
						anIntArray420[local10] = local19;
						local19 = anIntArray420[local10 - 2];
						anIntArray420[local10 - 2] = anIntArray420[local10 + 2];
						anIntArray420[local10 + 2] = local19;
						local19 = anIntArray420[local10 - 1];
						anIntArray420[local10 - 1] = anIntArray420[local10 + 3];
						anIntArray420[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "()Z")
	private static boolean method3057() {
		@Pc(1) int local1 = anInt3600;
		@Pc(3) int local3 = anInt3596;
		@Pc(5) int local5 = anInt3602;
		while (local3 >= local1) {
			local5++;
			anInt3602 = local5;
			if (local5 >= Static234.anInt4684) {
				return false;
			}
			@Pc(18) int local18 = anInt3601;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3599) {
				local27 = anIntArray420[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray420[local1];
				@Pc(41) int local41 = anIntArray420[local1 + 2];
				@Pc(47) int local47 = anIntArray420[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray420[local1] = local63;
				anIntArray420[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray420[local27 + 3];
				if (local5 >= local35) {
					anIntArray420[local27] = anIntArray420[local18];
					anIntArray420[local27 + 1] = anIntArray420[local18 + 1];
					anIntArray420[local27 + 2] = anIntArray420[local18 + 2];
					anIntArray420[local27 + 3] = anIntArray420[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3599) {
				anInt3599 = 0;
				return false;
			}
			method3056(local18, local1);
			anInt3601 = local18;
			anInt3600 = local1;
			local3 = local18;
		}
		anInt3597 = anIntArray420[local3] >> 16;
		anInt3598 = anIntArray420[local3 + 4] >> 16;
		anIntArray420[local3] += anIntArray420[local3 + 2];
		anIntArray420[local3 + 4] += anIntArray420[local3 + 6];
		local3 += 8;
		anInt3596 = local3;
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([III[I[I)V")
	public static void method3058(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method3052(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([III)V")
	private static void method3059(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt3599 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray420 == null || anIntArray420.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3599; local16++) {
				local14[local16] = anIntArray420[local16];
			}
			anIntArray420 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray420[anInt3599++] = arg0[local37];
				anIntArray420[anInt3599++] = local48;
				anIntArray420[anInt3599++] = arg0[local16];
				anIntArray420[anInt3599++] = local54;
			} else if (local54 < local48) {
				anIntArray420[anInt3599++] = arg0[local16];
				anIntArray420[anInt3599++] = local54;
				anIntArray420[anInt3599++] = arg0[local37];
				anIntArray420[anInt3599++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "()V")
	private static void method3060() {
		anInt3599 = 0;
	}
}
