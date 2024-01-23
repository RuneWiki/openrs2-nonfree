import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "Lclient!gi;")
	public static Class39 aClass39_5;

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "Lclient!ic;")
	public static Class2_Sub14 aClass2_Sub14_1;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_109;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "Lclient!i;")
	private static Class41 aClass41_1072 = Static184.method2923("To create a new account you need to");

	@OriginalMember(owner = "client!s", name = "T", descriptor = "Lclient!i;")
	public static Class41 aClass41_1068 = aClass41_1072;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "I")
	public static int anInt4078 = 0;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "Lclient!i;")
	public static Class41 aClass41_1069 = Static184.method2923("blaugr-Un:");

	@OriginalMember(owner = "client!s", name = "X", descriptor = "Lclient!i;")
	public static Class41 aClass41_1070 = Static184.method2923("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
	public static int anInt4080 = 0;

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "Lclient!i;")
	private static Class41 aClass41_1073 = Static184.method2923("Loading)3)3)3");

	@OriginalMember(owner = "client!s", name = "db", descriptor = "Lclient!i;")
	public static Class41 aClass41_1071 = aClass41_1073;

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "Lclient!i;")
	public static Class41 aClass41_1074 = Static184.method2923(")1 ");

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V")
	public static void method2809() {
		Static81.aClass16_4.method436();
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Lclient!hi;")
	public static Class21 method2810() {
		try {
			return (Class21) Class.forName("Class21_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return new Class21_Sub1();
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(Z)V")
	public static void method2811() {
		for (@Pc(7) int local7 = 0; local7 < Static170.anInt3986; local7++) {
			@Pc(13) int local13 = Static124.anIntArray313[local7];
			@Pc(17) Class12_Sub3_Sub2 local17 = Static199.aClass12_Sub3_Sub2Array1[local13];
			@Pc(21) int local21 = Static204.aClass2_Sub3_Sub1_3.method209();
			@Pc(32) int local32;
			@Pc(36) int local36;
			if ((local21 & 0x8) != 0) {
				local32 = Static204.aClass2_Sub3_Sub1_3.method164();
				local36 = Static204.aClass2_Sub3_Sub1_3.method214();
				if (local32 == 65535) {
					local32 = -1;
				}
				Static126.method2065(local32, local36, local17);
			}
			if ((local21 & 0x1) != 0) {
				local17.aClass41_1039 = Static204.aClass2_Sub3_Sub1_3.method160();
				local17.anInt3941 = 100;
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt3925 = Static204.aClass2_Sub3_Sub1_3.method164();
				local17.anInt3928 = Static204.aClass2_Sub3_Sub1_3.method163();
			}
			if ((local21 & 0x80) != 0) {
				local17.anInt3911 = Static204.aClass2_Sub3_Sub1_3.method205();
				local32 = Static204.aClass2_Sub3_Sub1_3.method175();
				if (local17.anInt3911 == 65535) {
					local17.anInt3911 = -1;
				}
				local17.anInt3953 = local32 >> 16;
				local17.anInt3908 = 0;
				local17.anInt3948 = 0;
				local17.anInt3913 = (local32 & 0xFFFF) + Static103.anInt2511;
				if (Static103.anInt2511 < local17.anInt3913) {
					local17.anInt3908 = -1;
				}
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt3943 = Static204.aClass2_Sub3_Sub1_3.method211();
				if (local17.anInt3943 == 65535) {
					local17.anInt3943 = -1;
				}
			}
			if ((local21 & 0x10) != 0) {
				local17.aClass2_Sub2_Sub12_1 = Static132.method2097(Static204.aClass2_Sub3_Sub1_3.method211());
				local17.anInt3931 = local17.aClass2_Sub2_Sub12_1.anInt2670;
				local17.anInt3932 = local17.aClass2_Sub2_Sub12_1.anInt2676;
				local17.anInt3921 = local17.aClass2_Sub2_Sub12_1.anInt2655;
				local17.anInt3956 = local17.aClass2_Sub2_Sub12_1.anInt2681;
				local17.anInt3934 = local17.aClass2_Sub2_Sub12_1.anInt2661;
				local17.anInt3950 = local17.aClass2_Sub2_Sub12_1.anInt2669;
				local17.anInt3951 = local17.aClass2_Sub2_Sub12_1.anInt2672;
				local17.anInt3915 = local17.aClass2_Sub2_Sub12_1.anInt2677;
				local17.anInt3922 = local17.aClass2_Sub2_Sub12_1.anInt2659;
			}
			if ((local21 & 0x40) != 0) {
				local32 = Static204.aClass2_Sub3_Sub1_3.method181();
				local36 = Static204.aClass2_Sub3_Sub1_3.method181();
				local17.method2725(Static103.anInt2511, local36, local32);
			}
			if ((local21 & 0x4) != 0) {
				local32 = Static204.aClass2_Sub3_Sub1_3.method157();
				local36 = Static204.aClass2_Sub3_Sub1_3.method209();
				local17.method2725(Static103.anInt2511, local36, local32);
				local17.anInt3946 = Static103.anInt2511 + 300;
				local17.anInt3938 = Static204.aClass2_Sub3_Sub1_3.method181();
			}
		}
	}
}
