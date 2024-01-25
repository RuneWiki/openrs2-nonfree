import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_42 = new Class341(85, 3);

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!df;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Lclient!bs;")
	public static final Class2_Sub11 aClass2_Sub11_1 = new Class2_Sub11(0, -1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)Z")
	public static boolean method3361(@OriginalArg(0) int arg0) {
		return arg0 == 48 || arg0 == 44 || arg0 == 17 || arg0 == 13 || arg0 == 16 || arg0 == 18 || arg0 == 12;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!ol;B)Lclient!rm;")
	public static Class226 method3362(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method5211();
		@Pc(16) Class236 local16 = Static566.method8589()[arg0.method5203()];
		@Pc(28) Class103 local28 = Static277.method9737()[arg0.method5203()];
		@Pc(32) int local32 = arg0.method5174();
		@Pc(36) int local36 = arg0.method5174();
		return new Class226(local7, local16, local28, local32, local36);
	}
}
