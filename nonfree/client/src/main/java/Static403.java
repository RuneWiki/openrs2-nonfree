import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
	public static int anInt6917;

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
	public static int anInt6918 = -2;

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_162 = new Class81(55, 8);

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B[B)V")
	public static void method5687(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class1_Sub20 local14 = new Class1_Sub20(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method4393();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(31) int[] local31 = Static317.anIntArray365 = new int[6];
					local31[0] = local14.method4426();
					local31[1] = local14.method4426();
					local31[2] = local14.method4426();
					local31[3] = local14.method4426();
					local31[4] = local14.method4426();
					local31[5] = local14.method4426();
				} else {
					@Pc(86) int local86;
					@Pc(91) int local91;
					if (local18 == 4) {
						local86 = local14.method4393();
						Static416.anIntArray487 = new int[local86];
						for (local91 = 0; local91 < local86; local91++) {
							Static416.anIntArray487[local91] = local14.method4426();
							if (Static416.anIntArray487[local91] == 65535) {
								Static416.anIntArray487[local91] = -1;
							}
						}
					} else if (local18 == 5) {
						local86 = local14.method4393();
						Static106.anIntArray129 = new int[local86];
						for (local91 = 0; local91 < local86; local91++) {
							Static106.anIntArray129[local91] = local14.method4426();
							if (Static106.anIntArray129[local91] == 65535) {
								Static106.anIntArray129[local91] = -1;
							}
						}
					}
				}
			}
		}
	}
}
