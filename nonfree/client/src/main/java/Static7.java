import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(B)Z")
	public static boolean method109() {
		@Pc(12) boolean local12 = true;
		if (Static135.aClass370_2 == null) {
			if (Static142.aClass362_32.method8365(Static515.anInt8111)) {
				Static135.aClass370_2 = Static688.method8604(Static142.aClass362_32, Static515.anInt8111);
			} else {
				local12 = false;
			}
		}
		if (Static181.aClass370_3 == null) {
			if (Static142.aClass362_32.method8365(Static148.anInt2728)) {
				Static181.aClass370_3 = Static688.method8604(Static142.aClass362_32, Static148.anInt2728);
			} else {
				local12 = false;
			}
		}
		if (Static34.aClass370_1 == null) {
			if (Static142.aClass362_32.method8365(Static280.anInt4770)) {
				Static34.aClass370_1 = Static688.method8604(Static142.aClass362_32, Static280.anInt4770);
			} else {
				local12 = false;
			}
		}
		if (Static503.aClass91_11 == null) {
			if (Static583.aClass362_138.method8365(Static389.anInt6495)) {
				Static503.aClass91_11 = Static473.method6301(Static389.anInt6495, Static583.aClass362_138);
			} else {
				local12 = false;
			}
		}
		if (Static434.aClass370Array1 == null) {
			if (Static142.aClass362_32.method8365(Static389.anInt6495)) {
				Static434.aClass370Array1 = Static688.method8599(Static142.aClass362_32, Static389.anInt6495);
			} else {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)I")
	public static int method110(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static356.anInt6077 - 1; local3++) {
			if (arg0 < Static366.anIntArray331[local3] + Static141.anIntArray146[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static356.anInt6077 - 1;
		}
		return local1;
	}
}
