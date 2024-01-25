import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gu", name = "s", descriptor = "Lclient!an;")
	public static Class16 aClass16_47;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_52 = new Class45(88, 10);

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "[I")
	public static int[] anIntArray304 = new int[1];

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(III)Lclient!fba;")
	public static Class30_Sub4 method3419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass30_Sub4_1;
	}
}
