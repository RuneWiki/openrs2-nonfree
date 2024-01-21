import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "Z")
	public static boolean aBoolean151;

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lclient!ig;")
	public static Class38 aClass38_2;

	@OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
	public static int anInt3122;

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "Lclient!ah;")
	public static Class7 aClass7_50;

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1015 = Static170.method3101("Please try again)3");

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1023 = Static170.method3101("Please try using a different world)3");

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1016 = aClass28_1023;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1017 = aClass28_1023;

	@OriginalMember(owner = "client!pe", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1018 = aClass28_1023;

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
	public static int anInt3119 = -1;

	@OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1019 = aClass28_1023;

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1020 = aClass28_1015;

	@OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
	public static int anInt3121 = 0;

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1021 = aClass28_1023;

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1022 = aClass28_1023;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!eh;B)V")
	public static void method2432(@OriginalArg(0) Class28 arg0) {
		if (Static34.aClass3_Sub12Array1 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		@Pc(12) long local12 = arg0.method924();
		if (local12 == 0L) {
			return;
		}
		while (local8 < Static34.aClass3_Sub12Array1.length && Static34.aClass3_Sub12Array1[local8].aLong144 != local12) {
			local8++;
		}
		if (Static34.aClass3_Sub12Array1.length > local8 && Static34.aClass3_Sub12Array1[local8] != null) {
			Static51.aClass3_Sub8_Sub1_2.method1559(172);
			Static51.aClass3_Sub8_Sub1_2.method1541(Static34.aClass3_Sub12Array1[local8].aLong144);
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
	public static void method2433() {
		aClass28_1015 = null;
		aClass28_1020 = null;
		aClass38_2 = null;
		aClass28_1016 = null;
		aClass28_1017 = null;
		aClass7_50 = null;
		aClass28_1019 = null;
		aClass28_1022 = null;
		aClass28_1021 = null;
		aClass28_1023 = null;
		aClass28_1018 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!gf;IILclient!fb;II)V")
	public static void method2434(@OriginalArg(1) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub2_Sub2_Sub4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == null) {
			return;
		}
		@Pc(20) int local20 = Static139.anInt3673 + Static170.anInt4092 & 0x7FF;
		@Pc(32) int local32 = Math.max(arg0.anInt1457 / 2, arg0.anInt1515 / 2) + 10;
		@Pc(40) int local40 = arg1 * arg1 + arg5 * arg5;
		if (local32 * local32 < local40) {
			return;
		}
		@Pc(54) int local54 = Class3_Sub2_Sub2_Sub2.anIntArray129[local20];
		@Pc(58) int local58 = Class3_Sub2_Sub2_Sub2.anIntArray127[local20];
		@Pc(66) int local66 = local54 * 256 / (Static51.anInt1446 + 256);
		@Pc(74) int local74 = local58 * 256 / (Static51.anInt1446 + 256);
		@Pc(84) int local84 = arg1 * local74 + arg5 * local66 >> 16;
		@Pc(95) int local95 = local66 * arg1 - local74 * arg5 >> 16;
		arg3.method999(arg0.anInt1457 / 2 + arg4 + local84 - arg3.anInt1173 / 2, -local95 + arg0.anInt1515 / 2 + arg2 - arg3.anInt1172 / 2, arg0.anIntArray263, arg0.anIntArray265);
	}
}
