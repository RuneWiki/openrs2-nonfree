import java.util.Random;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	public static int anInt1144;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
	public static int anInt1146;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "Lclient!ak;")
	public static Class7 aClass7_48;

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
	public static int anInt1154;

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
	public static int anInt1155;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString32 = null;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Lclient!bf;")
	public static Class1_Sub2_Sub2 method923() {
		@Pc(13) int local13 = Static113.anIntArray273[0] * Static49.anIntArray135[0];
		@Pc(16) int[] local16 = new int[local13];
		@Pc(20) byte[] local20 = Static299.aByteArrayArray15[0];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local16[local22] = Static158.anIntArray366[local20[local22] & 0xFF];
		}
		@Pc(59) Class1_Sub2_Sub2 local59;
		if (Static240.aBoolean369) {
			local59 = new Class1_Sub2_Sub2_Sub2(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[0], Static134.anIntArray306[0], Static49.anIntArray135[0], Static113.anIntArray273[0], local16);
		} else {
			local59 = new Class1_Sub2_Sub2_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[0], Static134.anIntArray306[0], Static49.anIntArray135[0], Static113.anIntArray273[0], local16);
		}
		Static247.method3867();
		return local59;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
	public static void method925() {
		Static227.aClass127Array2 = null;
		Static57.method934(0, Static166.anInt3046, 0, -1, Static121.anInt2350, 0, Static145.anInt2690, 0);
		if (Static227.aClass127Array2 != null) {
			Static24.method426(Static170.anInt3121, Static270.aClass127_15.anInt3588, Static131.anInt2511, Static145.anInt2690, Static166.anInt3046, 0, -1412584499, 0, Static227.aClass127Array2);
			Static227.aClass127Array2 = null;
		}
	}
}
