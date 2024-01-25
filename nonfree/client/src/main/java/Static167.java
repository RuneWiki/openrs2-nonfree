import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_54 = new Class359(86, -1);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
	public static void method2915() {
		@Pc(10) short local10 = 1024;
		@Pc(12) short local12 = 3072;
		if (Static632.aBoolean877) {
			local12 = 4096;
			if (Static35.aBoolean38) {
				local10 = 2048;
			}
		}
		if (Static298.aFloat116 < (float) local10) {
			Static298.aFloat116 = (float) local10;
		}
		if (Static298.aFloat116 > (float) local12) {
			Static298.aFloat116 = (float) local12;
		}
		while (Static157.aFloat83 >= 16384.0F) {
			Static157.aFloat83 -= 16384.0F;
		}
		while (Static157.aFloat83 < 0.0F) {
			Static157.aFloat83 += 16384.0F;
		}
		@Pc(58) int local58 = Static40.anInt662 >> 9;
		@Pc(62) int local62 = Static541.anInt8929 >> 9;
		@Pc(68) int local68 = Static441.method6444(Static481.anInt8082, Static40.anInt662, Static541.anInt8929);
		@Pc(70) int local70 = 0;
		@Pc(96) int local96;
		if (local58 > 3 && local62 > 3 && local58 < Static201.anInt3834 - 4 && Static626.anInt10238 - 4 > local62) {
			for (local96 = local58 - 4; local96 <= local58 + 4; local96++) {
				for (@Pc(101) int local101 = local62 - 4; local101 <= local62 + 4; local101++) {
					@Pc(104) int local104 = Static481.anInt8082;
					if (local104 < 3 && Static599.method8200(local101, local96)) {
						local104++;
					}
					@Pc(117) int local117 = 0;
					if (Static373.aClass104_Sub1_2.aByteArrayArrayArray16 != null && Static373.aClass104_Sub1_2.aByteArrayArrayArray16[local104] != null) {
						local117 = (Static373.aClass104_Sub1_2.aByteArrayArrayArray16[local104][local96][local101] & 0xFF) * 8 << 2;
					}
					if (Static495.aClass109Array4 != null && Static495.aClass109Array4[local104] != null) {
						@Pc(161) int local161 = local68 + local117 - Static495.aClass109Array4[local104].method7695(local101, local96);
						if (local161 > local70) {
							local70 = local161;
						}
					}
				}
			}
		}
		local96 = (local70 >> 2) * 1536;
		if (local96 > 786432) {
			local96 = 786432;
		}
		if (local96 < 262144) {
			local96 = 262144;
		}
		if (Static543.anInt8933 < local96) {
			Static543.anInt8933 += (local96 - Static543.anInt8933) / 24;
		} else if (local96 < Static543.anInt8933) {
			Static543.anInt8933 += (local96 - Static543.anInt8933) / 80;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "([I[ILclient!jha;[IZ)V")
	public static void method2916(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class28_Sub1_Sub4_Sub2_Sub2 arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = arg1[local11];
			@Pc(21) int local21 = arg0[local11];
			@Pc(25) int local25 = arg3[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && arg2.aClass321Array3.length > local27; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg2.aClass321Array3[local27] = null;
					} else {
						@Pc(51) Class175 local51 = Static591.aClass66_2.method1768(local17);
						@Pc(54) int local54 = local51.anInt5022;
						@Pc(59) Class321 local59 = arg2.aClass321Array3[local27];
						if (local59 != null) {
							if (local17 == local59.anInt8974) {
								if (local54 == 0) {
									local59 = arg2.aClass321Array3[local27] = null;
								} else if (local54 == 1) {
									local59.anInt8971 = 1;
									local59.anInt8972 = 0;
									local59.anInt8976 = 0;
									local59.anInt8970 = local25;
									local59.anInt8975 = 0;
									if (!arg2.aBoolean468) {
										Static146.method2653(0, local51, arg2);
									}
								} else if (local54 == 2) {
									local59.anInt8972 = 0;
								}
							} else if (local51.anInt5018 >= Static591.aClass66_2.method1768(local59.anInt8974).anInt5018) {
								local59 = arg2.aClass321Array3[local27] = null;
							}
						}
						if (local59 == null) {
							local59 = arg2.aClass321Array3[local27] = new Class321();
							local59.anInt8970 = local25;
							local59.anInt8974 = local17;
							local59.anInt8972 = 0;
							local59.anInt8975 = 0;
							local59.anInt8976 = 0;
							local59.anInt8971 = 1;
							if (!arg2.aBoolean468) {
								Static146.method2653(0, local51, arg2);
							}
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZIC)I")
	public static int method2917(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(21) char local21 = Character.toLowerCase(arg1);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/lang/String;ZBI)I")
	public static int method2919(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(38) char local38 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local38 == '-') {
					local24 = true;
					continue;
				}
				if (local38 == '+') {
					continue;
				}
			}
			@Pc(63) int local63;
			if (local38 >= '0' && local38 <= '9') {
				local63 = local38 - '0';
			} else if (local38 >= 'A' && local38 <= 'Z') {
				local63 = local38 - '7';
			} else if (local38 >= 'a' && local38 <= 'z') {
				local63 = local38 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local63 >= arg1) {
				throw new NumberFormatException();
			}
			if (local24) {
				local63 = -local63;
			}
			@Pc(108) int local108 = arg1 * local28 + local63;
			if (local28 != local108 / arg1) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local108;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
