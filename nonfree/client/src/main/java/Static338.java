import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
	public static int anInt6437;

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
	public static int anInt6438;

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
	public static int anInt6427 = 0;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(ILclient!fp;)V")
	public static void method5695(@OriginalArg(1) Class63 arg0) {
		@Pc(7) int local7 = Static35.anInt920;
		@Pc(9) int local9 = Static361.anInt6937;
		@Pc(11) int local11 = Static182.anInt3706;
		@Pc(15) int local15 = Static208.anInt4100 - 3;
		if (Static196.aClass4_15 == null || Static161.aClass4_10 == null) {
			if (Static280.aClass30_83.method1154(anInt6438) && Static280.aClass30_83.method1154(Static56.anInt1430)) {
				Static196.aClass4_15 = arg0.method4589(Static382.method5432(Static280.aClass30_83, anInt6438, 0));
				@Pc(44) Class201 local44 = Static382.method5432(Static280.aClass30_83, Static56.anInt1430, 0);
				Static161.aClass4_10 = arg0.method4589(local44);
				local44.method5437();
				Static49.aClass4_4 = arg0.method4589(local44);
			} else {
				arg0.method4653(local7, local9, local11, 20, 255 - Static6.anInt205 << 24 | Static117.anInt2563, 1);
			}
		}
		@Pc(88) int local88;
		@Pc(86) int local86;
		if (Static196.aClass4_15 != null && Static161.aClass4_10 != null) {
			local86 = (local11 - Static161.aClass4_10.method5962() * 2) / Static196.aClass4_15.method5962();
			for (local88 = 0; local88 < local86; local88++) {
				Static196.aClass4_15.method5948(Static161.aClass4_10.method5962() + local7 + Static196.aClass4_15.method5962() * local88, local9);
			}
			Static161.aClass4_10.method5948(local7, local9);
			Static49.aClass4_4.method5948(local7 + local11 - Static49.aClass4_4.method5962(), local9);
		}
		Static340.aClass33_3.method6024(-1, local9 + 14, Static110.aClass106_84.method2927(Static254.anInt5172), Static306.anInt5890 | 0xFF000000, local7 + 3);
		arg0.method4653(local7, local9 + 20, local11, local15 - 20, -Static6.anInt205 + 255 << 24 | Static117.anInt2563, 1);
		local86 = Static164.aClass142_1.method4911();
		local88 = Static164.aClass142_1.method4915();
		@Pc(167) int local167 = 0;
		@Pc(189) int local189;
		for (@Pc(172) Class1_Sub22 local172 = (Class1_Sub22) Static317.aClass42_43.method1543(); local172 != null; local172 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
			local189 = local9 + (-local167 + -1 + Static224.anInt4512) * 16 + 13 + 20;
			if (local7 < local86 && local86 < local7 + local11 && local88 > local189 - 13 && local189 + 4 > local88 && local172.aBoolean204) {
				arg0.method4653(local7, local189 - 12, local11, 16, 255 - Static148.anInt3119 << 24 | Static19.anInt484, 1);
			}
			local167++;
		}
		if ((Static324.aClass4_21 == null || Static288.aClass4_20 == null || Static23.aClass4_2 == null) && Static280.aClass30_83.method1154(Static213.anInt4280) && Static280.aClass30_83.method1154(Static94.anInt2086) && Static280.aClass30_83.method1154(Static357.anInt6853)) {
			@Pc(270) Class201 local270 = Static382.method5432(Static280.aClass30_83, Static94.anInt2086, 0);
			Static288.aClass4_20 = arg0.method4589(local270);
			local270.method5437();
			Static180.aClass4_11 = arg0.method4589(local270);
			Static324.aClass4_21 = arg0.method4589(Static382.method5432(Static280.aClass30_83, Static213.anInt4280, 0));
			@Pc(295) Class201 local295 = Static382.method5432(Static280.aClass30_83, Static357.anInt6853, 0);
			Static23.aClass4_2 = arg0.method4589(local295);
			local295.method5437();
			Static22.aClass4_26 = arg0.method4589(local295);
		}
		local167 = 0;
		@Pc(365) int local365;
		@Pc(328) int local328;
		if (Static324.aClass4_21 != null && Static288.aClass4_20 != null && Static23.aClass4_2 != null) {
			local189 = (local11 - Static23.aClass4_2.method5962() * 2) / Static324.aClass4_21.method5962();
			for (local328 = 0; local328 < local189; local328++) {
				Static324.aClass4_21.method5948(Static23.aClass4_2.method5962() + local7 + Static324.aClass4_21.method5962() * local328, -Static324.aClass4_21.method5952() + local9 - -local15);
			}
			local365 = (local15 - Static23.aClass4_2.method5952() - 20) / Static288.aClass4_20.method5952();
			for (@Pc(367) int local367 = 0; local367 < local365; local367++) {
				Static288.aClass4_20.method5948(local7, local9 + local367 * Static288.aClass4_20.method5952() + 20);
				Static180.aClass4_11.method5948(local7 + local11 - Static180.aClass4_11.method5962(), local9 - -(Static288.aClass4_20.method5952() * local367) + 20);
			}
			Static23.aClass4_2.method5948(local7, local9 + local15 - Static23.aClass4_2.method5952());
			Static22.aClass4_26.method5948(local7 + local11 - Static23.aClass4_2.method5962(), local15 + local9 - Static23.aClass4_2.method5952());
		}
		for (@Pc(434) Class1_Sub22 local434 = (Class1_Sub22) Static317.aClass42_43.method1543(); local434 != null; local434 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
			local328 = local9 + (-local167 + -1 + Static224.anInt4512) * 16 + 13 + 20;
			local365 = Static306.anInt5890 | 0xFF000000;
			if (local7 < local86 && local11 + local7 > local86 && local328 - 13 < local88 && local88 < local328 + 4 && local434.aBoolean204) {
				local365 = Static84.anInt1882 | 0xFF000000;
			}
			@Pc(502) int[] local502 = null;
			if (Static83.method1776(local434.anInt2822)) {
				local502 = Static243.aClass220_2.method5972((int) local434.aLong104).anIntArray58;
			} else if (Static289.method5105(local434.anInt2822)) {
				@Pc(563) Class11_Sub2_Sub6_Sub2 local563 = Static231.aClass11_Sub2_Sub6_Sub2Array1[(int) local434.aLong104];
				if (local563 != null) {
					@Pc(568) Class208 local568 = local563.aClass208_1;
					if (local568.anIntArray480 != null) {
						local568 = local568.method5539();
					}
					if (local568 != null) {
						local502 = local568.anIntArray476;
					}
				}
			} else if (Static298.method5710(local434.anInt2822)) {
				@Pc(537) Class71 local537;
				if (local434.anInt2822 == 1006) {
					local537 = Static219.method4081((int) local434.aLong104);
				} else {
					local537 = Static219.method4081((int) (local434.aLong104 >>> 32 & 0x7FFFFFFFL));
				}
				if (local537.anIntArray178 != null) {
					local537 = local537.method2282();
				}
				if (local537 != null) {
					local502 = local537.anIntArray181;
				}
			}
			@Pc(593) String local593 = Static123.method2597(local434);
			if (local502 != null) {
				local593 = local593 + Static7.method285(local502);
			}
			Static340.aClass33_3.method6032(local328, local593, Static213.aClass4Array11, local7 + 3, Static74.anIntArray137, local365);
			local167++;
			if (local434.aBoolean203) {
				Static155.aClass4_9.method5948(local7 + Static64.aClass80_17.method2543(local593) + 5, local328 + -12);
			}
		}
		Static271.method594(Static361.anInt6937, Static35.anInt920, Static182.anInt3706, Static208.anInt4100);
	}
}
