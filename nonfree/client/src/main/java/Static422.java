import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
	public static int anInt7185;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
	public static final int anInt7182 = 1337;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BIII)Z")
	public static boolean method6374(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static592.aBoolean843 || !Static157.aBoolean242) {
			return false;
		} else if (Static525.anInt8753 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static471.anIntArrayArrayArray11[arg0][arg1][arg2];
			if (-Static650.anInt10507 == local22) {
				return false;
			} else if (Static650.anInt10507 == local22) {
				return true;
			} else if (Static327.aClass40Array2 == Static299.aClass40Array1) {
				return false;
			} else {
				@Pc(55) int local55 = arg1 << Static162.anInt2830;
				@Pc(59) int local59 = arg2 << Static162.anInt2830;
				if (Static275.method7486(local55 + 1, local55 + -1 + Static407.anInt7012, Static299.aClass40Array1[arg0].method8442(arg1, arg2), local55 + 1, Static299.aClass40Array1[arg0].method8442(arg1, arg2 + 1), local59 + Static407.anInt7012 - 1, Static299.aClass40Array1[arg0].method8442(arg1 + 1, arg2 - -1), Static407.anInt7012 + local59 - 1, local59 + 1) && Static275.method7486(local55 + 1, local55 + -1 + Static407.anInt7012, Static299.aClass40Array1[arg0].method8442(arg1, arg2), local55 + Static407.anInt7012 - 1, Static299.aClass40Array1[arg0].method8442(arg1 + 1, arg2 - -1), local59 + Static407.anInt7012 - 1, Static299.aClass40Array1[arg0].method8442(arg1 + 1, arg2), local59 + 1, local59 + 1)) {
					Static148.anInt4147++;
					Static471.anIntArrayArrayArray11[arg0][arg1][arg2] = Static650.anInt10507;
					return true;
				} else {
					Static471.anIntArrayArrayArray11[arg0][arg1][arg2] = -Static650.anInt10507;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(FIIFFILclient!cq;IIFIF[B)V")
	public static void method6376(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) Class61 arg3, @OriginalArg(7) int arg4, @OriginalArg(9) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) byte[] arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static573.method8133(arg7, arg6, arg0, arg1, arg2, arg5, local3, arg4, arg3);
			arg4 += 16384;
		}
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(B)Z")
	public static boolean method6377() {
		@Pc(7) boolean local7 = true;
		if (Static599.aClass176_3 == null) {
			if (Static488.aClass384_112.method8883(Static486.anInt8092)) {
				Static599.aClass176_3 = Static654.method4049(Static488.aClass384_112, Static486.anInt8092);
			} else {
				local7 = false;
			}
		}
		if (Static544.aClass176_2 == null) {
			if (Static488.aClass384_112.method8883(Static474.anInt7947)) {
				Static544.aClass176_2 = Static654.method4049(Static488.aClass384_112, Static474.anInt7947);
			} else {
				local7 = false;
			}
		}
		if (Static517.aClass176_1 == null) {
			if (Static488.aClass384_112.method8883(Static614.anInt10021)) {
				Static517.aClass176_1 = Static654.method4049(Static488.aClass384_112, Static614.anInt10021);
			} else {
				local7 = false;
			}
		}
		if (Static26.aClass298_3 == null) {
			if (Static288.aClass384_72.method8883(Static456.anInt7732)) {
				Static26.aClass298_3 = Static7.method166(Static288.aClass384_72, Static456.anInt7732);
			} else {
				local7 = false;
			}
		}
		if (Static64.aClass176Array1 == null) {
			if (Static488.aClass384_112.method8883(Static456.anInt7732)) {
				Static64.aClass176Array1 = Static654.method4058(Static488.aClass384_112, Static456.anInt7732);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
