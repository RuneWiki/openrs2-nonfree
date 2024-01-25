import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	private static int anInt5647;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	private static int anInt5648;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	private static int anInt5649;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	private static int anInt5650;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	private static int anInt5651;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	private static int anInt5652;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	private static int anInt5653;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "[I")
	private static int[] anIntArray441;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	private static void method4763(@OriginalArg(0) int arg0) {
		if (anInt5651 < 0) {
			anInt5650 = 0;
			anInt5653 = 0;
			anInt5652 = 0;
			anInt5647 = 2147483646;
			return;
		}
		method4769(0, anInt5651);
		@Pc(17) int local17 = anIntArray441[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt5651; local26 += 4) {
			@Pc(33) int local33 = anIntArray441[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray441[local26];
			@Pc(46) int local46 = anIntArray441[local26 + 2];
			@Pc(52) int local52 = anIntArray441[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray441[local26] = local68 + (local17 - local33) * local62;
			anIntArray441[local26 + 2] = local62;
		}
		anInt5652 = 0;
		anInt5653 = local26;
		anInt5650 = local26;
		anInt5647 = local17 - 1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!dr;[II[I[I)V")
	public static void method4765(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method4767(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	private static void method4766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray441[local6 - 4];
					@Pc(17) int local17 = anIntArray441[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray441[local6 - 4] = local17;
						anIntArray441[local6] = local13;
						local13 = anIntArray441[local6 - 2];
						anIntArray441[local6 - 2] = anIntArray441[local6 + 2];
						anIntArray441[local6 + 2] = local13;
						local13 = anIntArray441[local6 - 1];
						anIntArray441[local6 - 1] = anIntArray441[local6 + 3];
						anIntArray441[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!dr;[IIII[I[I)V")
	private static void method4767(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method3676(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method4770();
		method4772(arg1, arg2);
		method4763(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method4768(local2[3])) {
					return;
				}
				local33 = anInt5648;
				local35 = anInt5649;
				local37 = anInt5647;
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
			arg0.method3669(local33, local37, local35 - local33, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z")
	private static boolean method4768(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt5653;
		@Pc(3) int local3 = anInt5650;
		@Pc(5) int local5 = anInt5647;
		while (local3 >= local1) {
			local5++;
			anInt5647 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt5652;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt5651) {
				local23 = anIntArray441[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray441[local1];
				@Pc(36) int local36 = anIntArray441[local1 + 2];
				@Pc(42) int local42 = anIntArray441[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray441[local1] = local58;
				anIntArray441[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray441[local23 + 3];
				if (local5 >= local30) {
					anIntArray441[local23] = anIntArray441[local16];
					anIntArray441[local23 + 1] = anIntArray441[local16 + 1];
					anIntArray441[local23 + 2] = anIntArray441[local16 + 2];
					anIntArray441[local23 + 3] = anIntArray441[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt5651) {
				anInt5651 = 0;
				return false;
			}
			method4766(local16, local1);
			anInt5652 = local16;
			anInt5653 = local1;
			local3 = local16;
		}
		anInt5648 = anIntArray441[local3] >> 16;
		anInt5649 = anIntArray441[local3 + 4] >> 16;
		anIntArray441[local3] += anIntArray441[local3 + 2];
		anIntArray441[local3 + 4] += anIntArray441[local3 + 6];
		local3 += 8;
		anInt5650 = local3;
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
	private static void method4769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray441[arg0];
		@Pc(17) int local17 = anIntArray441[arg0 + 1];
		@Pc(23) int local23 = anIntArray441[arg0 + 2];
		@Pc(29) int local29 = anIntArray441[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray441[local33 + 1];
			if (local40 < local17) {
				anIntArray441[local7] = anIntArray441[local33];
				anIntArray441[local7 + 1] = local40;
				anIntArray441[local7 + 2] = anIntArray441[local33 + 2];
				anIntArray441[local7 + 3] = anIntArray441[local33 + 3];
				local7 += 4;
				anIntArray441[local33] = anIntArray441[local7];
				anIntArray441[local33 + 1] = anIntArray441[local7 + 1];
				anIntArray441[local33 + 2] = anIntArray441[local7 + 2];
				anIntArray441[local33 + 3] = anIntArray441[local7 + 3];
			}
		}
		anIntArray441[local7] = local11;
		anIntArray441[local7 + 1] = local17;
		anIntArray441[local7 + 2] = local23;
		anIntArray441[local7 + 3] = local29;
		method4769(arg0, local7);
		method4769(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
	private static void method4770() {
		anInt5651 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!dr;[II)V")
	public static void method4771(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method4767(arg0, arg1, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([III)V")
	private static void method4772(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt5651 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray441 == null || anIntArray441.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt5651; local16++) {
				local14[local16] = anIntArray441[local16];
			}
			anIntArray441 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray441[anInt5651++] = arg0[local37];
				anIntArray441[anInt5651++] = local46;
				anIntArray441[anInt5651++] = arg0[local16];
				anIntArray441[anInt5651++] = local52;
			} else if (local52 < local46) {
				anIntArray441[anInt5651++] = arg0[local16];
				anIntArray441[anInt5651++] = local52;
				anIntArray441[anInt5651++] = arg0[local37];
				anIntArray441[anInt5651++] = local46;
			}
			local37 = local16;
		}
	}
}
