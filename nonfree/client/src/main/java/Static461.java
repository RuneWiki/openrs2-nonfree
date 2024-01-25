import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "Lclient!uk;")
	public static Class329 aClass329_6;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
	public static int anInt8650;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public static void method7085() {
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static460.anInt8640; local11++) {
			for (@Pc(14) int local14 = 0; local14 < Static292.anInt7682; local14++) {
				if (Static204.method3391(Static580.aClass125ArrayArrayArray3, true, local11, local14, local9)) {
					local9++;
				}
				if (local9 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)Lclient!dga;")
	public static Class3_Sub4_Sub7 method7089() {
		return Static87.aClass3_Sub4_Sub7_2;
	}
}
