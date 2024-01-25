import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Z")
	public static boolean aBoolean334;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Z")
	public static boolean aBoolean335 = true;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[6][];

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!af;)V")
	public static void method4345(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method334();
		@Pc(20) int local20;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < Static439.anInt7133; local14++) {
			local20 = Static294.anIntArray593[local14];
			if ((Static205.aByteArray32[local20] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static205.aByteArray32[local20] = (byte) (Static205.aByteArray32[local20] | 0x2);
				} else {
					local48 = arg0.method333(1);
					if (local48 == 0) {
						local7 = Static360.method5205(arg0);
						Static205.aByteArray32[local20] = (byte) (Static205.aByteArray32[local20] | 0x2);
					} else {
						Static409.method5611(arg0, local20);
					}
				}
			}
		}
		arg0.method329();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method334();
		@Pc(119) int local119;
		for (local20 = 0; local20 < Static439.anInt7133; local20++) {
			local48 = Static294.anIntArray593[local20];
			if ((Static205.aByteArray32[local48] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static205.aByteArray32[local48] = (byte) (Static205.aByteArray32[local48] | 0x2);
				} else {
					local119 = arg0.method333(1);
					if (local119 == 0) {
						local7 = Static360.method5205(arg0);
						Static205.aByteArray32[local48] = (byte) (Static205.aByteArray32[local48] | 0x2);
					} else {
						Static409.method5611(arg0, local48);
					}
				}
			}
		}
		arg0.method329();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method334();
		@Pc(206) int local206;
		for (local48 = 0; local48 < Class3_Sub5_Sub21.anInt10916; local48++) {
			local119 = Static290.anIntArray279[local48];
			if ((Static205.aByteArray32[local119] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static205.aByteArray32[local119] = (byte) (Static205.aByteArray32[local119] | 0x2);
				} else {
					local206 = arg0.method333(1);
					if (local206 == 0) {
						local7 = Static360.method5205(arg0);
						Static205.aByteArray32[local119] = (byte) (Static205.aByteArray32[local119] | 0x2);
					} else if (Static8.method118(arg0, local119)) {
						Static205.aByteArray32[local119] = (byte) (Static205.aByteArray32[local119] | 0x2);
					}
				}
			}
		}
		arg0.method329();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method334();
		for (local119 = 0; local119 < Class3_Sub5_Sub21.anInt10916; local119++) {
			local206 = Static290.anIntArray279[local119];
			if ((Static205.aByteArray32[local206] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static205.aByteArray32[local206] = (byte) (Static205.aByteArray32[local206] | 0x2);
				} else {
					@Pc(290) int local290 = arg0.method333(1);
					if (local290 == 0) {
						local7 = Static360.method5205(arg0);
						Static205.aByteArray32[local206] = (byte) (Static205.aByteArray32[local206] | 0x2);
					} else if (Static8.method118(arg0, local206)) {
						Static205.aByteArray32[local206] = (byte) (Static205.aByteArray32[local206] | 0x2);
					}
				}
			}
		}
		arg0.method329();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Class3_Sub5_Sub21.anInt10916 = 0;
		Static439.anInt7133 = 0;
		for (local206 = 1; local206 < 2048; local206++) {
			Static205.aByteArray32[local206] = (byte) (Static205.aByteArray32[local206] >> 1);
			@Pc(362) Class34_Sub1_Sub1_Sub2_Sub1 local362 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local206];
			if (local362 == null) {
				Static290.anIntArray279[Class3_Sub5_Sub21.anInt10916++] = local206;
			} else {
				Static294.anIntArray593[Static439.anInt7133++] = local206;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4346(@OriginalArg(1) String arg0) {
		if (Class171.aString60.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class171.aString60.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class171.aString60.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)[Lclient!gi;")
	public static Class131[] method4347() {
		return new Class131[] { Static263.aClass131_10, Static152.aClass131_25, Static388.aClass131_19 };
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public static void method4349(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub5_Sub20 local17 = Static447.method6065((long) arg0, 4);
		local17.method8834();
	}
}
