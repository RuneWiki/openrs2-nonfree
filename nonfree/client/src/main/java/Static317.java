import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	public static int anInt5609;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Z")
	public static boolean method4807() {
		try {
			return Static259.method3828();
		} catch (@Pc(15) IOException local15) {
			Static579.method8316();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(88) String local88 = "T2 - " + (Static493.aClass109_175 == null ? -1 : Static493.aClass109_175.method2012()) + "," + (Static247.aClass109_94 == null ? -1 : Static247.aClass109_94.method2012()) + "," + (Static113.aClass109_48 == null ? -1 : Static113.aClass109_48.method2012()) + " - " + Static327.anInt5853 + "," + (Static622.anInt10188 + Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0]) + "," + (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0] + Static668.anInt10683) + " - ";
			for (@Pc(90) int local90 = 0; local90 < Static327.anInt5853 && local90 < 50; local90++) {
				local88 = local88 + Static515.aClass5_Sub23_Sub2_1.aByteArray102[local90] + ",";
			}
			Static405.method5934(local88, local20);
			Static600.method8644(false);
			return true;
		}
	}
}
