import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt3215;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[I")
	private static int[] anIntArray326;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private static int anInt3216;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	private static int anInt3217;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private static int anInt3218;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private static int anInt3219;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private static int anInt3220;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	private static int anInt3221;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V")
	public static void method2604(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2612(arg0, arg0.length, arg1, arg2, null, null);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private static void method2605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray326[arg0];
		@Pc(17) int local17 = anIntArray326[arg0 + 1];
		@Pc(23) int local23 = anIntArray326[arg0 + 2];
		@Pc(29) int local29 = anIntArray326[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray326[local33 + 1];
			if (local42 < local17) {
				anIntArray326[local7] = anIntArray326[local33];
				anIntArray326[local7 + 1] = local42;
				anIntArray326[local7 + 2] = anIntArray326[local33 + 2];
				anIntArray326[local7 + 3] = anIntArray326[local33 + 3];
				local7 += 4;
				anIntArray326[local33] = anIntArray326[local7];
				anIntArray326[local33 + 1] = anIntArray326[local7 + 1];
				anIntArray326[local33 + 2] = anIntArray326[local7 + 2];
				anIntArray326[local33 + 3] = anIntArray326[local7 + 3];
			}
		}
		anIntArray326[local7] = local11;
		anIntArray326[local7 + 1] = local17;
		anIntArray326[local7 + 2] = local23;
		anIntArray326[local7 + 3] = local29;
		method2605(arg0, local7);
		method2605(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Z")
	private static boolean method2606() {
		@Pc(1) int local1 = anInt3218;
		@Pc(3) int local3 = anInt3220;
		@Pc(5) int local5 = anInt3219;
		while (local3 >= local1) {
			local5++;
			anInt3219 = local5;
			if (local5 >= Static77.anInt1893) {
				return false;
			}
			@Pc(18) int local18 = anInt3221;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3216) {
				local27 = anIntArray326[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray326[local1];
				@Pc(41) int local41 = anIntArray326[local1 + 2];
				@Pc(47) int local47 = anIntArray326[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray326[local1] = local63;
				anIntArray326[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray326[local27 + 3];
				if (local5 >= local35) {
					anIntArray326[local27] = anIntArray326[local18];
					anIntArray326[local27 + 1] = anIntArray326[local18 + 1];
					anIntArray326[local27 + 2] = anIntArray326[local18 + 2];
					anIntArray326[local27 + 3] = anIntArray326[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3216) {
				anInt3216 = 0;
				return false;
			}
			method2607(local18, local1);
			anInt3221 = local18;
			anInt3218 = local1;
			local3 = local18;
		}
		anInt3217 = anIntArray326[local3] >> 16;
		anInt3215 = anIntArray326[local3 + 4] >> 16;
		anIntArray326[local3] += anIntArray326[local3 + 2];
		anIntArray326[local3 + 4] += anIntArray326[local3 + 6];
		local3 += 8;
		anInt3220 = local3;
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	private static void method2607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray326[local10 - 4];
					@Pc(23) int local23 = anIntArray326[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray326[local10 - 4] = local23;
						anIntArray326[local10] = local19;
						local19 = anIntArray326[local10 - 2];
						anIntArray326[local10 - 2] = anIntArray326[local10 + 2];
						anIntArray326[local10 + 2] = local19;
						local19 = anIntArray326[local10 - 1];
						anIntArray326[local10 - 1] = anIntArray326[local10 + 3];
						anIntArray326[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	private static void method2608() {
		anInt3216 = 0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "([III)V")
	private static void method2609(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt3216 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray326 == null || anIntArray326.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3216; local16++) {
				local14[local16] = anIntArray326[local16];
			}
			anIntArray326 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray326[anInt3216++] = arg0[local37];
				anIntArray326[anInt3216++] = local48;
				anIntArray326[anInt3216++] = arg0[local16];
				anIntArray326[anInt3216++] = local54;
			} else if (local54 < local48) {
				anIntArray326[anInt3216++] = arg0[local16];
				anIntArray326[anInt3216++] = local54;
				anIntArray326[anInt3216++] = arg0[local37];
				anIntArray326[anInt3216++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([III[I[I)V")
	public static void method2610(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method2612(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
	private static void method2611() {
		if (anInt3216 < 0) {
			anInt3220 = 0;
			anInt3218 = 0;
			anInt3221 = 0;
			anInt3219 = 2147483646;
			return;
		}
		method2605(0, anInt3216);
		@Pc(17) int local17 = anIntArray326[1];
		if (local17 < Static77.anInt1898) {
			local17 = Static77.anInt1898;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3216; local26 += 4) {
			@Pc(35) int local35 = anIntArray326[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray326[local26];
			@Pc(49) int local49 = anIntArray326[local26 + 2];
			@Pc(55) int local55 = anIntArray326[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray326[local26] = local71 + (local17 - local35) * local65;
			anIntArray326[local26 + 2] = local65;
		}
		anInt3221 = 0;
		anInt3218 = local26;
		anInt3220 = local26;
		anInt3219 = local17 - 1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method2612(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static77.anInt1893 - Static77.anInt1898 != arg4.length) {
			throw new IllegalStateException();
		}
		method2608();
		method2609(arg0, arg1);
		method2613(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[I[I)V")
	private static void method2613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method2611();
		while (method2606()) {
			@Pc(4) int local4 = anInt3217;
			@Pc(6) int local6 = anInt3215;
			@Pc(8) int local8 = anInt3219;
			if (arg2 != null) {
				@Pc(14) int local14 = local8 - Static77.anInt1898;
				if (local4 < arg2[local14] + Static77.anInt1894) {
					local4 = arg2[local14] + Static77.anInt1894;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static77.anInt1894) {
					local6 = arg2[local14] + arg3[local14] + Static77.anInt1894;
				}
			}
			Static77.method1465(local4, local8, local6 - local4, arg0, arg1);
		}
	}
}
