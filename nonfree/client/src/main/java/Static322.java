import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Lclient!jj;")
	public static Class193 aClass193_5;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_6 = new Class344(5, 7);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)I")
	public static int method4690(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local20 * local34 >> 12;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public static void method4691() {
		Static533.aBoolean559 = true;
		Static207.aShort49 = Static720.aShort128;
		Static246.aShort51 = Static59.aShort26;
		Static320.aShort68 = Static608.aShort99;
		Static381.aShort75 = Static232.aShort50;
		if (Static226.anInt3688 != 0 && Static481.anInt7534 != 0) {
			Static232.aShort50 = 334;
			Static59.aShort26 = 334;
			Static608.aShort99 = Static720.aShort128 = (short) (Static226.anInt3688 * 512 / Static481.anInt7534);
		}
	}
}
