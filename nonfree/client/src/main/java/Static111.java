import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_26 = new Class179(18, -1);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	public static int method1985(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public static void method1989() {
		Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
		Static269.aClass107_139 = null;
		Static152.aClass107_95 = null;
		Static358.aClass107_182 = null;
		Static167.anInt3076 = 0;
		Static425.anInt6874 = 0;
		Static126.anInt2566 = 0;
		Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
		Static255.aClass107_135 = null;
		Static422.method5612();
		Static455.method6000();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			Static458.aClass31_Sub2_Sub1_Sub1Array1[local35] = null;
		}
		Static452.aClass31_Sub2_Sub1_Sub1_2 = null;
		for (@Pc(51) int local51 = 0; local51 < Static98.aClass31_Sub2_Sub1_Sub2Array1.length; local51++) {
			@Pc(57) Class31_Sub2_Sub1_Sub2 local57 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local51];
			if (local57 != null) {
				local57.anInt7372 = -1;
			}
		}
		Static297.method4287();
		Static345.anInt5797 = 1;
		Static193.method2987(9);
		for (@Pc(76) int local76 = 0; local76 < 100; local76++) {
			Static71.aBooleanArray25[local76] = true;
		}
		Static122.method2213();
		Static115.aLong80 = 0L;
		Static171.aClass1_Sub39_1 = null;
	}
}
