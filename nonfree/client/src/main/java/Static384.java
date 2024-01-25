import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	public static int anInt7232 = 0;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
	public static int anInt7234 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)I")
	public static int method6053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = (arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00 | arg0 * (arg2 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg0;
		return ((local31 * (arg1 & 0xFF00) & 0xFF0000 | local31 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	public static void method6054() {
		Static125.aClass302Array1 = null;
		if (Static238.aBoolean425 && Static326.method5447() != 1) {
			Static165.method3160(0, 0, Static262.method4629(), Static333.anInt6626 == 3 || Static333.anInt6626 == 7, Static583.method8074());
		}
		@Pc(34) int local34 = 0;
		@Pc(44) int local44 = 0;
		if (Static238.aBoolean425) {
			local34 = Static352.method5739();
			local44 = Static573.method7997();
		}
		Static560.method7881(local44 + Static277.anInt5899, -1, local44, Static30.anInt830, local44, local34, Static294.anInt6026 + local34, local34);
		if (Static125.aClass302Array1 != null) {
			Static395.method6254(-1412584499, Static115.anInt2987, local34, local44, Static352.aClass302_9.anInt8861, Static125.aClass302Array1, Static294.anInt6026 + local34, local44 + Static277.anInt5899, true, Static92.anInt2698);
			Static125.aClass302Array1 = null;
		}
	}
}
