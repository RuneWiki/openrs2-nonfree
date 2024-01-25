import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "Lclient!dn;")
	public static Class56 aClass56_100;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
	public static int anInt7541;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
	public static int anInt7542;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLclient!eo;I)V")
	public static void method5923(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class68 arg1) {
		@Pc(15) int local15 = arg1.anInt2210 == 0 ? arg1.anInt2178 : arg1.anInt2210;
		@Pc(27) int local27 = arg1.anInt2197 == 0 ? arg1.lb : arg1.anInt2197;
		Static73.method1341(arg0, Static300.aClass68ArrayArray3[arg1.anInt2177 >> 16], local27, local15, arg1.anInt2177);
		if (arg1.aClass68Array2 != null) {
			Static73.method1341(arg0, arg1.aClass68Array2, local27, local15, arg1.anInt2177);
		}
		@Pc(66) Class3_Sub40 local66 = (Class3_Sub40) Static30.aClass127_3.method3246((long) arg1.anInt2177);
		if (local66 != null) {
			Static157.method2732(local66.anInt6668, local15, arg0, local27);
		}
	}
}
