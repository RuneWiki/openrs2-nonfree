import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public static int anInt2984;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!ha;")
	public static Class28 aClass28_3;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!vd;")
	public static Class78 aClass78_6;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array12;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public static int anInt2981 = 0;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!mf;")
	public static Class48 aClass48_67 = new Class48(64);

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1198 = Static121.method2047("::");

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "[I")
	public static int[] anIntArray334 = new int[25];

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public static int anInt2987 = 0;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	public static int anInt2988 = 0;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1199 = Static121.method2047("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	public static int anInt2989 = 0;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1200 = Static121.method2047(" ");

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1201 = Static121.method2047("sl_arrows");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIILclient!q;)V")
	public static void method2111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class4_Sub17 arg6) {
		if (Static63.aBoolean62) {
			Static61.anInt1530 = 32;
		} else {
			Static61.anInt1530 = 0;
		}
		Static63.aBoolean62 = false;
		@Pc(134) int local134;
		if (Static116.anInt2785 != 0) {
			if (arg2 >= arg1 && arg1 + 16 > arg2 && arg0 >= arg4 && arg4 + 16 > arg0) {
				arg6.anInt2215 -= 4;
				Static130.method2133(arg6);
			} else if (arg2 >= arg1 && arg2 < arg1 + 16 && arg4 + arg5 - 16 <= arg0 && arg0 < arg4 + arg5) {
				arg6.anInt2215 += 4;
				Static130.method2133(arg6);
			} else if (arg1 - Static61.anInt1530 <= arg2 && arg1 + Static61.anInt1530 + 16 > arg2 && arg4 + 16 <= arg0 && arg0 < arg4 + arg5 - 16) {
				local134 = (arg5 - 32) * arg5 / arg3;
				if (local134 < 8) {
					local134 = 8;
				}
				@Pc(150) int local150 = arg0 - arg4 - local134 / 2 - 16;
				@Pc(156) int local156 = arg5 - local134 - 32;
				arg6.anInt2215 = local150 * (arg3 - arg5) / local156;
				Static130.method2133(arg6);
				Static63.aBoolean62 = true;
			}
		}
		if (Static108.anInt2548 == 0) {
			return;
		}
		local134 = arg6.anInt2184;
		if (arg1 - local134 <= arg2 && arg4 <= arg0 && arg2 < arg1 + 16 && arg0 <= arg5 + arg4) {
			arg6.anInt2215 += Static108.anInt2548 * 45;
			Static130.method2133(arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZII)I")
	public static int method2112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		return Static27.aClass4_Sub4_Sub15_1 != null && local10 == Static27.aClass4_Sub4_Sub15_1.aLong100 ? Static56.aClass4_Sub13_2.anInt1643 * 99 / (Static56.aClass4_Sub13_2.aByteArray68.length - Static27.aClass4_Sub4_Sub15_1.aByte7) + 1 : 0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method2115() {
		aClass48_67 = null;
		aClass4_Sub4_Sub3_Sub1Array12 = null;
		aClass60_1200 = null;
		aClass78_6 = null;
		aClass60_1198 = null;
		aClass28_3 = null;
		aClass60_1199 = null;
		aClass60_1201 = null;
		anIntArray334 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Z")
	public static boolean method2116(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method2118() {
		Static112.aClass70_17 = new Class70();
	}
}
