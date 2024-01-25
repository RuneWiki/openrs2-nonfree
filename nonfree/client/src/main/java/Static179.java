import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	private static int anInt3734;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	private static int anInt3735;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	private static int anInt3736;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "[I")
	private static int[] anIntArray211;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
	private static int anInt3737;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
	private static int anInt3738;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	private static int anInt3739;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	private static int anInt3740;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V")
	private static void method3074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray211[arg0];
		@Pc(17) int local17 = anIntArray211[arg0 + 1];
		@Pc(23) int local23 = anIntArray211[arg0 + 2];
		@Pc(29) int local29 = anIntArray211[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray211[local33 + 1];
			if (local40 < local17) {
				anIntArray211[local7] = anIntArray211[local33];
				anIntArray211[local7 + 1] = local40;
				anIntArray211[local7 + 2] = anIntArray211[local33 + 2];
				anIntArray211[local7 + 3] = anIntArray211[local33 + 3];
				local7 += 4;
				anIntArray211[local33] = anIntArray211[local7];
				anIntArray211[local33 + 1] = anIntArray211[local7 + 1];
				anIntArray211[local33 + 2] = anIntArray211[local7 + 2];
				anIntArray211[local33 + 3] = anIntArray211[local7 + 3];
			}
		}
		anIntArray211[local7] = local11;
		anIntArray211[local7 + 1] = local17;
		anIntArray211[local7 + 2] = local23;
		anIntArray211[local7 + 3] = local29;
		method3074(arg0, local7);
		method3074(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)V")
	private static void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray211[local6 - 4];
					@Pc(17) int local17 = anIntArray211[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray211[local6 - 4] = local17;
						anIntArray211[local6] = local13;
						local13 = anIntArray211[local6 - 2];
						anIntArray211[local6 - 2] = anIntArray211[local6 + 2];
						anIntArray211[local6 + 2] = local13;
						local13 = anIntArray211[local6 - 1];
						anIntArray211[local6 - 1] = anIntArray211[local6 + 3];
						anIntArray211[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;[II)V")
	public static void method3076(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method3080(arg0, arg1, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;[II[I[I)V")
	public static void method3077(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method3080(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z")
	private static boolean method3078(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3739;
		@Pc(3) int local3 = anInt3737;
		@Pc(5) int local5 = anInt3738;
		while (local3 >= local1) {
			local5++;
			anInt3738 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt3735;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt3736) {
				local23 = anIntArray211[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray211[local1];
				@Pc(36) int local36 = anIntArray211[local1 + 2];
				@Pc(42) int local42 = anIntArray211[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray211[local1] = local58;
				anIntArray211[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray211[local23 + 3];
				if (local5 >= local30) {
					anIntArray211[local23] = anIntArray211[local16];
					anIntArray211[local23 + 1] = anIntArray211[local16 + 1];
					anIntArray211[local23 + 2] = anIntArray211[local16 + 2];
					anIntArray211[local23 + 3] = anIntArray211[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt3736) {
				anInt3736 = 0;
				return false;
			}
			method3075(local16, local1);
			anInt3735 = local16;
			anInt3739 = local1;
			local3 = local16;
		}
		anInt3734 = anIntArray211[local3] >> 16;
		anInt3740 = anIntArray211[local3 + 4] >> 16;
		anIntArray211[local3] += anIntArray211[local3 + 2];
		anIntArray211[local3 + 4] += anIntArray211[local3 + 6];
		local3 += 8;
		anInt3737 = local3;
		return true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;[IIII[I[I)V")
	private static void method3080(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.oa(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method3083();
		method3082(arg1, arg2);
		method3081(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method3078(local2[3])) {
					return;
				}
				local33 = anInt3734;
				local35 = anInt3740;
				local37 = anInt3738;
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
			arg0.XA(local33, local37, local35 - local33, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	private static void method3081(@OriginalArg(0) int arg0) {
		if (anInt3736 < 0) {
			anInt3737 = 0;
			anInt3739 = 0;
			anInt3735 = 0;
			anInt3738 = 2147483646;
			return;
		}
		method3074(0, anInt3736);
		@Pc(17) int local17 = anIntArray211[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3736; local26 += 4) {
			@Pc(33) int local33 = anIntArray211[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray211[local26];
			@Pc(46) int local46 = anIntArray211[local26 + 2];
			@Pc(52) int local52 = anIntArray211[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray211[local26] = local68 + (local17 - local33) * local62;
			anIntArray211[local26 + 2] = local62;
		}
		anInt3735 = 0;
		anInt3739 = local26;
		anInt3737 = local26;
		anInt3738 = local17 - 1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([III)V")
	private static void method3082(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt3736 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray211 == null || anIntArray211.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3736; local16++) {
				local14[local16] = anIntArray211[local16];
			}
			anIntArray211 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray211[anInt3736++] = arg0[local37];
				anIntArray211[anInt3736++] = local46;
				anIntArray211[anInt3736++] = arg0[local16];
				anIntArray211[anInt3736++] = local52;
			} else if (local52 < local46) {
				anIntArray211[anInt3736++] = arg0[local16];
				anIntArray211[anInt3736++] = local52;
				anIntArray211[anInt3736++] = arg0[local37];
				anIntArray211[anInt3736++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "()V")
	private static void method3083() {
		anInt3736 = 0;
	}
}
