import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static688 {

	@OriginalMember(owner = "client!vka", name = "jb", descriptor = "[Lclient!ee;")
	public static Class9_Sub1[] aClass9_Sub1Array5;

	@OriginalMember(owner = "client!vka", name = "eb", descriptor = "Lclient!gga;")
	public static final Class137 aClass137_1 = Static247.method3498();

	@OriginalMember(owner = "client!vka", name = "ib", descriptor = "[I")
	public static final int[] anIntArray766 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!vka", name = "Z", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_182 = new Class397(48, 6);

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(IIII)V")
	public static void method9110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) String local37 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local37);
		Static382.method1852(false, local37, true);
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(III)Z")
	public static boolean method9111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
