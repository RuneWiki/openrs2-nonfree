import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
	public static int anInt7505;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
	public static void method6481() {
		Static355.method9498();
		Static144.method2456(Static580.aClass3_Sub22_24.aClass21_Sub3_1.method1940() == 1);
		Static467.aClass107_3 = Static358.method4995(Static508.aCanvas8, 22050, 0, Static122.aClass47_1);
		Static666.method8675(Static551.method7224((Class3_Sub33_Sub3) null));
		Static93.aClass107_1 = Static358.method4995(Static508.aCanvas8, 2048, 1, Static122.aClass47_1);
		Static93.aClass107_1.method5377(Static391.aClass3_Sub33_Sub4_1);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIII)V")
	public static void method6482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13 = Static520.anInt8156;
		if (local13 == 0) {
			return;
		}
		if (local13 == 1) {
			Static520.anInt8156 = 2;
			Static205.anInt3396 = arg3;
			Static338.anInt5414 = arg1;
			Static135.anInt10696 = arg2;
			Static220.anInt3601 = arg0;
		} else if (local13 == 2) {
			if (arg2 < Static135.anInt10696) {
				Static135.anInt10696 = arg2;
			}
			if (arg1 > Static338.anInt5414) {
				Static338.anInt5414 = arg1;
			}
			if (Static220.anInt3601 < arg0) {
				Static220.anInt3601 = arg0;
			}
			if (Static205.anInt3396 > arg3) {
				Static205.anInt3396 = arg3;
			}
		}
	}
}
