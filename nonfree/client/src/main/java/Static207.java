import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	private static int anInt4090;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	private static int anInt4091;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	private static int anInt4092;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	private static int[] anIntArray453;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	private static int anInt4093;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	private static int anInt4094;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	private static int anInt4095;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	private static int anInt4096;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method3448(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static143.anInt2744 - Static143.anInt2746 != arg4.length) {
			throw new IllegalStateException();
		}
		method3450();
		method3454(arg0, arg1);
		method3455(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()V")
	private static void method3449() {
		if (anInt4093 < 0) {
			anInt4095 = 0;
			anInt4094 = 0;
			anInt4096 = 0;
			anInt4092 = 2147483646;
			return;
		}
		method3453(0, anInt4093);
		@Pc(17) int local17 = anIntArray453[1];
		if (local17 < Static143.anInt2746) {
			local17 = Static143.anInt2746;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt4093; local26 += 4) {
			@Pc(35) int local35 = anIntArray453[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray453[local26];
			@Pc(49) int local49 = anIntArray453[local26 + 2];
			@Pc(55) int local55 = anIntArray453[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray453[local26] = local71 + (local17 - local35) * local65;
			anIntArray453[local26 + 2] = local65;
		}
		anInt4096 = 0;
		anInt4094 = local26;
		anInt4095 = local26;
		anInt4092 = local17 - 1;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()V")
	private static void method3450() {
		anInt4093 = 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([III)V")
	public static void method3451(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method3448(arg0, arg0.length, arg1, arg2, null, null);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([III[I[I)V")
	public static void method3452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method3448(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	private static void method3453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray453[arg0];
		@Pc(17) int local17 = anIntArray453[arg0 + 1];
		@Pc(23) int local23 = anIntArray453[arg0 + 2];
		@Pc(29) int local29 = anIntArray453[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray453[local33 + 1];
			if (local42 < local17) {
				anIntArray453[local7] = anIntArray453[local33];
				anIntArray453[local7 + 1] = local42;
				anIntArray453[local7 + 2] = anIntArray453[local33 + 2];
				anIntArray453[local7 + 3] = anIntArray453[local33 + 3];
				local7 += 4;
				anIntArray453[local33] = anIntArray453[local7];
				anIntArray453[local33 + 1] = anIntArray453[local7 + 1];
				anIntArray453[local33 + 2] = anIntArray453[local7 + 2];
				anIntArray453[local33 + 3] = anIntArray453[local7 + 3];
			}
		}
		anIntArray453[local7] = local11;
		anIntArray453[local7 + 1] = local17;
		anIntArray453[local7 + 2] = local23;
		anIntArray453[local7 + 3] = local29;
		method3453(arg0, local7);
		method3453(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "([III)V")
	private static void method3454(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt4093 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray453 == null || anIntArray453.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt4093; local16++) {
				local14[local16] = anIntArray453[local16];
			}
			anIntArray453 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray453[anInt4093++] = arg0[local37];
				anIntArray453[anInt4093++] = local48;
				anIntArray453[anInt4093++] = arg0[local16];
				anIntArray453[anInt4093++] = local54;
			} else if (local54 < local48) {
				anIntArray453[anInt4093++] = arg0[local16];
				anIntArray453[anInt4093++] = local54;
				anIntArray453[anInt4093++] = arg0[local37];
				anIntArray453[anInt4093++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II[I[I)V")
	private static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method3449();
		while (method3456()) {
			@Pc(4) int local4 = anInt4090;
			@Pc(6) int local6 = anInt4091;
			@Pc(8) int local8 = anInt4092;
			if (arg2 != null) {
				@Pc(14) int local14 = local8 - Static143.anInt2746;
				if (local4 < arg2[local14] + Static143.anInt2748) {
					local4 = arg2[local14] + Static143.anInt2748;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static143.anInt2748) {
					local6 = arg2[local14] + arg3[local14] + Static143.anInt2748;
				}
			}
			Static143.method2451(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()Z")
	private static boolean method3456() {
		@Pc(1) int local1 = anInt4094;
		@Pc(3) int local3 = anInt4095;
		@Pc(5) int local5 = anInt4092;
		while (local3 >= local1) {
			local5++;
			anInt4092 = local5;
			if (local5 >= Static143.anInt2744) {
				return false;
			}
			@Pc(18) int local18 = anInt4096;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt4093) {
				local27 = anIntArray453[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray453[local1];
				@Pc(41) int local41 = anIntArray453[local1 + 2];
				@Pc(47) int local47 = anIntArray453[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray453[local1] = local63;
				anIntArray453[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray453[local27 + 3];
				if (local5 >= local35) {
					anIntArray453[local27] = anIntArray453[local18];
					anIntArray453[local27 + 1] = anIntArray453[local18 + 1];
					anIntArray453[local27 + 2] = anIntArray453[local18 + 2];
					anIntArray453[local27 + 3] = anIntArray453[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt4093) {
				anInt4093 = 0;
				return false;
			}
			method3457(local18, local1);
			anInt4096 = local18;
			anInt4094 = local1;
			local3 = local18;
		}
		anInt4090 = anIntArray453[local3] >> 16;
		anInt4091 = anIntArray453[local3 + 4] >> 16;
		anIntArray453[local3] += anIntArray453[local3 + 2];
		anIntArray453[local3 + 4] += anIntArray453[local3 + 6];
		local3 += 8;
		anInt4095 = local3;
		return true;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
	private static void method3457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray453[local10 - 4];
					@Pc(23) int local23 = anIntArray453[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray453[local10 - 4] = local23;
						anIntArray453[local10] = local19;
						local19 = anIntArray453[local10 - 2];
						anIntArray453[local10 - 2] = anIntArray453[local10 + 2];
						anIntArray453[local10 + 2] = local19;
						local19 = anIntArray453[local10 - 1];
						anIntArray453[local10 - 1] = anIntArray453[local10 + 3];
						anIntArray453[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}
}
