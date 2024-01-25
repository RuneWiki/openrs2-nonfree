import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "[I")
	private static int[] anIntArray726;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	private static int anInt9925;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	private static int anInt9926;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	private static int anInt9927;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	private static int anInt9928;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
	private static int anInt9929;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	private static int anInt9930;

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
	private static int anInt9931;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!oa;[II[I[I)V")
	public static void method7903(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method7908(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!oa;[II)V")
	public static void method7904(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method7908(arg0, arg1, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	private static void method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray726[arg0];
		@Pc(17) int local17 = anIntArray726[arg0 + 1];
		@Pc(23) int local23 = anIntArray726[arg0 + 2];
		@Pc(29) int local29 = anIntArray726[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray726[local33 + 1];
			if (local40 < local17) {
				anIntArray726[local7] = anIntArray726[local33];
				anIntArray726[local7 + 1] = local40;
				anIntArray726[local7 + 2] = anIntArray726[local33 + 2];
				anIntArray726[local7 + 3] = anIntArray726[local33 + 3];
				local7 += 4;
				anIntArray726[local33] = anIntArray726[local7];
				anIntArray726[local33 + 1] = anIntArray726[local7 + 1];
				anIntArray726[local33 + 2] = anIntArray726[local7 + 2];
				anIntArray726[local33 + 3] = anIntArray726[local7 + 3];
			}
		}
		anIntArray726[local7] = local11;
		anIntArray726[local7 + 1] = local17;
		anIntArray726[local7 + 2] = local23;
		anIntArray726[local7 + 3] = local29;
		method7905(arg0, local7);
		method7905(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([III)V")
	private static void method7906(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt9926 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray726 == null || anIntArray726.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt9926; local16++) {
				local14[local16] = anIntArray726[local16];
			}
			anIntArray726 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray726[anInt9926++] = arg0[local37];
				anIntArray726[anInt9926++] = local46;
				anIntArray726[anInt9926++] = arg0[local16];
				anIntArray726[anInt9926++] = local52;
			} else if (local52 < local46) {
				anIntArray726[anInt9926++] = arg0[local16];
				anIntArray726[anInt9926++] = local52;
				anIntArray726[anInt9926++] = arg0[local37];
				anIntArray726[anInt9926++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
	private static void method7907() {
		anInt9926 = 0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!oa;[IIII[I[I)V")
	private static void method7908(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.A(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method7907();
		method7906(arg1, arg2);
		method7909(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method7912(local2[3])) {
					return;
				}
				local33 = anInt9931;
				local35 = anInt9927;
				local37 = anInt9928;
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
			arg0.e(local33, local37, local35 - local33, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	private static void method7909(@OriginalArg(0) int arg0) {
		if (anInt9926 < 0) {
			anInt9925 = 0;
			anInt9929 = 0;
			anInt9930 = 0;
			anInt9928 = 2147483646;
			return;
		}
		method7905(0, anInt9926);
		@Pc(17) int local17 = anIntArray726[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt9926; local26 += 4) {
			@Pc(33) int local33 = anIntArray726[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray726[local26];
			@Pc(46) int local46 = anIntArray726[local26 + 2];
			@Pc(52) int local52 = anIntArray726[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray726[local26] = local68 + (local17 - local33) * local62;
			anIntArray726[local26 + 2] = local62;
		}
		anInt9930 = 0;
		anInt9929 = local26;
		anInt9925 = local26;
		anInt9928 = local17 - 1;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)V")
	private static void method7911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray726[local6 - 4];
					@Pc(17) int local17 = anIntArray726[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray726[local6 - 4] = local17;
						anIntArray726[local6] = local13;
						local13 = anIntArray726[local6 - 2];
						anIntArray726[local6 - 2] = anIntArray726[local6 + 2];
						anIntArray726[local6 + 2] = local13;
						local13 = anIntArray726[local6 - 1];
						anIntArray726[local6 - 1] = anIntArray726[local6 + 3];
						anIntArray726[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z")
	private static boolean method7912(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt9929;
		@Pc(3) int local3 = anInt9925;
		@Pc(5) int local5 = anInt9928;
		while (local3 >= local1) {
			local5++;
			anInt9928 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt9930;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt9926) {
				local23 = anIntArray726[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray726[local1];
				@Pc(36) int local36 = anIntArray726[local1 + 2];
				@Pc(42) int local42 = anIntArray726[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray726[local1] = local58;
				anIntArray726[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray726[local23 + 3];
				if (local5 >= local30) {
					anIntArray726[local23] = anIntArray726[local16];
					anIntArray726[local23 + 1] = anIntArray726[local16 + 1];
					anIntArray726[local23 + 2] = anIntArray726[local16 + 2];
					anIntArray726[local23 + 3] = anIntArray726[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt9926) {
				anInt9926 = 0;
				return false;
			}
			method7911(local16, local1);
			anInt9930 = local16;
			anInt9929 = local1;
			local3 = local16;
		}
		anInt9931 = anIntArray726[local3] >> 16;
		anInt9927 = anIntArray726[local3 + 4] >> 16;
		anIntArray726[local3] += anIntArray726[local3 + 2];
		anIntArray726[local3 + 4] += anIntArray726[local3 + 6];
		local3 += 8;
		anInt9925 = local3;
		return true;
	}
}
