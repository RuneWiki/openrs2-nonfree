import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!cfa", name = "P", descriptor = "I")
	private int anInt2209 = 4096;

	@OriginalMember(owner = "client!cfa", name = "Q", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2209 = arg0.method8326();
		} else if (arg1 == 1) {
			this.aBoolean174 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(32) int[] local32 = this.method9156(arg0 - 1 & Static591.anInt6375, 0);
			@Pc(40) int[] local40 = this.method9156(arg0, 0);
			@Pc(50) int[] local50 = this.method9156(Static591.anInt6375 & arg0 + 1, 0);
			@Pc(54) int[] local54 = local11[0];
			@Pc(58) int[] local58 = local11[1];
			@Pc(62) int[] local62 = local11[2];
			for (@Pc(64) int local64 = 0; local64 < Static222.anInt4971; local64++) {
				@Pc(78) int local78 = (local50[local64] - local32[local64]) * this.anInt2209;
				@Pc(97) int local97 = this.anInt2209 * (local40[local64 + 1 & Static620.anInt10845] - local40[Static620.anInt10845 & local64 - 1]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local78 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(132) int local132 = (int) (Math.sqrt((double) ((float) (local111 + local117 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(138) int local138;
				@Pc(142) int local142;
				@Pc(146) int local146;
				if (local132 == 0) {
					local142 = 0;
					local138 = 0;
					local146 = 0;
				} else {
					local138 = local97 / local132;
					local142 = local78 / local132;
					local146 = 16777216 / local132;
				}
				if (this.aBoolean174) {
					local146 = (local146 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
				}
				local54[local64] = local138;
				local58[local64] = local142;
				local62[local64] = local146;
			}
		}
		return local11;
	}
}
