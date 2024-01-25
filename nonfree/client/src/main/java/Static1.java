import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!of;")
	public static Class240 aClass240_9;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method6136() {
		if (Static568.anInt10191 <= 0) {
			Static152.aString36 = "";
			return;
		}
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static19.aStringArray1.length; local10++) {
			if (Static19.aStringArray1[local10].indexOf("--> ") != -1) {
				local8++;
				if (local8 == Static568.anInt10191) {
					Static152.aString36 = Static19.aStringArray1[local10].substring(Static19.aStringArray1[local10].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	public static int method6137(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		local60 /= 6.0D;
		@Pc(164) int local164 = (int) (local60 * 256.0D);
		@Pc(169) int local169 = (int) (local67 * 256.0D);
		@Pc(174) int local174 = (int) (local73 * 256.0D);
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		if (local174 < 0) {
			local174 = 0;
		} else if (local174 > 255) {
			local174 = 255;
		}
		if (local174 > 243) {
			local169 >>= 0x4;
		} else if (local174 > 217) {
			local169 >>= 0x3;
		} else if (local174 > 192) {
			local169 >>= 0x2;
		} else if (local174 > 179) {
			local169 >>= 0x1;
		}
		return (local174 >> 1) + ((local164 & 0xFF) >> 2 << 10) + (local169 >> 5 << 7);
	}
}
