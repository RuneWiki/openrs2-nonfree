import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_12;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!rb;")
	public static Class55 aClass55_19;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!pb;")
	public static Class46 aClass46_2;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public static int anInt1287 = -1;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_640 = Static15.method178("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_641 = Static15.method178("*6n");

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	public static int anInt1299 = 0;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	public static int anInt1300 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method742() {
		Static83.aClass34_64.method1138();
		Static15.aClass1_Sub1_Sub6_Sub3_4.method1194(0, 0);
		Static28.anIntArray263 = Static93.method1588(Static28.anIntArray263);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method743() {
		if (Static40.anInt1400 < 2 && Static115.anInt2955 == 0 && Static94.anInt2487 == 0) {
			return;
		}
		@Pc(44) Class23 local44;
		if (Static115.anInt2955 == 1 && Static40.anInt1400 < 2) {
			local44 = Static17.method233(new Class23[] { Static73.aClass23_1201, Static27.aClass23_472, Static87.aClass23_1690, Static44.aClass23_792 });
		} else if (Static94.anInt2487 == 1 && Static40.anInt1400 < 2) {
			local44 = Static17.method233(new Class23[] { Static3.aClass23_96, Static27.aClass23_472, Static1.aClass23_53, Static44.aClass23_792 });
		} else {
			local44 = Static109.aClass23Array18[Static40.anInt1400 - 1];
		}
		if (Static40.anInt1400 > 2) {
			local44 = Static17.method233(new Class23[] { local44, Static56.aClass23_931, Static19.method274(Static40.anInt1400 - 2), Static13.aClass23_187 });
		}
		Static2.aClass1_Sub1_Sub6_Sub2_13.method837(local44, 4, 16777215, Static7.anInt176 / 1000);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
	public static boolean method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(14) Class1_Sub1_Sub4 local14 = Static97.method1645(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local14.method182(arg1);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)I")
	public static int method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) int local20 = 65536 - Class1_Sub1_Sub6_Sub4.anIntArray337[arg2 * 1024 / arg1] >> 1;
		return (arg3 * (65536 - local20) >> 16) + (local20 * arg0 >> 16);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Z")
	public static boolean method746(@OriginalArg(1) int arg0) {
		if (!Static77.method1346(arg0)) {
			return false;
		}
		@Pc(15) Class1_Sub1_Sub7[] local15 = Static105.aClass1_Sub1_Sub7ArrayArray1[arg0];
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
			@Pc(25) Class1_Sub1_Sub7 local25 = local15[local19];
			if (local25 != null && local25.anInt802 == 6) {
				@Pc(52) int local52;
				if (local25.anInt846 != -1 || local25.anInt789 != -1) {
					@Pc(47) boolean local47 = Static98.method1650(local25);
					if (local47) {
						local52 = local25.anInt789;
					} else {
						local52 = local25.anInt846;
					}
					if (local52 != -1) {
						@Pc(65) Class1_Sub1_Sub8 local65 = Static18.method249(local52);
						local25.anInt825 += Static70.anInt1829;
						label52: while (true) {
							do {
								do {
									if (local25.anInt825 <= local65.anIntArray143[local25.anInt841]) {
										break label52;
									}
									local17 = true;
									local25.anInt825 -= local65.anIntArray143[local25.anInt841];
									local25.anInt841++;
								} while (local65.anIntArray147.length > local25.anInt841);
								local25.anInt841 -= local65.anInt1074;
							} while (local25.anInt841 >= 0 && local65.anIntArray147.length > local25.anInt841);
							local25.anInt841 = 0;
						}
					}
				}
				if (local25.anInt805 != 0 && !local25.aBoolean39) {
					local17 = true;
					@Pc(148) int local148 = local25.anInt805 >> 16;
					@Pc(152) int local152 = local148 * Static70.anInt1829;
					local52 = local25.anInt805 << 16 >> 16;
					local25.anInt801 = local152 + local25.anInt801 & 0x7FF;
					local52 *= Static70.anInt1829;
					local25.anInt792 = local25.anInt792 + local52 & 0x7FF;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static77.method1346(arg7)) {
			Static27.method439(arg4, arg6, -1, arg1, arg3, arg5, Static105.aClass1_Sub1_Sub7ArrayArray1[arg7], 0, arg0, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public static void method748() {
		aClass23_640 = null;
		aClass23_641 = null;
		aClass1_Sub1_Sub6_Sub3_12 = null;
		aClass46_2 = null;
		aClass55_19 = null;
	}
}
