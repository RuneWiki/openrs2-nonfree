import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public static int anInt540;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!rg;")
	public static Class310 aClass310_9;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public static int anInt531 = -1;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "[I")
	public static final int[] anIntArray27 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_19 = new Class251(88, -1);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)I")
	public static int method571() {
		return Static161.aClass329_3.method8065();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(CB)Z")
	public static boolean method574(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static237.method3983(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static500.aCharArray8;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(25) char local25 = local18[local20];
				if (arg0 == local25) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static544.aCharArray9;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(49) char local49 = local42[local44];
				if (local49 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
