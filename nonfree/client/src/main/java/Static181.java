import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!mb;")
	public static Class70 aClass70_37;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_51;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "[J")
	public static long[] aLongArray11 = new long[100];

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1353 = Static64.method1101("Allocated memory");

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1352 = aClass51_1353;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII[Lclient!hj;)V")
	public static void method3049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class48[] arg2) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(17) int local17 = arg0 - 1;
		@Pc(21) int local21 = arg1 + 1;
		@Pc(28) int local28 = (arg0 + arg1) / 2;
		@Pc(32) Class48 local32 = arg2[local28];
		arg2[local28] = arg2[arg0];
		arg2[arg0] = local32;
		while (local17 < local21) {
			@Pc(46) boolean local46 = true;
			@Pc(49) int local49;
			@Pc(61) int local61;
			@Pc(64) int local64;
			do {
				local21--;
				for (local49 = 0; local49 < 4; local49++) {
					if (Static81.anIntArray113[local49] == 2) {
						local61 = arg2[local21].anInt1783;
						local64 = local32.anInt1783;
					} else if (Static81.anIntArray113[local49] == 1) {
						local61 = arg2[local21].anInt1779;
						local64 = local32.anInt1779;
						if (local64 == -1 && Static127.anIntArray188[local49] == 1) {
							local64 = 2001;
						}
						if (local61 == -1 && Static127.anIntArray188[local49] == 1) {
							local61 = 2001;
						}
					} else if (Static81.anIntArray113[local49] == 3) {
						local64 = local32.aBoolean81 ? 1 : 0;
						local61 = arg2[local21].aBoolean81 ? 1 : 0;
					} else {
						local64 = local32.anInt1788;
						local61 = arg2[local21].anInt1788;
					}
					if (local64 != local61) {
						if ((Static127.anIntArray188[local49] != 1 || local64 >= local61) && (Static127.anIntArray188[local49] != 0 || local64 <= local61)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			local46 = true;
			do {
				local17++;
				for (local49 = 0; local49 < 4; local49++) {
					if (Static81.anIntArray113[local49] == 2) {
						local64 = local32.anInt1783;
						local61 = arg2[local17].anInt1783;
					} else if (Static81.anIntArray113[local49] == 1) {
						local64 = local32.anInt1779;
						if (local64 == -1 && Static127.anIntArray188[local49] == 1) {
							local64 = 2001;
						}
						local61 = arg2[local17].anInt1779;
						if (local61 == -1 && Static127.anIntArray188[local49] == 1) {
							local61 = 2001;
						}
					} else if (Static81.anIntArray113[local49] == 3) {
						local61 = arg2[local17].aBoolean81 ? 1 : 0;
						local64 = local32.aBoolean81 ? 1 : 0;
					} else {
						local61 = arg2[local17].anInt1788;
						local64 = local32.anInt1788;
					}
					if (local61 != local64) {
						if ((Static127.anIntArray188[local49] != 1 || local61 >= local64) && (Static127.anIntArray188[local49] != 0 || local61 <= local64)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			if (local17 < local21) {
				@Pc(340) Class48 local340 = arg2[local17];
				arg2[local17] = arg2[local21];
				arg2[local21] = local340;
			}
		}
		method3049(arg0, local21, arg2);
		method3049(local21 + 1, arg1, arg2);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Z")
	public static boolean method3050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static30.anInt2194; local1++) {
			@Pc(6) Class31 local6 = Static19.aClass31Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1155 == 1) {
				local15 = local6.anInt1146 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1137 + (local6.anInt1139 * local15 >> 8);
					local37 = local6.anInt1154 + (local6.anInt1140 * local15 >> 8);
					local47 = local6.anInt1138 + (local6.anInt1141 * local15 >> 8);
					local57 = local6.anInt1148 + (local6.anInt1145 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1155 == 2) {
				local15 = arg0 - local6.anInt1146;
				if (local15 > 0) {
					local27 = local6.anInt1137 + (local6.anInt1139 * local15 >> 8);
					local37 = local6.anInt1154 + (local6.anInt1140 * local15 >> 8);
					local47 = local6.anInt1138 + (local6.anInt1141 * local15 >> 8);
					local57 = local6.anInt1148 + (local6.anInt1145 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1155 == 3) {
				local15 = local6.anInt1137 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1146 + (local6.anInt1144 * local15 >> 8);
					local37 = local6.anInt1135 + (local6.anInt1134 * local15 >> 8);
					local47 = local6.anInt1138 + (local6.anInt1141 * local15 >> 8);
					local57 = local6.anInt1148 + (local6.anInt1145 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1155 == 4) {
				local15 = arg2 - local6.anInt1137;
				if (local15 > 0) {
					local27 = local6.anInt1146 + (local6.anInt1144 * local15 >> 8);
					local37 = local6.anInt1135 + (local6.anInt1134 * local15 >> 8);
					local47 = local6.anInt1138 + (local6.anInt1141 * local15 >> 8);
					local57 = local6.anInt1148 + (local6.anInt1145 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1155 == 5) {
				local15 = arg1 - local6.anInt1138;
				if (local15 > 0) {
					local27 = local6.anInt1146 + (local6.anInt1144 * local15 >> 8);
					local37 = local6.anInt1135 + (local6.anInt1134 * local15 >> 8);
					local47 = local6.anInt1137 + (local6.anInt1139 * local15 >> 8);
					local57 = local6.anInt1154 + (local6.anInt1140 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Lclient!fe;")
	public static Class41_Sub1 method3051() {
		@Pc(25) Class41_Sub1 local25 = new Class41_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[0], Static152.anIntArray225[0], Static51.anIntArray72[0], Static89.anIntArray85[0], Static73.aByteArrayArray4[0], Static52.anIntArray74);
		Static134.method2401();
		return local25;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[Lclient!q;IZ[B)V")
	public static void method3052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90[] arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(6) Class1_Sub16 local6 = new Class1_Sub16(arg3);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local6.method3795();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local6.method3797();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(49) int local49 = local33 >> 12;
				@Pc(53) int local53 = local33 & 0x3F;
				@Pc(57) int local57 = local6.method3793();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				@Pc(69) int local69 = arg0 + local53;
				@Pc(75) int local75 = local33 >> 6 & 0x3F;
				@Pc(80) int local80 = local75 + arg1;
				if (local80 > 0 && local69 > 0 && local80 < 103 && local69 < 103) {
					@Pc(95) Class90 local95 = null;
					@Pc(99) int local99 = local49;
					if ((Static150.aByteArrayArrayArray9[1][local80][local69] & 0x2) == 2) {
						local99 = local49 - 1;
					}
					if (local99 >= 0) {
						local95 = arg2[local99];
					}
					Static169.method2898(local95, local65, true, local49, local80, local69, local49, local61, local18);
				}
			}
		}
	}
}
