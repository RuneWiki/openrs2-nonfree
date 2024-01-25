import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!od", name = "I", descriptor = "I")
	public static int anInt6511 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!raa;IIBILclient!aa;ILclient!ha;I)V")
	public static void method5842(@OriginalArg(0) Class295 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class133 arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class299 local15 = Static325.aClass42_1.method937(arg2);
		if (local15 == null || !local15.aBoolean591 || !local15.method7064(Static301.aClass59_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray458 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray458.length];
			@Pc(47) int local47;
			@Pc(60) int local60;
			@Pc(64) int local64;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static254.anInt4612 == 4) {
					local47 = (int) Static311.aFloat95 & 0x3FFF;
				} else {
					local47 = Static2.anInt7 + (int) Static311.aFloat95 & 0x3FFF;
				}
				local60 = Class377.anIntArray600[local47];
				local64 = Class377.anIntArray601[local47];
				if (Static254.anInt4612 != 4) {
					local64 = local64 * 256 / (Static372.anInt6183 + 256);
					local60 = local60 * 256 / (Static372.anInt6183 + 256);
				}
				local33[local35 * 2] = arg1 + arg0.anInt7957 / 2 + ((local15.anIntArray458[local35 * 2 + 1] * 4 + arg7) * local60 + (local15.anIntArray458[local35 * 2] * 4 + arg3) * local64 >> 14);
				local33[local35 * 2 + 1] = arg0.anInt7985 / 2 + arg5 - (local64 * (local15.anIntArray458[local35 * 2 + 1] * 4 + arg7) - (arg3 + local15.anIntArray458[local35 * 2] * 4) * local60 >> 14);
			}
			Static153.method2240(arg6, local33, local15.anInt8120, arg0.anIntArray446, arg0.anIntArray453);
			if (local15.anInt8143 > 0) {
				@Pc(221) int local221;
				@Pc(231) int local231;
				@Pc(250) int local250;
				@Pc(260) int local260;
				for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
					local60 = local33[local47 * 2];
					local64 = local33[local47 * 2 + 1];
					local221 = local33[local47 * 2 + 2];
					local231 = local33[local47 * 2 + 1 + 2];
					if (local221 < local60) {
						local250 = local60;
						local260 = local64;
						local60 = local221;
						local64 = local231;
						local221 = local250;
						local231 = local260;
					} else if (local221 == local60 && local231 < local64) {
						local250 = local64;
						local64 = local231;
						local231 = local250;
					}
					arg6.method7307(local60, local64, local221, local231, local15.anIntArray459[local15.aByteArray78[local47] & 0xFF], arg4, arg1, arg5, local15.anInt8143, local15.anInt8138, local15.anInt8125);
				}
				local60 = local33[local33.length - 2];
				local64 = local33[local33.length - 1];
				local221 = local33[0];
				local231 = local33[1];
				if (local60 > local221) {
					local250 = local60;
					local260 = local64;
					local60 = local221;
					local221 = local250;
					local64 = local231;
					local231 = local260;
				} else if (local60 == local221 && local64 > local231) {
					local250 = local64;
					local64 = local231;
					local231 = local250;
				}
				arg6.method7307(local60, local64, local221, local231, local15.anIntArray459[local15.aByteArray78[local15.aByteArray78.length - 1] & 0xFF], arg4, arg1, arg5, local15.anInt8143, local15.anInt8138, local15.anInt8125);
			} else {
				for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
					arg6.method7238(local33[local47 * 2], local33[local47 * 2 + 1], local33[(local47 + 1) * 2], local33[local47 * 2 + 2 + 1], local15.anIntArray459[local15.aByteArray78[local47] & 0xFF], arg4, arg1, arg5);
				}
				arg6.method7238(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anIntArray459[local15.aByteArray78[local15.aByteArray78.length - 1] & 0xFF], arg4, arg1, arg5);
			}
		}
		@Pc(499) Class28 local499 = null;
		if (local15.anInt8134 != -1) {
			local499 = local15.method7062(false, arg6);
			if (local499 != null) {
				Static517.method7655(arg4, arg0, arg1, arg3, local499, arg5, arg7);
			}
		}
		if (local15.aString93 == null) {
			return;
		}
		local35 = 0;
		if (local499 != null) {
			local35 = local499.method4037();
		}
		@Pc(533) Class55 local533 = Static602.aClass55_16;
		@Pc(535) Class272 local535 = Static1.aClass272_18;
		if (local15.anInt8114 == 1) {
			local535 = Static199.aClass272_7;
			local533 = Static281.aClass55_8;
		}
		if (local15.anInt8114 == 2) {
			local533 = Static16.aClass55_1;
			local535 = Static485.aClass272_16;
		}
		Static38.method7896(arg0, arg7, arg4, local533, arg1, local35, local15.aString93, arg5, local15.anInt8141, local535, arg3);
		return;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(JI)V")
	public static void method5843(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static536.anInt9158;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (Static343.anInt5775 != local7) {
			local19 = local7 - Static343.anInt5775;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local27 < local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static343.anInt5775 += local27;
		}
		@Pc(62) int local62 = Static325.anInt5511;
		Static311.aFloat95 += (float) arg0 * Static444.aFloat139 / 40.0F * 8.0F;
		Static552.aFloat176 += (float) arg0 * Static216.aFloat87 / 40.0F * 8.0F;
		if (Static57.anInt1135 != local62) {
			local19 = local62 - Static57.anInt1135;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local27 > local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local27 < local19) {
				local27 = local19;
			}
			Static57.anInt1135 += local27;
		}
		Static485.method7194();
	}
}
