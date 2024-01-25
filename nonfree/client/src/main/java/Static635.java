import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "[I")
	public static int[] anIntArray728;

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_223 = new Class200(51, 3);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BII)V")
	public static void method8745(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(14, arg0);
		local8.method925();
		local8.anInt852 = arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IC)Z")
	public static boolean method8747(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
