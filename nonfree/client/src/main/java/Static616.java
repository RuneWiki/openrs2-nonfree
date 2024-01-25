import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt10777 = 0;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_246 = new Class215(29, 7);

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt10782 = -1;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)I")
	public static int method8983() {
		@Pc(5) Class169 local5 = Static20.aClass169_4;
		synchronized (Static20.aClass169_4) {
			return Static20.aClass169_4.method4994();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Z")
	public static boolean method8985() {
		try {
			return Static423.method6818();
		} catch (@Pc(17) IOException local17) {
			Static584.method4583();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(81) String local81 = "T2 - " + (Static138.aClass215_57 == null ? -1 : Static138.aClass215_57.method6064()) + "," + (Static527.aClass215_250 == null ? -1 : Static527.aClass215_250.method6064()) + "," + (Static106.aClass215_42 == null ? -1 : Static106.aClass215_42.method6064()) + " - " + Static541.anInt9723 + "," + (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] + Static84.anInt2565) + "," + (Static32.anInt723 + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0]) + " - ";
			for (@Pc(83) int local83 = 0; Static541.anInt9723 > local83 && local83 < 50; local83++) {
				local81 = local81 + Static627.aClass2_Sub11_Sub2_6.aByteArray128[local83] + ",";
			}
			Static408.method6625(local81, local22);
			Static68.method2104(false);
			return true;
		}
	}
}
