import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "[I")
	public static int[] anIntArray597;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_105 = new Class2(30, 3);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!kh;)V")
	public static void method5463(@OriginalArg(1) Class26_Sub2_Sub4 arg0) {
		if (arg0 instanceof Class26_Sub2_Sub4_Sub1) {
			@Pc(15) Class26_Sub2_Sub4_Sub1 local15 = (Class26_Sub2_Sub4_Sub1) arg0;
			if (local15.aClass249_1 != null) {
				Static167.method2415(local15, Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 != local15.aByte102);
				return;
			}
		} else if (arg0 instanceof Class26_Sub2_Sub4_Sub2) {
			@Pc(36) Class26_Sub2_Sub4_Sub2 local36 = (Class26_Sub2_Sub4_Sub2) arg0;
			Static369.method4729(local36, Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 != local36.aByte102);
		} else {
			return;
		}
	}
}
