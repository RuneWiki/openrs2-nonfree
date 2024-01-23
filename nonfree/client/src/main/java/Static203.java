import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	public static int anInt5699;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "Lclient!jl;")
	public static Class89 aClass89_45 = new Class89(8);

	@OriginalMember(owner = "client!om", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString407 = " from your ignore list first.";

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	public static int anInt5700 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4319(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
	public static void method4326() {
		Static293.aClass89_50.method2266();
		Static215.aClass89_33.method2266();
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
	public static void method4327() {
		Static140.aClass1_Sub14_Sub1_2.method2255();
		@Pc(13) int local13 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
		if (local13 == 0) {
			return;
		}
		@Pc(25) int local25 = Static140.aClass1_Sub14_Sub1_2.method2251(2);
		if (local25 == 0) {
			Static100.anIntArray223[Static242.anInt5012++] = 2047;
			return;
		}
		@Pc(56) int local56;
		@Pc(68) int local68;
		if (local25 == 1) {
			local56 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
			Static56.aClass2_Sub4_Sub2_1.method2093(1, local56);
			local68 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
			if (local68 == 1) {
				Static100.anIntArray223[Static242.anInt5012++] = 2047;
			}
		} else if (local25 == 2) {
			if (Static140.aClass1_Sub14_Sub1_2.method2251(1) == 1) {
				local56 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
				Static56.aClass2_Sub4_Sub2_1.method2093(2, local56);
				local68 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
				Static56.aClass2_Sub4_Sub2_1.method2093(2, local68);
			} else {
				local56 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
				Static56.aClass2_Sub4_Sub2_1.method2093(0, local56);
			}
			local56 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
			if (local56 == 1) {
				Static100.anIntArray223[Static242.anInt5012++] = 2047;
			}
		} else if (local25 == 3) {
			local56 = Static140.aClass1_Sub14_Sub1_2.method2251(7);
			local68 = Static140.aClass1_Sub14_Sub1_2.method2251(7);
			@Pc(169) int local169 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
			@Pc(174) int local174 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
			if (local174 == 1) {
				Static100.anIntArray223[Static242.anInt5012++] = 2047;
			}
			Static185.anInt4085 = Static140.aClass1_Sub14_Sub1_2.method2251(2);
			Static56.aClass2_Sub4_Sub2_1.method2110(local56, local68, local169 == 1);
		}
	}
}
