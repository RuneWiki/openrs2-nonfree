import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString138;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_358 = new Class179(34, 2);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method8636() {
		Static485.anInt8287 = 0;
		Static373.anInt6316 = Static655.anInt10510;
		Static242.anInt4294 = 0;
		Static121.aClass379Array1 = new Class379[500];
		Static33.anInt812 = 0;
		Static642.aClass379Array4 = new Class379[2000];
		Static383.aBoolean424 = false;
		Static188.anIntArrayArrayArray16 = new int[Static633.anInt10310][Static209.anInt3602 + 1][Static245.anInt4308 + 1];
		Static414.aClass379Array2 = new Class379[1000];
		Static288.anInt4888 = 0;
		Static527.aClass379Array3 = new Class379[500];
		Static218.anInt3724 = Static655.anInt10510;
		if (Static576.aClass132_15 instanceof oa) {
			Static267.aBoolean292 = false;
		} else {
			Static267.aBoolean292 = true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)I")
	public static int method8638(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public static void method8639() {
		for (@Pc(12) int local12 = 0; local12 < Static415.anInt7233; local12++) {
			@Pc(23) int local23 = Static340.method5004(Static604.anInt4516 + local12, Static415.anInt7233) * Static519.anInt8647;
			for (@Pc(25) int local25 = 0; local25 < Static519.anInt8647; local25++) {
				@Pc(36) int local36 = local23 + Static340.method5004(Static622.anInt10138 + local25, Static519.anInt8647);
				if (Static309.anIntArray138[local36] == Static281.anInt4834) {
					Static155.anInterface16Array1[local36].method8877(0, 0, Static208.anInt3594, Static263.anInt4574, local25 * Static208.anInt3594, Static263.anInt4574 * local12);
				}
			}
		}
	}
}
