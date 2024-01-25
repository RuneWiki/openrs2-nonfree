import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	public static int anInt8405 = -1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public static void method6588(@OriginalArg(1) int arg0) {
		Static466.anInt8098 = -1;
		Static79.anInt2117 = arg0;
		Static82.anInt9708 = -1;
		Static277.method4203();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[B)V")
	public static void method6589(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub26 local10 = new Class3_Sub26(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method6814();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(27) int[] local27 = Static484.anIntArray499 = new int[6];
					local27[0] = local10.method6811();
					local27[1] = local10.method6811();
					local27[2] = local10.method6811();
					local27[3] = local10.method6811();
					local27[4] = local10.method6811();
					local27[5] = local10.method6811();
				} else {
					@Pc(72) int local72;
					@Pc(77) int local77;
					if (local14 == 4) {
						local72 = local10.method6814();
						Static590.anIntArray599 = new int[local72];
						for (local77 = 0; local77 < local72; local77++) {
							Static590.anIntArray599[local77] = local10.method6811();
							if (Static590.anIntArray599[local77] == 65535) {
								Static590.anIntArray599[local77] = -1;
							}
						}
					} else if (local14 == 5) {
						local72 = local10.method6814();
						Static48.anIntArray38 = new int[local72];
						for (local77 = 0; local77 < local72; local77++) {
							Static48.anIntArray38[local77] = local10.method6811();
							if (Static48.anIntArray38[local77] == 65535) {
								Static48.anIntArray38[local77] = -1;
							}
						}
					}
				}
			}
		}
	}
}
