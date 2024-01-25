import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
	private static int anInt8433;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	private static int anInt8434;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "[I")
	private static int[] anIntArray452;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
	private static int anInt8435;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	private static int anInt8436;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
	private static int anInt8437;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	private static int anInt8438;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
	private static int anInt8439;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	private static void method6960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray452[arg0];
		@Pc(17) int local17 = anIntArray452[arg0 + 1];
		@Pc(23) int local23 = anIntArray452[arg0 + 2];
		@Pc(29) int local29 = anIntArray452[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray452[local33 + 1];
			if (local40 < local17) {
				anIntArray452[local7] = anIntArray452[local33];
				anIntArray452[local7 + 1] = local40;
				anIntArray452[local7 + 2] = anIntArray452[local33 + 2];
				anIntArray452[local7 + 3] = anIntArray452[local33 + 3];
				local7 += 4;
				anIntArray452[local33] = anIntArray452[local7];
				anIntArray452[local33 + 1] = anIntArray452[local7 + 1];
				anIntArray452[local33 + 2] = anIntArray452[local7 + 2];
				anIntArray452[local33 + 3] = anIntArray452[local7 + 3];
			}
		}
		anIntArray452[local7] = local11;
		anIntArray452[local7 + 1] = local17;
		anIntArray452[local7 + 2] = local23;
		anIntArray452[local7 + 3] = local29;
		method6960(arg0, local7);
		method6960(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ha;[II[I[I)V")
	public static void method6961(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method6963(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	private static void method6962(@OriginalArg(0) int arg0) {
		if (anInt8434 < 0) {
			anInt8435 = 0;
			anInt8437 = 0;
			anInt8439 = 0;
			anInt8436 = 2147483646;
			return;
		}
		method6960(0, anInt8434);
		@Pc(17) int local17 = anIntArray452[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt8434; local26 += 4) {
			@Pc(33) int local33 = anIntArray452[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray452[local26];
			@Pc(46) int local46 = anIntArray452[local26 + 2];
			@Pc(52) int local52 = anIntArray452[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray452[local26] = local68 + (local17 - local33) * local62;
			anIntArray452[local26 + 2] = local62;
		}
		anInt8439 = 0;
		anInt8437 = local26;
		anInt8435 = local26;
		anInt8436 = local17 - 1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ha;[IIII[I[I)V")
	private static void method6963(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.K(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method6967();
		method6965(arg1, arg2);
		method6962(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method6966(local2[3])) {
					return;
				}
				local33 = anInt8433;
				local35 = anInt8438;
				local37 = anInt8436;
				if (arg4 == null) {
					break;
				}
				@Pc(45) int local45 = local37 - local2[1];
				if (local33 < arg4[local45] + local2[0]) {
					local33 = arg4[local45] + local2[0];
				}
				if (local35 > arg4[local45] + arg5[local45] + local2[0]) {
					local35 = arg4[local45] + arg5[local45] + local2[0];
				}
			} while (local35 - local33 <= 0);
			arg0.U(local33, local37, local35 - local33, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V")
	private static void method6965(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt8434 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray452 == null || anIntArray452.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt8434; local16++) {
				local14[local16] = anIntArray452[local16];
			}
			anIntArray452 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray452[anInt8434++] = arg0[local37];
				anIntArray452[anInt8434++] = local46;
				anIntArray452[anInt8434++] = arg0[local16];
				anIntArray452[anInt8434++] = local52;
			} else if (local52 < local46) {
				anIntArray452[anInt8434++] = arg0[local16];
				anIntArray452[anInt8434++] = local52;
				anIntArray452[anInt8434++] = arg0[local37];
				anIntArray452[anInt8434++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)Z")
	private static boolean method6966(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt8437;
		@Pc(3) int local3 = anInt8435;
		@Pc(5) int local5 = anInt8436;
		while (local3 >= local1) {
			local5++;
			anInt8436 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt8439;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt8434) {
				local23 = anIntArray452[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray452[local1];
				@Pc(36) int local36 = anIntArray452[local1 + 2];
				@Pc(42) int local42 = anIntArray452[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray452[local1] = local58;
				anIntArray452[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray452[local23 + 3];
				if (local5 >= local30) {
					anIntArray452[local23] = anIntArray452[local16];
					anIntArray452[local23 + 1] = anIntArray452[local16 + 1];
					anIntArray452[local23 + 2] = anIntArray452[local16 + 2];
					anIntArray452[local23 + 3] = anIntArray452[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt8434) {
				anInt8434 = 0;
				return false;
			}
			method6968(local16, local1);
			anInt8439 = local16;
			anInt8437 = local1;
			local3 = local16;
		}
		anInt8433 = anIntArray452[local3] >> 16;
		anInt8438 = anIntArray452[local3 + 4] >> 16;
		anIntArray452[local3] += anIntArray452[local3 + 2];
		anIntArray452[local3 + 4] += anIntArray452[local3 + 6];
		local3 += 8;
		anInt8435 = local3;
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "()V")
	private static void method6967() {
		anInt8434 = 0;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)V")
	private static void method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray452[local6 - 4];
					@Pc(17) int local17 = anIntArray452[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray452[local6 - 4] = local17;
						anIntArray452[local6] = local13;
						local13 = anIntArray452[local6 - 2];
						anIntArray452[local6 - 2] = anIntArray452[local6 + 2];
						anIntArray452[local6 + 2] = local13;
						local13 = anIntArray452[local6 - 1];
						anIntArray452[local6 - 1] = anIntArray452[local6 + 3];
						anIntArray452[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ha;[II)V")
	public static void method6969(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method6963(arg0, arg1, arg1.length, arg2, null, null);
	}
}
