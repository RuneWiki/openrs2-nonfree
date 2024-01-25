import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
	private static int anInt9244;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
	private static int anInt9245;

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
	private static int anInt9246;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	private static int anInt9247;

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
	private static int anInt9248;

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
	private static int anInt9249;

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
	private static int anInt9250;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "[I")
	private static int[] anIntArray798;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ha;[II[I[I)V")
	public static void method8082(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method8083(arg0, arg1, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ha;[IIII[I[I)V")
	private static void method8083(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		@Pc(2) int[] local2 = new int[4];
		arg0.K(local2);
		if (arg4 != null && local2[3] - local2[1] != arg4.length) {
			throw new IllegalStateException();
		}
		method8088();
		method8090(arg1, arg2);
		method8089(local2[1]);
		while (true) {
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(37) int local37;
			do {
				if (!method8086(local2[3])) {
					return;
				}
				local33 = anInt9244;
				local35 = anInt9247;
				local37 = anInt9246;
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

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V")
	private static void method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(2) boolean local2 = true;
				for (@Pc(6) int local6 = arg0 + 4; local6 < arg1; local6 += 4) {
					@Pc(13) int local13 = anIntArray798[local6 - 4];
					@Pc(17) int local17 = anIntArray798[local6];
					if (local13 > local17) {
						local2 = false;
						anIntArray798[local6 - 4] = local17;
						anIntArray798[local6] = local13;
						local13 = anIntArray798[local6 - 2];
						anIntArray798[local6 - 2] = anIntArray798[local6 + 2];
						anIntArray798[local6 + 2] = local13;
						local13 = anIntArray798[local6 - 1];
						anIntArray798[local6 - 1] = anIntArray798[local6 + 3];
						anIntArray798[local6 + 3] = local13;
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

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ha;[II)V")
	public static void method8085(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method8083(arg0, arg1, arg1.length, arg2, (int[]) null, (int[]) null);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Z")
	private static boolean method8086(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt9249;
		@Pc(3) int local3 = anInt9248;
		@Pc(5) int local5 = anInt9246;
		while (local3 >= local1) {
			local5++;
			anInt9246 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(16) int local16 = anInt9250;
			@Pc(23) int local23;
			@Pc(30) int local30;
			while (local1 < anInt9245) {
				local23 = anIntArray798[local1 + 1];
				if (local5 < local23) {
					break;
				}
				local30 = anIntArray798[local1];
				@Pc(36) int local36 = anIntArray798[local1 + 2];
				@Pc(42) int local42 = anIntArray798[local1 + 3];
				@Pc(52) int local52 = (local36 - local30 << 16) / (local42 - local23);
				@Pc(58) int local58 = (local30 << 16) + 32768;
				anIntArray798[local1] = local58;
				anIntArray798[local1 + 2] = local52;
				local1 += 4;
			}
			for (local23 = local16; local23 < local1; local23 += 4) {
				local30 = anIntArray798[local23 + 3];
				if (local5 >= local30) {
					anIntArray798[local23] = anIntArray798[local16];
					anIntArray798[local23 + 1] = anIntArray798[local16 + 1];
					anIntArray798[local23 + 2] = anIntArray798[local16 + 2];
					anIntArray798[local23 + 3] = anIntArray798[local16 + 3];
					local16 += 4;
				}
			}
			if (local16 == anInt9245) {
				anInt9245 = 0;
				return false;
			}
			method8084(local16, local1);
			anInt9250 = local16;
			anInt9249 = local1;
			local3 = local16;
		}
		anInt9244 = anIntArray798[local3] >> 16;
		anInt9247 = anIntArray798[local3 + 4] >> 16;
		anIntArray798[local3] += anIntArray798[local3 + 2];
		anIntArray798[local3 + 4] += anIntArray798[local3 + 6];
		local3 += 8;
		anInt9248 = local3;
		return true;
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "()V")
	private static void method8088() {
		anInt9245 = 0;
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V")
	private static void method8089(@OriginalArg(0) int arg0) {
		if (anInt9245 < 0) {
			anInt9248 = 0;
			anInt9249 = 0;
			anInt9250 = 0;
			anInt9246 = 2147483646;
			return;
		}
		method8091(0, anInt9245);
		@Pc(17) int local17 = anIntArray798[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt9245; local26 += 4) {
			@Pc(33) int local33 = anIntArray798[local26 + 1];
			if (local17 < local33) {
				break;
			}
			@Pc(40) int local40 = anIntArray798[local26];
			@Pc(46) int local46 = anIntArray798[local26 + 2];
			@Pc(52) int local52 = anIntArray798[local26 + 3];
			@Pc(62) int local62 = (local46 - local40 << 16) / (local52 - local33);
			@Pc(68) int local68 = (local40 << 16) + 32768;
			anIntArray798[local26] = local68 + (local17 - local33) * local62;
			anIntArray798[local26 + 2] = local62;
		}
		anInt9250 = 0;
		anInt9249 = local26;
		anInt9248 = local26;
		anInt9246 = local17 - 1;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "([III)V")
	private static void method8090(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt9245 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray798 == null || anIntArray798.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt9245; local16++) {
				local14[local16] = anIntArray798[local16];
			}
			anIntArray798 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(46) int local46 = arg0[local37 + 1];
			@Pc(52) int local52 = arg0[local16 + 1];
			if (local46 < local52) {
				anIntArray798[anInt9245++] = arg0[local37];
				anIntArray798[anInt9245++] = local46;
				anIntArray798[anInt9245++] = arg0[local16];
				anIntArray798[anInt9245++] = local52;
			} else if (local52 < local46) {
				anIntArray798[anInt9245++] = arg0[local16];
				anIntArray798[anInt9245++] = local52;
				anIntArray798[anInt9245++] = arg0[local37];
				anIntArray798[anInt9245++] = local46;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V")
	private static void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray798[arg0];
		@Pc(17) int local17 = anIntArray798[arg0 + 1];
		@Pc(23) int local23 = anIntArray798[arg0 + 2];
		@Pc(29) int local29 = anIntArray798[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(40) int local40 = anIntArray798[local33 + 1];
			if (local40 < local17) {
				anIntArray798[local7] = anIntArray798[local33];
				anIntArray798[local7 + 1] = local40;
				anIntArray798[local7 + 2] = anIntArray798[local33 + 2];
				anIntArray798[local7 + 3] = anIntArray798[local33 + 3];
				local7 += 4;
				anIntArray798[local33] = anIntArray798[local7];
				anIntArray798[local33 + 1] = anIntArray798[local7 + 1];
				anIntArray798[local33 + 2] = anIntArray798[local7 + 2];
				anIntArray798[local33 + 3] = anIntArray798[local7 + 3];
			}
		}
		anIntArray798[local7] = local11;
		anIntArray798[local7 + 1] = local17;
		anIntArray798[local7 + 2] = local23;
		anIntArray798[local7 + 3] = local29;
		method8091(arg0, local7);
		method8091(local7 + 4, arg1);
	}
}
