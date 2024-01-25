import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	public static int anInt6132;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "[I")
	public static int[] anIntArray500;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public static int anInt6137;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public static int anInt6133 = 0;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	public static int anInt6136 = -1;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_56 = new Class87(2);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZLclient!bo;IB)V")
	public static void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) int arg4) {
		if (Static225.anInt4698 >= 50 || (arg3 == null || arg3.anIntArrayArray8 == null || arg4 >= arg3.anIntArrayArray8.length || arg3.anIntArrayArray8[arg4] == null)) {
			return;
		}
		@Pc(36) int local36 = arg3.anIntArrayArray8[arg4][0];
		@Pc(45) int local45 = local36 >> 8;
		@Pc(51) int local51 = local36 >> 5 & 0x7;
		@Pc(55) int local55 = local36 & 0x1F;
		@Pc(72) int local72;
		if (arg3.anIntArrayArray8[arg4].length > 1) {
			local72 = (int) ((double) arg3.anIntArrayArray8[arg4].length * Math.random());
			if (local72 > 0) {
				local45 = arg3.anIntArrayArray8[arg4][local72];
			}
		}
		if (local55 == 0) {
			if (arg2) {
				Static139.method4229(local51, local45, 255, 0);
			}
		} else if (Static114.anInt4335 != 0) {
			Static235.anIntArray432[Static225.anInt4698] = local45;
			Static9.anIntArray33[Static225.anInt4698] = local51;
			Static67.anIntArray181[Static225.anInt4698] = 0;
			Static289.aClass77Array2[Static225.anInt4698] = null;
			Static114.anIntArray397[Static225.anInt4698] = 255;
			local72 = (arg0 - 64) / 128;
			@Pc(133) int local133 = (arg1 - 64) / 128;
			Static185.anIntArray363[Static225.anInt4698] = local55 + (local133 << 8) + (local72 << 16);
			Static225.anInt4698++;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([B[[B[[B[III[II)I")
	public static int method5217(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3[arg4];
		@Pc(15) int local15 = local9 + arg5[arg4];
		@Pc(19) int local19 = arg3[arg6];
		@Pc(25) int local25 = local19 + arg5[arg6];
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local25 < local15) {
			local34 = local25;
		}
		@Pc(49) int local49 = arg0[arg4] & 0xFF;
		if ((arg0[arg6] & 0xFF) < local49) {
			local49 = arg0[arg6] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg1[arg4];
		@Pc(70) byte[] local70 = arg2[arg6];
		@Pc(75) int local75 = local27 - local9;
		@Pc(79) int local79 = local27 - local19;
		for (@Pc(81) int local81 = local27; local81 < local34; local81++) {
			@Pc(94) int local94 = local66[local75++] + local70[local79++];
			if (local94 < local49) {
				local49 = local94;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
	public static boolean method5218() {
		if (Static148.aBoolean313) {
			try {
				if ((Boolean) Static359.method1280(Static15.aClass143_1.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}
}
