import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bka", name = "e", descriptor = "Lclient!eaa;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "Lclient!mw;")
	public static final Class239 aClass239_1 = new Class239();

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)Z")
	public static boolean method623() {
		try {
			return Static502.method7161();
		} catch (@Pc(14) IOException local14) {
			Static243.method3796();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static42.aClass359_12 == null ? -1 : Static42.aClass359_12.method8394()) + "," + (Static433.aClass359_154 == null ? -1 : Static433.aClass359_154.method8394()) + "," + (Static542.aClass359_128 == null ? -1 : Static542.aClass359_128.method8394()) + " - " + Static630.anInt10261 + "," + (Static153.anInt3147 + Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0]) + "," + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] + Static201.anInt3839) + " - ";
			for (@Pc(80) int local80 = 0; Static630.anInt10261 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static474.aClass5_Sub41_Sub2_2.aByteArray93[local80] + ",";
			}
			Static234.method3615(local19, local78);
			Static628.method8487(false);
			return true;
		}
	}
}
