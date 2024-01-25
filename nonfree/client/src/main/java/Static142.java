import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!hq", name = "K", descriptor = "Lclient!b;")
	public static Class20 aClass20_40;

	@OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
	public static int anInt2700;

	@OriginalMember(owner = "client!hq", name = "Q", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_17 = new Class138();

	@OriginalMember(owner = "client!hq", name = "R", descriptor = "I")
	public static int anInt2705 = 0;

	@OriginalMember(owner = "client!hq", name = "U", descriptor = "I")
	public static final int anInt2708 = 1401;

	@OriginalMember(owner = "client!hq", name = "V", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
	public static void method2269() {
		if (Static25.aClass119_1 != null) {
			Static25.aClass119_1.method4982();
		}
		if (Static275.aClass119_2 != null) {
			Static275.aClass119_2.method4982();
		}
		Static233.method3862(Static164.aClass154_Sub1_1.aBoolean462);
		Static25.aClass119_1 = Static160.method4992(0, 22050, Static173.aCanvas2, Static61.aClass156_1);
		Static25.aClass119_1.method4991(Static352.aClass3_Sub8_Sub4_3);
		Static275.aClass119_2 = Static160.method4992(1, 2048, Static173.aCanvas2, Static61.aClass156_1);
		Static275.aClass119_2.method4991(Static137.aClass3_Sub8_Sub2_2);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)Z")
	public static boolean method2270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static364.method5430(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static187.anInt3390;
			@Pc(14) int local14 = arg2 << Static187.anInt3390;
			return Static79.method1320(local10 + 1, Static337.aClass7Array3[arg0].method5648(arg1, arg2) + arg3, local14 + 1) && Static79.method1320(local10 + Static258.anInt4653 - 1, Static337.aClass7Array3[arg0].method5648(arg1 + 1, arg2) + arg3, local14 + 1) && Static79.method1320(local10 + Static258.anInt4653 - 1, Static337.aClass7Array3[arg0].method5648(arg1 + 1, arg2 + 1) + arg3, local14 + Static258.anInt4653 - 1) && Static79.method1320(local10 + 1, Static337.aClass7Array3[arg0].method5648(arg1, arg2 + 1) + arg3, local14 + Static258.anInt4653 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIII)V")
	public static void method2271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class3_Sub7_Sub8 local11 = Static275.method4307(4, arg0);
		local11.method3219();
		local11.anInt3667 = arg1;
		local11.anInt3669 = arg2;
		local11.anInt3670 = arg3;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([SB)[S")
	public static short[] method2272(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static400.method1880(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
