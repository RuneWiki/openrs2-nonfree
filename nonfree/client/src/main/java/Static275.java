import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!ba;")
	public static Class18 aClass18_3;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public static int anInt4601;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "F")
	public static float aFloat61 = 1024.0F;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lclient!vs;")
	public static final Class3_Sub3_Sub17[] aClass3_Sub3_Sub17Array3 = new Class3_Sub3_Sub17[14];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;ZLclient!ba;I)V")
	public static void method3805(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class18 arg2) {
		@Pc(20) int local20 = Static298.aClass124_11.method3097(null, arg0, 250);
		@Pc(33) int local33 = Static298.aClass124_11.method3098(250, null, arg0) * 13;
		Static413.aClass167_11.M(6, 6, local20 + 8, local33 - -8, -16777216, 0);
		Static413.aClass167_11.method5996(6, 6, local20 + 4 + 4, local33 + 4 + 4, -1, 0);
		arg2.method5175(local33, -1, arg0, null, -1, 10, 1, null, local20, null, 0, 10, 0);
		Static208.method3163(local20 + 8, 6, local33 + 8, 6);
		if (arg1) {
			Static413.aClass167_11.method5994();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
	public static void method3806(@OriginalArg(1) int arg0) {
		if (Static163.method5702(arg0)) {
			Static370.method5158(-1, Static298.aClass82ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIIII)V")
	public static void method3808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) float local17 = (float) Static211.anInt277 / (float) Static211.anInt273;
		@Pc(19) int local19 = arg2;
		@Pc(21) int local21 = arg3;
		if (local17 < 1.0F) {
			local21 = (int) ((float) arg2 * local17);
		} else {
			local19 = (int) ((float) arg3 / local17);
		}
		@Pc(48) int local48 = arg1 - (arg2 - local19) / 2;
		@Pc(57) int local57 = arg0 - (arg3 - local21) / 2;
		Static82.anInt1486 = -1;
		Static34.anInt3343 = local48 * Static211.anInt273 / local19;
		Static436.anInt7297 = Static211.anInt277 - Static211.anInt277 * local57 / local21;
		Static280.anInt4669 = -1;
		Static368.method5132();
	}
}
