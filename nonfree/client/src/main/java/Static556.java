import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!tu", name = "C", descriptor = "I")
	public static int anInt9172;

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_89 = new Class269(48, 2);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZLclient!eq;IZ)V")
	public static void method7705(@OriginalArg(1) int arg0, @OriginalArg(3) Class97 arg1, @OriginalArg(4) int arg2) {
		Static609.method8334(0L, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 >= Static306.anInt5020 && arg1 <= Static252.anInt4988 && arg0 >= Static306.anInt5020 && arg0 <= Static252.anInt4988 && Static306.anInt5020 <= arg7 && arg7 <= Static252.anInt4988 && arg8 >= Static306.anInt5020 && Static252.anInt4988 >= arg8 && Static570.anInt9385 <= arg6 && arg6 <= Static177.anInt3963 && Static570.anInt9385 <= arg5 && Static177.anInt3963 >= arg5 && Static570.anInt9385 <= arg2 && Static177.anInt3963 >= arg2 && Static570.anInt9385 <= arg3 && arg3 <= Static177.anInt3963) {
			Static256.method4214(arg0, arg1, arg8, arg4, arg3, arg5, arg6, arg7, arg2);
		} else {
			Static552.method7660(arg6, arg2, arg3, arg1, arg7, arg0, arg4, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)I")
	public static int method7707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static644.anIntArray756[arg1 & 0x3] : Static8.anIntArray21[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBI)Z")
	public static boolean method7709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIBI)V")
	public static void method7710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg1 >= Static306.anInt5020 && Static252.anInt4988 >= arg3 + arg1 && arg0 - arg1 >= Static570.anInt9385 && Static177.anInt3963 >= arg0 + arg1) {
			Static500.method7113(arg1, arg3, arg2, arg0);
		} else {
			Static436.method6503(arg2, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	public static void method7712() {
		Static617.method8393((long) Static325.anInt5888, Static600.aClass87_15);
		if (Static387.anInt6978 != -1) {
			Static233.method3886(Static387.anInt6978);
		}
		for (@Pc(17) int local17 = 0; local17 < Static320.anInt5804; local17++) {
			if (Static618.aBooleanArray50[local17]) {
				Static473.aBooleanArray43[local17] = true;
			}
			Static286.aBooleanArray42[local17] = Static618.aBooleanArray50[local17];
			Static618.aBooleanArray50[local17] = false;
		}
		Static507.anInt8545 = Static325.anInt5888;
		if (Static387.anInt6978 != -1) {
			Static320.anInt5804 = 0;
			Static266.method4303();
		}
		Static600.aClass87_15.la();
		Static285.method4492(Static600.aClass87_15);
		@Pc(66) int local66 = Static87.method1561();
		if (local66 == -1) {
			local66 = Static385.anInt6934;
		}
		if (local66 == -1) {
			local66 = Static595.anInt9812;
		}
		Static547.method7772(local66);
		Static362.anInt6541 = 0;
	}
}
