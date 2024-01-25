import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
	public static boolean aBoolean562 = false;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "Z")
	public static boolean aBoolean565 = false;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Z")
	public static boolean method7074(@OriginalArg(1) int arg0) {
		return arg0 == 20 || arg0 == 22 || arg0 == 1008 || arg0 == 57 || arg0 == 11;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fea;I)Z")
	public static boolean method7076(@OriginalArg(0) Class104 arg0) {
		return Static227.aClass104_4 == arg0 || Static44.aClass104_1 == arg0 || Static444.aClass104_8 == arg0 || Static226.aClass104_7 == arg0 || Static210.aClass104_6 == arg0;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z")
	public static boolean method7082() {
		@Pc(7) boolean local7 = true;
		if (Static204.aClass112_2 == null) {
			if (Static624.aClass8_139.method273(Static433.anInt7405)) {
				Static204.aClass112_2 = Static681.method2317(Static624.aClass8_139, Static433.anInt7405);
			} else {
				local7 = false;
			}
		}
		if (Static445.aClass112_3 == null) {
			if (Static624.aClass8_139.method273(Static15.anInt440)) {
				Static445.aClass112_3 = Static681.method2317(Static624.aClass8_139, Static15.anInt440);
			} else {
				local7 = false;
			}
		}
		if (Static45.aClass112_1 == null) {
			if (Static624.aClass8_139.method273(Static86.anInt1676)) {
				Static45.aClass112_1 = Static681.method2317(Static624.aClass8_139, Static86.anInt1676);
			} else {
				local7 = false;
			}
		}
		if (Static119.aClass151_3 == null) {
			if (Static466.aClass8_114.method273(Static615.anInt10064)) {
				Static119.aClass151_3 = Static581.method8055(Static466.aClass8_114, Static615.anInt10064);
			} else {
				local7 = false;
			}
		}
		if (Static602.aClass112Array1 == null) {
			if (Static624.aClass8_139.method273(Static615.anInt10064)) {
				Static602.aClass112Array1 = Static681.method2329(Static624.aClass8_139, Static615.anInt10064);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
