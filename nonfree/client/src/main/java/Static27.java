import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
	public static int anInt793 = -1;

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_2 = new Class387(6, 0, 4, 2);

	@OriginalMember(owner = "client!ar", name = "R", descriptor = "Z")
	public static volatile boolean aBoolean72 = true;

	@OriginalMember(owner = "client!ar", name = "S", descriptor = "[Lclient!jo;")
	public static final Class198[] aClass198Array1 = new Class198[4];

	@OriginalMember(owner = "client!ar", name = "T", descriptor = "[Lclient!ija;")
	public static final Class3_Sub6_Sub11[] aClass3_Sub6_Sub11Array2 = new Class3_Sub6_Sub11[14];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method839(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static121.anInt2381; local9++) {
			if (arg0.equalsIgnoreCase(Static260.aStringArray36[local9])) {
				return local9;
			}
		}
		return -1;
	}
}
