import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
	public static boolean aBoolean764;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
	public static boolean aBoolean765;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!st;")
	public static final Class314 aClass314_147 = new Class314(81, 3);

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[128][128];

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
	public static int anInt10078 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLclient!mba;Lclient!ha;II)V")
	public static void method8545(@OriginalArg(1) Class216 arg0, @OriginalArg(2) Class82 arg1) {
		Static181.aClass216_30.method5454();
		if (Static631.aBoolean762) {
			return;
		}
		for (@Pc(16) Class3_Sub47 local16 = (Class3_Sub47) arg0.method5457(); local16 != null; local16 = (Class3_Sub47) arg0.method5458()) {
			@Pc(33) Class179 local33 = Static598.aClass154_2.method3947(local16.anInt9169);
			if (Static32.method455(local33)) {
				@Pc(45) boolean local45 = Static471.method6965(arg1, local33, local16);
				if (local45) {
					Static430.method6555(arg1, local33, local16);
				}
			}
		}
	}
}
