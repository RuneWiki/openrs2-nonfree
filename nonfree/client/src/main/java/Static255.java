import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "Lclient!iea;")
	public static Class31 aClass31_12;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
	public static void method4268() throws IOException {
		if (Static341.aClass22_4 == null || Static570.anInt9341 <= 0) {
			return;
		}
		Static345.aClass2_Sub17_11.anInt3378 = 0;
		while (true) {
			@Pc(11) Class2_Sub31 local11 = (Class2_Sub31) Static442.aClass114_39.method2772();
			if (local11 == null || Static345.aClass2_Sub17_11.aByteArray26.length - Static345.aClass2_Sub17_11.anInt3378 < local11.anInt5738) {
				Static341.aClass22_4.method7459(Static345.aClass2_Sub17_11.aByteArray26, Static345.aClass2_Sub17_11.anInt3378);
				Static139.anInt2961 += Static345.aClass2_Sub17_11.anInt3378;
				Static617.anInt10103 = 0;
				break;
			}
			Static345.aClass2_Sub17_11.method2873(0, local11.aClass2_Sub17_Sub1_2.aByteArray26, local11.anInt5738);
			Static570.anInt9341 -= local11.anInt5738;
			local11.method8920();
			local11.aClass2_Sub17_Sub1_2.method2851();
			local11.method4992();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Z")
	public static boolean method4269() {
		if (Static640.aBoolean751) {
			try {
				Static655.method4698("showVideoAd", Static107.anApplet1);
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return false;
	}
}
