import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Lclient!ul;")
	public static Class318 aClass318_1;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt6943;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	public static int anInt6944;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	public static int anInt6941 = -1;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method5849() {
		Static236.aClass66_23 = null;
		Static31.aClass66_6 = null;
		Static12.aClass66_5 = null;
		Static73.aClass66_17 = null;
		Static53.aClass66_12 = null;
		Static451.aClass66Array11 = null;
		Static515.aClass66_30 = null;
		Static33.aClass66_7 = null;
		Static135.aClass66_20 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!pe;ZILjava/lang/String;Z)V")
	public static void method5851(@OriginalArg(0) Class246 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg1) {
			Static405.method6332(3, arg0, arg2);
			return;
		}
		@Pc(22) String local22;
		if (Static389.aString89.startsWith("win") && arg0.aBoolean534) {
			local22 = null;
			if (Static87.anApplet1 != null) {
				local22 = Static87.anApplet1.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(40) Class280 local40 = Static405.method6332(0, arg0, arg2);
				Static177.aString41 = arg2;
				Static156.aClass280_2 = local40;
				Static489.aClass246_6 = arg0;
				return;
			}
		}
		if (Static389.aString89.startsWith("mac")) {
			local22 = null;
			if (Static87.anApplet1 != null) {
				local22 = Static87.anApplet1.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg3) {
				Static405.method6332(1, arg0, arg2);
				return;
			}
		}
		Static405.method6332(2, arg0, arg2);
	}
}
