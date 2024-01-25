import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
	public static int[] anIntArray521 = new int[1];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method4871() {
		@Pc(12) Class90[] local12 = Class3_Sub1_Sub25.aClass90Array1;
		synchronized (Class3_Sub1_Sub25.aClass90Array1) {
			for (@Pc(16) int local16 = 0; local16 < Class3_Sub1_Sub25.aClass90Array1.length; local16++) {
				Class3_Sub1_Sub25.aClass90Array1[local16] = new Class90();
				Static162.anIntArray373[local16] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V")
	public static void method4873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static278.method4791(Static8.aClass158_7);
		}
		if (arg2 == 1) {
			Static278.method4791(Static402.aClass158_119);
		}
		Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
		Static515.aClass3_Sub27_Sub1_2.method7587(arg1 + Static150.anInt3027);
		Static515.aClass3_Sub27_Sub1_2.method7606(Static223.anInt4827 + arg0);
		Static407.anInt7473 = arg0;
		Static392.aBoolean493 = false;
		Static303.anInt5982 = arg1;
		Static514.method7353();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method4874() {
		Static460.method3562();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static95.aClass306Array1[local8].method7366();
		}
		Static370.method5843();
		Static130.method2265();
		System.gc();
	}
}
