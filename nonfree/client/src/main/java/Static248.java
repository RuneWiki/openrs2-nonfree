import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jn", name = "O", descriptor = "I")
	public static int anInt4557;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "Lclient!er;")
	public static final Class92 aClass92_2 = new Class92("runescape", 0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[B)V")
	public static void method3988(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(12) int local12 = local8.method4905();
					if (local12 == 0) {
						return;
					}
					if (local12 == 1) {
						@Pc(99) int[] local99 = Static425.anIntArray419 = new int[6];
						local99[0] = local8.method4936();
						local99[1] = local8.method4936();
						local99[2] = local8.method4936();
						local99[3] = local8.method4936();
						local99[4] = local8.method4936();
						local99[5] = local8.method4936();
					} else {
						@Pc(34) int local34;
						@Pc(29) int local29;
						if (local12 == 4) {
							local29 = local8.method4905();
							Static515.anIntArray498 = new int[local29];
							for (local34 = 0; local34 < local29; local34++) {
								Static515.anIntArray498[local34] = local8.method4936();
								if (Static515.anIntArray498[local34] == 65535) {
									Static515.anIntArray498[local34] = -1;
								}
							}
						} else if (local12 == 5) {
							local29 = local8.method4905();
							Static380.anIntArray370 = new int[local29];
							for (local34 = 0; local34 < local29; local34++) {
								Static380.anIntArray370[local34] = local8.method4936();
								if (Static380.anIntArray370[local34] == 65535) {
									Static380.anIntArray370[local34] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)Z")
	public static boolean method3992(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
