import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
	public static int anInt5425;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "Z")
	public static boolean aBoolean465 = true;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "[Lclient!bl;")
	public static final Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array3 = new Class1_Sub1_Sub3[14];

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method4815() {
		Static265.aClass140_135.method3813();
		Static158.aClass140_83.method3813();
		Static252.aClass140_130.method3813();
		Static270.aClass140_141.method3813();
		Static230.aClass140_119.method3813();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method4817() {
		Static176.aClass2_9.method3341(((float) Static210.anInt4175 * 0.1F + 0.7F) * 1.1523438F);
		Static176.aClass2_9.method3329(Static172.anInt5803, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static176.aClass2_9.method3302(Static226.anInt4463, -1);
		Static176.aClass2_9.method3271(Static99.aClass113_2);
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public static void method4818() {
		@Pc(5) Class140 local5 = Static259.aClass140_131;
		synchronized (Static259.aClass140_131) {
			Static259.aClass140_131.method3819();
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	public static void method4820() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static48.anInt1107; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static337.anInt6402; local13++) {
				if (Static177.method3480(local13, true, local7, local9, Static138.aClass204ArrayArrayArray1)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
