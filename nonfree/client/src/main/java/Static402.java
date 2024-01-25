import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!qv", name = "T", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!qv", name = "W", descriptor = "Lclient!wa;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!qv", name = "R", descriptor = "Lclient!gu;")
	public static final Class113 aClass113_9 = new Class113();

	@OriginalMember(owner = "client!qv", name = "S", descriptor = "Lclient!im;")
	public static final Class140 aClass140_113 = new Class140(41, 3);

	@OriginalMember(owner = "client!qv", name = "V", descriptor = "I")
	public static int anInt7240 = -1;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)V")
	public static void method6057() {
		Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
		Static320.aClass140_86 = null;
		Static193.aClass140_112 = null;
		Static544.aClass140_152 = null;
		Static91.aClass140_30 = null;
		Static36.anInt791 = 0;
		Static405.anInt9105 = 0;
		Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
		Static531.anInt8934 = 0;
		Static14.method427();
		Static84.method1454();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static349.aClass49_Sub2_Sub2_Sub1Array1[local31] = null;
		}
		Static63.aClass49_Sub2_Sub2_Sub1_1 = null;
		for (@Pc(47) int local47 = 0; local47 < Static350.anInt6254; local47++) {
			@Pc(54) Class49_Sub2_Sub2_Sub2 local54 = Static177.aClass1_Sub17Array3[local47].aClass49_Sub2_Sub2_Sub2_2;
			if (local54 != null) {
				local54.anInt4323 = -1;
			}
		}
		Static288.method4640();
		Static448.anInt7701 = 1;
		Static85.method1463(9);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static3.aBooleanArray1[local74] = true;
		}
		Static176.method2654();
		Static211.aLong173 = 0L;
		Static38.aClass1_Sub44_1 = null;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method6059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static358.anInt8908 <= arg2 && arg2 <= Static216.anInt4203 && arg7 >= Static358.anInt8908 && arg7 <= Static216.anInt4203 && arg8 >= Static358.anInt8908 && Static216.anInt4203 >= arg8 && Static358.anInt8908 <= arg3 && Static216.anInt4203 >= arg3 && arg4 >= Static99.anInt1988 && arg4 <= Static205.anInt4042 && arg0 >= Static99.anInt1988 && arg0 <= Static205.anInt4042 && Static99.anInt1988 <= arg1 && arg1 <= Static205.anInt4042 && arg6 >= Static99.anInt1988 && Static205.anInt4042 >= arg6) {
			Static6.method247(arg6, arg5, arg1, arg4, arg2, arg7, arg8, arg0, arg3);
		} else {
			Static233.method4044(arg4, arg6, arg8, arg0, arg1, arg7, arg5, arg3, arg2);
		}
	}
}
