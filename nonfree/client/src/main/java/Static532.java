import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!st", name = "e", descriptor = "Lclient!sca;")
	public static Class304 aClass304_8;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "[I")
	public static final int[] anIntArray576 = new int[25];

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIILclient!ha;II)V")
	public static void method7798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) int arg4) {
		arg3.KA(arg1, arg2, arg4 + arg1, arg0 + arg2);
		arg3.method7528(arg1, arg0, arg4, arg2, -16777216);
		if (Static368.anInt6962 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static110.anInt3020 / (float) Static110.anInt3019;
		@Pc(35) int local35 = arg4;
		@Pc(37) int local37 = arg0;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg4);
		} else {
			local35 = (int) ((float) arg0 / local33);
		}
		@Pc(63) int local63 = arg2 + (arg0 - local37) / 2;
		@Pc(72) int local72 = arg1 + (arg4 - local35) / 2;
		if (Static199.aClass24_12 == null || Static199.aClass24_12.method8558() != arg4 || Static199.aClass24_12.method8578() != arg0) {
			Static110.method2798(Static110.anInt3014, Static110.anInt3012 + Static110.anInt3020, Static110.anInt3014 + Static110.anInt3019, Static110.anInt3012, local72, local63, local72 + local35, local63 + local37);
			Static110.method2803(arg3);
			Static199.aClass24_12 = arg3.method7545(local72, local63, local35, local37, false);
		}
		Static199.aClass24_12.method8559(local72, local63);
		@Pc(125) int local125 = Static44.anInt1312 * local35 / Static110.anInt3019;
		@Pc(131) int local131 = local37 * Static149.anInt2952 / Static110.anInt3020;
		@Pc(139) int local139 = Static396.anInt6640 * local35 / Static110.anInt3019 + local72;
		@Pc(153) int local153 = local37 + local63 - Static366.anInt6950 * local37 / Static110.anInt3020 - local131;
		@Pc(155) int local155 = -1996554240;
		if (Static542.aClass222_7 == Static212.aClass222_2) {
			local155 = -1996488705;
		}
		arg3.aa(local139, local153, local125, local131, local155, 1);
		arg3.method7506(local139, local153, local125, local131, local155, 0);
		if (Static238.anInt4463 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static165.anInt3234 > 50) {
			local193 = (100 - Static165.anInt3234) * 5;
		} else {
			local193 = Static165.anInt3234 * 5;
		}
		for (@Pc(204) Class3_Sub49 local204 = (Class3_Sub49) Static110.aClass223_15.method5874(); local204 != null; local204 = (Class3_Sub49) Static110.aClass223_15.method5870()) {
			@Pc(214) Class36 local214 = Static110.aClass335_4.method8125(local204.anInt9434);
			if (Static115.method2359(local214)) {
				@Pc(235) int local235;
				@Pc(246) int local246;
				if (local204.anInt9434 == Static619.anInt10018) {
					local235 = local204.anInt9439 * local35 / Static110.anInt3019 + local72;
					local246 = local63 + (Static110.anInt3020 - local204.anInt9437) * local37 / Static110.anInt3020;
					arg3.method7528(local235 - 2, 4, 4, local246 - 2, local193 << 24 | 0xFFFF00);
				} else if (Static109.anInt2368 != -1 && Static109.anInt2368 == local214.anInt1351) {
					local235 = local35 * local204.anInt9439 / Static110.anInt3019 + local72;
					local246 = local37 * (Static110.anInt3020 - local204.anInt9437) / Static110.anInt3020 + local63;
					arg3.method7528(local235 - 2, 4, 4, local246 - 2, local193 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
