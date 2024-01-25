import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
	public static int anInt3808;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "Lclient!bt;")
	public static final Class48 aClass48_9 = new Class48(14, 16);

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "[I")
	public static final int[] anIntArray189 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!mc;I)Lclient!ib;")
	public static Class46 method3266(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(7) int local7 = arg0.method7860();
		@Pc(14) Class275 local14 = Static393.method5771()[arg0.method7816()];
		@Pc(26) Class81 local26 = Static584.method8024()[arg0.method7816()];
		@Pc(30) int local30 = arg0.method7849();
		@Pc(34) int local34 = arg0.method7849();
		return new Class46(local7, local14, local26, local30, local34);
	}
}
