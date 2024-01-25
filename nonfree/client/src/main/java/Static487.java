import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!pha", name = "A", descriptor = "Lclient!uj;")
	public static Class371 aClass371_7;

	@OriginalMember(owner = "client!pha", name = "B", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_147 = new Class186(24, 10);

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(BLclient!eh;Lclient!rba;)Lclient!bba;")
	public static Class22 method7091(@OriginalArg(1) Class91 arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		@Pc(10) Class22 local10 = new Class22(arg0);
		@Pc(22) int local22 = arg1.method5322(-94);
		@Pc(31) boolean local31 = (local22 & 0x1) != 0;
		@Pc(43) boolean local43 = (local22 & 0x2) != 0;
		@Pc(55) boolean local55 = (local22 & 0x4) != 0;
		@Pc(67) boolean local67 = (local22 & 0x8) != 0;
		if (local31) {
			local10.anIntArray42[0] = arg1.method5275();
			local10.anIntArray44[0] = arg1.method5275();
			if (arg0.anInt2699 != -1 || arg0.anInt2728 != -1) {
				local10.anIntArray42[1] = arg1.method5275();
				local10.anIntArray44[1] = arg1.method5275();
			}
			if (arg0.anInt2714 != -1 || arg0.anInt2696 != -1) {
				local10.anIntArray42[2] = arg1.method5275();
				local10.anIntArray44[2] = arg1.method5275();
			}
		}
		if (local43) {
			local10.anIntArray41[0] = arg1.method5275();
			local10.anIntArray43[0] = arg1.method5275();
			if (arg0.anInt2729 != -1 || arg0.anInt2733 != -1) {
				local10.anIntArray41[1] = arg1.method5275();
				local10.anIntArray43[1] = arg1.method5275();
			}
		}
		@Pc(190) int local190;
		@Pc(193) int[] local193;
		@Pc(225) int local225;
		if (local55) {
			local190 = arg1.method5272();
			local193 = new int[] { local190 & 0xF, local190 >> 4 & 0xF, local190 >> 8 & 0xF, local190 >> 12 & 0xF };
			for (local225 = 0; local225 < 4; local225++) {
				if (local193[local225] != 15) {
					local10.aShortArray16[local193[local225]] = (short) arg1.method5272();
				}
			}
		}
		if (local67) {
			local190 = arg1.method5322(-101);
			local193 = new int[] { local190 & 0xF, local190 >> 4 & 0xF };
			for (local225 = 0; local225 < 2; local225++) {
				if (local193[local225] != 15) {
					local10.aShortArray15[local193[local225]] = (short) arg1.method5272();
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(II)I")
	public static int method7093(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 1;
		@Pc(25) int local25 = local19 | local19 >>> 2;
		@Pc(31) int local31 = local25 | local25 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return ~local43 & arg0;
	}
}
