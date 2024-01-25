import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_27 = new Class171(82, -1);

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "J")
	public static volatile long aLong63 = 0L;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_26 = new Class240(69, -1);

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIZ)V")
	public static void method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static185.method2900(arg1)) {
			Static190.method2931(Static270.aClass265ArrayArray2[arg1], arg3, arg0, -1, arg2);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZLclient!tga;)V")
	public static void method1850(@OriginalArg(2) Class3_Sub12_Sub3 arg0) {
		Static388.aClass41_2.method7708(arg0);
		Static374.method5317(Static442.aClass362_97, Static388.aClass41_2, arg0, Static585.aClass362_139, Static201.aClass362_43);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
	public static boolean method1852(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
