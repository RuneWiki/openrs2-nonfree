import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lia", name = "m", descriptor = "I")
	public static int anInt6392;

	@OriginalMember(owner = "client!lia", name = "n", descriptor = "Lclient!ni;")
	public static Class223 aClass223_67;

	@OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
	public static int anInt6388 = 0;

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_108 = new Class73(119, 12);

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIFIZZII)[I")
	public static int[] method5350(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class6_Sub1_Sub35 local10 = new Class6_Sub1_Sub35();
		local10.anInt9672 = 4;
		local10.anInt9677 = (int) (arg0 * 4096.0F);
		local10.aBoolean770 = true;
		local10.anInt9675 = 8;
		local10.anInt9674 = 8;
		local10.anInt9682 = 35;
		local10.method8732();
		Static25.method714(2048, 1);
		local10.method7919(local6, 0);
		return local6;
	}
}
