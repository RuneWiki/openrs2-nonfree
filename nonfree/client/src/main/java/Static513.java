import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static513 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!kda;")
	public static Class160 aClass160_99;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "[I")
	public static final int[] anIntArray741 = new int[6];

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	public static void method7336() {
		Static496.aClient1.method1731();
		Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
		Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
		Static487.aClass6_129 = null;
		Static136.aClass6_48 = null;
		Static388.aClass6_117 = null;
		Static304.aClass6_92 = null;
		Static228.anInt8958 = 0;
		Static215.anInt4441 = 0;
		Static163.method3249();
		Static308.anInt5922 = 0;
		Static360.anInt9307 = 0;
		Static83.aClass169Array1 = null;
		Static190.aString25 = null;
		Static108.anInt2509 = 0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)I")
	public static int method7338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static11.anIntArray19[arg1 & 0x3] : 256;
	}
}
