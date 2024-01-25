import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "Z")
	public static boolean aBoolean675 = false;

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "F")
	public static float aFloat197 = 1024.0F;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
	public static void method8326() {
		Static419.anInt7662 = -1;
		Static446.anIntArray511 = null;
		Static117.aClass100_5 = null;
		Static469.anInt8256 = -1;
		Static105.aClass154_1 = null;
		Static503.aClass154_8 = null;
		Static576.anInt4608 = -1;
		Static625.anInt10293 = -1;
		Static180.anInterface20_1 = null;
		Static363.anInterface20Array1 = null;
		Static335.aClass154_4 = null;
		Static287.aClass65_4.method1719();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!rg;)Lclient!ms;")
	public static Class69_Sub4 method8327(@OriginalArg(1) Class6_Sub40 arg0) {
		return new Class69_Sub4(arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8606(), arg0.method8606(), arg0.method8604());
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V")
	public static void method8328() {
		@Pc(18) Class6_Sub6 local18;
		for (local18 = (Class6_Sub6) Static26.aClass8_7.method149(); local18 != null; local18 = (Class6_Sub6) Static26.aClass8_7.method155()) {
			if (local18.aBoolean78) {
				local18.method9043();
			} else {
				local18.aBoolean79 = true;
				if (local18.anInt1247 >= 0 && local18.anInt1250 >= 0 && Static442.anInt7975 > local18.anInt1247 && Static284.anInt7916 > local18.anInt1250) {
					Static136.method2202(local18);
				}
			}
		}
		for (local18 = (Class6_Sub6) Static69.aClass8_9.method149(); local18 != null; local18 = (Class6_Sub6) Static69.aClass8_9.method155()) {
			if (local18.aBoolean78) {
				local18.method9043();
			} else {
				local18.aBoolean79 = true;
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)I")
	public static int method8329() {
		@Pc(13) Class166 local13 = Static3.aClass166_1;
		synchronized (Static3.aClass166_1) {
			return Static3.aClass166_1.method4804();
		}
	}
}
