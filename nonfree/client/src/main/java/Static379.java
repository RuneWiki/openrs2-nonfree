import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "J")
	public static long aLong168;

	@OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
	public static int anInt5914 = 0;

	@OriginalMember(owner = "client!nia", name = "h", descriptor = "[I")
	public static final int[] anIntArray435 = new int[13];

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(BI)V")
	public static void method5065() {
		@Pc(5) Class32 local5 = Static256.aClass32_44;
		synchronized (Static256.aClass32_44) {
			Static256.aClass32_44.method634(5);
		}
		local5 = Static136.aClass32_86;
		synchronized (Static136.aClass32_86) {
			Static136.aClass32_86.method634(5);
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V")
	public static void method5066() {
		for (@Pc(15) int local15 = 0; local15 < Static270.anInt4355; local15++) {
			@Pc(21) Class105 local21 = Static81.aClass105Array1[local15];
			if (local21.aByte34 == 3) {
				if (local21.aClass2_Sub13_Sub2_1 == null) {
					local21.anInt2688 = Integer.MIN_VALUE;
				} else {
					Static586.aClass2_Sub13_Sub4_2.method7226(local21.aClass2_Sub13_Sub2_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(BLclient!wu;)V")
	public static void method5068(@OriginalArg(1) Class380 arg0) {
		Static92.anInt1711 = 0;
		Static48.anInt1036 = 0;
		Static82.aClass171_1 = new Class171();
		Static429.aClass13_Sub3_Sub2_Sub1Array2 = new Class13_Sub3_Sub2_Sub1[1024];
		Static382.aClass13_Sub9Array1 = new Class13_Sub9[Static215.anIntArray237[Static504.anInt8146] + 1];
		Static7.anInt93 = 0;
		Static116.anInt2105 = 0;
		Static119.method1752(arg0);
		Static598.method8097(arg0);
	}
}
