import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!ae;")
	public static Class8 aClass8_119;

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!wia;")
	public static Class6_Sub4_Sub20 aClass6_Sub4_Sub20_3;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Lclient!tv;")
	public static Class6_Sub53 aClass6_Sub53_2;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_14 = new Class159(14, 3);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method7083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class321 local8 = Static640.method8748(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray22 != null) {
			@Pc(18) Class6_Sub49 local18 = new Class6_Sub49();
			local18.aString128 = arg2;
			local18.anObjectArray35 = local8.anObjectArray22;
			local18.anInt9236 = arg3;
			local18.aClass321_44 = local8;
			Static295.method4226(local18);
		}
		if (Static556.anInt9319 != 10 || !Static83.method1453(local8).method5786(arg3 - 1)) {
			return;
		}
		@Pc(64) Class6_Sub26 local64;
		if (arg3 == 1) {
			local64 = Static268.method3981(Static377.aClass15_2, Static332.aClass289_112);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 2) {
			local64 = Static268.method3981(Static377.aClass15_2, Static163.aClass289_49);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 3) {
			local64 = Static268.method3981(Static377.aClass15_2, Static439.aClass289_106);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 4) {
			local64 = Static268.method3981(Static377.aClass15_2, Static270.aClass289_67);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 5) {
			local64 = Static268.method3981(Static377.aClass15_2, Static248.aClass289_60);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 6) {
			local64 = Static268.method3981(Static377.aClass15_2, Static662.aClass289_151);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 7) {
			local64 = Static268.method3981(Static377.aClass15_2, Static14.aClass289_4);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 8) {
			local64 = Static268.method3981(Static377.aClass15_2, Static549.aClass289_133);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 9) {
			local64 = Static268.method3981(Static377.aClass15_2, Static303.aClass289_74);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
		if (arg3 == 10) {
			local64 = Static268.method3981(Static377.aClass15_2, Static649.aClass289_149);
			Static167.method2408(local8.anInt9048, arg0, arg1, local64);
			Static670.method9077(local64);
		}
	}
}
