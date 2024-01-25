import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!be;")
	public static Class1_Sub6_Sub1 aClass1_Sub6_Sub1_2;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	public static int anInt2354 = 0;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	public static int anInt2356 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIIIFIIII)[[I")
	public static int[][] method2168(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub2_Sub39 local13 = new Class1_Sub2_Sub39();
		local13.aBoolean584 = false;
		local13.anInt6490 = 4;
		local13.anInt6492 = (int) (arg0 * 4096.0F);
		local13.anInt6493 = 8;
		local13.anInt6489 = 3;
		local13.method5661();
		Static78.method1541(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method5666(local9[local45], local45);
		}
		return local9;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!rg;III)V")
	public static void method2169(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class97 local13 = arg0.method4686(Static34.aClass2_6);
		if (local13 == null) {
			return;
		}
		Static34.aClass2_6.method3250(arg2, arg1, arg0.anInt5179 + arg2, arg0.anInt5209 + arg1);
		if (Static298.anInt5959 < 3) {
			Static45.aClass90_5.method5470((float) arg2 + (float) arg0.anInt5179 / 2.0F, (float) arg1 + (float) arg0.anInt5209 / 2.0F, ((int) -Static304.aFloat110 & 0x3FFF) << 2, local13, arg2, arg1);
		} else {
			Static34.aClass2_6.method3334(local13, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method2171() {
		for (@Pc(10) Class15_Sub7 local10 = (Class15_Sub7) Static233.aClass175_5.method4676(); local10 != null; local10 = (Class15_Sub7) Static233.aClass175_5.method4676()) {
			Static54.method3233(local10);
		}
		Static47.method1078();
		Static47.method1083();
		Static47.method1076();
		Static47.method1084();
		Static47.method1091();
		Static47.method1094();
	}
}
