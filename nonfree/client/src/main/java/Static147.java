import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "Lclient!de;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Lclient!hk;")
	public static Class155 aClass155_8;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[8];

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
	public static int anInt2909 = -1;

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
	public static int anInt2911 = -1;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)V")
	public static void method2741() {
		if (Static265.anApplet2 == null) {
			return;
		}
		try {
			@Pc(13) String local13 = Static265.anApplet2.getParameter("cookiehost");
			@Pc(28) int local28 = (int) (Static480.method6763() / 86400000L) - 11745;
			@Pc(44) String local44 = "usrdob=" + local28 + "; version=1; path=/; domain=" + local13;
			Static684.method783("document.cookie=\"" + local44 + "\"", Static265.anApplet2);
		} catch (@Pc(60) Throwable local60) {
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!mj;B)V")
	public static void method2743(@OriginalArg(0) Class238 arg0) {
		if (!Static421.aBoolean472) {
			return;
		}
		if (arg0.anObjectArray23 != null) {
			@Pc(21) Class238 local21 = Static333.method5035(Static516.anInt8202, Static14.anInt171);
			if (local21 != null) {
				@Pc(27) Class5_Sub24 local27 = new Class5_Sub24();
				local27.aClass238_5 = local21;
				local27.anObjectArray2 = arg0.anObjectArray23;
				local27.aClass238_6 = arg0;
				Static247.method3957(local27);
			}
		}
		@Pc(52) Class5_Sub41 local52 = Static647.method8905(Static57.aClass381_32, Static4.aClass389_17.aClass393_2);
		local52.aClass5_Sub36_Sub2_1.method7287(arg0.anInt5971);
		local52.aClass5_Sub36_Sub2_1.method7296(arg0.anInt5990);
		local52.aClass5_Sub36_Sub2_1.method7285(Static516.anInt8202);
		local52.aClass5_Sub36_Sub2_1.method7285(arg0.anInt5986);
		local52.aClass5_Sub36_Sub2_1.method7296(Static268.anInt4795);
		local52.aClass5_Sub36_Sub2_1.method7287(Static14.anInt171);
		Static4.aClass389_17.method9079(local52);
	}
}
