import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Z")
	public static boolean aBoolean91;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_47 = new Class214(0, 5);

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "[I")
	public static final int[] anIntArray84 = new int[4];

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	public static int anInt1340 = 0;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	public static void method1231() {
		if (!Static232.aBoolean300) {
			return;
		}
		while (true) {
			while (Static261.anInt4996 < Static155.aClass82_Sub1Array3.length) {
				@Pc(26) Class82_Sub1 local26 = Static155.aClass82_Sub1Array3[Static261.anInt4996];
				if (local26 != null && local26.anInt7703 == -1) {
					if (Static221.aClass4_Sub23_2 == null) {
						Static221.aClass4_Sub23_2 = Static372.aClass197_1.method4735(local26.aString79);
					}
					@Pc(50) int local50 = Static221.aClass4_Sub23_2.anInt4495;
					if (local50 == -1) {
						return;
					}
					Static221.aClass4_Sub23_2 = null;
					local26.anInt7703 = local50;
					Static261.anInt4996++;
				} else {
					Static261.anInt4996++;
				}
			}
			return;
		}
	}
}
