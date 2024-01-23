import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	public static int anInt4266;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
	public static int anInt4270;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!nm;")
	public static Class119 aClass119_76;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString148 = "purple:";

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public static int anInt4273 = 0;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
	public static int anInt4279 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V")
	public static void method3655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static224.anInt4207 = arg2;
		Static175.anInt3414 = arg0;
		Static284.anInt5165 = arg4;
		Static253.anInt4655 = arg3;
		Static37.anInt689 = arg1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method3657() {
		Static83.aClass175_10.method4294();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILclient!si;BLclient!oh;)V")
	public static void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class157 arg4, @OriginalArg(6) Class57 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(15) int local15 = (int) Static148.aFloat64 + Static69.anInt1492 & 0x7FF;
		@Pc(23) int local23 = arg0 * arg0 + arg1 * arg1;
		@Pc(35) int local35 = Math.max(arg4.anInt4680 / 2, arg4.anInt4689 / 2) + 10;
		if (local23 > local35 * local35) {
			return;
		}
		@Pc(53) int local53 = Class87.anIntArray173[local15];
		@Pc(61) int local61 = local53 * 256 / (Static289.anInt5250 + 256);
		@Pc(65) int local65 = Class87.anIntArray177[local15];
		@Pc(73) int local73 = local65 * 256 / (Static289.anInt5250 + 256);
		@Pc(83) int local83 = local73 * arg0 - arg1 * local61 >> 16;
		@Pc(93) int local93 = arg0 * local61 + arg1 * local73 >> 16;
		if (Static71.aBoolean165) {
			((Class57_Sub2) arg5).method3333(local93 + arg4.anInt4680 / 2 + arg3 - arg5.anInt3770 / 2, -local83 + arg4.anInt4689 / 2 + arg2 - arg5.anInt3763 / 2, (Class1_Sub5_Sub6_Sub2) arg4.method3973(false));
		} else {
			((Class57_Sub1) arg5).method1661(arg4.anInt4680 / 2 + arg3 + local93 - arg5.anInt3770 / 2, -local83 + arg4.anInt4689 / 2 + arg2 + -(arg5.anInt3763 / 2), arg4.anIntArray533, arg4.anIntArray539);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public static void method3660() {
		Static241.anInt4470 = 0;
		Static87.anInt1876 = 0;
		Static130.anInt2575 = -1;
		Static126.anInt1523 = -1;
		Static5.anInt204 = 0;
		Static129.anInt2551 = -1;
		Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
		Static91.aBoolean183 = false;
		Static263.anInt4869 = 0;
		Static10.aClass1_Sub13_Sub1_117.anInt2018 = 0;
		Static164.anInt3278 = -1;
		Static235.method3789();
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static14.aClass11_Sub4_Sub1Array1.length; local33++) {
			if (Static14.aClass11_Sub4_Sub1Array1[local33] != null) {
				Static14.aClass11_Sub4_Sub1Array1[local33].anInt3784 = -1;
			}
		}
		for (local33 = 0; local33 < Static138.aClass11_Sub4_Sub2Array2.length; local33++) {
			if (Static138.aClass11_Sub4_Sub2Array2[local33] != null) {
				Static138.aClass11_Sub4_Sub2Array2[local33].anInt3784 = -1;
			}
		}
		Static264.method4069();
		anInt4270 = 1;
		Static197.method3406(30);
		for (local33 = 0; local33 < 100; local33++) {
			Static166.aBooleanArray11[local33] = true;
		}
		Static92.method1759();
	}
}
