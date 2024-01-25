import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!g;")
	public static Class83 aClass83_130;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
	public static int anInt6937 = 0;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	public static int anInt6944 = 0;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "[S")
	public static final short[] aShortArray116 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lclient!ab;")
	public static Class3 method5987(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static272.aClass3ArrayArray1[local12] == null || Static272.aClass3ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static300.method4909(local12);
			if (!local30) {
				return null;
			}
		}
		return Static272.aClass3ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!g;I)V")
	public static void method5989(@OriginalArg(0) Class83 arg0) {
		Static131.anInt2860 = 0;
		Static263.anInt5012 = 0;
		Static228.aClass199_4 = new Class199();
		Static222.aClass7_Sub1_Sub1_Sub1Array2 = new Class7_Sub1_Sub1_Sub1[1024];
		Static91.method1546(arg0);
		Static71.method1264(arg0);
	}
}
