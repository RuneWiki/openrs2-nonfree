import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "Lclient!q;")
	public static Class42 aClass42_3;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "Lclient!cm;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_129 = new Class342(64);

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "Lclient!wr;")
	public static final Class363 aClass363_3 = new Class363();

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray69 = new int[6][];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5152(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class3_Sub10 local12 = Static129.method2403(Static452.aClass353_2, Static427.aClass287_123);
		local12.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(arg1) + 1);
		local12.aClass3_Sub26_Sub1_1.method6772(arg1);
		local12.aClass3_Sub26_Sub1_1.method6809(arg0);
		Static193.method3398(local12);
	}
}
