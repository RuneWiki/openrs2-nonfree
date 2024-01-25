import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!pf", name = "eb", descriptor = "I")
	public static int anInt7853;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "Lclient!qh;")
	public static final Class309 aClass309_9 = new Class309("game3", "Game 3", 2);

	@OriginalMember(owner = "client!pf", name = "qb", descriptor = "I")
	public static int anInt7852 = 0;

	@OriginalMember(owner = "client!pf", name = "sb", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_10 = new Class123(4, 1, 1, 1);

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "(I)V")
	public static void method6740() {
		Static628.aClass178_28 = null;
		Static11.aClass178_1 = null;
		Static413.aClass178Array13 = null;
		Static490.aClass178_21 = null;
		Static627.aClass178_27 = null;
		Static724.aClass178_34 = null;
		Static111.aClass178_2 = null;
		Static551.aClass178_22 = null;
		Static392.aClass178_12 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZII)V")
	public static void method6741(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub14 local10 = arg0 ? Static107.aClass3_Sub14_10 : Static12.aClass3_Sub14_15;
		if (local10 == null || arg1 < 0 || arg1 >= local10.anInt1731) {
			return;
		}
		@Pc(40) Class54 local40 = local10.aClass54Array1[arg1];
		if (local40.aByte42 != -1) {
			return;
		}
		@Pc(49) String local49 = local40.aString30;
		@Pc(52) Class292 local52 = Static631.method8307();
		@Pc(58) Class3_Sub29 local58 = Static507.method6901(Static582.aClass144_89, local52.aClass88_2);
		local58.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(local49) + 3);
		local58.aClass3_Sub2_Sub1_1.method2065(arg0 ? 1 : 0);
		local58.aClass3_Sub2_Sub1_1.method2032(arg1);
		local58.aClass3_Sub2_Sub1_1.method2073(local49);
		local52.method6855(local58);
	}

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "(B)Lclient!go;")
	public static Class142 method6742() {
		return Static437.method5772();
	}
}
