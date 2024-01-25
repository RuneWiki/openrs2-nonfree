import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "Z")
	public static boolean aBoolean697;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[128][128];

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Z")
	public static boolean method8467() {
		Static351.aBoolean386 = true;
		Static682.anInt10922++;
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!nda;Lclient!wq;)Lclient!jo;")
	public static Class192 method8470(@OriginalArg(1) Class246 arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		@Pc(10) Class192 local10 = new Class192(arg0);
		@Pc(14) int local14 = arg1.method7291();
		@Pc(23) boolean local23 = (local14 & 0x1) != 0;
		@Pc(35) boolean local35 = (local14 & 0x2) != 0;
		@Pc(47) boolean local47 = (local14 & 0x4) != 0;
		@Pc(63) boolean local63 = (local14 & 0x8) != 0;
		if (local23) {
			local10.anIntArray267[0] = arg1.method7320();
			local10.anIntArray270[0] = arg1.method7320();
			if (arg0.anInt6487 != -1 || arg0.anInt6505 != -1) {
				local10.anIntArray267[1] = arg1.method7320();
				local10.anIntArray270[1] = arg1.method7320();
			}
			if (arg0.lb != -1 || arg0.anInt6519 != -1) {
				local10.anIntArray267[2] = arg1.method7320();
				local10.anIntArray270[2] = arg1.method7320();
			}
		}
		if (local35) {
			local10.anIntArray269[0] = arg1.method7320();
			local10.anIntArray268[0] = arg1.method7320();
			if (arg0.anInt6503 != -1 || arg0.anInt6482 != -1) {
				local10.anIntArray269[1] = arg1.method7320();
				local10.anIntArray268[1] = arg1.method7320();
			}
		}
		@Pc(186) int local186;
		@Pc(189) int[] local189;
		@Pc(221) int local221;
		if (local47) {
			local186 = arg1.method7333();
			local189 = new int[] { local186 & 0xF, local186 >> 4 & 0xF, local186 >> 8 & 0xF, local186 >> 12 & 0xF };
			for (local221 = 0; local221 < 4; local221++) {
				if (local189[local221] != 15) {
					local10.aShortArray61[local189[local221]] = (short) arg1.method7333();
				}
			}
		}
		if (local63) {
			local186 = arg1.method7291();
			local189 = new int[] { local186 & 0xF, local186 >> 4 & 0xF };
			for (local221 = 0; local221 < 2; local221++) {
				if (local189[local221] != 15) {
					local10.aShortArray60[local189[local221]] = (short) arg1.method7333();
				}
			}
		}
		return local10;
	}
}
