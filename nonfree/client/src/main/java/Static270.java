import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_73 = new Class397(64, 0);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public static int anInt4161 = 0;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public static int anInt4162 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
	public static void method3825(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static589.anInt8959 != -1) {
				Static137.method2384(Static589.anInt8959);
			}
			for (@Pc(30) Class3_Sub20 local30 = (Class3_Sub20) Static432.aClass313_34.method7103(); local30 != null; local30 = (Class3_Sub20) Static432.aClass313_34.method7110()) {
				if (!local30.method9597()) {
					local30 = (Class3_Sub20) Static432.aClass313_34.method7103();
					if (local30 == null) {
						break;
					}
				}
				Static46.method1229(true, false, local30);
			}
			Static589.anInt8959 = -1;
			Static432.aClass313_34 = new Class313(8);
			Static490.method6634();
			Static589.anInt8959 = Static29.aClass378_1.anInt10087;
			Static614.method7866(false);
			Static402.method5423();
			Static540.method7159(Static589.anInt8959);
		}
		Static374.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	public static int method3826() {
		@Pc(7) Class22 local7 = Static153.aClass22_4;
		@Pc(9) boolean local9 = false;
		if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static645.method8480(local18, (Interface4) null, 0, (Class182) null, 0);
		}
		@Pc(42) long local42 = Static517.method6965();
		for (@Pc(44) int local44 = 0; local44 < 10000; local44++) {
			local7.method9377();
		}
		@Pc(75) int local75 = (int) (Static517.method6965() - local42);
		local7.method9378(0, 0, -16777216, 100, 100);
		if (local9) {
			local7.method9397();
		}
		return local75;
	}
}
