import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!bea;IZI)J")
	public static long method2244(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class178 local14 = Static349.aClass374_2.method8357(arg0.method7823());
		@Pc(35) long local35 = (long) (arg0.method7824() << 14 | arg2 | arg1 << 7 | arg0.method7827() << 20 | 0x40000000);
		if (local14.anInt4743 == 0) {
			local35 |= local7;
		}
		if (local14.anInt4756 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg0.method7823() << 32;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)I")
	public static int method2245() {
		if (Static503.aClass208_9 == null) {
			if (!Static463.aBoolean600 && Static614.aClass3_Sub6_Sub16_4 != null) {
				return Static614.aClass3_Sub6_Sub16_4.anInt7072;
			}
			@Pc(15) int local15 = Static542.aClass75_1.method8412();
			@Pc(19) int local19 = Static542.aClass75_1.method8405();
			@Pc(31) int local31;
			@Pc(33) int local33;
			@Pc(45) int local45;
			@Pc(246) Class3_Sub6_Sub16 local246;
			if (Static548.aBoolean662) {
				@Pc(110) Class289 local110;
				if (local15 > Static567.anInt9059 && local15 < Static108.anInt2244 + Static567.anInt9059) {
					local31 = -1;
					for (local33 = 0; local33 < Static661.anInt10221; local33++) {
						if (Static236.aBoolean347) {
							local45 = Static467.anInt7972 + local33 * 16 + 33;
							if (local19 > local45 - 13 && local19 <= local45 + 3) {
								local31 = local33;
							}
						} else {
							local45 = local33 * 16 + Static467.anInt7972 + 31;
							if (local19 > local45 - 13 && local45 + 3 >= local19) {
								local31 = local33;
							}
						}
					}
					if (local31 != -1) {
						local45 = 0;
						local110 = new Class289(Static239.aClass258_3);
						for (@Pc(115) Class3_Sub6_Sub20 local115 = (Class3_Sub6_Sub20) local110.method6829(); local115 != null; local115 = (Class3_Sub6_Sub20) local110.method6827()) {
							if (local31 == local45++) {
								return ((Class3_Sub6_Sub16) local115.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67).anInt7072;
							}
						}
					}
				} else if (Static407.aClass3_Sub6_Sub20_1 != null && Static382.anInt6708 < local15 && local15 < Static505.anInt8464 + Static382.anInt6708) {
					local31 = -1;
					for (local33 = 0; local33 < Static407.aClass3_Sub6_Sub20_1.anInt9677; local33++) {
						if (Static236.aBoolean347) {
							local45 = Static226.anInt6457 + local33 * 16 + 33;
							if (local19 > local45 - 13 && local45 + 3 >= local19) {
								local31 = local33;
							}
						} else {
							local45 = local33 * 16 + Static226.anInt6457 + 31;
							if (local19 > local45 - 13 && local45 + 3 >= local19) {
								local31 = local33;
							}
						}
					}
					if (local31 != -1) {
						local45 = 0;
						local110 = new Class289(Static407.aClass3_Sub6_Sub20_1.aClass258_13);
						for (local246 = (Class3_Sub6_Sub16) local110.method6829(); local246 != null; local246 = (Class3_Sub6_Sub16) local110.method6827()) {
							if (local31 == local45++) {
								return local246.anInt7072;
							}
						}
					}
				}
			} else if (local15 > Static567.anInt9059 && Static108.anInt2244 + Static567.anInt9059 > local15) {
				local31 = -1;
				for (local33 = 0; local33 < Static37.anInt1104; local33++) {
					if (Static236.aBoolean347) {
						local45 = Static467.anInt7972 + (Static37.anInt1104 - (local33 + 1)) * 16 + 33;
						if (local45 - 13 < local19 && local19 <= local45 + 3) {
							local31 = local33;
						}
					} else {
						local45 = (Static37.anInt1104 - local33 - 1) * 16 + Static467.anInt7972 + 31;
						if (local19 > local45 - 13 && local45 + 3 >= local19) {
							local31 = local33;
						}
					}
				}
				if (local31 != -1) {
					local45 = 0;
					@Pc(357) Class191 local357 = new Class191(Static362.aClass193_32);
					for (local246 = (Class3_Sub6_Sub16) local357.method4410(); local246 != null; local246 = (Class3_Sub6_Sub16) local357.method4412()) {
						if (local31 == local45++) {
							return local246.anInt7072;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
	public static byte[] method2246(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static501.method7128(local13) : local13;
		} else if (arg0 instanceof Class346) {
			@Pc(27) Class346 local27 = (Class346) arg0;
			return local27.method7934();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIZI)I")
	public static int method2247(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class3_Sub29 local10 = Static577.method7771(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray353.length; local23++) {
			if (local10.anIntArray353[local23] >= 0 && local10.anIntArray353[local23] < Static237.aClass371_2.anInt9754) {
				@Pc(48) Class146 local48 = Static237.aClass371_2.method8305(local10.anIntArray353[local23]);
				@Pc(58) int local58 = local48.method3206(Static145.aClass165_1.method3812(arg1).anInt8911, arg1);
				if (arg0) {
					local21 += local10.anIntArray354[local23] * local58;
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}
}
