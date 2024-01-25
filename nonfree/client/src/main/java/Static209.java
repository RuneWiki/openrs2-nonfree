import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Lclient!oa;")
	public static Class4 aClass4_6;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "[Lclient!th;")
	public static final Class22[] aClass22Array3 = new Class22[128];

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Lclient!d;")
	public static final Class1_Sub7 aClass1_Sub7_3 = new Class1_Sub7(0, -1);

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_77 = new Class96("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	public static void method3811() {
		for (@Pc(6) Class36_Sub4 local6 = (Class36_Sub4) Static337.aClass242_6.method5508(); local6 != null; local6 = (Class36_Sub4) Static337.aClass242_6.method5508()) {
			Static295.method4032(local6);
		}
		@Pc(35) int local35;
		@Pc(34) int local34;
		if (Static327.aClass230_Sub1_1.method5644(Static146.anInt2664)) {
			local35 = 0;
			local34 = 3;
		} else {
			local34 = Static29.anInt483;
			local35 = Static29.anInt483;
		}
		Static51.method755();
		for (@Pc(44) int local44 = local35; local44 <= local34; local44++) {
			Static51.method742();
			Static51.method753(local44);
			Static51.method744(local44);
		}
		Static51.method747();
		Static51.method748();
	}
}
