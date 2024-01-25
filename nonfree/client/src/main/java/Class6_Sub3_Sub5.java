import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class6_Sub3_Sub5 extends Class6_Sub3 {

	@OriginalMember(owner = "client!dfa", name = "G", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
	private int anInt1434 = 4096;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(33) int[] local33 = this.method7824(0, arg0 - 1 & Static252.anInt4135);
			@Pc(39) int[] local39 = this.method7824(0, arg0);
			@Pc(49) int[] local49 = this.method7824(0, Static252.anInt4135 & arg0 + 1);
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static447.anInt8568; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt1434;
				@Pc(97) int local97 = (local39[local63 + 1 & Static392.anInt6966] - local39[Static392.anInt6966 & local63 - 1]) * this.anInt1434;
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(140) int local140;
				@Pc(142) int local142;
				@Pc(138) int local138;
				if (local131 == 0) {
					local138 = 0;
					local140 = 0;
					local142 = 0;
				} else {
					local140 = local97 / local131;
					local142 = local77 / local131;
					local138 = 16777216 / local131;
				}
				if (this.aBoolean98) {
					local142 = (local142 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local53[local63] = local140;
				local57[local63] = local142;
				local61[local63] = local138;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1434 = arg1.method6006();
		} else if (arg0 == 1) {
			this.aBoolean98 = arg1.method6041() == 1;
		}
	}
}
