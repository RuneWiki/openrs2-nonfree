import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IB)Lclient!wh;")
	public static Class368 method8162(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static455.aClass368Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	public static void method8163() {
		Static252.anInt4998 = 0;
		@Pc(16) int local16 = (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 >> 9) + Static451.anInt7933;
		@Pc(24) int local24 = (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 >> 9) + Static470.anInt8063;
		if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static252.anInt4998 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static252.anInt4998 = 1;
		}
		if (Static252.anInt4998 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static252.anInt4998 = 0;
		}
	}
}
