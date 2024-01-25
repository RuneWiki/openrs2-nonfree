import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
	public static int anInt6857;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_104 = new Class40("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLjava/awt/Component;)Lclient!aq;")
	public static Class18 method5587(@OriginalArg(1) Component arg0) {
		return new Class18_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)I")
	public static int method5588(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I")
	public static int method5590(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(III)V")
	public static void method5591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static525.aClass155_4 == Static53.aClass155_1) {
			if (!Static534.method7283(arg1, 0, -2, 0, arg0, 1, false, 1)) {
				Static534.method7283(arg1, 0, -3, 0, arg0, 1, false, 1);
			}
		} else if (!Static534.method7283(arg1, 0, -3, 0, arg0, 1, false, 1)) {
			Static534.method7283(arg1, 0, -2, 0, arg0, 1, false, 1);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII)V")
	public static void method5592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static418.method6023(Static4.anInt6709, arg3, Static492.anInt8451);
		@Pc(17) int local17 = Static418.method6023(Static4.anInt6709, arg0, Static492.anInt8451);
		@Pc(23) int local23 = Static418.method6023(Static398.anInt7144, arg1, Static71.anInt4958);
		@Pc(29) int local29 = Static418.method6023(Static398.anInt7144, arg2, Static71.anInt4958);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static321.method5153(arg4, local23, Static352.anIntArrayArray51[local31], local29);
		}
	}
}
