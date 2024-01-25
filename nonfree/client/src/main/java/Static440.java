import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[B)V")
	public static void method6430(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class5_Sub41 local14 = new Class5_Sub41(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method7816();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(33) int[] local33 = Static285.anIntArray309 = new int[6];
					local33[0] = local14.method7860();
					local33[1] = local14.method7860();
					local33[2] = local14.method7860();
					local33[3] = local14.method7860();
					local33[4] = local14.method7860();
					local33[5] = local14.method7860();
				} else {
					@Pc(83) int local83;
					@Pc(88) int local88;
					if (local18 == 4) {
						local83 = local14.method7816();
						Static10.anIntArray11 = new int[local83];
						for (local88 = 0; local88 < local83; local88++) {
							Static10.anIntArray11[local88] = local14.method7860();
							if (Static10.anIntArray11[local88] == 65535) {
								Static10.anIntArray11[local88] = -1;
							}
						}
					} else if (local18 == 5) {
						local83 = local14.method7816();
						Static223.anIntArray205 = new int[local83];
						for (local88 = 0; local88 < local83; local88++) {
							Static223.anIntArray205[local88] = local14.method7860();
							if (Static223.anIntArray205[local88] == 65535) {
								Static223.anIntArray205[local88] = -1;
							}
						}
					}
				}
			}
		}
	}
}
