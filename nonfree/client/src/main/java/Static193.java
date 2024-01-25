import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
	public static int anInt3729;

	@OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
	public static int anInt3730;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
	public static int anInt3732;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!ha;ILjava/lang/String;IBII)V")
	public static void method3201(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static169.aClass50_10 == null || Static631.aClass50_36 == null) {
			if (Static257.aClass390_60.method8905(Static366.anInt6654) && Static257.aClass390_60.method8905(Static397.anInt7052)) {
				Static169.aClass50_10 = arg1.method6898(Static689.method8541(Static257.aClass390_60, Static366.anInt6654, 0), true);
				@Pc(35) Class369 local35 = Static689.method8541(Static257.aClass390_60, Static397.anInt7052, 0);
				Static631.aClass50_36 = arg1.method6898(local35, true);
				local35.method8543();
				Static100.aClass50_4 = arg1.method6898(local35, true);
			} else {
				arg1.aa(arg2, arg4, arg0, 20, Static372.anInt6703 | 255 - Static613.anInt10007 << 24, 1);
			}
		}
		if (Static169.aClass50_10 != null && Static631.aClass50_36 != null) {
			@Pc(81) int local81 = (arg0 - Static631.aClass50_36.method6002() * 2) / Static169.aClass50_10.method6002();
			for (@Pc(83) int local83 = 0; local83 < local81; local83++) {
				Static169.aClass50_10.method5996(arg2 + Static631.aClass50_36.method6002() + local83 * Static169.aClass50_10.method6002(), arg4);
			}
			Static631.aClass50_36.method5996(arg2, arg4);
			Static100.aClass50_4.method5996(arg0 + arg2 - Static100.aClass50_4.method6002(), arg4);
		}
		Static231.aClass73_8.method5773(arg4 + 14, Static311.anInt5917 | 0xFF000000, arg3, arg2 + 3, -1);
		arg1.aa(arg2, arg4 + 20, arg0, arg5 - 20, Static372.anInt6703 | -Static613.anInt10007 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIILclient!ha;BIII)V")
	public static void method3202(@OriginalArg(1) int arg0, @OriginalArg(3) Class65 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static374.aClass65_12 = arg1;
		Static504.aClass254_7 = Static374.aClass65_12.method6955();
		Static65.aClass254_1 = Static374.aClass65_12.method6955();
		Static572.aClass254_9 = Static374.aClass65_12.method6955();
		Static381.anInt10845 = 2;
		Static109.anInt2331 = 0;
		Static494.anInt8274 = 0;
		Static597.anInt9791 = arg3;
		Static382.anInt6778 = arg0;
		Static305.anInt5823 = 2;
		Static528.anInterface15_1 = null;
		Static1.anInt9943 = 1;
		Static273.method4247(arg2, arg4);
	}
}
