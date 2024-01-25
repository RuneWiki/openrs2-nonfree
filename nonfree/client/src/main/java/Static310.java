import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public static int anInt6128;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!sn;")
	public static Class184 aClass184_2;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_51 = new Class107(30);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!tg;I)V")
	public static void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1) {
		if (Static67.aBoolean359) {
			Static67.aBoolean359 = false;
			arg0 = 0;
		}
		if (Static36.aClass191_1 != null && Static36.aClass191_1.method5161(arg1)) {
			return;
		}
		Static36.aClass191_1 = arg1;
		Static238.aLong155 = Static22.method285();
		Static191.anInt4208 = arg0;
		Static211.anInt6303 = arg0;
		if (Static211.anInt6303 == 0) {
			Static151.method3017();
			return;
		}
		Static86.aFloat31 = Static164.aFloat41;
		Static184.anInt4077 = Static207.anInt4537;
		Static233.aFloat51 = Static163.aFloat40;
		Static319.aClass3_4 = Static57.aClass3_1;
		Static161.aFloat39 = Static111.aFloat36;
		Static258.aFloat65 = Static149.aFloat38;
		Static189.aFloat43 = Static59.aFloat28;
		Static292.anInt5815 = Static346.anInt5919;
		Static125.anInt2666 = Static341.anInt462;
		Static73.aFloat30 = Static327.aFloat77;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void method5164() {
		@Pc(12) Class107 local12 = Static298.aClass107_46;
		synchronized (Static298.aClass107_46) {
			Static298.aClass107_46.method3012();
		}
		local12 = aClass107_51;
		synchronized (aClass107_51) {
			aClass107_51.method3012();
		}
	}
}
