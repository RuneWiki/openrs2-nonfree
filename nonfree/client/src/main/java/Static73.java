import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public static int anInt1144;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_32 = new Class136(9, 2);

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "[I")
	public static final int[] anIntArray99 = new int[3];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B)V")
	public static void method1169(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class5_Sub12 local14 = new Class5_Sub12(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method8645();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(31) int[] local31 = Static582.anIntArray753 = new int[6];
					local31[0] = local14.method8631();
					local31[1] = local14.method8631();
					local31[2] = local14.method8631();
					local31[3] = local14.method8631();
					local31[4] = local14.method8631();
					local31[5] = local14.method8631();
				} else {
					@Pc(81) int local81;
					@Pc(86) int local86;
					if (local18 == 4) {
						local81 = local14.method8645();
						Static74.anIntArray100 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static74.anIntArray100[local86] = local14.method8631();
							if (Static74.anIntArray100[local86] == 65535) {
								Static74.anIntArray100[local86] = -1;
							}
						}
					} else if (local18 == 5) {
						local81 = local14.method8645();
						Static520.anIntArray677 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static520.anIntArray677[local86] = local14.method8631();
							if (Static520.anIntArray677[local86] == 65535) {
								Static520.anIntArray677[local86] = -1;
							}
						}
					}
				}
			}
		}
	}
}
