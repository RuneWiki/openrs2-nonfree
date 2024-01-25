import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
	public static int anInt4666;

	@OriginalMember(owner = "client!jga", name = "o", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_79 = new Class286(63, -1);

	@OriginalMember(owner = "client!jga", name = "p", descriptor = "[I")
	public static final int[] anIntArray313 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!jga", name = "r", descriptor = "Lclient!ct;")
	public static final Class62 aClass62_6 = new Class62();

	@OriginalMember(owner = "client!jga", name = "v", descriptor = "I")
	public static int anInt4668 = 100;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!rga;Lclient!hr;B)Lclient!tba;")
	public static Class2_Sub42 method3910(@OriginalArg(0) Class286 arg0, @OriginalArg(1) Class145 arg1) {
		@Pc(16) Class2_Sub42 local16 = Static330.method5056();
		local16.aClass286_149 = arg0;
		local16.anInt8414 = arg0.anInt7942;
		if (local16.anInt8414 == -1) {
			local16.aClass2_Sub15_Sub2_2 = new Class2_Sub15_Sub2(260);
		} else if (local16.anInt8414 == -2) {
			local16.aClass2_Sub15_Sub2_2 = new Class2_Sub15_Sub2(10000);
		} else if (local16.anInt8414 <= 18) {
			local16.aClass2_Sub15_Sub2_2 = new Class2_Sub15_Sub2(20);
		} else if (local16.anInt8414 <= 98) {
			local16.aClass2_Sub15_Sub2_2 = new Class2_Sub15_Sub2(100);
		} else {
			local16.aClass2_Sub15_Sub2_2 = new Class2_Sub15_Sub2(260);
		}
		local16.aClass2_Sub15_Sub2_2.method4353(arg1);
		local16.aClass2_Sub15_Sub2_2.method4352(local16.aClass286_149.method6508());
		local16.anInt8409 = 0;
		return local16;
	}
}
