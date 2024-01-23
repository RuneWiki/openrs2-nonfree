import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!id", name = "s", descriptor = "[[Lclient!ga;")
	public static Class59[][] aClass59ArrayArray1;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!kb;")
	public static Class83 aClass83_72;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	public static int anInt2415 = 0;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "I")
	public static int anInt2417 = 0;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method1803() {
		Static5.aClass155_1.method4354();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!kb;)V")
	public static void method1804(@OriginalArg(1) Class83 arg0) {
		Static15.anInt399 = arg0.method2322("runes");
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIZIILclient!kb;)V")
	public static void method1806(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class83 arg2) {
		Static293.aClass83_203 = arg2;
		Static66.anInt3701 = arg1;
		Static282.aBoolean321 = false;
		Static115.anInt2536 = 1;
		Static57.anInt1509 = arg0;
		Static50.anInt1382 = 2;
		Static167.anInt3813 = 0;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
	public static void method1807() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static233.aBooleanArray22[local7] = false;
		}
		Static280.anInt5999 = 1;
		Static217.anInt4819 = -1;
		Static193.anInt4302 = -1;
		Static289.anInt6096 = 0;
		Static254.anInt5407 = 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Lclient!kd;)V")
	public static void method1808(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20[] arg1) {
		Static23.aClass1_Sub20ArrayArray2[arg0] = arg1;
	}
}
