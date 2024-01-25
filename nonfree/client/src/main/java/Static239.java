import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	private static int anInt4371;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	private static int anInt4372;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	private static int anInt4373;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
	private static int[] anIntArray311;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	private static int anInt4374;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	private static int anInt4375;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	private static int anInt4376;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	private static int anInt4377;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Z")
	private static boolean method3677(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt4374;
		@Pc(3) int local3 = anInt4371;
		@Pc(5) int local5 = anInt4377;
		while (local3 >= local1) {
			local5++;
			anInt4377 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt4373;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt4372) {
				local23 = anIntArray311[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray311[local1];
				@Pc(36) int local36 = anIntArray311[local1 + 2];
				@Pc(42) int local42 = anIntArray311[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray311[local1] = local58;
				anIntArray311[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray311[local23 + 3];
				if (local5 >= local30) {
					anIntArray311[local23] = anIntArray311[local16];
					anIntArray311[local23 + 1] = anIntArray311[local16 + 1];
					anIntArray311[local23 + 2] = anIntArray311[local16 + 2];
					anIntArray311[local23 + 3] = anIntArray311[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt4372) {
				anInt4372 = 0;
				return false;
			}
			method3681(local16, local1);
			anInt4373 = local16;
			anInt4374 = local1;
			local3 = local16;
		}
		anInt4376 = anIntArray311[local3] >> 16;
		anInt4375 = anIntArray311[local3 + 4] >> 16;
		anIntArray311[local3] += anIntArray311[local3 + 2];
		anIntArray311[local3 + 4] += anIntArray311[local3 + 6];
		local3 += 8;
		anInt4371 = local3;
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!eq;[IIII[I[I)V")
	private static void method3678(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method5019(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method3686();
		method3684(arg1, arg2);
		method3683(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method3677(local2[3])) {
					return;
				}
				local33 = anInt4376;
				local35 = anInt4375;
				local37 = anInt4377;
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
			arg0.method5027(local33, local37, local35 - local33, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	private static void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray311[arg0];
		@Pc(17) int local17 = anIntArray311[arg0 + 1];
		@Pc(23) int local23 = anIntArray311[arg0 + 2];
		@Pc(29) int local29 = anIntArray311[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray311[local33 + 1];
			if (local40 < local17) {
				anIntArray311[local7] = anIntArray311[local33];
				anIntArray311[local7 + 1] = local40;
				anIntArray311[local7 + 2] = anIntArray311[local33 + 2];
				anIntArray311[local7 + 3] = anIntArray311[local33 + 3];
				local7 += 4;
				anIntArray311[local33] = anIntArray311[local7];
				anIntArray311[local33 + 1] = anIntArray311[local7 + 1];
				anIntArray311[local33 + 2] = anIntArray311[local7 + 2];
				anIntArray311[local33 + 3] = anIntArray311[local7 + 3];
			}
		}
		anIntArray311[local7] = local11;
		anIntArray311[local7 + 1] = local17;
		anIntArray311[local7 + 2] = local23;
		anIntArray311[local7 + 3] = local29;
		method3679(arg0, local7);
		method3679(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
	private static void method3681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray311[local6 - 4];
					@Pc(17) int local17 = anIntArray311[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray311[local6 - 4] = local17;
						anIntArray311[local6] = local13;
						local13 = anIntArray311[local6 - 2];
						anIntArray311[local6 - 2] = anIntArray311[local6 + 2];
						anIntArray311[local6 + 2] = local13;
						local13 = anIntArray311[local6 - 1];
						anIntArray311[local6 - 1] = anIntArray311[local6 + 3];
						anIntArray311[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!eq;[II[I[I)V")
	public static void method3682(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method3678(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	private static void method3683(@OriginalArg(0) int arg0) {
		if (anInt4372 < 0) {
			anInt4371 = 0;
			anInt4374 = 0;
			anInt4373 = 0;
			anInt4377 = 2147483646;
			return;
		}
		method3679(0, anInt4372);
		@Pc(17) int local17 = anIntArray311[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt4372; local26 += 4) {
			@Pc(33) int local33 = anIntArray311[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray311[local26];
			@Pc(46) int local46 = anIntArray311[local26 + 2];
			@Pc(52) int local52 = anIntArray311[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray311[local26] = local68 + (local17 - local33) * local62;
			anIntArray311[local26 + 2] = local62;
		}
		anInt4373 = 0;
		anInt4374 = local26;
		anInt4371 = local26;
		anInt4377 = local17 - 1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([III)V")
	private static void method3684(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt4372 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray311 == null || anIntArray311.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt4372; local16++) {
				local14[local16] = anIntArray311[local16];
			}
			anIntArray311 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray311[anInt4372++] = arg0[local37];
				anIntArray311[anInt4372++] = local46;
				anIntArray311[anInt4372++] = arg0[local16];
				anIntArray311[anInt4372++] = local52;
			} else if (local52 < local46) {
				anIntArray311[anInt4372++] = arg0[local16];
				anIntArray311[anInt4372++] = local52;
				anIntArray311[anInt4372++] = arg0[local37];
				anIntArray311[anInt4372++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!eq;[II)V")
	public static void method3685(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method3678(arg0, arg1, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	private static void method3686() {
		anInt4372 = 0;
	}
}
