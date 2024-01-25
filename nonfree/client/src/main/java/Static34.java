import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	public static int anInt888;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_11 = new Class67("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "[I")
	public static final int[] anIntArray134 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
	public static void method835(@OriginalArg(1) boolean arg0) {
		if (Static27.aString7.length() == 0) {
			return;
		}
		Static457.method6860("--> " + Static27.aString7);
		Static351.method5389(Static27.aString7, false, arg0);
		Static103.anInt2281 = 0;
		Static149.anInt2987 = 0;
		Static27.aString7 = "";
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!oa;Lclient!qba;B)I")
	public static int method836(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class240 arg1) {
		if (arg1.anInt7142 != -1) {
			return arg1.anInt7142;
		}
		if (arg1.anInt7137 != -1) {
			@Pc(29) Class238 local29 = arg0.anInterface4_14.method6712(arg0.method7462() ? arg1.anInt7137 : arg1.anInt7136);
			if (!local29.aBoolean461) {
				return local29.aShort111;
			}
		}
		return arg1.anInt7141;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	public static void method838() {
		for (@Pc(14) Class3_Sub11 local14 = (Class3_Sub11) Static255.aClass71_43.method2089(); local14 != null; local14 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
			if (Static83.method1710(local14.anInt1419)) {
				Static491.method7788(local14);
			}
		}
		if (Static179.anInt4933 == 1) {
			Static195.method3710();
			return;
		}
		Static33.method833(Static87.anInt1887, Static386.anInt7125, Static199.anInt4475, Static256.anInt5196);
		@Pc(55) int local55 = Static25.aClass53_6.method1378(Static490.aClass67_143.method1934(Static193.anInt7803));
		for (@Pc(60) Class3_Sub11 local60 = (Class3_Sub11) Static255.aClass71_43.method2089(); local60 != null; local60 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
			@Pc(66) int local66 = Static157.method3099(local60);
			if (local66 > local55) {
				local55 = local66;
			}
		}
		Static256.anInt5196 = local55 + 8;
		Static199.anInt4475 = (Static346.aBoolean416 ? 26 : 22) + Static179.anInt4933 * 16;
	}
}
