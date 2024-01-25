import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
	private static int anInt8452;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
	private static int anInt8453;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	private static int anInt8454;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
	private static int anInt8455;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
	private static int anInt8456;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
	private static int anInt8457;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
	private static int anInt8458;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "[I")
	private static int[] anIntArray662;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qa;[II)V")
	public static void method7135(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method7141(arg0, arg1, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([III)V")
	private static void method7136(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt8454 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray662 == null || anIntArray662.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt8454; local16++) {
				local14[local16] = anIntArray662[local16];
			}
			anIntArray662 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray662[anInt8454++] = arg0[local37];
				anIntArray662[anInt8454++] = local46;
				anIntArray662[anInt8454++] = arg0[local16];
				anIntArray662[anInt8454++] = local52;
			} else if (local52 < local46) {
				anIntArray662[anInt8454++] = arg0[local16];
				anIntArray662[anInt8454++] = local52;
				anIntArray662[anInt8454++] = arg0[local37];
				anIntArray662[anInt8454++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "()V")
	private static void method7137() {
		anInt8454 = 0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	private static void method7138(@OriginalArg(0) int arg0) {
		if (anInt8454 < 0) {
			anInt8455 = 0;
			anInt8456 = 0;
			anInt8457 = 0;
			anInt8452 = 2147483646;
			return;
		}
		method7140(0, anInt8454);
		@Pc(17) int local17 = anIntArray662[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt8454; local26 += 4) {
			@Pc(33) int local33 = anIntArray662[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray662[local26];
			@Pc(46) int local46 = anIntArray662[local26 + 2];
			@Pc(52) int local52 = anIntArray662[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray662[local26] = local68 + (local17 - local33) * local62;
			anIntArray662[local26 + 2] = local62;
		}
		anInt8457 = 0;
		anInt8456 = local26;
		anInt8455 = local26;
		anInt8452 = local17 - 1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)V")
	private static void method7139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray662[local6 - 4];
					@Pc(17) int local17 = anIntArray662[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray662[local6 - 4] = local17;
						anIntArray662[local6] = local13;
						local13 = anIntArray662[local6 - 2];
						anIntArray662[local6 - 2] = anIntArray662[local6 + 2];
						anIntArray662[local6 + 2] = local13;
						local13 = anIntArray662[local6 - 1];
						anIntArray662[local6 - 1] = anIntArray662[local6 + 3];
						anIntArray662[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)V")
	private static void method7140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray662[arg0];
		@Pc(17) int local17 = anIntArray662[arg0 + 1];
		@Pc(23) int local23 = anIntArray662[arg0 + 2];
		@Pc(29) int local29 = anIntArray662[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray662[local33 + 1];
			if (local40 < local17) {
				anIntArray662[local7] = anIntArray662[local33];
				anIntArray662[local7 + 1] = local40;
				anIntArray662[local7 + 2] = anIntArray662[local33 + 2];
				anIntArray662[local7 + 3] = anIntArray662[local33 + 3];
				local7 += 4;
				anIntArray662[local33] = anIntArray662[local7];
				anIntArray662[local33 + 1] = anIntArray662[local7 + 1];
				anIntArray662[local33 + 2] = anIntArray662[local7 + 2];
				anIntArray662[local33 + 3] = anIntArray662[local7 + 3];
			}
		}
		anIntArray662[local7] = local11;
		anIntArray662[local7 + 1] = local17;
		anIntArray662[local7 + 2] = local23;
		anIntArray662[local7 + 3] = local29;
		method7140(arg0, local7);
		method7140(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qa;[IIII[I[I)V")
	private static void method7141(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.d(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method7137();
		method7136(arg1, arg2);
		method7138(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method7143(local2[3])) {
					return;
				}
				local33 = anInt8458;
				local35 = anInt8453;
				local37 = anInt8452;
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
			arg0.UA(local33, local37, local35 - local33, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qa;[II[I[I)V")
	public static void method7142(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method7141(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)Z")
	private static boolean method7143(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt8456;
		@Pc(3) int local3 = anInt8455;
		@Pc(5) int local5 = anInt8452;
		while (local3 >= local1) {
			local5++;
			anInt8452 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt8457;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt8454) {
				local23 = anIntArray662[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray662[local1];
				@Pc(36) int local36 = anIntArray662[local1 + 2];
				@Pc(42) int local42 = anIntArray662[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray662[local1] = local58;
				anIntArray662[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray662[local23 + 3];
				if (local5 >= local30) {
					anIntArray662[local23] = anIntArray662[local16];
					anIntArray662[local23 + 1] = anIntArray662[local16 + 1];
					anIntArray662[local23 + 2] = anIntArray662[local16 + 2];
					anIntArray662[local23 + 3] = anIntArray662[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt8454) {
				anInt8454 = 0;
				return false;
			}
			method7139(local16, local1);
			anInt8457 = local16;
			anInt8456 = local1;
			local3 = local16;
		}
		anInt8458 = anIntArray662[local3] >> 16;
		anInt8453 = anIntArray662[local3 + 4] >> 16;
		anIntArray662[local3] += anIntArray662[local3 + 2];
		anIntArray662[local3 + 4] += anIntArray662[local3 + 6];
		local3 += 8;
		anInt8455 = local3;
		return true;
	}
}
