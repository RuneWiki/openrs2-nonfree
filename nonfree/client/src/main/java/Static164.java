import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_40 = new Class307(4);

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_46 = new Class397(131, 6);

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_47 = new Class397(62, 6);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)V")
	public static void method2681(@OriginalArg(1) boolean arg0) {
		@Pc(7) Class292[] local7 = Static95.aClass292Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class292 local15 = local7[local9];
			local15.method6852();
		}
		Static55.method1309();
		Static473.method6434();
		Static61.method1407();
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			Static455.aClass109Array1[local32].method2731();
		}
		if (37 != 37) {
			return;
		}
		Static588.method7597(false);
		System.gc();
		Static66.method1494();
		Static659.anInt10097 = -1;
		Static627.aBoolean651 = false;
		Static217.method3246();
		Static675.method9007(true);
		Static276.method3879();
		Static133.method2361();
		Static122.method2274();
		if (arg0) {
			Static336.method4832(13);
			return;
		}
		Static336.method4832(3);
		try {
			Static728.method688(Static41.anApplet1, "loggedout");
		} catch (@Pc(90) Throwable local90) {
		}
	}
}
