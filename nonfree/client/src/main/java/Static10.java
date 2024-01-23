import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "T", descriptor = "Lclient!ai;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!aj", name = "W", descriptor = "[S")
	public static short[] aShortArray3;

	@OriginalMember(owner = "client!aj", name = "bb", descriptor = "Lclient!ai;")
	public static Class7 aClass7_3;

	@OriginalMember(owner = "client!aj", name = "db", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!aj", name = "fb", descriptor = "Lclient!uf;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!aj", name = "Y", descriptor = "Lclient!ff;")
	public static Class33 aClass33_1 = new Class33(8);

	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
	public static int anInt339 = 500;

	@OriginalMember(owner = "client!aj", name = "eb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_92 = Static200.method3116("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
	public static volatile int anInt342 = 0;

	@OriginalMember(owner = "client!aj", name = "hb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_93 = Static200.method3116("m");

	@OriginalMember(owner = "client!aj", name = "ib", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIBIIII)V")
	public static void method221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg2) {
			Static113.method1955(arg1, arg3, arg4, arg6, arg0, arg5);
		} else if (Static214.anInt4572 <= arg4 - arg3 && Static130.anInt2847 >= arg4 + arg3 && arg6 - arg2 >= Static141.anInt3163 && arg6 + arg2 <= Static200.anInt4273) {
			Static128.method2143(arg1, arg2, arg6, arg4, arg5, arg3, arg0);
		} else {
			Static28.method2165(arg6, arg0, arg1, arg4, arg5, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Z")
	public static boolean method223() {
		try {
			return Static197.method3069();
		} catch (@Pc(14) IOException local14) {
			Static126.method2128();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static172.anInt3718 + "," + Static52.anInt1420 + "," + Static7.anInt182 + " - " + Static27.anInt644 + "," + (Static84.aClass9_Sub4_Sub1_2.anIntArray510[0] + Static128.anInt2813) + "," + (Static163.anInt3587 + Static84.aClass9_Sub4_Sub1_2.anIntArray511[0]) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static27.anInt644 && local62 < 50; local62++) {
				local60 = local60 + Static16.aClass1_Sub9_Sub1_1.aByteArray20[local62] + ",";
			}
			Static131.method2194(local60, local19);
			Static189.method2975();
			return true;
		}
	}
}
