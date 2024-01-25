import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt6744;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "Lclient!vm;")
	public static Class92 aClass92_9;

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "Lclient!am;")
	public static Class11 aClass11_151;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	public static int anInt6743 = 0;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "[Lclient!qs;")
	public static final Class174[] aClass174Array1 = new Class174[4];

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public static int anInt6751 = 999999;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
	public static int anInt6757 = 2;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
	public static int anInt6761 = 10;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
	public static int anInt6764 = 0;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
	public static int anInt6765 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BJ)V")
	public static void method5611(@OriginalArg(1) long arg0) {
		if (Static307.aClass26Array3 != null) {
			if (Static303.anInt3065 == 1 || Static303.anInt3065 == 5) {
				Static191.method3464(arg0);
			} else if (Static303.anInt3065 == 2) {
				Static142.method2792();
			} else if (Static303.anInt3065 == 4) {
				Static252.method4348(arg0);
			} else {
				Static115.method2087();
			}
		}
		Static173.method3264((long) Static342.anInt6706, Static164.aClass92_7);
		if (Static310.anInt6220 != -1) {
			Static220.method3777(Static310.anInt6220);
		}
		for (@Pc(61) int local61 = 0; local61 < Static2.anInt5069; local61++) {
			if (Static60.aBooleanArray8[local61]) {
				Static128.aBooleanArray19[local61] = true;
			}
			Static105.aBooleanArray30[local61] = Static60.aBooleanArray8[local61];
			Static60.aBooleanArray8[local61] = false;
		}
		Static249.anInt5198 = Static342.anInt6706;
		if (Static164.aClass92_7.method4463()) {
			Static347.aBoolean590 = true;
		}
		Static63.aClass72_6 = null;
		if (Static310.anInt6220 != -1) {
			Static2.anInt5069 = 0;
			Static354.method4051();
		}
		Static164.aClass92_7.method4467();
		Static248.method4311(Static164.aClass92_7);
		@Pc(109) int local109 = Static238.method4099();
		if (local109 == -1) {
			local109 = Static277.anInt5630;
		}
		Static129.method2602(local109);
		Static158.method3054(Static279.anInt5645, Static106.anInt2370, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466);
		Static106.anInt2370 = 0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!am;I)V")
	public static void method5612(@OriginalArg(0) Class11 arg0) {
		Static219.anInt4567 = 0;
		Static191.anInt4123 = 0;
		Static140.aClass204_6 = new Class204();
		Static219.aClass17_Sub7_Sub1_Sub1Array2 = new Class17_Sub7_Sub1_Sub1[1024];
		Static266.method4644(arg0);
		Static30.method502(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIBI)V")
	public static void method5617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static9.anInt6459 = arg2;
		Static11.anInt263 = arg1;
		Static155.anInt3462 = arg0;
		Static293.anInt5930 = arg3;
		Static80.anInt1721 = arg4;
		if (Static293.anInt5930 >= 100) {
			@Pc(32) int local32 = Static9.anInt6459 * 128 + 64;
			@Pc(38) int local38 = Static80.anInt1721 * 128 + 64;
			@Pc(47) int local47 = Static119.method2125(local32, local38, Static279.anInt5645) - Static155.anInt3462;
			@Pc(52) int local52 = local32 - Static230.anInt4796;
			@Pc(57) int local57 = local47 - Static105.anInt6098;
			@Pc(62) int local62 = local38 - Static133.anInt3056;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local62 * local62 + local52 * local52));
			Static288.anInt5845 = (int) (Math.atan2((double) local57, (double) local73) * 2607.5945876176133D) & 0x3FFF;
			Static332.anInt6592 = (int) (-2607.5945876176133D * Math.atan2((double) local52, (double) local62)) & 0x3FFF;
			if (Static288.anInt5845 < 1024) {
				Static288.anInt5845 = 1024;
			}
			if (Static288.anInt5845 > 3072) {
				Static288.anInt5845 = 3072;
			}
		}
		Static303.anInt3065 = 2;
	}
}
