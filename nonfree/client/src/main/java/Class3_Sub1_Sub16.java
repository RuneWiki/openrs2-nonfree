import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kaa", name = "I", descriptor = "I")
	private int anInt4975 = 4096;

	@OriginalMember(owner = "client!kaa", name = "J", descriptor = "Z")
	private boolean aBoolean388 = true;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4975 = arg0.method3109();
		} else if (arg1 == 1) {
			this.aBoolean388 = arg0.method3118() == 1;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(30) int[] local30 = this.method7765(0, arg0 - 1 & Static469.anInt7679);
			@Pc(36) int[] local36 = this.method7765(0, arg0);
			@Pc(46) int[] local46 = this.method7765(0, arg0 + 1 & Static469.anInt7679);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static206.anInt4182; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt4975;
				@Pc(93) int local93 = this.anInt4975 * (local36[Static439.anInt7283 & local60 + 1] - local36[local60 - 1 & Static439.anInt7283]);
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local74 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local107 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(145) int local145;
				@Pc(141) int local141;
				if (local128 == 0) {
					local145 = 0;
					local141 = 0;
					local137 = 0;
				} else {
					local137 = local93 / local128;
					local141 = 16777216 / local128;
					local145 = local74 / local128;
				}
				if (this.aBoolean388) {
					local137 = (local137 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
				}
				local50[local60] = local137;
				local54[local60] = local145;
				local58[local60] = local141;
			}
		}
		return local16;
	}
}
