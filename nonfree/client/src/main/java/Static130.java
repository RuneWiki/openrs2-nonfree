import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
	public static int anInt2660;

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
	public static int anInt2662;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IBI)I")
	public static int method2439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte local18;
		if (arg1 > 20000) {
			Static129.method2438();
			local18 = 4;
		} else if (arg1 > 10000) {
			local18 = 3;
			Static111.method2092();
		} else if (arg1 > 5000) {
			local18 = 2;
			Static575.method8118();
		} else {
			Static62.method1305();
			local18 = 1;
		}
		if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != arg0) {
			Static24.aClass3_Sub22_4.method2840(arg0, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
			Static382.method5480(false, arg0);
		}
		Static441.method6272();
		return local18;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "()V")
	public static void method2441() {
		Static246.method4104(Static183.anInt3720);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)Lclient!rda;")
	public static Class299 method2442(@OriginalArg(1) int arg0) {
		@Pc(13) Class299[] local13 = Static500.method7780();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class299 local21 = local13[local15];
			if (arg0 == local21.anInt8259) {
				return local21;
			}
		}
		return null;
	}
}
