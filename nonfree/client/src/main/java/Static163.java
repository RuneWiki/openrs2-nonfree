import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!gm;")
	public static final Class122 aClass122_8 = new Class122("", 15);

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
	public static final int anInt3675 = 4;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([I[JB)V")
	public static void method3150(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static217.method3844(arg0, arg1, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Lclient!br;")
	public static Class9_Sub3 method3151() {
		@Pc(8) Class9_Sub3 local8 = (Class9_Sub3) Static265.aClass234_5.method6094();
		if (local8 == null) {
			return new Class9_Sub3();
		} else {
			Static624.anInt10504--;
			return local8;
		}
	}
}
