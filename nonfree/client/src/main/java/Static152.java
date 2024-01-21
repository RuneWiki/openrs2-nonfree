import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!q", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Lclient!ei;")
	public static Class2_Sub2_Sub7 aClass2_Sub2_Sub7_1;

	@OriginalMember(owner = "client!q", name = "y", descriptor = "Lclient!b;")
	public static Class8 aClass8_4;

	@OriginalMember(owner = "client!q", name = "C", descriptor = "I")
	public static int anInt3096;

	@OriginalMember(owner = "client!q", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_920 = Static181.method2795("Free world");

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!qe;")
	public static Class83 aClass83_919 = aClass83_920;

	@OriginalMember(owner = "client!q", name = "r", descriptor = "I")
	public static int anInt3093 = 0;

	@OriginalMember(owner = "client!q", name = "t", descriptor = "Lclient!nc;")
	public static final Class63 aClass63_13 = new Class63(4096);

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_921 = Static181.method2795("overlay2)3dat");

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_13 = new Class19();

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_922 = Static181.method2795("Die Verbindung konnte");

	@OriginalMember(owner = "client!q", name = "A", descriptor = "I")
	public static int anInt3095 = -1;

	@OriginalMember(owner = "client!q", name = "B", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_923 = Static181.method2795("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!q", name = "D", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_924 = Static181.method2795("Schlie-8en");

	@OriginalMember(owner = "client!q", name = "E", descriptor = "[I")
	public static final int[] anIntArray302 = new int[128];

	@OriginalMember(owner = "client!q", name = "G", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array52 = new Class83[1000];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!ae;IIIIII)V")
	public static void method2356(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static130.aBoolean138) {
			Static100.anInt2290 = 32;
		} else {
			Static100.anInt2290 = 0;
		}
		Static130.aBoolean138 = false;
		@Pc(140) int local140;
		if (Static36.anInt939 != 0) {
			if (arg6 >= arg3 && arg6 < arg3 + 16 && arg5 <= arg2 && arg2 < arg5 + 16) {
				arg1.anInt125 -= 4;
				Static121.method2085(arg1);
			} else if (arg6 >= arg3 && arg3 + 16 > arg6 && arg5 + arg0 - 16 <= arg2 && arg0 + arg5 > arg2) {
				arg1.anInt125 += 4;
				Static121.method2085(arg1);
			} else if (arg3 - Static100.anInt2290 <= arg6 && arg6 < Static100.anInt2290 + arg3 + 16 && arg5 + 16 <= arg2 && arg5 + arg0 - 16 > arg2) {
				local140 = arg0 * (arg0 - 32) / arg4;
				if (local140 < 8) {
					local140 = 8;
				}
				@Pc(159) int local159 = arg2 - arg5 - local140 / 2 - 16;
				@Pc(166) int local166 = arg0 - local140 - 32;
				arg1.anInt125 = (arg4 - arg0) * local159 / local166;
				Static121.method2085(arg1);
				Static130.aBoolean138 = true;
			}
		}
		if (Static27.anInt1416 == 0) {
			return;
		}
		local140 = arg1.anInt157;
		if (arg3 - local140 <= arg6 && arg5 <= arg2 && arg3 + 16 > arg6 && arg2 <= arg0 + arg5) {
			arg1.anInt125 += Static27.anInt1416 * 45;
			Static121.method2085(arg1);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!ra;)V")
	public static void method2357(@OriginalArg(1) Class2_Sub3 arg0) {
		if (Static149.aClass67_6 != null) {
			try {
				Static149.aClass67_6.method2215(0L);
				Static149.aClass67_6.method2212(arg0.aByteArray2, arg0.anInt340, 24);
			} catch (@Pc(15) Exception local15) {
			}
		}
		arg0.anInt340 += 24;
	}
}
