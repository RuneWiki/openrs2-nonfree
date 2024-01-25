import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!si;")
	public static final Class323 aClass323_4 = new Class323();

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "J")
	public static long aLong269 = 0L;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject18 = null;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!rv;)Lclient!via;")
	public static Class47_Sub4 method7427(@OriginalArg(1) Class5_Sub15 arg0) {
		return new Class47_Sub4(arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3633(), arg0.method3642());
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Z")
	public static boolean method7429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static476.method7022(arg1, arg0) & (Static56.method840(arg0, arg1) | (arg1 & 0x2000) != 0 | Static413.method6079(arg1, arg0));
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!nba;B)V")
	public static void method7432(@OriginalArg(0) Class5_Sub2_Sub13 arg0) {
		if (Static423.aBoolean549) {
			return;
		}
		arg0.method8829();
		Static223.anInt3566--;
		if (!arg0.aBoolean480) {
			@Pc(19) long local19 = arg0.aLong197;
			@Pc(25) Class5_Sub2_Sub5 local25;
			for (local25 = (Class5_Sub2_Sub5) Static277.aClass335_21.method7766(local19); local25 != null && !local25.aString27.equals(arg0.aString66); local25 = (Class5_Sub2_Sub5) Static277.aClass335_21.method7769()) {
			}
			if (local25 != null && local25.method2535(arg0)) {
				Static258.method6480(local25);
			}
			return;
		}
		for (@Pc(55) Class5_Sub2_Sub5 local55 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3100(); local55 != null; local55 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3096()) {
			if (local55.aString27.equals(arg0.aString66)) {
				@Pc(64) boolean local64 = false;
				for (@Pc(70) Class5_Sub2_Sub13 local70 = (Class5_Sub2_Sub13) local55.aClass150_3.method3100(); local70 != null; local70 = (Class5_Sub2_Sub13) local55.aClass150_3.method3096()) {
					if (local70 == arg0) {
						if (local55.method2535(arg0)) {
							Static258.method6480(local55);
						}
						local64 = true;
						break;
					}
				}
				if (local64) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!iw;)V")
	public static void method7433(@OriginalArg(1) Class5_Sub15_Sub2 arg0) {
		arg0.method3679(Static269.aClass50_71.method923());
		arg0.method3679(Static119.aClass50_34.method923());
		arg0.method3679(Static238.aClass50_62.method923());
		arg0.method3679(Static76.aClass50_19.method923());
		arg0.method3679(Static647.aClass50_113.method923());
		arg0.method3679(Static570.aClass50_162.method923());
		arg0.method3679(Static449.aClass50_129.method923());
		arg0.method3679(Static392.aClass50_114.method923());
		arg0.method3679(Static471.aClass50_136.method923());
		arg0.method3679(Static538.aClass50_156.method923());
		arg0.method3679(Static425.aClass50_121.method923());
		arg0.method3679(Static537.aClass50_186.method923());
		arg0.method3679(Static427.aClass50_189.method923());
		arg0.method3679(Static253.aClass50_66.method923());
		arg0.method3679(Static2.aClass50_3.method923());
		arg0.method3679(Static491.aClass50_146.method923());
		arg0.method3679(Static207.aClass50_54.method923());
		arg0.method3679(Static85.aClass50_23.method923());
		arg0.method3679(Static356.aClass50_101.method923());
		arg0.method3679(Static655.aClass50_185.method923());
		arg0.method3679(Static125.aClass50_35.method923());
		arg0.method3679(Static7.aClass50_5.method923());
		arg0.method3679(Static81.aClass50_20.method923());
		arg0.method3679(Static418.aClass50_119.method923());
		arg0.method3679(Static103.aClass50_30.method923());
		arg0.method3679(Static335.aClass50_95.method923());
		arg0.method3679(Static524.aClass50_124.method923());
		arg0.method3679(Static22.aClass50_6.method923());
		arg0.method3679(Static613.aClass50_172.method923());
		arg0.method3679(Static633.aClass50_176.method923());
		arg0.method3679(Static596.aClass50_167.method923());
		arg0.method3679(Static498.aClass50_149.method923());
		arg0.method3679(Static174.method2565());
		arg0.method3679(Static147.method8605());
		arg0.method3679(Static484.aClass50_141.method923());
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)I")
	public static int method7434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}
}
