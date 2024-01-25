import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
	public static int anInt8009 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
	public static boolean method6955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
	public static int method6958(@OriginalArg(0) int arg0) {
		@Pc(18) byte local18;
		if (arg0 > 12000) {
			local18 = 4;
			Static140.method2560();
		} else if (arg0 > 5000) {
			Static46.method4896();
			local18 = 3;
		} else if (arg0 <= 2000) {
			local18 = 1;
			Static519.method7228();
		} else {
			local18 = 2;
			Static74.method7156();
		}
		if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() != 2) {
			Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 2);
			Static99.method1936(false, 2);
		}
		Static531.method7366();
		return local18;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!nh;")
	public static Class26 method6959(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class26 local8;
		try {
			local8 = (Class26) Class.forName("Class26_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class26_Sub1();
		}
		local8.anInt9255 = arg1;
		local8.aString95 = arg0;
		return local8;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = Static117.method5173(Static346.anInt5494, arg2, Static640.anInt10333);
		@Pc(25) int local25 = Static117.method5173(Static346.anInt5494, arg3, Static640.anInt10333);
		@Pc(31) int local31 = Static117.method5173(Static566.anInt9279, arg5, Static392.anInt6753);
		@Pc(37) int local37 = Static117.method5173(Static566.anInt9279, arg4, Static392.anInt6753);
		@Pc(46) int local46 = Static117.method5173(Static346.anInt5494, arg2 + arg6, Static640.anInt10333);
		@Pc(55) int local55 = Static117.method5173(Static346.anInt5494, arg3 - arg6, Static640.anInt10333);
		for (@Pc(57) int local57 = local19; local57 < local46; local57++) {
			Static188.method3208(local37, arg0, local31, Static349.anIntArrayArray71[local57]);
		}
		for (@Pc(73) int local73 = local25; local73 > local55; local73--) {
			Static188.method3208(local37, arg0, local31, Static349.anIntArrayArray71[local73]);
		}
		@Pc(95) int local95 = Static117.method5173(Static566.anInt9279, arg6 + arg5, Static392.anInt6753);
		@Pc(103) int local103 = Static117.method5173(Static566.anInt9279, arg4 - arg6, Static392.anInt6753);
		for (@Pc(105) int local105 = local46; local105 <= local55; local105++) {
			@Pc(111) int[] local111 = Static349.anIntArrayArray71[local105];
			Static188.method3208(local95, arg0, local31, local111);
			Static188.method3208(local103, arg1, local95, local111);
			Static188.method3208(local37, arg0, local103, local111);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
	public static int method6963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIII)V")
	public static void method6965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static509.anInt8223; local1++) {
			@Pc(6) Rectangle local6 = Class2_Sub18.aRectangleArray1[local1];
			if (local6.width + local6.x > arg2 && local6.x < arg2 + arg3 && arg0 < local6.y + local6.height && arg0 + arg1 > local6.y) {
				Static375.aBooleanArray13[local1] = true;
			}
		}
		Static103.method1953(arg0, arg2 + arg3, arg2, arg0 + arg1);
	}
}
