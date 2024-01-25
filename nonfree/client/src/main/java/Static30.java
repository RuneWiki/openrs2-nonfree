import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public static int anInt535;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_12 = new Class231(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
	public static int anInt548 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([IB[III)V")
	public static void method510(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg3) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) int local25 = arg0[local19];
		arg0[local19] = arg0[arg2];
		arg0[arg2] = local25;
		@Pc(39) int local39 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg3; local60 < arg2; local60++) {
			if (arg0[local60] < (local60 & local58) + local25) {
				@Pc(79) int local79 = arg0[local60];
				arg0[local60] = arg0[local21];
				arg0[local21] = local79;
				@Pc(93) int local93 = arg1[local60];
				arg1[local60] = arg1[local21];
				arg1[local21++] = local93;
			}
		}
		arg0[arg2] = arg0[local21];
		arg0[local21] = local25;
		arg1[arg2] = arg1[local21];
		arg1[local21] = local39;
		method510(arg0, arg1, local21 - 1, arg3);
		method510(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
	public static void method513() {
		Static312.anInt5619 = -1;
		Static252.anInt4350 = -1;
		Static293.aBoolean366 = false;
		Static452.anInt951 = 1;
		Static378.aClass171_98 = null;
		Static332.anInt5976 = 2;
		Static389.anInt6735 = 0;
	}
}
