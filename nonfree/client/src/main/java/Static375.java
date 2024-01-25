import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "Lclient!wb;")
	public static Class382 aClass382_3;

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "Lclient!kfa;")
	public static Class192 aClass192_2;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "([BI)V")
	public static void method4926(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method8865();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(26) int[] local26 = Static340.anIntArray412 = new int[6];
					local26[0] = local10.method8859();
					local26[1] = local10.method8859();
					local26[2] = local10.method8859();
					local26[3] = local10.method8859();
					local26[4] = local10.method8859();
					local26[5] = local10.method8859();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local14 == 4) {
						local76 = local10.method8865();
						Static244.anIntArray295 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static244.anIntArray295[local81] = local10.method8859();
							if (Static244.anIntArray295[local81] == 65535) {
								Static244.anIntArray295[local81] = -1;
							}
						}
					} else if (local14 == 5) {
						local76 = local10.method8865();
						Static179.anIntArray227 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static179.anIntArray227[local81] = local10.method8859();
							if (Static179.anIntArray227[local81] == 65535) {
								Static179.anIntArray227[local81] = -1;
							}
						}
					}
				}
			}
		}
	}
}
