import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static690 {

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	public static int anInt10620 = -1;

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
	public static int anInt10624 = 0;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "[Lclient!te;")
	public static final Class350[] aClass350Array1 = new Class350[8];

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IB)V")
	public static void method9312(@OriginalArg(0) int arg0) {
		if (!Static121.method1814()) {
			return;
		}
		if (Static233.anInt3710 != arg0) {
			Static465.aString87 = "";
		}
		Static233.anInt3710 = arg0;
		Static487.aClass221_1.method5170();
		Static261.method9374(-52, 5);
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Z")
	public static boolean method9315(@OriginalArg(0) int arg0) {
		if (arg0 == 53 || arg0 == 16 || arg0 == 25 || arg0 == 19 || arg0 == 50 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 2;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!sj;I)V")
	public static void method9316(@OriginalArg(0) Class4_Sub2_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt2358 - Static528.anInt8386;
		@Pc(21) int local21 = arg0.anInt2363 * 512 + arg0.method2046() * 256;
		@Pc(33) int local33 = arg0.anInt2361 * 512 + arg0.method2046() * 256;
		arg0.anInt2369 = 0;
		arg0.anInt10229 += (local21 - arg0.anInt10229) / local9;
		arg0.anInt10228 += (local33 - arg0.anInt10228) / local9;
		if (arg0.anInt2356 == 0) {
			arg0.method2056(8192);
		}
		if (arg0.anInt2356 == 1) {
			arg0.method2056(12288);
		}
		if (arg0.anInt2356 == 2) {
			arg0.method2056(0);
		}
		if (arg0.anInt2356 == 3) {
			arg0.method2056(4096);
		}
	}
}
