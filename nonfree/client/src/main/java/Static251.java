import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt5061;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[I")
	private static int[] anIntArray317;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private static int anInt5062;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	private static int anInt5063;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private static int anInt5064;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private static int anInt5065;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private static int anInt5066;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	private static int anInt5067;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private static void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray317[local6 - 4];
					@Pc(17) int local17 = anIntArray317[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray317[local6 - 4] = local17;
						anIntArray317[local6] = local13;
						local13 = anIntArray317[local6 - 2];
						anIntArray317[local6 - 2] = anIntArray317[local6 + 2];
						anIntArray317[local6 + 2] = local13;
						local13 = anIntArray317[local6 - 1];
						anIntArray317[local6 - 1] = anIntArray317[local6 + 3];
						anIntArray317[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!qa;[IIII[I[I)V")
	private static void method4263(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.d(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method4265();
		method4267(arg1, arg2);
		method4266(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method4264(local2[3])) {
					return;
				}
				local33 = anInt5067;
				local35 = anInt5062;
				local37 = anInt5066;
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

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Z")
	private static boolean method4264(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt5063;
		@Pc(3) int local3 = anInt5061;
		@Pc(5) int local5 = anInt5066;
		while (local3 >= local1) {
			local5++;
			anInt5066 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt5065;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt5064) {
				local23 = anIntArray317[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray317[local1];
				@Pc(36) int local36 = anIntArray317[local1 + 2];
				@Pc(42) int local42 = anIntArray317[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray317[local1] = local58;
				anIntArray317[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray317[local23 + 3];
				if (local5 >= local30) {
					anIntArray317[local23] = anIntArray317[local16];
					anIntArray317[local23 + 1] = anIntArray317[local16 + 1];
					anIntArray317[local23 + 2] = anIntArray317[local16 + 2];
					anIntArray317[local23 + 3] = anIntArray317[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt5064) {
				anInt5064 = 0;
				return false;
			}
			method4262(local16, local1);
			anInt5065 = local16;
			anInt5063 = local1;
			local3 = local16;
		}
		anInt5067 = anIntArray317[local3] >> 16;
		anInt5062 = anIntArray317[local3 + 4] >> 16;
		anIntArray317[local3] += anIntArray317[local3 + 2];
		anIntArray317[local3 + 4] += anIntArray317[local3 + 6];
		local3 += 8;
		anInt5061 = local3;
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	private static void method4265() {
		anInt5064 = 0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	private static void method4266(@OriginalArg(0) int arg0) {
		if (anInt5064 < 0) {
			anInt5061 = 0;
			anInt5063 = 0;
			anInt5065 = 0;
			anInt5066 = 2147483646;
			return;
		}
		method4269(0, anInt5064);
		@Pc(17) int local17 = anIntArray317[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt5064; local26 += 4) {
			@Pc(33) int local33 = anIntArray317[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray317[local26];
			@Pc(46) int local46 = anIntArray317[local26 + 2];
			@Pc(52) int local52 = anIntArray317[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray317[local26] = local68 + (local17 - local33) * local62;
			anIntArray317[local26 + 2] = local62;
		}
		anInt5065 = 0;
		anInt5063 = local26;
		anInt5061 = local26;
		anInt5066 = local17 - 1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V")
	private static void method4267(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt5064 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray317 == null || anIntArray317.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt5064; local16++) {
				local14[local16] = anIntArray317[local16];
			}
			anIntArray317 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray317[anInt5064++] = arg0[local37];
				anIntArray317[anInt5064++] = local46;
				anIntArray317[anInt5064++] = arg0[local16];
				anIntArray317[anInt5064++] = local52;
			} else if (local52 < local46) {
				anIntArray317[anInt5064++] = arg0[local16];
				anIntArray317[anInt5064++] = local52;
				anIntArray317[anInt5064++] = arg0[local37];
				anIntArray317[anInt5064++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!qa;[II)V")
	public static void method4268(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method4263(arg0, arg1, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	private static void method4269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray317[arg0];
		@Pc(17) int local17 = anIntArray317[arg0 + 1];
		@Pc(23) int local23 = anIntArray317[arg0 + 2];
		@Pc(29) int local29 = anIntArray317[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray317[local33 + 1];
			if (local40 < local17) {
				anIntArray317[local7] = anIntArray317[local33];
				anIntArray317[local7 + 1] = local40;
				anIntArray317[local7 + 2] = anIntArray317[local33 + 2];
				anIntArray317[local7 + 3] = anIntArray317[local33 + 3];
				local7 += 4;
				anIntArray317[local33] = anIntArray317[local7];
				anIntArray317[local33 + 1] = anIntArray317[local7 + 1];
				anIntArray317[local33 + 2] = anIntArray317[local7 + 2];
				anIntArray317[local33 + 3] = anIntArray317[local7 + 3];
			}
		}
		anIntArray317[local7] = local11;
		anIntArray317[local7 + 1] = local17;
		anIntArray317[local7 + 2] = local23;
		anIntArray317[local7 + 3] = local29;
		method4269(arg0, local7);
		method4269(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!qa;[II[I[I)V")
	public static void method4270(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method4263(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}
}
