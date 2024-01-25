import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
	public static int anInt10315;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "Lclient!la;")
	public static Class207 aClass207_125;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_107 = new Class46(29, -1);

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "[I")
	public static final int[] anIntArray588 = new int[14];

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IFZIBIII)[I")
	public static int[] method8784(@OriginalArg(1) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class5_Sub2_Sub30 local10 = new Class5_Sub2_Sub30();
		local10.anInt8911 = 8;
		local10.anInt8913 = 4;
		local10.anInt8920 = 35;
		local10.aBoolean654 = true;
		local10.anInt8915 = 8;
		local10.anInt8908 = (int) (arg0 * 4096.0F);
		local10.method9044();
		Static53.method914(2048, 1);
		local10.method7677(0, local6);
		return local6;
	}
}
