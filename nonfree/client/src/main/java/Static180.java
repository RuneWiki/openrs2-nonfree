import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "Lclient!dq;")
	public static Class79 aClass79_4;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_93 = new Class344(52, -1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(JI)V")
	public static void method7443(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static563.anInt10265 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551;
		@Pc(15) int local15 = Static68.anInt1811 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550;
		if (Static148.anInt3159 - local10 < -2000 || Static148.anInt3159 - local10 > 2000 || Static222.anInt4655 - local15 < -2000 || Static222.anInt4655 - local15 > 2000) {
			Static148.anInt3159 = local10;
			Static222.anInt4655 = local15;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		if (Static148.anInt3159 != local10) {
			local57 = local10 - Static148.anInt3159;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 > 0) {
				if (local65 == 0) {
					local65 = 1;
				} else if (local65 > local57) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = -1;
			} else if (local57 > local65) {
				local65 = local57;
			}
			Static148.anInt3159 += local65;
		}
		if (!Static455.aClass4_Sub35_Sub1_1.aBoolean674) {
			Static155.aFloat73 += Static1.aFloat107 * (float) arg0 / 6.0F;
			Static189.aFloat83 += (float) arg0 * Static15.aFloat37 / 6.0F;
		}
		if (local15 != Static222.anInt4655) {
			local57 = local15 - Static222.anInt4655;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 <= 0) {
				if (local65 == 0) {
					local65 = -1;
				} else if (local57 > local65) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = 1;
			} else if (local65 > local57) {
				local65 = local57;
			}
			Static222.anInt4655 += local65;
		}
		Static424.method6349();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!sj;B)V")
	public static void method7444(@OriginalArg(0) Class4_Sub13_Sub2 arg0) {
		arg0.method7063();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static57.anInt1513; local12++) {
			local18 = Static447.anIntArray571[local12];
			if ((Static271.aByteArray46[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static271.aByteArray46[local18] = (byte) (Static271.aByteArray46[local18] | 0x2);
				} else {
					local46 = arg0.method7065(1);
					if (local46 == 0) {
						local10 = Static590.method8240(arg0);
						Static271.aByteArray46[local18] = (byte) (Static271.aByteArray46[local18] | 0x2);
					} else {
						Static166.method2751(arg0, local18);
					}
				}
			}
		}
		arg0.method7062();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method7063();
		@Pc(133) int local133;
		for (local18 = 0; local18 < Static57.anInt1513; local18++) {
			local46 = Static447.anIntArray571[local18];
			if ((Static271.aByteArray46[local46] & 0x1) != 0) {
				if (local10 > 0) {
					Static271.aByteArray46[local46] = (byte) (Static271.aByteArray46[local46] | 0x2);
					local10--;
				} else {
					local133 = arg0.method7065(1);
					if (local133 == 0) {
						local10 = Static590.method8240(arg0);
						Static271.aByteArray46[local46] = (byte) (Static271.aByteArray46[local46] | 0x2);
					} else {
						Static166.method2751(arg0, local46);
					}
				}
			}
		}
		arg0.method7062();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method7063();
		@Pc(214) int local214;
		for (local46 = 0; local46 < Static84.anInt2249; local46++) {
			local133 = Static377.anIntArray404[local46];
			if ((Static271.aByteArray46[local133] & 0x1) != 0) {
				if (local10 > 0) {
					Static271.aByteArray46[local133] = (byte) (Static271.aByteArray46[local133] | 0x2);
					local10--;
				} else {
					local214 = arg0.method7065(1);
					if (local214 == 0) {
						local10 = Static590.method8240(arg0);
						Static271.aByteArray46[local133] = (byte) (Static271.aByteArray46[local133] | 0x2);
					} else if (Static177.method2939(local133, arg0)) {
						Static271.aByteArray46[local133] = (byte) (Static271.aByteArray46[local133] | 0x2);
					}
				}
			}
		}
		arg0.method7062();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method7063();
		for (local133 = 0; local133 < Static84.anInt2249; local133++) {
			local214 = Static377.anIntArray404[local133];
			if ((Static271.aByteArray46[local214] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static271.aByteArray46[local214] = (byte) (Static271.aByteArray46[local214] | 0x2);
				} else {
					@Pc(308) int local308 = arg0.method7065(1);
					if (local308 == 0) {
						local10 = Static590.method8240(arg0);
						Static271.aByteArray46[local214] = (byte) (Static271.aByteArray46[local214] | 0x2);
					} else if (Static177.method2939(local214, arg0)) {
						Static271.aByteArray46[local214] = (byte) (Static271.aByteArray46[local214] | 0x2);
					}
				}
			}
		}
		arg0.method7062();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static84.anInt2249 = 0;
		Static57.anInt1513 = 0;
		for (local214 = 1; local214 < 2048; local214++) {
			Static271.aByteArray46[local214] = (byte) (Static271.aByteArray46[local214] >> 1);
			@Pc(379) Class21_Sub1_Sub1_Sub1_Sub2 local379 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local214];
			if (local379 == null) {
				Static377.anIntArray404[Static84.anInt2249++] = local214;
			} else {
				Static447.anIntArray571[Static57.anInt1513++] = local214;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/lang/String;BII)Ljava/lang/String;")
	public static String method7446(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg0[arg2];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg2 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg2; local36 < local32; local36++) {
				@Pc(42) String local42 = arg0[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local34);
			for (@Pc(67) int local67 = arg2; local67 < local32; local67++) {
				@Pc(73) String local73 = arg0[local67];
				if (local73 == null) {
					local65.append("null");
				} else {
					local65.append(local73);
				}
			}
			return local65.toString();
		}
	}
}
