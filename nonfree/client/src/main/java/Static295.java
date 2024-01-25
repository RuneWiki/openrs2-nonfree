import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!oq", name = "nd", descriptor = "I")
	public static int anInt4969;

	@OriginalMember(owner = "client!oq", name = "Hc", descriptor = "[I")
	public static final int[] anIntArray262 = new int[1000];

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "(I)V")
	public static void method3873() {
		if (Static402.aBoolean533) {
			return;
		}
		Static329.method4204(Static276.aClass82ArrayArrayArray3);
		if (Static55.aClass82ArrayArrayArray1 != null) {
			Static329.method4204(Static55.aClass82ArrayArrayArray1);
		}
		Static402.aBoolean533 = true;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(II)Lclient!ne;")
	public static Class166 method3875(@OriginalArg(0) int arg0) {
		@Pc(13) Class166[] local13 = Static382.method4887();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class166 local21 = local13[local15];
			if (arg0 == local21.anInt4193) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(II)Lclient!go;")
	public static Class97 method3883(@OriginalArg(1) int arg0) {
		@Pc(8) Class97[] local8 = Static54.method831();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt2350) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "(B)V")
	public static void method3884() {
		Static315.anImage2 = null;
		Static288.aFont1 = null;
	}
}
