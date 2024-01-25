import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "[I")
	public static int[] anIntArray549;

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_101 = new Class25(21, 3);

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
	public static int anInt6251 = -1;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public static void method5218(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static125.anInt2225 - Static404.anInt6767;
		if (local7 >= 100) {
			Static9.anInt164 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static367.aFloat104;
		if (local18 < Static249.anInt4245 >> 8) {
			local18 = Static249.anInt4245 >> 8;
		}
		if (Static186.aBooleanArray16[4] && local18 < Static428.anIntArray615[4] + 128) {
			local18 = Static428.anIntArray615[4] + 128;
		}
		@Pc(60) int local60 = (int) Static397.aFloat99 + Static59.anInt1235 & 0x3FFF;
		Static369.method5140(Static165.method2689(Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675, Static4.anInt30, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677) - 50, Static153.anInt2718, Static237.anInt4066, local60, arg0, local18, (local18 >> 3) * 3 + 600 << 0);
		@Pc(105) float local105 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static214.anInt3730 = (int) ((float) Static279.anInt4749 + (float) (Static214.anInt3730 - Static279.anInt4749) * local105);
		Static354.anInt5973 = (int) (local105 * (float) (Static354.anInt5973 - Static353.anInt5950) + (float) Static353.anInt5950);
		Static32.anInt521 = (int) ((float) (Static32.anInt521 - Static296.anInt4935) * local105 + (float) Static296.anInt4935);
		Static303.anInt4990 = (int) (local105 * (float) (Static303.anInt4990 - Static170.anInt1728) + (float) Static170.anInt1728);
		@Pc(156) int local156 = Static217.anInt3768 - Static248.anInt4202;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static217.anInt3768 = (int) ((float) local156 * local105 + (float) Static248.anInt4202);
		Static217.anInt3768 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5219(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static459.method5354(arg0, 0, local9, 0, local6);
		return local9;
	}
}
