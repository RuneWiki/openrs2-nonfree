import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_94 = new Class186(50, 6);

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int anInt5007 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_95 = new Class186(37, 4);

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!ct;")
	public static final Class58 aClass58_2 = new Class58();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)I")
	public static int method4190(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ[B)V")
	public static void method4191(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static283.aClass3_Sub28_9 == null) {
			Static283.aClass3_Sub28_9 = new Class3_Sub28(20000);
		}
		Static283.aClass3_Sub28_9.method5274(arg1.length, arg1, 0);
		if (!arg0) {
			return;
		}
		Static37.method556(Static283.aClass3_Sub28_9.aByteArray50);
		Static372.aClass256_Sub1Array1 = new Class256_Sub1[Static323.anInt5655];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static80.anInt1245; local40 <= Static410.anInt7308; local40++) {
			@Pc(48) Class256_Sub1 local48 = Static325.method4838(local40);
			if (local48 != null) {
				Static372.aClass256_Sub1Array1[local38++] = local48;
			}
		}
		Static432.aBoolean578 = false;
		Static412.aLong247 = Static626.method8479();
		Static283.aClass3_Sub28_9 = null;
	}
}
