import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	public static int anInt992;

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "Lclient!ak;")
	public static Class7 aClass7_43;

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
	public static int anInt996;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
	public static int anInt990 = 0;

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
	public static int anInt997 = 0;

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "Lclient!hh;")
	public static Class69 aClass69_5 = new Class69();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!ak;I)Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1 method812(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1) {
		return Static126.method1947(arg1, arg0) ? Static299.method4557() : null;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[B)Lclient!kh;")
	public static Class1_Sub2_Sub12 method813(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(19) Class1_Sub2_Sub12 local19;
		if (Static240.aBoolean369) {
			local19 = new Class1_Sub2_Sub12_Sub2(arg0, Static227.anIntArray557, Static134.anIntArray306, Static49.anIntArray135, Static113.anIntArray273, Static299.aByteArrayArray15);
		} else {
			local19 = new Class1_Sub2_Sub12_Sub1(arg0, Static227.anIntArray557, Static134.anIntArray306, Static49.anIntArray135, Static113.anIntArray273, Static299.aByteArrayArray15);
		}
		Static247.method3867();
		return local19;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZI)I")
	public static int method814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static208.anIntArray476[Static31.method589(arg1, arg2)];
		if (arg0 > 0) {
			@Pc(27) int local27 = Static208.anInterface4_1.method994(arg0 & 0xFFFF);
			@Pc(39) int local39;
			@Pc(64) int local64;
			if (local27 != 0) {
				if (arg2 < 0) {
					local39 = 0;
				} else if (arg2 > 127) {
					local39 = 16777215;
				} else {
					local39 = arg2 * 131586;
				}
				if (local27 == 256) {
					local11 = local39;
				} else {
					local64 = 256 - local27;
					local11 = (local27 * (local39 & 0xFF00) + (local11 & 0xFF00) * local64 & 0xFF0000) + (local64 * (local11 & 0xFF00FF) + local27 * (local39 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local39 = Static208.anInterface4_1.method993(arg0 & 0xFFFF);
			if (local39 != 0) {
				local39 += 256;
				local64 = (local11 >> 8 & 0xFF) * local39;
				@Pc(122) int local122 = local39 * (local11 >> 16 & 0xFF);
				if (local122 > 65535) {
					local122 = 65535;
				}
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(139) int local139 = (local11 & 0xFF) * local39;
				if (local139 > 65535) {
					local139 = 65535;
				}
				local11 = (local139 >> 8) + (local64 & 0xFF00) + ((local122 & 0xB00FF00) << 8);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)I")
	public static int method815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub10 local16 = (Class1_Sub10) Static39.aClass22_2.method633((long) arg1);
		if (local16 == null) {
			return 0;
		} else if (arg0 >= 0 && local16.anIntArray234.length > arg0) {
			return local16.anIntArray234[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZB)V")
	public static void method816(@OriginalArg(0) boolean arg0) {
		Static86.aBoolean124 = arg0;
		@Pc(29) boolean local29;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(43) int local43;
		@Pc(51) int local51;
		@Pc(57) int local57;
		@Pc(62) int local62;
		@Pc(174) int local174;
		@Pc(191) int local191;
		if (!Static86.aBoolean124) {
			local19 = Static63.aClass1_Sub18_Sub1_1.method3103();
			local23 = Static63.aClass1_Sub18_Sub1_1.method3062();
			local29 = Static247.method3872(Static63.aClass1_Sub18_Sub1_1.method3057());
			local33 = Static63.aClass1_Sub18_Sub1_1.method3122();
			local37 = Static63.aClass1_Sub18_Sub1_1.method3118();
			local43 = Static63.aClass1_Sub18_Sub1_1.method3062();
			local51 = (Static292.anInt5802 - Static63.aClass1_Sub18_Sub1_1.anInt3911) / 16;
			Static268.anIntArrayArray44 = new int[local51][4];
			for (local57 = 0; local57 < local51; local57++) {
				for (local62 = 0; local62 < 4; local62++) {
					Static268.anIntArrayArray44[local57][local62] = Static63.aClass1_Sub18_Sub1_1.method3073();
				}
			}
			Static19.aByteArrayArray2 = new byte[local51][];
			Static163.anIntArray531 = new int[local51];
			Static190.anIntArray426 = null;
			Static255.aByteArrayArray12 = null;
			Static291.aByteArrayArray14 = new byte[local51][];
			Static201.anIntArray456 = new int[local51];
			Static30.aByteArrayArray3 = new byte[local51][];
			Static156.anIntArray227 = new int[local51];
			Static177.anIntArray389 = new int[local51];
			@Pc(109) boolean local109 = false;
			Static242.aByteArrayArray11 = new byte[local51][];
			if ((local37 / 8 == 48 || local37 / 8 == 49) && local23 / 8 == 48) {
				local109 = true;
			}
			if (local37 / 8 == 48 && local23 / 8 == 148) {
				local109 = true;
			}
			Static201.anIntArray455 = new int[local51];
			local51 = 0;
			for (local62 = (local37 - 6) / 8; local62 <= (local37 + 6) / 8; local62++) {
				for (local174 = (local23 - 6) / 8; local174 <= (local23 + 6) / 8; local174++) {
					local191 = local174 + (local62 << 8);
					if (local109 && (local174 == 49 || local174 == 149 || local174 == 147 || local62 == 50 || local62 == 49 && local174 == 47)) {
						Static177.anIntArray389[local51] = local191;
						Static156.anIntArray227[local51] = -1;
						Static163.anIntArray531[local51] = -1;
						Static201.anIntArray456[local51] = -1;
						Static201.anIntArray455[local51] = -1;
					} else {
						Static177.anIntArray389[local51] = local191;
						Static156.anIntArray227[local51] = Static216.aClass7_178.method264("m" + local62 + "_" + local174);
						Static163.anIntArray531[local51] = Static216.aClass7_178.method264("l" + local62 + "_" + local174);
						Static201.anIntArray456[local51] = Static216.aClass7_178.method264("um" + local62 + "_" + local174);
						Static201.anIntArray455[local51] = Static216.aClass7_178.method264("ul" + local62 + "_" + local174);
					}
					local51++;
				}
			}
			Static210.method3348(false, local19, local33, local23, local37, local43, local29);
			return;
		}
		local19 = Static63.aClass1_Sub18_Sub1_1.method3062();
		local23 = Static63.aClass1_Sub18_Sub1_1.method3084();
		local33 = Static63.aClass1_Sub18_Sub1_1.method3062();
		local37 = Static63.aClass1_Sub18_Sub1_1.method3103();
		Static63.aClass1_Sub18_Sub1_1.method3126();
		for (local43 = 0; local43 < 4; local43++) {
			for (local51 = 0; local51 < 13; local51++) {
				for (local57 = 0; local57 < 13; local57++) {
					local62 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
					if (local62 == 1) {
						Static185.anIntArrayArrayArray14[local43][local51][local57] = Static63.aClass1_Sub18_Sub1_1.method3129(26);
					} else {
						Static185.anIntArrayArrayArray14[local43][local51][local57] = -1;
					}
				}
			}
		}
		Static63.aClass1_Sub18_Sub1_1.method3132();
		local43 = (Static292.anInt5802 - Static63.aClass1_Sub18_Sub1_1.anInt3911) / 16;
		Static268.anIntArrayArray44 = new int[local43][4];
		for (local51 = 0; local51 < local43; local51++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static268.anIntArrayArray44[local51][local57] = Static63.aClass1_Sub18_Sub1_1.method3073();
			}
		}
		local51 = Static63.aClass1_Sub18_Sub1_1.method3062();
		local29 = Static247.method3872(Static63.aClass1_Sub18_Sub1_1.method3122());
		Static19.aByteArrayArray2 = new byte[local43][];
		Static156.anIntArray227 = new int[local43];
		Static30.aByteArrayArray3 = new byte[local43][];
		Static291.aByteArrayArray14 = new byte[local43][];
		Static190.anIntArray426 = null;
		Static201.anIntArray455 = new int[local43];
		Static177.anIntArray389 = new int[local43];
		Static255.aByteArrayArray12 = null;
		Static163.anIntArray531 = new int[local43];
		Static201.anIntArray456 = new int[local43];
		Static242.aByteArrayArray11 = new byte[local43][];
		local43 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (local62 = 0; local62 < 13; local62++) {
				for (local174 = 0; local174 < 13; local174++) {
					local191 = Static185.anIntArrayArrayArray14[local57][local62][local174];
					if (local191 != -1) {
						@Pc(534) int local534 = local191 >> 14 & 0x3FF;
						@Pc(540) int local540 = local191 >> 3 & 0x7FF;
						@Pc(550) int local550 = local540 / 8 + (local534 / 8 << 8);
						@Pc(552) int local552;
						for (local552 = 0; local552 < local43; local552++) {
							if (local550 == Static177.anIntArray389[local552]) {
								local550 = -1;
								break;
							}
						}
						if (local550 != -1) {
							local552 = local550 >> 8 & 0xFF;
							Static177.anIntArray389[local43] = local550;
							@Pc(586) int local586 = local550 & 0xFF;
							Static156.anIntArray227[local43] = Static216.aClass7_178.method264("m" + local552 + "_" + local586);
							Static163.anIntArray531[local43] = Static216.aClass7_178.method264("l" + local552 + "_" + local586);
							Static201.anIntArray456[local43] = Static216.aClass7_178.method264("um" + local552 + "_" + local586);
							Static201.anIntArray455[local43] = Static216.aClass7_178.method264("ul" + local552 + "_" + local586);
							local43++;
						}
					}
				}
			}
		}
		Static210.method3348(false, local19, local23, local51, local33, local37, local29);
	}
}
