import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
	public static int anInt9307;

	@OriginalMember(owner = "client!af", name = "D", descriptor = "Lclient!db;")
	public static final Class64 aClass64_463 = new Class64(108, 7);

	@OriginalMember(owner = "client!af", name = "eb", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_129 = new Class61(46, 8);

	@OriginalMember(owner = "client!af", name = "gb", descriptor = "[I")
	public static int[] anIntArray700 = new int[2];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method7640(@OriginalArg(0) int arg0) {
		Static543.method7532(Static275.aClass198_11.method4407(Static56.anInt953), arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)I")
	public static int method7641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static86.method2045(local7, local17);
		@Pc(35) int local35 = Static86.method2045(local7 + 1, local17);
		@Pc(50) int local50 = Static86.method2045(local7, local17 + 1);
		@Pc(59) int local59 = Static86.method2045(local7 + 1, local17 + 1);
		@Pc(66) int local66 = Static409.method7481(local35, arg2, local28, local13);
		@Pc(73) int local73 = Static409.method7481(local59, arg2, local50, local13);
		return Static409.method7481(local73, arg2, local66, local23);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!e;Ljava/awt/Canvas;I)Lclient!oa;")
	public static Class66 method7645(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class66_Sub3(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ii;Ljava/lang/String;ZZB)V")
	public static void method7646(@OriginalArg(0) Class161 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg2) {
			Static583.method7899(arg0, 3, arg1);
			return;
		}
		@Pc(14) String local14;
		if (Static222.aString49.startsWith("win") && arg0.aBoolean344) {
			local14 = null;
			if (Static55.anApplet1 != null) {
				local14 = Static55.anApplet1.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(32) Class299 local32 = Static583.method7899(arg0, 0, arg1);
				Static273.aString68 = arg1;
				Static343.aClass299_5 = local32;
				Static65.aClass161_1 = arg0;
				return;
			}
		}
		if (Static222.aString49.startsWith("mac")) {
			local14 = null;
			if (Static55.anApplet1 != null) {
				local14 = Static55.anApplet1.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg3) {
				Static583.method7899(arg0, 1, arg1);
				return;
			}
		}
		Static583.method7899(arg0, 2, arg1);
	}
}
