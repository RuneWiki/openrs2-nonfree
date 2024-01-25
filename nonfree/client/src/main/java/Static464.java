import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "Lclient!la;")
	public static Class137 aClass137_8;

	@OriginalMember(owner = "client!ya", name = "i", descriptor = "I")
	public static int anInt6761;

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_254 = new Class67(56, 4);

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "[Lclient!mh;")
	public static final Class1_Sub3_Sub14[] aClass1_Sub3_Sub14Array8 = new Class1_Sub3_Sub14[14];

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IZII)V")
	public static void method5361(@OriginalArg(1) boolean arg0) {
		Static234.anInt4244 = 22050;
		Static355.anInt5747 = 2;
		Static167.aBoolean276 = arg0;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)Z")
	public static boolean method5363(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(III)Lclient!dj;")
	public static Class11_Sub3 method5366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_3;
	}
}
