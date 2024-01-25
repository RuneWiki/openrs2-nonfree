import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "Lclient!hi;")
	public static final Class141 aClass141_6 = new Class141(1);

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "[I")
	public static final int[] anIntArray289 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!cu;ILclient!tb;)Lclient!rba;")
	public static Class4_Sub41 method2707(@OriginalArg(0) Class61 arg0, @OriginalArg(2) Class309 arg1) {
		@Pc(8) Class4_Sub41 local8 = Static117.method2421();
		local8.aClass61_104 = arg0;
		local8.anInt7685 = arg0.anInt1610;
		if (local8.anInt7685 == -1) {
			local8.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(260);
		} else if (local8.anInt7685 == -2) {
			local8.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(10000);
		} else if (local8.anInt7685 <= 18) {
			local8.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(20);
		} else if (local8.anInt7685 <= 98) {
			local8.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(100);
		} else {
			local8.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(260);
		}
		local8.aClass4_Sub9_Sub1_3.method1048(arg1);
		local8.aClass4_Sub9_Sub1_3.method1038(local8.aClass61_104.method1368());
		local8.anInt7684 = 0;
		return local8;
	}
}
