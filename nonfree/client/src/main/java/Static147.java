import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	private static int anInt2906;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	private static int anInt2907;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
	private static int[] anIntArray244;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	private static int anInt2908;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	private static int anInt2909;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	private static int anInt2910;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	private static int anInt2911;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	private static int anInt2912;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	private static void method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray244[arg0];
		@Pc(17) int local17 = anIntArray244[arg0 + 1];
		@Pc(23) int local23 = anIntArray244[arg0 + 2];
		@Pc(29) int local29 = anIntArray244[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray244[local33 + 1];
			if (local42 < local17) {
				anIntArray244[local7] = anIntArray244[local33];
				anIntArray244[local7 + 1] = local42;
				anIntArray244[local7 + 2] = anIntArray244[local33 + 2];
				anIntArray244[local7 + 3] = anIntArray244[local33 + 3];
				local7 += 4;
				anIntArray244[local33] = anIntArray244[local7];
				anIntArray244[local33 + 1] = anIntArray244[local7 + 1];
				anIntArray244[local33 + 2] = anIntArray244[local7 + 2];
				anIntArray244[local33 + 3] = anIntArray244[local7 + 3];
			}
		}
		anIntArray244[local7] = local11;
		anIntArray244[local7 + 1] = local17;
		anIntArray244[local7 + 2] = local23;
		anIntArray244[local7 + 3] = local29;
		method2493(arg0, local7);
		method2493(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II[I[I)V")
	private static void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method2500();
		while (method2501()) {
			@Pc(4) int local4 = anInt2908;
			@Pc(6) int local6 = anInt2906;
			@Pc(8) int local8 = anInt2910;
			if (arg2 != null) {
				@Pc(14) int local14 = local8 - Static25.anInt417;
				if (local4 < arg2[local14] + Static25.anInt418) {
					local4 = arg2[local14] + Static25.anInt418;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static25.anInt418) {
					local6 = arg2[local14] + arg3[local14] + Static25.anInt418;
				}
			}
			Static25.method395(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([III)V")
	public static void method2495(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2502(arg0, arg0.length, arg1, arg2, null, null);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V")
	private static void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray244[local10 - 4];
					@Pc(23) int local23 = anIntArray244[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray244[local10 - 4] = local23;
						anIntArray244[local10] = local19;
						local19 = anIntArray244[local10 - 2];
						anIntArray244[local10 - 2] = anIntArray244[local10 + 2];
						anIntArray244[local10 + 2] = local19;
						local19 = anIntArray244[local10 - 1];
						anIntArray244[local10 - 1] = anIntArray244[local10 + 3];
						anIntArray244[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
	private static void method2497() {
		anInt2909 = 0;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "([III)V")
	private static void method2498(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt2909 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray244 == null || anIntArray244.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt2909; local16++) {
				local14[local16] = anIntArray244[local16];
			}
			anIntArray244 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray244[anInt2909++] = arg0[local37];
				anIntArray244[anInt2909++] = local48;
				anIntArray244[anInt2909++] = arg0[local16];
				anIntArray244[anInt2909++] = local54;
			} else if (local54 < local48) {
				anIntArray244[anInt2909++] = arg0[local16];
				anIntArray244[anInt2909++] = local54;
				anIntArray244[anInt2909++] = arg0[local37];
				anIntArray244[anInt2909++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([III[I[I)V")
	public static void method2499(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method2502(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "()V")
	private static void method2500() {
		if (anInt2909 < 0) {
			anInt2912 = 0;
			anInt2911 = 0;
			anInt2907 = 0;
			anInt2910 = 2147483646;
			return;
		}
		method2493(0, anInt2909);
		@Pc(17) int local17 = anIntArray244[1];
		if (local17 < Static25.anInt417) {
			local17 = Static25.anInt417;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt2909; local26 += 4) {
			@Pc(35) int local35 = anIntArray244[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray244[local26];
			@Pc(49) int local49 = anIntArray244[local26 + 2];
			@Pc(55) int local55 = anIntArray244[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray244[local26] = local71 + (local17 - local35) * local65;
			anIntArray244[local26 + 2] = local65;
		}
		anInt2907 = 0;
		anInt2911 = local26;
		anInt2912 = local26;
		anInt2910 = local17 - 1;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()Z")
	private static boolean method2501() {
		@Pc(1) int local1 = anInt2911;
		@Pc(3) int local3 = anInt2912;
		@Pc(5) int local5 = anInt2910;
		while (local3 >= local1) {
			local5++;
			anInt2910 = local5;
			if (local5 >= Static25.anInt419) {
				return false;
			}
			@Pc(18) int local18 = anInt2907;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt2909) {
				local27 = anIntArray244[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray244[local1];
				@Pc(41) int local41 = anIntArray244[local1 + 2];
				@Pc(47) int local47 = anIntArray244[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray244[local1] = local63;
				anIntArray244[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray244[local27 + 3];
				if (local5 >= local35) {
					anIntArray244[local27] = anIntArray244[local18];
					anIntArray244[local27 + 1] = anIntArray244[local18 + 1];
					anIntArray244[local27 + 2] = anIntArray244[local18 + 2];
					anIntArray244[local27 + 3] = anIntArray244[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt2909) {
				anInt2909 = 0;
				return false;
			}
			method2496(local18, local1);
			anInt2907 = local18;
			anInt2911 = local1;
			local3 = local18;
		}
		anInt2908 = anIntArray244[local3] >> 16;
		anInt2906 = anIntArray244[local3 + 4] >> 16;
		anIntArray244[local3] += anIntArray244[local3 + 2];
		anIntArray244[local3 + 4] += anIntArray244[local3 + 6];
		local3 += 8;
		anInt2912 = local3;
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method2502(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static25.anInt419 - Static25.anInt417 != arg4.length) {
			throw new IllegalStateException();
		}
		method2497();
		method2498(arg0, arg1);
		method2494(arg2, arg3, arg4, arg5);
	}
}
