import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class6_Sub1_Sub20 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
	private int anInt6699 = 4096;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "Z")
	private boolean aBoolean530 = true;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6699 = arg1.method8220();
		} else if (arg0 == 1) {
			this.aBoolean530 = arg1.method8246() == 1;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(30) int[] local30 = this.method8731(arg0 - 1 & Static117.anInt3013, 0);
			@Pc(36) int[] local36 = this.method8731(arg0, 0);
			@Pc(46) int[] local46 = this.method8731(Static117.anInt3013 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static53.anInt1787; local60++) {
				@Pc(73) int local73 = this.anInt6699 * (local46[local60] - local30[local60]);
				@Pc(93) int local93 = (local36[local60 + 1 & Static564.anInt9697] - local36[local60 - 1 & Static564.anInt9697]) * this.anInt6699;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(141) int local141;
				@Pc(137) int local137;
				if (local127 == 0) {
					local137 = 0;
					local133 = 0;
					local141 = 0;
				} else {
					local133 = local93 / local127;
					local137 = 16777216 / local127;
					local141 = local73 / local127;
				}
				if (this.aBoolean530) {
					local133 = (local133 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local50[local60] = local133;
				local54[local60] = local141;
				local58[local60] = local137;
			}
		}
		return local16;
	}
}
