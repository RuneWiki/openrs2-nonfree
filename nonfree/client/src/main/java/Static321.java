import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lclient!nd;")
	public static Class238 aClass238_147;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
	public static int anInt5651 = -2;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "[I")
	public static final int[] anIntArray352 = new int[4];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IBIIIII)Lclient!mda;")
	public static Class49 method4911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 67481L ^ (long) arg5 * 97549L ^ (long) arg1 * 475427L ^ (long) arg3 * 986053L ^ (long) arg0 * 32147369L ^ (long) arg4 * 76724863L;
		@Pc(39) Class49 local39 = (Class49) Static328.aClass69_32.method1919(local33);
		if (local39 == null) {
			local39 = Static28.aClass13_87.method8148(arg2, arg5, arg1, arg3, arg0, arg4);
			Static328.aClass69_32.method1917(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	public static void method4913() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static176.aClass337Array1[local1] = null;
		}
		Static227.anInt4204 = 0;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4914(@OriginalArg(0) Class13 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static148.aBoolean241) {
			local7 = Static100.method1939();
			local9 = Static260.method4303();
		}
		@Pc(21) int local21 = local7 + Static441.anInt7238;
		@Pc(25) int local25 = local9 + Static250.anInt4790;
		@Pc(27) int local27 = Static131.anInt2708;
		@Pc(31) int local31 = Static240.anInt9646 - 3;
		Static425.method6214(Static131.anInt2708, Static441.anInt7238 + local7, arg0, Static240.anInt9646, local9 + Static250.anInt4790, Static573.aClass345_26.method7951(Static496.anInt7407));
		@Pc(62) int local62 = local7 + Static186.aClass358_1.method8722();
		@Pc(69) int local69 = Static186.aClass358_1.method8721() + local9;
		@Pc(73) int local73;
		@Pc(80) Class2_Sub7_Sub21 local80;
		@Pc(97) int local97;
		@Pc(284) int local284;
		@Pc(171) Class2_Sub7_Sub20 local171;
		@Pc(272) Class2_Sub7_Sub21 local272;
		if (Static193.aBoolean754) {
			local73 = 0;
			for (local171 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6680(); local171 != null; local171 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6673()) {
				local97 = local73 * 16 + local25 + 20 + 13;
				if (local62 > local7 + Static441.anInt7238 && Static131.anInt2708 + Static441.anInt7238 + local7 > local62 && local69 > local97 - 13 && local69 < local97 + 4 && (local171.anInt9985 > 1 || ((Class2_Sub7_Sub21) local171.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66).aBoolean722)) {
					arg0.aa(local7 + Static441.anInt7238, local97 + -12, Static131.anInt2708, 16, 255 - Static18.anInt415 << 24 | Static34.anInt697, 1);
				}
				local73++;
			}
			if (Static429.aClass2_Sub7_Sub20_3 != null) {
				local73 = 0;
				Static425.method6214(Static220.anInt4137, Static540.anInt8699, arg0, Static122.anInt2592, Static573.anInt9360, Static429.aClass2_Sub7_Sub20_3.aString106);
				for (local272 = (Class2_Sub7_Sub21) Static429.aClass2_Sub7_Sub20_3.aClass290_13.method6680(); local272 != null; local272 = (Class2_Sub7_Sub21) Static429.aClass2_Sub7_Sub20_3.aClass290_13.method6673()) {
					local284 = local73 * 16 + Static573.anInt9360 + 13 + 20;
					if (Static540.anInt8699 < local62 && local62 < Static220.anInt4137 + Static540.anInt8699 && local69 > local284 - 13 && local69 < local284 + 4 && local272.aBoolean722) {
						arg0.aa(Static540.anInt8699, local284 - 12, Static220.anInt4137, 16, Static34.anInt697 | 255 - Static18.anInt415 << 24, 1);
					}
					local73++;
				}
				Static250.method4180(Static122.anInt2592, Static220.anInt4137, Static540.anInt8699, Static573.anInt9360, arg0);
			}
		} else {
			local73 = 0;
			for (local80 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local80 != null; local80 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
				local97 = local25 + (Static633.anInt10265 + -1 + -local73) * 16 + 13 + 20;
				if (local62 > Static441.anInt7238 + local7 && local7 + Static441.anInt7238 + Static131.anInt2708 > local62 && local69 > local97 - 13 && local69 < local97 + 4 && local80.aBoolean722) {
					arg0.aa(Static441.anInt7238 + local7, local97 + -12, Static131.anInt2708, 16, Static34.anInt697 | 255 - Static18.anInt415 << 24, 1);
				}
				local73++;
			}
		}
		Static250.method4180(Static240.anInt9646, Static131.anInt2708, Static441.anInt7238 + local7, Static250.anInt4790 - -local9, arg0);
		if (Static193.aBoolean754) {
			local73 = 0;
			for (local171 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6680(); local171 != null; local171 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6673()) {
				local97 = local9 + Static250.anInt4790 + local73 * 16 + 13 + 20;
				if (local171.anInt9985 == 1) {
					Static469.method6666(Static250.anInt4790 + local9, (Class2_Sub7_Sub21) local171.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66, Static316.anInt5593 | 0xFF000000, local62, Static240.anInt9646, arg0, local69, local7 + Static441.anInt7238, local97, Static131.anInt2708, Static609.anInt10058 | 0xFF000000);
				} else {
					Static145.method2604(local69, local97, Static609.anInt10058 | 0xFF000000, arg0, local9 + Static250.anInt4790, local62, Static240.anInt9646, local7 + Static441.anInt7238, local171, Static316.anInt5593 | 0xFF000000, Static131.anInt2708);
				}
				local73++;
			}
			if (Static429.aClass2_Sub7_Sub20_3 != null) {
				local73 = 0;
				for (local272 = (Class2_Sub7_Sub21) Static429.aClass2_Sub7_Sub20_3.aClass290_13.method6680(); local272 != null; local272 = (Class2_Sub7_Sub21) Static429.aClass2_Sub7_Sub20_3.aClass290_13.method6673()) {
					local284 = local73 * 16 + Static573.anInt9360 + 13 + 20;
					Static469.method6666(Static573.anInt9360, local272, Static316.anInt5593 | 0xFF000000, local62, Static122.anInt2592, arg0, local69, Static540.anInt8699, local284, Static220.anInt4137, Static609.anInt10058 | 0xFF000000);
					local73++;
				}
				Static501.method6965(Static573.anInt9360, Static122.anInt2592, Static540.anInt8699, Static220.anInt4137);
			}
		} else {
			local73 = 0;
			for (local80 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local80 != null; local80 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
				local97 = (Static633.anInt10265 - local73 - 1) * 16 + local25 + 13 + 20;
				local73++;
				Static469.method6666(local25, local80, Static316.anInt5593 | 0xFF000000, local62, local31, arg0, local69, local21, local97, local27, Static609.anInt10058 | 0xFF000000);
			}
		}
		Static501.method6965(Static250.anInt4790 + local9, Static240.anInt9646, local7 + Static441.anInt7238, Static131.anInt2708);
	}
}
