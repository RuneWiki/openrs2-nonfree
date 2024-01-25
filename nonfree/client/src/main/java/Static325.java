import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "Lclient!oe;")
	public static Class186 aClass186_94;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	public static int anInt5317;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	public static void method4615(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub1_Sub12 local13 = Static449.method5975(arg0, 5);
		local13.method3048();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!tq;IB)I")
	public static int method4616(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1) {
		if (!Static54.method1017(arg0).method4840(arg1) && arg0.anObjectArray21 == null) {
			return -1;
		} else if (arg0.anIntArray558 == null || arg1 >= arg0.anIntArray558.length) {
			return -1;
		} else {
			return arg0.anIntArray558[arg1];
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(ZI)V")
	public static void method4617(@OriginalArg(1) int arg0) {
		if (Static242.anIntArray370 == null || arg0 > Static242.anIntArray370.length) {
			Static242.anIntArray370 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V")
	public static void method4619() {
		Static392.aClass220_52.method4998(5);
	}
}
