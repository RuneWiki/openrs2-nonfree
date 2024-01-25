import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
	private static int anInt670;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
	private static int anInt671;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "[I")
	private static int[] anIntArray55;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
	private static int anInt672;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
	private static int anInt673;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
	private static int anInt674;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
	private static int anInt675;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
	private static int anInt676;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
	private static boolean method552(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt673;
		@Pc(3) int local3 = anInt676;
		@Pc(5) int local5 = anInt671;
		while (local3 >= local1) {
			local5++;
			anInt671 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt675;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt672) {
				local23 = anIntArray55[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray55[local1];
				@Pc(36) int local36 = anIntArray55[local1 + 2];
				@Pc(42) int local42 = anIntArray55[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray55[local1] = local58;
				anIntArray55[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray55[local23 + 3];
				if (local5 >= local30) {
					anIntArray55[local23] = anIntArray55[local16];
					anIntArray55[local23 + 1] = anIntArray55[local16 + 1];
					anIntArray55[local23 + 2] = anIntArray55[local16 + 2];
					anIntArray55[local23 + 3] = anIntArray55[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt672) {
				anInt672 = 0;
				return false;
			}
			method559(local16, local1);
			anInt675 = local16;
			anInt673 = local1;
			local3 = local16;
		}
		anInt674 = anIntArray55[local3] >> 16;
		anInt670 = anIntArray55[local3 + 4] >> 16;
		anIntArray55[local3] += anIntArray55[local3 + 2];
		anIntArray55[local3 + 4] += anIntArray55[local3 + 6];
		local3 += 8;
		anInt676 = local3;
		return true;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "([III)V")
	private static void method553(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt672 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray55 == null || anIntArray55.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt672; local16++) {
				local14[local16] = anIntArray55[local16];
			}
			anIntArray55 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray55[anInt672++] = arg0[local37];
				anIntArray55[anInt672++] = local46;
				anIntArray55[anInt672++] = arg0[local16];
				anIntArray55[anInt672++] = local52;
			} else if (local52 < local46) {
				anIntArray55[anInt672++] = arg0[local16];
				anIntArray55[anInt672++] = local52;
				anIntArray55[anInt672++] = arg0[local37];
				anIntArray55[anInt672++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	private static void method555(@OriginalArg(0) int arg0) {
		if (anInt672 < 0) {
			anInt676 = 0;
			anInt673 = 0;
			anInt675 = 0;
			anInt671 = 2147483646;
			return;
		}
		method560(0, anInt672);
		@Pc(17) int local17 = anIntArray55[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt672; local26 += 4) {
			@Pc(33) int local33 = anIntArray55[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray55[local26];
			@Pc(46) int local46 = anIntArray55[local26 + 2];
			@Pc(52) int local52 = anIntArray55[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray55[local26] = local68 + (local17 - local33) * local62;
			anIntArray55[local26 + 2] = local62;
		}
		anInt675 = 0;
		anInt673 = local26;
		anInt676 = local26;
		anInt671 = local17 - 1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ya;[IIII[I[I)V")
	private static void method556(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.da(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method558();
		method553(arg1, arg2);
		method555(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method552(local2[3])) {
					return;
				}
				local33 = anInt674;
				local35 = anInt670;
				local37 = anInt671;
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
			arg0.b(local33, local37, local35 - local33, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ya;[II[I[I)V")
	public static void method557(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method556(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "()V")
	private static void method558() {
		anInt672 = 0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	private static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray55[local6 - 4];
					@Pc(17) int local17 = anIntArray55[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray55[local6 - 4] = local17;
						anIntArray55[local6] = local13;
						local13 = anIntArray55[local6 - 2];
						anIntArray55[local6 - 2] = anIntArray55[local6 + 2];
						anIntArray55[local6 + 2] = local13;
						local13 = anIntArray55[local6 - 1];
						anIntArray55[local6 - 1] = anIntArray55[local6 + 3];
						anIntArray55[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V")
	private static void method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray55[arg0];
		@Pc(17) int local17 = anIntArray55[arg0 + 1];
		@Pc(23) int local23 = anIntArray55[arg0 + 2];
		@Pc(29) int local29 = anIntArray55[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray55[local33 + 1];
			if (local40 < local17) {
				anIntArray55[local7] = anIntArray55[local33];
				anIntArray55[local7 + 1] = local40;
				anIntArray55[local7 + 2] = anIntArray55[local33 + 2];
				anIntArray55[local7 + 3] = anIntArray55[local33 + 3];
				local7 += 4;
				anIntArray55[local33] = anIntArray55[local7];
				anIntArray55[local33 + 1] = anIntArray55[local7 + 1];
				anIntArray55[local33 + 2] = anIntArray55[local7 + 2];
				anIntArray55[local33 + 3] = anIntArray55[local7 + 3];
			}
		}
		anIntArray55[local7] = local11;
		anIntArray55[local7 + 1] = local17;
		anIntArray55[local7 + 2] = local23;
		anIntArray55[local7 + 3] = local29;
		method560(arg0, local7);
		method560(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ya;[II)V")
	public static void method561(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method556(arg0, arg1, arg1.length, arg2, null, null);
	}
}
