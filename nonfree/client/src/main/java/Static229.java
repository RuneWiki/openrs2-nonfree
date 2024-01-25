import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "Lclient!gp;")
	public static Class91 aClass91_5;

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
	public static int anInt3736;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_90 = new Class211(33, 20);

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "Lclient!qj;")
	public static Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)Z")
	public static boolean method3013() {
		try {
			return Static418.method5299();
		} catch (@Pc(14) IOException local14) {
			Static297.method3933();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static175.aClass211_73 == null ? -1 : Static175.aClass211_73.method4520()) + "," + (Static248.aClass211_96 == null ? -1 : Static248.aClass211_96.method4520()) + "," + (Static246.aClass211_95 == null ? -1 : Static246.aClass211_95.method4520()) + " - " + Static209.anInt3493 + "," + (Static275.anInt4506 + Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0]) + "," + (Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0] + Static209.anInt3497) + " - ";
			for (@Pc(80) int local80 = 0; Static209.anInt3493 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static26.aClass2_Sub13_Sub2_1.aByteArray52[local80] + ",";
			}
			Static434.method5460(local19, local78);
			Static312.method4252(false);
			return true;
		}
	}
}
