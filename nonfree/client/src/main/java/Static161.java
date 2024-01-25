import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ke", name = "Yc", descriptor = "I")
	public static int anInt3315;

	@OriginalMember(owner = "client!ke", name = "md", descriptor = "B")
	public static byte aByte29;

	@OriginalMember(owner = "client!ke", name = "Fc", descriptor = "Z")
	public static boolean aBoolean284 = false;

	@OriginalMember(owner = "client!ke", name = "dd", descriptor = "[I")
	public static final int[] anIntArray371 = new int[32];

	@OriginalMember(owner = "client!ke", name = "id", descriptor = "I")
	public static int anInt3324 = 0;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIII)V")
	public static void method3066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub1_Sub2 local12 = Static42.method1000(9, arg1);
		local12.method168();
		local12.anInt75 = arg2;
		local12.anInt85 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V")
	public static void method3069() {
		Static306.aClass140_154.method3819();
	}
}
