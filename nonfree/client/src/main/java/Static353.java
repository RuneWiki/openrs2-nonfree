import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_58 = new Class208(73, 11);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)V")
	public static void method5676(@OriginalArg(1) boolean arg0) {
		Static503.aClass154_8.method6563(Static117.aClass100_5.method8830());
		@Pc(14) int[] local14 = Static117.aClass100_5.Y();
		Static195.anInt3963 = local14[1];
		Static182.anInt3752 = local14[0];
		Static477.anInt8313 = local14[2];
		Static34.anInt5144 = local14[3];
		if (arg0) {
			Static117.aClass100_5.DA(Static124.anInt2422, Static393.anInt7361, Static153.anInt2793, Static29.anInt623);
			Static622.method8664(Static159.aDouble5);
		} else {
			Static117.aClass100_5.DA(Static272.anInt6592, Static233.anInt4694, Static422.anInt7721, Static19.anInt320);
			Static622.method8664(Static137.aDouble3);
		}
	}
}
