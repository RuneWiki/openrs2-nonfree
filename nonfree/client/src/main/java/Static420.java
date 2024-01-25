import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "Z")
	public static boolean aBoolean502 = true;

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "[I")
	public static final int[] anIntArray367 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "[I")
	public static final int[] anIntArray368 = new int[32];

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!fr;I)I")
	public static int method6288(@OriginalArg(0) Class4_Sub3_Sub3_Sub3_Sub1 arg0) {
		@Pc(6) Class362 local6 = arg0.aClass362_1;
		if (local6.lb != null) {
			local6 = local6.method8641(Static188.aClass238_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local6.anInt10099;
		@Pc(26) Class141 local26 = arg0.method2865();
		@Pc(31) int local31 = arg0.aClass181_7.method8959();
		if (local31 == -1 || arg0.aBoolean236) {
			local22 = local6.anInt10101;
		} else if (local31 == local26.anInt3543 || local26.anInt3560 == local31 || local26.anInt3530 == local31 || local26.anInt3559 == local31) {
			local22 = local6.anInt10094;
		} else if (local31 == local26.anInt3562 || local26.anInt3563 == local31 || local26.anInt3536 == local31 || local26.anInt3528 == local31) {
			local22 = local6.anInt10068;
		}
		return local22;
	}
}
