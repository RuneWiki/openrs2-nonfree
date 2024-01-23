import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	private static int anInt3403;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	private static int anInt3404;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	private static int anInt3405;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
	private static int anInt3406;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
	private static int anInt3407;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
	private static int anInt3408;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
	private static int[] anIntArray314;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
	private static int anInt3409;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()Z")
	private static boolean method2452() {
		@Pc(1) int local1 = anInt3405;
		@Pc(3) int local3 = anInt3404;
		@Pc(5) int local5 = anInt3403;
		while (local3 >= local1) {
			local5++;
			anInt3403 = local5;
			if (local5 >= Static231.anInt4853) {
				return false;
			}
			@Pc(18) int local18 = anInt3406;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3407) {
				local27 = anIntArray314[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray314[local1];
				@Pc(41) int local41 = anIntArray314[local1 + 2];
				@Pc(47) int local47 = anIntArray314[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray314[local1] = local63;
				anIntArray314[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray314[local27 + 3];
				if (local5 >= local35) {
					anIntArray314[local27] = anIntArray314[local18];
					anIntArray314[local27 + 1] = anIntArray314[local18 + 1];
					anIntArray314[local27 + 2] = anIntArray314[local18 + 2];
					anIntArray314[local27 + 3] = anIntArray314[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3407) {
				anInt3407 = 0;
				return false;
			}
			method2462(local18, local1);
			anInt3406 = local18;
			anInt3405 = local1;
			local3 = local18;
		}
		anInt3408 = anIntArray314[local3] >> 16;
		anInt3409 = anIntArray314[local3 + 4] >> 16;
		anIntArray314[local3] += anIntArray314[local3 + 2];
		anIntArray314[local3 + 4] += anIntArray314[local3 + 6];
		local3 += 8;
		anInt3404 = local3;
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II[I[I)V")
	private static void method2453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method2460();
		while (method2452()) {
			@Pc(4) int local4 = anInt3408;
			@Pc(6) int local6 = anInt3409;
			@Pc(8) int local8 = anInt3403;
			if (arg2 != null) {
				@Pc(14) int local14 = local8 - Static231.anInt4852;
				if (local4 < arg2[local14] + Static231.anInt4849) {
					local4 = arg2[local14] + Static231.anInt4849;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static231.anInt4849) {
					local6 = arg2[local14] + arg3[local14] + Static231.anInt4849;
				}
			}
			Static231.method3647(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()V")
	private static void method2454() {
		anInt3407 = 0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method2455(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static231.anInt4853 - Static231.anInt4852 != arg4.length) {
			throw new IllegalStateException();
		}
		method2454();
		method2457(arg0, arg1);
		method2453(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	private static void method2456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray314[arg0];
		@Pc(17) int local17 = anIntArray314[arg0 + 1];
		@Pc(23) int local23 = anIntArray314[arg0 + 2];
		@Pc(29) int local29 = anIntArray314[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray314[local33 + 1];
			if (local42 < local17) {
				anIntArray314[local7] = anIntArray314[local33];
				anIntArray314[local7 + 1] = local42;
				anIntArray314[local7 + 2] = anIntArray314[local33 + 2];
				anIntArray314[local7 + 3] = anIntArray314[local33 + 3];
				local7 += 4;
				anIntArray314[local33] = anIntArray314[local7];
				anIntArray314[local33 + 1] = anIntArray314[local7 + 1];
				anIntArray314[local33 + 2] = anIntArray314[local7 + 2];
				anIntArray314[local33 + 3] = anIntArray314[local7 + 3];
			}
		}
		anIntArray314[local7] = local11;
		anIntArray314[local7 + 1] = local17;
		anIntArray314[local7 + 2] = local23;
		anIntArray314[local7 + 3] = local29;
		method2456(arg0, local7);
		method2456(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([III)V")
	private static void method2457(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt3407 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray314 == null || anIntArray314.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3407; local16++) {
				local14[local16] = anIntArray314[local16];
			}
			anIntArray314 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray314[anInt3407++] = arg0[local37];
				anIntArray314[anInt3407++] = local48;
				anIntArray314[anInt3407++] = arg0[local16];
				anIntArray314[anInt3407++] = local54;
			} else if (local54 < local48) {
				anIntArray314[anInt3407++] = arg0[local16];
				anIntArray314[anInt3407++] = local54;
				anIntArray314[anInt3407++] = arg0[local37];
				anIntArray314[anInt3407++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([III[I[I)V")
	public static void method2459(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method2455(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "()V")
	private static void method2460() {
		if (anInt3407 < 0) {
			anInt3404 = 0;
			anInt3405 = 0;
			anInt3406 = 0;
			anInt3403 = 2147483646;
			return;
		}
		method2456(0, anInt3407);
		@Pc(17) int local17 = anIntArray314[1];
		if (local17 < Static231.anInt4852) {
			local17 = Static231.anInt4852;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3407; local26 += 4) {
			@Pc(35) int local35 = anIntArray314[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray314[local26];
			@Pc(49) int local49 = anIntArray314[local26 + 2];
			@Pc(55) int local55 = anIntArray314[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray314[local26] = local71 + (local17 - local35) * local65;
			anIntArray314[local26 + 2] = local65;
		}
		anInt3406 = 0;
		anInt3405 = local26;
		anInt3404 = local26;
		anInt3403 = local17 - 1;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "([III)V")
	public static void method2461(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2455(arg0, arg0.length, arg1, arg2, null, null);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V")
	private static void method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray314[local10 - 4];
					@Pc(23) int local23 = anIntArray314[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray314[local10 - 4] = local23;
						anIntArray314[local10] = local19;
						local19 = anIntArray314[local10 - 2];
						anIntArray314[local10 - 2] = anIntArray314[local10 + 2];
						anIntArray314[local10 + 2] = local19;
						local19 = anIntArray314[local10 - 1];
						anIntArray314[local10 - 1] = anIntArray314[local10 + 3];
						anIntArray314[local10 + 3] = local19;
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
}
