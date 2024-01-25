import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public static int anInt6936;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	public static void method5897() {
		if (Static202.anInt3644 < 0) {
			Static202.anInt3644 = 0;
			Static467.anInt8412 = -1;
			Static294.anInt5413 = -1;
		}
		if (Static201.anInt201 < Static202.anInt3644) {
			Static294.anInt5413 = -1;
			Static467.anInt8412 = -1;
			Static202.anInt3644 = Static201.anInt201;
		}
		if (Static140.anInt2619 < 0) {
			Static140.anInt2619 = 0;
			Static467.anInt8412 = -1;
			Static294.anInt5413 = -1;
		}
		if (Static140.anInt2619 > Static201.anInt202) {
			Static140.anInt2619 = Static201.anInt202;
			Static467.anInt8412 = -1;
			Static294.anInt5413 = -1;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V")
	public static void method5898(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 4);
		local8.method6974();
	}
}
