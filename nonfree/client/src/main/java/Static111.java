import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	public static int anInt2890 = 0;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt2895 = 0;

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1706 = Static15.method178("Enter object name");

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1702 = aClass23_1706;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
	public static int anInt2901 = 0;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "[I")
	public static int[] anIntArray403 = new int[1000];

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1703 = Static15.method178("(U5");

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
	public static int anInt2903 = 0;

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1704 = Static15.method178("sch-Utteln:");

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1705 = Static15.method178("backbase2");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[Lclient!q;IIIIIII[BLclient!ud;)V")
	public static void method1905(@OriginalArg(0) int arg0, @OriginalArg(1) Class50[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) Class65 arg9) {
		@Pc(13) Class1_Sub5 local13 = new Class1_Sub5(arg8);
		@Pc(15) int local15 = -1;
		while (true) {
			@Pc(19) int local19 = local13.method721();
			if (local19 == 0) {
				return;
			}
			local15 += local19;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local13.method721();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(47) int local47 = local27 >> 12;
				@Pc(53) int local53 = local27 >> 6 & 0x3F;
				@Pc(57) int local57 = local13.method716();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (local47 == arg6 && arg4 <= local53 && arg4 + 8 > local53 && arg7 <= local43 && arg7 + 8 > local43) {
					@Pc(96) Class1_Sub1_Sub4 local96 = Static97.method1645(local15);
					@Pc(113) int local113 = Static98.method1648(local43 & 0x7, local65, local96.anInt299, local53 & 0x7, arg0, local96.anInt305) + arg5;
					@Pc(130) int local130 = Static74.method1122(local53 & 0x7, local65, local43 & 0x7, arg0, local96.anInt299, local96.anInt305) + arg2;
					if (local113 > 0 && local130 > 0 && local113 < 103 && local130 < 103) {
						@Pc(142) int local142 = arg3;
						@Pc(144) Class50 local144 = null;
						if ((Static95.aByteArrayArrayArray5[1][local113][local130] & 0x2) == 2) {
							local142 = arg3 - 1;
						}
						if (local142 >= 0) {
							local144 = arg1[local142];
						}
						Static10.method109(local113, local144, arg0 + local65 & 0x3, local15, arg9, local61, arg3, local130);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method1906() {
		aClass23_1703 = null;
		aClass23_1702 = null;
		aClass23_1704 = null;
		aClass23_1705 = null;
		aClass23_1706 = null;
		anIntArray403 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lclient!a;")
	public static Class1_Sub1_Sub1 method1907(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1_Sub1 local6 = (Class1_Sub1_Sub1) Static29.aClass5_22.method98((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(35) byte[] local35 = Static32.aClass55_17.method1867(arg0, 10);
		local6 = new Class1_Sub1_Sub1();
		local6.anInt65 = arg0;
		if (local35 != null) {
			local6.method38(new Class1_Sub5(local35));
		}
		local6.method33();
		if (local6.anInt53 != -1) {
			local6.method34(method1907(local6.anInt67), method1907(local6.anInt53));
		}
		if (!Static88.aBoolean64 && local6.aBoolean1) {
			local6.aClass23_58 = Static108.aClass23_1616;
			local6.aClass23Array1 = null;
			local6.aClass23Array2 = null;
			local6.anInt87 = 0;
		}
		Static29.aClass5_22.method97(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!rb;Lclient!rb;Lclient!rb;)V")
	public static void method1908(@OriginalArg(1) Class55 arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class55 arg2) {
		Static12.aClass55_39 = arg2;
		Static12.aClass55_38 = arg1;
		Static55.aClass55_25 = arg0;
		Static105.aClass1_Sub1_Sub7ArrayArray1 = new Class1_Sub1_Sub7[Static12.aClass55_38.method1888()][];
		Static26.aBooleanArray4 = new boolean[Static12.aClass55_38.method1888()];
	}
}
