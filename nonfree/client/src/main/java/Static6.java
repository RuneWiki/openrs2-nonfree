import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
	public static int anInt95;

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "[I")
	public static final int[] anIntArray3 = new int[6];

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)Z")
	public static boolean method112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(II)V")
	public static void method115(@OriginalArg(0) int arg0) {
		Static115.method1766();
		@Pc(15) int local15 = Static299.aClass110_1.method2242(arg0).anInt3248;
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static301.aClass59_1.anIntArray110[arg0];
		if (local15 == 6) {
			Static487.anInt8276 = local26;
		}
		if (local15 == 5) {
			Static197.anInt10376 = local26;
		}
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)V")
	public static void method117() {
		Static170.aClass330_13.method7910();
		Static80.anInt1677 = 0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)V")
	public static void method118() {
		Static372.aClass87_150.method1801();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIZI)V")
	public static void method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static108.anInt2042 = arg0;
		Static578.anInt4590 = arg5;
		Static378.anInt6261 = arg2;
		Static559.anInt9426 = arg3;
		Static609.anInt10196 = arg1;
		if (arg4 && Static559.anInt9426 >= 100) {
			Static117.anInt2170 = Static378.anInt6261 * 512 + 256;
			Static19.anInt277 = Static578.anInt4590 * 512 + 256;
			Static441.anInt7550 = Static644.method9021(Static117.anInt2170, Static19.anInt277, Static636.anInt10567) - Static609.anInt10196;
		}
		Static396.anInt6606 = -1;
		Static304.anInt5319 = -1;
		Static254.anInt4612 = 2;
	}
}
