import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!pt", name = "N", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!pt", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!pt", name = "W", descriptor = "Lclient!te;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!pt", name = "T", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_136 = new Class163(53, 4);

	@OriginalMember(owner = "client!pt", name = "V", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_137 = new Class163(11, 16);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([[B[[BIZ[I[BI[I)I")
	public static int method4556(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg5];
		@Pc(15) int local15 = local9 + arg3[arg5];
		@Pc(19) int local19 = arg6[arg2];
		@Pc(25) int local25 = arg3[arg2] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(45) int local45 = arg4[arg5] & 0xFF;
		if ((arg4[arg2] & 0xFF) < local45) {
			local45 = arg4[arg2] & 0xFF;
		}
		@Pc(62) byte[] local62 = arg1[arg5];
		@Pc(71) byte[] local71 = arg0[arg2];
		@Pc(76) int local76 = local27 - local9;
		@Pc(80) int local80 = local27 - local19;
		for (@Pc(82) int local82 = local27; local82 < local34; local82++) {
			@Pc(94) int local94 = local71[local80++] + local62[local76++];
			if (local94 < local45) {
				local45 = local94;
			}
		}
		return -local45;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
	public static void method4557(@OriginalArg(1) int arg0) {
		Static320.anInt1179 = arg0;
		@Pc(11) Class268 local11 = Static438.aClass268_24;
		synchronized (Static438.aClass268_24) {
			Static438.aClass268_24.method6160();
		}
		local11 = Static13.aClass268_2;
		synchronized (Static13.aClass268_2) {
			Static13.aClass268_2.method6160();
		}
	}
}
