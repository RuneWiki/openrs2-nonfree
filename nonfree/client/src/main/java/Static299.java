import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_171 = new Class288(55, 6);

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_172 = new Class288(110, 6);

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public static void method4132() {
		if (Static38.anInt777 == -1) {
			return;
		}
		@Pc(11) int local11 = Static507.aClass335_1.method7811();
		@Pc(22) int local22 = Static507.aClass335_1.method7821();
		@Pc(27) Class2_Sub12 local27 = (Class2_Sub12) Static595.aClass109_69.method2325();
		if (local27 != null) {
			local11 = local27.method7237();
			local22 = local27.method7238();
		}
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		if (Static319.aBoolean356) {
			local39 = Static274.method3801();
			local41 = Static69.method966();
		}
		Static529.method7306(local39 + local11, local39, local41, local39 + Static511.anInt8548, Static153.anInt2747 + local41, local11, Static38.anInt777, local41 + local22, local41, local22, local39);
		if (Static93.aClass261_2 != null) {
			Static285.method3972(local22 + local41, local11 + local39);
		}
	}
}
