import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sj", name = "I", descriptor = "Lclient!pr;")
	public static Class195 aClass195_2;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_76 = new Class179(79, 11);

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "[I")
	public static final int[] anIntArray554 = new int[14];

	@OriginalMember(owner = "client!sj", name = "H", descriptor = "Lclient!qd;")
	public static final Class200 aClass200_8 = new Class200("", 15);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IFIZIIII)[I")
	public static int[] method5028(@OriginalArg(1) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class1_Sub4_Sub27 local15 = new Class1_Sub4_Sub27();
		local15.aBoolean378 = true;
		local15.anInt5250 = 35;
		local15.anInt5251 = 8;
		local15.anInt5258 = (int) (arg0 * 4096.0F);
		local15.anInt5249 = 4;
		local15.anInt5256 = 8;
		local15.method5950();
		Static179.method2848(2048, 1);
		local15.method4355(0, local11);
		return local11;
	}
}
