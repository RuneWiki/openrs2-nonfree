import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "[F")
	public static final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public static void method3234() {
		Static220.aClass69_50.method1593();
		Static123.aClass69_69.method1593();
		Static454.aClass69_72.method1593();
		Static242.aClass69_48.method1593();
		Static273.aClass69_44.method1593();
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
	public static void method3237() {
		@Pc(7) int local7 = Static58.anInt4352;
		@Pc(9) int[] local9 = Static144.anIntArray186;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class6_Sub2_Sub1_Sub1 local19 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static242.method4043(local19.method4763(), local19);
			}
		}
	}
}
