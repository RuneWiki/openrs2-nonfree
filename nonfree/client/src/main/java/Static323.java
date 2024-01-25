import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array24;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
	public static int anInt6108 = 0;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "Lclient!jf;")
	public static Class96 aClass96_20 = null;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "S")
	public static short aShort84 = 1;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "[I")
	public static final int[] anIntArray526 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)Z")
	public static boolean method5433(@OriginalArg(1) int arg0) {
		if (Static225.aBooleanArray17[arg0]) {
			return true;
		} else if (Static327.aClass170_117.method4562(arg0)) {
			@Pc(29) int local29 = Static327.aClass170_117.method4575(arg0);
			if (local29 == 0) {
				Static225.aBooleanArray17[arg0] = true;
				return true;
			}
			if (Static348.aClass96ArrayArray1[arg0] == null) {
				Static348.aClass96ArrayArray1[arg0] = new Class96[local29];
			}
			for (@Pc(48) int local48 = 0; local48 < local29; local48++) {
				if (Static348.aClass96ArrayArray1[arg0][local48] == null) {
					@Pc(61) byte[] local61 = Static327.aClass170_117.method4584(arg0, local48);
					if (local61 != null) {
						@Pc(73) Class96 local73 = Static348.aClass96ArrayArray1[arg0][local48] = new Class96();
						local73.anInt2877 = (arg0 << 16) + local48;
						if (local61[0] == -1) {
							local73.method2705(new Class5_Sub1(local61));
						} else {
							local73.method2692(new Class5_Sub1(local61));
						}
					}
				}
			}
			Static225.aBooleanArray17[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(JB)V")
	public static void method5435(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 + Static288.anInt5541;
		@Pc(15) int local15 = Static191.anInt5842 + Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773;
		if (Static259.anInt3210 - local10 < -500 || Static259.anInt3210 - local10 > 500 || Static64.anInt1546 - local15 < -500 || Static64.anInt1546 - local15 > 500) {
			Static64.anInt1546 = local15;
			Static259.anInt3210 = local10;
		}
		@Pc(53) int local53;
		@Pc(61) int local61;
		if (local10 != Static259.anInt3210) {
			local53 = local10 - Static259.anInt3210;
			local61 = (int) ((long) local53 * arg0 / 320L);
			if (local53 <= 0) {
				if (local61 == 0) {
					local61 = -1;
				} else if (local53 > local61) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = 1;
			} else if (local61 > local53) {
				local61 = local53;
			}
			Static259.anInt3210 += local61;
		}
		if (local15 != Static64.anInt1546) {
			local53 = local15 - Static64.anInt1546;
			local61 = (int) (arg0 * (long) local53 / 320L);
			if (local53 > 0) {
				if (local61 == 0) {
					local61 = 1;
				} else if (local61 > local53) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = -1;
			} else if (local61 < local53) {
				local61 = local53;
			}
			Static64.anInt1546 += local61;
		}
		if (!Static139.aBoolean462) {
			Static155.aFloat64 += (float) arg0 * Static183.aFloat46 / 6.0F;
			Static5.aFloat2 += (float) arg0 * Static230.aFloat69 / 6.0F;
		}
		Static65.method1806();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!en;Lclient!ng;I)I")
	public static int method5436(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class135 arg1) {
		if (arg1.anInt3941 != -1) {
			return arg1.anInt3941;
		}
		if (arg1.anInt3944 != -1) {
			@Pc(34) Class84 local34 = Static112.anInterface1_2.method2005(arg0.method4862() ? arg1.anInt3944 : arg1.anInt3951);
			if (!local34.aBoolean167) {
				return local34.aShort30;
			}
		}
		return arg1.anInt3954;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
	public static void method5437() {
		if (Static11.anInt349 != 3) {
			Static315.anInt6021 = -1;
		}
	}
}
