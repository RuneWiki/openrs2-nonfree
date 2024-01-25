import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_60 = new Class154(4);

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public static volatile int anInt3741 = 0;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[[S")
	public static final short[][] aShortArrayArray10 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString123 = "Walk here";

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "S")
	public static short aShort54 = 1;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
	public static int anInt3755 = 0;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "[I")
	public static final int[] anIntArray331 = new int[50];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!am;III)Lclient!pe;")
	public static Class153 method3173(@OriginalArg(0) Class11 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method288(0, arg1);
		return local14 == null ? null : new Class153(local14);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIII)V")
	public static void method3176(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static6.anInt1971 == 0) {
			method3178(false);
		} else {
			Static16.anInt353 = Static6.anInt1971;
			Static306.method5196(0);
		}
		Static294.aBoolean330 = arg1;
		Static270.anInt6617 = arg2;
		Static307.anInt3766 = arg3;
		Static42.method2047(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	public static void method3178(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static42.aClass4_Sub1_Sub11_2 != null) {
			Static165.anInt3370 = Static42.aClass4_Sub1_Sub11_2.anInt3052;
		} else {
			Static165.anInt3370 = -1;
		}
		Static38.anInt833 = 0;
		Static104.aClass130_159 = null;
		Static42.aClass4_Sub1_Sub11_2 = null;
		Static142.aClass72_13 = null;
		Static42.method2059();
		Static42.aClass130_46.method3514();
		Static42.aClass158_2 = null;
		Static292.aClass147_8 = null;
		Static135.aClass147_4 = null;
		Static352.anInt6599 = -1;
		Static170.aClass147_5 = null;
		Static127.aClass147_3 = null;
		Static120.aClass147_2 = null;
		Static157.anInt3513 = -1;
		Static282.aClass147_7 = null;
		Static84.aClass147_1 = null;
		Static270.aClass147_9 = null;
		Static314.aClass60_12 = null;
		Static244.method4231();
		Static179.aClass140_1 = null;
		Static167.method3168(128, 64);
		Static325.method5349(64, 64);
		Static316.method4685(64);
		Static330.method5404(64);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!am;I)V")
	public static void method3183(@OriginalArg(0) Class11 arg0) {
		Static80.aClass11_41 = arg0;
		Static160.anInt3615 = Static80.aClass11_41.method292(19);
	}
}
