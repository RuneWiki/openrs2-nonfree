import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "Lclient!ue;")
	public static Class331 aClass331_10;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
	public static final int anInt7985 = Static564.method7583(1600);

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
	public static int anInt7995 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!rr;)V")
	public static void method6502(@OriginalArg(1) Class292 arg0) {
		if (arg0.anInt7900 == Static38.anInt984) {
			Static31.aBooleanArray17[arg0.anInt7889] = true;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIBIZ)Lclient!cd;")
	public static Class6_Sub11 method6504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class6_Sub11 local7 = new Class6_Sub11();
		local7.anInt1216 = arg2;
		local7.anInt1217 = arg0;
		Static224.aClass128_23.method3267(local7, (long) arg1);
		Static577.method7706(arg2);
		@Pc(34) Class292 local34 = Static367.method5505(arg1);
		if (local34 != null) {
			method6502(local34);
		}
		if (Static518.aClass292_13 != null) {
			method6502(Static518.aClass292_13);
			Static518.aClass292_13 = null;
		}
		Static285.method4650();
		if (local34 != null) {
			Static339.method5265(!arg3, local34);
		}
		if (!arg3) {
			Static446.method6318(arg2);
		}
		if (!arg3 && Static468.anInt8036 != -1) {
			Static201.method3632(Static468.anInt8036, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
	public static void method6506() {
		Static25.aClass14_1.ha(Static70.aFloat78 * ((float) Static140.aClass6_Sub48_Sub1_1.anInt9009 * 0.1F + 0.7F));
		Static25.aClass14_1.YA(Static88.anInt1753, Static55.aFloat15, Static123.aFloat63, (float) (Static383.anInt1377 << 2), (float) (Static534.anInt8851 << 2), (float) (Static448.anInt7748 << 2));
		Static25.aClass14_1.method6835(Static284.aClass26_4);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZ)I")
	public static int method6507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return local16 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)V")
	public static void method6508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static29.anInt856 = arg1 - Static217.anInt3835;
		Static562.anInt9257 = arg0 - Static217.anInt3841;
	}
}
