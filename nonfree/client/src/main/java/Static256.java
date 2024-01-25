import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Lclient!jp;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "[Lclient!wo;")
	public static Class12_Sub2_Sub1[] aClass12_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
	public static int anInt4267 = 0;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public static void method3645() {
		for (@Pc(11) int local11 = 0; local11 < Static365.anInt6148; local11++) {
			@Pc(17) int local17 = Static461.anIntArray562[local11];
			@Pc(24) Class2_Sub5 local24 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local17);
			if (local24 != null) {
				@Pc(29) Class12_Sub2_Sub1_Sub4_Sub2 local29 = local24.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				Static364.method5140(local29.aClass295_1.anInt7362, local29);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)Lclient!cq;")
	public static Class63 method3647(@OriginalArg(0) int arg0) {
		@Pc(8) Class63[] local8 = Static77.method1221();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt1356) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
	public static void method3648() {
		if (Static541.aClass162_11 != null) {
			Static541.aClass162_11.method6821();
			Static541.aClass162_11 = null;
			Static271.aClass37_10 = null;
		}
	}
}
