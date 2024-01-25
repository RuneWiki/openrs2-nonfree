import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
	public static int anInt4594;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "[I")
	public static final int[] anIntArray389 = new int[6];

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	public static int anInt4598 = -1;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
	public static int anInt4601 = 0;

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "[S")
	public static final short[] aShortArray71 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([IZ)Ljava/lang/String;")
	public static String method3806(@OriginalArg(0) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = anInt4594;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(19) Class56 local19 = Static28.aClass239_1.method5342(arg0[local11]);
			if (local19.anInt1798 != -1) {
				@Pc(31) Class143 local31 = (Class143) Static452.aClass134_59.method3266((long) local19.anInt1798);
				if (local31 == null) {
					@Pc(39) Class51 local39 = Static461.method1450(Static345.aClass246_187, local19.anInt1798, 0);
					if (local39 != null) {
						local31 = Static415.aClass39_11.method4549(local39);
						Static452.aClass134_59.method3263((long) local19.anInt1798, local31);
					}
				}
				if (local31 != null) {
					Static212.aClass143Array6[local9] = local31;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[F)[F")
	public static float[] method3807(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(14) float[] local14 = new float[arg0];
		Static468.method4334(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
