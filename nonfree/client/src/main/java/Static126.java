import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
	public static int anInt2534;

	@OriginalMember(owner = "client!m", name = "W", descriptor = "I")
	public static int anInt2530 = 0;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "Lclient!hh;")
	private static Class50 aClass50_881 = Static186.method3527("Mon");

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_882 = Static186.method3527("Tue");

	@OriginalMember(owner = "client!m", name = "db", descriptor = "Lclient!hh;")
	private static Class50 aClass50_883 = Static186.method3527("Fri");

	@OriginalMember(owner = "client!m", name = "ib", descriptor = "Lclient!hh;")
	private static Class50 aClass50_887 = Static186.method3527("Sun");

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_886 = Static186.method3527("Wed");

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_885 = Static186.method3527("Thu");

	@OriginalMember(owner = "client!m", name = "fb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_884 = Static186.method3527("Sat");

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "[Lclient!hh;")
	private static Class50[] aClass50Array49 = new Class50[] { aClass50_887, aClass50_881, aClass50_882, aClass50_886, aClass50_885, aClass50_883, aClass50_884 };

	@OriginalMember(owner = "client!m", name = "jb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_888 = Static186.method3527(")2");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IJ)Lclient!hh;")
	public static Class50 method2027(@OriginalArg(1) long arg0) {
		Static3.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static3.aCalendar1.get(7);
		@Pc(17) int local17 = Static3.aCalendar1.get(5);
		@Pc(21) int local21 = Static3.aCalendar1.get(2);
		@Pc(25) int local25 = Static3.aCalendar1.get(1);
		@Pc(29) int local29 = Static3.aCalendar1.get(11);
		@Pc(33) int local33 = Static3.aCalendar1.get(12);
		@Pc(37) int local37 = Static3.aCalendar1.get(13);
		return Static17.method257(new Class50[] { aClass50Array49[local13 - 1], Static9.aClass50_87, Static160.method2684(local17 / 10), Static160.method2684(local17 % 10), Static206.aClass50_1320, Static200.aClass50Array77[local21], Static206.aClass50_1320, Static160.method2684(local25), Static24.aClass50_190, Static160.method2684(local29 / 10), Static160.method2684(local29 % 10), Static212.aClass50_1334, Static160.method2684(local33 / 10), Static160.method2684(local33 % 10), Static212.aClass50_1334, Static160.method2684(local37 / 10), Static160.method2684(local37 % 10), Static148.aClass50_1017 });
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
	public static void method2028(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub8_Sub1 local10;
		if (Static184.aClass1_Sub1_Sub8_5 == null) {
			local10 = new Class1_Sub1_Sub8_Sub1(512, 512);
		} else {
			local10 = (Class1_Sub1_Sub8_Sub1) Static184.aClass1_Sub1_Sub8_5;
		}
		@Pc(21) int[] local21 = local10.anIntArray310;
		@Pc(24) int local24 = local21.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			local21[local26] = 1;
		}
		@Pc(57) int local57;
		@Pc(59) int local59;
		for (@Pc(38) int local38 = 1; local38 < 103; local38++) {
			local57 = 4 * 512 * (103 - local38) + 24628;
			for (local59 = 1; local59 < 103; local59++) {
				if ((Static159.aByteArrayArrayArray13[arg0][local59][local38] & 0x18) == 0) {
					Static219.method2431(local21, local57, arg0, local59, local38);
				}
				if (arg0 < 3 && (Static159.aByteArrayArrayArray13[arg0 + 1][local59][local38] & 0x8) != 0) {
					Static219.method2431(local21, local57, arg0 + 1, local59, local38);
				}
				local57 += 4;
			}
		}
		local10.method2449();
		local57 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
		local59 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(161) int local161;
		for (@Pc(157) int local157 = 1; local157 < 103; local157++) {
			for (local161 = 1; local161 < 103; local161++) {
				if ((Static159.aByteArrayArrayArray13[arg0][local161][local157] & 0x18) == 0) {
					Static227.method3438(local57, local161, local59, local157, arg0);
				}
				if (arg0 < 3 && (Static159.aByteArrayArrayArray13[arg0 + 1][local161][local157] & 0x8) != 0) {
					Static227.method3438(local57, local161, local59, local157, arg0 + 1);
				}
			}
		}
		Static41.anInt881 = 0;
		for (local161 = 0; local161 < 104; local161++) {
			for (@Pc(226) int local226 = 0; local226 < 104; local226++) {
				@Pc(233) long local233 = Static64.method988(Static212.anInt4195, local161, local226);
				if (local233 != 0L) {
					@Pc(248) Class18 local248 = Static148.method2487((int) (local233 >>> 32) & Integer.MAX_VALUE);
					@Pc(251) int local251 = local248.anInt815;
					@Pc(256) int local256;
					if (local248.anIntArray66 != null) {
						for (local256 = 0; local256 < local248.anIntArray66.length; local256++) {
							if (local248.anIntArray66[local256] != -1) {
								@Pc(272) Class18 local272 = Static148.method2487(local248.anIntArray66[local256]);
								if (local272.anInt815 >= 0) {
									local251 = local272.anInt815;
									break;
								}
							}
						}
					}
					if (local251 >= 0) {
						local256 = local161;
						@Pc(295) int local295 = local226;
						if (local251 != 22 && local251 != 29 && local251 != 34 && local251 != 36 && local251 != 46 && local251 != 47 && local251 != 48) {
							@Pc(329) int[][] local329 = Static22.aClass16Array1[Static212.anInt4195].anIntArrayArray6;
							for (@Pc(331) int local331 = 0; local331 < 10; local331++) {
								@Pc(338) int local338 = (int) (Math.random() * 4.0D);
								if (local338 == 0 && local256 > 0 && local256 > local161 - 3 && (local329[local256 - 1][local295] & 0x12C0108) == 0) {
									local256--;
								}
								if (local338 == 1 && local256 < 103 && local256 < local161 + 3 && (local329[local256 + 1][local295] & 0x12C0180) == 0) {
									local256++;
								}
								if (local338 == 2 && local295 > 0 && local295 > local226 - 3 && (local329[local256][local295 - 1] & 0x12C0102) == 0) {
									local295--;
								}
								if (local338 == 3 && local295 < 103 && local295 < local226 + 3 && (local329[local256][local295 + 1] & 0x12C0120) == 0) {
									local295++;
								}
							}
						}
						Static3.anIntArray12[Static41.anInt881] = local248.anInt790;
						Static221.anIntArray498[Static41.anInt881] = local256;
						Static26.anIntArray53[Static41.anInt881] = local295;
						Static41.anInt881++;
					}
				}
			}
		}
		Static184.aClass1_Sub1_Sub8_5 = local10;
		Static133.aClass35_1.method3264();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
	public static void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg2) {
			Static107.method1641(arg2, arg1, Static139.anIntArrayArray21[arg0], arg3);
		} else {
			Static107.method1641(arg3, arg1, Static139.anIntArrayArray21[arg0], arg2);
		}
	}
}
