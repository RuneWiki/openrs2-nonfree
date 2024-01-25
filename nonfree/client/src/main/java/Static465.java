import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!za", name = "p", descriptor = "Lclient!oi;")
	public static Class185 aClass185_117;

	@OriginalMember(owner = "client!za", name = "h", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_116 = new Class142("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!za", name = "q", descriptor = "[I")
	public static final int[] anIntArray520 = new int[32];

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IBILclient!fu;ILclient!za;)V")
	public static void method5669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class87 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class117 arg4) {
		@Pc(9) Class266 local9 = Static60.aClass223_1.method4705(arg2.anInt1944);
		if (local9.anInt6915 == -1) {
			return;
		}
		if (arg2.aBoolean213) {
			@Pc(26) int local26 = arg1 + arg2.anInt1940;
			arg1 = local26 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(38) Class85 local38 = local9.method5498(arg2.aBoolean211, arg4, arg1);
		if (local38 == null) {
			return;
		}
		@Pc(49) int local49 = arg2.anInt1916;
		@Pc(52) int local52 = arg2.anInt1959;
		if ((arg1 & 0x1) == 1) {
			local49 = arg2.anInt1959;
			local52 = arg2.anInt1916;
		}
		@Pc(68) int local68 = local38.RA();
		@Pc(71) int local71 = local38.Q();
		if (local9.aBoolean599) {
			local71 = local52 * 4;
			local68 = local49 * 4;
		}
		if (local9.anInt6913 == 0) {
			local38.method5405(arg0, arg3 - (local52 - 1) * 4, local68, local71);
		} else {
			local38.ya(arg0, arg3 - (local52 - 1) * 4, local68, local71, 0, local9.anInt6913 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(III)Z")
	public static boolean method5681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(III)Z")
	public static boolean method5695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIZ)I")
	public static int method5705(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub28 local14 = Static133.method1698(false, arg0);
		if (local14 == null) {
			return Static130.aClass74_1.method1236(arg0).anInt1032;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray291.length; local26++) {
			if (local14.anIntArray291[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static130.aClass74_1.method1236(arg0).anInt1032 - local14.anIntArray291.length;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!l;Lclient!nt;I)Lclient!za;")
	public static synchronized Class117 method5715(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class177 arg4) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static269.aBooleanArray105[local14]) {
				local12 = local14;
				break;
			}
		}
		if (local12 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(54) Class117 local54;
		if (arg2 == 0) {
			local54 = Static279.method3750(arg1, local12, arg3);
		} else if (arg2 == 1) {
			local54 = Static99.method1160(arg3, local12, arg1, arg4, arg0);
		} else if (arg2 == 2) {
			local54 = Static448.method5772(arg3, local12, arg4, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static269.aBooleanArray105[local12] = true;
		return local54;
	}
}
