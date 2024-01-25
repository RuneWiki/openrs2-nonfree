import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!ck;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_142 = new Class130();

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt6328 = -1;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!ea;")
	public static final Class4_Sub7_Sub1 aClass4_Sub7_Sub1_3 = new Class4_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Lclient!ds;")
	public static Class56 method5290(@OriginalArg(1) int arg0) {
		@Pc(5) Class154 local5 = Static100.aClass154_35;
		@Pc(14) Class56 local14;
		synchronized (Static100.aClass154_35) {
			local14 = (Class56) Static100.aClass154_35.method4222((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static245.aClass11_106.method288(Static86.method1552(arg0), Static15.method317(arg0));
		local14 = new Class56();
		local14.anInt1346 = arg0;
		if (local34 != null) {
			local14.method1082(new Class4_Sub7(local34));
		}
		local14.method1086();
		if (!Static149.aBoolean278 && local14.aBoolean106) {
			local14.lb = null;
			local14.anIntArray153 = null;
		}
		if (local14.aBoolean105) {
			local14.aBoolean100 = false;
			local14.anInt1350 = 0;
		}
		@Pc(80) Class154 local80 = Static100.aClass154_35;
		synchronized (Static100.aClass154_35) {
			Static100.aClass154_35.method4221((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!vm;ILclient!ol;IIIII)Lclient!lg;")
	public static Class60 method5292(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class148 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static81.aClass30_1.anInt490 = arg1;
		Static81.aClass30_1.anInt496 = arg0.anInt5370;
		Static81.aClass30_1.anInt488 = arg5;
		Static81.aClass30_1.anInt494 = arg4;
		Static81.aClass30_1.aBoolean30 = arg2 != null;
		Static81.aClass30_1.anInt497 = arg6;
		Static81.aClass30_1.anInt487 = arg3;
		return (Class60) Static234.aClass85_1.method2012(Static81.aClass30_1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!le;)V")
	public static void method5293(@OriginalArg(1) Class4_Sub13 arg0) {
		if (arg0.aClass4_Sub5_5 != null) {
			arg0.aClass4_Sub5_5.anInt6830 = 0;
		}
		arg0.aBoolean556 = false;
		for (@Pc(25) Class4_Sub13 local25 = arg0.method5303(); local25 != null; local25 = arg0.method5301()) {
			method5293(local25);
		}
	}
}
