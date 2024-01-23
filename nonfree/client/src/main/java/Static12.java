import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	private static int anInt269;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	private static int anInt270;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
	private static int[] anIntArray24;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "I")
	private static int anInt271;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	private static int anInt272;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "I")
	private static int anInt273;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	private static int anInt274;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	private static int anInt275;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V")
	private static void method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray24[arg0];
		@Pc(17) int local17 = anIntArray24[arg0 + 1];
		@Pc(23) int local23 = anIntArray24[arg0 + 2];
		@Pc(29) int local29 = anIntArray24[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray24[local33 + 1];
			if (local42 < local17) {
				anIntArray24[local7] = anIntArray24[local33];
				anIntArray24[local7 + 1] = local42;
				anIntArray24[local7 + 2] = anIntArray24[local33 + 2];
				anIntArray24[local7 + 3] = anIntArray24[local33 + 3];
				local7 += 4;
				anIntArray24[local33] = anIntArray24[local7];
				anIntArray24[local33 + 1] = anIntArray24[local7 + 1];
				anIntArray24[local33 + 2] = anIntArray24[local7 + 2];
				anIntArray24[local33 + 3] = anIntArray24[local7 + 3];
			}
		}
		anIntArray24[local7] = local11;
		anIntArray24[local7 + 1] = local17;
		anIntArray24[local7 + 2] = local23;
		anIntArray24[local7 + 3] = local29;
		method175(arg0, local7);
		method175(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
	private static void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray24[local10 - 4];
					@Pc(23) int local23 = anIntArray24[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray24[local10 - 4] = local23;
						anIntArray24[local10] = local19;
						local19 = anIntArray24[local10 - 2];
						anIntArray24[local10 - 2] = anIntArray24[local10 + 2];
						anIntArray24[local10 + 2] = local19;
						local19 = anIntArray24[local10 - 1];
						anIntArray24[local10 - 1] = anIntArray24[local10 + 3];
						anIntArray24[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method177(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static77.anInt1707 - Static77.anInt1709 != arg4.length) {
			throw new IllegalStateException();
		}
		method185();
		method182(arg0, arg1);
		method179(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([III[I[I)V")
	public static void method178(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method177(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II[I[I)V")
	private static void method179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method180();
		while (method183()) {
			@Pc(4) int local4 = anInt274;
			@Pc(6) int local6 = anInt275;
			@Pc(8) int local8 = anInt269;
			if (arg2 != null) {
				@Pc(14) int local14 = local8 - Static77.anInt1709;
				if (local4 < arg2[local14] + Static77.anInt1708) {
					local4 = arg2[local14] + Static77.anInt1708;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static77.anInt1708) {
					local6 = arg2[local14] + arg3[local14] + Static77.anInt1708;
				}
			}
			Static77.method1598(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()V")
	private static void method180() {
		if (anInt273 < 0) {
			anInt272 = 0;
			anInt271 = 0;
			anInt270 = 0;
			anInt269 = 2147483646;
			return;
		}
		method175(0, anInt273);
		@Pc(17) int local17 = anIntArray24[1];
		if (local17 < Static77.anInt1709) {
			local17 = Static77.anInt1709;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt273; local26 += 4) {
			@Pc(35) int local35 = anIntArray24[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray24[local26];
			@Pc(49) int local49 = anIntArray24[local26 + 2];
			@Pc(55) int local55 = anIntArray24[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray24[local26] = local71 + (local17 - local35) * local65;
			anIntArray24[local26 + 2] = local65;
		}
		anInt270 = 0;
		anInt271 = local26;
		anInt272 = local26;
		anInt269 = local17 - 1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([III)V")
	private static void method182(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt273 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray24 == null || anIntArray24.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt273; local16++) {
				local14[local16] = anIntArray24[local16];
			}
			anIntArray24 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray24[anInt273++] = arg0[local37];
				anIntArray24[anInt273++] = local48;
				anIntArray24[anInt273++] = arg0[local16];
				anIntArray24[anInt273++] = local54;
			} else if (local54 < local48) {
				anIntArray24[anInt273++] = arg0[local16];
				anIntArray24[anInt273++] = local54;
				anIntArray24[anInt273++] = arg0[local37];
				anIntArray24[anInt273++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "()Z")
	private static boolean method183() {
		@Pc(1) int local1 = anInt271;
		@Pc(3) int local3 = anInt272;
		@Pc(5) int local5 = anInt269;
		while (local3 >= local1) {
			local5++;
			anInt269 = local5;
			if (local5 >= Static77.anInt1707) {
				return false;
			}
			@Pc(18) int local18 = anInt270;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt273) {
				local27 = anIntArray24[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray24[local1];
				@Pc(41) int local41 = anIntArray24[local1 + 2];
				@Pc(47) int local47 = anIntArray24[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray24[local1] = local63;
				anIntArray24[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray24[local27 + 3];
				if (local5 >= local35) {
					anIntArray24[local27] = anIntArray24[local18];
					anIntArray24[local27 + 1] = anIntArray24[local18 + 1];
					anIntArray24[local27 + 2] = anIntArray24[local18 + 2];
					anIntArray24[local27 + 3] = anIntArray24[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt273) {
				anInt273 = 0;
				return false;
			}
			method176(local18, local1);
			anInt270 = local18;
			anInt271 = local1;
			local3 = local18;
		}
		anInt274 = anIntArray24[local3] >> 16;
		anInt275 = anIntArray24[local3 + 4] >> 16;
		anIntArray24[local3] += anIntArray24[local3 + 2];
		anIntArray24[local3 + 4] += anIntArray24[local3 + 6];
		local3 += 8;
		anInt272 = local3;
		return true;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "([III)V")
	public static void method184(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method177(arg0, arg0.length, arg1, arg2, null, null);
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "()V")
	private static void method185() {
		anInt273 = 0;
	}
}
