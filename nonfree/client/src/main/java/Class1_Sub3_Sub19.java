import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
	private int anInt4997 = 4096;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "Z")
	private boolean aBoolean372 = true;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4997 = arg1.method4494();
		} else if (arg0 == 1) {
			this.aBoolean372 = arg1.method4487() == 1;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(30) int[] local30 = this.method8201(0, arg0 - 1 & Static109.anInt2298);
			@Pc(36) int[] local36 = this.method8201(0, arg0);
			@Pc(46) int[] local46 = this.method8201(0, Static109.anInt2298 & arg0 + 1);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static254.anInt4973; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt4997;
				@Pc(93) int local93 = (local36[Static184.anInt3830 & local60 + 1] - local36[Static184.anInt3830 & local60 - 1]) * this.anInt4997;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local107 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(142) int local142;
				@Pc(134) int local134;
				@Pc(138) int local138;
				if (local128 == 0) {
					local142 = 0;
					local134 = 0;
					local138 = 0;
				} else {
					local134 = local73 / local128;
					local138 = 16777216 / local128;
					local142 = local93 / local128;
				}
				if (this.aBoolean372) {
					local142 = (local142 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
				}
				local50[local60] = local142;
				local54[local60] = local134;
				local58[local60] = local138;
			}
		}
		return local11;
	}
}
