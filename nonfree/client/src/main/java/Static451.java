import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!of;")
	public static final Class230 aClass230_46 = new Class230(12, 17);

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt7957 = 0;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_130 = new Class98(111, -1);

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	public static int anInt7959 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZIFBIIII)[I")
	public static int[] method6336(@OriginalArg(2) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class6_Sub3_Sub4 local15 = new Class6_Sub3_Sub4();
		local15.anInt729 = 8;
		local15.anInt726 = (int) (arg0 * 4096.0F);
		local15.aBoolean49 = true;
		local15.anInt736 = 35;
		local15.anInt731 = 4;
		local15.anInt727 = 8;
		local15.method7957();
		Static171.method7158(2048, 1);
		local15.method634(0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIB)Z")
	public static boolean method6337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static391.method5695(arg0, arg1) | (arg0 & 0x2000) != 0 | Static208.method3404(arg1, arg0)) & Static429.method6105(arg1, arg0);
	}
}
