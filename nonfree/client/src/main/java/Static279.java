import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
	public static int anInt5796;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "Ljava/awt/Image;")
	public static Image anImage13;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
	public static int anInt5791 = 0;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "Lclient!on;")
	public static final Class252 aClass252_1 = new Class252();

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "[I")
	public static final int[] anIntArray300 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	public static void method4473() {
		if (Static43.anInt2490 < 0) {
			Static465.anInt8867 = -1;
			Static43.anInt2490 = 0;
			Static315.anInt6308 = -1;
		}
		if (Static43.anInt2490 > Static572.anInt10062) {
			Static43.anInt2490 = Static572.anInt10062;
			Static315.anInt6308 = -1;
			Static465.anInt8867 = -1;
		}
		if (Static555.anInt10135 < 0) {
			Static465.anInt8867 = -1;
			Static555.anInt10135 = 0;
			Static315.anInt6308 = -1;
		}
		if (Static572.anInt10057 < Static555.anInt10135) {
			Static555.anInt10135 = Static572.anInt10057;
			Static465.anInt8867 = -1;
			Static315.anInt6308 = -1;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Lclient!oda;")
	public static Class244 method4474() {
		return new Class244(1, false);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!ek;)Lclient!em;")
	public static Class50 method4475(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(17) Class347 local17 = Static302.method4802()[arg0.method7004()];
		@Pc(24) Class214 local24 = Static106.method1999()[arg0.method7004()];
		@Pc(28) int local28 = arg0.method7043();
		@Pc(32) int local32 = arg0.method7043();
		@Pc(36) int local36 = arg0.method7054();
		@Pc(40) int local40 = arg0.method7054();
		@Pc(46) int local46 = arg0.method7043();
		@Pc(50) int local50 = arg0.method6990();
		@Pc(54) int local54 = arg0.method6990();
		return new Class50(local17, local24, local28, local32, local36, local40, local46, local50, local54);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLclient!wv;ILjava/lang/String;Z)V")
	public static void method4476(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg0) {
			Static441.method6510(arg2, 3, arg1);
			return;
		}
		@Pc(18) String local18;
		if (Static594.aString238.startsWith("win") && arg1.aBoolean719) {
			local18 = null;
			if (Static589.anApplet2 != null) {
				local18 = Static589.anApplet2.getParameter("haveie6");
			}
			if (local18 == null || !local18.equals("1")) {
				@Pc(36) Class316 local36 = Static441.method6510(arg2, 0, arg1);
				Static270.aClass316_4 = local36;
				Static175.aClass366_2 = arg1;
				Static104.aString198 = arg2;
				return;
			}
		}
		if (Static594.aString238.startsWith("mac")) {
			local18 = null;
			if (Static589.anApplet2 != null) {
				local18 = Static589.anApplet2.getParameter("havefirefox");
			}
			if (local18 != null && local18.equals("1") && arg3) {
				Static441.method6510(arg2, 1, arg1);
				return;
			}
		}
		Static441.method6510(arg2, 2, arg1);
	}
}
