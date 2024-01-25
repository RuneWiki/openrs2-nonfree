import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "[Lclient!ub;")
	public static final Class344[] aClass344Array1 = new Class344[37];

	@OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
	public static int anInt8867 = 0;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILclient!jp;)Lclient!k;")
	public static Class106_Sub2 method7739(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(7) Class106 local7 = Static342.method5131(arg0);
		@Pc(16) int local16 = arg0.method8618();
		@Pc(20) int local20 = arg0.method8618();
		@Pc(26) int local26 = arg0.method8593();
		return new Class106_Sub2(local7.aClass356_8, local7.aClass56_11, local7.anInt5838, local7.anInt5836, local7.anInt5840, local7.anInt5834, local7.anInt5837, local7.anInt5841, local7.anInt5839, local16, local20, local26);
	}
}
