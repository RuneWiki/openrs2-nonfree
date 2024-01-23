import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	private static int anInt5521;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
	private static int[] anIntArray606;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	private static int anInt5522;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	private static int anInt5523;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	private static int anInt5524;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	private static int anInt5525;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	private static int anInt5526;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	private static int anInt5527;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method4585(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static93.anInt1943 - Static93.anInt1942 != arg4.length) {
			throw new IllegalStateException();
		}
		method4586();
		method4588(arg0, arg1);
		method4587(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
	private static void method4586() {
		anInt5527 = 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II[I[I)V")
	private static void method4587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method4591();
		while (true) {
			@Pc(4) int local4;
			@Pc(6) int local6;
			@Pc(8) int local8;
			do {
				if (!method4593()) {
					return;
				}
				local4 = anInt5522;
				local6 = anInt5523;
				local8 = anInt5525;
				if (arg2 == null) {
					break;
				}
				@Pc(14) int local14 = local8 - Static93.anInt1942;
				if (local4 < arg2[local14] + Static93.anInt1944) {
					local4 = arg2[local14] + Static93.anInt1944;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static93.anInt1944) {
					local6 = arg2[local14] + arg3[local14] + Static93.anInt1944;
				}
			} while (local4 >= local6);
			Static93.method1771(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([III)V")
	private static void method4588(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt5527 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray606 == null || anIntArray606.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt5527; local16++) {
				local14[local16] = anIntArray606[local16];
			}
			anIntArray606 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray606[anInt5527++] = arg0[local37];
				anIntArray606[anInt5527++] = local48;
				anIntArray606[anInt5527++] = arg0[local16];
				anIntArray606[anInt5527++] = local54;
			} else if (local54 < local48) {
				anIntArray606[anInt5527++] = arg0[local16];
				anIntArray606[anInt5527++] = local54;
				anIntArray606[anInt5527++] = arg0[local37];
				anIntArray606[anInt5527++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	private static void method4589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray606[local10 - 4];
					@Pc(23) int local23 = anIntArray606[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray606[local10 - 4] = local23;
						anIntArray606[local10] = local19;
						local19 = anIntArray606[local10 - 2];
						anIntArray606[local10 - 2] = anIntArray606[local10 + 2];
						anIntArray606[local10 + 2] = local19;
						local19 = anIntArray606[local10 - 1];
						anIntArray606[local10 - 1] = anIntArray606[local10 + 3];
						anIntArray606[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([III[I[I)V")
	public static void method4590(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method4585(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "()V")
	private static void method4591() {
		if (anInt5527 < 0) {
			anInt5524 = 0;
			anInt5526 = 0;
			anInt5521 = 0;
			anInt5525 = 2147483646;
			return;
		}
		method4594(0, anInt5527);
		@Pc(17) int local17 = anIntArray606[1];
		if (local17 < Static93.anInt1942) {
			local17 = Static93.anInt1942;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt5527; local26 += 4) {
			@Pc(35) int local35 = anIntArray606[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray606[local26];
			@Pc(49) int local49 = anIntArray606[local26 + 2];
			@Pc(55) int local55 = anIntArray606[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray606[local26] = local71 + (local17 - local35) * local65;
			anIntArray606[local26 + 2] = local65;
		}
		anInt5521 = 0;
		anInt5526 = local26;
		anInt5524 = local26;
		anInt5525 = local17 - 1;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "()Z")
	private static boolean method4593() {
		@Pc(1) int local1 = anInt5526;
		@Pc(3) int local3 = anInt5524;
		@Pc(5) int local5 = anInt5525;
		while (local3 >= local1) {
			local5++;
			anInt5525 = local5;
			if (local5 >= Static93.anInt1943) {
				return false;
			}
			@Pc(18) int local18 = anInt5521;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt5527) {
				local27 = anIntArray606[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray606[local1];
				@Pc(41) int local41 = anIntArray606[local1 + 2];
				@Pc(47) int local47 = anIntArray606[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray606[local1] = local63;
				anIntArray606[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray606[local27 + 3];
				if (local5 >= local35) {
					anIntArray606[local27] = anIntArray606[local18];
					anIntArray606[local27 + 1] = anIntArray606[local18 + 1];
					anIntArray606[local27 + 2] = anIntArray606[local18 + 2];
					anIntArray606[local27 + 3] = anIntArray606[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt5527) {
				anInt5527 = 0;
				return false;
			}
			method4589(local18, local1);
			anInt5521 = local18;
			anInt5526 = local1;
			local3 = local18;
		}
		anInt5522 = anIntArray606[local3] >> 16;
		anInt5523 = anIntArray606[local3 + 4] >> 16;
		anIntArray606[local3] += anIntArray606[local3 + 2];
		anIntArray606[local3 + 4] += anIntArray606[local3 + 6];
		local3 += 8;
		anInt5524 = local3;
		return true;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
	private static void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray606[arg0];
		@Pc(17) int local17 = anIntArray606[arg0 + 1];
		@Pc(23) int local23 = anIntArray606[arg0 + 2];
		@Pc(29) int local29 = anIntArray606[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray606[local33 + 1];
			if (local42 < local17) {
				anIntArray606[local7] = anIntArray606[local33];
				anIntArray606[local7 + 1] = local42;
				anIntArray606[local7 + 2] = anIntArray606[local33 + 2];
				anIntArray606[local7 + 3] = anIntArray606[local33 + 3];
				local7 += 4;
				anIntArray606[local33] = anIntArray606[local7];
				anIntArray606[local33 + 1] = anIntArray606[local7 + 1];
				anIntArray606[local33 + 2] = anIntArray606[local7 + 2];
				anIntArray606[local33 + 3] = anIntArray606[local7 + 3];
			}
		}
		anIntArray606[local7] = local11;
		anIntArray606[local7 + 1] = local17;
		anIntArray606[local7 + 2] = local23;
		anIntArray606[local7 + 3] = local29;
		method4594(arg0, local7);
		method4594(local7 + 4, arg1);
	}
}
