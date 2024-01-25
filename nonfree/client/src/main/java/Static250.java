import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static250 {

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Lclient!an;")
	public static Class16 aClass16_67;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_73 = new Class45(10, 3);

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
	public static int anInt5147 = 0;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
	public static final int[] anIntArray370 = new int[50];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!j;)Z")
	public static boolean method4316(@OriginalArg(1) Class152 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean380) {
			return false;
		} else if (!arg0.method4026(Static2.anInterface9_2)) {
			return false;
		} else if (Static367.aClass68_53.method1917((long) arg0.anInt4753) == null) {
			return Static322.aClass68_81.method1917((long) arg0.anInt4724) == null;
		} else {
			return false;
		}
	}
}
