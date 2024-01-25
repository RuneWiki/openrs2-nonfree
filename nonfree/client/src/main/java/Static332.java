import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!r", name = "T", descriptor = "Lclient!pc;")
	public static Class188 aClass188_92;

	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	public static int anInt5919 = 0;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "[Lclient!cl;")
	public static final Class37[] aClass37Array1 = new Class37[4];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!ql;)V")
	public static void method4734(@OriginalArg(1) Class4_Sub2_Sub2_Sub1 arg0) {
		@Pc(16) Class2_Sub23 local16 = (Class2_Sub23) Static69.aClass240_7.method5439((long) arg0.anInt6456);
		if (local16 == null) {
			Static354.method4965(null, arg0, null, arg0.anIntArray436[0], 0, arg0.aByte92, arg0.anIntArray437[0]);
		} else {
			local16.method3020();
		}
	}
}
