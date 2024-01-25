import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
	public static int anInt5649;

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
	public static int anInt5650 = 104;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_102 = new Class322(9, -2);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BLclient!lga;)V")
	public static void method5131(@OriginalArg(1) Class223 arg0) {
		Static172.aClass223_34 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
	public static void method5133() {
		Static67.method819((long) Static141.anInt8737, Static202.aClass75_5);
		if (Static635.anInt9910 != -1) {
			Static450.method6930(Static635.anInt9910);
		}
		for (@Pc(23) int local23 = 0; local23 < Static149.anInt3119; local23++) {
			if (Static72.aBooleanArray5[local23]) {
				Static411.aBooleanArray22[local23] = true;
			}
			Static400.aBooleanArray21[local23] = Static72.aBooleanArray5[local23];
			Static72.aBooleanArray5[local23] = false;
		}
		Static337.anInt5765 = Static141.anInt8737;
		if (Static635.anInt9910 != -1) {
			Static149.anInt3119 = 0;
			Static542.method7709();
		}
		Static202.aClass75_5.la();
		Static25.method326(Static202.aClass75_5);
		@Pc(76) int local76 = Static30.method350();
		if (local76 == -1) {
			local76 = Static475.anInt8093;
		}
		if (local76 == -1) {
			local76 = Static269.anInt5037;
		}
		Static608.method8373(local76);
		Static2.anInt3 = 0;
	}
}
