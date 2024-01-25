import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "[I")
	private static int[] anIntArray263;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	private static int anInt4748;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	private static int anInt4749;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	private static int anInt4750;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	private static int anInt4751;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	private static int anInt4752;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	private static int anInt4753;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	private static int anInt4754;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!r;[II[I[I)V")
	public static void method3777(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method3785(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z")
	private static boolean method3779(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt4748;
		@Pc(3) int local3 = anInt4749;
		@Pc(5) int local5 = anInt4751;
		while (local3 >= local1) {
			local5++;
			anInt4751 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt4754;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt4750) {
				local23 = anIntArray263[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray263[local1];
				@Pc(36) int local36 = anIntArray263[local1 + 2];
				@Pc(42) int local42 = anIntArray263[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray263[local1] = local58;
				anIntArray263[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray263[local23 + 3];
				if (local5 >= local30) {
					anIntArray263[local23] = anIntArray263[local16];
					anIntArray263[local23 + 1] = anIntArray263[local16 + 1];
					anIntArray263[local23 + 2] = anIntArray263[local16 + 2];
					anIntArray263[local23 + 3] = anIntArray263[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt4750) {
				anInt4750 = 0;
				return false;
			}
			method3786(local16, local1);
			anInt4754 = local16;
			anInt4748 = local1;
			local3 = local16;
		}
		anInt4752 = anIntArray263[local3] >> 16;
		anInt4753 = anIntArray263[local3 + 4] >> 16;
		anIntArray263[local3] += anIntArray263[local3 + 2];
		anIntArray263[local3 + 4] += anIntArray263[local3 + 6];
		local3 += 8;
		anInt4749 = local3;
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	private static void method3780(@OriginalArg(0) int arg0) {
		if (anInt4750 < 0) {
			anInt4749 = 0;
			anInt4748 = 0;
			anInt4754 = 0;
			anInt4751 = 2147483646;
			return;
		}
		method3783(0, anInt4750);
		@Pc(17) int local17 = anIntArray263[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt4750; local26 += 4) {
			@Pc(33) int local33 = anIntArray263[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray263[local26];
			@Pc(46) int local46 = anIntArray263[local26 + 2];
			@Pc(52) int local52 = anIntArray263[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray263[local26] = local68 + (local17 - local33) * local62;
			anIntArray263[local26 + 2] = local62;
		}
		anInt4754 = 0;
		anInt4748 = local26;
		anInt4749 = local26;
		anInt4751 = local17 - 1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
	private static void method3781(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt4750 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray263 == null || anIntArray263.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt4750; local16++) {
				local14[local16] = anIntArray263[local16];
			}
			anIntArray263 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray263[anInt4750++] = arg0[local37];
				anIntArray263[anInt4750++] = local46;
				anIntArray263[anInt4750++] = arg0[local16];
				anIntArray263[anInt4750++] = local52;
			} else if (local52 < local46) {
				anIntArray263[anInt4750++] = arg0[local16];
				anIntArray263[anInt4750++] = local52;
				anIntArray263[anInt4750++] = arg0[local37];
				anIntArray263[anInt4750++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
	private static void method3782() {
		anInt4750 = 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	private static void method3783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray263[arg0];
		@Pc(17) int local17 = anIntArray263[arg0 + 1];
		@Pc(23) int local23 = anIntArray263[arg0 + 2];
		@Pc(29) int local29 = anIntArray263[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray263[local33 + 1];
			if (local40 < local17) {
				anIntArray263[local7] = anIntArray263[local33];
				anIntArray263[local7 + 1] = local40;
				anIntArray263[local7 + 2] = anIntArray263[local33 + 2];
				anIntArray263[local7 + 3] = anIntArray263[local33 + 3];
				local7 += 4;
				anIntArray263[local33] = anIntArray263[local7];
				anIntArray263[local33 + 1] = anIntArray263[local7 + 1];
				anIntArray263[local33 + 2] = anIntArray263[local7 + 2];
				anIntArray263[local33 + 3] = anIntArray263[local7 + 3];
			}
		}
		anIntArray263[local7] = local11;
		anIntArray263[local7 + 1] = local17;
		anIntArray263[local7 + 2] = local23;
		anIntArray263[local7 + 3] = local29;
		method3783(arg0, local7);
		method3783(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!r;[II)V")
	public static void method3784(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method3785(arg0, arg1, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!r;[IIII[I[I)V")
	private static void method3785(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.oa(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method3782();
		method3781(arg1, arg2);
		method3780(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method3779(local2[3])) {
					return;
				}
				local33 = anInt4752;
				local35 = anInt4753;
				local37 = anInt4751;
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

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	private static void method3786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray263[local6 - 4];
					@Pc(17) int local17 = anIntArray263[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray263[local6 - 4] = local17;
						anIntArray263[local6] = local13;
						local13 = anIntArray263[local6 - 2];
						anIntArray263[local6 - 2] = anIntArray263[local6 + 2];
						anIntArray263[local6 + 2] = local13;
						local13 = anIntArray263[local6 - 1];
						anIntArray263[local6 - 1] = anIntArray263[local6 + 3];
						anIntArray263[local6 + 3] = local13;
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
}
