import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1164 = Static119.method1462("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1165 = Static119.method1462(" ");

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
	public static int anInt2669 = 1;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1166 = Static119.method1462("Error loading your profile)3");

	@OriginalMember(owner = "client!vb", name = "pb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1167 = aClass65_1166;

	@OriginalMember(owner = "client!vb", name = "vb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1168 = null;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([Lclient!pe;BII)Lclient!pe;")
	public static Class65 method1913(@OriginalArg(0) Class65[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
			if (arg0[local7 + arg1] == null) {
				arg0[arg1 + local7] = Static78.aClass65_745;
			}
			local5 += arg0[arg1 + local7].anInt2005;
		}
		@Pc(37) byte[] local37 = new byte[local5];
		@Pc(39) int local39 = 0;
		@Pc(56) Class65 local56;
		for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
			local56 = arg0[arg1 + local41];
			Static135.method359(local56.aByteArray27, 0, local37, local39, local56.anInt2005);
			local39 += local56.anInt2005;
		}
		local56 = new Class65();
		local56.aByteArray27 = local37;
		local56.anInt2005 = local5;
		return local56;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	public static void method1918(@OriginalArg(0) int arg0) {
		Static72.anInt1647 += arg0 * 128;
		@Pc(27) int local27;
		if (Static72.anInt1647 > Static12.anIntArray30.length) {
			Static72.anInt1647 -= Static12.anIntArray30.length;
			local27 = (int) (Math.random() * 12.0D);
			Static119.method1469(Static112.aClass2_Sub1_Sub4_Sub2Array9[local27]);
		}
		local27 = 0;
		@Pc(47) int local47 = arg0 * 128;
		@Pc(53) int local53 = (256 - arg0) * 128;
		@Pc(79) int local79;
		for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
			local79 = Static22.anIntArray48[local27 + local47] - arg0 * Static12.anIntArray30[Static72.anInt1647 + local27 & Static12.anIntArray30.length + -1] / 6;
			if (local79 < 0) {
				local79 = 0;
			}
			Static22.anIntArray48[local27++] = local79;
		}
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		for (local79 = 256 - arg0; local79 < 256; local79++) {
			local110 = local79 * 128;
			for (local112 = 0; local112 < 128; local112++) {
				local119 = (int) (Math.random() * 100.0D);
				if (local119 < 50 && local112 > 10 && local112 < 118) {
					Static22.anIntArray48[local112 + local110] = 255;
				} else {
					Static22.anIntArray48[local112 + local110] = 0;
				}
			}
		}
		if (Static30.anInt743 > 0) {
			Static30.anInt743 -= arg0 * 4;
		}
		if (Static70.anInt1639 > 0) {
			Static70.anInt1639 -= arg0 * 4;
		}
		if (Static30.anInt743 == 0 && Static70.anInt1639 == 0) {
			local110 = (int) ((double) (2000 / arg0) * Math.random());
			if (local110 == 0) {
				Static30.anInt743 = 1024;
			}
			if (local110 == 1) {
				Static70.anInt1639 = 1024;
			}
		}
		for (local110 = 0; local110 < 256 - arg0; local110++) {
			Static75.anIntArray307[local110] = Static75.anIntArray307[arg0 + local110];
		}
		for (local112 = 256 - arg0; local112 < 256; local112++) {
			Static75.anIntArray307[local112] = (int) (Math.sin((double) Static113.anInt2522 / 14.0D) * 16.0D + Math.sin((double) Static113.anInt2522 / 15.0D) * 14.0D + Math.sin((double) Static113.anInt2522 / 16.0D) * 12.0D);
			Static113.anInt2522++;
		}
		Static47.anInt1148 += arg0;
		local119 = (arg0 + (Static10.anInt2951 & 0x1)) / 2;
		if (local119 <= 0) {
			return;
		}
		@Pc(290) int local290;
		@Pc(297) int local297;
		for (@Pc(281) int local281 = 0; local281 < Static47.anInt1148 * 100; local281++) {
			local290 = (int) (Math.random() * 124.0D) + 2;
			local297 = (int) (Math.random() * 128.0D) + 128;
			Static22.anIntArray48[local290 + (local297 << 7)] = 192;
		}
		Static47.anInt1148 = 0;
		@Pc(325) int local325;
		@Pc(330) int local330;
		for (local290 = 0; local290 < 256; local290++) {
			local325 = local290 * 128;
			local297 = 0;
			for (local330 = -local119; local330 < 128; local330++) {
				if (local119 + local330 < 128) {
					local297 += Static22.anIntArray48[local119 + local330 + local325];
				}
				if (local330 - local119 - 1 >= 0) {
					local297 -= Static22.anIntArray48[local330 + local325 - local119 - 1];
				}
				if (local330 >= 0) {
					Static98.anIntArray291[local325 + local330] = local297 / (local119 * 2 + 1);
				}
			}
		}
		for (local297 = 0; local297 < 128; local297++) {
			local325 = 0;
			for (local330 = -local119; local330 < 256; local330++) {
				@Pc(409) int local409 = local330 * 128;
				if (local330 + local119 < 256) {
					local325 += Static98.anIntArray291[local119 * 128 + local409 + local297];
				}
				if (local330 - local119 - 1 >= 0) {
					local325 -= Static98.anIntArray291[local409 + local297 - local119 * 128 - 128];
				}
				if (local330 >= 0) {
					Static22.anIntArray48[local409 + local297] = local325 / (local119 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public static void method1919() {
		aClass65_1166 = null;
		aClass65_1164 = null;
		aClass65_1165 = null;
		aClass65_1167 = null;
		aClass65_1168 = null;
	}
}
