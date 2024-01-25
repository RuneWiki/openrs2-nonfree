import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	private static int anInt2893;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	private static int anInt2894;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	private static int anInt2895;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	private static int anInt2896;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
	private static int[] anIntArray185;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	private static int anInt2897;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	private static int anInt2898;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	private static int anInt2899;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ya;[II)V")
	public static void method2432(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method2438(arg0, arg1, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	private static void method2433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray185[arg0];
		@Pc(17) int local17 = anIntArray185[arg0 + 1];
		@Pc(23) int local23 = anIntArray185[arg0 + 2];
		@Pc(29) int local29 = anIntArray185[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray185[local33 + 1];
			if (local40 < local17) {
				anIntArray185[local7] = anIntArray185[local33];
				anIntArray185[local7 + 1] = local40;
				anIntArray185[local7 + 2] = anIntArray185[local33 + 2];
				anIntArray185[local7 + 3] = anIntArray185[local33 + 3];
				local7 += 4;
				anIntArray185[local33] = anIntArray185[local7];
				anIntArray185[local33 + 1] = anIntArray185[local7 + 1];
				anIntArray185[local33 + 2] = anIntArray185[local7 + 2];
				anIntArray185[local33 + 3] = anIntArray185[local7 + 3];
			}
		}
		anIntArray185[local7] = local11;
		anIntArray185[local7 + 1] = local17;
		anIntArray185[local7 + 2] = local23;
		anIntArray185[local7 + 3] = local29;
		method2433(arg0, local7);
		method2433(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	private static void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray185[local6 - 4];
					@Pc(17) int local17 = anIntArray185[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray185[local6 - 4] = local17;
						anIntArray185[local6] = local13;
						local13 = anIntArray185[local6 - 2];
						anIntArray185[local6 - 2] = anIntArray185[local6 + 2];
						anIntArray185[local6 + 2] = local13;
						local13 = anIntArray185[local6 - 1];
						anIntArray185[local6 - 1] = anIntArray185[local6 + 3];
						anIntArray185[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()V")
	private static void method2436() {
		anInt2896 = 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z")
	private static boolean method2437(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt2893;
		@Pc(3) int local3 = anInt2895;
		@Pc(5) int local5 = anInt2898;
		while (local3 >= local1) {
			local5++;
			anInt2898 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt2897;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt2896) {
				local23 = anIntArray185[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray185[local1];
				@Pc(36) int local36 = anIntArray185[local1 + 2];
				@Pc(42) int local42 = anIntArray185[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray185[local1] = local58;
				anIntArray185[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray185[local23 + 3];
				if (local5 >= local30) {
					anIntArray185[local23] = anIntArray185[local16];
					anIntArray185[local23 + 1] = anIntArray185[local16 + 1];
					anIntArray185[local23 + 2] = anIntArray185[local16 + 2];
					anIntArray185[local23 + 3] = anIntArray185[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt2896) {
				anInt2896 = 0;
				return false;
			}
			method2434(local16, local1);
			anInt2897 = local16;
			anInt2893 = local1;
			local3 = local16;
		}
		anInt2894 = anIntArray185[local3] >> 16;
		anInt2899 = anIntArray185[local3 + 4] >> 16;
		anIntArray185[local3] += anIntArray185[local3 + 2];
		anIntArray185[local3 + 4] += anIntArray185[local3 + 6];
		local3 += 8;
		anInt2895 = local3;
		return true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ya;[IIII[I[I)V")
	private static void method2438(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.da(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method2436();
		method2441(arg1, arg2);
		method2439(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method2437(local2[3])) {
					return;
				}
				local33 = anInt2894;
				local35 = anInt2899;
				local37 = anInt2898;
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

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	private static void method2439(@OriginalArg(0) int arg0) {
		if (anInt2896 < 0) {
			anInt2895 = 0;
			anInt2893 = 0;
			anInt2897 = 0;
			anInt2898 = 2147483646;
			return;
		}
		method2433(0, anInt2896);
		@Pc(17) int local17 = anIntArray185[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt2896; local26 += 4) {
			@Pc(33) int local33 = anIntArray185[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray185[local26];
			@Pc(46) int local46 = anIntArray185[local26 + 2];
			@Pc(52) int local52 = anIntArray185[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray185[local26] = local68 + (local17 - local33) * local62;
			anIntArray185[local26 + 2] = local62;
		}
		anInt2897 = 0;
		anInt2893 = local26;
		anInt2895 = local26;
		anInt2898 = local17 - 1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ya;[II[I[I)V")
	public static void method2440(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method2438(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([III)V")
	private static void method2441(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt2896 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray185 == null || anIntArray185.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt2896; local16++) {
				local14[local16] = anIntArray185[local16];
			}
			anIntArray185 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray185[anInt2896++] = arg0[local37];
				anIntArray185[anInt2896++] = local46;
				anIntArray185[anInt2896++] = arg0[local16];
				anIntArray185[anInt2896++] = local52;
			} else if (local52 < local46) {
				anIntArray185[anInt2896++] = arg0[local16];
				anIntArray185[anInt2896++] = local52;
				anIntArray185[anInt2896++] = arg0[local37];
				anIntArray185[anInt2896++] = local46;
			}
			local37 = local16;
		}
	}
}
