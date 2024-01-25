import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
	public static int anInt1747;

	@OriginalMember(owner = "client!cq", name = "U", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!cq", name = "V", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!cq", name = "W", descriptor = "I")
	public static int anInt1749;

	@OriginalMember(owner = "client!cq", name = "M", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_17 = new Class77(59, -1);

	@OriginalMember(owner = "client!cq", name = "Q", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_12 = new Class68(16);

	@OriginalMember(owner = "client!cq", name = "R", descriptor = "[I")
	public static final int[] anIntArray180 = new int[14];

	@OriginalMember(owner = "client!cq", name = "T", descriptor = "I")
	public static int anInt1748 = 0;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method1643(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(61) char local61;
			if (local17 == '\u0000') {
				local61 = arg2.charAt(local13++);
			} else {
				local61 = local17;
			}
			@Pc(77) char local77;
			if (local19 == '\u0000') {
				local77 = arg1.charAt(local15++);
			} else {
				local77 = local19;
			}
			local17 = Static424.method6542(local61);
			local19 = Static424.method6542(local77);
			local61 = Static136.method2790(arg0, local61);
			local77 = Static136.method2790(arg0, local77);
			if (local77 != local61 && Character.toUpperCase(local61) != Character.toUpperCase(local77)) {
				local61 = Character.toLowerCase(local61);
				local77 = Character.toLowerCase(local77);
				if (local61 != local77) {
					return Static447.method6758(local61, arg0) - Static447.method6758(local77, arg0);
				}
			}
		}
		@Pc(135) int local135 = Math.min(local8, local11);
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			if (arg0 == 2) {
				local15 = local11 - local137 - 1;
				local13 = local8 - local137 - 1;
			} else {
				local15 = local137;
				local13 = local137;
			}
			@Pc(168) char local168 = arg2.charAt(local13);
			@Pc(172) char local172 = arg1.charAt(local15);
			if (local168 != local172 && Character.toUpperCase(local168) != Character.toUpperCase(local172)) {
				local168 = Character.toLowerCase(local168);
				local172 = Character.toLowerCase(local172);
				if (local168 != local172) {
					return Static447.method6758(local168, arg0) - Static447.method6758(local172, arg0);
				}
			}
		}
		@Pc(213) int local213 = local8 - local11;
		if (local213 != 0) {
			return local213;
		}
		for (@Pc(222) int local222 = 0; local222 < local135; local222++) {
			@Pc(228) char local228 = arg2.charAt(local222);
			@Pc(232) char local232 = arg1.charAt(local222);
			if (local232 != local228) {
				return Static447.method6758(local228, arg0) - Static447.method6758(local232, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZZ)V")
	public static void method1645(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static406.anInt7660 != -1) {
				Static419.method6486(Static406.anInt7660);
			}
			for (@Pc(19) Class12_Sub34 local19 = (Class12_Sub34) Static456.aClass68_67.method1923(); local19 != null; local19 = (Class12_Sub34) Static456.aClass68_67.method1920()) {
				if (!local19.method7970()) {
					local19 = (Class12_Sub34) Static456.aClass68_67.method1923();
					if (local19 == null) {
						break;
					}
				}
				Static102.method2109(true, local19, false);
			}
			Static406.anInt7660 = -1;
			Static456.aClass68_67 = new Class68(8);
			Static391.method5854();
			Static406.anInt7660 = Static258.anInt5240;
			Static53.method1407(false);
			Static445.method6725();
			Static312.method5016(Static406.anInt7660);
		}
		Static5.aBoolean4 = false;
		Static262.aString56 = "";
		Static172.aString92 = "";
		Static115.method2384();
		Static4.anInt69 = -1;
		Static269.method4559(Static125.anInt2925);
		Static440.aClass30_Sub1_Sub1_Sub1_2 = new Class30_Sub1_Sub1_Sub1();
		Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0] = Static37.anInt7512 / 2;
		Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 = Static37.anInt7512 * 128 / 2;
		Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 = Static329.anInt6247 * 128 / 2;
		Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0] = Static329.anInt6247 / 2;
		Static6.anInt93 = 0;
		Static368.anInt6832 = 0;
		if (Static242.anInt4993 == 2) {
			Static6.anInt93 = Static180.anInt4075 << 7;
			Static368.anInt6832 = Static6.anInt95 << 7;
		} else {
			Static83.method1859();
		}
		Static299.method4822();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!an;BLclient!qa;)V")
	public static void method1646(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class42 arg1) {
		if (Static523.aBoolean662) {
			return;
		}
		arg1.Z(0);
		Static183.aClass84_6 = arg1.method5839(Static550.method894(arg0, Static5.anInt73));
		Static183.aClass84_6.method7487((Static169.anInt3893 - Static183.aClass84_6.EA()) / 2, (Static127.anInt2936 - Static183.aClass84_6.ma()) / 2);
		Static317.aClass84_16 = arg1.method5839(Static550.method894(arg0, Static214.anInt4675));
		Static317.aClass84_16.method7487((Static169.anInt3893 - Static317.aClass84_16.EA()) / 2, 18);
		Static523.aBoolean662 = true;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!daa;)Lclient!rb;")
	public static Class182_Sub3 method1647(@OriginalArg(1) Class12_Sub8 arg0) {
		return new Class182_Sub3(arg0.method5217(), arg0.method5217(), arg0.method5217(), arg0.method5217(), arg0.method5195(), arg0.method5216());
	}
}
