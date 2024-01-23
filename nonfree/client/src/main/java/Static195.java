import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
	private static int anInt3691;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
	private static int anInt3692;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
	private static int anInt3693;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
	private static int anInt3694;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
	private static int anInt3695;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
	private static int anInt3696;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "[I")
	private static int[] anIntArray305;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
	private static int anInt3697;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "()Z")
	private static boolean method3156() {
		@Pc(1) int local1 = anInt3696;
		@Pc(3) int local3 = anInt3692;
		@Pc(5) int local5 = anInt3697;
		while (local3 >= local1) {
			local5++;
			anInt3697 = local5;
			if (local5 >= Static119.anInt2498) {
				return false;
			}
			@Pc(18) int local18 = anInt3694;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3691) {
				local27 = anIntArray305[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray305[local1];
				@Pc(41) int local41 = anIntArray305[local1 + 2];
				@Pc(47) int local47 = anIntArray305[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray305[local1] = local63;
				anIntArray305[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray305[local27 + 3];
				if (local5 >= local35) {
					anIntArray305[local27] = anIntArray305[local18];
					anIntArray305[local27 + 1] = anIntArray305[local18 + 1];
					anIntArray305[local27 + 2] = anIntArray305[local18 + 2];
					anIntArray305[local27 + 3] = anIntArray305[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3691) {
				anInt3691 = 0;
				return false;
			}
			method3157(local18, local1);
			anInt3694 = local18;
			anInt3696 = local1;
			local3 = local18;
		}
		anInt3695 = anIntArray305[local3] >> 16;
		anInt3693 = anIntArray305[local3 + 4] >> 16;
		anIntArray305[local3] += anIntArray305[local3 + 2];
		anIntArray305[local3 + 4] += anIntArray305[local3 + 6];
		local3 += 8;
		anInt3692 = local3;
		return true;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
	private static void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray305[local10 - 4];
					@Pc(23) int local23 = anIntArray305[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray305[local10 - 4] = local23;
						anIntArray305[local10] = local19;
						local19 = anIntArray305[local10 - 2];
						anIntArray305[local10 - 2] = anIntArray305[local10 + 2];
						anIntArray305[local10 + 2] = local19;
						local19 = anIntArray305[local10 - 1];
						anIntArray305[local10 - 1] = anIntArray305[local10 + 3];
						anIntArray305[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "()V")
	private static void method3158() {
		anInt3691 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method3160(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static119.anInt2498 - Static119.anInt2497 != arg4.length) {
			throw new IllegalStateException();
		}
		method3158();
		method3165(arg0, arg1);
		method3163(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "()V")
	private static void method3161() {
		if (anInt3691 < 0) {
			anInt3692 = 0;
			anInt3696 = 0;
			anInt3694 = 0;
			anInt3697 = 2147483646;
			return;
		}
		method3162(0, anInt3691);
		@Pc(17) int local17 = anIntArray305[1];
		if (local17 < Static119.anInt2497) {
			local17 = Static119.anInt2497;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3691; local26 += 4) {
			@Pc(35) int local35 = anIntArray305[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray305[local26];
			@Pc(49) int local49 = anIntArray305[local26 + 2];
			@Pc(55) int local55 = anIntArray305[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray305[local26] = local71 + (local17 - local35) * local65;
			anIntArray305[local26 + 2] = local65;
		}
		anInt3694 = 0;
		anInt3696 = local26;
		anInt3692 = local26;
		anInt3697 = local17 - 1;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
	private static void method3162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray305[arg0];
		@Pc(17) int local17 = anIntArray305[arg0 + 1];
		@Pc(23) int local23 = anIntArray305[arg0 + 2];
		@Pc(29) int local29 = anIntArray305[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray305[local33 + 1];
			if (local42 < local17) {
				anIntArray305[local7] = anIntArray305[local33];
				anIntArray305[local7 + 1] = local42;
				anIntArray305[local7 + 2] = anIntArray305[local33 + 2];
				anIntArray305[local7 + 3] = anIntArray305[local33 + 3];
				local7 += 4;
				anIntArray305[local33] = anIntArray305[local7];
				anIntArray305[local33 + 1] = anIntArray305[local7 + 1];
				anIntArray305[local33 + 2] = anIntArray305[local7 + 2];
				anIntArray305[local33 + 3] = anIntArray305[local7 + 3];
			}
		}
		anIntArray305[local7] = local11;
		anIntArray305[local7 + 1] = local17;
		anIntArray305[local7 + 2] = local23;
		anIntArray305[local7 + 3] = local29;
		method3162(arg0, local7);
		method3162(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[I[I)V")
	private static void method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method3161();
		while (true) {
			@Pc(4) int local4;
			@Pc(6) int local6;
			@Pc(8) int local8;
			do {
				if (!method3156()) {
					return;
				}
				local4 = anInt3695;
				local6 = anInt3693;
				local8 = anInt3697;
				if (arg2 == null) {
					break;
				}
				@Pc(14) int local14 = local8 - Static119.anInt2497;
				if (local4 < arg2[local14] + Static119.anInt2496) {
					local4 = arg2[local14] + Static119.anInt2496;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static119.anInt2496) {
					local6 = arg2[local14] + arg3[local14] + Static119.anInt2496;
				}
			} while (local4 >= local6);
			Static119.method2124(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([III[I[I)V")
	public static void method3164(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method3160(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([III)V")
	private static void method3165(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt3691 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray305 == null || anIntArray305.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3691; local16++) {
				local14[local16] = anIntArray305[local16];
			}
			anIntArray305 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray305[anInt3691++] = arg0[local37];
				anIntArray305[anInt3691++] = local48;
				anIntArray305[anInt3691++] = arg0[local16];
				anIntArray305[anInt3691++] = local54;
			} else if (local54 < local48) {
				anIntArray305[anInt3691++] = arg0[local16];
				anIntArray305[anInt3691++] = local54;
				anIntArray305[anInt3691++] = arg0[local37];
				anIntArray305[anInt3691++] = local48;
			}
			local37 = local16;
		}
	}
}
