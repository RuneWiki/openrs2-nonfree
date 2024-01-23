import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public static int anInt1436;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1427 = 5063219;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_419 = Static200.method3116(")2");

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_420 = Static200.method3116("Weiter");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)I")
	public static int method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)V")
	public static void method1019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static155.anInt3456 != 0 && arg0 != -1) {
			Static84.method1048(arg0, Static155.anInt3456, Static4.aClass7_Sub1_1);
			Static105.aBoolean134 = true;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1020(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			arg0 = local7.aThrowable1;
			local20 = local7.aString1 + " | ";
		} else {
			local20 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local20 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(91) String local91 = local67.substring(local73 + 1, local80);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local20 = local20 + local91 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local20 = local20 + local67 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method1021() {
		Static16.aClass1_Sub9_Sub1_1.method948();
		@Pc(18) int local18 = Static16.aClass1_Sub9_Sub1_1.method949(8);
		@Pc(23) int local23;
		if (local18 < Static56.anInt1482) {
			for (local23 = local18; local23 < Static56.anInt1482; local23++) {
				Static122.anIntArray343[Static59.anInt1503++] = Static19.anIntArray73[local23];
			}
		}
		if (local18 > Static56.anInt1482) {
			throw new RuntimeException("gnpov1");
		}
		Static56.anInt1482 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(57) int local57 = Static19.anIntArray73[local23];
			@Pc(61) Class9_Sub4_Sub2 local61 = Static1.aClass9_Sub4_Sub2Array1[local57];
			@Pc(66) int local66 = Static16.aClass1_Sub9_Sub1_1.method949(1);
			if (local66 == 0) {
				Static19.anIntArray73[Static56.anInt1482++] = local57;
				local61.anInt3907 = Static42.anInt910;
			} else {
				@Pc(89) int local89 = Static16.aClass1_Sub9_Sub1_1.method949(2);
				if (local89 == 0) {
					Static19.anIntArray73[Static56.anInt1482++] = local57;
					local61.anInt3907 = Static42.anInt910;
					Static180.anIntArray502[Static192.anInt4121++] = local57;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static19.anIntArray73[Static56.anInt1482++] = local57;
						local61.anInt3907 = Static42.anInt910;
						local133 = Static16.aClass1_Sub9_Sub1_1.method949(3);
						local61.method2904(false, local133);
						local143 = Static16.aClass1_Sub9_Sub1_1.method949(1);
						if (local143 == 1) {
							Static180.anIntArray502[Static192.anInt4121++] = local57;
						}
					} else if (local89 == 2) {
						Static19.anIntArray73[Static56.anInt1482++] = local57;
						local61.anInt3907 = Static42.anInt910;
						local133 = Static16.aClass1_Sub9_Sub1_1.method949(3);
						local61.method2904(true, local133);
						local143 = Static16.aClass1_Sub9_Sub1_1.method949(3);
						local61.method2904(true, local143);
						@Pc(199) int local199 = Static16.aClass1_Sub9_Sub1_1.method949(1);
						if (local199 == 1) {
							Static180.anIntArray502[Static192.anInt4121++] = local57;
						}
					} else if (local89 == 3) {
						Static122.anIntArray343[Static59.anInt1503++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([Lclient!lh;IIB)V")
	public static void method1022(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(8) int local8 = arg2 - 1;
		@Pc(12) int local12 = arg1 + 1;
		@Pc(18) int local18 = (arg1 + arg2) / 2;
		@Pc(22) Class63 local22 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local22;
		while (local12 > local8) {
			@Pc(36) boolean local36 = true;
			@Pc(39) int local39;
			@Pc(68) int local68;
			@Pc(63) int local63;
			do {
				local12--;
				for (local39 = 0; local39 < 4; local39++) {
					if (Static64.anIntArray184[local39] == 2) {
						local63 = local22.anInt2622;
						local68 = arg0[local12].anInt2622;
					} else if (Static64.anIntArray184[local39] == 1) {
						local63 = local22.anInt2620;
						if (local63 == -1 && Static23.anIntArray333[local39] == 1) {
							local63 = 2001;
						}
						local68 = arg0[local12].anInt2620;
						if (local68 == -1 && Static23.anIntArray333[local39] == 1) {
							local68 = 2001;
						}
					} else if (Static64.anIntArray184[local39] == 3) {
						local63 = local22.aBoolean143 ? 1 : 0;
						local68 = arg0[local12].aBoolean143 ? 1 : 0;
					} else {
						local63 = local22.anInt2629;
						local68 = arg0[local12].anInt2629;
					}
					if (local63 != local68) {
						if ((Static23.anIntArray333[local39] != 1 || local68 <= local63) && (Static23.anIntArray333[local39] != 0 || local63 <= local68)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			local36 = true;
			do {
				local8++;
				for (local39 = 0; local39 < 4; local39++) {
					if (Static64.anIntArray184[local39] == 2) {
						local68 = arg0[local8].anInt2622;
						local63 = local22.anInt2622;
					} else if (Static64.anIntArray184[local39] == 1) {
						local63 = local22.anInt2620;
						local68 = arg0[local8].anInt2620;
						if (local68 == -1 && Static23.anIntArray333[local39] == 1) {
							local68 = 2001;
						}
						if (local63 == -1 && Static23.anIntArray333[local39] == 1) {
							local63 = 2001;
						}
					} else if (Static64.anIntArray184[local39] == 3) {
						local68 = arg0[local8].aBoolean143 ? 1 : 0;
						local63 = local22.aBoolean143 ? 1 : 0;
					} else {
						local68 = arg0[local8].anInt2629;
						local63 = local22.anInt2629;
					}
					if (local68 != local63) {
						if ((Static23.anIntArray333[local39] != 1 || local68 >= local63) && (Static23.anIntArray333[local39] != 0 || local63 >= local68)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			if (local8 < local12) {
				@Pc(339) Class63 local339 = arg0[local8];
				arg0[local8] = arg0[local12];
				arg0[local12] = local339;
			}
		}
		method1022(arg0, local12, arg2);
		method1022(arg0, arg1, local12 + 1);
	}
}
